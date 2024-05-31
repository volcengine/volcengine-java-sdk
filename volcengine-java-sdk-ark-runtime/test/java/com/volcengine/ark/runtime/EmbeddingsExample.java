package com.volcengine.ark.runtime;


import com.volcengine.ark.runtime.model.embeddings.EmbeddingRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingResult;
import com.volcengine.ark.runtime.service.ArkService;

import java.util.ArrayList;
import java.util.List;

public class EmbeddingsExample {

    /**
     * Authentication
     * 1.If you authorize your endpoint using an API key, you can set your api key to environment variable "ARK_API_KEY"
     * String apiKey = System.getenv("ARK_API_KEY");
     * ArkService service = new ArkService(apiKey);
     * Note: If you use an API key, this API key will not be refreshed.
     * To prevent the API from expiring and failing after some time, choose an API key with no expiration date.
     *
     * 2.If you authorize your endpoint with Volcengine Identity and Access Management（IAM), set your api key to environment variable "VOLC_ACCESSKEY", "VOLC_SECRETKEY"
     * String ak = System.getenv("VOLC_ACCESSKEY");
     * String sk = System.getenv("VOLC_SECRETKEY");
     * ArkService service = new ArkService(ak, sk);
     * To get your ak&sk, please refer to this document(https://www.volcengine.com/docs/6291/65568)
     * For more information，please check this document（https://www.volcengine.com/docs/82379/1263279）
     */
    public static void main(String[] args) {

        String apiKey = System.getenv("ARK_API_KEY");
        ArkService service = new ArkService(apiKey);

        System.out.println("\n----- embeddings request -----");

        List<String> inputs = new ArrayList<>();
        inputs.add("The food was delicious and the waiter...");
        EmbeddingRequest chatCompletionRequest = EmbeddingRequest.builder()
                .model("${YOUR_ENDPOINT_ID}")
                .input(inputs)
                .build();

        EmbeddingResult res = service.createEmbeddings(chatCompletionRequest);
        System.out.println(res);

        // shutdown service
        service.shutdownExecutor();
    }

}
