package com.volcengine.llmshield;

import com.bytedance.jeddak_secure_channel.Client;
import com.bytedance.jeddak_secure_channel.ClientConfig;
import com.bytedance.jeddak_secure_channel.EncryptResult;
import com.bytedance.jeddak_secure_channel.ResponseKey;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.util.TimeValue;
import org.apache.hc.core5.util.Timeout;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

// 客户端类
public class ApiClient {
    private static final String CONTENT_TYPE_HEADER = "application/json";
    private static final long FIVE_MINUTES_MS = 5 * 60 * 1000;

    // ObjectMapper 是线程安全的，作为静态单例复用
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String url;
    private final String ak;
    private final String sk;
    private final String region;
    private final CloseableHttpClient httpClient;

    private Client aiccClient;

    private ApiClient(String url, String ak, String sk, String region, long timeout) {
        this.url = url;
        this.ak = ak;
        this.sk = sk;
        this.region = region;

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(Timeout.ofMilliseconds(timeout))
                .setResponseTimeout(Timeout.ofMilliseconds(timeout))
                .setConnectionRequestTimeout(Timeout.ofMilliseconds(timeout))
                .build();

        long connTtl = Math.min(timeout * 50, FIVE_MINUTES_MS);
        ConnectionConfig connectionConfig = ConnectionConfig.custom()
                .setTimeToLive(TimeValue.ofMilliseconds(connTtl))
                .build();
        PoolingHttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
                .setDefaultConnectionConfig(connectionConfig)
                .setValidateAfterInactivity(TimeValue.ofSeconds(30))
                .build();
        this.httpClient = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig)
                .evictIdleConnections(TimeValue.ofMinutes(1))
                .evictExpiredConnections()
                .build();
    }

    private ApiClient(String url, String ak, String sk, String region, long timeout, String proxy, int connMax) throws MalformedURLException {
        this.url = url;
        this.ak = ak;
        this.sk = sk;
        this.region = region;

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(Timeout.ofMilliseconds(timeout))
                .setResponseTimeout(Timeout.ofMilliseconds(timeout))
                .setConnectionRequestTimeout(Timeout.ofMilliseconds(timeout))
                .build();

        long connTtl = Math.min(timeout * 50, FIVE_MINUTES_MS);
        ConnectionConfig connectionConfig = ConnectionConfig.custom()
                .setTimeToLive(TimeValue.ofMilliseconds(connTtl))
                .build();
        PoolingHttpClientConnectionManagerBuilder cmBuilder = PoolingHttpClientConnectionManagerBuilder.create()
                .setDefaultConnectionConfig(connectionConfig)
                .setValidateAfterInactivity(TimeValue.ofSeconds(30));
        if (connMax > 0) {
            cmBuilder.setMaxConnTotal(connMax).setMaxConnPerRoute(connMax);
        }
        PoolingHttpClientConnectionManager connectionManager = cmBuilder.build();

        HttpClientBuilder builder = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig)
                .evictIdleConnections(TimeValue.ofMinutes(1))
                .evictExpiredConnections();
        if (proxy != null && !proxy.isEmpty()) {
            try {
                URL purl = new URL(proxy);
                String p_protocol = purl.getProtocol();
                String p_host = purl.getHost();
                int p_port = purl.getPort();
                if (p_port < 0) {
                    p_port = purl.getDefaultPort();
                }
                HttpHost httpsProxy = new HttpHost(p_protocol, p_host, p_port);
                builder.setProxy(httpsProxy);
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException("Invalid Proxy Info：" + proxy, e);
            }
        }

        this.httpClient = builder.build();
    }

    /**
     * 创建新的客户端实例
     *
     * @param url     API 请求的基础 URL
     * @param ak      访问密钥
     * @param sk      密钥
     * @param region  区域
     * @param timeout 连接超时时间（毫秒）
     * @return 客户端实例
     */
    public static ApiClient New(String url, String ak, String sk, String region, long timeout) {
        return new ApiClient(url, ak, sk, region, timeout);
    }

    /**
     * 创建新的客户端实例
     *
     * @param url     API 请求的基础 URL
     * @param ak      访问密钥
     * @param sk      密钥
     * @param region  区域
     * @param proxy   代理地址（如 http://127.0.0.1:8080，无代理则传 null）
     * @param connMax 最大连接数
     * @param timeout 连接超时时间（毫秒）
     * @return 客户端实例
     * @throws MalformedURLException 如果 URL 格式不正确
     */
    public static ApiClient New(String url, String ak, String sk, String region, long timeout, String proxy, int connMax) throws MalformedURLException {
        return new ApiClient(url, ak, sk, region, timeout, proxy, connMax);
    }

    /**
     * 关闭客户端，释放连接池资源
     *
     * @throws IOException 如果关闭时发生 IO 异常
     */
    public void Close() throws IOException {
        if (this.aiccClient != null) {
            this.aiccClient.close();
        }
        if (this.httpClient != null) {
            this.httpClient.close();
        }
    }

    /**
     * 设置环境
     *
     * @param IsDev 是否为 dev 环境
     */
    public void SetServiceDev(boolean IsDev) {
        Sign.setServiceDev(IsDev);
    }

    /**
     * 获取服务代码
     *
     * @return 返回运行环境信息
     */
    public String GetServiceCode() {
        return Sign.getServiceCode();
    }

    /**
     * 请求 AiccModuleConf 接口，获取 AICC 配置信息
     *
     * @return AICC 模块配置结果
     * @throws Exception 网络请求或解析响应时发生错误
     */
    private AiccModuleConfResult _fetchAiccModuleConf() throws Exception {
        String path = "/ctrl/aicc_module_conf";
        String action = "AiccModuleConf";
        String version = "2025-08-31";

        AiccModuleConfRequest request = new AiccModuleConfRequest(100);
        String requestBody = OBJECT_MAPPER.writeValueAsString(request);

        URIBuilder uriBuilder = new URIBuilder(url + path);
        uriBuilder.addParameter("Action", action);
        uriBuilder.addParameter("Version", version);
        URI uri = uriBuilder.build();

        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", CONTENT_TYPE_HEADER);
        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));

        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri, action, ak, sk, region);

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            int statusCode = response.getCode();
            String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
            if (statusCode != 200) {
                throw new IOException("AiccModuleConf 请求失败，状态码: " + statusCode + ", 响应: " + responseBody);
            }

            AiccModuleConfResponse confResponse = OBJECT_MAPPER.readValue(responseBody, AiccModuleConfResponse.class);
            AiccModuleConfResult result = confResponse.getResult();
            if (result == null) {
                throw new Exception("AiccModuleConf 响应缺少 Result 字段: " + responseBody);
            }

            if (result.getPccUrl() == null || result.getPccUrl().isEmpty()
                    || result.getAccID() == null || result.getAccID().isEmpty()
                    || result.getServerID() == null || result.getServerID().isEmpty()
                    || result.getServerName() == null || result.getServerName().isEmpty()
                    || result.getTrnInfo() == null || result.getTrnInfo().isEmpty()) {
                throw new Exception("AiccModuleConf 响应缺少必要字段: " + result);
            }

            return result;
        }
    }

    /**
     * 初始化 AICC Client
     *
     * 说明：AICC 属于可选能力，为避免引入额外依赖导致 SDK 纯审核场景不可用，
     * 这里采用懒加载方式初始化；外部需要使用 AICC 能力时，请显式调用本方法。
     *
     * @throws Exception 初始化过程中发生错误
     */
    public void SetAiccInit() throws Exception {
        AiccModuleConfResult conf = _fetchAiccModuleConf();
        System.out.printf("AiccList %s, %s, %s, %s, %s%n",
                conf.getPccUrl(), conf.getAccID(), conf.getServerID(), conf.getServerName(), conf.getTrnInfo());

        int aiccRftick = 1800;
        String aiccSeraddr = this.url;

        // 构造 byte_top_info JSON 字符串
        Map<String, String> topInfoMap = new HashMap<>();
        topInfoMap.put("url", conf.getPccUrl());
        topInfoMap.put("url_rewrite", aiccSeraddr);
        topInfoMap.put("ak", this.ak);
        topInfoMap.put("sk", this.sk);
        topInfoMap.put("target_uid", conf.getAccID());
        topInfoMap.put("aicc_saas_trn", "trn:iam::" + conf.getAccID() + ":role/" + conf.getTrnInfo());
        topInfoMap.put("service", "pcc");
        String byteTopInfo = OBJECT_MAPPER.writeValueAsString(topInfoMap);

        // 构造 aiccConf JSON 字符串
        Map<String, Object> aiccConfMap = new HashMap<>();
        aiccConfMap.put("ra_url", aiccSeraddr);
        aiccConfMap.put("attest_interval", (float) aiccRftick);
        aiccConfMap.put("ra_uid", conf.getAccID());
        aiccConfMap.put("ra_policy_id", conf.getServerID());
        aiccConfMap.put("ra_service_name", conf.getServerName());
        aiccConfMap.put("bytedance_top_info", byteTopInfo);
        String aiccConfJson = OBJECT_MAPPER.writeValueAsString(aiccConfMap);

        ClientConfig aiccConf = ClientConfig.fromJson(aiccConfJson);
        this.aiccClient = new Client(aiccConf);
        if (this.aiccClient == null) {
            throw new Exception("AICC客户端初始化失败");
        }
    }

    /**
     * 检查 AICC Client 是否已初始化
     *
     * @return 已初始化的 AICC Client
     * @throws RuntimeException 如果 AICC Client 未初始化
     */
    private Client _requireAiccClient() {
        if (this.aiccClient == null) {
            throw new RuntimeException("AICC Client 未初始化，请先调用 ApiClient.SetAiccInit()");
        }
        return this.aiccClient;
    }

    /**
     * 使用 AICC Client 加密请求数据，返回信封加密字符串
     *
     * @param plaintext 待加密的明文
     * @return 加密后的密文字符串
     */
    public String Encrypt(String plaintext) {
        return _requireAiccClient().encrypt(plaintext);
    }

    /**
     * 使用 AICC Client 加密请求数据，返回信封加密字符串
     *
     * @param plaintext 待加密的明文字节数组
     * @return 加密后的密文字符串
     */
    public String Encrypt(byte[] plaintext) {
        return _requireAiccClient().encrypt(plaintext);
    }

    /**
     * 使用 AICC Client 加密请求数据，并返回用于解密响应的 ResponseKey
     *
     * @param plaintext 待加密的明文
     * @return 加密结果，包含密文和用于解密响应的 ResponseKey
     */
    public EncryptResult EncryptWithResponse(String plaintext) {
        return _requireAiccClient().encryptWithResponse(plaintext);
    }

    /**
     * 使用 AICC Client 加密请求数据，并返回用于解密响应的 ResponseKey
     *
     * @param plaintext 待加密的明文字节数组
     * @return 加密结果，包含密文和用于解密响应的 ResponseKey
     */
    public EncryptResult EncryptWithResponse(byte[] plaintext) {
        return _requireAiccClient().encryptWithResponse(plaintext);
    }

    /**
     * 使用 EncryptWithResponse 返回的 responseKey 解密服务端响应
     *
     * @param responseKey 用于解密的密钥
     * @param response    加密的响应字符串
     * @return 解密后的明文字节数组
     */
    public byte[] DecryptResponse(ResponseKey responseKey, String response) {
        if (responseKey == null) {
            throw new IllegalArgumentException("responseKey 不能为空");
        }
        return responseKey.decryptBytes(response).array();
    }

    /**
     * 使用 EncryptWithResponse 返回的 responseKey 解密服务端响应
     *
     * @param responseKey 用于解密的密钥
     * @param response    加密的响应字节数组
     * @return 解密后的明文字节数组
     */
    public byte[] DecryptResponse(ResponseKey responseKey, byte[] response) {
        if (responseKey == null) {
            throw new IllegalArgumentException("responseKey 不能为空");
        }
        return DecryptResponse(responseKey, new String(response, StandardCharsets.UTF_8));
    }

    /**
     * 多模态、多轮对话审核
     *
     * @param request 审核请求对象
     * @return 审核响应对象
     * @throws Exception 网络请求或解析响应时发生错误
     */
    public ModerateV2Response Moderate(ModerateV2Request request) throws Exception {
        if (request == null) {
            request = new ModerateV2Request();
        }

        String requestBody = OBJECT_MAPPER.writeValueAsString(request);

        URIBuilder uriBuilder = new URIBuilder(url + "/v2/moderate");
        uriBuilder.addParameter("Action", "Moderate");
        uriBuilder.addParameter("Version", "2025-08-31");
        URI uri = uriBuilder.build();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", CONTENT_TYPE_HEADER);

        ResponseKey encReqKey = null;
        if (this.aiccClient != null) {
            EncryptResult encryptResult = EncryptWithResponse(requestBody.getBytes(StandardCharsets.UTF_8));
            requestBody = encryptResult.ciphertext;
            encReqKey = encryptResult.responseKey;
        }

        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));

        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri, "Moderate", ak, sk, region);

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            int statusCode = response.getCode();
            byte[] responseBodyBytes = EntityUtils.toByteArray(response.getEntity());

            if (statusCode != 200) {
                String responseBody = new String(responseBodyBytes, StandardCharsets.UTF_8);
                throw new IOException("HTTP request failed with status code: " + statusCode + ", response: " + responseBody);
            }

            String responseBody;
            if (encReqKey != null) {
                responseBodyBytes = DecryptResponse(encReqKey, responseBodyBytes);
            }
            responseBody = new String(responseBodyBytes, StandardCharsets.UTF_8);

            return OBJECT_MAPPER.readValue(responseBody, ModerateV2Response.class);
        }
    }

    /**
     * 流式审核
     *
     * @param request 审核请求对象
     * @param session 流式会话对象
     * @return 审核响应对象
     * @throws Exception 网络请求或解析响应时发生错误
     */
    public ModerateV2Response ModerateStream(ModerateV2Request request, ModerateV2StreamSession session) throws Exception {
        if (request == null) {
            request = new ModerateV2Request();
        }
        // 本接口不支持非流式调用
        if (request.getUseStream() == 0 || session == null) {
            throw new IllegalArgumentException("useStream cannot be 0, session cannot be null");
        }

        if (session.getRequest() == null) {
            session.setRequest(new ModerateV2Request(request));
        } else {
            session.appendRequestContent(request);
            if (session.getStreamSendLen() >= session.getCurrentSendWindow() || session.getRequest().getUseStream() == 2) {
                session.growSendWindow();
            } else {
                return session.getDefaultOut();
            }
        }

        String requestBody = OBJECT_MAPPER.writeValueAsString(session.getRequest());

        URIBuilder uriBuilder = new URIBuilder(url + "/v2/moderate");
        uriBuilder.addParameter("Action", "Moderate");
        uriBuilder.addParameter("Version", "2025-08-31");
        URI uri = uriBuilder.build();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", CONTENT_TYPE_HEADER);
        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));

        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri, "Moderate", ak, sk, region);

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            int statusCode = response.getCode();
            String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
            if (statusCode != 200) {
                throw new IOException("HTTP request failed with status code: " + statusCode + ", response: " + responseBody);
            }
            ModerateV2Response moderateResponse = OBJECT_MAPPER.readValue(responseBody, ModerateV2Response.class);
            session.setDefaultOut(moderateResponse);
            session.setStreamSendLen(0);
            return moderateResponse;
        }
    }

    /**
     * 流式生成接口
     * <p>
     * 注意：使用完 GenerateStreamV2Response 后必须调用 close() 方法释放连接，
     * 建议使用 try-with-resources 方式：
     * <pre>
     * try (GenerateStreamV2Response resp = client.GenerateV2Stream(request)) {
     *     // 读取 resp.getReader()
     * }
     * </pre>
     *
     * @param request 生成请求对象
     * @return 流式响应对象，使用后必须 close
     * @throws Exception 网络请求时发生错误
     */
    public GenerateStreamV2Response GenerateV2Stream(GenerateStreamV2Request request) throws Exception {
        if (request == null) {
            request = new GenerateStreamV2Request();
        }

        String requestBody = OBJECT_MAPPER.writeValueAsString(request);
        URIBuilder uriBuilder = new URIBuilder(url + "/v2/generate");
        uriBuilder.addParameter("Action", "Generate");
        uriBuilder.addParameter("Version", "2025-08-31");
        URI uri = uriBuilder.build();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", CONTENT_TYPE_HEADER);
        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));

        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri, "Generate", ak, sk, region);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getCode();

            if (statusCode != 200) {
                String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
                throw new IOException("HTTP request failed with status code: " + statusCode + ", response: " + responseBody);
            }

            // 注意：response 需要传递给调用者，正常返回路径不关闭
            // 调用者必须通过 GenerateStreamV2Response.close() 来释放资源
            if (response.getEntity() == null) {
                throw new IOException("Response entity is null");
            }
            return new GenerateStreamV2Response(response.getEntity().getContent(), response);
        } catch (Exception e) {
            response.close();
            throw e;
        }
    }
}
