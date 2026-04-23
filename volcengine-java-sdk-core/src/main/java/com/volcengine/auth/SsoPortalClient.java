package com.volcengine.auth;

import com.volcengine.ApiException;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Minimal HTTP client for the CloudIdentity OAuth token refresh and
 * Portal GetRoleCredentials APIs used by the SSO credential flow.
 * <p>
 * Uses {@link HttpURLConnection} for consistency with
 * {@link EcsRoleCredentialProvider}.
 */
class SsoPortalClient {

    private static final String OAUTH_BASE_URL_TEMPLATE =
            "https://cloudidentity-oauth.%s.volces.com";
    private static final String PORTAL_BASE_URL_TEMPLATE =
            "https://cloudidentity-portal.%s.volces.com";
    private static final String PORTAL_CREDENTIALS_PATH = "/federation/credentials";
    private static final String PORTAL_TOKEN_HEADER = "x-bd-cloudidentity-bearer-token";

    private static final int CONNECT_TIMEOUT_MS = 10_000;
    private static final int READ_TIMEOUT_MS = 30_000;
    private static final int MAX_RETRIES = 3;
    private static final int RETRY_INTERVAL_MS = 1000;

    private final String region;
    private final Gson gson = new Gson();

    SsoPortalClient(String region) {
        this.region = (region == null || region.trim().isEmpty()) ? "cn-beijing" : region.trim();
    }

    // ---- OAuth token refresh ------------------------------------------------

    /**
     * Refresh the SSO access token using the OAuth token endpoint.
     */
    OAuthTokenResponse refreshToken(String clientId, String clientSecret, String refreshToken)
            throws ApiException {
        String url = String.format(OAUTH_BASE_URL_TEMPLATE, region) + "/token";
        OAuthTokenRequest req = new OAuthTokenRequest();
        req.grantType = "refresh_token";
        req.clientId = clientId;
        req.clientSecret = clientSecret;
        req.refreshToken = refreshToken;

        String body = gson.toJson(req);
        String responseBody = doPostWithRetry(url, body);

        OAuthTokenResponse resp;
        try {
            resp = gson.fromJson(responseBody, OAuthTokenResponse.class);
        } catch (Exception e) {
            throw new ApiException("SsoPortalClient: failed to parse OAuth token response - " + e.getMessage());
        }
        if (resp == null || isNullOrEmpty(resp.accessToken)) {
            throw new ApiException("SsoPortalClient: OAuth token response did not contain access_token");
        }
        if (resp.expiresIn <= 0) {
            throw new ApiException("SsoPortalClient: OAuth token response did not contain valid expires_in");
        }
        return resp;
    }

    // ---- Portal GetRoleCredentials -----------------------------------------

    /**
     * Exchange an SSO access token for temporary role credentials via the
     * Portal federation API.
     */
    RoleCredentialsResult getRoleCredentials(String accessToken, String accountId, String roleName)
            throws ApiException {
        String baseUrl = String.format(PORTAL_BASE_URL_TEMPLATE, region) + PORTAL_CREDENTIALS_PATH;
        String url = baseUrl
                + "?account_id=" + urlEncode(accountId)
                + "&role_name=" + urlEncode(roleName);

        String responseBody = doGetWithRetry(url, accessToken);

        PortalEnvelope envelope;
        try {
            envelope = gson.fromJson(responseBody, PortalEnvelope.class);
        } catch (Exception e) {
            throw new ApiException("SsoPortalClient: failed to parse portal response - " + e.getMessage());
        }
        if (envelope == null) {
            throw new ApiException("SsoPortalClient: portal response was empty");
        }
        if (envelope.responseMetadata != null && envelope.responseMetadata.error != null) {
            PortalResponseError err = envelope.responseMetadata.error;
            String msg = err.code != null ? err.code : "";
            if (err.message != null) {
                msg = msg.isEmpty() ? err.message : msg + ": " + err.message;
            }
            throw new ApiException("SsoPortalClient: portal API error - " + msg);
        }
        if (envelope.result == null || envelope.result.roleCredentials == null) {
            throw new ApiException("SsoPortalClient: portal response did not contain RoleCredentials");
        }
        RoleCredentialsResult creds = envelope.result.roleCredentials;
        if (isNullOrEmpty(creds.accessKeyId) || isNullOrEmpty(creds.secretAccessKey)) {
            throw new ApiException("SsoPortalClient: portal RoleCredentials missing AccessKeyId or SecretAccessKey");
        }
        return creds;
    }

    // ---- HTTP helpers -------------------------------------------------------

    private String doPostWithRetry(String urlStr, String jsonBody) throws ApiException {
        ApiException lastException = null;
        for (int attempt = 0; attempt < MAX_RETRIES; attempt++) {
            try {
                return doPost(urlStr, jsonBody);
            } catch (ApiException e) {
                lastException = e;
                if (attempt < MAX_RETRIES - 1) {
                    trySleep();
                }
            }
        }
        throw lastException;
    }

    private String doGetWithRetry(String urlStr, String accessToken) throws ApiException {
        ApiException lastException = null;
        for (int attempt = 0; attempt < MAX_RETRIES; attempt++) {
            try {
                return doGet(urlStr, accessToken);
            } catch (ApiException e) {
                lastException = e;
                if (attempt < MAX_RETRIES - 1) {
                    trySleep();
                }
            }
        }
        throw lastException;
    }

    private String doPost(String urlStr, String jsonBody) throws ApiException {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");

            byte[] payload = jsonBody.getBytes(StandardCharsets.UTF_8);
            try (OutputStream os = conn.getOutputStream()) {
                os.write(payload);
            }

            int statusCode = conn.getResponseCode();
            String body = readResponseBody(conn, statusCode);
            if (statusCode / 100 != 2) {
                throw new ApiException("SsoPortalClient: OAuth POST " + urlStr
                        + " failed with status " + statusCode + ": " + body);
            }
            return body;
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            throw new ApiException("SsoPortalClient: OAuth POST request failed - " + e.getMessage());
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    private String doGet(String urlStr, String accessToken) throws ApiException {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty(PORTAL_TOKEN_HEADER, accessToken);

            int statusCode = conn.getResponseCode();
            String body = readResponseBody(conn, statusCode);
            if (statusCode / 100 != 2) {
                throw new ApiException("SsoPortalClient: Portal GET " + urlStr
                        + " failed with status " + statusCode + ": " + body);
            }
            return body;
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            throw new ApiException("SsoPortalClient: Portal GET request failed - " + e.getMessage());
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    private static String readResponseBody(HttpURLConnection conn, int statusCode) {
        try {
            java.io.InputStream is = (statusCode / 100 == 2)
                    ? conn.getInputStream()
                    : conn.getErrorStream();
            if (is == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is, StandardCharsets.UTF_8))) {
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
        } catch (IOException e) {
            return "";
        }
    }

    private static String urlEncode(String value) {
        try {
            return java.net.URLEncoder.encode(value, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            // UTF-8 is always supported
            return value;
        }
    }

    private static void trySleep() {
        try {
            Thread.sleep(RETRY_INTERVAL_MS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    // ---- Inner DTOs ---------------------------------------------------------

    static class OAuthTokenRequest {
        @SerializedName("grant_type")
        String grantType;
        @SerializedName("client_id")
        String clientId;
        @SerializedName("client_secret")
        String clientSecret;
        @SerializedName("refresh_token")
        String refreshToken;
    }

    static class OAuthTokenResponse {
        @SerializedName("access_token")
        String accessToken;
        @SerializedName("token_type")
        String tokenType;
        @SerializedName("refresh_token")
        String refreshToken;
        @SerializedName("expires_in")
        int expiresIn;
    }

    static class PortalEnvelope {
        @SerializedName("ResponseMetadata")
        PortalResponseMetadata responseMetadata;
        @SerializedName("Result")
        PortalResult result;
    }

    static class PortalResponseMetadata {
        @SerializedName("RequestId")
        String requestId;
        @SerializedName("Error")
        PortalResponseError error;
    }

    static class PortalResponseError {
        @SerializedName("Code")
        String code;
        @SerializedName("Message")
        String message;
    }

    static class PortalResult {
        @SerializedName("RoleCredentials")
        RoleCredentialsResult roleCredentials;
    }

    static class RoleCredentialsResult {
        @SerializedName("AccessKeyId")
        String accessKeyId;
        @SerializedName("SecretAccessKey")
        String secretAccessKey;
        @SerializedName("SessionToken")
        String sessionToken;
        @SerializedName("Expiration")
        long expiration;
    }
}
