package com.volcengine.auth;

import com.volcengine.ApiException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Shared HTTP helper for STS form-encoded POST requests (AssumeRoleWithOIDC,
 * AssumeRoleWithSAML). Provides retry with configurable attempts and interval.
 * <p>
 * Only retries on transient failures: {@link IOException} (network errors) and
 * HTTP 5xx / 429 responses. Deterministic 4xx errors are not retried.
 */
class StsFormRequest {

    static final String DEFAULT_STS_ENDPOINT = "sts.volcengineapi.com";
    static final int DEFAULT_CONNECT_TIMEOUT_MS = 3000;
    static final int DEFAULT_READ_TIMEOUT_MS = 3000;
    static final int DEFAULT_MAX_RETRIES = 3;
    static final int DEFAULT_RETRY_INTERVAL_MS = 1000;
    static final String DEFAULT_STS_VERSION = "2018-01-01";
    static final String FORM_URLENCODED = "application/x-www-form-urlencoded";
    static final String ACCEPT = "application/json";

    private StsFormRequest() {
    }

    /**
     * Send a form-encoded POST to the STS endpoint with retry.
     *
     * @param endpoint        STS endpoint (may include scheme, or bare host)
     * @param schema          scheme to use when endpoint has no scheme ("http" or "https")
     * @param action          STS action name (e.g. "AssumeRoleWithOIDC")
     * @param formBody        URL-encoded form body
     * @param maxRetries      max retry attempts; 0 means no retry (single attempt only)
     * @param retryIntervalMs sleep between retries in milliseconds
     * @param providerName    provider name for error messages
     * @return response body string
     * @throws ApiException on failure after all attempts exhausted
     */
    static String doPostWithRetry(String endpoint, String schema, String action, String formBody, int maxRetries, int retryIntervalMs, String providerName) throws ApiException {
        String requestUrl = buildRequestUrl(endpoint, schema, action);
        ApiException lastException = null;
        for (int attempt = 0; attempt <= maxRetries; attempt++) {
            try {
                return doPost(requestUrl, formBody, providerName, action);
            } catch (ApiException e) {
                if (!isRetryable(e)) {
                    throw e;
                }
                lastException = e;
                if (attempt < maxRetries) {
                    trySleep(retryIntervalMs);
                }
            }
        }
        if (lastException != null) {
            throw lastException;
        }
        throw new ApiException(providerName + ": " + action + " request failed after " + (maxRetries + 1) + " attempts");
    }

    private static String doPost(String requestUrl, String formBody, String providerName, String action) throws ApiException {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(requestUrl).openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MS);
            connection.setReadTimeout(DEFAULT_READ_TIMEOUT_MS);
            connection.setRequestProperty("Accept", ACCEPT);
            connection.setRequestProperty("Content-Type", FORM_URLENCODED);
            connection.setDoOutput(true);

            byte[] bodyBytes = formBody.getBytes(StandardCharsets.UTF_8);
            connection.setFixedLengthStreamingMode(bodyBytes.length);
            OutputStream outputStream = null;
            try {
                outputStream = connection.getOutputStream();
                outputStream.write(bodyBytes);
                outputStream.flush();
            } finally {
                if (outputStream != null) {
                    outputStream.close();
                }
            }

            int statusCode = connection.getResponseCode();
            InputStream responseStream = statusCode >= 400 ? connection.getErrorStream() : connection.getInputStream();
            String responseBody = readResponseBody(responseStream);
            if (statusCode != 200) {
                throw new ApiException(statusCode, providerName + ": " + action + " request failed with status " + statusCode + (responseBody.isEmpty() ? "" : " - " + responseBody));
            }
            return responseBody;
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            throw new StsTransientException(providerName + ": " + action + " request failed - " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /**
     * Determines whether the exception is retryable.
     * Retries on: IOException (network), HTTP 5xx, HTTP 429.
     */
    private static boolean isRetryable(ApiException e) {
        if (e instanceof StsTransientException) {
            return true;
        }
        int code = e.getCode();
        return code == 429 || (code >= 500 && code < 600);
    }

    static String buildRequestUrl(String endpoint, String schema, String action) {
        String normalizedEndpoint = normalizeEndpoint(endpoint, schema);
        try {
            URL endpointUrl = new URL(normalizedEndpoint);
            String path = endpointUrl.getPath();
            StringBuilder url = new StringBuilder(normalizedEndpoint);
            if (path == null || path.isEmpty()) {
                url.append('/');
            }
            url.append("?Action=").append(urlEncode(action));
            url.append("&Version=").append(urlEncode(DEFAULT_STS_VERSION));
            return url.toString();
        } catch (Exception e) {
            throw new IllegalStateException("Invalid STS endpoint: " + normalizedEndpoint, e);
        }
    }

    static String normalizeEndpoint(String endpoint, String schema) {
        String normalized = (endpoint == null || endpoint.trim().isEmpty()) ? DEFAULT_STS_ENDPOINT : endpoint.trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        if (!normalized.startsWith("http://") && !normalized.startsWith("https://")) {
            String scheme = (schema == null || schema.trim().isEmpty()) ? "https" : schema.trim();
            normalized = scheme + "://" + normalized;
        }
        return normalized;
    }

    static String readResponseBody(InputStream stream) throws IOException {
        if (stream == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            String line;
            boolean first = true;
            while ((line = reader.readLine()) != null) {
                if (!first) {
                    sb.append('\n');
                }
                sb.append(line);
                first = false;
            }
        }
        return sb.toString();
    }

    static String urlEncode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            throw new IllegalStateException("Failed to encode query parameter", e);
        }
    }

    private static void trySleep(int intervalMs) {
        try {
            Thread.sleep(intervalMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Marker subclass to identify IOException-originated errors as retryable,
     * since ApiException.getCode() defaults to 0 for non-HTTP errors.
     */
    private static class StsTransientException extends ApiException {
        StsTransientException(String message) {
            super(message);
        }
    }
}
