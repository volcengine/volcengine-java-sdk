package com.volcengine.ark.runtime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.volcengine.ark.runtime.model.responses.content.OutputContentItemText;
import com.volcengine.ark.runtime.model.responses.event.response.*;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.*;
import com.volcengine.ark.runtime.model.responses.event.websearch.*;
import com.volcengine.ark.runtime.model.responses.event.contentpart.*;
import com.volcengine.ark.runtime.model.responses.event.outputtext.*;
import com.volcengine.ark.runtime.model.responses.event.functioncall.*;
import com.volcengine.ark.runtime.model.responses.event.imageprocess.*;
import com.volcengine.ark.runtime.model.responses.item.ItemReasoning;
import com.volcengine.ark.runtime.model.responses.item.ItemWebSearchCall;
import com.volcengine.ark.runtime.model.responses.item.ItemOutputMessage;
import com.volcengine.ark.runtime.model.responses.item.ItemImageProcess;

import java.io.IOException;

public class ResponsesEventDecodeTest {
    private ObjectMapper objectMapper;
    private JsonNode testData;

    public static ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }

    public ResponsesEventDecodeTest() throws IOException {
        objectMapper = defaultObjectMapper();
        loadTestData();
    }

    private void loadTestData() throws IOException {
        // Try to load from file system
        java.io.File file = new java.io.File("/Users/bytedance/Project/Java/volcengine-java-sdk/volcengine-java-sdk-ark-runtime/test/java/com/volcengine/ark/runtime/event_example.json");
        if (file.exists()) {
            testData = objectMapper.readTree(file);
            return;
        }
        file = new java.io.File("event_example.json");
        if (file.exists()) {
            testData = objectMapper.readTree(file);
            return;
        }
        throw new IOException("Cannot find event_example.json in resources or filesystem");
    }

    private JsonNode getTestCase(int index) {
        return testData.get(index);
    }

    private String getTargetClass(int index) {
        return getTestCase(index).get("target_class").asText();
    }

    private JsonNode getEventJson(int index) {
        return getTestCase(index).get("event_json");
    }

    public static void main(String[] args) {
        try {
            ResponsesEventDecodeTest test = new ResponsesEventDecodeTest();
            test.runAllTests();
        } catch (Exception e) {
            System.err.println("Test failed: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void runAllTests() throws IOException {
        System.out.println("Running Jackson deserialization tests...");

        testResponseCreatedEventDeserialization();
        System.out.println("✓ ResponseCreatedEvent deserialization test passed");

        testResponseInProgressEventDeserialization();
        System.out.println("✓ ResponseInProgressEvent deserialization test passed");

        testOutputItemAddedEventDeserialization();
        System.out.println("✓ OutputItemAddedEvent deserialization test passed");

        testReasoningSummaryPartAddedEventDeserialization();
        System.out.println("✓ ReasoningSummaryPartAddedEvent deserialization test passed");

        testReasoningSummaryTextDeltaEventDeserialization();
        System.out.println("✓ ReasoningSummaryTextDeltaEvent deserialization test passed");

        testReasoningSummaryTextDoneEventDeserialization();
        System.out.println("✓ ReasoningSummaryTextDoneEvent deserialization test passed");

        testReasoningSummaryPartDoneEventDeserialization();
        System.out.println("✓ ReasoningSummaryPartDoneEvent deserialization test passed");

        testOutputItemDoneEventDeserialization();
        System.out.println("✓ OutputItemDoneEvent deserialization test passed");

        testWebSearchCallInProgressEventDeserialization();
        System.out.println("✓ WebSearchCallInProgressEvent deserialization test passed");

        testWebSearchCallSearchingEventDeserialization();
        System.out.println("✓ WebSearchCallSearchingEvent deserialization test passed");

        testWebSearchCallCompletedEventDeserialization();
        System.out.println("✓ WebSearchCallCompletedEvent deserialization test passed");

        testContentPartAddedEventDeserialization();
        System.out.println("✓ ContentPartAddedEvent deserialization test passed");

        testOutputTextDeltaEventDeserialization();
        System.out.println("✓ OutputTextDeltaEvent deserialization test passed");

        testAnnotationAddedEventDeserialization();
        System.out.println("✓ AnnotationAddedEvent deserialization test passed");

        testOutputTextDoneEventDeserialization();
        System.out.println("✓ OutputTextDoneEvent deserialization test passed");

        testContentPartDoneEventDeserialization();
        System.out.println("✓ ContentPartDoneEvent deserialization test passed");

        testResponseCompletedEventDeserialization();
        System.out.println("✓ ResponseCompletedEvent deserialization test passed");

        testFunctionCallArgumentsDeltaEventDeserialization();
        System.out.println("✓ FunctionCallArgumentsDeltaEvent deserialization test passed");

        testFunctionCallArgumentsDoneEventDeserialization();
        System.out.println("✓ FunctionCallArgumentsDoneEvent deserialization test passed");

        testImageProcessCallInProgressEventDeserialization();
        System.out.println("✓ ImageProcessCallInProgressEvent deserialization test passed");

        testImageProcessCallProcessingEventDeserialization();
        System.out.println("✓ ImageProcessCallProcessingEvent deserialization test passed");

        testImageProcessCallCompletedEventDeserialization();
        System.out.println("✓ ImageProcessCallCompletedEvent deserialization test passed");

        testImageProcessOutputItemDoneEventDeserialization();
        System.out.println("✓ ImageProcess OutputItemDoneEvent deserialization test passed");

        testWebSearchOutputItemDoneEventDeserialization();
        System.out.println("✓ WebSearch OutputItemDoneEvent deserialization test passed");

        testMessageOutputItemDoneEventDeserialization();
        System.out.println("✓ Message OutputItemDoneEvent deserialization test passed");

        testImageProcessOutputItemAddedEventDeserialization();
        System.out.println("✓ ImageProcess OutputItemAddedEvent deserialization test passed");

        System.out.println("All tests passed successfully!");
    }

    private void assertNotNull(Object obj, String message) {
        if (obj == null) {
            throw new AssertionError(message);
        }
    }

    private void assertEquals(Object expected, Object actual) {
        if (expected == null && actual == null) return;
        if (expected.getClass().equals(java.lang.Integer.class)) {
            // int -> long val
            expected = Long.valueOf((Integer) expected);
        }
        if (actual.getClass().equals(java.lang.Integer.class)) {
            // int -> long val
            actual = Long.valueOf((Integer) actual);
        }
        if (expected == null || actual == null || !expected.equals(actual)) {
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

    public void testResponseCreatedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(0);
        String targetClass = getTargetClass(0);
        JsonNode eventJson = getEventJson(0);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.response.ResponseCreatedEvent", targetClass);

        ResponseCreatedEvent event = objectMapper.treeToValue(eventJson, ResponseCreatedEvent.class);
        assertNotNull(event, "ResponseCreatedEvent should not be null");
        assertEquals("response.created", event.getType());
        assertNotNull(event.getResponse(), "Response should not be null");
        assertEquals("resp_0217551731201226a53a213bff19a4ff8d595763a8584f2d3f4ab", event.getResponse().getId());
        String expectedModel = "doubao-1-5-vision-pro-32k-250115";
        String actualModel = event.getResponse().getModel();
        System.out.println("Model comparison: expected='" + expectedModel + "' actual='" + actualModel + "'");
        assertEquals(expectedModel, actualModel);

        Long expectedSeq = 0L;
        Long actualSeq = event.getSequenceNumber();
        System.out.println("Sequence comparison: expected=" + expectedSeq + " actual=" + actualSeq);
        assertEquals(expectedSeq, actualSeq);
    }

    public void testResponseInProgressEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(1);
        String targetClass = getTargetClass(1);
        JsonNode eventJson = getEventJson(1);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.response.ResponseInProgressEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ResponseInProgressEvent event = objectMapper.readValue(jsonString, ResponseInProgressEvent.class);
        assertNotNull(event, "ResponseInProgressEvent should not be null");
        assertEquals("response.in_progress", event.getType());
        assertNotNull(event.getResponse(), "Response should not be null");
        assertEquals("resp_0217551731201226a53a213bff19a4ff8d595763a8584f2d3f4ab", event.getResponse().getId());
        assertEquals(1, event.getSequenceNumber());
    }

    public void testOutputItemAddedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(2);
        String targetClass = getTargetClass(2);
        JsonNode eventJson = getEventJson(2);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemAddedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputItemAddedEvent event = objectMapper.readValue(jsonString, OutputItemAddedEvent.class);
        assertNotNull(event, "OutputItemAddedEvent should not be null");
        assertEquals("response.output_item.added", event.getType());
        assertEquals(0, event.getOutputIndex());
        assertNotNull(event.getItem(), "Item should not be null");
        assertEquals("rs_02175517312418200000000000000000000ffffc0a858127dc48a", ((ItemReasoning) event.getItem()).getId());
        assertEquals("reasoning", event.getItem().getType());
        assertEquals(2, event.getSequenceNumber());
    }

    public void testReasoningSummaryPartAddedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(3);
        String targetClass = getTargetClass(3);
        JsonNode eventJson = getEventJson(3);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryPartAddedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ReasoningSummaryPartAddedEvent event = objectMapper.readValue(jsonString, ReasoningSummaryPartAddedEvent.class);
        assertNotNull(event, "ReasoningSummaryPartAddedEvent should not be null");
        assertEquals("response.reasoning_summary_part.added", event.getType());
        assertEquals("rs_02175517312418200000000000000000000ffffc0a858127dc48a", event.getItemId());
        assertEquals(0, event.getOutputIndex());
        assertEquals(0, event.getSummaryIndex());
        assertNotNull(event.getPart(), "Part should not be null");
        assertEquals("summary_text", event.getPart().getType());
        assertEquals(3, event.getSequenceNumber());
    }

    public void testReasoningSummaryTextDeltaEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(4);
        String targetClass = getTargetClass(4);
        JsonNode eventJson = getEventJson(4);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryTextDeltaEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ReasoningSummaryTextDeltaEvent event = objectMapper.readValue(jsonString, ReasoningSummaryTextDeltaEvent.class);
        assertNotNull(event, "ReasoningSummaryTextDeltaEvent should not be null");
        assertEquals("response.reasoning_summary_text.delta", event.getType());
        assertEquals("rs_02175517312418200000000000000000000ffffc0a858127dc48a", event.getItemId());
        assertEquals(0, event.getOutputIndex());
        assertEquals(0, event.getSummaryIndex());
        assertEquals("用户", event.getDelta());
        assertEquals(4, event.getSequenceNumber());
    }

    public void testReasoningSummaryTextDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(5);
        String targetClass = getTargetClass(5);
        JsonNode eventJson = getEventJson(5);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryTextDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ReasoningSummaryTextDoneEvent event = objectMapper.readValue(jsonString, ReasoningSummaryTextDoneEvent.class);
        assertNotNull(event, "ReasoningSummaryTextDoneEvent should not be null");
        assertEquals("response.reasoning_summary_text.done", event.getType());
        assertEquals("rs_02175517312418200000000000000000000ffffc0a858127dc48a", event.getItemId());
        assertEquals(0, event.getOutputIndex());
        assertEquals(0, event.getSummaryIndex());
        assertTrue(event.getText().contains("用户现在需要获取最近的热点新闻"), "Text should contain expected content");
        assertEquals(83, event.getSequenceNumber());
    }

    public void testReasoningSummaryPartDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(6);
        String targetClass = getTargetClass(6);
        JsonNode eventJson = getEventJson(6);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryPartDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ReasoningSummaryPartDoneEvent event = objectMapper.readValue(jsonString, ReasoningSummaryPartDoneEvent.class);
        assertNotNull(event, "ReasoningSummaryPartDoneEvent should not be null");
        assertEquals("response.reasoning_summary_part.done", event.getType());
        assertEquals("rs_02175517312418200000000000000000000ffffc0a858127dc48a", event.getItemId());
        assertEquals(0, event.getOutputIndex());
        assertEquals(0, event.getSummaryIndex());
        assertNotNull(event.getPart(), "Part should not be null");
        assertEquals("summary_text", event.getPart().getType());
        assertTrue(event.getPart().getText().contains("用户现在需要获取最近的热点新闻"), "Part text should contain expected content");
        assertEquals(84, event.getSequenceNumber());
    }

    public void testOutputItemDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(7);
        String targetClass = getTargetClass(7);
        JsonNode eventJson = getEventJson(7);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputItemDoneEvent event = objectMapper.readValue(jsonString, OutputItemDoneEvent.class);
        assertNotNull(event, "OutputItemDoneEvent should not be null");
        assertEquals("response.output_item.done", event.getType());
        assertEquals(0, event.getOutputIndex());
        assertNotNull(event.getItem(), "Item should not be null");
        assertEquals("rs_02175517312418200000000000000000000ffffc0a858127dc48a", ((ItemReasoning) (event.getItem())).getId());
        assertEquals("reasoning", event.getItem().getType());
        assertEquals("completed", ((ItemReasoning) (event.getItem())).getStatus());
        assertNotNull(((ItemReasoning) (event.getItem())).getSummary(), "Summary should not be null");
        assertEquals(1, ((ItemReasoning) (event.getItem())).getSummary().size());
        assertEquals(85, event.getSequenceNumber());
    }

    public void testWebSearchCallInProgressEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(8);
        String targetClass = getTargetClass(8);
        JsonNode eventJson = getEventJson(8);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.websearch.WebSearchCallInProgressEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        WebSearchCallInProgressEvent event = objectMapper.readValue(jsonString, WebSearchCallInProgressEvent.class);
        assertNotNull(event, "WebSearchCallInProgressEvent should not be null");
        assertEquals("response.web_search_call.in_progress", event.getType());
        assertEquals("ws_02175517312524700000000000000000000ffffc0a85812c47e55", event.getItemId());
        assertEquals(1, event.getOutputIndex());
        assertEquals(87, event.getSequenceNumber());
    }

    public void testWebSearchCallSearchingEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(9);
        String targetClass = getTargetClass(9);
        JsonNode eventJson = getEventJson(9);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.websearch.WebSearchCallSearchingEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        WebSearchCallSearchingEvent event = objectMapper.readValue(jsonString, WebSearchCallSearchingEvent.class);
        assertNotNull(event, "WebSearchCallSearchingEvent should not be null");
        assertEquals("response.web_search_call.searching", event.getType());
        assertEquals("ws_02175517312524700000000000000000000ffffc0a85812c47e55", event.getItemId());
        assertEquals(1, event.getOutputIndex());
        assertEquals(88, event.getSequenceNumber());
    }

    public void testWebSearchCallCompletedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(10);
        String targetClass = getTargetClass(10);
        JsonNode eventJson = getEventJson(10);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.websearch.WebSearchCallCompletedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        WebSearchCallCompletedEvent event = objectMapper.readValue(jsonString, WebSearchCallCompletedEvent.class);
        assertNotNull(event, "WebSearchCallCompletedEvent should not be null");
        assertEquals("response.web_search_call.completed", event.getType());
        assertEquals("ws_02175517312524700000000000000000000ffffc0a85812c47e55", event.getItemId());
        assertEquals(1, event.getOutputIndex());
        assertEquals(89, event.getSequenceNumber());
    }

    public void testContentPartAddedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(11);
        String targetClass = getTargetClass(11);
        JsonNode eventJson = getEventJson(11);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.contentpart.ContentPartAddedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ContentPartAddedEvent event = objectMapper.readValue(jsonString, ContentPartAddedEvent.class);
        assertNotNull(event, "ContentPartAddedEvent should not be null");
        assertEquals("response.content_part.added", event.getType());
        assertEquals(0, event.getContentIndex());
        assertEquals("msg_02175517314733400000000000000000000ffffc0a85812e12141", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getPart(), "Part should not be null");
        assertEquals("output_text", event.getPart().getType());
        assertEquals(1766, event.getSequenceNumber());
    }

    public void testOutputTextDeltaEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(12);
        String targetClass = getTargetClass(12);
        JsonNode eventJson = getEventJson(12);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDeltaEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputTextDeltaEvent event = objectMapper.readValue(jsonString, OutputTextDeltaEvent.class);
        assertNotNull(event, "OutputTextDeltaEvent should not be null");
        assertEquals("response.output_text.delta", event.getType());
        assertEquals(0, event.getContentIndex());
        assertEquals("msg_02175517314733400000000000000000000ffffc0a85812e12141", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertEquals("以下", event.getDelta());
        assertEquals(1767, event.getSequenceNumber());
    }

    public void testAnnotationAddedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(13);
        String targetClass = getTargetClass(13);
        JsonNode eventJson = getEventJson(13);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputtext.AnnotationAddedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        AnnotationAddedEvent event = objectMapper.readValue(jsonString, AnnotationAddedEvent.class);
        assertNotNull(event, "AnnotationAddedEvent should not be null");
        assertEquals("response.output_text.annotation.added", event.getType());
        assertEquals(0, event.getContentIndex());
        assertEquals("msg_02175517314733400000000000000000000ffffc0a85812e12141", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getAnnotation(), "Annotation should not be null");
        assertEquals("url_citation", event.getAnnotation().getType());
        assertEquals("即时新闻", event.getAnnotation().getTitle());
        assertEquals(1768, event.getSequenceNumber());
    }

    public void testOutputTextDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(14);
        String targetClass = getTargetClass(14);
        JsonNode eventJson = getEventJson(14);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputTextDoneEvent event = objectMapper.readValue(jsonString, OutputTextDoneEvent.class);
        assertNotNull(event, "OutputTextDoneEvent should not be null");
        assertEquals("response.output_text.done", event.getType());
        assertEquals(0, event.getContentIndex());
        assertEquals("msg_02175517314733400000000000000000000ffffc0a85812e12141", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertTrue(event.getText().contains("以下是近期（2025年8月前后）的热点新闻整理"), "Text should contain expected content");
        assertEquals(2726, event.getSequenceNumber());
    }

    public void testContentPartDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(15);
        String targetClass = getTargetClass(15);
        JsonNode eventJson = getEventJson(15);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.contentpart.ContentPartDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ContentPartDoneEvent event = objectMapper.readValue(jsonString, ContentPartDoneEvent.class);
        assertNotNull(event, "ContentPartDoneEvent should not be null");
        assertEquals("response.content_part.done", event.getType());
        assertEquals(0, event.getContentIndex());
        assertEquals("msg_02175517314733400000000000000000000ffffc0a85812e12141", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getPart(), "Part should not be null");
        assertEquals("output_text", event.getPart().getType());
        assertTrue(((OutputContentItemText) event.getPart()).getText().contains("以下是近期（2025年8月前后）的热点新闻整理"), "Part text should contain expected content");
        assertNotNull(((OutputContentItemText) event.getPart()).getAnnotations(), "Annotations should not be null");
        assertTrue(!((OutputContentItemText) event.getPart()).getAnnotations().isEmpty(), "Should have annotations");
        assertEquals(2727, event.getSequenceNumber());
    }

    public void testResponseCompletedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(16);
        String targetClass = getTargetClass(16);
        JsonNode eventJson = getEventJson(16);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.response.ResponseCompletedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ResponseCompletedEvent event = objectMapper.readValue(jsonString, ResponseCompletedEvent.class);
        assertNotNull(event, "ResponseCompletedEvent should not be null");
        assertEquals("response.completed", event.getType());
        assertNotNull(event.getResponse(), "Response should not be null");
        assertEquals("resp_0217551731201226a53a213bff19a4ff8d595763a8584f2d3f4ab", event.getResponse().getId());
        assertEquals("completed", event.getResponse().getStatus());
        assertNotNull(event.getResponse().getOutput(), "Output should not be null");
        assertEquals(4, event.getResponse().getOutput().size());
        assertEquals(2729, event.getSequenceNumber());
    }

    public void testFunctionCallArgumentsDeltaEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(17);
        String targetClass = getTargetClass(17);
        JsonNode eventJson = getEventJson(17);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.functioncall.FunctionCallArgumentsDeltaEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        FunctionCallArgumentsDeltaEvent event = objectMapper.readValue(jsonString, FunctionCallArgumentsDeltaEvent.class);
        assertNotNull(event, "FunctionCallArgumentsDeltaEvent should not be null");
        assertEquals("response.function_call_arguments.delta", event.getType());
        assertEquals("fc_02175517480125400000000000000000000ffffc0a858123eece9", event.getItemId());
        assertEquals(1, event.getOutputIndex());
        assertEquals("", event.getDelta());
        assertEquals(80, event.getSequenceNumber());
    }

    public void testFunctionCallArgumentsDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(18);
        String targetClass = getTargetClass(18);
        JsonNode eventJson = getEventJson(18);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.functioncall.FunctionCallArgumentsDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        FunctionCallArgumentsDoneEvent event = objectMapper.readValue(jsonString, FunctionCallArgumentsDoneEvent.class);
        assertNotNull(event, "FunctionCallArgumentsDoneEvent should not be null");
        assertEquals("response.function_call_arguments.done", event.getType());
        assertEquals("fc_02175517480125400000000000000000000ffffc0a858123eece9", event.getItemId());
        assertEquals(1, event.getOutputIndex());
        assertEquals(" {\"location\": \"Beijing\", \"unit\": \"celsius\"}", event.getArguments());
        assertEquals(94, event.getSequenceNumber());
    }

    public void testImageProcessCallInProgressEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(19);
        String targetClass = getTargetClass(19);
        JsonNode eventJson = getEventJson(19);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.imageprocess.ImageProcessCallInProgressEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ImageProcessCallInProgressEvent event = objectMapper.readValue(jsonString, ImageProcessCallInProgressEvent.class);
        assertNotNull(event, "ImageProcessCallInProgressEvent should not be null");
        assertEquals("response.image_process_call.in_progress", event.getType());
        assertEquals("ip_02175517505212200000000000000000000ffffc0a85812ec843c", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertEquals(460, event.getSequenceNumber());
    }

    public void testImageProcessCallProcessingEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(20);
        String targetClass = getTargetClass(20);
        JsonNode eventJson = getEventJson(20);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.imageprocess.ImageProcessCallProcessingEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ImageProcessCallProcessingEvent event = objectMapper.readValue(jsonString, ImageProcessCallProcessingEvent.class);
        assertNotNull(event, "ImageProcessCallProcessingEvent should not be null");
        assertEquals("response.image_process_call.progressing", event.getType());
        assertEquals("ip_02175517505212200000000000000000000ffffc0a85812ec843c", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getAction(), "Action should not be null");
        assertEquals("grounding", event.getAction().getType());
        assertNotNull(event.getArguments(), "Arguments should not be null");
        assertEquals(0, event.getArguments().getImageIndex());
        assertTrue(event.getArguments().getBboxStr().contains("<bbox>"), "BboxStr should contain bounding box data");
        assertEquals(false, event.getArguments().getCrop());
        assertEquals(461, event.getSequenceNumber());
    }

    public void testImageProcessCallCompletedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(21);
        String targetClass = getTargetClass(21);
        JsonNode eventJson = getEventJson(21);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.imageprocess.ImageProcessCallCompletedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        ImageProcessCallCompletedEvent event = objectMapper.readValue(jsonString, ImageProcessCallCompletedEvent.class);
        assertNotNull(event, "ImageProcessCallCompletedEvent should not be null");
        assertEquals("response.image_process_call.completed", event.getType());
        assertEquals("ip_02175517505212200000000000000000000ffffc0a85812ec843c", event.getItemId());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getAction(), "Action should not be null");
        assertEquals("grounding", event.getAction().getType());
        assertNotNull(event.getAction().getResultImageUrl(), "Result image URL should not be null");
        assertTrue(event.getAction().getResultImageUrl().contains("https://"), "Result image URL should be a valid URL");
        assertNotNull(event.getArguments(), "Arguments should not be null");
        assertEquals(0, event.getArguments().getImageIndex());
        assertTrue(event.getArguments().getBboxStr().contains("<bbox>"), "BboxStr should contain bounding box data");
        assertEquals(false, (event.getArguments()).getCrop());
        assertEquals(462, event.getSequenceNumber());
    }

    public void testImageProcessOutputItemDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(22);
        String targetClass = getTargetClass(22);
        JsonNode eventJson = getEventJson(22);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputItemDoneEvent event = objectMapper.readValue(jsonString, OutputItemDoneEvent.class);
        assertNotNull(event, "OutputItemDoneEvent should not be null");
        assertEquals("response.output_item.done", event.getType());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getItem(), "Item should not be null");
        
        ItemImageProcess item = (ItemImageProcess) event.getItem();
        assertEquals("ip_02175517505212200000000000000000000ffffc0a85812ec843c", item.getId());
        assertEquals("image_process", item.getType());
        assertEquals("completed", item.getStatus());
        assertEquals(463, event.getSequenceNumber());
    }

    public void testWebSearchOutputItemDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(23);
        String targetClass = getTargetClass(23);
        JsonNode eventJson = getEventJson(23);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputItemDoneEvent event = objectMapper.readValue(jsonString, OutputItemDoneEvent.class);
        assertNotNull(event, "OutputItemDoneEvent should not be null");
        assertEquals("response.output_item.done", event.getType());
        assertEquals(1, event.getOutputIndex());
        assertNotNull(event.getItem(), "Item should not be null");
        
        ItemWebSearchCall item = (ItemWebSearchCall) event.getItem();
        assertEquals("ws_02175517312524700000000000000000000ffffc0a85812c47e55", item.getId());
        assertEquals("web_search_call", item.getType());
        assertEquals("completed", item.getStatus());
        assertNotNull(item.getAction(), "Action should not be null");
        assertEquals("search", item.getAction().getType());
        assertEquals("最近热点新闻", item.getAction().getQuery());
        assertEquals(90, event.getSequenceNumber());
    }

    public void testMessageOutputItemDoneEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(24);
        String targetClass = getTargetClass(24);
        JsonNode eventJson = getEventJson(24);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputItemDoneEvent event = objectMapper.readValue(jsonString, OutputItemDoneEvent.class);
        assertNotNull(event, "OutputItemDoneEvent should not be null");
        assertEquals("response.output_item.done", event.getType());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getItem(), "Item should not be null");
        
        ItemOutputMessage item = (ItemOutputMessage) event.getItem();
        assertEquals("msg_02175517314733400000000000000000000ffffc0a85812e12141", item.getId());
        assertEquals("message", item.getType());
        assertEquals("completed", item.getStatus());
        assertNotNull(item.getContent(), "Content should not be null");
        assertEquals(1, item.getContent().size());
        assertEquals("assistant", item.getRole());
        assertEquals(2728, event.getSequenceNumber());
    }

    public void testImageProcessOutputItemAddedEventDeserialization() throws IOException {
        JsonNode testCase = getTestCase(27);
        String targetClass = getTargetClass(27);
        JsonNode eventJson = getEventJson(27);

        assertEquals("com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemAddedEvent", targetClass);

        String jsonString = objectMapper.writeValueAsString(eventJson);
        OutputItemAddedEvent event = objectMapper.readValue(jsonString, OutputItemAddedEvent.class);
        assertNotNull(event, "OutputItemAddedEvent should not be null");
        assertEquals("response.output_item.added", event.getType());
        assertEquals(3, event.getOutputIndex());
        assertNotNull(event.getItem(), "Item should not be null");
        
        ItemImageProcess item = (ItemImageProcess) event.getItem();
        assertEquals("ip_02175517505212200000000000000000000ffffc0a85812ec843c", item.getId());
        assertEquals("image_process", item.getType());
        assertEquals("in_progress", item.getStatus());
        assertEquals(459, event.getSequenceNumber());
    }
}
