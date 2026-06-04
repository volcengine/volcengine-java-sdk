package com.volcengine.ark.runtime;

import com.volcengine.ark.runtime.model.files.FileMeta;
import com.volcengine.ark.runtime.model.files.TosStorage;
import com.volcengine.ark.runtime.model.files.UploadFileRequest;
import com.volcengine.ark.runtime.model.responses.common.ResponsesThinking;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.InputContentItemText;
import com.volcengine.ark.runtime.model.responses.content.InputContentItemVideo;
import com.volcengine.ark.runtime.model.responses.item.ItemEasyMessage;
import com.volcengine.ark.runtime.model.responses.item.MessageContent;
import com.volcengine.ark.runtime.model.responses.request.*;
import com.volcengine.ark.runtime.model.responses.response.DeleteResponseResponse;
import com.volcengine.ark.runtime.model.responses.response.ListInputItemsResponse;
import com.volcengine.ark.runtime.model.responses.response.ResponseObject;
import com.volcengine.ark.runtime.service.ArkService;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class ResponseOperationsExample {

    private static final String modelName = "doubao-seed-2-0-lite-260428";

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

        System.out.println("===== CreateResponse Example=====");
        // Upload a video via URL, storing to user's own TOS bucket.
        // Set YOUR_TOS_BUCKET and YOUR_TOS_PREFIX env vars to your own TOS bucket and prefix.
        String tosBucket = System.getenv("YOUR_TOS_BUCKET");
        String tosPrefix = System.getenv("YOUR_TOS_PREFIX");

        UploadFileRequest.UploadFileRequestBuilder uploadBuilder = UploadFileRequest.builder()
                .url("https://ark-project.tos-cn-beijing.volces.com/videos/aigen.mp4")
                .purpose("user_data");
        if (tosBucket != null && tosPrefix != null) {
            uploadBuilder.tos(TosStorage.builder().bucket(tosBucket).prefix(tosPrefix).build());
        }
        FileMeta fileMeta = service.uploadFile(uploadBuilder.build());
        System.out.println("Uploaded file: " + fileMeta.getId());
        if (fileMeta.getTos() != null) {
            System.out.println("Stored to TOS: bucket=" + fileMeta.getTos().getBucket() + ", objectKey=" + fileMeta.getTos().getObjectKey());
        }

        // wait for file processing to complete
        while ("processing".equals(fileMeta.getStatus())) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                break;
            }
            fileMeta = service.retrieveFile(fileMeta.getId());
            System.out.println("File status: " + fileMeta.getStatus());
        }
        if (!"active".equals(fileMeta.getStatus())) {
            System.out.println("File processing failed: " + fileMeta.getStatus());
            service.shutdownExecutor();
            return;
        }

        // create a response first
        CreateResponsesRequest request = CreateResponsesRequest.builder()
                .model(modelName)
                .stream(false)
                .input(ResponsesInput.builder().addListItem(
                        ItemEasyMessage.builder().role(ResponsesConstants.MESSAGE_ROLE_USER).content(
                                MessageContent.builder()
                                        .addListItem(InputContentItemVideo.builder().fileId(fileMeta.getId()).build())
                                        .addListItem(InputContentItemText.builder().text("描述一下这个视频的内容").build())
                                        .build()
                        ).build()
                ).build())
                .thinking(ResponsesThinking.builder().type(ResponsesConstants.THINKING_TYPE_DISABLED).build())
                .build();
        ResponseObject resp = service.createResponse(request);

        try {
            Thread.sleep(200); // the response object write is async, so need a latency here
        } catch (Throwable e) {
            // ignore
        }

        System.out.println("===== GetResponse Example=====");

        ResponseObject getResult = service.getResponse(
                GetResponseRequest.builder().responseId(resp.getId()).build()
        );
        System.out.println(getResult);

        // List Input Items
        System.out.println("===== List Input Items Example=====");

        ListInputItemsResponse listResult = service.listResponseInputItems(
                ListInputItemsRequest.builder().responseId(getResult.getId())
                        .include(Collections.singletonList(ResponsesConstants.INCLUDE_TYPE_IMAGE_URL)).build()
        );

        System.out.println(listResult);

        System.out.println("===== DeleteResponse Example=====");

        DeleteResponseResponse deleteResult = service.deleteResponse(
                DeleteResponseRequest.builder().responseId(getResult.getId()).build()
        );

        System.out.println(deleteResult);

        // when response deleted, get again will throw exception
        try {
            service.getResponse(
                    GetResponseRequest.builder().responseId(getResult.getId()).build()
            );
        } catch (Exception e) {
            System.out.println("GetResponse after delete: " + e.getMessage());
        }

        service.shutdownExecutor();
    }
}
