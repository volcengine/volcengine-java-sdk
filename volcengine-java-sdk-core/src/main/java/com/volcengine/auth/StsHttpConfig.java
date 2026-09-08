package com.volcengine.auth;

/**
 * Carries proxy and TLS customization for STS requests (ProxyURL / CAFile /
 * InsecureSkipVerify).
 *
 * <p>This mirrors the Go SDK's {@code ProxyConfig}. It is consumed by
 * {@link StsFormRequest} (the OIDC / SAML form-POST path) and by
 * {@link StsAssumeRoleProvider} (the OkHttp based AssumeRole path), so that all
 * STS credential providers share a single, consistent proxy/TLS surface.
 *
 * <p>Semantics:
 * <ul>
 *   <li><b>proxyUrl</b> — forward proxy address, format
 *       {@code scheme://[user:password@]host:port}. When empty, the JVM default
 *       proxy selection applies (including {@code HTTP_PROXY} / {@code HTTPS_PROXY}
 *       system properties / environment).</li>
 *   <li><b>caFile</b> — path to a PEM CA bundle used to verify the STS server
 *       certificate. When empty, the JVM default trust store is used.</li>
 *   <li><b>insecureSkipVerify</b> — when {@code true}, TLS certificate chain and
 *       hostname verification are skipped. For debugging only; never enable in
 *       production.</li>
 * </ul>
 */
public class StsHttpConfig {

    private String proxyUrl;
    private String caFile;
    private boolean insecureSkipVerify;

    public StsHttpConfig() {
    }

    public StsHttpConfig(String proxyUrl, String caFile, boolean insecureSkipVerify) {
        this.proxyUrl = proxyUrl;
        this.caFile = caFile;
        this.insecureSkipVerify = insecureSkipVerify;
    }

    public String getProxyUrl() {
        return proxyUrl;
    }

    public StsHttpConfig setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
        return this;
    }

    public String getCaFile() {
        return caFile;
    }

    public StsHttpConfig setCaFile(String caFile) {
        this.caFile = caFile;
        return this;
    }

    public boolean isInsecureSkipVerify() {
        return insecureSkipVerify;
    }

    public StsHttpConfig setInsecureSkipVerify(boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
        return this;
    }

    /**
     * Returns {@code true} when none of the three parameters is configured.
     *
     * <p>Callers use this to decide whether any proxy/TLS customization needs to
     * be applied at all; when {@code true}, the underlying HTTP client is left
     * untouched so that JVM defaults (and existing client settings) are
     * preserved.
     */
    public boolean isEmpty() {
        return isNullOrEmpty(proxyUrl) && isNullOrEmpty(caFile) && !insecureSkipVerify;
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
