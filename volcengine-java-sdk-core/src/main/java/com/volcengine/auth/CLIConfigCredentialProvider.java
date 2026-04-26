package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Map;

/**
 * Provider that resolves credentials from the Volcengine CLI {@code config.json}.
 *
 * <p>Follows the {@link Provider} CQS contract:
 * <ul>
 *   <li>{@link #isExpired()} / {@link #retrieve()} are pure reads.</li>
 *   <li>{@link #refresh()} is the only method that mutates state. It re-reads
 *       the CLI config, resolves the profile's mode to a {@link Provider}
 *       instance, and publishes it.</li>
 * </ul>
 *
 * <p>Intended to be wrapped in a {@link CredentialProvider}, which serializes
 * refresh through a {@link java.util.concurrent.locks.ReadWriteLock} and
 * guarantees the {@code isExpired → refresh → retrieve} sequence. Direct use
 * (without wrapping) is not a supported mode.
 */
public class CLIConfigCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "CLIConfigCredentialProvider";
    private static final long EXPIRE_BUFFER_SECONDS = 60;

    private final String profileName;
    private final String configPath;
    private Provider delegate;

    public CLIConfigCredentialProvider() {
        this(null, null);
    }

    public CLIConfigCredentialProvider(String profileName) {
        this(profileName, null);
    }

    public CLIConfigCredentialProvider(String profileName, String configPath) {
        this.profileName = profileName;
        this.configPath = configPath;
    }

    /**
     * A {@link Provider} that wraps an already-materialized credential value.
     * Used for static AK/SK modes (ak / ststoken) and for SSO paths where the
     * CLI config or the SSO portal has already returned a full credential.
     *
     * <p>{@link #refresh()} is a no-op: the outer
     * {@link CLIConfigCredentialProvider#refresh()} is the thing that re-reads
     * the CLI config and publishes a new provider instance.
     */
    private static final class StaticCredentialProvider implements Provider {
        private final CredentialValue value;
        private final long expirationSeconds; // epoch seconds; 0 = never expires

        StaticCredentialProvider(CredentialValue value, long expirationSeconds) {
            this.value = value;
            this.expirationSeconds = expirationSeconds;
        }

        @Override
        public boolean isExpired() {
            if (expirationSeconds == 0) {
                return false;
            }
            return System.currentTimeMillis() / 1000 + EXPIRE_BUFFER_SECONDS >= expirationSeconds;
        }

        @Override
        public void refresh() {
            // No-op: the outer CLIConfigCredentialProvider.refresh() re-resolves
            // the profile and publishes a fresh provider instance when this one
            // is reported expired.
        }

        @Override
        public CredentialValue retrieve() {
            return value;
        }
    }

    @Override
    public boolean isExpired() {
        return delegate == null || delegate.isExpired();
    }

    @Override
    public void refresh() throws ApiException {
        this.delegate = loadFromConfig();
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        Provider d = delegate;
        if (d == null) {
            throw new ApiException(PROVIDER_NAME + ": not refreshed; call refresh() first or use CredentialProvider");
        }
        return d.retrieve();
    }

    private Provider loadFromConfig() throws ApiException {
        Path configPath = resolveConfigPath();

        if (!Files.exists(configPath)) {
            throw new ApiException(PROVIDER_NAME + ": config file not found: " + configPath);
        }

        String content;
        try {
            content = new String(Files.readAllBytes(configPath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": failed to read config file: " + configPath + " - " + e.getMessage());
        }

        Gson gson = new Gson();
        Type mapType = new TypeToken<Map<String, Object>>() {}.getType();
        Map<String, Object> configMap;
        try {
            configMap = gson.fromJson(content, mapType);
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse config JSON: " + e.getMessage());
        }

        if (configMap == null) {
            throw new ApiException(PROVIDER_NAME + ": config file is empty or invalid");
        }

        String profile = resolveProfile(configMap);

        @SuppressWarnings("unchecked")
        Map<String, Object> profiles = (Map<String, Object>) configMap.get("profiles");
        if (profiles == null) {
            throw new ApiException(PROVIDER_NAME + ": 'profiles' section not found in config");
        }

        @SuppressWarnings("unchecked")
        Map<String, Object> profileData = (Map<String, Object>) profiles.get(profile);
        if (profileData == null) {
            throw new ApiException(PROVIDER_NAME + ": profile '" + profile + "' not found in config");
        }

        String rawMode = getStringValue(profileData, "mode");
        String mode = (rawMode == null) ? "" : rawMode.toLowerCase().trim();

        switch (mode) {
            case "":
            case "ak": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String sessionToken = getStringValue(profileData, "session-token");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key and secret-key not found in profile '" + profile + "'");
                }

                return new StaticCredentialProvider(
                        new CredentialValue(ak, sk, sessionToken, PROVIDER_NAME), 0);
            }
            case "ststoken": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String sessionToken = getStringValue(profileData, "session-token");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk) || isNullOrEmpty(sessionToken)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key, secret-key and session-token are all required for StsToken mode in profile '" + profile + "'");
                }

                return new StaticCredentialProvider(
                        new CredentialValue(ak, sk, sessionToken, PROVIDER_NAME), 0);
            }
            case "ramrolearn": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String sourceSessionToken = getStringValue(profileData, "session-token");
                String roleName = getStringValue(profileData, "role-name");
                String accountId = getStringValue(profileData, "account-id");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key and secret-key are required for RamRoleArn mode in profile '" + profile + "'");
                }
                if (isNullOrEmpty(roleName) || isNullOrEmpty(accountId)) {
                    throw new ApiException(PROVIDER_NAME + ": role-name and account-id are required for RamRoleArn mode in profile '" + profile + "'");
                }

                Provider d = new StsAssumeRoleProvider(ak, sk,
                        sourceSessionToken == null ? "" : sourceSessionToken,
                        roleName, accountId);
                d.refresh();
                return d;
            }
            case "oidc": {
                String oidcTokenFile = getStringValue(profileData, "oidc-token-file");
                String roleTrn = getStringValue(profileData, "role-trn");

                if (isNullOrEmpty(oidcTokenFile) || isNullOrEmpty(roleTrn)) {
                    throw new ApiException(PROVIDER_NAME + ": oidc-token-file and role-trn are required for OIDC mode in profile '" + profile + "'");
                }

                Provider d = new OidcCredentialProvider(roleTrn, null, oidcTokenFile, null, null);
                d.refresh();
                return d;
            }
            case "ecsrole": {
                String roleName = getStringValue(profileData, "role-name");

                Provider d = EcsRoleCredentialProvider.create(roleName);
                d.refresh();
                return d;
            }
            case "sso": {
                return loadSsoProvider(profileData, profile, configMap);
            }
            default:
                throw new ApiException(PROVIDER_NAME + ": unsupported mode: " + mode);
        }
    }

    @SuppressWarnings("unchecked")
    private Provider loadSsoProvider(Map<String, Object> profileData, String profile,
                                     Map<String, Object> configMap) throws ApiException {
        // Step 1: Check if profile has valid cached STS credentials
        String cachedAk = getStringValue(profileData, "access-key");
        String cachedSk = getStringValue(profileData, "secret-key");
        String cachedToken = getStringValue(profileData, "session-token");
        long stsExpiration = getLongValue(profileData, "sts-expiration");
        if (!isNullOrEmpty(cachedAk) && !isNullOrEmpty(cachedSk) && stsExpiration > 0) {
            long expSeconds = normalizeTimestamp(stsExpiration);
            if (System.currentTimeMillis() / 1000 + EXPIRE_BUFFER_SECONDS < expSeconds) {
                return new StaticCredentialProvider(
                        new CredentialValue(cachedAk, cachedSk, cachedToken, PROVIDER_NAME),
                        expSeconds);
            }
        }

        // Step 2: Resolve sso-session
        String sessionName = getStringValue(profileData, "sso-session-name");
        if (isNullOrEmpty(sessionName)) {
            throw new ApiException(PROVIDER_NAME + ": sso-session-name not found in profile '" + profile + "'");
        }

        Map<String, Object> ssoSessions = (Map<String, Object>) configMap.get("sso-session");
        if (ssoSessions == null) {
            throw new ApiException(PROVIDER_NAME + ": 'sso-session' section not found in config");
        }
        Map<String, Object> sessionData = (Map<String, Object>) ssoSessions.get(sessionName);
        if (sessionData == null) {
            throw new ApiException(PROVIDER_NAME + ": sso-session '" + sessionName + "' not found in config");
        }

        String startUrl = getStringValue(sessionData, "start-url");
        if (isNullOrEmpty(startUrl)) {
            throw new ApiException(PROVIDER_NAME + ": start-url not found in sso-session '" + sessionName + "'");
        }
        String region = getStringValue(sessionData, "region");
        if (isNullOrEmpty(region)) {
            region = "cn-beijing";
        }

        // Step 3: Compute cache file path and load token cache
        String cacheFileName = computeTokenCacheFileName(startUrl, sessionName);
        Path configDir = resolveConfigPath().getParent();
        Path tokenCachePath = configDir.resolve("sso").resolve("cache").resolve(cacheFileName);

        if (!Files.exists(tokenCachePath)) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache file not found: " + tokenCachePath);
        }

        String tokenContent;
        try {
            tokenContent = new String(Files.readAllBytes(tokenCachePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": failed to read SSO token cache: " + tokenCachePath + " - " + e.getMessage());
        }

        Gson gson = new Gson();
        SsoTokenCache tokenCache;
        try {
            tokenCache = gson.fromJson(tokenContent, SsoTokenCache.class);
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse SSO token cache: " + e.getMessage());
        }
        if (tokenCache == null) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache file is empty");
        }

        String accessToken = tokenCache.getAccessToken();
        if (isNullOrEmpty(accessToken)) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache missing access_token");
        }

        // Step 4: Check if access token is expired
        boolean expired = isTokenExpired(tokenCache.getExpiresAt());
        if (expired) {
            // Try refresh
            accessToken = refreshAccessToken(tokenCache, tokenCachePath, region, gson);
        }

        // Step 5: Call Portal API for role credentials
        String accountId = getStringValue(profileData, "account-id");
        String roleName = getStringValue(profileData, "role-name");
        if (isNullOrEmpty(accountId)) {
            throw new ApiException(PROVIDER_NAME + ": account-id not found in SSO profile '" + profile + "'");
        }
        if (isNullOrEmpty(roleName)) {
            throw new ApiException(PROVIDER_NAME + ": role-name not found in SSO profile '" + profile + "'");
        }

        SsoPortalClient portalClient = new SsoPortalClient(region);
        SsoPortalClient.RoleCredentialsResult creds = portalClient.getRoleCredentials(accessToken, accountId, roleName);

        long expirationSeconds = (creds.expiration > 0)
                ? normalizeTimestamp(creds.expiration)
                : System.currentTimeMillis() / 1000 + 3600;
        return new StaticCredentialProvider(
                new CredentialValue(creds.accessKeyId, creds.secretAccessKey, creds.sessionToken, PROVIDER_NAME),
                expirationSeconds);
    }

    private String refreshAccessToken(SsoTokenCache tokenCache, Path tokenCachePath,
                                       String region, Gson gson) throws ApiException {
        String refreshToken = tokenCache.getRefreshToken();
        if (isNullOrEmpty(refreshToken)) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache missing refresh_token, please re-login with CLI");
        }
        // Check if refresh token (client_secret) has expired
        long clientSecretExpiresAt = tokenCache.getClientSecretExpiresAt();
        if (clientSecretExpiresAt > 0) {
            long expSeconds = normalizeTimestamp(clientSecretExpiresAt);
            if (System.currentTimeMillis() / 1000 >= expSeconds) {
                throw new ApiException(PROVIDER_NAME + ": SSO refresh token has expired, please re-login with CLI");
            }
        }
        String clientId = tokenCache.getClientId();
        String clientSecret = tokenCache.getClientSecret();
        if (isNullOrEmpty(clientId) || isNullOrEmpty(clientSecret)) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache missing client_id or client_secret");
        }

        SsoPortalClient portalClient = new SsoPortalClient(region);
        SsoPortalClient.OAuthTokenResponse resp = portalClient.refreshToken(clientId, clientSecret, refreshToken);

        // Build the updated cache object without modifying tokenCache yet
        String newAccessToken = resp.accessToken;
        String newRefreshToken = isNullOrEmpty(resp.refreshToken) ? tokenCache.getRefreshToken() : resp.refreshToken;
        String newExpiresAt = Instant.now().plusSeconds(resp.expiresIn).toString();

        SsoTokenCache updatedCache = new SsoTokenCache();
        updatedCache.setStartUrl(tokenCache.getStartUrl());
        updatedCache.setSessionName(tokenCache.getSessionName());
        updatedCache.setRegion(tokenCache.getRegion());
        updatedCache.setClientId(tokenCache.getClientId());
        updatedCache.setClientSecret(tokenCache.getClientSecret());
        updatedCache.setClientIdIssuedAt(tokenCache.getClientIdIssuedAt());
        updatedCache.setClientSecretExpiresAt(tokenCache.getClientSecretExpiresAt());
        updatedCache.setAccessToken(newAccessToken);
        updatedCache.setRefreshToken(newRefreshToken);
        updatedCache.setExpiresAt(newExpiresAt);

        // Write to disk first; only update in-memory tokenCache on success
        try {
            Path parent = tokenCachePath.getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
            Path tempFile = Files.createTempFile(parent, ".tmp-", ".json");
            try {
                byte[] data = gson.toJson(updatedCache).getBytes(StandardCharsets.UTF_8);
                try (OutputStream os = Files.newOutputStream(tempFile)) {
                    os.write(data);
                }
                Files.move(tempFile, tokenCachePath,
                        java.nio.file.StandardCopyOption.REPLACE_EXISTING,
                        java.nio.file.StandardCopyOption.ATOMIC_MOVE);
            } catch (Exception e) {
                try { Files.deleteIfExists(tempFile); } catch (IOException ignored) { }
                throw e;
            }
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": failed to write SSO token cache: " + e.getMessage());
        }

        // Disk write succeeded — now update in-memory state
        tokenCache.setAccessToken(newAccessToken);
        tokenCache.setRefreshToken(newRefreshToken);
        tokenCache.setExpiresAt(newExpiresAt);

        return tokenCache.getAccessToken();
    }

    private static boolean isTokenExpired(String expiresAt) {
        if (isNullOrEmpty(expiresAt)) {
            return true;
        }
        try {
            Instant exp = Instant.parse(expiresAt.trim());
            return Instant.now().isAfter(exp);
        } catch (DateTimeParseException e) {
            return true;
        }
    }

    private static String computeTokenCacheFileName(String startUrl, String sessionName) throws ApiException {
        try {
            // Match Go implementation: JSON {"start_url":"...","session_name":"..."}
            String json = "{\"start_url\":\"" + escapeJsonString(startUrl)
                    + "\",\"session_name\":\"" + escapeJsonString(sessionName) + "\"}";
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            byte[] hash = sha1.digest(json.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder();
            for (byte b : hash) {
                hex.append(String.format("%02x", b));
            }
            return hex.toString() + ".json";
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new ApiException("CLIConfigCredentialProvider: SHA-1 algorithm not available");
        }
    }

    // Escape a string to match Go encoding/json.Marshal default output
    private static String escapeJsonString(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"':  sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n");  break;
                case '\r': sb.append("\\r");  break;
                case '\t': sb.append("\\t");  break;
                case '<':  sb.append("\\u003c"); break;
                case '>':  sb.append("\\u003e"); break;
                case '&':  sb.append("\\u0026"); break;
                case '\u2028': sb.append("\\u2028"); break;
                case '\u2029': sb.append("\\u2029"); break;
                default:
                    if (c < 0x20) {
                        sb.append(String.format("\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
            }
        }
        return sb.toString();
    }

    private static long getLongValue(Map<String, Object> map, String key) {
        Object value = map.get(key);
        if (value instanceof Number) {
            return ((Number) value).longValue();
        }
        if (value instanceof String) {
            try {
                return Long.parseLong((String) value);
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return 0;
    }

    /**
     * Normalize a timestamp that may be in seconds, milliseconds, microseconds,
     * or nanoseconds to seconds since epoch.
     */
    private static long normalizeTimestamp(long ts) {
        if (ts >= 1_000_000_000_000_000_000L) {
            return ts / 1_000_000_000L;        // nanoseconds
        } else if (ts >= 1_000_000_000_000_000L) {
            return ts / 1_000_000L;             // microseconds
        } else if (ts >= 1_000_000_000_000L) {
            return ts / 1_000L;                 // milliseconds
        }
        return ts;                              // seconds
    }

    private Path resolveConfigPath() {
        if (!isNullOrEmpty(configPath)) {
            return Paths.get(configPath).toAbsolutePath().normalize();
        }
        String envPath = System.getenv("VOLCENGINE_CLI_CONFIG_FILE");
        if (!isNullOrEmpty(envPath)) {
            return Paths.get(envPath).toAbsolutePath().normalize();
        }
        String home = System.getProperty("user.home");
        return Paths.get(home, ".volcengine", "config.json").toAbsolutePath().normalize();
    }

    private String resolveProfile(Map<String, Object> configMap) {
        // Priority: constructor param > env var > "current" field in config
        if (!isNullOrEmpty(profileName)) {
            return profileName;
        }
        String envProfile = System.getenv("VOLCENGINE_PROFILE");
        if (!isNullOrEmpty(envProfile)) {
            return envProfile;
        }
        Object current = configMap.get("current");
        if (current instanceof String && !((String) current).isEmpty()) {
            return (String) current;
        }
        return "default";
    }

    private static String getStringValue(Map<String, Object> map, String key) {
        Object value = map.get(key);
        if (value instanceof String) {
            String s = (String) value;
            return s.isEmpty() ? null : s;
        }
        return null;
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
