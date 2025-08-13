package com.volcengine.ark.runtime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.volcengine.ark.runtime.model.responses.item.*;
import com.volcengine.ark.runtime.model.responses.content.OutputContentItemText;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessArguments;

import java.io.IOException;
import java.io.InputStream;

public class ResponsesItemDecodeTest {
    private ObjectMapper objectMapper;
    private JsonNode testData;

    public static ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }

    public ResponsesItemDecodeTest() throws IOException {
        objectMapper = defaultObjectMapper();
        loadTestData();
    }

    private void loadTestData() throws IOException {
        InputStream is = getClass().getResourceAsStream("./item_example.json");
        if (is == null) {
            is = getClass().getClassLoader().getResourceAsStream("item_example.json");
        }
        if (is == null) {
            // Try to load from file system
            java.io.File file = new java.io.File("test/java/com/volcengine/ark/runtime/item_example.json");
            if (file.exists()) {
                testData = objectMapper.readTree(file);
                return;
            }
            file = new java.io.File("item_example.json");
            if (file.exists()) {
                testData = objectMapper.readTree(file);
                return;
            }
            throw new IOException("Cannot find item_example.json in resources or filesystem");
        }
        testData = objectMapper.readTree(is);
    }

    private JsonNode getTestCase(int index) {
        return testData.get(index);
    }

    private String getExpectedClass(int index) {
        return getTestCase(index).get("expected_class").asText();
    }

    private JsonNode getItemJson(int index) {
        return getTestCase(index).get("item_json");
    }

    public static void main(String[] args) {
        try {
            ResponsesItemDecodeTest test = new ResponsesItemDecodeTest();
            test.runAllTests();
        } catch (Exception e) {
            System.err.println("Test failed: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void runAllTests() throws IOException {
        System.out.println("Running Jackson deserialization tests...");
        
        testItemReasoningDeserialization();
        System.out.println("✓ ItemReasoning deserialization test passed");
        
        testItemImageProcessDeserialization();
        System.out.println("✓ ItemImageProcess deserialization test passed");
        
        testItemOutputMessageDeserialization();
        System.out.println("✓ ItemOutputMessage deserialization test passed");
        
        testItemFunctionToolCallDeserialization();
        System.out.println("✓ ItemFunctionToolCall deserialization test passed");
        
        testItemWebSearchCallDeserialization();
        System.out.println("✓ ItemWebSearchCall deserialization test passed");
        
        System.out.println("All tests passed successfully!");
    }

    private void assertNotNull(Object obj, String message) {
        if (obj == null) {
            throw new AssertionError(message);
        }
    }

    private void assertEquals(Object expected, Object actual) {
        if (!java.util.Objects.equals(expected, actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }

    private void assertEquals(Object expected, Object actual, String message) {
        if (!java.util.Objects.equals(expected, actual)) {
            throw new AssertionError(message + " - Expected: " + expected + ", but was: " + actual);
        }
    }

    private void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    public void testItemReasoningDeserialization() throws IOException {
        JsonNode testCase = getTestCase(0);
        String expectedClass = getExpectedClass(0);
        JsonNode itemJson = getItemJson(0);

        assertEquals("com.volcengine.ark.runtime.model.responses.item.ItemReasoning", expectedClass);

        String jsonString = objectMapper.writeValueAsString(itemJson);
        ItemReasoning item = objectMapper.readValue(jsonString, ItemReasoning.class);
        assertNotNull(item, "ItemReasoning should not be null");
        assertEquals("reasoning", item.getType());
        assertEquals("rs_02175515690006100000000000000000000ffffc0a878c4b40375", item.getId());
        assertEquals("completed", item.getStatus());
        assertNotNull(item.getSummary(), "Summary should not be null");
        assertEquals(1, item.getSummary().size(), "Should have one summary part");
        assertEquals("summary_text", item.getSummary().get(0).getType());
        assertTrue(item.getSummary().get(0).getText().contains("motorcycle"), "Summary text should contain expected content");
    }

    public void testItemImageProcessDeserialization() throws IOException {
        JsonNode testCase = getTestCase(1);
        String expectedClass = getExpectedClass(1);
        JsonNode itemJson = getItemJson(1);

        assertEquals("com.volcengine.ark.runtime.model.responses.item.ItemImageProcess", expectedClass);

        // Fix the JSON by adding the missing type field to arguments
        JsonNode argumentsNode = itemJson.get("arguments");
        if (argumentsNode != null && argumentsNode.isObject()) {
            ((com.fasterxml.jackson.databind.node.ObjectNode) argumentsNode).put("type", "zoom");
        }

        String jsonString = objectMapper.writeValueAsString(itemJson);
        ItemImageProcess item = objectMapper.readValue(jsonString, ItemImageProcess.class);
        assertNotNull(item, "ItemImageProcess should not be null");
        assertEquals("image_process", item.getType());
        assertEquals("ip_02175515690161100000000000000000000ffffc0a878c45aeeaf", item.getId());
        assertEquals("failed", item.getStatus());
        assertNotNull(item.getAction(), "Action should not be null");
        assertEquals("zoom", item.getAction().getType());
        assertNotNull(item.getArguments(), "Arguments should not be null");
        assertEquals(0, item.getArguments().getImageIndex(), "Image index should be 0");
        assertTrue(item.getArguments() instanceof ImageProcessArguments, "Arguments should be ImageProcessZoomArguments");
        assertEquals(2.0, item.getArguments().getScale(), "Scale should be 2.0");
        assertNotNull(item.getError(), "Error should not be null");
        assertEquals("invalid image index", item.getError().getMessage());
    }

    public void testItemOutputMessageDeserialization() throws IOException {
        JsonNode testCase = getTestCase(2);
        String expectedClass = getExpectedClass(2);
        JsonNode itemJson = getItemJson(2);

        assertEquals("com.volcengine.ark.runtime.model.responses.item.ItemOutputMessage", expectedClass);

        String jsonString = objectMapper.writeValueAsString(itemJson);
        ItemOutputMessage item = objectMapper.readValue(jsonString, ItemOutputMessage.class);
        assertNotNull(item, "ItemOutputMessage should not be null");
        assertEquals("message", item.getType());
        assertEquals("assistant", item.getRole());
        assertEquals("completed", item.getStatus());
        assertEquals("msg_02175517244988500000000000000000000ffffc0a858127c0834", item.getId());
        assertNotNull(item.getContent(), "Content should not be null");
        assertEquals(1, item.getContent().size(), "Should have one content item");
        assertTrue(item.getContent().get(0) instanceof OutputContentItemText, "Content should be OutputContentItemText");
        
        OutputContentItemText textContent = 
            (OutputContentItemText) item.getContent().get(0);
        assertEquals("output_text", textContent.getType());
        assertTrue(textContent.getText().contains("热点新闻"), "Text should contain expected content");
        assertNotNull(textContent.getAnnotations(), "Annotations should not be null");
        assertTrue(textContent.getAnnotations().size() > 0, "Should have annotations");
    }

    public void testItemFunctionToolCallDeserialization() throws IOException {
        JsonNode testCase = getTestCase(3);
        String expectedClass = getExpectedClass(3);
        JsonNode itemJson = getItemJson(3);

        assertEquals("com.volcengine.ark.runtime.model.responses.item.ItemFunctionToolCall", expectedClass);

        String jsonString = objectMapper.writeValueAsString(itemJson);
        ItemFunctionToolCall item = objectMapper.readValue(jsonString, ItemFunctionToolCall.class);
        assertNotNull(item, "ItemFunctionToolCall should not be null");
        assertEquals("function_call", item.getType());
        assertEquals("fc_02175517234919200000000000000000000ffffc0a878c4f321d3", item.getId());
        assertEquals("completed", item.getStatus());
        assertEquals("get_current_weather", item.getName());
        assertEquals("call_21duyu74uikp23n9j8pczxq1", item.getCallId());
        assertEquals(" {\"location\": \"Beijing\", \"unit\": \"celsius\"}", item.getArguments());
    }

    public void testItemWebSearchCallDeserialization() throws IOException {
        JsonNode testCase = getTestCase(4);
        String expectedClass = getExpectedClass(4);
        JsonNode itemJson = getItemJson(4);

        assertEquals("com.volcengine.ark.runtime.model.responses.item.ItemWebSearchCall", expectedClass);

        String jsonString = objectMapper.writeValueAsString(itemJson);
        ItemWebSearchCall item = objectMapper.readValue(jsonString, ItemWebSearchCall.class);
        assertNotNull(item, "ItemWebSearchCall should not be null");
        assertEquals("web_search_call", item.getType());
        assertEquals("ws_02175517243682800000000000000000000ffffc0a85812f9745e", item.getId());
        assertEquals("completed", item.getStatus());
        assertNotNull(item.getAction(), "Action should not be null");
        assertEquals("search", item.getAction().getType());
        assertEquals("最近的热点新闻", item.getAction().getQuery());
    }
}
