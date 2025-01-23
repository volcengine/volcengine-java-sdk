package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.multimodalembeddings.MultimodalEmbeddingInput;
import com.volcengine.ark.runtime.model.multimodalembeddings.MultimodalEmbeddingRequest;
import com.volcengine.ark.runtime.model.multimodalembeddings.MultimodalEmbeddingResult;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultiModalEmbeddingsExample {

    /**
     * Authentication
     * 1.If you authorize your endpoint using an API key, you can set your api key to environment variable "ARK_API_KEY"
     * String apiKey = System.getenv("ARK_API_KEY");
     * ArkService service = new ArkService(apiKey);
     * Note: If you use an API key, this API key will not be refreshed.
     * To prevent the API from expiring and failing after some time, choose an API key with no expiration date.
     * <p>
     * 2.If you authorize your endpoint with Volcengine Identity and Access Management（IAM), set your api key to environment variable "VOLC_ACCESSKEY", "VOLC_SECRETKEY"
     * String ak = System.getenv("VOLC_ACCESSKEY");
     * String sk = System.getenv("VOLC_SECRETKEY");
     * ArkService service = new ArkService(ak, sk);
     * To get your ak&sk, please refer to this document(https://www.volcengine.com/docs/6291/65568)
     * For more information，please check this document（https://www.volcengine.com/docs/82379/1263279）
     */

    static String apiKey = System.getenv("ARK_API_KEY");
    static ConnectionPool connectionPool = new ConnectionPool(5, 1, TimeUnit.SECONDS);
    static Dispatcher dispatcher = new Dispatcher();
    static ArkService service = ArkService.builder().dispatcher(dispatcher).connectionPool(connectionPool).apiKey(apiKey).build();

    public static void main(String[] args) {
        System.out.println("\n----- multimodal embeddings request -----");

        List<MultimodalEmbeddingInput> inputs = new ArrayList<>();
        inputs.add(MultimodalEmbeddingInput.builder().type("text").text(
                "把图中的蓝天换成白云"
        ).build());
        inputs.add(MultimodalEmbeddingInput.builder().type("image_url").imageUrl(
                new MultimodalEmbeddingInput.MultiModalEmbeddingContentPartImageURL(
                        "https://ark-project.tos-cn-beijing.ivolces.com/images/view.jpeg"
                )
        ).build());

        MultimodalEmbeddingRequest multiModalEmbeddingRequest = MultimodalEmbeddingRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .input(inputs)
                .build();

        MultimodalEmbeddingResult res = service.createMultiModalEmbeddings(multiModalEmbeddingRequest);
        System.out.println(res);

        // shutdown service after all requests is finished
        service.shutdownExecutor();
    }

}
