package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EcsRoleCredentialProvider implements Provider {

    private static final Logger LOGGER = Logger.getLogger(EcsRoleCredentialProvider.class.getName());
    private static final String PROVIDER_NAME = "EcsRoleCredentialProvider";

    // TODO: IMDS endpoint to be confirmed by ECS team
    private static final String IMDS_ENDPOINT = "http://100.96.0.96";
    // TODO: IMDS paths to be confirmed
    private static final String IMDS_ROLE_LIST_PATH = "/volcstack/latest/iam/security_credentials/";
    private static final String IMDS_CREDENTIALS_PATH = "/volcstack/latest/iam/security_credentials/";
    // TODO: IMDSv2 token support to be confirmed
    // private static final String IMDS_TOKEN_PATH = "/volcstack/latest/api/token";
    // private static final String IMDS_TOKEN_TTL_HEADER = "X-volcengine-ecs-metadata-token-ttl-seconds";
    // private static final String IMDS_TOKEN_HEADER = "X-volcengine-ecs-metadata-token";

    // TODO: Response field names to be confirmed
    private static final String FIELD_ACCESS_KEY_ID = "AccessKeyId";
    private static final String FIELD_SECRET_ACCESS_KEY = "SecretAccessKey";
    private static final String FIELD_SESSION_TOKEN = "SessionToken";
    private static final String FIELD_EXPIRATION = "Expiration";

    private static final int DEFAULT_CONNECT_TIMEOUT_MS = 1000;
    private static final int DEFAULT_READ_TIMEOUT_MS = 1000;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_RETRY_INTERVAL_MS = 1000;
    private static final int DEFAULT_EXPIRE_BUFFER_SECONDS = 300;

    private final String roleName;
    private final int connectTimeoutMs;
    private final int readTimeoutMs;
    private final int maxRetries;
    private final int retryIntervalMs;
    private final int expireBufferSeconds;

    private volatile CredentialValue credentialValue;
    private volatile long expirationTime;

    public EcsRoleCredentialProvider(String roleName) {
        this(roleName, DEFAULT_CONNECT_TIMEOUT_MS, DEFAULT_READ_TIMEOUT_MS,
                DEFAULT_MAX_RETRIES, DEFAULT_RETRY_INTERVAL_MS, DEFAULT_EXPIRE_BUFFER_SECONDS);
    }

    public EcsRoleCredentialProvider(String roleName, int connectTimeoutMs, int readTimeoutMs,
                                     int maxRetries, int retryIntervalMs, int expireBufferSeconds) {
        this.roleName = roleName;
        this.connectTimeoutMs = connectTimeoutMs;
        this.readTimeoutMs = readTimeoutMs;
        this.maxRetries = maxRetries;
        this.retryIntervalMs = retryIntervalMs;
        this.expireBufferSeconds = expireBufferSeconds;
    }

    public static EcsRoleCredentialProvider create(String roleName) throws ApiException {
        if ("true".equalsIgnoreCase(System.getenv("VOLCENGINE_ECS_METADATA_DISABLED"))) {
            throw new ApiException(PROVIDER_NAME + ": IMDS is disabled via VOLCENGINE_ECS_METADATA_DISABLED=true");
        }

        String resolvedRoleName = roleName;

        if (isNullOrEmpty(resolvedRoleName)) {
            resolvedRoleName = System.getenv("VOLCENGINE_ECS_METADATA");
        }

        // roleName can be null here -- will be auto-detected on first refresh
        return new EcsRoleCredentialProvider(resolvedRoleName);
    }

    @Override
    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 > expirationTime;
    }

    @Override
    public void refresh() throws ApiException {
        String effectiveRoleName = this.roleName;

        if (isNullOrEmpty(effectiveRoleName)) {
            effectiveRoleName = autoDetectRoleName();
        }

        String url = IMDS_ENDPOINT + IMDS_CREDENTIALS_PATH + effectiveRoleName;
        String responseBody = doGetWithRetry(url);

        Gson gson = new Gson();
        Type mapType = new TypeToken<Map<String, Object>>() {}.getType();
        Map<String, Object> responseMap;
        try {
            responseMap = gson.fromJson(responseBody, mapType);
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse IMDS response - " + e.getMessage());
        }

        if (responseMap == null) {
            throw new ApiException(PROVIDER_NAME + ": IMDS returned empty response");
        }

        String ak = (String) responseMap.get(FIELD_ACCESS_KEY_ID);
        String sk = (String) responseMap.get(FIELD_SECRET_ACCESS_KEY);
        String token = (String) responseMap.get(FIELD_SESSION_TOKEN);

        if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
            throw new ApiException(PROVIDER_NAME + ": IMDS response missing AccessKeyId or SecretAccessKey");
        }

        long now = System.currentTimeMillis() / 1000;
        // Try to parse expiration from response; fall back to a default duration
        long expiration = now + 3600;
        Object expirationObj = responseMap.get(FIELD_EXPIRATION);
        if (expirationObj instanceof String) {
            try {
                // Attempt ISO 8601 parse
                java.time.Instant instant = java.time.Instant.parse((String) expirationObj);
                expiration = instant.getEpochSecond();
            } catch (Exception e) {
                // Fall back to default duration
                LOGGER.log(Level.WARNING, PROVIDER_NAME + ": failed to parse expiration: " + expirationObj, e);
            }
        }

        this.credentialValue = new CredentialValue(ak, sk, token, PROVIDER_NAME);
        this.expirationTime = expiration - expireBufferSeconds;
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        if (isExpired()) {
            refresh();
        }
        return credentialValue;
    }

    private String autoDetectRoleName() throws ApiException {
        String url = IMDS_ENDPOINT + IMDS_ROLE_LIST_PATH;
        String responseBody = doGetWithRetry(url);

        if (isNullOrEmpty(responseBody)) {
            throw new ApiException(PROVIDER_NAME + ": IMDS returned empty role list");
        }

        String[] roles = responseBody.trim().split("\\s+");
        if (roles.length == 0 || (roles.length == 1 && roles[0].isEmpty())) {
            throw new ApiException(PROVIDER_NAME + ": no ECS role found from IMDS");
        }

        if (roles.length > 1) {
            LOGGER.warning(PROVIDER_NAME + ": multiple ECS roles found, using the first one: " + roles[0]
                    + ". Consider setting roleName explicitly to avoid ambiguity.");
        }

        return roles[0];
    }

    private String doGetWithRetry(String urlStr) throws ApiException {
        ApiException lastException = null;

        for (int attempt = 0; attempt < maxRetries; attempt++) {
            try {
                return doGet(urlStr);
            } catch (ApiException e) {
                lastException = e;
                if (attempt < maxRetries) {
                    try {
                        Thread.sleep(retryIntervalMs);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        throw new ApiException(PROVIDER_NAME + ": interrupted during retry");
                    }
                }
            }
        }

        throw lastException;
    }

    private String doGet(String urlStr) throws ApiException {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(connectTimeoutMs);
            conn.setReadTimeout(readTimeoutMs);

            int statusCode = conn.getResponseCode();
            if (statusCode != 200) {
                throw new ApiException(PROVIDER_NAME + ": IMDS request failed with status " + statusCode);
            }

            StringBuilder sb = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
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
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": IMDS request failed - " + e.getMessage());
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
