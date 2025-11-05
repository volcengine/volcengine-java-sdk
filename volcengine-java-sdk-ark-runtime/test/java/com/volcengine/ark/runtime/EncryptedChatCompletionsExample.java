package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessageRole;
import com.volcengine.ark.runtime.service.ArkService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncryptedChatCompletionsExample {

    public static void main(String[] args) {
        System.out.println("\n----- comprehensive encrypted chat completions test -----");


        String apiKey = "ARK_API_KEY";


        String model = "YOUR_ENDPOINT_ID";


        String baseUrl = "YOUR_BASE_URL";

        // 构造聊天消息
        List<ChatMessage> messages = new ArrayList<>();
        messages.add(ChatMessage.builder().role(ChatMessageRole.SYSTEM).content("你是豆包，是由字节跳动开发的 AI 人工智能助手").build());
        messages.add(ChatMessage.builder().role(ChatMessageRole.USER).content("常见的十字花科植物有哪些？").build());
        // 非流式加密聊天测试
        testNoStreaming(apiKey, model, baseUrl, messages);

        // 流式加密聊天测试
        testStreaming(apiKey, model, baseUrl, messages);

        System.exit(0);

    }


    // 流式测试方法
    private static void testStreaming(String apiKey, String model, String baseUrl, List<ChatMessage> messages) {
        System.out.println("\n----- streaming encrypted request -----");

        // 构建ArkService
        ArkService service = ArkService.builder()
                .apiKey(apiKey)
                .baseUrl(baseUrl)
                .build();

        // 构造聊天完成请求
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model(model)
                .messages(messages)
                .stream(true)  // 明确启用流式
                .maxTokens(1000) // 输出token长度，实际业务中请灵活调整
                .streamOptions(new ChatCompletionRequest.ChatCompletionRequestStreamOptions(Boolean.TRUE))
                .thinking(new ChatCompletionRequest.ChatCompletionRequestThinking("disabled"))
                .build();

        try {
            // 发送流式请求并处理响应
            // 初始化自定义请求头
            Map<String, String> customHeaders = new HashMap<>();
            customHeaders.put("x-is-encrypted", "true");
            //跳审核
            customHeaders.put("x-ark-moderation-scene", "aicc-skip");
            service.streamChatCompletion(chatCompletionRequest, customHeaders)
                    .doOnError(Throwable::printStackTrace)
                    .blockingForEach(
                            chunk -> {
                                if (chunk.getChoices() != null && !chunk.getChoices().isEmpty() &&
                                        chunk.getChoices().get(0).getMessage() != null &&
                                        chunk.getChoices().get(0).getMessage().getContent() != null) {
                                    System.out.print(chunk.getChoices().get(0).getMessage().getContent());
                                }

                            }
                    );
            System.out.println(); // 换行
        } catch (Exception e) {
            System.err.println("流式请求失败: " + e.getMessage());
            e.printStackTrace();
        } finally {
            service.shutdownExecutor();
        }
    }

    // 非流式测试方法
    private static void testNoStreaming(String apiKey, String model, String baseUrl, List<ChatMessage> messages) {
        System.out.println("\n----- no-streaming encrypted request -----");

        // 构建ArkService，启用加密并设置解密私钥
        ArkService service = ArkService.builder()
                .apiKey(apiKey)
                .retryTimes(3)
                .baseUrl(baseUrl)
                .build();

        // 构造聊天完成请求 - 修复stream参数为false
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model(model)
                .messages(messages)
                .thinking(new ChatCompletionRequest.ChatCompletionRequestThinking("disabled"))
                .maxTokens(1000)
                .stream(false)  // 明确禁用流式
                .build();

        try {
            // 初始化自定义请求头，如果使用加密模式，需要添加
            Map<String, String> customHeaders = new HashMap<>();
            customHeaders.put("x-is-encrypted", "true");
            //跳审核
            customHeaders.put("x-ark-moderation-scene", "aicc-skip");
            // 发送请求
            ChatCompletionResult result = service.createChatCompletion(chatCompletionRequest, customHeaders);

            // 打印结果（增加空指针检查）
            System.out.println("解密后的响应:");
            if (result != null && result.getChoices() != null) {
                result.getChoices().forEach(choice -> {
                            if (choice != null && choice.getMessage() != null) {
                                System.out.println(choice.getMessage().getContent());
                            }
//                            System.out.println(result.toString());
                        }
                );
            }
        } catch (Exception e) {
            System.err.println("非流式请求失败: " + e.getMessage());
            e.printStackTrace();
        } finally {
            service.shutdownExecutor();
        }
    }
}