package com.volcengine.llmshield;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


// 客户端类

public class ApiClient {
    private final String CONTENT_TYPE_HEADER = "application/json";


    private final String url;
    private final String ak;
    private final String sk;
    private final String region;
    private HttpClient httpClient;

    private ApiClient(String url, String ak,String sk,String region,  long timeout) {
        this.url = url;
        this.ak = ak;
        this.sk = sk;
        this.region = region;
        this.httpClient = HttpClientBuilder.create()
                .setConnectionTimeToLive(timeout, TimeUnit.MILLISECONDS)
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
    public static ApiClient New(String url, String ak,String sk , String region, long timeout) {
        return new ApiClient(url, ak,sk,region, timeout);
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

        httpPost.setEntity(new StringEntity(requestBody, "UTF-8"));
        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri , "Moderate" , ak , sk , region);
        HttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getStatusLine().getStatusCode();
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

        httpPost.setEntity(new StringEntity(requestBody, "UTF-8"));
        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri , "Moderate" , ak , sk , region);
        HttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getStatusLine().getStatusCode();
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

        httpPost.setEntity(new StringEntity(requestBody, "UTF-8"));
        Sign sign = new Sign();
        sign.DoSignRequest(httpPost, uri , "Generate" , ak , sk , region);
        HttpResponse response = httpClient.execute(httpPost);
        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode != 200) {
            EntityUtils.consumeQuietly(response.getEntity());
//            throw new Exception("Bad response code: " + statusCode);
            return new GenerateStreamV2Response(response.getEntity().getContent());
        } else {
            return new GenerateStreamV2Response(response.getEntity().getContent());
        }
    }

}
