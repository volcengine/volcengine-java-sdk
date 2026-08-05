package com.volcengine.llmshield;

import com.volcengine.llmshield.aicc.Client;
import com.volcengine.llmshield.aicc.ClientConfig;
import com.volcengine.llmshield.aicc.EncryptResult;
import com.volcengine.llmshield.aicc.ResponseKey;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import okio.Buffer;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
    // 故意使用 null 作为 RequestBody 的 MediaType：
    // 1) Volcengine 签名（Sign.DoSignRequest）依赖请求头 Content-Type 与实际字节序列化一致；
    // 2) 若传入形如 "application/json" 的 MediaType，OkHttp 会在某些重载里追加 "; charset=utf-8"，
    //    导致最终 Content-Type 与签名时的头不一致，从而被服务端拒签；
    // 3) 因此这里保持 null，然后由下方 `.addHeader("Content-Type", CONTENT_TYPE_HEADER)` 手动设置。
    private static final MediaType JSON_MEDIA_TYPE = null;

    // ObjectMapper 是线程安全的，作为静态单例复用
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final String url;
    private final String ak;
    private final String sk;
    private final String region;
    private final long timeout;
    private final OkHttpClient httpClient;
    private final OkHttpClient streamingHttpClient;  // 流式请求专用，无 callTimeout

    private Client aiccClient;

    private ApiClient(String url, String ak, String sk, String region, long timeout) {
        this.url = url;
        this.ak = ak;
        this.sk = sk;
        this.region = region;
        this.timeout = timeout;

        this.httpClient = buildHttpClient(timeout, null, 0, true);
        this.streamingHttpClient = buildHttpClient(timeout, null, 0, false);
    }

    /**
     * 构建 OkHttp 客户端。
     *
     * @param timeout          各阶段超时（毫秒），0 表示不超时
     * @param proxy            代理地址（如 http://127.0.0.1:8080，无代理传 null）
     * @param connMax          最大空闲连接数（<=0 时使用默认值 5）
     * @param withCallTimeout  是否启用 callTimeout / readTimeout / writeTimeout：
     *                         - true：普通请求，所有阶段超时统一为 timeout
     *                         - false：流式请求，read/write/callTimeout 均置 0，
     *                                  避免服务端两个 chunk 之间的思考空档（SSE / TTFT + token 生成间隔）
     *                                  被读超时中断
     */
    private OkHttpClient buildHttpClient(long timeout, String proxy, int connMax, boolean withCallTimeout) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        if (timeout < 0) {
            throw new IllegalArgumentException("Timeout must be >= 0");
        }
        // 建连超时始终受 timeout 约束；对流式接口而言，建连快慢本身不受 chunk 间隔影响。
        builder.connectTimeout(timeout, TimeUnit.MILLISECONDS);
        if (withCallTimeout) {
            // 普通请求：写、读、端到端超时全部统一到 timeout
            builder.writeTimeout(timeout, TimeUnit.MILLISECONDS)
                   .readTimeout(timeout, TimeUnit.MILLISECONDS)
                   .callTimeout(timeout, TimeUnit.MILLISECONDS);
        } else {
            // 流式请求：仅保留 connectTimeout，其余置 0（无限），避免长流被中断
            builder.writeTimeout(0, TimeUnit.MILLISECONDS)
                   .readTimeout(0, TimeUnit.MILLISECONDS)
                   .callTimeout(0, TimeUnit.MILLISECONDS);
        }

        // 连接池配置
        // timeout<=0 表示"不超时"，此时不应推导出 0/负数 keepAliveDuration，避免 ConnectionPool 构造器抛异常。
        if (timeout > 0) {
            long connTtl = Math.min(timeout * 50, FIVE_MINUTES_MS);
            int maxIdleConns = (connMax > 0) ? connMax : 5;
            builder.connectionPool(new ConnectionPool(maxIdleConns, connTtl, TimeUnit.MILLISECONDS));
        }

        // 禁用所有重试：POST 是非幂等请求，任何重试都可能导致重复提交
        builder.retryOnConnectionFailure(false);

        // 代理配置
        if (proxy != null && !proxy.isEmpty()) {
            try {
                URL purl = new URL(proxy);
                int port = purl.getPort() < 0 ? purl.getDefaultPort() : purl.getPort();
                builder.proxy(new Proxy(Proxy.Type.HTTP,
                        new InetSocketAddress(purl.getHost(), port)));
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException("Invalid Proxy Info：" + proxy, e);
            }
        }

        return builder.build();
    }

    private ApiClient(String url, String ak, String sk, String region, long timeout, String proxy, int connMax) throws MalformedURLException {
        this.url = url;
        this.ak = ak;
        this.sk = sk;
        this.region = region;
        this.timeout = timeout;

        this.httpClient = buildHttpClient(timeout, proxy, connMax, true);
        this.streamingHttpClient = buildHttpClient(timeout, proxy, connMax, false);
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
            this.httpClient.connectionPool().evictAll();
            this.httpClient.dispatcher().executorService().shutdown();
        }
        if (this.streamingHttpClient != null) {
            this.streamingHttpClient.connectionPool().evictAll();
            this.streamingHttpClient.dispatcher().executorService().shutdown();
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
        T apply(Response response) throws Exception;
    }

    private long elapsedMillis(long startNs) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs);
    }

    private long resolveRemainingTimeoutMs(long totalStartNs) throws TimeoutException {
        long effectiveTimeoutMs = timeout;
        if (effectiveTimeoutMs <= 0) {
            return effectiveTimeoutMs;
        }

        long elapsedMs = elapsedMillis(totalStartNs);
        long remainingMs = effectiveTimeoutMs - elapsedMs;
        if (remainingMs <= 0) {
            throw new TimeoutException("Request timed out before HTTP dispatch after " + elapsedMs + "ms");
        }
        return remainingMs;
    }

    /**
     * 执行 HTTP 请求（使用 OkHttp 3.x 原生 callTimeout 实现端到端超时）
     *
     * @param request OkHttp Request 对象
     * @param handler 响应处理器
     * @param <T>     返回值类型
     * @return 处理后的响应结果
     * @throws Exception 如果请求超时或发生其他错误
     */
    private <T> T execute(Request request, ResponseHandler<T> handler) throws Exception {
        return execute(request, handler, System.nanoTime());
    }

    /**
     * 执行 HTTP 请求（使用 OkHttp 3.x 原生 callTimeout 实现端到端超时）
     *
     * @param request      OkHttp Request 对象
     * @param handler      响应处理器
     * @param totalStartNs 整体调用起始时间，用于扣减 HTTP 发起前已消耗的预算
     * @param <T>          返回值类型
     * @return 处理后的响应结果
     * @throws Exception 如果请求超时或发生其他错误
     */
    private <T> T execute(Request request, ResponseHandler<T> handler, long totalStartNs) throws Exception {
        long remainingTimeoutMs = resolveRemainingTimeoutMs(totalStartNs);
        Call call = httpClient.newCall(request);
        if (remainingTimeoutMs > 0) {
            call.timeout().timeout(remainingTimeoutMs, TimeUnit.MILLISECONDS);
        }

        try (Response response = call.execute()) {
            return handler.apply(response);
        } catch (java.io.InterruptedIOException e) {
            long elapsedMs = elapsedMillis(totalStartNs);
            TimeoutException te = new TimeoutException(timeout > 0
                    ? "Request timed out after " + elapsedMs + "ms"
                    : "Request was interrupted after " + elapsedMs + "ms");
            te.initCause(e);
            throw te;
        }
    }


    /**
     * 构建带查询参数的 URL
     */
    private String buildUrl(String path, String action, String version) {
        return url + path + "?Action=" + action + "&Version=" + version;
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

        String fullUrl = buildUrl(path, action, version);
        URI uri = URI.create(fullUrl);

        RequestBody body = RequestBody.create(JSON_MEDIA_TYPE, requestBody);
        Request httpRequest = new Request.Builder()
                .url(fullUrl)
                .post(body)
                .addHeader("Content-Type", CONTENT_TYPE_HEADER)
                .build();

        Sign sign = new Sign();
        Request signedRequest = sign.DoSignRequest(httpRequest, uri, action, ak, sk, region);

        try (Response response = httpClient.newCall(signedRequest).execute()) {
            int statusCode = response.code();
            String responseBody = response.body().string();
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
        long totalStartNs = System.nanoTime();
        if (request == null) {
            request = new ModerateV2Request();
        }

        String requestBody = OBJECT_MAPPER.writeValueAsString(request);

        String fullUrl = buildUrl("/v2/moderate", "Moderate", "2025-08-31");
        URI uri = URI.create(fullUrl);

        // 先构建明文 Request 用于签名（签名必须基于明文，与Python版本对齐）
        RequestBody plainBody = RequestBody.create(JSON_MEDIA_TYPE, requestBody);
        Request plainRequest = new Request.Builder()
                .url(fullUrl)
                .post(plainBody)
                .addHeader("Content-Type", CONTENT_TYPE_HEADER)
                .build();

        Sign sign = new Sign();
        Request signedRequest = sign.DoSignRequest(plainRequest, uri, "Moderate", ak, sk, region);

        // 签名完成后，再加密body（AICC模式下发送加密body）
        ResponseKey encReqKey = null;
        if (this.aiccClient != null) {
            EncryptResult encryptResult = EncryptWithResponse(requestBody.getBytes(StandardCharsets.UTF_8));
            requestBody = encryptResult.ciphertext;
            encReqKey = encryptResult.responseKey;
            // 加密后重新构建 Request，保留签名头
            RequestBody encryptedBody = RequestBody.create(JSON_MEDIA_TYPE, requestBody);
            signedRequest = signedRequest.newBuilder()
                    .post(encryptedBody)
                    .build();
        }

        final ResponseKey finalEncReqKey = encReqKey;
        return execute(signedRequest, new ResponseHandler<ModerateV2Response>() {
            @Override
            public ModerateV2Response apply(Response response) throws Exception {
                int statusCode = response.code();
                byte[] responseBodyBytes = response.body().bytes();

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
        }, totalStartNs);
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

        String fullUrl = buildUrl("/v2/moderate", "Moderate", "2025-08-31");
        URI uri = URI.create(fullUrl);

        RequestBody body = RequestBody.create(JSON_MEDIA_TYPE, requestBody);
        Request httpRequest = new Request.Builder()
                .url(fullUrl)
                .post(body)
                .addHeader("Content-Type", CONTENT_TYPE_HEADER)
                .build();

        Sign sign = new Sign();
        Request signedRequest = sign.DoSignRequest(httpRequest, uri, "Moderate", ak, sk, region);

        final ModerateV2StreamSession finalSession = session;
        return execute(signedRequest, new ResponseHandler<ModerateV2Response>() {
            @Override
            public ModerateV2Response apply(Response response) throws Exception {
                int statusCode = response.code();
                String responseBody = response.body().string();
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

        String fullUrl = buildUrl("/v2/generate", "Generate", "2025-08-31");
        URI uri = URI.create(fullUrl);

        RequestBody body = RequestBody.create(JSON_MEDIA_TYPE, requestBody);
        Request httpRequest = new Request.Builder()
                .url(fullUrl)
                .post(body)
                .addHeader("Content-Type", CONTENT_TYPE_HEADER)
                .build();

        Sign sign = new Sign();
        Request signedRequest = sign.DoSignRequest(httpRequest, uri, "Generate", ak, sk, region);

        // 流式请求使用无 callTimeout 的专用客户端，避免长连接被中断
        Response response = streamingHttpClient.newCall(signedRequest).execute();
        try {
            int statusCode = response.code();
            ResponseBody rb = response.body();

            if (statusCode != 200) {
                String responseBody = rb == null ? "" : rb.string();
                throw new IOException("HTTP request failed with status code: " + statusCode + ", response: " + responseBody);
            }

            // 注意：response 需要传递给调用者，正常返回路径不关闭
            // 调用者必须通过 GenerateStreamV2Response.close() 来释放资源
            if (rb == null) {
                throw new IOException("Response body is null");
            }
            return new GenerateStreamV2Response(rb.byteStream(), response);
        } catch (Exception e) {
            response.close();
            throw e;
        }
    }
}
