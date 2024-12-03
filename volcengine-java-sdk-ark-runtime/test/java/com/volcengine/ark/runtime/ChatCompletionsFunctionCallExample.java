package com.volcengine.ark.runtime;


import com.volcengine.ark.runtime.model.completion.chat.*;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class ChatCompletionsFunctionCallExample {

    /**
     * Authentication
     * 1.If you authorize your endpoint using an API key, you can set your api key to environment variable "ARK_API_KEY"
     * String apiKey = System.getenv("ARK_API_KEY");
     * ArkService service = new ArkService(apiKey);
     * Note: If you use an API key, this API key will not be refreshed.
     * To prevent the API from expiring and failing after some time, choose an API key with no expiration date.
     *
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
        System.out.println("\n----- function call request -----");
        final List<ChatMessage> messages = new ArrayList<>();
        final ChatMessage userMessage = ChatMessage.builder().role(ChatMessageRole.USER).content("What's the weather like in Boston today?").build();
        messages.add(userMessage);

        final List<ChatTool> tools = Arrays.asList(
                new ChatTool(
                        "function",
                        new ChatFunction.Builder()
                                .name("get_current_weather")
                                .description("Get the current weather in a given location")
                                .parameters(new Weather(
                                        "object",
                                        new HashMap<String, Object>() {{
                                            put("location", new HashMap<String, String>() {{
                                                put("type", "string");
                                                put("description", "The city and state, e.g. San Francisco, CA");
                                            }});
                                        }},
                                        Collections.singletonList("location")
                                ))
                                .build()
                        )
        );


        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .messages(messages)
                .tools(tools)
                .build();

        service.createChatCompletion(chatCompletionRequest).getChoices().forEach(System.out::println);

        service.streamChatCompletion(chatCompletionRequest)
                .doOnError(Throwable::printStackTrace)
                .blockingForEach(System.out::println);

        // shutdown service after all requests is finished
        service.shutdownExecutor();
    }

    public static class Weather {
        public String type;
        public Map<String, Object> properties;
        public List<String> required;

        public Weather(String type, Map<String, Object> properties, List<String> required) {
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

        public Map<String, Object> getProperties() {
            return properties;
        }

        public void setProperties(Map<String, Object> properties) {
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
