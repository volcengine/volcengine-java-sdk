package com.volcengine.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.volcengine.ApiException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class OidcCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "OidcCredentialProvider";
    private static final String ASSUME_ROLE_ACTION = "AssumeRoleWithOIDC";
    private static final int DEFAULT_DURATION_SECONDS = 3600;
    private static final int DEFAULT_EXPIRE_BUFFER_SECONDS = 300;
    private static final Gson GSON = new Gson();
    private static final Type MAP_TYPE = new TypeToken<Map<String, Object>>() {
    }.getType();

    private final String roleTrn;
    private final String roleSessionName;
    private final String oidcTokenFile;
    private final String rolePolicy;
    private final String stsEndpoint;

    private int durationSeconds = DEFAULT_DURATION_SECONDS;
    private int expireBufferSeconds = DEFAULT_EXPIRE_BUFFER_SECONDS;
    private String schema = "https";
    private int maxRetries = StsFormRequest.DEFAULT_MAX_RETRIES;
    private int retryIntervalMs = StsFormRequest.DEFAULT_RETRY_INTERVAL_MS;

    private volatile CredentialValue credentialValue;
    private volatile long expirationTime;

    public OidcCredentialProvider(String roleTrn, String roleSessionName, String oidcTokenFile,
                                  String rolePolicy, String stsEndpoint) {
        if (isNullOrEmpty(roleTrn)) {
            throw new IllegalArgumentException("roleTrn must not be null or empty");
        }
        if (isNullOrEmpty(roleSessionName)) {
            roleSessionName = "credentials-java-" + System.currentTimeMillis() / 1000;
        }
        if (isNullOrEmpty(oidcTokenFile)) {
            throw new IllegalArgumentException("oidcTokenFile must not be null or empty");
        }
        this.roleTrn = roleTrn;
        this.roleSessionName = roleSessionName;
        this.oidcTokenFile = oidcTokenFile;
        this.rolePolicy = rolePolicy;
        this.stsEndpoint = isNullOrEmpty(stsEndpoint) ? StsFormRequest.DEFAULT_STS_ENDPOINT : stsEndpoint;
    }

    public static OidcCredentialProvider fromEnvironment() throws ApiException {
        String roleTrn = System.getenv("VOLCENGINE_OIDC_ROLE_TRN");
        String roleSessionName = System.getenv("VOLCENGINE_OIDC_ROLE_SESSION_NAME");
        String oidcTokenFile = System.getenv("VOLCENGINE_OIDC_TOKEN_FILE");
        String rolePolicy = System.getenv("VOLCENGINE_OIDC_ROLE_POLICY");
        String stsEndpoint = System.getenv("VOLCENGINE_OIDC_STS_ENDPOINT");

        if (isNullOrEmpty(roleTrn) || isNullOrEmpty(oidcTokenFile)) {
            throw new ApiException(PROVIDER_NAME + ": required environment variables "
                    + "VOLCENGINE_OIDC_ROLE_TRN and VOLCENGINE_OIDC_TOKEN_FILE are not set");
        }

        return new OidcCredentialProvider(roleTrn, roleSessionName, oidcTokenFile, rolePolicy, stsEndpoint);
    }

    @Override
    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 > expirationTime;
    }

    @Override
    public void refresh() throws ApiException {
        String oidcToken;
        try {
            oidcToken = new String(Files.readAllBytes(Paths.get(oidcTokenFile)), StandardCharsets.UTF_8).trim();
        } catch (IOException e) {
            throw new ApiException("Failed to read OIDC token file: " + oidcTokenFile + " - " + e.getMessage());
        }

        if (oidcToken.isEmpty()) {
            throw new ApiException("OIDC token file is empty: " + oidcTokenFile);
        }

        long now = System.currentTimeMillis() / 1000;
        String responseBody = StsFormRequest.doPostWithRetry(
                stsEndpoint, schema, ASSUME_ROLE_ACTION,
                buildRequestBody(oidcToken), maxRetries, retryIntervalMs, PROVIDER_NAME);
        Map<String, Object> responseData = parseResponse(responseBody);

        Map<String, Object> responseMetadata = asMap(responseData.get("ResponseMetadata"));
        if (responseMetadata != null && responseMetadata.get("Error") != null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC returned error - " + stringify(responseMetadata.get("Error")));
        }

        Map<String, Object> resultMap = asMap(responseData.get("Result"));
        if (resultMap == null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC returned no result");
        }

        Map<String, Object> credentialMap = asMap(resultMap.get("Credentials"));
        if (credentialMap == null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC returned no credentials");
        }

        String accessKey = asString(credentialMap.get("AccessKeyId"));
        String secretAccessKey = asString(credentialMap.get("SecretAccessKey"));
        String sessionToken = asString(credentialMap.get("SessionToken"));
        if (isNullOrEmpty(accessKey) || isNullOrEmpty(secretAccessKey)) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC response missing AccessKeyId or SecretAccessKey");
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

    private String buildRequestBody(String oidcToken) {
        Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("DurationSeconds", String.valueOf(durationSeconds));
        params.put("RoleSessionName", roleSessionName);
        params.put("RoleTrn", roleTrn);
        params.put("OIDCToken", oidcToken);
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
                throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC returned empty response");
            }
            return responseData;
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse AssumeRoleWithOIDC response - " + e.getMessage());
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
