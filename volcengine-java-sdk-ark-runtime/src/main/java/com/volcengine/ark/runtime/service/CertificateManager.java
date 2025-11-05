package com.volcengine.ark.runtime.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.utils.LoggerUtil;
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
    // 证书缓存
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
            System.err.println("Error getting DNS names from extension！");
            throw new RuntimeException("Error getting DNS names from extension:", e);
        }

        return dnsNames;
    }

    /**
     * 检查内存缓存中是否存在证书
     */
    public static boolean hasCertificateInCache(String ep) {
        // 假设有一个静态的ConcurrentHashMap来存储证书缓存
        return certificateCache.containsKey(ep);
    }

    /**
     * 从内存缓存获取证书
     */
    public static ServerCertificateInfo getServerCertificateFromCache(String ep) {
        return certificateCache.get(ep);
    }

    public static ServerCertificateInfo getServerCertificate(String apiKey, String baseUrl, String ep) throws IOException {
        // 首先检查内存缓存，用ep作为key
        if (hasCertificateInCache(ep)) {
            LoggerUtil.debug("从内存缓存加载证书: " + ep);
            return getServerCertificateFromCache(ep);
        }

        try {
            String volcArkEncryption = System.getenv("VOLC_ARK_ENCRYPTION");
            boolean aiccEnabled = "AICC".equals(volcArkEncryption);
            LoggerUtil.debug("isAICCEnabled: " + aiccEnabled);

            String certificate;

            // 1. 首先尝试从本地文件加载证书
            certificate = loadCertificateLocally(ep);
            if (certificate != null) {
                LoggerUtil.debug("从本地缓存加载证书: " + ep);
                return createCertificateInfo(certificate, ep);
            }

            // 2. 检查环境变量指定的证书路径
            String certPath = System.getenv("E2E_CERTIFICATE_PATH");
            if (certPath != null && !certPath.trim().isEmpty()) {
                LoggerUtil.debug("从环境变量路径加载证书: " + certPath);
                certificate = loadCertificateFromPath(certPath);
            }
            // 3. 使用API Key方式获取证书
            else {
                LoggerUtil.debug("使用API Key获取证书: " + ep);
                certificate = loadCertificateByApiKey(baseUrl, apiKey, ep, aiccEnabled);
            }

            // 如果需要，保存证书到本地缓存
            saveCertificateLocally(ep, certificate);

            return createCertificateInfo(certificate, ep);

        } catch (Exception e) {
            System.err.println("Failed to fetch server certificate: " + e.getMessage());
            throw new IOException("Failed to fetch server certificate", e);
        }
    }

    public static String[] getCertInfo(String certPem) {
        try {
            // 使用try-with-resources自动管理PEMParser资源
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
                                String ringId = firstDns.substring(5);  // ring. 5个字符
                                String keyId = secondDns.substring(4);  // key. 4个字符
                                return new String[]{ringId, keyId};
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            // 异常处理
            LoggerUtil.error("Failed to parse certificate to get ring_id and key_id！");
            throw new RuntimeException("Failed to parse certificate to get ring_id and key_id", e);
        }
        return new String[]{"", ""};
    }

    /**
     * 从本地缓存加载证书
     */
    public static String loadCertificateLocally(String ep) {
        try {
            String certStoragePath = getCertStoragePath();
            String certFilePath = certStoragePath + File.separator + ep + ".pem";

            File certFile = new File(certFilePath);

            if (certFile.exists()) {
                // 检查证书是否过期（是否超过14天）
                long lastModifiedSeconds = certFile.lastModified() / 1000;
                long currentTimeSeconds = System.currentTimeMillis() / 1000;
                long timeDifferenceSeconds = currentTimeSeconds - lastModifiedSeconds;
                long certExpirationSeconds = 14L * 24 * 60 * 60; // 14天，以秒为单位
                LoggerUtil.debug("检查本地证书: " + certFilePath);
                LoggerUtil.debug("证书修改时间: " + lastModifiedSeconds + "s, 当前时间: " + currentTimeSeconds + "s, 时间差: " + timeDifferenceSeconds + "s");
                LoggerUtil.debug("certExpirationSeconds:" + certExpirationSeconds);
                if (timeDifferenceSeconds <= certExpirationSeconds) {
                    String certPem = new String(java.nio.file.Files.readAllBytes(certFile.toPath()), StandardCharsets.UTF_8);

                    // 检查证书是否完整（与AICC/PCA兼容性检查）
                    String[] certInfo = getCertInfo(certPem);
                    String ringId = certInfo[0];
                    String keyId = certInfo[1];

                    boolean aiccEnabled = "AICC".equals(System.getenv("VOLC_ARK_ENCRYPTION"));

                    // 1. 非AICC模式：即使ring或key为空也可以接受
                    // 2. AICC模式：ring和key都必须不为空
                    if ((ringId.isEmpty() || keyId.isEmpty()) && !aiccEnabled) {
                        return certPem;
                    }
                    if (!ringId.isEmpty() && !keyId.isEmpty() && aiccEnabled) {
                        return certPem;
                    }
                }

                // 证书过期或不满足条件，删除文件
                if (certFile.delete()) {
                    System.out.println("Deleted expired or invalid certificate: " + certFilePath);
                } else {
                    System.err.println("Failed to delete certificate: " + certFilePath);
                }
            }
        } catch (Exception e) {
            System.err.println("Failed to load local certificate: " + e.getMessage());
        }
        return null;
    }

    /**
     * 从指定路径加载证书文件
     */
    public static String loadCertificateFromPath(String certPath) throws IOException {
        try {

            File certFile = new File(certPath).getCanonicalFile();


            // 文件存在
            if (!certFile.exists() || !certFile.isFile()) {
                throw new IOException("证书文件不存在或不是文件: " + certPath);
            }


            // 文件扩展名检查
            if (!certFile.getName().toLowerCase().endsWith(".crt") &&
                    !certFile.getName().toLowerCase().endsWith(".pem") &&
                    !certFile.getName().toLowerCase().endsWith(".cer")) {
                throw new IOException("不支持的文件类型: " + certPath);
            }
            return new String(java.nio.file.Files.readAllBytes(certFile.toPath()), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new IOException("读取证书文件失败: " + certPath, e);
        }
    }

    /**
     * 使用API Key方式获取证书
     */
    public static String loadCertificateByApiKey(String baseUrl, String apiKey, String ep, boolean aiccEnabled) throws IOException {
        HttpURLConnection connection = null;
        try {
            // 修复URI构建问题
            String certificateUrl;
            if (baseUrl.endsWith("/")) {
                certificateUrl = baseUrl + "e2e/get/certificate";
            } else {
                certificateUrl = baseUrl + "/e2e/get/certificate";
            }

            LoggerUtil.debug("证书请求URL: " + certificateUrl);
            URL url = URI.create(certificateUrl).toURL();
            connection = (HttpURLConnection) url.openConnection();

            // 设置请求头
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("X-Session-Token", "/e2e/get/certificate");

            // 构建请求体
            Map<String, Object> requestBody = new HashMap<>();
            requestBody.put("model", ep);
            if (aiccEnabled) {
                requestBody.put("type", "AICCv0.1");
            }
            ObjectMapper mapper = new ObjectMapper();
            String jsonBody = mapper.writeValueAsString(requestBody);
            LoggerUtil.debug("证书请求体: " + jsonBody);

            // 发送请求
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonBody.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // 处理响应
            int responseCode = connection.getResponseCode();
            LoggerUtil.debug("证书请求响应码: " + responseCode);

            if (responseCode >= 200 && responseCode < 300) {
                String responseBody = readResponseBody(connection);
                LoggerUtil.debug("证书请求响应体: " + responseBody);

                Map<String, Object> responseJson = mapper.readValue(
                        responseBody,
                        new TypeReference<HashMap<String, Object>>() {
                        }
                );

                // 检查错误
                if (responseJson.containsKey("error")) {
                    Object error = responseJson.get("error");
                    String errorMsg = "获取证书失败: " + error;
                    System.err.println(errorMsg);
                    throw new IOException(errorMsg);
                }

                if (responseJson.containsKey("Certificate")) {
                    String certificate = (String) responseJson.get("Certificate");
                    LoggerUtil.debug("成功获取证书，长度: " + certificate.length());
                    return certificate;
                } else {
                    String errorMsg = "响应中未找到Certificate字段";
                    System.err.println(errorMsg);
                    throw new IOException(errorMsg);
                }
            } else {
                String errorResponse = readErrorResponse(connection);
                String errorMsg = "证书请求失败，状态码: " + responseCode + ", 响应: " + errorResponse;
                System.err.println(errorMsg);
                throw new IOException(errorMsg);
            }

        } catch (Exception e) {
            System.err.println("通过API Key获取证书失败: " + e.getMessage());
            if (e instanceof IOException) {
                throw (IOException) e;
            } else {
                throw new IOException("通过API Key获取证书失败", e);
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /**
     * 保存证书到本地缓存
     */
    public static void saveCertificateLocally(String ep, String certificate) {
        try {
            String certStoragePath = getCertStoragePath();
            String certFilePath = certStoragePath + File.separator + ep + ".pem";

            // 确保目录存在
            File storageDir = new File(certStoragePath);
            if (!storageDir.exists()) {
                if (!storageDir.mkdirs()) {
                    System.err.println("创建证书存储目录失败: " + certStoragePath);
                    return;
                }
            }

            // 写入证书文件
            java.nio.file.Files.write(
                    Paths.get(certFilePath),
                    certificate.getBytes(StandardCharsets.UTF_8)
            );
            LoggerUtil.debug("证书已保存到本地: " + certFilePath);

        } catch (Exception e) {
            System.err.println("保存证书到本地失败: " + e.getMessage());
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
     *
     */
    public static PublicKey extractPublicKeyFromCertificate(String certificate) throws GeneralSecurityException {
        try {
            // 移除PEM头尾
            String certContent = certificate.replace("-----BEGIN CERTIFICATE-----", "")
                    .replace("-----END CERTIFICATE-----", "")
                    .replaceAll("\\s", "");

            // 解码Base64
            byte[] certBytes = Base64.getDecoder().decode(certContent);

            // 解析证书
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

//            LoggerUtil.debug("解析证书信息 - ringId: '" + ringId + "', keyId: '" + keyId + "'");

            java.security.PublicKey publicKey = extractPublicKeyFromCertificate(certificate);

            ServerCertificateInfo certInfo =
                    new ServerCertificateInfo(publicKey, ringId, keyId);

            // 缓存到内存
            cacheServerCertificate(ep, publicKey, ringId, keyId);

            return certInfo;

        } catch (GeneralSecurityException e) {
            System.err.println("从证书提取公钥失败: " + e.getMessage());
            throw new IOException("Failed to extract public key from certificate", e);
        } catch (Exception e) {
            System.err.println("创建证书信息失败: " + e.getMessage());
            throw new IOException("Failed to create certificate info", e);
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
