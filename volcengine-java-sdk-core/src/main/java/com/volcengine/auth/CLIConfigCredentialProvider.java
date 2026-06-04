package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Map;

/**
 * Provider that resolves credentials from the Volcengine CLI {@code config.json}.
 *
 * <p>Follows the {@link Provider} CQS contract:
 * <ul>
 *   <li>{@link #isExpired()} / {@link #retrieve()} are pure reads.</li>
 *   <li>{@link #refresh()} is the only method that mutates state. Every call
 *       re-reads the CLI config and rebuilds the delegate so profile, mode, and
 *       AK changes are picked up at the next expiry boundary. The previous
 *       delegate's in-memory state (e.g. SsoTokenCache snapshot) is discarded;
 *       in-flight RT rotation is still protected by the delegate's own
 *       invalid_grant disk-reload fallback.</li>
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
    private static final String LOGIN_CACHE_DIRECTORY_ENV = "VOLCENGINE_LOGIN_CACHE_DIRECTORY";

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
     * Used for static AK/SK modes (ak / ststoken).
     *
     * <p>{@link #refresh()} is never called on this instance in practice: when
     * {@link CLIConfigCredentialProvider#isExpired()} returns {@code true}, the
     * outer {@link CLIConfigCredentialProvider#refresh()} always calls
     * {@code loadFromConfig()} and replaces this instance with a freshly built
     * delegate. The {@code refresh()} implementation here is therefore a no-op
     * kept only to satisfy the {@link Provider} interface.
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
        // Always re-read the CLI config and rebuild the delegate on refresh.
        // This is what makes profile / mode / AK changes (made by the user or
        // by `ve` cli) take effect at the next expiry boundary. The delegate's
        // own invalid_grant fallback handles in-flight RT rotation, so losing
        // the previous delegate's in-memory state on rebuild is safe.
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
            case "console-login": {
                return loadConsoleLoginProvider(profileData, profile, configPath);
            }
            default:
                throw new ApiException(PROVIDER_NAME + ": unsupported mode: " + mode);
        }
    }

    private Provider loadConsoleLoginProvider(Map<String, Object> profileData, String profile,
                                              Path configFilePath) throws ApiException {
        String loginSession = getStringValue(profileData, "login-session");
        if (isNullOrEmpty(loginSession)) {
            throw new ApiException(PROVIDER_NAME + ": login-session not found in console-login profile '" + profile + "', please run 've login' first");
        }

        String customCacheDir = System.getenv(LOGIN_CACHE_DIRECTORY_ENV);
        Path cacheDir = !isNullOrEmpty(customCacheDir)
                ? Paths.get(customCacheDir).toAbsolutePath().normalize()
                : configFilePath.getParent().resolve("login").resolve("cache");

        // ConsoleLoginRefreshProvider owns disk reads, refresh and the
        // invalid_grant fallback. Triggering refresh() here surfaces missing-cache
        // / parse / expired-without-RT errors at provider construction time so
        // failures look the same as before.
        Provider d = new ConsoleLoginRefreshProvider(loginSession, cacheDir);
        d.refresh();
        return d;
    }

    @SuppressWarnings("unchecked")
    private Provider loadSsoProvider(Map<String, Object> profileData, String profile,
                                     Map<String, Object> configMap) throws ApiException {
        // Resolve sso-session
        String sessionName = getStringValue(profileData, "sso-session-name");
        if (isNullOrEmpty(sessionName)) {
            throw new ApiException(PROVIDER_NAME + ": sso-session-name not found in profile '" + profile + "', please run 've sso login'");
        }

        Map<String, Object> ssoSessions = (Map<String, Object>) configMap.get("sso-session");
        if (ssoSessions == null) {
            throw new ApiException(PROVIDER_NAME + ": 'sso-session' section not found in config, please run 've sso login'");
        }
        Map<String, Object> sessionData = (Map<String, Object>) ssoSessions.get(sessionName);
        if (sessionData == null) {
            throw new ApiException(PROVIDER_NAME + ": sso-session '" + sessionName + "' not found in config, please run 've sso login'");
        }

        String startUrl = getStringValue(sessionData, "start-url");
        if (isNullOrEmpty(startUrl)) {
            throw new ApiException(PROVIDER_NAME + ": start-url not found in sso-session '" + sessionName + "', please run 've sso login'");
        }
        String region = getStringValue(sessionData, "region");
        if (isNullOrEmpty(region)) {
            region = "cn-beijing";
        }

        // Compute cache file path and load token cache
        String cacheFileName = computeTokenCacheFileName(startUrl, sessionName);
        Path configDir = resolveConfigPath().getParent();
        Path tokenCachePath = configDir.resolve("sso").resolve("cache").resolve(cacheFileName);

        if (!Files.exists(tokenCachePath)) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache file not found: " + tokenCachePath
                    + ", please run 've sso login'");
        }

        String tokenContent;
        try {
            tokenContent = new String(Files.readAllBytes(tokenCachePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME + ": failed to read SSO token cache: " + tokenCachePath
                    + " - please run 've sso login'. Cause: " + e.getMessage());
        }

        Gson gson = new Gson();
        SsoTokenCache tokenCache;
        try {
            tokenCache = gson.fromJson(tokenContent, SsoTokenCache.class);
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse SSO token cache"
                    + " - please run 've sso login'. Cause: " + e.getMessage());
        }
        if (tokenCache == null) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache file is empty, please run 've sso login'");
        }

        String accessToken = tokenCache.getAccessToken();
        if (isNullOrEmpty(accessToken)) {
            throw new ApiException(PROVIDER_NAME + ": SSO token cache missing access_token, please run 've sso login'");
        }

        // Resolve role identity from profile
        String accountId = getStringValue(profileData, "account-id");
        String roleName = getStringValue(profileData, "role-name");
        if (isNullOrEmpty(accountId)) {
            throw new ApiException(PROVIDER_NAME + ": account-id not found in SSO profile '" + profile + "'");
        }
        if (isNullOrEmpty(roleName)) {
            throw new ApiException(PROVIDER_NAME + ": role-name not found in SSO profile '" + profile + "'");
        }

        // SsoRefreshProvider owns long-lived in-memory state and refresh logic.
        // tokenCachePath is passed so the provider can reload disk on invalid_grant.
        // Calling refresh() here surfaces missing-token / network errors at
        // construction time so failures look the same as before.
        Provider d = new SsoRefreshProvider(tokenCache, accountId, roleName, region, tokenCachePath);
        d.refresh();
        return d;
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
