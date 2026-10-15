package com.volcengine.auth;

import com.squareup.okhttp.OkHttpClient;
import com.volcengine.*;
import com.volcengine.sign.Credentials;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/**
 * Provider that obtains temporary credentials via STS AssumeRole.
 *
 * <p>When this exact built-in type is wrapped in {@link CredentialProvider},
 * ApiClient snapshots its configuration on first credential access. Source role,
 * credentials, proxy, TLS, expiry, and retry changes require calling
 * {@link ApiClient#setCredentialProvider(CredentialProvider)} again on each
 * affected client. Source cache or expiration changes do not update an existing
 * binding. Separate client caches may increase STS calls. Subclasses retain
 * their existing identity and are not snapshotted by this binding mechanism.
 */
public class StsAssumeRoleProvider implements Provider {
    private String accessKey;
    private String securityKey;
    private String sessionToken;
    private String roleName;
    private String accountId;
    private String host = "sts.volcengineapi.com";
    private String region = "cn-beijing";
    private String schema = "https";
    //STS 请求过期时间
    private int timeout = 30;
    //STS过期时间，单位秒
    private int durationSeconds = 3600;

    private int expireBufferSeconds = 60;

    // Without provider or client fallback overrides, retain the original
    // ApiClient transport, including its supported proxy environment variables.
    private String proxyUrl;
    private String fallbackProxyUrl;
    private String caFile;
    private boolean insecureSkipVerify;
    private ApiClient.TlsSettings baselineTls;
    private OkHttpClient baselineProxy;
    private String baselineHttpProxy;
    private String baselineHttpsProxy;

    private CredentialValue credentialValue;

    private long expirationTime;

    private ApiClient apiClient;


    public StsAssumeRoleProvider(String accessKey, String securityKey, String roleName, String accountId) {
        this(accessKey, securityKey, "", roleName, accountId);
    }

    public StsAssumeRoleProvider(String accessKey, String securityKey, String sessionToken,
                                 String roleName, String accountId) {
        this.accessKey = accessKey;
        this.securityKey = securityKey;
        this.sessionToken = sessionToken;
        this.roleName = roleName;
        this.accountId = accountId;
        this.apiClient = new ApiClient()
                .setEndpoint(this.host)
                .setCredentials(Credentials.getCredentials(accessKey, securityKey, sessionToken))
                .setRegion(this.region);
    }

    private StsAssumeRoleProvider(StsAssumeRoleProvider source, String fallbackProxyUrl) {
        accessKey = source.accessKey;
        securityKey = source.securityKey;
        sessionToken = source.sessionToken;
        roleName = source.roleName;
        accountId = source.accountId;
        host = source.host;
        region = source.region;
        schema = source.schema;
        timeout = source.timeout;
        durationSeconds = source.durationSeconds;
        expireBufferSeconds = source.expireBufferSeconds;
        proxyUrl = source.proxyUrl;
        caFile = source.caFile;
        insecureSkipVerify = source.insecureSkipVerify;
        this.fallbackProxyUrl = fallbackProxyUrl;
        apiClient = source.apiClient.copyForCredentialProvider();
        baselineTls = source.baselineTls;
        baselineProxy = source.baselineProxy;
        baselineHttpProxy = source.baselineHttpProxy;
        baselineHttpsProxy = source.baselineHttpsProxy;
    }

    synchronized StsAssumeRoleProvider bind(String httpProxy, String httpsProxy) {
        return new StsAssumeRoleProvider(this, apiClient.getDisableSSL() ? httpProxy : httpsProxy);
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        this.apiClient.getCredentials().setAccessKey(accessKey);
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
        this.apiClient.getCredentials().setSecretKey(securityKey);

    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        this.apiClient.getCredentials().setSessionToken(sessionToken);
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
        this.apiClient.setEndpoint(host);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
        this.apiClient.setRegion(region);
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
        this.apiClient.setDisableSSL(schema.equals("http"));
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public int getExpireBufferSeconds() {
        return expireBufferSeconds;
    }

    public void setExpireBufferSeconds(int expireBufferSeconds) {
        this.expireBufferSeconds = expireBufferSeconds;
    }

    public String getProxyUrl() {
        return proxyUrl;
    }

    /**
     * Set the HTTP forward proxy for reaching the STS endpoint, format
     * {@code http://[user:password@]host:port}, with an explicit port in
     * {@code 1..65535}. TLS-to-proxy and SOCKS are unsupported.
     * When empty, the bound client's explicit STS-scheme proxy applies, then
     * the original ApiClient proxy selection, including supported proxy
     * environment variables.
     */
    public synchronized void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    public String getCaFile() {
        return caFile;
    }

    /**
     * Set a custom PEM CA bundle used to verify the STS server certificate.
     * When empty and {@code insecureSkipVerify == false}, the next STS refresh
     * removes provider TLS overrides and restores the original ApiClient TLS
     * settings, including any custom factory. JVM default trust applies only
     * if the original settings were not customized.
     */
    public synchronized void setCaFile(String caFile) {
        this.caFile = caFile;
    }

    public boolean isInsecureSkipVerify() {
        return insecureSkipVerify;
    }

    /**
     * When {@code true}, skip STS TLS certificate and hostname verification.
     * Takes precedence over {@code caFile}. When {@code false}, a configured CA
     * still applies; only an empty CA also removes all provider TLS overrides.
     * For debugging only; never enable in production.
     */
    public synchronized void setInsecureSkipVerify(boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
    }

    /**
     * Apply the proxy/TLS options to the underlying {@link ApiClient} before a
     * request. Only touches the settings the caller explicitly configured, so
     * host / region / credentials / timeout set elsewhere are preserved.
     */
    synchronized void applyHttpConfig() throws ApiException {
        String resolvedProxy = isNullOrEmpty(proxyUrl) ? fallbackProxyUrl : proxyUrl;
        boolean tlsOverride = insecureSkipVerify || !isNullOrEmpty(caFile);
        byte[] caBytes = null;
        if (!insecureSkipVerify && !isNullOrEmpty(caFile)) {
            try {
                caBytes = Files.readAllBytes(Paths.get(caFile));
            } catch (IOException e) {
                throw new ApiException("StsAssumeRoleProvider: unable to read CAFile \"" + caFile + "\"");
            }
        }
        if (!isNullOrEmpty(resolvedProxy)) {
            StsFormRequest.parseProxy(resolvedProxy);
        }
        // Detach before overriding any caller-owned transport settings.
        if (tlsOverride || baselineTls != null || !isNullOrEmpty(resolvedProxy) || baselineProxy != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().clone());
        }
        if (tlsOverride) {
            ApiClient.TlsSettings previous = apiClient.snapshotTlsSettings();
            try {
                apiClient.applyStsTlsSettings(insecureSkipVerify, caBytes);
            } catch (RuntimeException e) {
                throw new ApiException("StsAssumeRoleProvider: invalid TLS configuration", e, 0, null);
            }
            if (baselineTls == null) {
                baselineTls = previous;
            }
        } else if (baselineTls != null) {
            apiClient.restoreTlsSettings(baselineTls);
            baselineTls = null;
        }
        if (!isNullOrEmpty(resolvedProxy)) {
            if (baselineProxy == null) {
                baselineProxy = apiClient.getHttpClient().clone();
                baselineHttpProxy = apiClient.getHttpProxy();
                baselineHttpsProxy = apiClient.getHttpsProxy();
            }
            apiClient.setHttpProxy(resolvedProxy);
            apiClient.setHttpsProxy(resolvedProxy);
            restoreProxyTransport();
            // Use controlled CONNECT for every explicit HTTPS proxy, including
            // URLs without credentials, and retain 407 as an HTTP status.
            StsProxySupport.configure(apiClient.getHttpClient(), resolvedProxy,
                    StsFormRequest.normalizeEndpoint(apiClient.getEndpoint(),
                            apiClient.getDisableSSL() ? "http" : "https"));
            apiClient.getHttpClient().interceptors().add(StsProxySupport.PROXY_AUTH_RESPONSE);
        } else if (baselineProxy != null) {
            apiClient.setHttpProxy(baselineHttpProxy);
            apiClient.setHttpsProxy(baselineHttpsProxy);
            apiClient.getHttpClient().setProxy(baselineProxy.getProxy());
            apiClient.getHttpClient().setProxySelector(baselineProxy.getProxySelector());
            // Refresh an SDK-managed snapshot for the current scheme; caller
            // selectors are preserved by setDisableSSL.
            apiClient.setDisableSSL(apiClient.getDisableSSL());
            restoreProxyTransport();
            baselineProxy = null;
        }
    }

    private void restoreProxyTransport() {
        apiClient.getHttpClient().interceptors().remove(StsProxySupport.PROXY_AUTH_RESPONSE);
        apiClient.getHttpClient().setAuthenticator(baselineProxy.getAuthenticator());
        apiClient.getHttpClient().setSocketFactory(baselineProxy.getSocketFactory());
        apiClient.getHttpClient().setDns(baselineProxy.getDns());
        apiClient.getHttpClient().setFollowRedirects(baselineProxy.getFollowRedirects());
        apiClient.getHttpClient().setFollowSslRedirects(baselineProxy.getFollowSslRedirects());
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    // Package-private accessor used by tests to assert proxy/TLS propagation.
    ApiClient getApiClient() {
        return apiClient;
    }

    public CredentialValue getCredentialValue() {
        return credentialValue;
    }

    public void setCredentialValue(CredentialValue credentialValue) {
        this.credentialValue = credentialValue;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CredentialValue retrieve() throws ApiException {
        CredentialValue v = credentialValue;
        if (v == null) {
            throw new ApiException("StsAssumeRoleProvider: not refreshed; call refresh() first or use CredentialProvider");
        }
        return v;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 > expirationTime;
    }

    public synchronized void refresh() throws ApiException {
        applyHttpConfig();
        UniversalApi api = new UniversalApi(apiClient);
        UniversalRequest request = new UniversalRequest("sts", "AssumeRole", "2018-01-01", HttpMethod.GET, ContentType.Default);
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("DurationSeconds", this.durationSeconds);
        requestMap.put("RoleSessionName", UUID.randomUUID().toString());
        requestMap.put("RoleTrn", String.format("trn:iam::%s:role/%s", accountId, roleName));
        long now = System.currentTimeMillis() / 1000;
        ApiResponse<Map<String, Object>> apiResponse = api.doCallWithHttpInfo(request, requestMap);
        if (apiResponse.getStatusCode() == 200) {
            Map<String, Object> responseData = apiResponse.getData();
            try {
                if (responseData != null) {
                    if (responseData.get("ResponseMetadata") != null) {
                        Map<String, Object> responseMetadata = (Map<String, Object>) responseData.get("ResponseMetadata");
                        if (responseMetadata.get("Error") != null) {
                            throw new ApiException("StsAssumeRole request return Error");
                        }
                    }
                    if (responseData.get("Result") != null) {
                        Map<String, Object> resultMap = (Map<String, Object>) responseData.get("Result");
                        Object credentials = resultMap.get("Credentials");
                        Map<String, Object> credentialMap = (Map<String, Object>) credentials;
                        String accessKey = (String) credentialMap.get("AccessKeyId");
                        String secretAccessKey = (String) credentialMap.get("SecretAccessKey");
                        String sessionToken = (String) credentialMap.get("SessionToken");
                        this.credentialValue = new CredentialValue(accessKey, secretAccessKey, sessionToken, "StsCredentialProvider");
                        this.expirationTime = now + durationSeconds - expireBufferSeconds;
                        return;
                    } else {
                        throw new ApiException("StsAssumeRole request return Error");

                    }
                }
            } catch (Exception e) {
                throw new ApiException("StsAssumeRole Provider Error", apiResponse.getStatusCode(),
                        apiResponse.getHeaders(), this.apiClient.getJSON().serialize(apiResponse.getData()));
            }

        }
        throw new ApiException("StsAssumeRole Provider Error", apiResponse.getStatusCode(),
                apiResponse.getHeaders(), this.apiClient.getJSON().serialize(apiResponse.getData()));

    }
}
