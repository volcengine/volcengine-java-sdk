package com.volcengine.auth;

import com.volcengine.ApiException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;

/**
 * Builds {@link SSLContext} instances for the STS form-POST path
 * (AssumeRoleWithOIDC / AssumeRoleWithSAML) from {@link StsHttpConfig}.
 *
 * <p>Mirrors the Go SDK's {@code buildProxyTransport} TLS handling and the
 * OkHttp based {@code ApiClient.applySslSettings}:
 * <ul>
 *   <li>{@code insecureSkipVerify == true} — trust all certificates and skip
 *       hostname verification (debugging only).</li>
 *   <li>{@code caFile} non-empty — trust only the PEM certificates in that file
 *       when verifying the STS server certificate chain.</li>
 * </ul>
 *
 * <p>{@code insecureSkipVerify} takes precedence over {@code caFile}: when both
 * are set, verification is skipped entirely.
 */
final class StsTlsSupport {

    private StsTlsSupport() {
    }

    /**
     * Build an {@link SSLContext} honoring the TLS options in {@code httpConfig}.
     *
     * @param httpConfig proxy/TLS configuration; must be non-null and have at
     *                   least one TLS option set (validated by the caller)
     * @return an initialized SSLContext
     * @throws ApiException if the CA file cannot be read or the SSLContext
     *                      cannot be built
     */
    static SSLContext buildSslContext(StsHttpConfig httpConfig) throws ApiException {
        try {
            TrustManager[] trustManagers;
            if (httpConfig.isInsecureSkipVerify()) {
                trustManagers = new TrustManager[]{trustAllManager()};
            } else {
                trustManagers = trustManagersFromCaFile(httpConfig.getCaFile());
            }

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustManagers, new SecureRandom());
            return sslContext;
        } catch (GeneralSecurityException e) {
            throw new ApiException("STS request failed: unable to build TLS context - " + e.getMessage());
        }
    }

    /**
     * A {@link HostnameVerifier} that accepts any hostname. Used together with an
     * insecure SSLContext when {@code insecureSkipVerify} is enabled.
     */
    static HostnameVerifier trustAllHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }

    private static TrustManager trustAllManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    private static TrustManager[] trustManagersFromCaFile(String caFile) throws ApiException, GeneralSecurityException {
        InputStream caStream = openCaStream(caFile);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            Collection<? extends Certificate> certificates = certificateFactory.generateCertificates(caStream);
            if (certificates.isEmpty()) {
                throw new ApiException("STS request failed: no trusted certificates found in CAFile \"" + caFile + "\"");
            }
            KeyStore caKeyStore = newEmptyKeyStore();
            int index = 0;
            for (Certificate certificate : certificates) {
                caKeyStore.setCertificateEntry("ca" + (index++), certificate);
            }
            TrustManagerFactory trustManagerFactory =
                    TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(caKeyStore);
            return trustManagerFactory.getTrustManagers();
        } finally {
            try {
                caStream.close();
            } catch (IOException ignored) {
                // Nothing actionable on close failure.
            }
        }
    }

    private static InputStream openCaStream(String caFile) throws ApiException {
        try {
            return Files.newInputStream(Paths.get(caFile));
        } catch (IOException e) {
            throw new ApiException("STS request failed: unable to read CAFile \"" + caFile + "\" - " + e.getMessage());
        }
    }

    private static KeyStore newEmptyKeyStore() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException("failed to initialize empty key store", e);
        }
    }
}
