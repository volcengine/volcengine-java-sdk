package com.volcengine.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.volcengine.ApiException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class SamlCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "SamlCredentialProvider";
    private static final String DEFAULT_STS_ENDPOINT = "sts.volcengineapi.com";
    private static final String ASSUME_ROLE_ACTION = "AssumeRoleWithSAML";
    private static final String STS_VERSION = "2018-01-01";
    private static final int DEFAULT_DURATION_SECONDS = 3600;
    private static final int DEFAULT_EXPIRE_BUFFER_SECONDS = 60;
    private static final int MAX_EXPIRE_BUFFER_SECONDS = 600;
    private static final int DEFAULT_CONNECT_TIMEOUT_MS = 3000;
    private static final int DEFAULT_READ_TIMEOUT_MS = 3000;
    private static final String FORM_URLENCODED = "application/x-www-form-urlencoded";
    private static final Gson GSON = new Gson();
    private static final Type MAP_TYPE = new TypeToken<Map<String, Object>>() {
    }.getType();

    private final String roleName;
    private final String accountId;
    private final String samlProviderName;
    private final String samlAssertion;
    private final String rolePolicy;
    private final String stsEndpoint;

    private int durationSeconds = DEFAULT_DURATION_SECONDS;
    private int expireBufferSeconds = DEFAULT_EXPIRE_BUFFER_SECONDS;

    private volatile CredentialValue credentialValue;
    private volatile long expirationTime;

    public SamlCredentialProvider(String roleName, String accountId, String samlProviderName,
                                  String samlAssertion, String rolePolicy, String stsEndpoint) {
        if (isNullOrEmpty(roleName)) {
            throw new IllegalArgumentException("roleName must not be null or empty");
        }
        if (isNullOrEmpty(accountId)) {
            throw new IllegalArgumentException("accountId must not be null or empty");
        }
        if (isNullOrEmpty(samlProviderName)) {
            throw new IllegalArgumentException("samlProviderName must not be null or empty");
        }
        if (isNullOrEmpty(samlAssertion)) {
            throw new IllegalArgumentException("samlAssertion must not be null or empty");
        }
        this.roleName = roleName;
        this.accountId = accountId;
        this.samlProviderName = samlProviderName;
        this.samlAssertion = samlAssertion;
        this.rolePolicy = rolePolicy;
        this.stsEndpoint = isNullOrEmpty(stsEndpoint) ? DEFAULT_STS_ENDPOINT : stsEndpoint;
    }

    public SamlCredentialProvider(String roleName, String accountId, String samlProviderName,
                                  String samlAssertion) {
        this(roleName, accountId, samlProviderName, samlAssertion, null, null);
    }

    @Override
    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 > expirationTime;
    }

    @Override
    public void refresh() throws ApiException {
        long now = System.currentTimeMillis() / 1000;
        String responseBody = doRequest(buildRequestBody());
        Map<String, Object> responseData = parseResponse(responseBody);

        Map<String, Object> responseMetadata = asMap(responseData.get("ResponseMetadata"));
        if (responseMetadata != null && responseMetadata.get("Error") != null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned error - " + stringify(responseMetadata.get("Error")));
        }

        Map<String, Object> resultMap = asMap(responseData.get("Result"));
        if (resultMap == null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned no result");
        }

        Map<String, Object> credentialMap = asMap(resultMap.get("Credentials"));
        if (credentialMap == null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned no credentials");
        }

        String accessKey = asString(credentialMap.get("AccessKeyId"));
        String secretAccessKey = asString(credentialMap.get("SecretAccessKey"));
        String sessionToken = asString(credentialMap.get("SessionToken"));
        if (isNullOrEmpty(accessKey) || isNullOrEmpty(secretAccessKey)) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML response missing AccessKeyId or SecretAccessKey");
        }

        long expiration = now + durationSeconds;
        String expirationStr = asString(credentialMap.get("Expiration"));
        if (!isNullOrEmpty(expirationStr)) {
            try {
                expiration = parseExpirationEpochSecond(expirationStr);
            } catch (Exception e) {
                throw new ApiException(PROVIDER_NAME + ": failed to parse expiration - " + expirationStr);
            }
        }

        this.credentialValue = new CredentialValue(accessKey, secretAccessKey, sessionToken, PROVIDER_NAME);
        this.expirationTime = expiration - expireBufferSeconds;
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        if (isExpired()) {
            refresh();
        }
        return credentialValue;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public void setExpireBufferSeconds(int expireBufferSeconds) {
        if (expireBufferSeconds > MAX_EXPIRE_BUFFER_SECONDS) {
            throw new IllegalArgumentException("expireBufferSeconds must be less than or equal to " + MAX_EXPIRE_BUFFER_SECONDS);
        }
        this.expireBufferSeconds = expireBufferSeconds;
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    static long parseExpirationEpochSecond(String expiration) {
        try {
            return Instant.parse(expiration).getEpochSecond();
        } catch (Exception ignored) {
            return OffsetDateTime.parse(expiration).toInstant().getEpochSecond();
        }
    }

    private String buildRequestBody() {
        Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("DurationSeconds", String.valueOf(durationSeconds));
        params.put("RoleTrn", "trn:iam::" + accountId + ":role/" + roleName);
        params.put("SAMLProviderTrn", "trn:iam::" + accountId + ":saml-provider/" + samlProviderName);
        params.put("SAMLResp", samlAssertion);
        if (!isNullOrEmpty(rolePolicy)) {
            params.put("Policy", rolePolicy);
        }

        StringBuilder body = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (!first) {
                body.append('&');
            }
            body.append(urlEncode(entry.getKey()));
            body.append('=');
            body.append(urlEncode(entry.getValue()));
            first = false;
        }
        return body.toString();
    }

    private String doRequest(String requestBody) throws ApiException {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(buildRequestUrl()).openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MS);
            connection.setReadTimeout(DEFAULT_READ_TIMEOUT_MS);
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Type", FORM_URLENCODED);
            connection.setDoOutput(true);

            byte[] bodyBytes = requestBody.getBytes(StandardCharsets.UTF_8);
            connection.setFixedLengthStreamingMode(bodyBytes.length);
            java.io.OutputStream outputStream = null;
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
                throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML request failed with status "
                        + statusCode + (responseBody.isEmpty() ? "" : " - " + responseBody));
            }
            return responseBody;
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML request failed - " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    private String buildRequestUrl() {
        String normalizedEndpoint = normalizeEndpoint(stsEndpoint);
        try {
            URL endpointUrl = new URL(normalizedEndpoint);
            String path = endpointUrl.getPath();
            StringBuilder url = new StringBuilder(normalizedEndpoint);
            if (path == null || path.isEmpty()) {
                url.append('/');
            }
            url.append("?Action=").append(urlEncode(ASSUME_ROLE_ACTION));
            url.append("&Version=").append(urlEncode(STS_VERSION));
            return url.toString();
        } catch (Exception e) {
            throw new IllegalStateException("Invalid STS endpoint: " + normalizedEndpoint, e);
        }
    }

    private Map<String, Object> parseResponse(String responseBody) throws ApiException {
        try {
            Map<String, Object> responseData = GSON.fromJson(responseBody, MAP_TYPE);
            if (responseData == null) {
                throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned empty response");
            }
            return responseData;
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse AssumeRoleWithSAML response - " + e.getMessage());
        }
    }

    private static Map<String, Object> asMap(Object value) {
        if (!(value instanceof Map)) {
            return null;
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) value;
        return map;
    }

    private static String asString(Object value) {
        return value == null ? null : String.valueOf(value);
    }

    private static String stringify(Object value) {
        return value == null ? null : GSON.toJson(value);
    }

    private static String normalizeEndpoint(String endpoint) {
        String normalized = endpoint == null ? DEFAULT_STS_ENDPOINT : endpoint.trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        if (!normalized.startsWith("http://") && !normalized.startsWith("https://")) {
            normalized = "https://" + normalized;
        }
        return normalized;
    }

    private static String readResponseBody(InputStream stream) throws IOException {
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

    private static String urlEncode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            throw new IllegalStateException("Failed to encode query parameter", e);
        }
    }
}
