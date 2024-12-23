package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.contentgeneration.CreateContentGenerationTaskRequest;
import com.volcengine.ark.runtime.model.contentgeneration.CreateContentGenerationTaskRequest.Content;
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
     *    To get your ak&sk, please refer to this document(https://www.volcengine.com/docs/6291/65568)
     *    For more information，please check this document（https://www.volcengine.com/docs/82379/1263279）
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
                .text("制作一段展示美丽自然风光的视频，包括山川、河流、森林和天空，充满平和与宁静的氛围，适合用于冥想或放松场景。 --ratio 1:1")
                .build());

        // Image URL content
        contents.add(Content.builder()
                .type("image_url")
                .imageUrl(CreateContentGenerationTaskRequest.ImageUrl.builder()
                        .url("${IMAGE URL HERE}")
                        .build())
                .build());

        CreateContentGenerationTaskRequest request = CreateContentGenerationTaskRequest.builder()
                .model("${MODEL EP-ID HERE}")
                .content(contents)
                .build();

        // Send request
        CreateContentGenerationTaskResult result = service.createContentGenerationTask(request);
        System.out.println(result);

        service.shutdownExecutor();
    }
}
