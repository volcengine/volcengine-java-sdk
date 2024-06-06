package com.volcengine.ark.runtime.service;

import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionRequest;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionResult;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingResult;
import okhttp3.ResponseBody;
import retrofit2.http.*;
import retrofit2.Call;
import io.reactivex.Single;

import java.util.Map;

public interface ArkApi {

    @POST("/api/v3/chat/completions")
    Single<ChatCompletionResult> createChatCompletion(@Body ChatCompletionRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @Streaming
    @POST("/api/v3/chat/completions")
    Call<ResponseBody> createChatCompletionStream(@Body ChatCompletionRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);

    @POST("/api/v3/bot/{botId}/chat/completions")
    Single<BotChatCompletionResult> createBotChatCompletion(@Body BotChatCompletionRequest request, @Path(Const.REQUEST_BOT_ID) @Header(Const.REQUEST_BOT) String botId);

    @Streaming
    @POST("/api/v3/bot/{botId}/chat/completions")
    Call<ResponseBody> createBotChatCompletionStream(@Body BotChatCompletionRequest request, @Path(Const.REQUEST_BOT_ID) @Header(Const.REQUEST_BOT) String botId);

    @POST("/api/v3/embeddings")
    Single<EmbeddingResult> createEmbeddings(@Body EmbeddingRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);
}
