package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.content.generation.DeleteContentGenerationTaskResponse;
import com.volcengine.ark.runtime.model.content.generation.*;
import com.volcengine.ark.runtime.model.content.generation.CreateContentGenerationTaskRequest.Content;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ContentGenerationTaskExample {

    /**
     * Authentication
     * 1. If you authorize your endpoint using an API key, set the API key to environment variable "ARK_API_KEY"
     *    String apiKey = System.getenv("ARK_API_KEY");
     *    ArkService service = new ArkService(apiKey);
     *    Note: Choose an API key with no expiration date to prevent failures due to expiration.
     */

    static String apiKey = System.getenv("ARK_API_KEY");
    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();
    static ArkService service = ArkService.builder().dispatcher(dispatcher).connectionPool(connectionPool).apiKey(apiKey).build();

    public static void main(String[] args) {
        String model = "${MODEL EP_ID HERE}";

        System.out.println("\n----- CREATE Task Request -----");
        List<Content> contents = new ArrayList<>();

        // Text content
        contents.add(Content.builder()
                .type("text")
                .text("制作一段展示美丽自然风光的视频，包括山川、河流、森林和天空，充满平和与宁静的氛围，适合用于冥想或放松场景。 --ratio 1:1")
                .build());

        // Image URL content
        contents.add(Content.builder()
                .type("image_url")
                .imageUrl(CreateContentGenerationTaskRequest.ImageUrl.builder()
                        .url("${IMAGE URL HERE}")
                        .build())
                // .role("first_frame")
                .build());

        CreateContentGenerationTaskRequest createRequest = CreateContentGenerationTaskRequest.builder()
                .model(model)
                .content(contents)
                .build();

        // send create request
        CreateContentGenerationTaskResult createResult = service.createContentGenerationTask(createRequest);
        System.out.println(createResult);

        System.out.println("\n----- GET Task Request -----");

        GetContentGenerationTaskRequest getRequest = GetContentGenerationTaskRequest.builder()
                .taskId(createResult.getId())
                .build();

        GetContentGenerationTaskResponse getResult = service.getContentGenerationTask(getRequest);
        System.out.println(getResult);

        System.out.println("\n----- LIST Task Request -----");

        ListContentGenerationTasksRequest listRequest = ListContentGenerationTasksRequest.builder()
                .pageNum(1)
                .pageSize(10)
                .status(TaskStatus.RUNNING)
                .addTaskId(createResult.getId())
                // for multiple IDs, you could use:
                // .taskIds(Arrays.asList("test-id-1", "test-id-2"))
                .model(model)
                .build();

        ListContentGenerationTasksResponse listResponse = service.listContentGenerationTasks(listRequest);
        System.out.println(listResponse);

        System.out.println("\n----- DELETE Task Request -----");

        DeleteContentGenerationTaskRequest deleteRequest = DeleteContentGenerationTaskRequest.builder()
                .taskId(getResult.getId())
                .build();

        try {
            DeleteContentGenerationTaskResponse deleteResult = service.deleteContentGenerationTask(deleteRequest);
            System.out.println(deleteResult);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        service.shutdownExecutor();
    }
}
