package com.volcengine.ark.runtime;


import com.volcengine.ark.runtime.model.completion.chat.*;
import com.volcengine.ark.runtime.service.ArkService;

import java.util.*;

public class ChatCompletionsFunctionCallExample {

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
        String ak = System.getenv("VOLC_ACCESSKEY");
        String sk = System.getenv("VOLC_SECRETKEY");
        ArkService service = new ArkService(ak, sk);

        System.out.println("\nCreating completion...");
        final List<ChatMessage> messages = new ArrayList<>();
        final ChatMessage systemMessage = ChatMessage.builder().role(ChatMessageRole.USER).content("hi").build();
        messages.add(systemMessage);

        final List<ChatTool> tools = Arrays.asList(
                new ChatTool(
                        "function",
                        new ChatFunction.Builder()
                                .name("get_current_weather")
                                .description("Get the current weather in a given location")
                                .parameters(new Weather(
                                        "object",
                                        new HashMap<String, String>() {{
                                            put("location", "city");
                                        }},
                                        Collections.singletonList("location")
                                ))
                                .build()
                        )
        );


        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .messages(messages)
                .maxTokens(50)
                .tools(tools)
                .build();

        service.createChatCompletion(chatCompletionRequest).getChoices().forEach(System.out::println);

        service.streamChatCompletion(chatCompletionRequest)
                .doOnError(Throwable::printStackTrace)
                .blockingForEach(System.out::println);

        // shutdown service
        service.shutdownExecutor();
    }

    public static class Weather {
        public String type;
        public Map<String, String> properties;
        public List<String> required;

        public Weather(String type, Map<String, String> properties, List<String> required) {
            this.type = type;
            this.properties = properties;
            this.required = required;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Map<String, String> getProperties() {
            return properties;
        }

        public void setProperties(Map<String, String> properties) {
            this.properties = properties;
        }

        public List<String> getRequired() {
            return required;
        }

        public void setRequired(List<String> required) {
            this.required = required;
        }
    }

}
