package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.completion.chat.*;
import com.volcengine.ark.runtime.service.ArkService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class EncryptedChatCompletionsExample {
    /**
     * 将图片文件转换为 Data URL（Base64 编码）
     */
    public static String imageToDataUrl(String imagePath) throws IOException {
        try {
            // 读取图片文件
            Path path = Paths.get(imagePath);
            byte[] imageBytes = Files.readAllBytes(path);

            // Base64 编码
            String encodedString = Base64.getEncoder().encodeToString(imageBytes);

            // 根据文件扩展名确定 MIME 类型
            String mimeType = getMimeType(imagePath);

            // 构建 Data URL
            return String.format("data:%s;base64,%s", mimeType, encodedString);

        } catch (IOException e) {
            throw new IOException("Failed to convert image to data URL: " + imagePath, e);
        }
    }

    public static String getMimeType(String filePath) {
        String fileName = filePath.toLowerCase();
        if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")) {
            return "image/jpeg";
        } else if (fileName.endsWith(".png")) {
            return "image/png";
        } else if (fileName.endsWith(".gif")) {
            return "image/gif";
        } else if (fileName.endsWith(".bmp")) {
            return "image/bmp";
        } else if (fileName.endsWith(".webp")) {
            return "image/webp";
        } else {
            // 默认使用 jpeg
            return "image/jpeg";
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("\n----- comprehensive encrypted chat completions test -----");


        String apiKey = "ARK_API_KEY";


        String model = "YOUR_ENDPOINT_ID";


        String baseUrl = "YOUR_BASE_URL";

        // 构造聊天消息
        List<ChatMessage> messages = new ArrayList<>();
        messages.add(ChatMessage.builder().role(ChatMessageRole.SYSTEM).content("你是豆包，是由字节跳动开发的 AI 人工智能助手").build());
        messages.add(ChatMessage.builder().role(ChatMessageRole.USER).content("常见的十字花科植物有哪些？").build());

        //构造多模态消息测试
//        final List<ChatMessage> messages = new ArrayList<>();
//        final List<ChatCompletionContentPart> multiParts = new ArrayList<>();
//        multiParts.add(ChatCompletionContentPart.builder().type("text").text(
//                "这是哪里？"
//        ).build());
//
//        // 定义图片路径
//        String imagePath = "xxx.jpeg"; // 替换为你的实际图片路径
//        String dataUrl = imageToDataUrl(imagePath);
//
//        //图片部分 - 使用转换后的 Data URL
//        multiParts.add(ChatCompletionContentPart.builder()
//                .type("image_url")
//                .imageUrl(new ChatCompletionContentPart.ChatCompletionContentPartImageURL(dataUrl))
//                .build());
//
//        final ChatMessage userMessage = ChatMessage.builder()
//                .role(ChatMessageRole.USER)
//                .multiContent(multiParts)
//                .build();
//
//        messages.add(userMessage);

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