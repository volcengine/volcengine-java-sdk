package com.volcengine.ark.runtime.interceptor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.service.CertificateManager;
import com.volcengine.ark.runtime.utils.KeyAgreementUtil;
import okhttp3.*;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

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
                        .body(new DecryptedResponseBody(responseBody, key, nonce, mapper))
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
                if (shouldDecryptChoice(choice)) {
                    decryptChoiceContent(key, nonce, choice);
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

    /**
     * 解密单个choice内容
     */
    private void decryptChoiceContent(byte[] key, byte[] nonce, Map<String, Object> choice) {
        String encryptedContent = getEncryptedContentFromChoice(choice);
        if (encryptedContent != null && !encryptedContent.isEmpty()) {
            try {
                String decryptedContent = decryptStringWithKey(key, nonce, encryptedContent);
                @SuppressWarnings("unchecked")
                Map<String, Object> message = (Map<String, Object>) choice.get("message");
                message.put("content", decryptedContent);
            } catch (Exception e) {
                @SuppressWarnings("unchecked")
                Map<String, Object> message = (Map<String, Object>) choice.get("message");
                message.put("content", "");
            }
        }
    }


    /**
     * 解密流式数据块
     */
    private static Map<String, Object> decryptStreamChunk(byte[] key, byte[] nonce, Map<String, Object> chunkData) {
        try {
            if (!hasValidChoices(chunkData)) {
                return chunkData;
            }

            @SuppressWarnings("unchecked")
            List<Map<String, Object>> choices = (List<Map<String, Object>>) chunkData.get("choices");

            for (Map<String, Object> choice : choices) {
                decryptStreamChoiceContent(key, nonce, choice);
            }

            return chunkData;
        } catch (Exception e) {
            return chunkData;
        }
    }

    /**
     * 检查chunk数据是否包含有效的choices
     */
    private static boolean hasValidChoices(Map<String, Object> chunkData) {
        return chunkData.containsKey("choices") && chunkData.get("choices") instanceof List;
    }

    /**
     * 解密流式choice内容
     */
    private static void decryptStreamChoiceContent(byte[] key, byte[] nonce, Map<String, Object> choice) {
        if (!shouldDecryptStreamChoice(choice)) {
            return;
        }

        String encryptedContent = getEncryptedContentFromStreamChoice(choice);
        if (encryptedContent == null || encryptedContent.isEmpty()) {
            return;
        }

        try {
            String decryptedContent = aesGcmDecryptBase64String(key, nonce, encryptedContent);
            updateStreamChoiceContent(choice, decryptedContent);
        } catch (Exception e) {
            updateStreamChoiceContent(choice, "");
        }
    }

    /**
     * 更新流式choice的内容
     */
    private static void updateStreamChoiceContent(Map<String, Object> choice, String content) {
        @SuppressWarnings("unchecked")
        Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
        if (delta != null) {
            delta.put("content", content);
        }
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
    private static boolean shouldDecryptStreamChoice(Map<String, Object> choice) {
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
    private static String getEncryptedContentFromStreamChoice(Map<String, Object> choice) {
        @SuppressWarnings("unchecked")
        Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
        return (String) delta.get("content");
    }

    /**
     * 自定义的响应体实现，用于实时解密流式数据
     */
    private static class DecryptedResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final byte[] key;
        private final byte[] nonce;
        private final ObjectMapper mapper;
        private BufferedSource source;

        public DecryptedResponseBody(ResponseBody delegate, byte[] key, byte[] nonce, ObjectMapper mapper) {
            this.delegate = delegate;
            this.key = key;
            this.nonce = nonce;
            this.mapper = mapper;
        }

        @Override
        public MediaType contentType() {
            return delegate.contentType();
        }

        @Override
        public long contentLength() {
            // 解密后长度可能变化，返回-1表示未知
            return -1;
        }

        @Override
        public BufferedSource source() {
            if (source == null) {
                source = Okio.buffer(new DecryptedSource(delegate.source(), key, nonce, mapper));
            }
            return source;
        }

        @Override
        public void close() {
            delegate.close();
        }

        /**
         * 自定义的Source实现，用于实时解密流式数据
         */
        private static class DecryptedSource implements Source {
            private final Source delegate;
            private final byte[] key;
            private final byte[] nonce;
            private final ObjectMapper mapper;
            private final SSEDecoder decoder = new SSEDecoder();
            private final StringBuilder outputBuffer = new StringBuilder();

            public DecryptedSource(Source delegate, byte[] key, byte[] nonce, ObjectMapper mapper) {
                this.delegate = delegate;
                this.key = key;
                this.nonce = nonce;
                this.mapper = mapper;
            }

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                if (outputBuffer.length() > 0) {
                    return writeFromOutputBuffer(sink, byteCount);
                }

                // 从原始source读取数据
                Buffer tempBuffer = new Buffer();
                long bytesRead = delegate.read(tempBuffer, byteCount);
                if (bytesRead == -1) {
                    // 处理最后剩余的数据
                    List<ServerSentEvent> events = decoder.decode(tempBuffer.readByteArray());
                    processEvents(events);
                    return writeFromOutputBuffer(sink, byteCount);
                }

                // 读取原始字节
                byte[] rawBytes = new byte[(int) bytesRead];
                tempBuffer.read(rawBytes);


                // 使用SSEDecoder解析字节流为SSE事件
                List<ServerSentEvent> events = decoder.decode(rawBytes);
                processEvents(events);

                // 将处理后的内容写入sink
                long written = writeFromOutputBuffer(sink, byteCount);
                return written > 0 ? written : bytesRead;
            }

            /**
             * 处理SSE事件列表
             */
            private void processEvents(List<ServerSentEvent> events) throws IOException {
                for (ServerSentEvent event : events) {
                    if (event.data == null || event.data.isEmpty()) {
                        continue;
                    }

                    if (event.data.startsWith("[DONE]")) {
                        outputBuffer.append("data: [DONE]\n\n");
                    } else {
                        try {


                            @SuppressWarnings("unchecked")
                            Map<String, Object> chunkData = mapper.readValue(event.data, Map.class);

                            // 检查错误字段
                            if (chunkData.containsKey("error")) {
                                Object error = chunkData.get("error");
                                String message = "An error occurred during streaming";
                                if (error instanceof Map) {
                                    @SuppressWarnings("unchecked")
                                    Map<String, Object> errorMap = (Map<String, Object>) error;
                                    message = (String) errorMap.get("message");
                                }
                                throw new IOException(message);
                            }

                            // 解密事件
                            Map<String, Object> decryptedChunk = decryptStreamChunk(key, nonce, chunkData);
                            String decryptedJson = mapper.writeValueAsString(decryptedChunk);

                            // 处理带event字段的事件
                            if (event.event != null && !event.event.isEmpty()) {
                                outputBuffer.append("event: ").append(event.event).append("\n");
                            }

                            outputBuffer.append("data: ").append(decryptedJson).append("\n\n");
                        } catch (Exception e) {
                            throw new IOException("Decryption failed during streaming", e);
                        }
                    }
                }
            }

            /**
             * 从输出缓冲区写入数据到sink
             */
            private long writeFromOutputBuffer(Buffer sink, long byteCount) {
                if (outputBuffer.length() == 0) {
                    return 0;
                }

                Buffer tempBuffer = new Buffer();
                int bytesToWrite = (int) Math.min(outputBuffer.length(), byteCount);
                String dataToWrite = outputBuffer.substring(0, bytesToWrite);

                tempBuffer.writeUtf8(dataToWrite);
                long writtenBytes = tempBuffer.size();

                sink.write(tempBuffer, writtenBytes);

                outputBuffer.delete(0, bytesToWrite);

                return writtenBytes;
            }

            @Override
            public Timeout timeout() {
                return delegate.timeout();
            }

            @Override
            public void close() throws IOException {
                delegate.close();
            }
        }
    }

    /**
     * SSE事件类
     */
    private static class ServerSentEvent {
        public String event;
        public String data;
        public String id;
        public Long retry;
    }

    /**
     * SSE解码器
     */
    private static class SSEDecoder {
        private String event;
        private final List<String> data = new ArrayList<>();
        private String lastEventId;
        private Long retry;
        private final StringBuilder buffer = new StringBuilder();

        public List<ServerSentEvent> decode(byte[] bytes) {
            List<ServerSentEvent> events = new ArrayList<>();
            String content = new String(bytes, StandardCharsets.UTF_8);
            buffer.append(content);

            List<String> lines = new ArrayList<>();
            int index = 0;
            while (index < buffer.length()) {
                int newLineIndex = buffer.indexOf("\n", index);
                if (newLineIndex == -1) {
                    break;
                }
                lines.add(buffer.substring(index, newLineIndex));
                index = newLineIndex + 1;
            }

            if (index < buffer.length()) {
                buffer.setLength(0);
                buffer.append(buffer.substring(index));
            } else {
                buffer.setLength(0);
            }

            for (String line : lines) {
                ServerSentEvent sse = decodeLine(line);
                if (sse != null) {
                    events.add(sse);
                }
            }

            return events;
        }

        /**
         * 解析单行SSE事件数据
         */
        private ServerSentEvent decodeLine(String line) {
            if (line.isEmpty()) {
                if (data.isEmpty() && event == null && retry == null) {
                    return null;
                }

                ServerSentEvent sse = new ServerSentEvent();
                sse.event = event;
                sse.data = String.join("\n", data);
                sse.id = lastEventId;
                sse.retry = retry;

                event = null;
                data.clear();
                retry = null;

                return sse;
            }

            if (line.startsWith(":")) {
                return null;
            }

            int colonIndex = line.indexOf(":");
            if (colonIndex == -1) {
                return null;
            }

            String field = line.substring(0, colonIndex).trim();
            String value = line.substring(colonIndex + 1).trim();

            if (value.startsWith(" ")) {
                value = value.substring(1);
            }

            switch (field) {
                case "event":
                    event = value;
                    break;
                case "data":
                    data.add(value);
                    break;
                case "id":
                    if (value.contains("\0")) {
                        // 忽略包含null字符的id
                    } else {
                        lastEventId = value;
                    }
                    break;
                case "retry":
                    try {
                        retry = Long.parseLong(value);
                    } catch (NumberFormatException e) {
                        // 忽略无效的retry值
                    }
                    break;
                default:
                    break;
            }

            return null;
        }
    }
}