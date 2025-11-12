package com.volcengine.ark.runtime.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.openssl.PEMParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.security.*;

import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class CertificateManager {
    private static final ConcurrentHashMap<String, ServerCertificateInfo> certificateCache = new ConcurrentHashMap<>();

    /**
     * 服务端证书信息类
     */
    public static class ServerCertificateInfo {
        private final PublicKey publicKey;
        private final String ringId;
        private final String keyId;

        public ServerCertificateInfo(PublicKey publicKey, String ringId, String keyId) {
            this.publicKey = publicKey;
            this.ringId = ringId;
            this.keyId = keyId;
        }

        public PublicKey getPublicKey() {
            return publicKey;
        }

        public String getRingId() {
            return ringId;
        }

        public String getKeyId() {
            return keyId;
        }
    }

    private static List<String> getDnsNamesFromExtension(Extension sanExtension) {
        List<String> dnsNames = new ArrayList<>();

        try {
            GeneralNames generalNames = GeneralNames.getInstance(sanExtension.getParsedValue());

            for (GeneralName generalName : generalNames.getNames()) {
                if (generalName.getTagNo() == GeneralName.dNSName) {
                    String dnsName = generalName.getName().toString();
                    dnsNames.add(dnsName);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error getting DNS names from extension:", e);
        }

        return dnsNames;
    }

    /**
     * 检查内存缓存中是否存在证书
     */
    public static boolean hasCertificateInCache(String ep) {
        return certificateCache.containsKey(ep);
    }

    /**
     * 从内存缓存获取证书
     */
    public static ServerCertificateInfo getServerCertificateFromCache(String ep) {
        return certificateCache.get(ep);
    }

    public static ServerCertificateInfo getServerCertificate(String apiKey, String baseUrl, String ep) throws IOException {
        if (hasCertificateInCache(ep)) {
            return getServerCertificateFromCache(ep);
        }

        try {
            String volcArkEncryption = System.getenv("VOLC_ARK_ENCRYPTION");
            boolean aiccEnabled = "AICC".equals(volcArkEncryption);

            String certificate;

            certificate = loadCertificateLocally(ep);
            if (certificate != null) {
                return createCertificateInfo(certificate, ep);
            }

            certificate = loadCertificateByApiKey(baseUrl, apiKey, ep, aiccEnabled);

            saveCertificateLocally(ep, certificate);

            return createCertificateInfo(certificate, ep);

        } catch (Exception e) {
            throw new IOException("Failed to fetch server certificate", e);
        }
    }

    public static String[] getCertInfo(String certPem) {
        try {
            try (PEMParser pemParser = new PEMParser(new StringReader(certPem))) {
                Object object = pemParser.readObject();

                if (object instanceof X509CertificateHolder) {
                    X509CertificateHolder certHolder = (X509CertificateHolder) object;

                    Extension sanExtension = certHolder.getExtension(Extension.subjectAlternativeName);
                    if (sanExtension != null) {
                        List<String> dnsNames = getDnsNamesFromExtension(sanExtension);

                        if (dnsNames.size() > 1) {
                            String firstDns = dnsNames.get(0);
                            String secondDns = dnsNames.get(1);

                            Pattern ringPattern = Pattern.compile("^ring\\..*$");
                            Pattern keyPattern = Pattern.compile("^key\\..*$");

                            if (ringPattern.matcher(firstDns).matches() &&
                                    keyPattern.matcher(secondDns).matches()) {
                                String ringId = firstDns.substring(5);
                                String keyId = secondDns.substring(4);
                                return new String[]{ringId, keyId};
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse certificate to get ring_id and key_id", e);
        }
        return new String[]{"", ""};
    }

    /**
     * 从本地缓存加载证书
     */
    public static String loadCertificateLocally(String ep) throws IOException {
        try {
            String certStoragePath = getCertStoragePath();
            String certFilePath = certStoragePath + File.separator + ep + ".pem";

            File certFile = new File(certFilePath);

            if (certFile.exists()) {
                long lastModifiedSeconds = certFile.lastModified() / 1000;
                long currentTimeSeconds = System.currentTimeMillis() / 1000;
                long timeDifferenceSeconds = currentTimeSeconds - lastModifiedSeconds;
                long certExpirationSeconds = 14L * 24 * 60 * 60;
                if (timeDifferenceSeconds <= certExpirationSeconds) {
                    String certPem = new String(java.nio.file.Files.readAllBytes(certFile.toPath()), StandardCharsets.UTF_8);

                    String[] certInfo = getCertInfo(certPem);
                    String ringId = certInfo[0];
                    String keyId = certInfo[1];

                    boolean aiccEnabled = "AICC".equals(System.getenv("VOLC_ARK_ENCRYPTION"));

                    if ((ringId.isEmpty() || keyId.isEmpty()) && !aiccEnabled) {
                        return certPem;
                    }
                    if (!ringId.isEmpty() && !keyId.isEmpty() && aiccEnabled) {
                        return certPem;
                    }
                }

                certFile.delete();
            }
        } catch (Exception e) {
            String errMsg = "Failed to load local certificate: " + e.getMessage();
            throw new IOException(errMsg, e);
        }
        return null;
    }

    /**
     * 使用API Key方式获取证书 - 重构后降低复杂度
     */
    public static String loadCertificateByApiKey(String baseUrl, String apiKey, String ep, boolean aiccEnabled) throws IOException {
        HttpURLConnection connection = null;
        try {
            connection = createHttpConnection(baseUrl, apiKey);
            sendCertificateRequest(connection, ep, aiccEnabled);
            return processCertificateResponse(connection);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            String errMsg = "通过API Key获取证书失败: " + e.getMessage();
            throw new IOException(errMsg, e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /**
     * 创建HTTP连接
     */
    private static HttpURLConnection createHttpConnection(String baseUrl, String apiKey) throws IOException {
        String certificateUrl = buildCertificateUrl(baseUrl);
        URL url = URI.create(certificateUrl).toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);
        connection.setRequestProperty("X-Session-Token", "/e2e/get/certificate");

        return connection;
    }

    /**
     * 构建证书请求URL
     */
    private static String buildCertificateUrl(String baseUrl) {
        String requestedUrl = baseUrl.replaceAll("/+$", "");

        if (requestedUrl.endsWith("/api/v3")) {
            return requestedUrl + "/e2e/get/certificate";
        } else {
            return requestedUrl + "/api/v3/e2e/get/certificate";
        }
    }

    /**
     * 发送证书请求
     */
    private static void sendCertificateRequest(HttpURLConnection connection, String ep, boolean aiccEnabled) throws IOException {
        String jsonBody = buildRequestBody(ep, aiccEnabled);

        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonBody.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }
    }

    /**
     * 构建请求体
     */
    private static String buildRequestBody(String ep, boolean aiccEnabled) throws IOException {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", ep);
        if (aiccEnabled) {
            requestBody.put("type", "AICCv0.1");
        }
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(requestBody);
    }

    /**
     * 处理证书响应
     */
    private static String processCertificateResponse(HttpURLConnection connection) throws IOException {
        int responseCode = connection.getResponseCode();

        if (!isSuccessfulResponse(responseCode)) {
            handleErrorResponse(connection, responseCode);
        }

        return extractCertificateFromResponse(connection);
    }

    /**
     * 检查响应是否成功
     */
    private static boolean isSuccessfulResponse(int responseCode) {
        return responseCode >= 200 && responseCode < 300;
    }

    /**
     * 处理错误响应
     */
    private static void handleErrorResponse(HttpURLConnection connection, int responseCode) throws IOException {
        String errorResponse = readErrorResponse(connection);
        String errorMsg = "证书请求失败，状态码: " + responseCode + ", 响应: " + errorResponse;
        throw new IOException(errorMsg);
    }

    /**
     * 从响应中提取证书
     */
    private static String extractCertificateFromResponse(HttpURLConnection connection) throws IOException {
        String responseBody = readResponseBody(connection);
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> responseJson = mapper.readValue(
                responseBody,
                new TypeReference<HashMap<String, Object>>() {
                }
        );

        validateResponse(responseJson);

        if (responseJson.containsKey("Certificate")) {
            return (String) responseJson.get("Certificate");
        } else {
            throw new IOException("响应中未找到Certificate字段");
        }
    }

    /**
     * 验证响应数据
     */
    private static void validateResponse(Map<String, Object> responseJson) throws IOException {
        if (responseJson.containsKey("error")) {
            Object error = responseJson.get("error");
            String errorMsg = "获取证书失败: " + error;
            throw new IOException(errorMsg);
        }
    }

    /**
     * 保存证书到本地缓存
     */
    public static void saveCertificateLocally(String ep, String certificate) throws IOException {
        try {
            String certStoragePath = getCertStoragePath();
            String certFilePath = certStoragePath + File.separator + ep + ".pem";

            File storageDir = new File(certStoragePath);
            if (!storageDir.exists()) {
                if (!storageDir.mkdirs()) {
                    String errMsg = "创建证书存储目录失败: " + certStoragePath;
                    throw new IOException(errMsg);
                }
            }

            java.nio.file.Files.write(
                    Paths.get(certFilePath),
                    certificate.getBytes(StandardCharsets.UTF_8)
            );

        } catch (Exception e) {
            String errMsg = "保存证书到本地失败: " + e.getMessage();
            throw new IOException(errMsg, e);
        }
    }

    /**
     * 获取证书存储路径
     */
    public static String getCertStoragePath() {
        String userHome = System.getProperty("user.home");
        return userHome + File.separator + ".ark" + File.separator + "certificates";
    }

    /**
     * 缓存服务端证书信息
     */
    public static void cacheServerCertificate(String cacheKey, PublicKey publicKey, String ringId, String keyId) {
        certificateCache.put(cacheKey, new ServerCertificateInfo(publicKey, ringId, keyId));
    }

    /**
     * 从PEM格式的X.509证书中提取公钥
     */
    public static PublicKey extractPublicKeyFromCertificate(String certificate) throws GeneralSecurityException {
        try {
            String certContent = certificate.replace("-----BEGIN CERTIFICATE-----", "")
                    .replace("-----END CERTIFICATE-----", "")
                    .replaceAll("\\s", "");

            byte[] certBytes = Base64.getDecoder().decode(certContent);

            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
            X509Certificate x509Cert = (X509Certificate) certFactory.generateCertificate(
                    new java.io.ByteArrayInputStream(certBytes));

            return x509Cert.getPublicKey();
        } catch (Exception e) {
            throw new GeneralSecurityException("Failed to extract public key from certificate", e);
        }
    }

    /**
     * 创建证书信息对象并缓存
     */
    public static ServerCertificateInfo createCertificateInfo(String certificate, String ep) throws IOException {
        try {
            String[] result = getCertInfo(certificate);
            String ringId = result[0];
            String keyId = result[1];

            java.security.PublicKey publicKey = extractPublicKeyFromCertificate(certificate);

            ServerCertificateInfo certInfo =
                    new ServerCertificateInfo(publicKey, ringId, keyId);

            cacheServerCertificate(ep, publicKey, ringId, keyId);

            return certInfo;

        } catch (GeneralSecurityException e) {
            String errMsg = "Failed to extract public key from certificate: " + e.getMessage();
            throw new IOException(errMsg, e);
        } catch (Exception e) {
            String errMsg = "Failed to create certificate info: " + e.getMessage();
            throw new IOException(errMsg, e);
        }
    }

    /**
     * 读取HTTP响应体
     */
    public static String readResponseBody(HttpURLConnection connection) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }

    /**
     * 读取HTTP错误响应体
     */
    public static String readErrorResponse(HttpURLConnection connection) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getErrorStream(), StandardCharsets.UTF_8))) {
            StringBuilder errorResponse = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                errorResponse.append(line);
            }
            return errorResponse.toString();
        }
    }
}