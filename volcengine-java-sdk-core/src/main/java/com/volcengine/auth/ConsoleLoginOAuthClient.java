package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Minimal OAuth client for the signin (ve login) {@code /authorize/oauth/token}
 * endpoint. Only the {@code refresh_token} grant is implemented because the SDK
 * never participates in interactive authorization flows.
 *
 * <p>Modeled after {@link SsoPortalClient} for consistency: same
 * {@link HttpURLConnection} backend, same custom 4xx handling style.
 *
 * <p>The endpoint URL is supplied per-request (it comes from the LoginTokenCache
 * the SDK just loaded); only the path is fixed.
 */
class ConsoleLoginOAuthClient {

    static final String DEFAULT_ENDPOINT = "https://signin.volcengine.com";
    static final String TOKEN_PATH = "/authorize/oauth/token";

    private static final int CONNECT_TIMEOUT_MS = 10_000;
    private static final int READ_TIMEOUT_MS = 30_000;

    private final String endpointBase;

    ConsoleLoginOAuthClient(String endpointBase) {
        if (endpointBase == null || endpointBase.trim().isEmpty()) {
            this.endpointBase = DEFAULT_ENDPOINT;
        } else {
            String trimmed = endpointBase.trim();
            // strip trailing slash for predictable path concat
            while (trimmed.endsWith("/")) {
                trimmed = trimmed.substring(0, trimmed.length() - 1);
            }
            this.endpointBase = trimmed;
        }
    }

    /**
     * Exchange a refresh_token for a fresh access_token. Returns the parsed
     * token response on HTTP 2xx; throws {@link InvalidGrantException} on
     * HTTP 400 with {@code error=invalid_grant}; throws {@link ApiException}
     * for every other error.
     */
    TokenResponse refreshToken(String clientId, String scope, String refreshToken)
            throws ApiException, InvalidGrantException {
        if (clientId == null || clientId.trim().isEmpty()) {
            throw new ApiException("ConsoleLoginOAuthClient: client_id is required");
        }
        if (refreshToken == null || refreshToken.trim().isEmpty()) {
            throw new ApiException("ConsoleLoginOAuthClient: refresh_token is required");
        }

        StringBuilder form = new StringBuilder();
        appendForm(form, "grant_type", "refresh_token");
        appendForm(form, "client_id", clientId);
        appendForm(form, "refresh_token", refreshToken);
        if (scope != null && !scope.trim().isEmpty()) {
            appendForm(form, "scope", scope);
        }
        byte[] body = form.toString().getBytes(StandardCharsets.UTF_8);

        String url = endpointBase + TOKEN_PATH;
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);
            try (OutputStream os = conn.getOutputStream()) {
                os.write(body);
            }
            int code = conn.getResponseCode();
            String respBody = readBody(conn, code);
            if (code / 100 == 2) {
                TokenResponse parsed;
                try {
                    parsed = new Gson().fromJson(respBody, TokenResponse.class);
                } catch (Exception e) {
                    throw new ApiException("ConsoleLoginOAuthClient: failed to parse token response - " + e.getMessage());
                }
                if (parsed == null || parsed.accessToken == null || parsed.accessToken.isEmpty()) {
                    throw new ApiException("ConsoleLoginOAuthClient: refresh response missing access_token");
                }
                if (parsed.expiresIn <= 0) {
                    throw new ApiException("ConsoleLoginOAuthClient: refresh response missing valid expires_in");
                }
                return parsed;
            }
            // Surface 400 invalid_grant separately so the caller can run the
            // disk-reload fallback before giving up.
            String errCode = "";
            try {
                JsonObject obj = new JsonParser().parse(respBody).getAsJsonObject();
                if (obj.has("error") && !obj.get("error").isJsonNull()) {
                    errCode = obj.get("error").getAsString();
                }
            } catch (Exception ignored) {
                // body wasn't JSON; treat as generic ApiException below
            }
            if (code == 400 && "invalid_grant".equals(errCode)) {
                throw new InvalidGrantException(
                        "console-login refresh_token rejected (invalid_grant): " + respBody);
            }
            throw new ApiException("ConsoleLoginOAuthClient: refresh failed with HTTP " + code
                    + (respBody == null || respBody.isEmpty() ? "" : ": " + respBody));
        } catch (IOException e) {
            throw new ApiException("ConsoleLoginOAuthClient: refresh request failed - " + e.getMessage());
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    private static void appendForm(StringBuilder sb, String k, String v) {
        if (sb.length() > 0) {
            sb.append('&');
        }
        try {
            sb.append(URLEncoder.encode(k, "UTF-8")).append('=').append(URLEncoder.encode(v, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException e) {
            // UTF-8 is mandated by the JVM spec; if this ever fires it is a JVM bug.
            throw new IllegalStateException("UTF-8 encoding not supported by this JVM", e);
        }
    }

    private static String readBody(HttpURLConnection conn, int code) {
        InputStream stream = null;
        try {
            stream = (code / 100 == 2) ? conn.getInputStream() : conn.getErrorStream();
            if (stream == null) {
                return "";
            }
            java.io.ByteArrayOutputStream buf = new java.io.ByteArrayOutputStream();
            byte[] chunk = new byte[4096];
            int n;
            while ((n = stream.read(chunk)) > 0) {
                buf.write(chunk, 0, n);
            }
            return buf.toString("UTF-8");
        } catch (IOException e) {
            return "";
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException ignored) {
                    // best-effort close
                }
            }
        }
    }

    /** Response payload mirroring fields of ve cli ConsoleTokenResponse. */
    static class TokenResponse {
        @SerializedName("access_token")
        String accessToken;
        @SerializedName("token_type")
        String tokenType;
        @SerializedName("expires_in")
        long expiresIn;
        @SerializedName("refresh_token")
        String refreshToken;
        @SerializedName("id_token")
        String idToken;
        @SerializedName("scope")
        String scope;
    }

    /** Sentinel raised when the signin OAuth endpoint returns invalid_grant. */
    static class InvalidGrantException extends Exception {
        InvalidGrantException(String msg) {
            super(msg);
        }
    }
}
