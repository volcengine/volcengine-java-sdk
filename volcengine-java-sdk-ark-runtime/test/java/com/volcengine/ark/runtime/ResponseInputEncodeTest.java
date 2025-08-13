package com.volcengine.ark.runtime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.volcengine.ark.runtime.model.responses.common.ResponsesThinking;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.InputContentItemImage;
import com.volcengine.ark.runtime.model.responses.content.InputContentItemText;
import com.volcengine.ark.runtime.model.responses.item.ItemEasyMessage;
import com.volcengine.ark.runtime.model.responses.item.MessageContent;
import com.volcengine.ark.runtime.model.responses.request.ResponsesInput;
import com.volcengine.ark.runtime.model.responses.request.CreateResponsesRequest;
import com.volcengine.ark.runtime.model.responses.tool.ResponsesTool;
import com.volcengine.ark.runtime.model.responses.tool.ToolFunction;

import java.util.Collections;

public class ResponseInputEncodeTest {
    public static String STR_INPUT = "hello world";
    public static String LIST_INPUT_ESY_MSG = "[{\"type\":\"message\",\"role\":\"system\",\"content\":\"system message\"},{\"type\":\"message\",\"role\":\"user\",\"content\":[{\"type\":\"input_text\",\"text\":\"text input\"},{\"type\":\"input_image\",\"image_url\":\"https://a.png\"}]}]";
    public static String LIST_INPUT_ITEMS = "";

    public static ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }

    public static void testStrInput() throws Exception {
        ResponsesInput strInput = new ResponsesInput();
        strInput.setStringValue("hello world");
        String jsonStr = defaultObjectMapper().writeValueAsString(strInput);
        if (STR_INPUT.equals(jsonStr)) {
            System.out.println("testStrInput success");
        } else {
            throw new Exception("testStrInput failed, expected:" + STR_INPUT + ", actual: " + jsonStr);
        }
    }

    public static void testMessageListInput() throws Exception {
        ResponsesInput msgInput = ResponsesInput.builder()
                .addListItem(
                        ItemEasyMessage.builder().role(ResponsesConstants.MESSAGE_ROLE_SYSTEM).content(
                                MessageContent.builder().stringValue("system message").build()
                        ).build()
                )
                .addListItem(
                        ItemEasyMessage.builder().role(ResponsesConstants.MESSAGE_ROLE_USER).content(
                                MessageContent.builder()
                                        .addListItem(InputContentItemText.builder().text("text input").build())
                                        .addListItem(InputContentItemImage.builder().imageUrl("https://a.png").build())
                                        .build()
                        ).build()
                )
                .build();

        String jsonStr = defaultObjectMapper().writeValueAsString(msgInput);
        if (LIST_INPUT_ESY_MSG.equals(jsonStr)) {
            System.out.println("testMessageListInput success");
        } else {
            throw new Exception("testMessageListInput failed, expected:" + LIST_INPUT_ESY_MSG + ", actual: " + jsonStr);
        }
    }

    public static void testToolInput() throws Exception {
        ResponsesTool weatherTool = ToolFunction.builder()
                .name("get_current_weather")
                .description("Get the current weather in a given location")
                .parameters(
                        new ObjectMapper().readTree("{\"type\":\"object\",\"properties\":{\"location\":{\"type\":\"string\",\"description\":\"The city and state, e.g. San Francisco, CA\"},\"unit\":{\"type\":\"string\",\"enum\":[\"celsius\",\"fahrenheit\"]}},\"required\":[\"location\",\"unit\"]}")
                ).build();
        CreateResponsesRequest fcRequest = CreateResponsesRequest.builder()
                .model("model")
                .stream(true)
                .input(ResponsesInput.builder().stringValue("What's the weather in beijing").build())
                .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                .tools(Collections.singletonList(weatherTool))
                .build();
        System.out.println(defaultObjectMapper().writeValueAsString(fcRequest));
    }

    public static void main(String[] args) {
        try {
//            testStrInput();
//            testMessageListInput();
            testToolInput();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
