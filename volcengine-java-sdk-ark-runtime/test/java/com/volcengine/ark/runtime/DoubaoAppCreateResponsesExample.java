package com.volcengine.ark.runtime;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.ark.runtime.model.responses.common.ResponsesCaching;
import com.volcengine.ark.runtime.model.responses.common.ResponsesThinking;
import com.volcengine.ark.runtime.model.responses.common.UserLocation;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.*;
import com.volcengine.ark.runtime.model.responses.event.StreamEvent;
import com.volcengine.ark.runtime.model.responses.event.doubaoapp.*;
import com.volcengine.ark.runtime.model.responses.event.functioncall.FunctionCallArgumentsDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemAddedEvent;
import com.volcengine.ark.runtime.model.responses.event.outputitem.OutputItemDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.outputtext.OutputTextDoneEvent;
import com.volcengine.ark.runtime.model.responses.event.reasoningsummary.ReasoningSummaryTextDeltaEvent;
import com.volcengine.ark.runtime.model.responses.event.response.ResponseCompletedEvent;
import com.volcengine.ark.runtime.model.responses.item.*;
import com.volcengine.ark.runtime.model.responses.item.doubaoapp.*;
import com.volcengine.ark.runtime.model.responses.request.ResponsesInput;
import com.volcengine.ark.runtime.model.responses.request.CreateResponsesRequest;
import com.volcengine.ark.runtime.model.responses.response.ResponseObject;
import com.volcengine.ark.runtime.model.responses.tool.*;
import com.volcengine.ark.runtime.model.responses.tool.doubaoapp.DoubaoAppFeature;
import com.volcengine.ark.runtime.model.responses.tool.doubaoapp.DoubaoAppFeatureItem;
import com.volcengine.ark.runtime.service.ArkService;
import io.reactivex.Flowable;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DoubaoAppCreateResponsesExample {

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

        Map<String, String> headers = new HashMap<>();
        // add this header to enable the beta feature
        headers.put("ark-beta-doubao-app", "true");


        System.out.println("\n----- Example of NormalChat-----");

        CreateResponsesRequest request = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(false)
                .tools(Arrays.asList(
                        ToolDoubaoApp.builder()
                                .feature(
                                        DoubaoAppFeature.builder().chat(
                                                DoubaoAppFeatureItem.builder()
                                                        .type(ResponsesConstants.RESPONSE_DOBAO_APP_FEATURE_TYPE_ENABLED)
                                                        .roleDescription("你是豆包，你会用俏皮的语言回答用户的问题")
                                                        .build()
                                        ).build()
                                ).build()
                ))
                .input(ResponsesInput.builder().stringValue("hello").build())
                .build();

        ResponseObject response1;

        try {
            response1 = service.createResponse(request, headers);
            printResponseObject(response1);
        } catch (Exception e) {
            System.err.println("Create Response Error " + e.getMessage());
            return;
        }

        System.out.println("\n----- Example of Deep chat -----");

        CreateResponsesRequest request2 = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(true)
                .tools(Arrays.asList(
                        ToolDoubaoApp.builder()
                                .feature(
                                        DoubaoAppFeature.builder().deepChat(
                                                DoubaoAppFeatureItem.builder()
                                                        .type(ResponsesConstants.RESPONSE_DOBAO_APP_FEATURE_TYPE_ENABLED)
                                                        .roleDescription("你是豆包，你会用俏皮的语言回答用户的问题")
                                                        .build()
                                        ).build()
                                ).build()
                ))
                .input(ResponsesInput.builder().stringValue("解释一下为什么圆周率是3.14").build())
                .build();


        try {
            Flowable<StreamEvent> streamResponse2 = service.streamResponse(request2, headers);
            streamResponse2.blockingForEach(
                    DoubaoAppCreateResponsesExample::printStreamEvent
            );
        } catch (Exception e) {
            System.err.println("Create Response Error " + e.getMessage());
            return;
        }

        System.out.println("\n----- Example of Ai Search -----");

        CreateResponsesRequest request3 = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(true)
                .tools(Arrays.asList(
                        ToolDoubaoApp.builder()
                                .feature(
                                        DoubaoAppFeature.builder().aiSearch(
                                                DoubaoAppFeatureItem.builder()
                                                        .type(ResponsesConstants.RESPONSE_DOBAO_APP_FEATURE_TYPE_ENABLED)
                                                        .roleDescription("你是豆包，你会用俏皮的语言回答用户的问题")
                                                        .build()
                                        ).build()
                                ).userLocation(UserLocation.builder()
                                        .type(ResponsesConstants.USER_LOCATION_TYPE_APPROXIMATE)
                                        .city("北京")
                                        .build())
                                .build()
                ))
                .input(ResponsesInput.builder().stringValue("今天天气咋样").build())
                .build();


        try {
            Flowable<StreamEvent> streamResponse3 = service.streamResponse(request3, headers);
            streamResponse3.blockingForEach(
                    DoubaoAppCreateResponsesExample::printStreamEvent
            );
        } catch (Exception e) {
            System.err.println("Create Response Error " + e.getMessage());
            return;
        }

        System.out.println("\n----- Example of Reasoning Search -----");

        CreateResponsesRequest request4 = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(true)
                .tools(Arrays.asList(
                        ToolDoubaoApp.builder()
                                .feature(
                                        DoubaoAppFeature.builder().reasoningSearch(
                                                DoubaoAppFeatureItem.builder()
                                                        .type(ResponsesConstants.RESPONSE_DOBAO_APP_FEATURE_TYPE_ENABLED)
                                                        .roleDescription("你是豆包，你会用俏皮的语言回答用户的问题")
                                                        .build()
                                        ).build()
                                ).userLocation(UserLocation.builder()
                                        .type(ResponsesConstants.USER_LOCATION_TYPE_APPROXIMATE)
                                        .city("北京")
                                        .build())
                                .build()
                ))
                .input(ResponsesInput.builder().stringValue("近期国际新闻有什么").build())
                .build();


        try {
            Flowable<StreamEvent> streamResponse4 = service.streamResponse(request4, headers);
            streamResponse4.blockingForEach(
                    DoubaoAppCreateResponsesExample::printStreamEvent
            );
        } catch (Exception e) {
            System.err.println("Create Response Error " + e.getMessage());
            return;
        }


        service.shutdownExecutor();
    }

    private static void printStreamEvent(StreamEvent event) {
        if (event instanceof DoubaoAppCallOutputTextDeltaEvent) {
            System.out.print(((DoubaoAppCallOutputTextDeltaEvent) event).getDelta());
        }
        if (event instanceof DoubaoAppCallReasoningTextDeltaEvent) {
            System.out.print(((DoubaoAppCallReasoningTextDeltaEvent) event).getDelta());
        }
        if (event instanceof DoubaoAppCallSearchSearchingEvent) {
            System.out.print(((DoubaoAppCallSearchSearchingEvent) event).getSearchingState());
        }
        if (event instanceof DoubaoAppCallReasoningSearchSearchingEvent) {
            System.out.print(((DoubaoAppCallReasoningSearchSearchingEvent) event).getSearchingState());
        }
        if (event instanceof DoubaoAppCallSearchCompletedEvent) {
            System.out.print(((DoubaoAppCallSearchCompletedEvent) event).getResults());
        }
        if (event instanceof DoubaoAppCallReasoningSearchCompletedEvent) {
            System.out.print(((DoubaoAppCallReasoningSearchCompletedEvent) event).getResults());
        }
    }

    private static void printResponseObject(ResponseObject responseObject) {
        System.out.println("Response ID: " + responseObject.getId());
        System.out.println("Status: " + responseObject.getStatus());
        if (responseObject.getOutput() != null && !responseObject.getOutput().isEmpty()) {
            for (BaseItem outputItem : responseObject.getOutput()) {
                if (outputItem instanceof ItemDoubaoAppCall) {
                    ItemDoubaoAppCall itemDoubaoAppCall = (ItemDoubaoAppCall) outputItem;
                    System.out.println("Doubao Blocks:");
                    for (DoubaoAppCallBlock block : itemDoubaoAppCall.getBlocks()) {
                        if (block instanceof DoubaoAppCallBlockOutputText) {
                            System.out.println("Output Text: " + ((DoubaoAppCallBlockOutputText) block).getText());
                        } else if (block instanceof DoubaoAppCallBlockReasoningText) {
                            System.out.println("Reasoning Text: " + ((DoubaoAppCallBlockReasoningText) block).getReasoningText());
                        } else if (block instanceof DoubaoAppCallBlockSearch) {
                            System.out.println("Search Result: " + ((DoubaoAppCallBlockSearch) block).getResults());
                        } else if (block instanceof DoubaoAppCallBlockReasoningSearch) {
                            System.out.println("Reasoning Search Result: " + ((DoubaoAppCallBlockReasoningSearch) block).getResults());
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
