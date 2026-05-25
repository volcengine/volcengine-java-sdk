package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.time.Instant;
import java.time.format.DateTimeParseException;

/**
 * console-login {@link Provider} that owns a long-lived in-memory snapshot of
 * the ve login cache and silently refreshes STS credentials via the signin
 * OAuth endpoint. Mirrors the Go and Python implementations.
 *
 * <p>Contract:
 * <ul>
 *   <li>Disk is read on bootstrap and on the invalid_grant fallback only;
 *       the provider never writes the cache file. ve cli remains the sole
 *       writer.</li>
 *   <li>When access_token expires, the provider exchanges the cached
 *       refresh_token at the signin OAuth endpoint and updates the in-memory
 *       cache only.</li>
 *   <li>If the server rejects the refresh_token with invalid_grant the
 *       provider re-reads the disk cache once: if the disk holds a different
 *       refresh_token (i.e. ve cli refreshed it under us) it retries, otherwise
 *       it throws and asks the user to run {@code ve login} again.</li>
 * </ul>
 *
 * <p>{@code refresh()} is the only mutating method; {@code isExpired()} and
 * {@code retrieve()} are pure reads. Concurrency control lives in the outer
 * {@link CredentialProvider} via its read-write lock.
 */
class ConsoleLoginRefreshProvider implements Provider {

    private static final String PROVIDER_NAME = "ConsoleLoginCredentialProvider";
    private static final long EXPIRE_BUFFER_SECONDS = 60;

    private final String loginSession;
    private final Path cacheDir;
    private final ConsoleLoginOAuthClientFactory oauthFactory;

    private LoginCache cache;            // in-memory authoritative state
    private CredentialValue credentials;
    private long expirationEpoch;        // seconds since epoch

    ConsoleLoginRefreshProvider(String loginSession, Path cacheDir) {
        this(loginSession, cacheDir, DEFAULT_FACTORY);
    }

    /** Test-only constructor accepting an OAuth factory for HTTP injection. */
    ConsoleLoginRefreshProvider(String loginSession, Path cacheDir,
                                ConsoleLoginOAuthClientFactory oauthFactory) {
        this.loginSession = loginSession;
        this.cacheDir = cacheDir;
        this.oauthFactory = oauthFactory;
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
            throw new ApiException(PROVIDER_NAME + ": not refreshed; call refresh() first or use CredentialProvider");
        }
        return credentials;
    }

    @Override
    public void refresh() throws ApiException {
        // 1) Bootstrap: load disk cache once if memory is empty.
        if (cache == null) {
            cache = loadCacheFromDisk();
        }

        // 2) Fast path: in-memory access_token still within TTL.
        if (tryApplyFromCache(cache)) {
            return;
        }

        // 3) Slow path: refresh via OAuth.
        try {
            refreshWithOAuth(cache);
            return;
        } catch (ConsoleLoginOAuthClient.InvalidGrantException invalidGrant) {
            // 4) Fallback: reload disk; if ve cli wrote a different RT, retry once.
            LoginCache disk = loadCacheFromDisk();
            if (isNullOrEmpty(disk.refreshToken)) {
                throw new ApiException(PROVIDER_NAME
                        + ": console-login refresh token rejected and disk cache lacks refresh_token;"
                        + " please run 've login' to re-authenticate.");
            }
            if (disk.refreshToken.equals(cache.refreshToken)) {
                throw new ApiException(PROVIDER_NAME
                        + ": console-login refresh token rejected by signin service"
                        + " (disk cache has the same RT); please run 've login' to re-authenticate."
                        + " underlying error: " + invalidGrant.getMessage());
            }
            cache = disk;
            if (tryApplyFromCache(cache)) {
                return;
            }
            try {
                refreshWithOAuth(cache);
            } catch (ConsoleLoginOAuthClient.InvalidGrantException retryInvalid) {
                throw new ApiException(PROVIDER_NAME
                        + ": console-login refresh token rejected; reloaded disk cache but new RT also failed;"
                        + " please run 've login'. underlying error: " + retryInvalid.getMessage());
            } catch (ApiException e) {
                throw new ApiException(PROVIDER_NAME
                        + ": console-login refresh failed after disk reload;"
                        + " please run 've login'. underlying error: " + e.getMessage());
            } catch (RuntimeException e) {
                throw new ApiException(PROVIDER_NAME
                        + ": console-login refresh failed after disk reload;"
                        + " please run 've login'. underlying error: " + e.getMessage());
            }
        } catch (ApiException e) {
            throw new ApiException(PROVIDER_NAME
                    + ": console-login refresh failed; please run 've login'. underlying error: " + e.getMessage());
        } catch (RuntimeException e) {
            throw new ApiException(PROVIDER_NAME
                    + ": console-login refresh failed; please run 've login'. underlying error: " + e.getMessage());
        }
    }

    private boolean tryApplyFromCache(LoginCache c) throws ApiException {
        if (c == null || isNullOrEmpty(c.issuedAt) || c.expiresIn <= 0) {
            return false;
        }
        long exp;
        try {
            exp = Instant.parse(c.issuedAt.trim()).getEpochSecond() + c.expiresIn;
        } catch (DateTimeParseException e) {
            return false;
        }
        if (System.currentTimeMillis() / 1000 + EXPIRE_BUFFER_SECONDS >= exp) {
            return false;
        }
        // access_token is either a JSON-string or a JSON-object whose fields are
        // {access_key_id, secret_access_key, session_token}; reuse the same
        // parsing semantics as ve cli's readLoginCache.
        StsTriple sts = parseSts(c.accessToken);
        if (sts == null) {
            return false;
        }
        credentials = new CredentialValue(sts.accessKeyId, sts.secretAccessKey,
                sts.sessionToken, PROVIDER_NAME);
        expirationEpoch = exp;
        return true;
    }

    private void refreshWithOAuth(LoginCache c)
            throws ApiException, ConsoleLoginOAuthClient.InvalidGrantException {
        if (isNullOrEmpty(c.refreshToken)) {
            throw new ApiException(PROVIDER_NAME
                    + ": console-login cache lacks refresh_token; please run 've login' first.");
        }
        if (isNullOrEmpty(c.clientId)) {
            throw new ApiException(PROVIDER_NAME
                    + ": console-login cache lacks client_id; please run 've login' to regenerate.");
        }
        ConsoleLoginOAuthClient client = oauthFactory.create(c.endpointUrl);
        ConsoleLoginOAuthClient.TokenResponse resp = client.refreshToken(
                c.clientId, c.scope, c.refreshToken);

        // Update in-memory cache; access_token is mandatory, refresh_token /
        // id_token only when the server returned non-empty values (matches the
        // ve cli EnsureValidLoginToken behavior).
        try {
            c.accessToken = new JsonParser().parse(resp.accessToken);
        } catch (com.google.gson.JsonSyntaxException e) {
            throw new ApiException(PROVIDER_NAME
                    + ": console-login refresh succeeded but access_token could not be parsed as JSON;"
                    + " please run 've login'. underlying error: " + e.getMessage());
        }
        if (!isNullOrEmpty(resp.refreshToken)) {
            c.refreshToken = resp.refreshToken;
        }
        if (!isNullOrEmpty(resp.idToken)) {
            c.idToken = resp.idToken;
        }
        if (!isNullOrEmpty(resp.tokenType)) {
            c.tokenType = resp.tokenType;
        }
        c.issuedAt = Instant.now().toString();
        c.expiresIn = resp.expiresIn;

        if (!tryApplyFromCache(c)) {
            throw new ApiException(PROVIDER_NAME
                    + ": console-login refresh succeeded but the new access_token could not be"
                    + " parsed into STS credentials; please run 've login' to re-authenticate.");
        }
    }

    // -- disk IO ------------------------------------------------------------

    private LoginCache loadCacheFromDisk() throws ApiException {
        Path cachePath = cacheDir.resolve(loginCacheFileName(loginSession));
        if (!Files.exists(cachePath)) {
            throw new ApiException(PROVIDER_NAME
                    + ": console-login token cache file not found: " + cachePath
                    + ", please run 've login' first");
        }
        String content;
        try {
            content = new String(Files.readAllBytes(cachePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ApiException(PROVIDER_NAME
                    + ": failed to read console-login token cache: " + cachePath + " - " + e.getMessage());
        }
        LoginCache parsed;
        try {
            parsed = new Gson().fromJson(content, LoginCache.class);
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME
                    + ": failed to parse console-login token cache: " + e.getMessage());
        }
        if (parsed == null) {
            throw new ApiException(PROVIDER_NAME + ": console-login token cache file is empty");
        }
        return parsed;
    }

    private static String loginCacheFileName(String loginSession) throws ApiException {
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            byte[] hash = sha1.digest(loginSession.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder();
            for (byte b : hash) {
                hex.append(String.format("%02x", b));
            }
            return hex.toString() + ".json";
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new ApiException(PROVIDER_NAME + ": SHA-1 algorithm not available");
        }
    }

    // -- helpers ------------------------------------------------------------

    private static StsTriple parseSts(JsonElement accessToken) {
        if (accessToken == null || accessToken.isJsonNull()) {
            return null;
        }
        JsonObject obj;
        try {
            if (accessToken.isJsonObject()) {
                obj = accessToken.getAsJsonObject();
            } else {
                obj = new JsonParser().parse(accessToken.getAsString()).getAsJsonObject();
            }
        } catch (Exception e) {
            return null;
        }
        StsTriple t = new StsTriple();
        t.accessKeyId = optString(obj, "access_key_id");
        t.secretAccessKey = optString(obj, "secret_access_key");
        t.sessionToken = optString(obj, "session_token");
        if (isNullOrEmpty(t.accessKeyId) || isNullOrEmpty(t.secretAccessKey)
                || isNullOrEmpty(t.sessionToken)) {
            return null;
        }
        return t;
    }

    private static String optString(JsonObject obj, String key) {
        if (obj == null || !obj.has(key) || obj.get(key).isJsonNull()) {
            return null;
        }
        return obj.get(key).getAsString();
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    // -- inner types --------------------------------------------------------

    /** Mirror of the ve login cache file shape. */
    static class LoginCache {
        @SerializedName("login_session")
        String loginSession;
        @SerializedName("access_token")
        JsonElement accessToken;
        @SerializedName("issued_at")
        String issuedAt;
        @SerializedName("expires_in")
        long expiresIn;
        @SerializedName("token_type")
        String tokenType;
        @SerializedName("refresh_token")
        String refreshToken;
        @SerializedName("client_id")
        String clientId;
        @SerializedName("scope")
        String scope;
        @SerializedName("endpoint_url")
        String endpointUrl;
        @SerializedName("id_token")
        String idToken;
    }

    private static class StsTriple {
        String accessKeyId;
        String secretAccessKey;
        String sessionToken;
    }

    /** Pluggable OAuth client factory; production uses DEFAULT_FACTORY. */
    interface ConsoleLoginOAuthClientFactory {
        ConsoleLoginOAuthClient create(String endpointUrl);
    }

    private static final ConsoleLoginOAuthClientFactory DEFAULT_FACTORY =
            new ConsoleLoginOAuthClientFactory() {
                @Override
                public ConsoleLoginOAuthClient create(String endpointUrl) {
                    return new ConsoleLoginOAuthClient(endpointUrl);
                }
            };
}
