package com.volcengine.ark.runtime.interceptor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.service.CertificateManager;
import com.volcengine.ark.runtime.utils.KeyAgreementUtil;
import com.volcengine.ark.runtime.utils.ResponseDecryptUtil;
import okhttp3.*;
import okio.Buffer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.*;

import static com.volcengine.ark.runtime.service.CertificateManager.getServerCertificate;
import static com.volcengine.ark.runtime.utils.KeyAgreementUtil.*;

/**
 * 加密拦截器 - 处理请求加密和响应解密
 */
public class EncryptionInterceptor implements Interceptor {

    private final String apiKey;
    private final String baseUrl;
    private final ObjectMapper mapper = new ObjectMapper();

    public EncryptionInterceptor(String apiKey, String baseUrl) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    /**
     * 拦截器主入口 - 处理请求加密和响应解密
     */
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        String is_encrypt = request.headers().get("x-is-encrypted");

        if (!"true".equals(is_encrypt)) {
            return chain.proceed(request);
        }

        RequestBody originalBody = request.body();
        if (originalBody == null) {
            return chain.proceed(request);
        }

        Map<String, Object> requestBodyJson = parseRequestBody(originalBody);
        String model = requestBodyJson.get("model").toString();


        return proceedWithEncryption(chain, request, requestBodyJson, model);
    }

    private Response proceedWithEncryption(Chain chain, Request request, Map<String, Object> requestBodyJson, String model) throws IOException {
        CertificateManager.ServerCertificateInfo certInfo = getServerCertificate(this.apiKey, this.baseUrl, model);
        if (certInfo == null) {
            throw new IOException("Failed to get server certificate for encryption");
        }
        SessionData sessionData;
        try {
            sessionData = KeyAgreementUtil.generateEciesKeyPair(certInfo.getPublicKey());
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
        byte[] e2eKey = sessionData.getCryptoKey();
        byte[] e2eNonce = sessionData.getCryptoNonce();
        String sessionToken = sessionData.getSessionToken();
        RequestBody encryptedBody = encryptRequestBody(requestBodyJson, e2eKey, e2eNonce);

        Request.Builder requestBuilder = request.newBuilder()
                .method(request.method(), encryptedBody);

        addAiccEncryptionHeader(requestBuilder, certInfo);

        requestBuilder.addHeader("X-Session-Token", sessionToken);
        Request encryptedRequest = requestBuilder.build();
        Response originalResponse = chain.proceed(encryptedRequest);

        if (!originalResponse.isSuccessful()) {
            return handleErrorResponse(originalResponse);
        }

        return decryptResponse(e2eKey, e2eNonce, originalResponse);
    }

    /**
     * 解析请求体为Map对象
     */
    private Map<String, Object> parseRequestBody(RequestBody body) throws IOException {
        Buffer buffer = new Buffer();
        body.writeTo(buffer);
        String requestBodyStr = buffer.readString(StandardCharsets.UTF_8);
        return mapper.readValue(requestBodyStr, new TypeReference<Map<String, Object>>() {
        });
    }

    /**
     * 加密请求体内容
     */
    private RequestBody encryptRequestBody(Map<String, Object> requestBodyJson, byte[] e2eKey, byte[] e2eNonce) throws IOException {
        try {
            Object messagesObj = requestBodyJson.get("messages");
            if (messagesObj instanceof List) {
                List<?> messagesList = (List<?>) messagesObj;
                List<Map<String, Object>> processedMessages = new ArrayList<>();

                for (Object message : messagesList) {
                    if (message instanceof Map) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> messageMap = (Map<String, Object>) message;
                        processedMessages.add(processMessage(messageMap, e2eKey, e2eNonce));
                    }
                }
                requestBodyJson.put("messages", processedMessages);
            }

            String modifiedRequestBodyStr = mapper.writeValueAsString(requestBodyJson);
            return RequestBody.create(MediaType.get("application/json"), modifiedRequestBodyStr);

        } catch (Exception e) {
            throw new IOException("Failed to process request body", e);
        }
    }

    /**
     * 处理单条消息
     */
    private Map<String, Object> processMessage(Map<String, Object> message, byte[] e2eKey, byte[] e2eNonce) throws IOException {
        Object content = message.get("content");
        if (content != null) {
            message.put("content", processMessageContent(content, e2eKey, e2eNonce));
        }
        return message;
    }

    /**
     * 处理消息内容
     */
    private Object processMessageContent(Object content, byte[] e2eKey, byte[] e2eNonce) throws IOException {
        if (content instanceof String) {
            return encryptStringWithKey(e2eKey, e2eNonce, (String) content);
        } else if (content instanceof Iterable) {
            List<Object> processedParts = new ArrayList<>();
            for (Object part : (Iterable<?>) content) {
                if (part instanceof Map) {
                    @SuppressWarnings("unchecked")
                    Map<String, Object> partMap = (Map<String, Object>) part;
                    processedParts.add(processContentPart(partMap, e2eKey, e2eNonce));
                } else {
                    throw new IOException("encryption is not supported for content type " + part.getClass().getSimpleName());
                }
            }
            return processedParts;
        } else {
            throw new IOException("encryption is not supported for content type " + content.getClass().getSimpleName());
        }
    }

    /**
     * 处理内容部分
     */
    private Map<String, Object> processContentPart(Map<String, Object> part, byte[] e2eKey, byte[] e2eNonce) throws IOException {
        String type = part.get("type").toString();

        switch (type) {
            case "text":
                part.put("text", encryptStringWithKey(e2eKey, e2eNonce, part.get("text").toString()));
                break;
            case "image_url":
                @SuppressWarnings("unchecked")
                Map<String, Object> imageUrl = (Map<String, Object>) part.get("image_url");
                processImageUrl(imageUrl, e2eKey, e2eNonce);
                break;

            default:
                throw new IOException("encryption is not supported for content type " + type);
        }

        return part;
    }

    /**
     * 处理图片URL
     */
    private void processImageUrl(Map<String, Object> imageUrl, byte[] e2eKey, byte[] e2eNonce) throws IOException {
        String url = imageUrl.get("url").toString();
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            if ("data".equals(scheme)) {
                imageUrl.put("url", encryptStringWithKey(e2eKey, e2eNonce, url));
            } else if ("http".equals(scheme) || "https".equals(scheme)) {
                System.err.println("WARNING: encryption is not supported for image url, please use base64 image if you want encryption");
            } else {
                throw new IOException("encryption is not supported for image url scheme " + scheme);
            }

        } catch (URISyntaxException e) {
            if (url.startsWith("data:")) {
                imageUrl.put("url", encryptStringWithKey(e2eKey, e2eNonce, url));
            } else {
                throw new IOException("Invalid image URL format: " + url, e);
            }
        }
    }

    /**
     * 添加AICC加密信息头
     */
    private void addAiccEncryptionHeader(Request.Builder requestBuilder, CertificateManager.ServerCertificateInfo certInfo) throws IOException {
        String volcArkEncryption = System.getenv("VOLC_ARK_ENCRYPTION");
        boolean aiccEnabled = "AICC".equals(volcArkEncryption);
        if (aiccEnabled) {
            Map<String, String> info = new HashMap<>();
            info.put("Version", "AICCv0.1");
            info.put("RingID", certInfo.getRingId());
            info.put("KeyID", certInfo.getKeyId());
            String infoJson = mapper.writeValueAsString(info);
            requestBuilder.addHeader("X-Encrypt-Info", infoJson);
        }
    }

    /**
     * 处理错误响应
     */
    private Response handleErrorResponse(Response response) throws IOException {
        ResponseBody errorBody = response.body();
        if (errorBody != null) {
            String errorResponseStr = errorBody.string();
            MediaType contentType = errorBody.contentType();
            if (contentType == null) {
                contentType = MediaType.get("application/json; charset=utf-8");
            }
            ResponseBody newErrorBody = ResponseBody.create(contentType, errorResponseStr);
            return response.newBuilder().body(newErrorBody).build();
        }
        return response;
    }

    /**
     * 解密响应内容
     */
    private Response decryptResponse(byte[] key, byte[] nonce, Response response) {
        try {
            ResponseBody responseBody = response.body();
            if (responseBody == null) {
                return response;
            }
            MediaType contentType = responseBody.contentType();
            boolean isStreaming = false;
            if (contentType != null) {
                String contentTypeStr = contentType.toString();
                isStreaming = contentTypeStr.contains("text/event-stream");
            }
            if (isStreaming) {
                return response.newBuilder()
                        .addHeader("X-Decryption-Key", Base64.getEncoder().encodeToString(key))
                        .addHeader("X-Decryption-Nonce", Base64.getEncoder().encodeToString(nonce))
                        .addHeader("X-Is-Encrypted", "true")
                        .build();
            } else {
                try {
                    String responseBodyStr = responseBody.string();
                    Map<String, Object> responseJson = mapper.readValue(
                            responseBodyStr,
                            new TypeReference<Map<String, Object>>() {
                            }
                    );
                    return handleNormalResponse(key, nonce, response, responseJson);
                } catch (Exception e) {
                    return response.newBuilder().build();
                }
            }

        } catch (Exception e) {
            return response;
        }
    }


    /**
     * 处理普通响应解密
     */
    private Response handleNormalResponse(byte[] key, byte[] nonce, Response response, Map<String, Object> responseJson) throws IOException {
        if (responseJson.containsKey("choices") && responseJson.get("choices") instanceof List) {
            @SuppressWarnings("unchecked")
            List<Map<String, Object>> choices = (List<Map<String, Object>>) responseJson.get("choices");

            for (Map<String, Object> choice : choices) {
                if (ResponseDecryptUtil.shouldDecryptChoice(choice)) {
                    ResponseDecryptUtil.decryptChoiceContent(key, nonce, choice);
                }
            }
        }

        String decryptedContent = mapper.writeValueAsString(responseJson);
        ResponseBody originalResponseBody = response.body();
        MediaType contentType = null;
        if (originalResponseBody != null) {
            contentType = originalResponseBody.contentType();
        }
        if (contentType == null) {
            contentType = MediaType.get("application/json; charset=utf-8");
        }
        ResponseBody decryptedBody = ResponseBody.create(
                contentType,
                decryptedContent.getBytes(StandardCharsets.UTF_8)
        );

        return response.newBuilder()
                .body(decryptedBody)
                .build();
    }

}