package com.volcengine.ark.runtime.service;

import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.model.content.generation.DeleteContentGenerationTaskResponse;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionRequest;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionResult;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;
import com.volcengine.ark.runtime.model.content.generation.GetContentGenerationTaskResponse;
import com.volcengine.ark.runtime.model.content.generation.ListContentGenerationTasksResponse;
import com.volcengine.ark.runtime.model.context.CreateContextRequest;
import com.volcengine.ark.runtime.model.context.CreateContextResult;
import com.volcengine.ark.runtime.model.context.chat.ContextChatCompletionRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingResult;
import com.volcengine.ark.runtime.model.files.DeleteFileResponse;
import com.volcengine.ark.runtime.model.files.FileMeta;
import com.volcengine.ark.runtime.model.files.ListFilesResponse;
import com.volcengine.ark.runtime.model.images.generation.GenerateImagesRequest;
import com.volcengine.ark.runtime.model.images.generation.ImagesResponse;
import com.volcengine.ark.runtime.model.multimodalembeddings.MultimodalEmbeddingRequest;
import com.volcengine.ark.runtime.model.multimodalembeddings.MultimodalEmbeddingResult;
import com.volcengine.ark.runtime.model.responses.request.CreateResponsesRequest;
import com.volcengine.ark.runtime.model.responses.response.DeleteResponseResponse;
import com.volcengine.ark.runtime.model.responses.response.ListInputItemsResponse;
import com.volcengine.ark.runtime.model.responses.response.ResponseObject;
import com.volcengine.ark.runtime.model.tokenization.TokenizationRequest;
import com.volcengine.ark.runtime.model.tokenization.TokenizationResult;
import com.volcengine.ark.runtime.model.content.generation.CreateContentGenerationTaskRequest;
import com.volcengine.ark.runtime.model.content.generation.CreateContentGenerationTaskResult;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.*;
import retrofit2.Call;
import io.reactivex.Single;

import java.util.List;
import java.util.Map;

public interface ArkApi {

    @POST("/api/v3/chat/completions")
    Single<ChatCompletionResult> createChatCompletion(@Body ChatCompletionRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/batch/chat/completions")
    Single<ChatCompletionResult> createBatchChatCompletion(@Body ChatCompletionRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @Streaming
    @POST("/api/v3/chat/completions")
    Call<ResponseBody> createChatCompletionStream(@Body ChatCompletionRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/bots/chat/completions")
    Single<BotChatCompletionResult> createBotChatCompletion(@Body BotChatCompletionRequest request, @Header(Const.REQUEST_BOT) String botId, @HeaderMap Map<String, String> customHeaders);

    @Streaming
    @POST("/api/v3/bots/chat/completions")
    Call<ResponseBody> createBotChatCompletionStream(@Body BotChatCompletionRequest request, @Header(Const.REQUEST_BOT) String botId, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/context/create")
    Single<CreateContextResult> createContext(@Body CreateContextRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/context/chat/completions")
    Single<ChatCompletionResult> createContextChatCompletion(@Body ContextChatCompletionRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @Streaming
    @POST("/api/v3/context/chat/completions")
    Call<ResponseBody> createContextChatCompletionStream(@Body ContextChatCompletionRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/embeddings")
    Single<EmbeddingResult> createEmbeddings(@Body EmbeddingRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/batch/embeddings")
    Single<EmbeddingResult> createBatchEmbeddings(@Body EmbeddingRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/embeddings/multimodal")
    Single<MultimodalEmbeddingResult> createMultiModalEmbeddings(@Body MultimodalEmbeddingRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/batch/embeddings/multimodal")
    Single<MultimodalEmbeddingResult> createBatchMultiModalEmbeddings(@Body MultimodalEmbeddingRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/tokenization")
    Single<TokenizationResult> createTokenization(@Body TokenizationRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/images/generations")
    Single<ImagesResponse> generateImages(@Body GenerateImagesRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @Streaming
    @POST("/api/v3/images/generations")
    Call<ResponseBody> streamGenerateImages(@Body GenerateImagesRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/contents/generations/tasks")
    Single<CreateContentGenerationTaskResult> createContentGenerationTask(@Body CreateContentGenerationTaskRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @GET("/api/v3/contents/generations/tasks/{taskId}")
    Single<GetContentGenerationTaskResponse> getContentGenerationTask(@Path("taskId") String taskId, @HeaderMap Map<String, String> customHeaders);

    @GET("/api/v3/contents/generations/tasks")
    Single<ListContentGenerationTasksResponse> listContentGenerationTasks(
            @Query("page_num") int pageNum,
            @Query("page_size") int pageSize,
            @Query("filter.status") String status,
            @Query("filter.model") String model,
            @Query("filter.task_ids") List<String> taskIds,
            @HeaderMap Map<String, String> customHeaders
    );

    @DELETE("/api/v3/contents/generations/tasks/{taskId}")
    Single<DeleteContentGenerationTaskResponse> deleteContentGenerationTask(@Path("taskId") String taskId, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/responses")
    Single<ResponseObject> createResponse(@Body CreateResponsesRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @Streaming
    @POST("/api/v3/responses")
    Call<ResponseBody> streamResponse(@Body CreateResponsesRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @GET("/api/v3/responses/{responseId}")
    Single<ResponseObject> getResponse(@Path("responseId") String responsesId, @HeaderMap Map<String, String> customHeaders);

    @DELETE("/api/v3/responses/{responseId}")
    Single<DeleteResponseResponse> deleteResponse(@Path("responseId") String responsesId, @HeaderMap Map<String, String> customHeaders);

    @GET("/api/v3/responses/{responseId}/input_items")
    Single<ListInputItemsResponse> listResponseInputItems(
            @Path("responseId") String responsesId,
            @Query("after") String after,
            @Query("before") String before,
            @Query("limit") Integer limit,
            @Query("include[]") List<String> include,
            @HeaderMap Map<String, String> customHeaders
    );

    @Multipart
    @POST("/api/v3/files")
    Single<FileMeta> uploadFile(@Part MultipartBody.Part file,
                                @Part("purpose") RequestBody purpose,
                                @Part("expire_at") RequestBody expireAt,
                                @Part("preprocess_configs[video][fps]") RequestBody fps,
                                @HeaderMap Map<String, String> customHeaders);

    @DELETE("/api/v3/files/{fileId}")
    Single<DeleteFileResponse> deleteFile(@Path("fileId") String fileId, @HeaderMap Map<String, String> customHeaders);

    @GET("/api/v3/files/{fileId}")
    Single<FileMeta> retrieveFile(@Path("fileId") String fileId, @HeaderMap Map<String, String> customHeaders);

    @GET("/api/v3/files")
    Single<ListFilesResponse> listFiles(@Query("limit") Integer limit,
                                        @Query("after") String after,
                                        @Query("purpose") String purpose,
                                        @Query("order") String order,
                                        @HeaderMap Map<String, String> customHeaders);

}
