package com.volcengine.auth;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.ApiResponse;
import com.volcengine.ContentType;
import com.volcengine.HttpMethod;
import com.volcengine.UniversalApi;
import com.volcengine.UniversalRequest;
import com.volcengine.sign.Credentials;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OidcCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "OidcCredentialProvider";
    private static final String DEFAULT_STS_ENDPOINT = "sts.volcengineapi.com";
    private static final String DEFAULT_REGION = "cn-north-1";
    private static final int DEFAULT_DURATION_SECONDS = 3600;
    private static final int DEFAULT_EXPIRE_BUFFER_SECONDS = 300;

    private final String roleTrn;
    private final String roleSessionName;
    private final String oidcTokenFile;
    private final String rolePolicy;
    private final String stsEndpoint;

    private int durationSeconds = DEFAULT_DURATION_SECONDS;
    private int expireBufferSeconds = DEFAULT_EXPIRE_BUFFER_SECONDS;

    private volatile CredentialValue credentialValue;
    private volatile long expirationTime;

    private final ApiClient apiClient;

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
        this.stsEndpoint = isNullOrEmpty(stsEndpoint) ? DEFAULT_STS_ENDPOINT : stsEndpoint;

        this.apiClient = new ApiClient()
                .setEndpoint(this.stsEndpoint)
                .setRegion(DEFAULT_REGION);
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

        // AssumeRoleWithOIDC is an anonymous API call (no AK/SK needed on the request itself,
        // the OIDC token serves as the identity proof). We clear credentials on the client
        // so the sign interceptor uses empty AK/SK, or we build a minimal unsigned request.
        // Following the STS convention used in StsAssumeRoleProvider, we need to provide
        // credentials for signing. For OIDC, the call itself is unsigned so we use empty creds.
        apiClient.setCredentials(Credentials.getCredentials("", ""));

        UniversalApi api = new UniversalApi(apiClient);
        UniversalRequest request = new UniversalRequest("sts", "AssumeRoleWithOIDC", "2018-01-01",
                HttpMethod.GET, ContentType.Default);

        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("DurationSeconds", durationSeconds);
        requestMap.put("RoleSessionName", roleSessionName);
        requestMap.put("RoleTrn", roleTrn);
        requestMap.put("OIDCToken", oidcToken);
        if (!isNullOrEmpty(rolePolicy)) {
            requestMap.put("Policy", rolePolicy);
        }

        long now = System.currentTimeMillis() / 1000;
        ApiResponse<Map<String, Object>> apiResponse = api.doCallWithHttpInfo(request, requestMap);

        if (apiResponse.getStatusCode() == 200) {
            Map<String, Object> responseData = apiResponse.getData();
            try {
                if (responseData != null) {
                    if (responseData.get("ResponseMetadata") != null) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> responseMetadata = (Map<String, Object>) responseData.get("ResponseMetadata");
                        if (responseMetadata.get("Error") != null) {
                            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC returned error");
                        }
                    }
                    if (responseData.get("Result") != null) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> resultMap = (Map<String, Object>) responseData.get("Result");
                        @SuppressWarnings("unchecked")
                        Map<String, Object> credentialMap = (Map<String, Object>) resultMap.get("Credentials");
                        String accessKey = (String) credentialMap.get("AccessKeyId");
                        String secretAccessKey = (String) credentialMap.get("SecretAccessKey");
                        String sessionToken = (String) credentialMap.get("SessionToken");
                        this.credentialValue = new CredentialValue(accessKey, secretAccessKey, sessionToken, PROVIDER_NAME);
                        // Prefer server-side Expiration; fallback to local duration estimate
                        long expiration = now + durationSeconds;
                        String expirationStr = (String) credentialMap.get("Expiration");
                        if (expirationStr != null && !expirationStr.isEmpty()) {
                            try {
                                java.time.Instant instant = java.time.Instant.parse(expirationStr);
                                expiration = instant.getEpochSecond();
                            } catch (Exception ignored) {
                                // fallback to local estimate
                            }
                        }
                        this.expirationTime = expiration - expireBufferSeconds;
                        return;
                    }
                }
                throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC returned no result");
            } catch (ApiException e) {
                throw e;
            } catch (Exception e) {
                throw new ApiException(PROVIDER_NAME + ": failed to parse AssumeRoleWithOIDC response - " + e.getMessage());
            }
        }
        throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithOIDC request failed with status " + apiResponse.getStatusCode());
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

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
