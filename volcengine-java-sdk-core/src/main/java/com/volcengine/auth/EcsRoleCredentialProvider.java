package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provider that fetches temporary credentials from the ECS IMDS.
 *
 * <p>Follows the {@link Provider} CQS contract:
 * <ul>
 *   <li>{@link #isExpired()} / {@link #retrieve()} are pure reads.</li>
 *   <li>{@link #refresh()} is the only method that mutates state.</li>
 * </ul>
 *
 * <p>Intended to be wrapped in a {@link CredentialProvider}, which serializes
 * refresh through a {@link java.util.concurrent.locks.ReadWriteLock} and
 * guarantees the {@code isExpired → refresh → retrieve} sequence. Direct use
 * (without wrapping) is not a supported mode.
 */
public class EcsRoleCredentialProvider implements Provider {

    private static final Logger LOGGER = Logger.getLogger(EcsRoleCredentialProvider.class.getName());
    private static final String PROVIDER_NAME = "EcsRoleCredentialProvider";

    // IMDSv2 endpoint and paths
    private static final String DEFAULT_IMDS_ENDPOINT = "http://100.96.0.96";
    private static final String IMDS_CREDENTIALS_PATH = "/volcstack/latest/iam/security_credentials/"; // POST
    private static final String IMDS_ROLE_NAME_PATH = "/volcstack/latest/iam/security_credentials?type=user"; // GET
    private static final String IMDS_TOKEN_PATH = "/latest/api/token"; // GET

    // IMDSv2 headers
    private static final String IMDS_TOKEN_TTL_HEADER = "X-volc-ecs-metadata-token-ttl-seconds";
    private static final String IMDS_TOKEN_HEADER = "X-volc-ecs-metadata-token";
    private static final String IMDS_TOKEN_TTL_SECONDS = "21600"; // 6 hours

    // Response field names
    private static final String FIELD_ACCESS_KEY_ID = "AccessKeyId";
    private static final String FIELD_SECRET_ACCESS_KEY = "SecretAccessKey";
    private static final String FIELD_SESSION_TOKEN = "SessionToken";
    private static final String FIELD_EXPIRATION = "ExpiredTime";

    private static final int DEFAULT_CONNECT_TIMEOUT_MS = 1000;
    private static final int DEFAULT_READ_TIMEOUT_MS = 1000;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_RETRY_INTERVAL_MS = 1000;
    private static final int DEFAULT_EXPIRE_BUFFER_SECONDS = 300;

    private final String roleName;
    private int connectTimeoutMs;
    private int readTimeoutMs;
    private int maxRetries;
    private int retryIntervalMs;
    private int expireBufferSeconds;
    private final String imdsEndpoint;

    private CredentialValue credentialValue;
    private long expirationTime;

    public EcsRoleCredentialProvider(String roleName) {
        this(roleName, DEFAULT_CONNECT_TIMEOUT_MS, DEFAULT_READ_TIMEOUT_MS,
                DEFAULT_MAX_RETRIES, DEFAULT_RETRY_INTERVAL_MS, DEFAULT_EXPIRE_BUFFER_SECONDS);
    }

    public EcsRoleCredentialProvider(String roleName, int connectTimeoutMs, int readTimeoutMs,
                                     int maxRetries, int retryIntervalMs, int expireBufferSeconds) {
        if (isDisabledByEnv()) {
            throw new IllegalStateException(
                    PROVIDER_NAME + ": IMDS is disabled via VOLCENGINE_ECS_METADATA_DISABLED=true");
        }
        this.roleName = roleName;
        this.connectTimeoutMs = connectTimeoutMs;
        this.readTimeoutMs = readTimeoutMs;
        this.maxRetries = Math.max(maxRetries, 0);
        this.retryIntervalMs = retryIntervalMs;
        this.expireBufferSeconds = expireBufferSeconds;
        this.imdsEndpoint = DEFAULT_IMDS_ENDPOINT;
    }

    /**
     * Returns true when {@code VOLCENGINE_ECS_METADATA_DISABLED=true} is set.
     * Used by {@link DefaultCredentialProvider} to skip adding the IMDS step
     * to the chain, and by the constructor to fail fast on direct {@code new}.
     */
    public static boolean isDisabledByEnv() {
        return "true".equalsIgnoreCase(System.getenv("VOLCENGINE_ECS_METADATA_DISABLED"));
    }

    public static EcsRoleCredentialProvider create(String roleName) {
        String resolvedRoleName = roleName;
        if (isNullOrEmpty(resolvedRoleName)) {
            resolvedRoleName = System.getenv("VOLCENGINE_ECS_METADATA");
        }
        // roleName can be null — will be auto-detected on first refresh.
        // The VOLCENGINE_ECS_METADATA_DISABLED kill-switch is enforced
        // inside the constructor, so it applies to direct `new` calls too.
        return new EcsRoleCredentialProvider(resolvedRoleName);
    }

    public void setConnectTimeoutMs(int connectTimeoutMs) {
        if (connectTimeoutMs < 0) {
            throw new IllegalArgumentException("connectTimeoutMs must be >= 0");
        }
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public void setReadTimeoutMs(int readTimeoutMs) {
        if (readTimeoutMs < 0) {
            throw new IllegalArgumentException("readTimeoutMs must be >= 0");
        }
        this.readTimeoutMs = readTimeoutMs;
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

    public void setExpireBufferSeconds(int expireBufferSeconds) {
        if (expireBufferSeconds < 0) {
            throw new IllegalArgumentException("expireBufferSeconds must be >= 0");
        }
        this.expireBufferSeconds = expireBufferSeconds;
    }

    @Override
    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 > expirationTime;
    }

    @Override
    public void refresh() throws ApiException {
        // Step 1: Get IMDSv2 token (fresh every time)
        String imdsToken = getIMDSv2Token();

        // Step 2: Resolve role name
        String effectiveRoleName = resolveRoleName(imdsToken);

        // Step 3: POST to get credentials
        String url = imdsEndpoint + IMDS_CREDENTIALS_PATH + effectiveRoleName;
        String responseBody = doRequestWithRetry(url, "POST",
                new String[][]{{IMDS_TOKEN_HEADER, imdsToken}});

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
        long expiration = now + 3600;
        Object expirationObj = responseMap.get(FIELD_EXPIRATION);
        if (expirationObj instanceof String) {
            try {
                expiration = parseExpirationEpochSecond((String) expirationObj);
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, PROVIDER_NAME + ": failed to parse expiration: " + expirationObj, e);
            }
        }

        this.credentialValue = new CredentialValue(ak, sk, token, PROVIDER_NAME);
        this.expirationTime = expiration - expireBufferSeconds;
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        CredentialValue v = credentialValue;
        if (v == null) {
            throw new ApiException(PROVIDER_NAME + ": not refreshed; call refresh() first or use CredentialProvider");
        }
        return v;
    }

    // --- IMDSv2 token ---

    private String getIMDSv2Token() throws ApiException {
        String url = imdsEndpoint + IMDS_TOKEN_PATH;
        String body = doRequestWithRetry(url, "GET",
                new String[][]{{IMDS_TOKEN_TTL_HEADER, IMDS_TOKEN_TTL_SECONDS}});
        String token = body.trim();
        if (token.isEmpty()) {
            throw new ApiException(PROVIDER_NAME + ": IMDSv2 token endpoint returned empty response");
        }
        return token;
    }

    // --- roleName resolution ---

    private String resolveRoleName(String imdsToken) throws ApiException {
        if (!isNullOrEmpty(this.roleName)) {
            return this.roleName;
        }

        String envRole = System.getenv("VOLCENGINE_ECS_METADATA");
        if (!isNullOrEmpty(envRole)) {
            return envRole;
        }

        // Auto-detect from IMDS (not cached — roles can change dynamically)
        return autoDetectRoleName(imdsToken);
    }

    private String autoDetectRoleName(String imdsToken) throws ApiException {
        String url = imdsEndpoint + IMDS_ROLE_NAME_PATH;
        String body = doRequestWithRetry(url, "GET",
                new String[][]{{IMDS_TOKEN_HEADER, imdsToken}});

        Gson gson = new Gson();
        List<String> roles;
        try {
            roles = gson.fromJson(body, new TypeToken<List<String>>() {}.getType());
        } catch (Exception e) {
            // Fallback: split by whitespace
            String[] parts = body.trim().split("\\s+");
            roles = new java.util.ArrayList<>();
            for (String p : parts) {
                if (!p.isEmpty()) roles.add(p);
            }
        }

        if (roles == null || roles.isEmpty()) {
            throw new ApiException(PROVIDER_NAME + ": no IAM roles found via IMDS");
        }

        if (roles.size() > 1) {
            LOGGER.warning(PROVIDER_NAME + ": multiple IAM roles found: " + roles
                    + ". Using '" + roles.get(0) + "'. Set VOLCENGINE_ECS_METADATA to avoid ambiguity.");
        }

        return roles.get(0);
    }

    // --- HTTP helpers ---

    private String doRequestWithRetry(String urlStr, String method, String[][] headers) throws ApiException {
        ApiException lastException = null;

        for (int attempt = 0; attempt <= maxRetries; attempt++) {
            try {
                return doRequest(urlStr, method, headers);
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

        if (lastException != null) {
            throw lastException;
        }
        throw new ApiException(PROVIDER_NAME + ": IMDS request failed after " + (maxRetries + 1) + " attempts");
    }

    private String doRequest(String urlStr, String method, String[][] headers) throws ApiException {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(method);
            conn.setConnectTimeout(connectTimeoutMs);
            conn.setReadTimeout(readTimeoutMs);

            if (headers != null) {
                for (String[] header : headers) {
                    conn.setRequestProperty(header[0], header[1]);
                }
            }

            // For POST, we need to enable output even with empty body
            if ("POST".equalsIgnoreCase(method)) {
                conn.setDoOutput(true);
                try (OutputStream os = conn.getOutputStream()) {
                    // empty body
                }
            }

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

    static long parseExpirationEpochSecond(String expiration) {
        try {
            return Instant.parse(expiration).getEpochSecond();
        } catch (Exception ignored) {
            return OffsetDateTime.parse(expiration).toInstant().getEpochSecond();
        }
    }

}
