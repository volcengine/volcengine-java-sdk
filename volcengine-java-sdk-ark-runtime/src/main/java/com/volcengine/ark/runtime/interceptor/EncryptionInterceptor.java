package com.volcengine.ark.runtime.interceptor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.service.CertificateManager;
import com.volcengine.ark.runtime.utils.LoggerUtil;
import okhttp3.*;
import okio.Buffer;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.GeneralSecurityException;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.volcengine.ark.runtime.utils.KeyAgreementUtil;

import static com.volcengine.ark.runtime.service.CertificateManager.getServerCertificate;
import static com.volcengine.ark.runtime.utils.KeyAgreementUtil.*;

/**
 * 加密拦截器 - 处理请求加密和响应解密
 */
public class EncryptionInterceptor implements Interceptor {

    private final String apiKey;
    private final String baseUrl;
    private final ObjectMapper mapper = new ObjectMapper();

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

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
        LoggerUtil.debug("is-encrypt: " + is_encrypt);

        RequestBody originalBody = request.body();
        if (originalBody == null) {
            LoggerUtil.debug("Request body is null, proceeding with original request");
            return chain.proceed(request);
        }

        // 读取并解析请求体
        Map<String, Object> requestBodyJson = parseRequestBody(originalBody);
        String model = requestBodyJson.get("model").toString();
        LoggerUtil.debug("Starting encryption process for model: " + model);

        // 非加密模式直接处理
        if (!"true".equals(is_encrypt)) {
            return proceedWithoutEncryption(chain, request, requestBodyJson);
        }


        // 加密模式处理
        return proceedWithEncryption(chain, request, requestBodyJson, model);
    }

    private Response proceedWithEncryption(Chain chain, Request request, Map<String, Object> requestBodyJson, String model) throws IOException {
        // 获取服务器证书信息
        CertificateManager.ServerCertificateInfo certInfo = getServerCertificate(this.apiKey, this.baseUrl, model);
        if (certInfo == null) {
            throw new IOException("Failed to get server certificate for encryption");
        }
        LoggerUtil.debug("Successfully obtained server certificate - RingID: " + certInfo.getRingId() + ", KeyID: " + certInfo.getKeyId());

        // 生成会话密钥和令牌
        SessionData sessionData;
        try {
            sessionData = KeyAgreementUtil.generateEciesKeyPair(certInfo.getPublicKey());
        } catch (GeneralSecurityException e) {
            LoggerUtil.error("generate sessionTokenData failed:", e);
            throw new RuntimeException(e);
        }
        byte[] e2eKey = sessionData.getCryptoKey();
        byte[] e2eNonce = sessionData.getCryptoNonce();
        String sessionToken = sessionData.getSessionToken();
        LoggerUtil.debug("Generated session token and crypto keys successfully");

        // 加密请求体
        RequestBody encryptedBody = encryptRequestBody(requestBodyJson, e2eKey, e2eNonce);

        Request.Builder requestBuilder = request.newBuilder()
                .method(request.method(), encryptedBody);

        // 添加AICC加密头信息
        addAiccEncryptionHeader(requestBuilder, certInfo);

        requestBuilder.addHeader("X-Session-Token", sessionToken);
        Request encryptedRequest = requestBuilder.build();

        LoggerUtil.debug("Sending encrypted request to server");
        Response originalResponse = chain.proceed(encryptedRequest);

        LoggerUtil.debug("Received response from server, status code: " + originalResponse.code());

        // 处理失败响应
        if (!originalResponse.isSuccessful()) {
            return handleErrorResponse(originalResponse);
        }

        // 解密成功响应
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
     * 非加密模式处理 - 直接转发请求
     */
    private Response proceedWithoutEncryption(Chain chain, Request request, Map<String, Object> requestBodyJson) throws IOException {
        LoggerUtil.debug("plaintext mode");
        String modifiedRequestBodyStr = mapper.writeValueAsString(requestBodyJson);
        RequestBody modifiedBody = RequestBody.create(
                MediaType.get("application/json"),
                modifiedRequestBodyStr
        );
        Request modifiedRequest = request.newBuilder()
                .method(request.method(), modifiedBody)
                .build();
        return chain.proceed(modifiedRequest);
    }


    /**
     * 加密请求体内容
     */
    private RequestBody encryptRequestBody(Map<String, Object> requestBodyJson, byte[] e2eKey, byte[] e2eNonce) throws IOException {
        try {
            if (requestBodyJson.containsKey("messages")) {
                Object messagesObj = requestBodyJson.get("messages");
                if (messagesObj instanceof List) {
                    List<?> messagesList = (List<?>) messagesObj;
                    LoggerUtil.debug("Processing " + messagesList.size() + " messages for encryption");
                    if (!messagesList.isEmpty()) {
                        List<Map<String, Object>> encryptedMessages = new ArrayList<>();
                        for (Object message : messagesList) {
                            if (message instanceof Map) {
                                Map<?, ?> messageMap = (Map<?, ?>) message;
                                String role = messageMap.get("role") != null ? messageMap.get("role").toString() : "user";

                                if (messageMap.get("content") != null) {
                                    String content = messageMap.get("content").toString();
                                    String encryptedContent = encryptStringWithKey(e2eKey, e2eNonce, content);
                                    Map<String, Object> encryptedMessage = new HashMap<>();
                                    encryptedMessage.put("role", role);
                                    encryptedMessage.put("content", encryptedContent);
                                    encryptedMessages.add(encryptedMessage);
                                }
                            }
                        }
                        requestBodyJson.put("messages", encryptedMessages);
                        LoggerUtil.debug("Successfully encrypted " + encryptedMessages.size() + " messages");
                    }
                }
            }

            String modifiedRequestBodyStr = mapper.writeValueAsString(requestBodyJson);
            return RequestBody.create(MediaType.get("application/json"), modifiedRequestBodyStr);

        } catch (Exception e) {
            LoggerUtil.debug("Failed to process request body: " + e.getMessage());
            throw new IOException("Failed to process request body", e);
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
            LoggerUtil.debug("AICC encryption enabled, added X-Encrypt-Info header");
        }
    }

    /**
     * 处理错误响应
     */
    private Response handleErrorResponse(Response response) throws IOException {
        ResponseBody errorBody = response.body();
        if (errorBody != null) {
            String errorResponseStr = errorBody.string();
            LoggerUtil.debug("Request failed with status: " + response.code() + ", error response: " + errorResponseStr);
            MediaType contentType = errorBody.contentType();
            if (contentType == null) {
                contentType = MediaType.get("application/json; charset=utf-8");
            }
            ResponseBody newErrorBody = ResponseBody.create(contentType, errorResponseStr);
            return response.newBuilder().body(newErrorBody).build();
        } else {
            LoggerUtil.debug("Request failed with status: " + response.code() + ", no response body");
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
                LoggerUtil.debug("Response body is null, returning original response");
                return response;
            }

            String responseBodyStr = responseBody.string();

            if (isStreamResponseFromContent(responseBodyStr)) {
                return handleStreamResponse(key, nonce, response, responseBodyStr);
            } else {
                try {
                    Map<String, Object> responseJson = mapper.readValue(
                            responseBodyStr,
                            new TypeReference<Map<String, Object>>() {
                            }
                    );
                    return handleNormalResponse(key, nonce, response, responseJson);
                } catch (Exception e) {
                    LoggerUtil.debug("Failed to parse response as JSON, trying as stream: " + e.getMessage());
                    return handleStreamResponse(key, nonce, response, responseBodyStr);
                }
            }

        } catch (Exception e) {
            LoggerUtil.debug("Failed to decrypt response: " + e.getMessage());
            return response;
        }
    }

    /**
     * 处理流式响应解密
     */
    private Response handleStreamResponse(byte[] key, byte[] nonce, Response response, String originalContent) {
        try {
            ResponseBody originalBody = response.body();
            if (originalBody == null) {
                LoggerUtil.debug("Original body is null in handleStreamResponse");
                return response;
            }
            String decryptedContent = decryptStreamContent(key, nonce, originalContent);
            LoggerUtil.debug("Stream response decrypted successfully, decrypted length: " + decryptedContent.length());

            MediaType contentType = originalBody.contentType();
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

        } catch (Exception e) {
            LoggerUtil.debug("Failed to handle stream response: " + e.getMessage());
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

            for (int i = 0; i < choices.size(); i++) {
                Map<String, Object> choice = choices.get(i);
                if (shouldDecryptChoice(choice)) {
                    decryptChoiceContent(key, nonce, choice, i);
                }
            }
        } else {
            LoggerUtil.debug("No choices found in response or choices is not a list");
        }

        String modifiedResponseBodyStr = mapper.writeValueAsString(responseJson);
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
                modifiedResponseBodyStr.getBytes(StandardCharsets.UTF_8)
        );

        return response.newBuilder()
                .body(decryptedBody)
                .build();
    }

    /**
     * 解密单个choice内容
     */
    private void decryptChoiceContent(byte[] key, byte[] nonce, Map<String, Object> choice, int index) {
        String encryptedContent = getEncryptedContentFromChoice(choice);
//        LoggerUtil.debug("Choice " + index + " requires decryption, encrypted content length: " +
//                (encryptedContent != null ? encryptedContent.length() : 0));

        if (encryptedContent != null && !encryptedContent.isEmpty()) {
            try {
                String decryptedContent = decryptStringWithKey(key, nonce, encryptedContent);
                @SuppressWarnings("unchecked")
                Map<String, Object> message = (Map<String, Object>) choice.get("message");
                message.put("content", decryptedContent);
            } catch (Exception e) {
                LoggerUtil.debug("Failed to decrypt content for choice " + index + ": " + e.getMessage());
                @SuppressWarnings("unchecked")
                Map<String, Object> message = (Map<String, Object>) choice.get("message");
                message.put("content", "");
            }
        } else {
            LoggerUtil.debug("Encrypted content is null or empty for choice " + index);
        }
    }

    /**
     * 解密流式响应内容
     */
    private String decryptStreamContent(byte[] key, byte[] nonce, String streamContent) {
        try {
            String[] lines = streamContent.split("\n");
            LoggerUtil.debug("Stream content split into " + lines.length + " lines");
            StringBuilder decryptedContent = new StringBuilder();

            for (String line : lines) {
                if (line.trim().isEmpty()) {
                    decryptedContent.append(line).append("\n");
                    continue;
                }

                if (line.startsWith("data: ")) {
                    String dataContent = line.substring(6);
                    if ("[DONE]".equals(dataContent)) {
                        decryptedContent.append("data: [DONE]\n");
                        continue;
                    }

                    try {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> chunkData = mapper.readValue(dataContent, Map.class);
                        Map<String, Object> decryptedChunk = decryptStreamChunk(key, nonce, chunkData);
                        String decryptedJson = mapper.writeValueAsString(decryptedChunk);
                        decryptedContent.append("data: ").append(decryptedJson).append("\n");
                    } catch (Exception e) {
                        LoggerUtil.debug("Failed to process stream data line: " + e.getMessage() + ", line: " + line);
                        decryptedContent.append(line).append("\n");
                    }
                } else {
                    decryptedContent.append(line).append("\n");
                }
            }

            return decryptedContent.toString();
        } catch (Exception e) {
            LoggerUtil.debug("Failed to decrypt stream content: " + e.getMessage());
            return streamContent;
        }
    }

    /**
     * 解密流式数据块
     */
    private Map<String, Object> decryptStreamChunk(byte[] key, byte[] nonce, Map<String, Object> chunkData) {
        try {
            if (chunkData.containsKey("choices") && chunkData.get("choices") instanceof List) {
                @SuppressWarnings("unchecked")
                List<Map<String, Object>> choices = (List<Map<String, Object>>) chunkData.get("choices");

                for (int i = 0; i < choices.size(); i++) {
                    Map<String, Object> choice = choices.get(i);
                    if (shouldDecryptStreamChoice(choice)) {
                        String encryptedContent = getEncryptedContentFromStreamChoice(choice);
                        if (encryptedContent != null && !encryptedContent.isEmpty()) {
                            try {
                                String decryptedContent = aesGcmDecryptBase64String(key, nonce, encryptedContent);
                                @SuppressWarnings("unchecked")
                                Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
                                delta.put("content", decryptedContent);
                            } catch (Exception e) {
                                LoggerUtil.debug("Failed to decrypt stream content for choice " + i + ": " + e.getMessage());
                                @SuppressWarnings("unchecked")
                                Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
                                delta.put("content", "");
                            }
                        }
                    }
                }
            }
            return chunkData;
        } catch (Exception e) {
            LoggerUtil.debug("Failed to decrypt stream chunk: " + e.getMessage());
            return chunkData;
        }
    }

    /**
     * 判断是否为流式响应
     */
    private boolean isStreamResponseFromContent(String content) {
        if (content == null || content.trim().isEmpty()) {
            return false;
        }
        if (content.trim().startsWith("data: ")) {
            return true;
        }
        return content.contains("\ndata: ") || content.contains("\r\ndata: ");
    }

    /**
     * 判断choice是否需要解密
     */
    private boolean shouldDecryptChoice(Map<String, Object> choice) {
        if (!choice.containsKey("message") || !(choice.get("message") instanceof Map)) {
            return false;
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> message = (Map<String, Object>) choice.get("message");
        String finishReason = (String) choice.get("finish_reason");
        if ("content_filter".equals(finishReason)) {
            return false;
        }
        if (message == null || message.isEmpty()) {
            return false;
        }
        Object content = message.get("content");
        return content instanceof String;
    }

    /**
     * 从choice获取加密内容
     */
    private String getEncryptedContentFromChoice(Map<String, Object> choice) {
        @SuppressWarnings("unchecked")
        Map<String, Object> message = (Map<String, Object>) choice.get("message");
        return (String) message.get("content");
    }

    /**
     * 判断流式choice是否需要解密
     */
    private boolean shouldDecryptStreamChoice(Map<String, Object> choice) {
        if (!choice.containsKey("delta") || !(choice.get("delta") instanceof Map)) {
            return false;
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
        String finishReason = (String) choice.get("finish_reason");
        if ("content_filter".equals(finishReason)) {
            return false;
        }
        if (delta == null || delta.isEmpty()) {
            return false;
        }
        Object content = delta.get("content");
        return content instanceof String;
    }

    /**
     * 从流式choice获取加密内容
     */
    private String getEncryptedContentFromStreamChoice(Map<String, Object> choice) {
        @SuppressWarnings("unchecked")
        Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
        return (String) delta.get("content");
    }
}