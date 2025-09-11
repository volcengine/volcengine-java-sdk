package com.volcengine.ark.runtime;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.model.responses.common.ResponsesThinking;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.*;
import com.volcengine.ark.runtime.model.responses.event.StreamEvent;
import com.volcengine.ark.runtime.model.responses.event.functioncall.FunctionCallArgumentsDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.response.ResponseCompletedEvent;
import com.volcengine.ark.runtime.model.responses.item.*;
import com.volcengine.ark.runtime.model.responses.request.ResponsesInput;
import com.volcengine.ark.runtime.model.responses.request.CreateResponsesRequest;
import com.volcengine.ark.runtime.model.responses.response.ResponseObject;
import com.volcengine.ark.runtime.model.responses.tool.*;
import com.volcengine.ark.runtime.model.responses.tool.mcp.MCPRequireApproval;
import com.volcengine.ark.runtime.service.ArkService;
import io.reactivex.Flowable;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class CreateResponseExample {

    private static final String modelName = "doubao-seed-1-6-250615";

    public static void main(String[] args) {
        String apiKey = System.getenv("ARK_API_KEY");
        if (apiKey == null) {
            System.out.println("ARK_API_KEY environment variable not set");
            return;
        }

        ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(5000);
        dispatcher.setMaxRequestsPerHost(5000);
        ArkService service = ArkService.builder().dispatcher(dispatcher).timeout(Duration.ofHours(1)).connectionPool(connectionPool).apiKey(apiKey).build();


        System.out.println("\n----- [Standard Usage] Request 1-----");

        CreateResponsesRequest request = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(false)
                .instructions("请使用中文与我沟通")
                .input(ResponsesInput.builder().stringValue("hello").build())
                .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                .build();

        ResponseObject response1;

        try {
            response1 = service.createResponse(request);
            printResponseObject(response1);
        } catch (Exception e) {
            System.err.println("Create Response 1 Error " + e.getMessage());
            return;
        }

        System.out.println("\n----- [With Previous Response] Request 2-----");

        // NOTICE: the response store is async, so need a latency here
        try {
            Thread.sleep(200);
        } catch (Throwable e) {
            // ignore
        }

        CreateResponsesRequest request2 = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(false)
                .previousResponseId(response1.getId()) // with previous response id
                .instructions("请使用中文与我沟通")
                .input(ResponsesInput.builder().stringValue("我刚才说了什么？").build())
                .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_DISABLED).build())
                .build();

        ResponseObject response2;

        try {
            response2 = service.createResponse(request2);
            printResponseObject(response2);
        } catch (Exception e) {
            System.err.println("Create Response 2 Error: " + e.getMessage());
        }

        System.out.println("\n----- [With MultiMedia Input] Request 3-----");

        CreateResponsesRequest request3 = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(false)
                .input(ResponsesInput.builder().addListItem(
                        ItemEasyMessage.builder().role(ResponsesConstants.MESSAGE_ROLE_USER).content(
                                MessageContent.builder()
                                        .addListItem(InputContentItemImage.builder().imageUrl("https://ark-project.tos-cn-beijing.volces.com/images/view.jpeg").build())
                                        .addListItem(InputContentItemText.builder().text("这是哪里？").build())
                                        .build()
                        ).build()
                ).build())
                .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                .build();

        ResponseObject response3;

        try {
            response3 = service.createResponse(request3);
            printResponseObject(response3);
        } catch (Exception e) {
            System.err.println("Create Response 3 Error: " + e.getMessage());
        }


        System.out.println("\n----- [Stream Request] Request 4-----");

        CreateResponsesRequest request4 = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(true)
                .instructions("请使用中文与我沟通")
                .input(ResponsesInput.builder().stringValue("hello").build())
                .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                .build();

        try {
            service.streamResponse(request4)
                    .doOnError(Throwable::printStackTrace)
                    .blockingForEach(
                            CreateResponseExample::printStreamEvent
                    );
        } catch (Exception e) {
            System.err.println("Create Response 4 Error " + e.getMessage());
        }

        System.out.println("\n----- [Stream FunctionCall Request] Request 5-----");

        try {
            ResponsesTool weatherTool = ToolFunction.builder()
                    .name("sum")
                    .description("add two integers and get sum")
                    .parameters(
                            new ObjectMapper().readTree("{\"type\":\"object\",\"properties\":{\"a\":{\"type\":\"integer\",\"description\":\"first number to add\"},\"b\":{\"type\":\"integer\",\"description\":\"second number to add\"}},\"required\":[\"a\",\"b\"]}")
                    ).build();

            CreateResponsesRequest fcRequest = CreateResponsesRequest.builder()
                    .model(modelName)
                    .stream(true)
                    .input(ResponsesInput.builder().stringValue("1000123+123 = ?").build())
                    .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                    .tools(Collections.singletonList(weatherTool))
                    .build();

            AtomicReference<String> fcResponseId = new AtomicReference<>();
            AtomicReference<String> fcCallbackId = new AtomicReference<>();

            Flowable<StreamEvent> fcResponse = service.streamResponse(fcRequest);
            fcResponse.doOnError(Throwable::printStackTrace)
                    .blockingForEach(
                            event -> {
                                printStreamEvent(event);
                                if (event instanceof OutputItemDoneEvent) {
                                    if (((OutputItemDoneEvent) event).getItem() instanceof ItemFunctionToolCall) {
                                        fcCallbackId.set(((ItemFunctionToolCall) ((OutputItemDoneEvent) event).getItem()).getCallId());
                                    }
                                }
                                if (event instanceof ResponseCompletedEvent) {
                                    fcResponseId.set(((ResponseCompletedEvent) event).getResponse().getId());
                                }
                            }
                    );

            CreateResponsesRequest fcOutputRequest = CreateResponsesRequest.builder()
                    .model(modelName)
                    .stream(true)
                    .previousResponseId(fcResponseId.get()) // use the context before
                    .input(ResponsesInput.builder().addListItem(
                            ItemFunctionToolCallOutput.builder()
                                    .callId(fcCallbackId.get()) // with tool call id
                                    .output("1000246") // mock a tool result
                                    .build()
                    ).build())
                    .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                    .tools(Collections.singletonList(weatherTool))
                    .build();

            System.out.println(new ObjectMapper().writeValueAsString(fcOutputRequest));

            System.out.println("=== fc final response ===");

            service.streamResponse(fcOutputRequest)
                    .doOnError(Throwable::printStackTrace)
                    .blockingForEach(
                            CreateResponseExample::printStreamEvent
                    );

        } catch (Exception e) {
            System.err.println("Create Response 4 Error " + e.getMessage());
        }

        System.out.println("\n----- [Stream Request with MCP] Request 5-----");

        CreateResponsesRequest request5 = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(true)
                .tools(Collections.singletonList(ToolMCP.builder().serverLabel("deepwiki-test").serverUrl("https://mcp.deepwiki.com/mcp")
                        .requireApproval(MCPRequireApproval.builder().mode(ResponsesConstants.MCP_APPROVAL_MODE_NEVER).build()).build()))
                .input(ResponsesInput.builder().stringValue("查看这个 repo的strcuture expressjs/express ").build())
                .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                .build();

        try {
            service.streamResponse(request5)
                    .doOnError(Throwable::printStackTrace)
                    .blockingForEach(
                            CreateResponseExample::printStreamEvent
                    );
        } catch (Exception e) {
            System.err.println("Create Response 5 Error " + e.getMessage());
        }

        System.out.println("\n----- [Stream FunctionCall Request] Request 6-----");

        try {
            ResponsesTool weatherTool = ToolFunction.builder()
                    .name("sum")
                    .description("add two integers and get sum")
                    .parameters(
                            new ObjectMapper().readTree("{\"type\":\"object\",\"properties\":{\"a\":{\"type\":\"integer\",\"description\":\"first number to add\"},\"b\":{\"type\":\"integer\",\"description\":\"second number to add\"}},\"required\":[\"a\",\"b\"]}")
                    ).build();

            CreateResponsesRequest fcRequest = CreateResponsesRequest.builder()
                    .model(modelName)
                    .stream(true)
                    .input(ResponsesInput.builder().stringValue("1000123+123 = ?").build())
                    .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                    .tools(Collections.singletonList(weatherTool))
                    .toolChoice(ResponsesToolChoice.builder().functionToolChoice(
                            FunctionToolChoice.builder().type("function").name("sum").build()
                    ).build())
                    .build();

            AtomicReference<String> fcResponseId = new AtomicReference<>();
            AtomicReference<String> fcCallbackId = new AtomicReference<>();

            Flowable<StreamEvent> fcResponse = service.streamResponse(fcRequest);
            fcResponse.doOnError(Throwable::printStackTrace)
                    .blockingForEach(
                            event -> {
                                printStreamEvent(event);
                                if (event instanceof OutputItemDoneEvent) {
                                    if (((OutputItemDoneEvent) event).getItem() instanceof ItemFunctionToolCall) {
                                        fcCallbackId.set(((ItemFunctionToolCall) ((OutputItemDoneEvent) event).getItem()).getCallId());
                                    }
                                }
                                if (event instanceof ResponseCompletedEvent) {
                                    fcResponseId.set(((ResponseCompletedEvent) event).getResponse().getId());
                                }
                            }
                    );

            CreateResponsesRequest fcOutputRequest = CreateResponsesRequest.builder()
                    .model(modelName)
                    .stream(true)
                    .previousResponseId(fcResponseId.get()) // use the context before
                    .input(ResponsesInput.builder().addListItem(
                            ItemFunctionToolCallOutput.builder()
                                    .callId(fcCallbackId.get()) // with tool call id
                                    .output("1000246") // mock a tool result
                                    .build()
                    ).build())
                    .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_ENABLED).build())
                    .tools(Collections.singletonList(weatherTool))
                    .build();

            System.out.println(new ObjectMapper().writeValueAsString(fcOutputRequest));

            System.out.println("=== fc final response ===");

            service.streamResponse(fcOutputRequest)
                    .doOnError(Throwable::printStackTrace)
                    .blockingForEach(
                            CreateResponseExample::printStreamEvent
                    );

        } catch (Exception e) {
            System.err.println("Create Response 6 Error " + e.getMessage());
        }

        service.shutdownExecutor();
    }

    private static void printStreamEvent(StreamEvent event) {
        if (event instanceof ReasoningSummaryTextDeltaEvent) {
            System.out.print(((ReasoningSummaryTextDeltaEvent) event).getDelta());
        }
        if (event instanceof OutputItemAddedEvent) {
            System.out.println("OutputItem " + (((OutputItemAddedEvent) event).getItem().getType()) + " Start: ");
        }
        if (event instanceof OutputTextDeltaEvent) {
            System.out.print(((OutputTextDeltaEvent) event).getDelta());
        }
        if (event instanceof OutputTextDoneEvent) {
            System.out.print("\nOutputText End.\n");
        }
        if (event instanceof OutputItemDoneEvent) {
            System.out.println("\nOutputItem " + ((OutputItemDoneEvent) event).getItem().getType() + " End.\n");
        }
        if (event instanceof FunctionCallArgumentsDoneEvent) {
            System.out.println("FunctionCall Arguments: " + ((FunctionCallArgumentsDoneEvent) event).getArguments());
        }
        if (event instanceof ResponseCompletedEvent) {
            System.out.println("Response Completed. Usage = " + ((ResponseCompletedEvent) event).getResponse().getUsage());
        }
    }

    private static void printResponseObject(ResponseObject responseObject) {
        System.out.println("Response ID: " + responseObject.getId());
        System.out.println("Status: " + responseObject.getStatus());
        if (responseObject.getOutput() != null && !responseObject.getOutput().isEmpty()) {
            for (BaseItem outputItem : responseObject.getOutput()) {
                if (outputItem instanceof ItemReasoning) {
                    ItemReasoning itemReasoning = (ItemReasoning) outputItem;
                    System.out.println("Reasoning Summary:");
                    for (ReasoningSummaryPart summaryPart : itemReasoning.getSummary()) {
                        System.out.println(summaryPart.getText());
                    }
                }
                if (outputItem instanceof ItemOutputMessage) {
                    ItemOutputMessage itemOutputMessage = (ItemOutputMessage) outputItem;
                    System.out.println("Output Message:");
                    for (OutputContentItem item : itemOutputMessage.getContent()) {
                        if (item instanceof OutputContentItemText) {
                            OutputContentItemText textItem = (OutputContentItemText) item;
                            System.out.println(textItem.getText());
                        }
                    }
                }
            }
        }
        if (responseObject.getUsage() != null) {
            System.out.println("Usage: " + responseObject.getUsage());
        }
    }
}
