package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.content.generation.*;
import com.volcengine.ark.runtime.model.content.generation.CreateContentGenerationTaskRequest.Content;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Minimal runner to execute the content generation example within Maven test scope.
 * It prints the newly added fields service_tier and execution_expires_after.
 */
public class ContentGenerationTaskExampleRunner {

    public static void main(String[] args) {
        String apiKey = System.getenv("ARK_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("ARK_API_KEY not set; skipping network calls. Showing request/response field wiring only.");

            // Build a dummy response to show fields exist
            GetContentGenerationTaskResponse resp = new GetContentGenerationTaskResponse();
            // setters exist via Jackson, so we just print toString()
            System.out.println("Dummy Response toString(): " + resp.toString());
            return;
        }

        ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
        Dispatcher dispatcher = new Dispatcher();
        ArkService service = ArkService.builder().dispatcher(dispatcher).connectionPool(connectionPool).apiKey(apiKey).build();

        String model = System.getenv().getOrDefault("MODEL_EP_ID", "${MODEL EP_ID HERE}");

        try {
            System.out.println("\n----- CREATE Task Request -----");
            List<Content> contents = new ArrayList<>();
            contents.add(Content.builder()
                    .type("text")
                    .text("示例：演示 service_tier 与 execution_expires_after")
                    .build());

            CreateContentGenerationTaskRequest createRequest = CreateContentGenerationTaskRequest.builder()
                    .model(model)
                    .content(contents)
                    .serviceTier("default")
                    .executionExpiresAfter(3600L)
                    .build();

            CreateContentGenerationTaskResult createResult = service.createContentGenerationTask(createRequest);
            System.out.println(createResult);

            System.out.println("\n----- GET Task Request -----");
            GetContentGenerationTaskRequest getRequest = GetContentGenerationTaskRequest.builder()
                    .taskId(createResult.getId())
                    .build();
            GetContentGenerationTaskResponse getResult = service.getContentGenerationTask(getRequest);
            System.out.println(getResult);
            System.out.println("ServiceTier: " + getResult.getServiceTier());
            System.out.println("ExecutionExpiresAfter: " + getResult.getExecutionExpiresAfter());

            System.out.println("\n----- LIST Task Request -----");
            ListContentGenerationTasksRequest listRequest = ListContentGenerationTasksRequest.builder()
                    .pageNum(1)
                    .pageSize(10)
                    .status(TaskStatus.RUNNING)
                    .serviceTier("default")
                    .build();
            ListContentGenerationTasksResponse listResponse = service.listContentGenerationTasks(listRequest);
            System.out.println(listResponse);
            if (listResponse.getItems() != null && !listResponse.getItems().isEmpty()) {
                ListContentGenerationTasksResponse.Item item = listResponse.getItems().get(0);
                System.out.println("List Item ServiceTier: " + item.getServiceTier());
                System.out.println("List Item ExecutionExpiresAfter: " + item.getExecutionExpiresAfter());
            }

            // ---- FLEX tier flow: create + GET + LIST ----
            System.out.println("\n----- CREATE Task Request (flex) -----");
            CreateContentGenerationTaskRequest createFlex = CreateContentGenerationTaskRequest.builder()
                    .model(model)
                    .content(contents)
                    .serviceTier("flex")
                    .executionExpiresAfter(3600L)
                    .build();
            CreateContentGenerationTaskResult createResultFlex = service.createContentGenerationTask(createFlex);
            System.out.println(createResultFlex);

            System.out.println("\n----- GET Task Request (flex) -----");
            GetContentGenerationTaskRequest getFlexReq = GetContentGenerationTaskRequest.builder()
                    .taskId(createResultFlex.getId())
                    .build();
            GetContentGenerationTaskResponse getFlexResult = service.getContentGenerationTask(getFlexReq);
            System.out.println(getFlexResult);
            System.out.println("Flex ServiceTier: " + getFlexResult.getServiceTier());
            System.out.println("Flex ExecutionExpiresAfter: " + getFlexResult.getExecutionExpiresAfter());

            System.out.println("\n----- LIST Task Request (flex) -----");
            ListContentGenerationTasksRequest listFlexReq = ListContentGenerationTasksRequest.builder()
                    .pageNum(1)
                    .pageSize(10)
                    .serviceTier("flex")
                    .build();
            ListContentGenerationTasksResponse listFlexResp = service.listContentGenerationTasks(listFlexReq);
            System.out.println(listFlexResp);
            if (listFlexResp.getItems() != null && !listFlexResp.getItems().isEmpty()) {
                ListContentGenerationTasksResponse.Item itemFlex = listFlexResp.getItems().get(0);
                System.out.println("Flex List Item ServiceTier: " + itemFlex.getServiceTier());
                System.out.println("Flex List Item ExecutionExpiresAfter: " + itemFlex.getExecutionExpiresAfter());
            }

        } catch (Exception e) {
            System.err.println("Example run failed: " + e.getMessage());
        } finally {
            service.shutdownExecutor();
        }
    }
}
