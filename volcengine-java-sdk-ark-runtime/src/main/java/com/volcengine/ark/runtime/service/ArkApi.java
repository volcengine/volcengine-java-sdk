package com.volcengine.ark.runtime.service;

import com.volcengine.ark.runtime.Const;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionRequest;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionResult;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;
import com.volcengine.ark.runtime.model.context.CreateContextRequest;
import com.volcengine.ark.runtime.model.context.CreateContextResult;
import com.volcengine.ark.runtime.model.context.chat.ContextChatCompletionRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingResult;
import com.volcengine.ark.runtime.model.tokenization.TokenizationRequest;
import com.volcengine.ark.runtime.model.tokenization.TokenizationResult;
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

    @POST("/api/v3/tokenization")
    Single<TokenizationResult> createTokenization(@Body TokenizationRequest request, @Header(Const.REQUEST_MODEL) String model, @HeaderMap Map<String, String> customHeaders);
}
