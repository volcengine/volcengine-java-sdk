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

public class CLIConfigCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "CLIConfigCredentialProvider";

    private final String profileName;
    private final String configPath;
    private volatile CredentialValue credentialValue;
    private volatile Provider delegate;

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

    @Override
    public boolean isExpired() {
        if (delegate != null) {
            return delegate.isExpired();
        }
        return false;
    }

    @Override
    public void refresh() throws ApiException {
        if (delegate instanceof SsoCredentialDelegate) {
            // SSO delegate cannot self-refresh; reset and re-resolve from config
            delegate = null;
            credentialValue = null;
        } else if (delegate != null) {
            delegate.refresh();
        }
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        if (delegate != null) {
            if (delegate.isExpired()) {
                refresh();
                if (delegate == null) {
                    // SSO path: delegate was cleared, re-load from config
                    return loadFromConfig();
                }
            }
            return delegate.retrieve();
        }
        if (credentialValue != null) {
            return credentialValue;
        }
        return loadFromConfig();
    }

    private CredentialValue loadFromConfig() throws ApiException {
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

                credentialValue = new CredentialValue(ak, sk, sessionToken, PROVIDER_NAME);
                return credentialValue;
            }
            case "ststoken": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String sessionToken = getStringValue(profileData, "session-token");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk) || isNullOrEmpty(sessionToken)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key, secret-key and session-token are all required for StsToken mode in profile '" + profile + "'");
                }

                credentialValue = new CredentialValue(ak, sk, sessionToken, PROVIDER_NAME);
                return credentialValue;
            }
            case "ramrolearn": {
                String ak = getStringValue(profileData, "access-key");
                String sk = getStringValue(profileData, "secret-key");
                String roleName = getStringValue(profileData, "role-name");
                String accountId = getStringValue(profileData, "account-id");

                if (isNullOrEmpty(ak) || isNullOrEmpty(sk)) {
                    throw new ApiException(PROVIDER_NAME + ": access-key and secret-key are required for RamRoleArn mode in profile '" + profile + "'");
                }
                if (isNullOrEmpty(roleName) || isNullOrEmpty(accountId)) {
                    throw new ApiException(PROVIDER_NAME + ": role-name and account-id are required for RamRoleArn mode in profile '" + profile + "'");
                }

                delegate = new StsAssumeRoleProvider(ak, sk, roleName, accountId);
                return delegate.retrieve();
            }
            case "oidc": {
                String oidcTokenFile = getStringValue(profileData, "oidc-token-file");
                String roleTrn = getStringValue(profileData, "role-trn");

                if (isNullOrEmpty(oidcTokenFile) || isNullOrEmpty(roleTrn)) {
                    throw new ApiException(PROVIDER_NAME + ": oidc-token-file and role-trn are required for OIDC mode in profile '" + profile + "'");
                }

                delegate = new OidcCredentialProvider(roleTrn, null, oidcTokenFile, null, null);
                return delegate.retrieve();
            }
            case "ecsrole": {
                String roleName = getStringValue(profileData, "role-name");

                delegate = EcsRoleCredentialProvider.create(roleName);
                return delegate.retrieve();
            }
            case "sso": {
                return loadSsoCredentials(profileData, profile, configMap);
            }
            default:
                throw new ApiException(PROVIDER_NAME + ": unsupported mode: " + mode);
        }
    }

    @SuppressWarnings("unchecked")
    private CredentialValue loadSsoCredentials(Map<String, Object> profileData, String profile,
                                                Map<String, Object> configMap) throws ApiException {
        // Step 1: Check if profile has valid cached STS credentials
        String cachedAk = getStringValue(profileData, "access-key");
        String cachedSk = getStringValue(profileData, "secret-key");
        String cachedToken = getStringValue(profileData, "session-token");
        long stsExpiration = getLongValue(profileData, "sts-expiration");
        if (!isNullOrEmpty(cachedAk) && !isNullOrEmpty(cachedSk) && stsExpiration > 0) {
            long expSeconds = normalizeTimestamp(stsExpiration);
            if (System.currentTimeMillis() / 1000 < expSeconds) {
                credentialValue = new CredentialValue(cachedAk, cachedSk, cachedToken, PROVIDER_NAME);
                return credentialValue;
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

        delegate = new SsoCredentialDelegate(creds, PROVIDER_NAME);
        return delegate.retrieve();
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

        // Update cache
        tokenCache.setAccessToken(resp.accessToken);
        if (!isNullOrEmpty(resp.refreshToken)) {
            tokenCache.setRefreshToken(resp.refreshToken);
        }
        tokenCache.setExpiresAt(
                Instant.now().plusSeconds(resp.expiresIn).toString()
        );

        // Write cache file back
        try {
            Path parent = tokenCachePath.getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
            Path tempFile = Files.createTempFile(parent, ".tmp-", ".json");
            try {
                byte[] data = gson.toJson(tokenCache).getBytes(StandardCharsets.UTF_8);
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

    private static String escapeJsonString(String s) {
        if (s == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"':  sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\b': sb.append("\\b");  break;
                case '\f': sb.append("\\f");  break;
                case '\n': sb.append("\\n");  break;
                case '\r': sb.append("\\r");  break;
                case '\t': sb.append("\\t");  break;
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

    /**
     * Internal delegate for SSO-sourced credentials that tracks expiration.
     */
    private static class SsoCredentialDelegate implements Provider {
        private final CredentialValue credentialValue;
        private final long expirationSeconds;

        SsoCredentialDelegate(SsoPortalClient.RoleCredentialsResult creds, String providerName) {
            this.credentialValue = new CredentialValue(
                    creds.accessKeyId, creds.secretAccessKey, creds.sessionToken, providerName);
            if (creds.expiration > 0) {
                this.expirationSeconds = normalizeTimestamp(creds.expiration);
            } else {
                this.expirationSeconds = System.currentTimeMillis() / 1000 + 3600;
            }
        }

        @Override
        public boolean isExpired() {
            return System.currentTimeMillis() / 1000 >= expirationSeconds;
        }

        @Override
        public void refresh() throws ApiException {
            // Refresh is handled by re-running loadFromConfig via the outer provider
        }

        @Override
        public CredentialValue retrieve() throws ApiException {
            return credentialValue;
        }
    }

    private Path resolveConfigPath() {
        if (!isNullOrEmpty(configPath)) {
            return Paths.get(configPath);
        }
        String envPath = System.getenv("VOLCENGINE_CLI_CONFIG_FILE");
        if (!isNullOrEmpty(envPath)) {
            return Paths.get(envPath);
        }
        String home = System.getProperty("user.home");
        return Paths.get(home, ".volcengine", "config.json");
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
        String fallbackProfile = System.getenv("VOLCSTACK_PROFILE");
        if (!isNullOrEmpty(fallbackProfile)) {
            return fallbackProfile;
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
