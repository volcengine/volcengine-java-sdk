package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.responses.common.ResponsesThinking;
import com.volcengine.ark.runtime.model.responses.content.OutputContentItemText;
import com.volcengine.ark.runtime.model.responses.event.StreamEvent;
import com.volcengine.ark.runtime.model.responses.event.knowledgesearch.KnowledgeSearchCallCompletedEvent;
import com.volcengine.ark.runtime.model.responses.event.knowledgesearch.KnowledgeSearchCallFailedEvent;
import com.volcengine.ark.runtime.model.responses.event.knowledgesearch.KnowledgeSearchCallInProgressEvent;
import com.volcengine.ark.runtime.model.responses.event.knowledgesearch.KnowledgeSearchCallSearchingEvent;
import com.volcengine.ark.runtime.model.responses.event.functioncall.FunctionCallArgumentsDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.response.ResponseCompletedEvent;
import com.volcengine.ark.runtime.model.responses.item.BaseItem;
import com.volcengine.ark.runtime.model.responses.item.ItemFunctionKnowledgeSearch;
import com.volcengine.ark.runtime.model.responses.item.ItemOutputMessage;
import com.volcengine.ark.runtime.model.responses.request.CreateResponsesRequest;
import com.volcengine.ark.runtime.model.responses.request.ResponsesInput;
import com.volcengine.ark.runtime.model.responses.response.ResponseObject;
import com.volcengine.ark.runtime.model.responses.tool.ResponsesTool;
import com.volcengine.ark.runtime.model.responses.tool.ResponsesToolChoice;
import com.volcengine.ark.runtime.model.responses.tool.ToolKnowledgeSearch;
import com.volcengine.ark.runtime.service.ArkService;
import io.reactivex.Flowable;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

public class KnowledgeSearchCreateResponsesExample {

    private static final String MODEL_NAME = "your-model-name";
    private static final String KNOWLEDGE_RESOURCE_ID = "kb-xxxxxxxxxxxxxx";

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
        ArkService service = ArkService.builder()
                .dispatcher(dispatcher)
                .timeout(Duration.ofHours(1))
                .connectionPool(connectionPool)
                .apiKey(apiKey)
                .build();

        Map<String, String> headers = new HashMap<>();
        headers.put("ark-beta-knowledge-search", "true");

        System.out.println("\n----- Example of Knowledge Search -----");

        CreateResponsesRequest request = CreateResponsesRequest.builder()
                .model(MODEL_NAME)
                .stream(false)
                .toolChoice(ResponsesToolChoice.builder().mode("required").build())
                .maxToolCalls(1L)
                .thinking(ResponsesThinking.builder().type("disabled").build())
                .tools(Arrays.asList(
                        ToolKnowledgeSearch.builder()
                                .knowledgeResourceId(KNOWLEDGE_RESOURCE_ID)
                                .description("Your knowledge base description")
                                .limit(3L)
                                .denseWeight(0.5)
                                .build()
                ))
                .input(ResponsesInput.builder().stringValue("briefly describe what content is in the knowledge base").build())
                .build();

        ResponseObject response;
        try {
            response = service.createResponse(request, headers);
            printResponseObject(response);
        } catch (Exception e) {
            System.err.println("Create Response Error: " + e.getMessage());
            return;
        }

        System.out.println("\n----- Example of Knowledge Search (Streaming) -----");

        CreateResponsesRequest streamRequest = CreateResponsesRequest.builder()
                .model(MODEL_NAME)
                .stream(true)
                .tools(Arrays.asList(
                        ToolKnowledgeSearch.builder()
                                .knowledgeResourceId(KNOWLEDGE_RESOURCE_ID)
                                .description("Your knowledge base description")
                                .limit(5L)
                                .build()
                ))
                .input(ResponsesInput.builder().stringValue("briefly describe what content is in the knowledge base").build())
                .build();

        try {
            Flowable<StreamEvent> streamResponse = service.streamResponse(streamRequest, headers);
            streamResponse.blockingForEach(KnowledgeSearchCreateResponsesExample::printStreamEvent);
        } catch (Exception e) {
            System.err.println("Create Response Error: " + e.getMessage());
            return;
        }

        service.shutdownExecutor();
    }

    private static void printStreamEvent(StreamEvent event) {
        if (event instanceof KnowledgeSearchCallInProgressEvent) {
            System.out.println("[KnowledgeSearch] In progress, itemId: " + ((KnowledgeSearchCallInProgressEvent) event).getItemId());
        }
        if (event instanceof KnowledgeSearchCallSearchingEvent) {
            System.out.println("[KnowledgeSearch] Searching, itemId: " + ((KnowledgeSearchCallSearchingEvent) event).getItemId());
        }
        if (event instanceof KnowledgeSearchCallCompletedEvent) {
            System.out.println("[KnowledgeSearch] Completed, itemId: " + ((KnowledgeSearchCallCompletedEvent) event).getItemId());
        }
        if (event instanceof KnowledgeSearchCallFailedEvent) {
            System.out.println("[KnowledgeSearch] Failed, itemId: " + ((KnowledgeSearchCallFailedEvent) event).getItemId());
        }
        if (event instanceof ReasoningSummaryTextDeltaEvent) {
            System.out.print(((ReasoningSummaryTextDeltaEvent) event).getDelta());
        }
        if (event instanceof OutputItemAddedEvent) {
            System.out.println("[OutputItem] Added: " + ((OutputItemAddedEvent) event).getItem().getType());
        }
        if (event instanceof OutputTextDeltaEvent) {
            System.out.print(((OutputTextDeltaEvent) event).getDelta());
        }
        if (event instanceof OutputTextDoneEvent) {
            System.out.println("\n[Text] End");
        }
        if (event instanceof OutputItemDoneEvent) {
            System.out.println("\n[OutputItem] Done: " + ((OutputItemDoneEvent) event).getItem().getType());
        }
        if (event instanceof ResponseCompletedEvent) {
            System.out.println("[Response] Completed. Usage: " + ((ResponseCompletedEvent) event).getResponse().getUsage());
        }
    }

    private static void printResponseObject(ResponseObject responseObject) {
        System.out.println("Response ID: " + responseObject.getId());
        System.out.println("Status: " + responseObject.getStatus());

        if (responseObject.getOutput() != null && !responseObject.getOutput().isEmpty()) {
            for (BaseItem outputItem : responseObject.getOutput()) {
                if (outputItem instanceof ItemOutputMessage) {
                    ItemOutputMessage messageItem = (ItemOutputMessage) outputItem;
                    System.out.println("Message role: " + messageItem.getRole());
                    if (messageItem.getContent() != null) {
                        for (Object content : messageItem.getContent()) {
                            if (content instanceof OutputContentItemText) {
                                OutputContentItemText textContent = (OutputContentItemText) content;
                                System.out.println("Output text: " + textContent.getText());
                                if (textContent.getAnnotations() != null && !textContent.getAnnotations().isEmpty()) {
                                    System.out.println("Annotations count: " + textContent.getAnnotations().size());
                                    textContent.getAnnotations().forEach(annotation -> {
                                        System.out.println("  - Annotation type: " + annotation.getType());
                                        if ("doc_citation".equals(annotation.getType())) {
                                            System.out.println("    docId: " + annotation.getDocId());
                                            System.out.println("    docName: " + annotation.getDocName());
                                            System.out.println("    chunkId: " + annotation.getChunkId());
                                        } else {
                                            System.out.println("    title: " + annotation.getTitle());
                                            System.out.println("    url: " + annotation.getUrl());
                                        }
                                    });
                                }
                            }
                        }
                    }
                } else if (outputItem instanceof ItemFunctionKnowledgeSearch) {
                    ItemFunctionKnowledgeSearch knowledgeSearchItem = (ItemFunctionKnowledgeSearch) outputItem;
                    System.out.println("Knowledge search item:");
                    System.out.println("  - queries: " + knowledgeSearchItem.getQueries());
                    System.out.println("  - knowledgeResourceId: " + knowledgeSearchItem.getKnowledgeResourceId());
                    System.out.println("  - status: " + knowledgeSearchItem.getStatus());
                }
            }
        }

        if (responseObject.getUsage() != null) {
            System.out.println("Usage: " + responseObject.getUsage());
        }
    }
}
