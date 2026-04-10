package com.volcengine.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.volcengine.ApiException;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class SamlCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "SamlCredentialProvider";
    private static final String ASSUME_ROLE_ACTION = "AssumeRoleWithSAML";
    private static final int DEFAULT_DURATION_SECONDS = 3600;
    private static final int DEFAULT_EXPIRE_BUFFER_SECONDS = 60;
    private static final int MAX_EXPIRE_BUFFER_SECONDS = 600;
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
    private String schema = "https";
    private int maxRetries = StsFormRequest.DEFAULT_MAX_RETRIES;
    private int retryIntervalMs = StsFormRequest.DEFAULT_RETRY_INTERVAL_MS;

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
        this.stsEndpoint = isNullOrEmpty(stsEndpoint) ? StsFormRequest.DEFAULT_STS_ENDPOINT : stsEndpoint;
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
        String responseBody = StsFormRequest.doPostWithRetry(
                stsEndpoint, schema, ASSUME_ROLE_ACTION,
                buildRequestBody(), maxRetries, retryIntervalMs, PROVIDER_NAME);
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

    public void setSchema(String schema) {
        if (!"http".equals(schema) && !"https".equals(schema)) {
            throw new IllegalArgumentException("schema must be 'http' or 'https'");
        }
        this.schema = schema;
    }

    public void setMaxRetries(int maxRetries) {
        if (maxRetries < 0) {
            throw new IllegalArgumentException("maxRetries must be >= 0");
        }
        this.maxRetries = maxRetries;
    }

    public void setRetryIntervalMs(int retryIntervalMs) {
        if (retryIntervalMs < 0) {
            throw new IllegalArgumentException("retryIntervalMs must be >= 0");
        }
        this.retryIntervalMs = retryIntervalMs;
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
            body.append(StsFormRequest.urlEncode(entry.getKey()));
            body.append('=');
            body.append(StsFormRequest.urlEncode(entry.getValue()));
            first = false;
        }
        return body.toString();
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
}
