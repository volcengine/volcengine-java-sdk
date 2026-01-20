package com.volcengine.ark.runtime.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class ResponseDecryptUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * 解密流式数据块
     */
    public static String decryptStreamChunk(String data, byte[] key, byte[] nonce) throws Exception {
        try {
            @SuppressWarnings("unchecked")
            Map<String, Object> chunkData = mapper.readValue(data, Map.class);

            if (!hasValidChoices(chunkData)) {
                return mapper.writeValueAsString(chunkData);
            }

            @SuppressWarnings("unchecked")
            List<Map<String, Object>> choices = (List<Map<String, Object>>) chunkData.get("choices");

            for (Map<String, Object> choice : choices) {
                decryptStreamChoiceContent(choice, key, nonce);
            }

            return mapper.writeValueAsString(chunkData);
        } catch (Exception e) {
            // 解密失败时返回原始数据
            return data;
        }
    }

    /**
     * 检查chunk数据是否包含有效的choices
     */
    public static boolean hasValidChoices(Map<String, Object> chunkData) {
        return chunkData.containsKey("choices") && chunkData.get("choices") instanceof List;
    }

    /**
     * 解密流式choice的内容
     */
    public static void decryptStreamChoiceContent(Map<String, Object> choice, byte[] key, byte[] nonce) {
        if (!shouldDecryptStreamChoice(choice)) {
            return;
        }

        String encryptedContent = getEncryptedContentFromStreamChoice(choice);
        if (encryptedContent == null || encryptedContent.isEmpty()) {
            return;
        }

        try {
            String decryptedContent = KeyAgreementUtil.decryptStringWithKey(key, nonce, encryptedContent);
            updateStreamChoiceContent(choice, decryptedContent);
        } catch (Exception e) {
            updateStreamChoiceContent(choice, "");
        }
    }

    /**
     * 检查是否应该解密流式choice
     */
    public static boolean shouldDecryptStreamChoice(Map<String, Object> choice) {
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
        return delta.containsKey("content");
    }

    /**
     * 从流式choice中获取加密内容
     */
    public static String getEncryptedContentFromStreamChoice(Map<String, Object> choice) {
        @SuppressWarnings("unchecked")
        Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
        if (delta == null) {
            return null;
        }
        Object contentObj = delta.get("content");
        return contentObj instanceof String ? (String) contentObj : null;
    }

    /**
     * 更新流式choice的内容
     */
    public static void updateStreamChoiceContent(Map<String, Object> choice, String content) {
        @SuppressWarnings("unchecked")
        Map<String, Object> delta = (Map<String, Object>) choice.get("delta");
        if (delta != null) {
            delta.put("content", content);
        }
    }

    /**
     * 判断choice是否需要解密 - 非流式
     */
    public static boolean shouldDecryptChoice(Map<String, Object> choice) {
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
     * 解密单个choice内容 - 非流式
     */
    public static void decryptChoiceContent(byte[] key, byte[] nonce, Map<String, Object> choice) {
        String encryptedContent = getEncryptedContentFromChoice(choice);
        if (encryptedContent != null && !encryptedContent.isEmpty()) {
            try {
                String decryptedContent = KeyAgreementUtil.decryptStringWithKey(key, nonce, encryptedContent);
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
     * 从choice获取加密内容 - 非流式
     */
    public static String getEncryptedContentFromChoice(Map<String, Object> choice) {
        @SuppressWarnings("unchecked")
        Map<String, Object> message = (Map<String, Object>) choice.get("message");
        if (message == null) {
            return null;
        }
        Object contentObj = message.get("content");
        return contentObj instanceof String ? (String) contentObj : null;
    }
}