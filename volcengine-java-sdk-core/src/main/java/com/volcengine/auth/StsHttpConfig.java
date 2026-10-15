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
 *   <li><b>proxyUrl</b> - HTTP forward proxy address, format
 *       {@code http://[user:password@]host:port}, with an explicit port in
 *       {@code 1..65535}. HTTPS STS supports CONNECT through an HTTP proxy;
 *       TLS-to-proxy ({@code https://} proxy URLs) and SOCKS are unsupported.
 *       Provider bindings prefer the explicit provider proxy, then the bound
 *       client's explicit proxy selected by the STS URL scheme. With neither,
 *       OIDC/SAML retain URLConnection proxy selection, including JVM
 *       {@code http.proxyHost}/{@code http.proxyPort} and
 *       {@code https.proxyHost}/{@code https.proxyPort} system properties;
 *       they do not parse {@code HTTP_PROXY}/{@code HTTPS_PROXY} or their
 *       lowercase environment variants. AssumeRole retains its original
 *       ApiClient proxy selection, including supported proxy environment
 *       variables.</li>
 *   <li><b>caFile</b> - path to a PEM CA bundle used to verify the STS server
 *       certificate. Empty together with {@code insecureSkipVerify == false}
 *       uses the original transport TLS settings, including any custom factory.
 *       JVM default trust applies only if those settings were not customized.</li>
 *   <li><b>insecureSkipVerify</b> - when {@code true}, TLS certificate chain and
 *       hostname verification are skipped, taking precedence over {@code caFile}.
 *       Clearing the CA alone does not restore verification. For debugging
 *       only; never enable in production.</li>
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
