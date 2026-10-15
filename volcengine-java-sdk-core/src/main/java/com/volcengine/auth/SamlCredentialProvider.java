package com.volcengine.auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.volcengine.ApiException;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Provider that obtains temporary credentials via STS AssumeRoleWithSAML.
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
 *
 * <p>ApiClient snapshots this exact built-in type on first credential access,
 * with a separate cache and refresh lock per client. Later source configuration
 * changes require calling {@code ApiClient.setCredentialProvider(...)} again;
 * constructor-only settings require a replacement provider. Separate caches
 * may increase STS calls. Subclasses retain their existing identity and are
 * not snapshotted.
 */
public class SamlCredentialProvider implements Provider {

    private static final String PROVIDER_NAME = "SamlCredentialProvider";
    private static final String ASSUME_ROLE_ACTION = "AssumeRoleWithSAML";
    private static final int DEFAULT_DURATION_SECONDS = 3600;
    private static final int DEFAULT_EXPIRE_BUFFER_SECONDS = 300;
    private static final int MAX_EXPIRE_BUFFER_SECONDS = 600;
    private static final Gson GSON = new Gson();
    private static final Type MAP_TYPE = new TypeToken<Map<String, Object>>() {
    }.getType();

    private final String roleTrn;
    private final String samlProviderTrn;
    private final String samlAssertion;
    private final String rolePolicy;
    private final String stsEndpoint;

    private int durationSeconds = DEFAULT_DURATION_SECONDS;
    private int expireBufferSeconds = DEFAULT_EXPIRE_BUFFER_SECONDS;
    private String schema = "https";
    private int maxRetries = StsFormRequest.DEFAULT_MAX_RETRIES;
    private int retryIntervalMs = StsFormRequest.DEFAULT_RETRY_INTERVAL_MS;

    // Without provider or client fallback overrides, retain URLConnection
    // proxy selection and transport TLS settings; do not parse proxy env vars.
    private String proxyUrl;
    private String fallbackProxyUrl;
    private String caFile;
    private boolean insecureSkipVerify;

    private CredentialValue credentialValue;
    private long expirationTime;

    /**
     * Creates a new SamlCredentialProvider.
     *
     * @param roleTrn         the TRN of the role to assume, e.g. {@code trn:iam::1234567890:role/YourRoleName}
     * @param samlProviderTrn the TRN of the SAML provider, e.g. {@code trn:iam::1234567890:saml-provider/MyIdp}
     * @param samlAssertion   the base64-encoded SAML Response from your IdP
     * @param rolePolicy      optional inline policy to restrict permissions (may be null)
     * @param stsEndpoint     optional STS endpoint override (may be null for default)
     */
    public SamlCredentialProvider(String roleTrn, String samlProviderTrn,
                                  String samlAssertion, String rolePolicy, String stsEndpoint) {
        if (isNullOrEmpty(roleTrn)) {
            throw new IllegalArgumentException("roleTrn must not be null or empty");
        }
        if (isNullOrEmpty(samlProviderTrn)) {
            throw new IllegalArgumentException("samlProviderTrn must not be null or empty");
        }
        if (isNullOrEmpty(samlAssertion)) {
            throw new IllegalArgumentException("samlAssertion must not be null or empty");
        }
        this.roleTrn = roleTrn;
        this.samlProviderTrn = samlProviderTrn;
        this.samlAssertion = samlAssertion;
        this.rolePolicy = rolePolicy;
        this.stsEndpoint = isNullOrEmpty(stsEndpoint) ? StsFormRequest.DEFAULT_STS_ENDPOINT : stsEndpoint;
    }

    synchronized SamlCredentialProvider bind(String httpProxy, String httpsProxy) {
        SamlCredentialProvider copy = new SamlCredentialProvider(
                roleTrn, samlProviderTrn, samlAssertion, rolePolicy, stsEndpoint);
        copy.durationSeconds = durationSeconds;
        copy.expireBufferSeconds = expireBufferSeconds;
        copy.schema = schema;
        copy.maxRetries = maxRetries;
        copy.retryIntervalMs = retryIntervalMs;
        copy.proxyUrl = proxyUrl;
        copy.caFile = caFile;
        copy.insecureSkipVerify = insecureSkipVerify;
        copy.fallbackProxyUrl = StsFormRequest.normalizeEndpoint(stsEndpoint, schema).startsWith("http://")
                ? httpProxy : httpsProxy;
        return copy;
    }

    @Override
    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 > expirationTime;
    }

    @Override
    public void refresh() throws ApiException {
        long now = System.currentTimeMillis() / 1000;
        String responseBody = StsFormRequest.doPostWithRetry(
                stsEndpoint, schema, ASSUME_ROLE_ACTION,
                buildRequestBody(), maxRetries, retryIntervalMs, PROVIDER_NAME, buildHttpConfig());
        Map<String, Object> responseData = parseResponse(responseBody);

        Map<String, Object> responseMetadata = asMap(responseData.get("ResponseMetadata"));
        if (responseMetadata != null && responseMetadata.get("Error") != null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned error - " + stringify(responseMetadata.get("Error")));
        }

        Map<String, Object> resultMap = asMap(responseData.get("Result"));
        if (resultMap == null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned no result");
        }

        Map<String, Object> credentialMap = asMap(resultMap.get("Credentials"));
        if (credentialMap == null) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned no credentials");
        }

        String accessKey = asString(credentialMap.get("AccessKeyId"));
        String secretAccessKey = asString(credentialMap.get("SecretAccessKey"));
        String sessionToken = asString(credentialMap.get("SessionToken"));
        if (isNullOrEmpty(accessKey) || isNullOrEmpty(secretAccessKey)) {
            throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML response missing AccessKeyId or SecretAccessKey");
        }

        long expiration = now + durationSeconds;
        String expirationStr = asString(credentialMap.get("Expiration"));
        if (!isNullOrEmpty(expirationStr)) {
            try {
                expiration = parseExpirationEpochSecond(expirationStr);
            } catch (Exception e) {
                throw new ApiException(PROVIDER_NAME + ": failed to parse expiration - " + expirationStr);
            }
        }

        this.credentialValue = new CredentialValue(accessKey, secretAccessKey, sessionToken, PROVIDER_NAME);
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

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public void setExpireBufferSeconds(int expireBufferSeconds) {
        if (expireBufferSeconds > MAX_EXPIRE_BUFFER_SECONDS) {
            throw new IllegalArgumentException("expireBufferSeconds must be less than or equal to " + MAX_EXPIRE_BUFFER_SECONDS);
        }
        this.expireBufferSeconds = expireBufferSeconds;
    }

    public void setSchema(String schema) {
        if (!"http".equals(schema) && !"https".equals(schema)) {
            throw new IllegalArgumentException("schema must be 'http' or 'https'");
        }
        this.schema = schema;
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

    public String getProxyUrl() {
        return proxyUrl;
    }

    /**
     * Set the HTTP forward proxy for reaching the STS endpoint, format
     * {@code http://[user:password@]host:port}, with an explicit port in
     * {@code 1..65535}. TLS-to-proxy and SOCKS are unsupported.
     * When empty, the bound client's explicit STS-scheme proxy applies, then
     * URLConnection proxy selection, including JVM
     * {@code http.proxyHost}/{@code http.proxyPort} and
     * {@code https.proxyHost}/{@code https.proxyPort} system properties.
     * Does not parse {@code HTTP_PROXY}/{@code HTTPS_PROXY} or their lowercase
     * environment variants.
     */
    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    /**
     * Set a custom PEM CA bundle used to verify the STS server certificate.
     * When empty and {@code insecureSkipVerify == false}, no provider TLS
     * override is applied to subsequent STS connections. The TLS settings of
     * the transport in use are retained, possibly including a custom factory;
     * JVM default trust applies only if those settings were not customized.
     */
    public void setCaFile(String caFile) {
        this.caFile = caFile;
    }

    /**
     * When {@code true}, skip STS TLS certificate and hostname verification.
     * Takes precedence over {@code caFile}. When {@code false}, a configured CA
     * still applies; only an empty CA also removes all provider TLS overrides.
     * For debugging only; never enable in production.
     */
    public void setInsecureSkipVerify(boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
    }

    private StsHttpConfig buildHttpConfig() {
        StsHttpConfig config = new StsHttpConfig(
                isNullOrEmpty(proxyUrl) ? fallbackProxyUrl : proxyUrl, caFile, insecureSkipVerify);
        return config.isEmpty() ? null : config;
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

    private String buildRequestBody() {
        Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("DurationSeconds", String.valueOf(durationSeconds));
        params.put("RoleTrn", roleTrn);
        params.put("SAMLProviderTrn", samlProviderTrn);
        params.put("SAMLResp", samlAssertion);
        if (!isNullOrEmpty(rolePolicy)) {
            params.put("Policy", rolePolicy);
        }

        StringBuilder body = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (!first) {
                body.append('&');
            }
            body.append(StsFormRequest.urlEncode(entry.getKey()));
            body.append('=');
            body.append(StsFormRequest.urlEncode(entry.getValue()));
            first = false;
        }
        return body.toString();
    }

    private Map<String, Object> parseResponse(String responseBody) throws ApiException {
        try {
            Map<String, Object> responseData = GSON.fromJson(responseBody, MAP_TYPE);
            if (responseData == null) {
                throw new ApiException(PROVIDER_NAME + ": AssumeRoleWithSAML returned empty response");
            }
            return responseData;
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            throw new ApiException(PROVIDER_NAME + ": failed to parse AssumeRoleWithSAML response - " + e.getMessage());
        }
    }

    private static Map<String, Object> asMap(Object value) {
        if (!(value instanceof Map)) {
            return null;
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) value;
        return map;
    }

    private static String asString(Object value) {
        return value == null ? null : String.valueOf(value);
    }

    private static String stringify(Object value) {
        return value == null ? null : GSON.toJson(value);
    }
}
