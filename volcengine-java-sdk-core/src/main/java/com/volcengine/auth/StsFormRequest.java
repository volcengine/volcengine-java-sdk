package com.volcengine.auth;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Challenge;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.http.AuthenticatorAdapter;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import com.volcengine.ApiException;
import com.volcengine.ErrorUtils;
import com.volcengine.ResponseDetails;
import com.volcengine.retryer.DefaultRetryCondition;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.HostnameVerifier;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

/**
 * Shared HTTP helper for STS form-encoded POST requests (AssumeRoleWithOIDC,
 * AssumeRoleWithSAML). Provides retry with configurable attempts and interval.
 * <p>
 * Only retries on transient failures: {@link IOException} (network errors) and
 * HTTP 5xx / 429 responses. Deterministic 4xx errors are not retried.
 * <p>
 * Proxy and TLS customization (ProxyURL / CAFile / InsecureSkipVerify) are
 * supplied via {@link StsHttpConfig}. This is the single choke point that
 * gives OIDC and SAML providers the same proxy/TLS capabilities as the OkHttp
 * based AssumeRole path.
 */
class StsFormRequest {

    static final String DEFAULT_STS_ENDPOINT = "sts.volcengineapi.com";
    static final int DEFAULT_CONNECT_TIMEOUT_MS = 3000;
    static final int DEFAULT_READ_TIMEOUT_MS = 3000;
    static final int DEFAULT_MAX_RETRIES = 3;
    static final int DEFAULT_RETRY_INTERVAL_MS = 1000;
    static final String DEFAULT_STS_VERSION = "2018-01-01";
    static final String FORM_URLENCODED = "application/x-www-form-urlencoded";
    static final String ACCEPT = "application/json";
    private static final int MAX_FOLLOW_UPS = 20;

    private StsFormRequest() {
    }

    /**
     * Send a form-encoded POST to the STS endpoint with retry, without any
     * proxy or TLS customization. Kept for backward compatibility.
     */
    static String doPostWithRetry(String endpoint, String schema, String action, String formBody, int maxRetries, int retryIntervalMs, String providerName) throws ApiException {
        return doPostWithRetry(endpoint, schema, action, formBody, maxRetries, retryIntervalMs, providerName, null);
    }

    /**
     * Send a form-encoded POST to the STS endpoint with retry.
     *
     * @param endpoint        STS endpoint (may include scheme, or bare host)
     * @param schema          scheme to use when endpoint has no scheme ("http" or "https")
     * @param action          STS action name (e.g. "AssumeRoleWithOIDC")
     * @param formBody        URL-encoded form body
     * @param maxRetries      max retry attempts; 0 means no retry (single attempt only)
     * @param retryIntervalMs sleep between retries in milliseconds
     * @param providerName    provider name for error messages
     * @param httpConfig      proxy/TLS configuration; may be null (no customization)
     * @return response body string
     * @throws ApiException on failure after all attempts exhausted
     */
    static String doPostWithRetry(String endpoint, String schema, String action, String formBody, int maxRetries, int retryIntervalMs, String providerName, StsHttpConfig httpConfig) throws ApiException {
        return requestWithRetry(endpoint, schema, action, formBody, maxRetries, retryIntervalMs, providerName, httpConfig).body;
    }

    static StsResponse requestWithRetry(String endpoint, String schema, String action, String formBody, int maxRetries, int retryIntervalMs, String providerName, StsHttpConfig httpConfig) throws ApiException {
        return requestWithRetry(endpoint, schema, action, formBody, maxRetries, retryIntervalMs, providerName, httpConfig, false);
    }

    static StsResponse requestWithRetry(String endpoint, String schema, String action, String formBody, int maxRetries, int retryIntervalMs, String providerName, StsHttpConfig httpConfig, boolean simpleError) throws ApiException {
        String requestUrl = buildRequestUrl(endpoint, schema, action);
        ApiException lastException = null;
        for (int attempt = 0; attempt <= maxRetries; attempt++) {
            try {
                StsResponse response = doPost(requestUrl, formBody, providerName, action, httpConfig, simpleError);
                if (ErrorUtils.hasBusinessError(response.body)) response.parse(providerName, action);
                return response;
            } catch (ApiException e) {
                if (!isRetryable(e)) {
                    throw e;
                }
                lastException = e;
                if (attempt < maxRetries) {
                    try {
                        Thread.sleep(retryIntervalMs);
                    } catch (InterruptedException delayError) {
                        Thread.currentThread().interrupt();
                        ApiException failure = ErrorUtils.responseError("Interrupted while waiting to retry STS request", delayError,
                                null, e.getResponseBody(), e.getResponseMetadata(), e.getResponseDetails(), false);
                        failure.addSuppressed(e);
                        throw failure;
                    }
                }
            }
        }
        if (lastException != null) {
            throw lastException;
        }
        throw new ApiException(providerName + ": " + action + " request failed after " + (maxRetries + 1) + " attempts");
    }

    static Proxy parseProxy(String proxyUrl) throws ApiException {
        try {
            URI uri = new URI(proxyUrl);
            if (!"http".equalsIgnoreCase(uri.getScheme()) || uri.getHost() == null
                    || uri.getPort() <= 0 || uri.getPort() > 65535) {
                throw new ApiException("invalid proxy url: expected http://[user:password@]host:port");
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(uri.getHost(), uri.getPort()));
        } catch (URISyntaxException e) {
            throw new ApiException("invalid proxy url");
        }
    }

    static Authenticator proxyAuthenticator(String proxyUrl) throws ApiException {
        final Proxy expectedProxy = parseProxy(proxyUrl);
        final String header = proxyAuthorizationHeader(proxyUrl);
        return new Authenticator() {
            @Override public Request authenticate(Proxy proxy, Response response) {
                return null;
            }
            @Override public Request authenticateProxy(Proxy proxy, Response response) {
                if (!expectedProxy.equals(proxy) || header == null
                        || response.request().header("Proxy-Authorization") != null) {
                    return null;
                }
                for (Challenge challenge : response.challenges()) {
                    if ("Basic".equalsIgnoreCase(challenge.getScheme())) {
                        return response.request().newBuilder().header("Proxy-Authorization", header).build();
                    }
                }
                return null;
            }
        };
    }

    private static StsResponse doPost(String requestUrl, String formBody, String providerName,
                                            String action, StsHttpConfig config, boolean simpleError) throws ApiException {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        client.setReadTimeout(DEFAULT_READ_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        client.setWriteTimeout(DEFAULT_READ_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        // The SDK loop alone controls retries, including a POST already received by the server.
        client.setRetryOnConnectionFailure(false);
        boolean explicitProxy = config != null && !isNullOrEmpty(config.getProxyUrl());
        boolean https = requestUrl.startsWith("https://");
        boolean useJvmTransportDefaults = !https || !explicitProxy;
        if (useJvmTransportDefaults) {
            // Retain the former URLConnection path's JVM proxy, redirect and TLS defaults.
            client.setProxySelector(ProxySelector.getDefault());
            client.setFollowRedirects(HttpURLConnection.getFollowRedirects());
            client.setFollowSslRedirects(false);
            if (https) {
                client.setSslSocketFactory(HttpsURLConnection.getDefaultSSLSocketFactory());
                client.setConnectionSpecs(Arrays.asList(jvmTlsSpec(), ConnectionSpec.CLEARTEXT));
                // Origin/forward-proxy challenges are handled below. OkHttp still
                // needs a bounded JVM authentication callback for an implicit CONNECT.
                client.setAuthenticator(new Authenticator() {
                    @Override public Request authenticate(Proxy proxy, Response response) {
                        return null;
                    }
                    @Override public Request authenticateProxy(Proxy proxy, Response response) throws IOException {
                        // OkHttp 2's synthetic tunnel request does not use method CONNECT.
                        return proxy.type() == Proxy.Type.HTTP && response.request().httpUrl().isHttps()
                                && response.request().header("Proxy-Authorization") == null
                                ? AuthenticatorAdapter.INSTANCE.authenticateProxy(proxy, response) : null;
                    }
                });
                final HostnameVerifier verifier = HttpsURLConnection.getDefaultHostnameVerifier();
                // URLConnection calls its verifier only after standard hostname matching fails.
                client.setHostnameVerifier((hostname, session) ->
                        OkHostnameVerifier.INSTANCE.verify(hostname, session) || verifier.verify(hostname, session));
            }
        }
        if (explicitProxy) {
            StsProxySupport.configure(client, config.getProxyUrl(), requestUrl);
        }
        if (https && config != null && (config.isInsecureSkipVerify() || !isNullOrEmpty(config.getCaFile()))) {
            client.setSslSocketFactory(StsTlsSupport.buildSslContext(config).getSocketFactory());
            if (config.isInsecureSkipVerify()) {
                client.setHostnameVerifier(StsTlsSupport.trustAllHostnameVerifier());
            }
        }
        FormExchange exchange = new FormExchange(useJvmTransportDefaults, client.getProxy());
        client.networkInterceptors().add(exchange::send);
        Request.Builder builder = new Request.Builder().url(requestUrl).header("Accept", ACCEPT)
                .post(RequestBody.create(MediaType.parse(FORM_URLENCODED),
                        formBody.getBytes(StandardCharsets.UTF_8)));
        if (explicitProxy && !https) {
            String header = proxyAuthorizationHeader(config.getProxyUrl());
            if (header != null) builder.header("Proxy-Authorization", header);
        }
        Request request = builder.build();
        ResponseDetails metadata = null;
        StsResponse captured = null;
        try {
            Response response = exchange.execute(client, request);
            metadata = new ResponseDetails(response.code(), response.code() + " " + response.message(),
                    response.protocol().toString(), "", response.headers().toMultimap(), null, false, false);
            try (ResponseBody body = response.body()) {
                captured = StsResponse.read(body == null ? null : body.byteStream(), metadata, simpleError,
                        body == null ? -1 : body.contentLength());
                if (response.code() != 200) {
                    captured.parse(providerName, action);
                    throw captured.error(providerName + ": " + action + " request failed with status "
                            + response.code() + (captured.body.isEmpty() ? "" : " - " + captured.body), null, "UnknownError");
                }
                return captured;
            }
        } catch (StsProxySupport.AuthenticationException e) {
            throw new ApiException(e.getMessage(), e, 407, null, null);
        } catch (IOException e) {
            if (captured != null) {
                ResponseDetails d = captured.details;
                metadata = new ResponseDetails(d.getStatusCode(), d.getStatus(), d.getProto(), d.getRequestId(),
                        d.getHeaders(), d.getBody(), d.isBodyCaptured(), false);
            }
            throw ErrorUtils.responseError(providerName + ": " + action + " request failed - " + e.getMessage(),
                    e, metadata == null ? "RequestError" : "ReadError", captured == null ? null : captured.body,
                    null, metadata, simpleError);
        }
    }

    private static ConnectionSpec jvmTlsSpec() {
        ConnectionSpec.Builder spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                .allEnabledTlsVersions().allEnabledCipherSuites();
        String[] protocols = jvmTlsOptions("https.protocols");
        String[] ciphers = jvmTlsOptions("https.cipherSuites");
        if (protocols.length > 0) spec.tlsVersions(protocols);
        if (ciphers.length > 0) spec.cipherSuites(ciphers);
        return spec.build();
    }

    private static String[] jvmTlsOptions(String property) {
        StringTokenizer values = new StringTokenizer(System.getProperty(property, ""), ",");
        String[] result = new String[values.countTokens()];
        for (int i = 0; i < result.length; i++) result[i] = values.nextToken();
        return result;
    }

    /** Request-local state shared by transport and HTTP follow-ups for one SDK attempt. */
    private static final class FormExchange {
        private final boolean useJvmTransportDefaults;
        private Proxy authenticatedProxy;
        private Proxy sentProxy;
        private Request sentRequest;
        private int challengeStatus;
        private int requests;

        FormExchange(boolean useJvmTransportDefaults, Proxy configuredProxy) {
            this.useJvmTransportDefaults = useJvmTransportDefaults;
            this.authenticatedProxy = configuredProxy;
        }

        Response send(Interceptor.Chain chain) throws IOException {
            checkFollowUpLimit();
            requests++;
            sentProxy = chain.connection().getRoute().getProxy();
            sentRequest = chain.request();
            if (sentRequest.header("Proxy-Authorization") != null
                    && (sentRequest.httpUrl().isHttps() || !sentProxy.equals(authenticatedProxy))) {
                sentRequest = sentRequest.newBuilder().removeHeader("Proxy-Authorization").build();
            }
            Response response = chain.proceed(sentRequest);
            challengeStatus = response.code() == 401 || response.code() == 407 ? response.code() : 0;
            // Handle origin/forward-proxy challenges against the actual route.
            // In particular, OkHttp 2 throws rather than returning a direct 407.
            return challengeStatus == 0 ? response : response.newBuilder().code(400).build();
        }

        Response execute(OkHttpClient client, Request request) throws IOException {
            while (true) {
                Response response = client.newCall(request).execute();
                if (challengeStatus != 0) response = response.newBuilder().code(challengeStatus).build();
                Request followUp;
                try {
                    followUp = followUp(client, response);
                } catch (IOException | RuntimeException e) {
                    if (response.body() != null) {
                        try {
                            response.body().close();
                        } catch (IOException closeError) {
                            e.addSuppressed(closeError);
                        }
                    }
                    throw e;
                }
                if (followUp == null) return response;
                if (response.body() != null) response.body().close();
                checkFollowUpLimit();
                request = followUp;
            }
        }

        private Request followUp(OkHttpClient client, Response response) throws IOException {
            if (!useJvmTransportDefaults) return null;
            Request request = response.request();
            if (response.code() == 401 && sentRequest.header("Authorization") == null) {
                return AuthenticatorAdapter.INSTANCE.authenticate(sentProxy, response);
            }
            if (response.code() == 407 && !request.httpUrl().isHttps()
                    && sentProxy.type() == Proxy.Type.HTTP && sentRequest.header("Proxy-Authorization") == null) {
                Request authenticated = AuthenticatorAdapter.INSTANCE.authenticateProxy(sentProxy, response);
                if (authenticated != null) authenticatedProxy = sentProxy;
                return authenticated;
            }
            if (response.code() != 307 || !client.getFollowRedirects() || request.body() == null) return null;
            String location = response.header("Location");
            HttpUrl from = request.httpUrl();
            HttpUrl to = location == null ? null : from.resolve(location);
            if (to == null || !to.scheme().equals(from.scheme())) return null;
            Request.Builder redirected = request.newBuilder().url(to);
            if (!to.host().equals(from.host()) || to.port() != from.port()) {
                redirected.removeHeader("Authorization").removeHeader("Host");
            }
            return redirected.build();
        }

        private void checkFollowUpLimit() throws ProtocolException {
            if (requests > MAX_FOLLOW_UPS) {
                throw new ProtocolException("Too many follow-up requests: " + requests);
            }
        }
    }

    /**
     * Build a {@code Proxy-Authorization: Basic ...} header value from the
     * userinfo part of a proxy url, or {@code null} when the proxy url carries
     * no credentials.
     */
    static String proxyAuthorizationHeader(String proxyUrl) throws ApiException {
        try {
            URI uri = new URI(proxyUrl);
            String userInfo = uri.getUserInfo();
            if (isNullOrEmpty(userInfo)) {
                return null;
            }
            byte[] raw = userInfo.getBytes(StandardCharsets.UTF_8);
            return "Basic " + Base64.getEncoder().encodeToString(raw);
        } catch (URISyntaxException e) {
            throw new ApiException("invalid proxy url");
        }
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    /**
     * Determines whether the exception is retryable.
     * Retains STS HTTP 5xx/429 retries, plus retryable causes and service codes.
     */
    private static boolean isRetryable(ApiException e) {
        int code = e.getCode();
        Throwable cause = e.getCause();
        // A peer closing before response headers was a retryable SocketException
        // with URLConnection; OkHttp 2 instead wraps an EOFException in IOException.
        boolean headerEof = e.getResponseDetails() == null && code == 0
                && (cause instanceof EOFException || (cause != null && cause.getClass() == IOException.class
                && cause.getCause() instanceof EOFException));
        return code == 429 || (code >= 500 && code < 600)
                || headerEof
                || new DefaultRetryCondition().shouldRetry(null, e);
    }

    static String buildRequestUrl(String endpoint, String schema, String action) {
        String normalizedEndpoint = normalizeEndpoint(endpoint, schema);
        try {
            URL endpointUrl = new URL(normalizedEndpoint);
            String path = endpointUrl.getPath();
            StringBuilder url = new StringBuilder(normalizedEndpoint);
            if (path == null || path.isEmpty()) {
                url.append('/');
            }
            url.append("?Action=").append(urlEncode(action));
            url.append("&Version=").append(urlEncode(DEFAULT_STS_VERSION));
            return url.toString();
        } catch (Exception e) {
            throw new IllegalStateException("Invalid STS endpoint: " + normalizedEndpoint, e);
        }
    }

    static String normalizeEndpoint(String endpoint, String schema) {
        String normalized = (endpoint == null || endpoint.trim().isEmpty()) ? DEFAULT_STS_ENDPOINT : endpoint.trim();
        while (normalized.endsWith("/")) {
            normalized = normalized.substring(0, normalized.length() - 1);
        }
        if (!normalized.startsWith("http://") && !normalized.startsWith("https://")) {
            String scheme = (schema == null || schema.trim().isEmpty()) ? "https" : schema.trim();
            normalized = scheme + "://" + normalized;
        }
        return normalized;
    }

    static String readResponseBody(InputStream stream) throws IOException {
        // Legacy text helper; live STS requests capture exact bytes with StsResponse.
        if (stream == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
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
    }

    static String urlEncode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            throw new IllegalStateException("Failed to encode query parameter", e);
        }
    }

}
