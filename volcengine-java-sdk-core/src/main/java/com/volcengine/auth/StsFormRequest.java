package com.volcengine.auth;

import com.volcengine.ApiException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Shared HTTP helper for STS form-encoded POST requests (AssumeRoleWithOIDC,
 * AssumeRoleWithSAML). Provides retry with configurable attempts and interval.
 * <p>
 * Only retries on transient failures: {@link IOException} (network errors) and
 * HTTP 5xx / 429 responses. Deterministic 4xx errors are not retried.
 * <p>
 * Proxy and TLS customization (ProxyURL / CAFile / InsecureSkipVerify) are
 * supplied via {@link StsHttpConfig}. This is the single choke point that
 * gives OIDC and SAML providers the same proxy/TLS capabilities as the OkHttp
 * based AssumeRole path.
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
     * Send a form-encoded POST to the STS endpoint with retry, without any
     * proxy or TLS customization. Kept for backward compatibility.
     */
    static String doPostWithRetry(String endpoint, String schema, String action, String formBody, int maxRetries, int retryIntervalMs, String providerName) throws ApiException {
        return doPostWithRetry(endpoint, schema, action, formBody, maxRetries, retryIntervalMs, providerName, null);
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
     * @param httpConfig      proxy/TLS configuration; may be null (no customization)
     * @return response body string
     * @throws ApiException on failure after all attempts exhausted
     */
    static String doPostWithRetry(String endpoint, String schema, String action, String formBody, int maxRetries, int retryIntervalMs, String providerName, StsHttpConfig httpConfig) throws ApiException {
        String requestUrl = buildRequestUrl(endpoint, schema, action);
        ApiException lastException = null;
        for (int attempt = 0; attempt <= maxRetries; attempt++) {
            try {
                return doPost(requestUrl, formBody, providerName, action, httpConfig);
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

    private static String doPost(String requestUrl, String formBody, String providerName, String action, StsHttpConfig httpConfig) throws ApiException {
        HttpURLConnection connection = null;
        try {
            connection = openConnection(requestUrl, httpConfig);
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
     * Open a connection to the request URL, applying proxy and TLS settings
     * from {@code httpConfig} when provided.
     * <p>
     * Behaviour mirrors the Go SDK's buildProxyTransport:
     * <ul>
     *   <li>When {@code httpConfig} is null or empty, no customization is
     *       applied and the JVM default (including standard proxy system
     *       properties) is used.</li>
     *   <li>A non-empty ProxyURL routes the request through that proxy;
     *       otherwise the JVM default proxy selection applies.</li>
     *   <li>CAFile / InsecureSkipVerify only take effect for https requests
     *       (the connection is an {@link HttpsURLConnection}).</li>
     * </ul>
     */
    private static HttpURLConnection openConnection(String requestUrl, StsHttpConfig httpConfig) throws ApiException, IOException {
        URL url = new URL(requestUrl);
        URLConnection raw;
        String proxyAuthHeader = null;
        if (httpConfig != null && !isNullOrEmpty(httpConfig.getProxyUrl())) {
            String proxyUrl = httpConfig.getProxyUrl();
            raw = url.openConnection(parseProxy(proxyUrl));
            proxyAuthHeader = proxyAuthorizationHeader(proxyUrl);
        } else {
            raw = url.openConnection();
        }
        if (!(raw instanceof HttpURLConnection)) {
            throw new ApiException("STS request failed: unexpected connection type " + raw.getClass().getName());
        }
        HttpURLConnection connection = (HttpURLConnection) raw;

        // Forward proxy Basic auth (proxy url with user:password@), mirroring the
        // Go SDK's http.ProxyURL which carries proxy credentials automatically.
        if (proxyAuthHeader != null) {
            connection.setRequestProperty("Proxy-Authorization", proxyAuthHeader);
        }

        // TLS customization only applies to https connections.
        if (connection instanceof HttpsURLConnection && httpConfig != null
                && (httpConfig.isInsecureSkipVerify() || !isNullOrEmpty(httpConfig.getCaFile()))) {
            HttpsURLConnection httpsConnection = (HttpsURLConnection) connection;
            SSLContext sslContext = StsTlsSupport.buildSslContext(httpConfig);
            httpsConnection.setSSLSocketFactory(sslContext.getSocketFactory());
            if (httpConfig.isInsecureSkipVerify()) {
                httpsConnection.setHostnameVerifier(StsTlsSupport.trustAllHostnameVerifier());
            }
        }
        return connection;
    }

    private static Proxy parseProxy(String proxyUrl) throws ApiException {
        try {
            URI uri = new URI(proxyUrl);
            if (uri.getHost() == null || uri.getPort() < 0) {
                throw new ApiException("invalid proxy url \"" + proxyUrl + "\": missing host or port");
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(uri.getHost(), uri.getPort()));
        } catch (URISyntaxException e) {
            throw new ApiException("invalid proxy url \"" + proxyUrl + "\": " + e.getMessage());
        }
    }

    /**
     * Build a {@code Proxy-Authorization: Basic ...} header value from the
     * userinfo part of a proxy url, or {@code null} when the proxy url carries
     * no credentials.
     */
    static String proxyAuthorizationHeader(String proxyUrl) throws ApiException {
        try {
            URI uri = new URI(proxyUrl);
            String userInfo = uri.getUserInfo();
            if (isNullOrEmpty(userInfo)) {
                return null;
            }
            byte[] raw = userInfo.getBytes(StandardCharsets.UTF_8);
            return "Basic " + Base64.getEncoder().encodeToString(raw);
        } catch (URISyntaxException e) {
            throw new ApiException("invalid proxy url \"" + proxyUrl + "\": " + e.getMessage());
        }
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
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
