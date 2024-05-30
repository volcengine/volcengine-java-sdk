package com.volcengine.ark.runtime;


import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessageRole;
import com.volcengine.ark.runtime.service.ArkService;

import java.util.ArrayList;
import java.util.List;

public class ChatCompletionsExample {

    /**
     * Support ak&sk or api key
     * 1. Fetch ak&sk from environmental variables "VOLC_ACCESSKEY", "VOLC_SECRETKEY"
     * you can get ak&sk follow this document(https://www.volcengine.com/docs/6291/65568)
     * String ak = System.getenv("VOLC_ACCESSKEY");
     * String sk = System.getenv("VOLC_SECRETKEY");
     * ArkService service = new ArkService(ak, sk);
     *
     * 2. Fetch api key from environmental variables "ARK_API_KEY".
     * String apiKey = System.getenv("ARK_API_KEY");
     * ArkService service = new ArkService(apiKey);
     *
     * Note: if you support api key，this api key will not be refreshed.
     * If you don't want the api to fail after a period of time, to the api key that never expires.
     */
    public static void main(String[] args) {

        String apiKey = System.getenv("ARK_API_KEY");
        ArkService service = new ArkService(apiKey);

        System.out.println("\nCreating completion...");
        final List<ChatMessage> messages = new ArrayList<>();
        final ChatMessage systemMessage = ChatMessage.builder().role(ChatMessageRole.USER).content("hi").build();
        messages.add(systemMessage);

        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .messages(messages)
                .maxTokens(50)
                .streamOptions(ChatCompletionRequest.ChatCompletionRequestStreamOptions.of(true))
                .build();

        service.createChatCompletion(chatCompletionRequest).getChoices().forEach(System.out::println);

        service.streamChatCompletion(chatCompletionRequest)
                .doOnError(Throwable::printStackTrace)
                .blockingForEach(System.out::println);

        // shutdown service
        service.shutdownExecutor();
    }

}
