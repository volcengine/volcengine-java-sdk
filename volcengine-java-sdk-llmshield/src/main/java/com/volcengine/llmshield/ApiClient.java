package com.volcengine.llmshield;

import com.volcengine.llmshield.aicc.Client;
import com.volcengine.llmshield.aicc.ClientConfig;
import com.volcengine.llmshield.aicc.EncryptResult;
import com.volcengine.llmshield.aicc.ResponseKey;
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
import org.apache.hc.client5.http.impl.DefaultHttpRequestRetryStrategy;
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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

// 客户端类
public class ApiClient {
    // 客户端初始化选项 Key
    public static final String OPTION_ENABLE_AICC = "EnableAicc";
    public static final String OPTION_LOG_LEVEL = "LogLevel";
    public static final String OPTION_PROXY_ADDR = "ProxyAddr";
    public static final String OPTION_CONN_MAX = "ConnMax";
    public static final String OPTION_TIMEOUT = "Timeout";

    private static final String CONTENT_TYPE_HEADER = "application/json";
    private static final long FIVE_MINUTES_MS = 5 * 60 * 1000;

    // ObjectMapper 是线程安全的，作为静态单例复用
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    // 单线程超时调度器，全局共享，资源消耗极小（1个守护线程，wait状态几乎不占CPU）
    // 用于硬超时控制，调度精度通常在 1-5ms，满足 10ms 误差要求
    private static final ScheduledExecutorService TIMEOUT_SCHEDULER =
            new ScheduledThreadPoolExecutor(1, new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r, "api-client-timeout-scheduler");
                    t.setDaemon(true);
                    return t;
                }
            });

    private final String url;
    private final String ak;
    private final String sk;
    private final String region;
    private final long timeout;
    private final CloseableHttpClient httpClient;

    private Client aiccClient;

    private ApiClient(String url, String ak, String sk, String region, long timeout) {
        this.url = url;
        this.ak = ak;
        this.sk = sk;
        this.region = region;
        this.timeout = timeout;

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(Timeout.ofMilliseconds(timeout))
                .setResponseTimeout(Timeout.ofMilliseconds(timeout))
                .setConnectionRequestTimeout(Timeout.ofMilliseconds(timeout))
                .build();

        long connTtl = Math.min(timeout * 50, FIVE_MINUTES_MS);
        ConnectionConfig connectionConfig = ConnectionConfig.custom()
                .setTimeToLive(TimeValue.ofMilliseconds(connTtl))
                .setSocketTimeout(Timeout.ofMilliseconds(timeout))
                .build();
        PoolingHttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
                .setDefaultConnectionConfig(connectionConfig)
                .setValidateAfterInactivity(TimeValue.ofSeconds(30))
                .build();
        // 禁用所有重试：POST是非幂等请求，任何重试都可能导致重复提交
        // 即使是连接阶段失败也不重试，由上层业务决定是否重试
        this.httpClient = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig)
                .setRetryStrategy(new DefaultHttpRequestRetryStrategy(0, TimeValue.ZERO_MILLISECONDS))
                .evictIdleConnections(TimeValue.ofMinutes(1))
                .evictExpiredConnections()
                .build();
    }

    private ApiClient(String url, String ak, String sk, String region, long timeout, String proxy, int connMax) throws MalformedURLException {
        this.url = url;
        this.ak = ak;
        this.sk = sk;
        this.region = region;
        this.timeout = timeout;

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(Timeout.ofMilliseconds(timeout))
                .setResponseTimeout(Timeout.ofMilliseconds(timeout))
                .setConnectionRequestTimeout(Timeout.ofMilliseconds(timeout))
                .build();

        long connTtl = Math.min(timeout * 50, FIVE_MINUTES_MS);
        ConnectionConfig connectionConfig = ConnectionConfig.custom()
                .setTimeToLive(TimeValue.ofMilliseconds(connTtl))
                .setSocketTimeout(Timeout.ofMilliseconds(timeout))
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

        // 禁用所有重试：POST是非幂等请求，任何重试都可能导致重复提交
        // 即使是连接阶段失败也不重试，由上层业务决定是否重试
        this.httpClient = builder
                .setRetryStrategy(new DefaultHttpRequestRetryStrategy(0, TimeValue.ZERO_MILLISECONDS))
                .build();
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
     * 创建新的客户端实例（带 JSON 配置，支持代理、连接数、超时、AICC 等配置）
     * <p>
     * 参考 Go SDK NewWithOptions 实现，jsonConfig 支持以下字段：
     * <ul>
     *   <li>EnableAicc (Boolean): 是否启用 AICC 加密能力</li>
     *   <li>LogLevel (String): AICC 日志级别，默认为 "ERROR"</li>
     *   <li>ProxyAddr (String): 代理地址，如 "http://proxy.example.com:8080"</li>
     *   <li>ConnMax (Integer): 最大连接数，设置后会同时设置 MaxConnTotal 和 MaxConnPerRoute</li>
     *   <li>Timeout (Long): HTTP 客户端超时时间（毫秒），默认为 0（不超时）</li>
     * </ul>
     *
     * @param url        API 请求的基础 URL
     * @param ak         访问密钥
     * @param sk         密钥
     * @param region     区域
     * @param jsonConfig JSON 配置字符串，支持 EnableAicc、LogLevel、ProxyAddr、ConnMax、Timeout 字段
     * @return 客户端实例
     * @throws Exception 如果 JSON 解析失败或 AICC 初始化失败
     */
    public static ApiClient New(String url, String ak, String sk, String region, String jsonConfig) throws Exception {
        // 解析 jsonConfig，所有配置项从 jsonConfig 读取
        Map<String, Object> config = null;
        if (jsonConfig != null && !jsonConfig.isEmpty()) {
            config = OBJECT_MAPPER.readValue(jsonConfig, Map.class);
        }

        // 1. 配置代理
        String proxy = null;
        if (config != null && config.containsKey(OPTION_PROXY_ADDR)) {
            Object proxyAddr = config.get(OPTION_PROXY_ADDR);
            if (proxyAddr instanceof String && !((String) proxyAddr).isEmpty()) {
                proxy = (String) proxyAddr;
            }
        }

        // 2. 配置最大连接数
        int connMax = 0;
        if (config != null && config.containsKey(OPTION_CONN_MAX)) {
            Object connMaxVal = config.get(OPTION_CONN_MAX);
            if (connMaxVal instanceof Number) {
                int val = ((Number) connMaxVal).intValue();
                if (val > 0) {
                    connMax = val;
                }
            }
        }

        // 3. 配置超时时间，默认为 0（不超时），与 Go SDK 对齐
        long timeout = 0;
        if (config != null && config.containsKey(OPTION_TIMEOUT)) {
            Object timeoutVal = config.get(OPTION_TIMEOUT);
            if (timeoutVal instanceof Number) {
                timeout = ((Number) timeoutVal).longValue();
            }
        }

        // 创建客户端实例
        ApiClient client = new ApiClient(url, ak, sk, region, timeout, proxy, connMax);

        // 4. 配置 AICC
        if (config != null && Boolean.TRUE.equals(config.get(OPTION_ENABLE_AICC))) {
            String logLevel = "ERROR";
            if (config.containsKey(OPTION_LOG_LEVEL)) {
                Object ll = config.get(OPTION_LOG_LEVEL);
                if (ll instanceof String && !((String) ll).isEmpty()) {
                    logLevel = (String) ll;
                }
            }
            System.setProperty("LOG_LEVEL", logLevel);
            try {
                client.SetAiccInit();
            } catch (Exception e) {
                // AICC 初始化失败，关闭已创建的 httpClient 资源，避免泄漏
                try {
                    client.Close();
                } catch (IOException closeEx) {
                    // 忽略关闭异常，优先抛出原始的 AICC 初始化异常
                }
                throw new Exception("AICC模块初始化失败: " + e.getMessage(), e);
            }
        }

        return client;
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
     * 响应处理接口，允许抛出受检异常（Java 7 兼容，不使用 lambda）
     */
    private interface ResponseHandler<T> {
        T apply(CloseableHttpResponse response) throws Exception;
    }

    /**
     * 带硬超时控制的 HTTP 请求执行方法
     * <p>
     * 实现原理：
     * 1. 使用单线程 ScheduledExecutorService 调度超时任务（调度精度 1-5ms）
     * 2. 超时后调用 httpPost.abort() 中止请求，确保连接释放
     * 3. 使用 AtomicBoolean 保证状态竞态安全（正常完成 vs 超时触发）
     * 4. 底层 Apache 超时配置作为第一道防线，硬超时作为最后防线
     *
     * @param httpPost HTTP POST 请求对象
     * @param handler  响应处理器
     * @param <T>      返回值类型
     * @return 处理后的响应结果
     * @throws Exception 如果请求超时或发生其他错误
     */
    private <T> T executeWithHardTimeout(HttpPost httpPost, ResponseHandler<T> handler) throws Exception {
        // 未设置超时，直接执行
        if (this.timeout <= 0) {
            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                return handler.apply(response);
            }
        }

        final AtomicBoolean completed = new AtomicBoolean(false);
        final long timeoutMs = this.timeout;

        // 调度超时任务：提前3ms调度以抵消ScheduledExecutorService的调度延迟（通常1-3ms）
        // 确保实际中止时间在 timeoutMs ± 2ms 范围内，满足10ms精度要求
        long scheduleDelay = Math.max(1, timeoutMs - 3);
        final HttpPost finalHttpPost = httpPost;
        java.util.concurrent.ScheduledFuture<?> timeoutFuture = TIMEOUT_SCHEDULER.schedule(new Runnable() {
            @Override
            public void run() {
                if (completed.compareAndSet(false, true)) {
                    finalHttpPost.abort();
                }
            }
        }, scheduleDelay, TimeUnit.MILLISECONDS);

        try {
            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                T result = handler.apply(response);
                // 正常完成，取消超时任务
                if (completed.compareAndSet(false, true)) {
                    timeoutFuture.cancel(false);
                }
                return result;
            }
        } catch (Exception e) {
            // 异常路径也需要标记完成并取消超时任务
            if (completed.compareAndSet(false, true)) {
                timeoutFuture.cancel(false);
            }
            // 如果是 abort 导致的异常，包装成 TimeoutException
            if (isAbortException(e)) {
                throw new TimeoutException("Request timed out after " + timeoutMs + "ms");
            }
            throw e;
        }
    }

    /**
     * 判断异常是否由请求 abort 导致
     */
    private boolean isAbortException(Exception e) {
        String msg = e.getMessage();
        if (msg != null && msg.contains("Request aborted")) {
            return true;
        }
        if (e instanceof org.apache.hc.core5.http.ConnectionClosedException) {
            return true;
        }
        Throwable cause = e.getCause();
        if (cause != null) {
            String causeMsg = cause.getMessage();
            return causeMsg != null && causeMsg.contains("Request aborted");
        }
        return false;
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
        /**
        * System.out.printf("AiccList %s, %s, %s, %s, %s%n",
                conf.getPccUrl(), conf.getAccID(), conf.getServerID(), conf.getServerName(), conf.getTrnInfo());
        */

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

        // 同步执行一次远程证明，确保sessionKey初始化完成
        try {
            this.aiccClient.attestServer();
        } catch (Exception e) {
            System.err.println("AICC远程证明失败: " + e.getMessage());
            // 远程证明失败，关闭已创建的 aiccClient 资源
            this.aiccClient.close();
            this.aiccClient = null;
            throw e;
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

        // 先设置明文body用于签名（签名必须基于明文，与Python版本对齐）
        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));

        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri, "Moderate", ak, sk, region);

        // 签名完成后，再加密body（AICC模式下发送加密body）
        ResponseKey encReqKey = null;
        if (this.aiccClient != null) {
            EncryptResult encryptResult = EncryptWithResponse(requestBody.getBytes(StandardCharsets.UTF_8));
            requestBody = encryptResult.ciphertext;
            encReqKey = encryptResult.responseKey;
            httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));
        }

        final ResponseKey finalEncReqKey = encReqKey;
        return executeWithHardTimeout(httpPost, new ResponseHandler<ModerateV2Response>() {
            @Override
            public ModerateV2Response apply(CloseableHttpResponse response) throws Exception {
                int statusCode = response.getCode();
                byte[] responseBodyBytes = EntityUtils.toByteArray(response.getEntity());

                // 先解密响应体（AICC模式下响应体是加密的，包括错误响应）
                if (finalEncReqKey != null) {
                    responseBodyBytes = DecryptResponse(finalEncReqKey, responseBodyBytes);
                }
                String responseBody = new String(responseBodyBytes, StandardCharsets.UTF_8);

                if (statusCode != 200) {
                    throw new IOException("HTTP request failed with status code: " + statusCode + ", response: " + responseBody);
                }

                return OBJECT_MAPPER.readValue(responseBody, ModerateV2Response.class);
            }
        });
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

        final ModerateV2StreamSession finalSession = session;
        return executeWithHardTimeout(httpPost, new ResponseHandler<ModerateV2Response>() {
            @Override
            public ModerateV2Response apply(CloseableHttpResponse response) throws Exception {
                int statusCode = response.getCode();
                String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
                if (statusCode != 200) {
                    throw new IOException("HTTP request failed with status code: " + statusCode + ", response: " + responseBody);
                }
                ModerateV2Response moderateResponse = OBJECT_MAPPER.readValue(responseBody, ModerateV2Response.class);
                finalSession.setDefaultOut(moderateResponse);
                finalSession.setStreamSendLen(0);
                return moderateResponse;
            }
        });
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
