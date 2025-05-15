package com.volcengine.ark.runtime;


import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessageRole;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
# pom.xml
<dependency>
  <groupId>com.volcengine</groupId>
  <artifactId>volcengine-java-sdk-ark-runtime</artifactId>
  <version>LATEST</version>
</dependency>
*/

public class ChatCompletionsReasoningExample {

    /**
     * Authentication
     * 1.If you authorize your endpoint using an API key, you can set your api key to environment variable "ARK_API_KEY"
     * String apiKey = System.getenv("ARK_API_KEY");
     * ArkService service = new ArkService(apiKey);
     * Note: If you use an API key, this API key will not be refreshed.
     * To prevent the API from expiring and failing after some time, choose an API key with no expiration date.
     * <p>
     * 2.If you authorize your endpoint with Volcengine Identity and Access Management（IAM), set your api key to environment variable "VOLC_ACCESSKEY", "VOLC_SECRETKEY"
     * String ak = System.getenv("VOLC_ACCESSKEY");
     * String sk = System.getenv("VOLC_SECRETKEY");
     * ArkService service = new ArkService(ak, sk);
     * To get your ak&sk, please refer to this document(https://www.volcengine.com/docs/6291/65568)
     * For more information，please check this document（https://www.volcengine.com/docs/82379/1263279）
     */

    static String apiKey = System.getenv("ARK_API_KEY");
    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();
    static ArkService service = ArkService.builder().dispatcher(dispatcher).connectionPool(connectionPool).apiKey(apiKey).build();

    public static void main(String[] args) {
        System.out.println("\n----- streaming request -----");
        final List<ChatMessage> streamMessages = new ArrayList<>();
        final ChatMessage streamUserMessage = ChatMessage.builder().role(ChatMessageRole.USER).content("How many Rs are there in the word 'strawberry'?").build();
        streamMessages.add(streamUserMessage);

        ChatCompletionRequest streamChatCompletionRequest = ChatCompletionRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .messages(streamMessages)
                .thinking(new ChatCompletionRequest.ChatCompletionRequestThinking("enabled"))
                .build();

        service.streamChatCompletion(streamChatCompletionRequest)
                .doOnError(Throwable::printStackTrace)
                .blockingForEach(
                        delta -> {
                            if (!delta.getChoices().isEmpty()) {
                                if (StringUtils.isNotEmpty(delta.getChoices().get(0).getMessage().getReasoningContent())) {
                                    System.out.print(delta.getChoices().get(0).getMessage().getReasoningContent());
                                } else {
                                    System.out.print(delta.getChoices().get(0).getMessage().getContent());
                                }
                            }
                        }
                );

        System.out.println("\n----- standard request -----");
        final List<ChatMessage> messages = new ArrayList<>();
        final ChatMessage userMessage = ChatMessage.builder().role(ChatMessageRole.USER).content("How many Rs are there in the word 'strawberry'?").build();
        messages.add(userMessage);

        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .messages(messages)
                .thinking(new ChatCompletionRequest.ChatCompletionRequestThinking("enabled"))
                .build();

        service.createChatCompletion(chatCompletionRequest).getChoices().forEach(
                choice -> {
                    System.out.println(choice.getMessage().getReasoningContent());
                    System.out.println(choice.getMessage().getContent());
                }
        );


        // shutdown service after all requests is finished
        service.shutdownExecutor();
    }

}
