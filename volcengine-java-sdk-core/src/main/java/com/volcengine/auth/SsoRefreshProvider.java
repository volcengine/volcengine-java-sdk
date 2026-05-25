package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

/**
 * SSO {@link Provider} that owns a long-lived in-memory snapshot of the SSO
 * token cache and silently refreshes STS credentials via the CloudIdentity
 * OAuth endpoint and Portal GetRoleCredentials. Mirrors
 * {@link ConsoleLoginRefreshProvider} for the SSO flow.
 *
 * <p>Contract:
 * <ul>
 *   <li>The token cache is read from disk on bootstrap only (and once more on
 *       the invalid_grant fallback); this provider never writes the cache file.
 *       ve cli remains the sole writer.</li>
 *   <li>When the SSO access token expires, the provider exchanges the cached
 *       refresh_token at the CloudIdentity OAuth endpoint, updates in-memory
 *       state, then calls Portal GetRoleCredentials for fresh STS credentials.</li>
 *   <li>If the OAuth server rejects the refresh_token with an invalid_grant-
 *       equivalent error, the provider re-reads the SSO cache file from disk
 *       once. If the disk refresh_token differs from the in-memory one (i.e.
 *       ve sso login rotated it), the provider retries once with the disk state;
 *       otherwise it throws an actionable "please run 've sso login'" error.</li>
 * </ul>
 *
 * <p>{@code refresh()} is the only mutating method; {@code isExpired()} and
 * {@code retrieve()} are pure reads. Concurrency control lives in the outer
 * {@link CredentialProvider} via its read-write lock.
 */
class SsoRefreshProvider implements Provider {

    private static final String PROVIDER_NAME = "CLIConfigCredentialProvider";
    private static final long EXPIRE_BUFFER_SECONDS = 60;

    private final String accountId;
    private final String roleName;
    private final String region;
    private final Path tokenCachePath; // used for the invalid_grant disk-reload fallback

    // in-memory authoritative state (set once on bootstrap, mutated on refresh)
    private SsoTokenCache tokenCache;

    private CredentialValue credentials;
    private long expirationEpoch; // seconds since epoch; 0 = not yet set

    SsoRefreshProvider(SsoTokenCache tokenCache, String accountId, String roleName,
                       String region, Path tokenCachePath) {
        this.tokenCache = tokenCache;
        this.accountId = accountId;
        this.roleName = roleName;
        this.region = region;
        this.tokenCachePath = tokenCachePath;
    }

    @Override
    public boolean isExpired() {
        if (credentials == null || expirationEpoch == 0) {
            return true;
        }
        return System.currentTimeMillis() / 1000 + EXPIRE_BUFFER_SECONDS >= expirationEpoch;
    }

    @Override
    public CredentialValue retrieve() throws ApiException {
        if (credentials == null) {
            throw new ApiException(PROVIDER_NAME
                    + ": SSO credentials not refreshed; call refresh() first or use CredentialProvider");
        }
        return credentials;
    }

    @Override
    public void refresh() throws ApiException {
        String accessToken = tokenCache.getAccessToken();
        if (isNullOrEmpty(accessToken)) {
            throw new ApiException(PROVIDER_NAME
                    + ": SSO token cache missing access_token, please run 've sso login'");
        }

        // If the in-memory access token is not expired, skip OAuth refresh and
        // go straight to GetRoleCredentials.
        if (!isTokenExpired(tokenCache.getExpiresAt())) {
            fetchRoleCredentials(accessToken);
            return;
        }

        // Access token expired: attempt OAuth refresh.
        try {
            accessToken = doRefreshAccessToken(tokenCache);
        } catch (InvalidGrantException e) {
            // Fallback: reload disk; if ve sso login wrote a different RT, retry once.
            SsoTokenCache disk = loadCacheFromDisk();
            if (isNullOrEmpty(disk.getRefreshToken())) {
                throw new ApiException(PROVIDER_NAME
                        + ": SSO refresh token rejected and disk cache lacks refresh_token;"
                        + " please run 've sso login'.");
            }
            if (disk.getRefreshToken().equals(tokenCache.getRefreshToken())) {
                throw new ApiException(PROVIDER_NAME
                        + ": SSO refresh token rejected by OAuth server"
                        + " (disk cache has the same RT); please run 've sso login'."
                        + " underlying error: " + e.getMessage());
            }
            // Disk has a different RT — ve sso login rotated it under us.
            tokenCache = disk;
            try {
                accessToken = doRefreshAccessToken(tokenCache);
            } catch (InvalidGrantException retryEx) {
                throw new ApiException(PROVIDER_NAME
                        + ": SSO refresh token rejected; reloaded disk cache but new RT also failed;"
                        + " please run 've sso login'. underlying error: " + retryEx.getMessage());
            }
        }

        fetchRoleCredentials(accessToken);
    }

    private void fetchRoleCredentials(String accessToken) throws ApiException {
        SsoPortalClient portalClient = new SsoPortalClient(region);
        SsoPortalClient.RoleCredentialsResult creds;
        try {
            creds = portalClient.getRoleCredentials(accessToken, accountId, roleName);
        } catch (ApiException e) {
            throw new ApiException(PROVIDER_NAME + ": SSO Portal GetRoleCredentials failed"
                    + " - please run 've sso login' if the token is expired. Cause: " + e.getMessage());
        }

        long expirationSeconds = (creds.expiration > 0)
                ? normalizeTimestamp(creds.expiration)
                : System.currentTimeMillis() / 1000 + 3600;
        credentials = new CredentialValue(creds.accessKeyId, creds.secretAccessKey,
                creds.sessionToken, PROVIDER_NAME);
        expirationEpoch = expirationSeconds;
    }

    /**
     * Attempts OAuth token refresh. Throws {@link InvalidGrantException} when the
     * server signals invalid_grant (HTTP 4xx with "invalid_grant" in the message),
     * and {@link ApiException} for all other failures.
     */
    private String doRefreshAccessToken(SsoTokenCache cache) throws ApiException, InvalidGrantException {
        String refreshToken = cache.getRefreshToken();
        if (isNullOrEmpty(refreshToken)) {
            throw new ApiException(PROVIDER_NAME
                    + ": SSO token cache missing refresh_token, please run 've sso login'");
        }
        long clientSecretExpiresAt = cache.getClientSecretExpiresAt();
        if (clientSecretExpiresAt > 0) {
            long expSeconds = normalizeTimestamp(clientSecretExpiresAt);
            if (System.currentTimeMillis() / 1000 >= expSeconds) {
                throw new ApiException(PROVIDER_NAME
                        + ": SSO refresh token has expired, please run 've sso login'");
            }
        }
        String clientId = cache.getClientId();
        String clientSecret = cache.getClientSecret();
        if (isNullOrEmpty(clientId) || isNullOrEmpty(clientSecret)) {
            throw new ApiException(PROVIDER_NAME
                    + ": SSO token cache missing client_id or client_secret, please run 've sso login'");
        }

        SsoPortalClient portalClient = new SsoPortalClient(region);
        SsoPortalClient.OAuthTokenResponse resp;
        try {
            resp = portalClient.refreshToken(clientId, clientSecret, refreshToken);
        } catch (ApiException e) {
            // Surface invalid_grant-equivalent errors as InvalidGrantException so the
            // caller can attempt the disk-reload fallback.
            String msg = e.getMessage() != null ? e.getMessage() : "";
            if (msg.contains("invalid_grant") || msg.contains("InvalidGrant")
                    || msg.contains("status 400") || msg.contains("status 401")) {
                throw new InvalidGrantException(msg);
            }
            throw new ApiException(PROVIDER_NAME
                    + ": SSO access token refresh failed, please run 've sso login'. Cause: " + msg);
        }

        String newAccessToken = resp.accessToken;
        String newRefreshToken = isNullOrEmpty(resp.refreshToken)
                ? cache.getRefreshToken() : resp.refreshToken;
        String newExpiresAt = Instant.now().plusSeconds(resp.expiresIn).toString();

        cache.setAccessToken(newAccessToken);
        cache.setRefreshToken(newRefreshToken);
        cache.setExpiresAt(newExpiresAt);

        return newAccessToken;
    }

    private SsoTokenCache loadCacheFromDisk() throws ApiException {
        if (tokenCachePath == null) {
            throw new ApiException(PROVIDER_NAME
                    + ": SSO cache path not available for disk reload; please run 've sso login'");
        }
        if (!Files.exists(tokenCachePath)) {
            throw new ApiException(PROVIDER_NAME
                    + ": SSO token cache file not found: " + tokenCachePath
                    + ", please run 've sso login'");
        }
        String tokenContent;
        try {
            tokenContent = new String(Files.readAllBytes(tokenCachePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME
                    + ": failed to read SSO token cache for disk reload: " + tokenCachePath
                    + " - please run 've sso login'. Cause: " + e.getMessage());
        }
        SsoTokenCache loaded;
        try {
            loaded = new Gson().fromJson(tokenContent, SsoTokenCache.class);
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME
                    + ": failed to parse SSO token cache during disk reload"
                    + " - please run 've sso login'. Cause: " + e.getMessage());
        }
        if (loaded == null) {
            throw new ApiException(PROVIDER_NAME
                    + ": SSO token cache file is empty during disk reload, please run 've sso login'");
        }
        return loaded;
    }

    private static boolean isTokenExpired(String expiresAt) {
        if (isNullOrEmpty(expiresAt)) {
            return true;
        }
        try {
            java.time.Instant exp = java.time.Instant.parse(expiresAt.trim());
            return java.time.Instant.now().isAfter(exp);
        } catch (java.time.format.DateTimeParseException e) {
            return true;
        }
    }

    private static long normalizeTimestamp(long ts) {
        if (ts >= 1_000_000_000_000_000_000L) {
            return ts / 1_000_000_000L;
        } else if (ts >= 1_000_000_000_000_000L) {
            return ts / 1_000_000L;
        } else if (ts >= 1_000_000_000_000L) {
            return ts / 1_000L;
        }
        return ts;
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    /** Sentinel for invalid_grant-equivalent OAuth errors, enabling the disk-reload fallback. */
    private static class InvalidGrantException extends Exception {
        InvalidGrantException(String msg) {
            super(msg);
        }
    }
}
