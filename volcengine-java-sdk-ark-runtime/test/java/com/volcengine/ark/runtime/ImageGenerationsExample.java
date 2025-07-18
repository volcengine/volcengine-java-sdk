package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.images.generation.GenerateImagesRequest;
import com.volcengine.ark.runtime.model.images.generation.ImagesResponse;
import com.volcengine.ark.runtime.model.images.generation.ResponseFormat;
import com.volcengine.ark.runtime.model.images.generation.Size;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.util.concurrent.TimeUnit;

public class ImageGenerationsExample {

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
        String model = "YOUR_ENDPOINT_ID";

        System.out.println("\n----- [Seedream] Generate Images Request -----");

        GenerateImagesRequest generateRequest = GenerateImagesRequest.builder()
                .model(model)    // Replace with your Seedream endpoint ID
                .prompt("龙与地下城女骑士背景是起伏的平原，目光从镜头转向平原")
                .responseFormat(ResponseFormat.Url)
                .seed(1234567890)
                .watermark(true)
                .size("512x512")
                .guidanceScale(2.5)
                .build();

        System.out.println(generateRequest.toString());
        // send create request
        ImagesResponse imagesResponse = service.generateImages(generateRequest);
        System.out.println(imagesResponse.getData().get(0).getUrl());

        System.out.println("\n----- [Seededit] Generate Images Request -----");

        generateRequest = GenerateImagesRequest.builder()
                .model(model)    // Replace with your Seededit endpoint ID
                .prompt("龙与地下城女骑士背景是起伏的平原，目光从镜头转向平原")
                .image("https://an-test-imgs.tos-cn-beijing.volces.com/avi/9m_001.jpg")   // Replace with your input image URL
                .responseFormat(ResponseFormat.Url)
                .seed(1234567890)
                .watermark(true)
                .size(Size.Adaptive)
                .guidanceScale(2.5)
                .build();

        System.out.println(generateRequest.toString());
        // send create request
        imagesResponse = service.generateImages(generateRequest);
        System.out.println(imagesResponse.getData().get(0).getUrl());

        service.shutdownExecutor();
    }
}
