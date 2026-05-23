package com.volcengine.llmshield;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.core5.http.ClassicHttpResponse;
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

// 客户端类

public class ApiClient {
    private final String CONTENT_TYPE_HEADER = "application/json";
    private final String url;
    private final String ak;
    private final String sk;
    private final String region;
    private CloseableHttpClient httpClient;

    private static final long FIVE_MINUTES_MS = 5 * 60 * 1000;

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
                .build();
        this.httpClient = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig)
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
                .setDefaultConnectionConfig(connectionConfig);
        if (connMax > 0) {
            cmBuilder.setMaxConnTotal(connMax).setMaxConnPerRoute(connMax);
        }
        PoolingHttpClientConnectionManager connectionManager = cmBuilder.build();

        HttpClientBuilder builder = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig);
        if (proxy != null && !proxy.isEmpty()) {
            try {
                URL purl = new URL(proxy);
                String p_protocol = purl.getProtocol(); // 协议（http/https 等）
                String p_host = purl.getHost();         // 主机名（域名或 IP）
                int p_port = purl.getPort();            // 显式指定的端口号
                if (p_port < 0) {
                    p_port = purl.getDefaultPort();// 协议默认端口
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
        return new ApiClient(url, ak,sk,region, timeout);
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
     * 关闭客户端
     * @throws IOException 如果关闭时发生 IO 异常
     */
    public void Close() throws IOException {
        try {
            this.httpClient.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 设置环境
     * @param IsDev 是否为dev环境
     */
    public void SetServiceDev(boolean IsDev)  {
        Sign.setServiceDev(IsDev);
    }

    /**
     * 设置环境
     * @return 返回运行环境信息
     */
    public String GetServiceCode()  {
        return Sign.getServiceCode();
    }

    /**
     * 多模态、多轮对话审核
     *
     * @param request 审核请求对象
     * @return 审核响应对象
     * @throws IOException              网络请求或解析响应时发生错误
     * @throws IllegalArgumentException 当传入的 request.getUseStream()为0，或 session 参数为 null 时，会抛出此异常。
     */
    public ModerateV2Response Moderate(ModerateV2Request request) throws Exception {
        if (request == null) {

            request = new ModerateV2Request();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String requestBody = objectMapper.writeValueAsString(request);

        URIBuilder uriBuilder = new URIBuilder(url +"/v2/moderate");
        uriBuilder.addParameter("Action", "Moderate");
        uriBuilder.addParameter("Version", "2025-08-31"); // 支持多个参数
        URI uri = uriBuilder.build();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", CONTENT_TYPE_HEADER);

        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));
        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri , "Moderate" , ak , sk , region);
        ClassicHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getCode();
            if (statusCode != 200) {
//                throw new IOException("bad response code: " + statusCode);
            }
            String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
            ModerateV2Response moderateResponse = objectMapper.readValue(responseBody, ModerateV2Response.class);
            return moderateResponse;
        } finally {
            EntityUtils.consumeQuietly(response.getEntity());
        }
    }

    public ModerateV2Response ModerateStream(ModerateV2Request request, ModerateV2StreamSession session) throws Exception {
        if (request == null) {

            request = new ModerateV2Request();
        }
        // 本接口不支持非流式调用
        if (request.getUseStream() == 0 || session == null) {
            throw new IllegalArgumentException("useStream cannot 0 ,session cannot null");
        }

        if (session.getRequest() == null) {
            session.setRequest(new ModerateV2Request(request));
        } else {
            session.appendRequestContent(request);
            if ( session.getStreamSendLen() >= session.getCurrentSendWindow() ||  session.getRequest().getUseStream() == 2 ) {
                session.growSendWindow();
            }else {
                return session.getDefaultOut();
            }
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String requestBody = objectMapper.writeValueAsString(session.getRequest());

        URIBuilder uriBuilder = new URIBuilder(url +"/v2/moderate");
        uriBuilder.addParameter("Action", "Moderate");
        uriBuilder.addParameter("Version", "2025-08-31"); // 支持多个参数
        URI uri = uriBuilder.build();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", CONTENT_TYPE_HEADER);

        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));
        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri , "Moderate" , ak , sk , region);
        ClassicHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getCode();
            if (statusCode != 200) {
//                throw new IOException("bad response code: " + statusCode);
            }
            String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
            ObjectMapper objectMapperresp = new ObjectMapper();
            ModerateV2Response moderateResponse = objectMapperresp.readValue(responseBody, ModerateV2Response.class);

            session.setDefaultOut(moderateResponse);
            session.setStreamSendLen(0);
//            if(session.getRequest().getUseStream() == 2 ){
//                System.out.println("最终检测内容: "+session.getRequest().getMessage().getContent());
//            }

            return moderateResponse;
        } finally {
            EntityUtils.consumeQuietly(response.getEntity());
        }
    }

    public GenerateStreamV2Response GenerateV2Stream(GenerateStreamV2Request request) throws Exception {
        if (request == null) {
            request = new GenerateStreamV2Request();
        }
        // 创建 ObjectMapper 用于 JSON 序列化
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 将请求对象序列化为 JSON 字符串
        String requestBody = objectMapper.writeValueAsString(request);
        URIBuilder uriBuilder = new URIBuilder(url +"/v2/generate");
        uriBuilder.addParameter("Action", "Generate");
        uriBuilder.addParameter("Version", "2025-08-31"); // 支持多个参数
        URI uri = uriBuilder.build();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setHeader("Content-Type", CONTENT_TYPE_HEADER);

        httpPost.setEntity(new StringEntity(requestBody, StandardCharsets.UTF_8));
        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri , "Generate" , ak , sk , region);
        ClassicHttpResponse response = httpClient.execute(httpPost);
        int statusCode = response.getCode();

        if (statusCode != 200) {
            EntityUtils.consumeQuietly(response.getEntity());
//            throw new Exception("Bad response code: " + statusCode);
            return new GenerateStreamV2Response(response.getEntity().getContent());
        } else {
            return new GenerateStreamV2Response(response.getEntity().getContent());
        }
    }

}
