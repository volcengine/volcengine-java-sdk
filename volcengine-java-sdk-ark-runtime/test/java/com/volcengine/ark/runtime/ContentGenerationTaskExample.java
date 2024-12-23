package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.contentgeneration.CreateContentGenerationTaskRequest;
import com.volcengine.ark.runtime.model.contentgeneration.CreateContentGenerationTaskRequest.Content;
import com.volcengine.ark.runtime.model.contentgeneration.CreateContentGenerationTaskRequest.Content.ImageUrl;
import com.volcengine.ark.runtime.model.contentgeneration.CreateContentGenerationTaskResult;
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
     *
     * 2. If you authorize your endpoint with Volcengine IAM, set "VOLC_ACCESSKEY" and "VOLC_SECRETKEY" as environment variables.
     *    String ak = System.getenv("VOLC_ACCESSKEY");
     *    String sk = System.getenv("VOLC_SECRETKEY");
     *    ArkService service = new ArkService(ak, sk);
     *    For more details, refer to the Volcengine documentation.
     */

    static String apiKey = System.getenv("ARK_API_KEY");
    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();
    static ArkService service = ArkService.builder().dispatcher(dispatcher).connectionPool(connectionPool).apiKey(apiKey).build();

    public static void main(String[] args) {
        System.out.println("\n----- Create Content Generation Task Request -----");

        List<Content> contents = new ArrayList<>();

        // Text content
        contents.add(Content.builder()
                .type("text")
                .text("龙与地下城女骑士背景是起伏的平原，目光从镜头转向平原 --ratio 1:1")
                .build());

        // Image URL content
        contents.add(Content.builder()
                .type("image_url")
                .imageUrl(ImageUrl.builder()
                        .url("https://ark-project.tos-cn-beijing.ivolces.com/images/view.jpeg")
                        .build())
                .build());

        CreateContentGenerationTaskRequest request = CreateContentGenerationTaskRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .content(contents)
                .build();

        // Send request
        CreateContentGenerationTaskResult result = service.createContentGenerationTask(request);
        System.out.println(result);

        // Shutdown service after all requests are finished
        service.shutdownExecutor();
    }
}
