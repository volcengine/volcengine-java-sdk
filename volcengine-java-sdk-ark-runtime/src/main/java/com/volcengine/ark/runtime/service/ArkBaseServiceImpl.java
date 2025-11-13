package com.volcengine.ark.runtime.service;

import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionChunk;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionRequest;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionResult;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionChunk;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;
import com.volcengine.ark.runtime.model.content.generation.*;
import com.volcengine.ark.runtime.model.context.CreateContextRequest;
import com.volcengine.ark.runtime.model.context.CreateContextResult;
import com.volcengine.ark.runtime.model.context.chat.ContextChatCompletionRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingRequest;
import com.volcengine.ark.runtime.model.embeddings.EmbeddingResult;
import com.volcengine.ark.runtime.model.files.*;
import com.volcengine.ark.runtime.model.images.generation.GenerateImagesRequest;
import com.volcengine.ark.runtime.model.images.generation.ImagesResponse;
import com.volcengine.ark.runtime.model.multimodalembeddings.MultimodalEmbeddingRequest;
import com.volcengine.ark.runtime.model.multimodalembeddings.MultimodalEmbeddingResult;
import com.volcengine.ark.runtime.model.responses.event.StreamEvent;
import com.volcengine.ark.runtime.model.responses.request.DeleteResponseRequest;
import com.volcengine.ark.runtime.model.responses.request.GetResponseRequest;
import com.volcengine.ark.runtime.model.responses.request.ListInputItemsRequest;
import com.volcengine.ark.runtime.model.responses.request.CreateResponsesRequest;
import com.volcengine.ark.runtime.model.responses.response.DeleteResponseResponse;
import com.volcengine.ark.runtime.model.responses.response.ListInputItemsResponse;
import com.volcengine.ark.runtime.model.responses.response.ResponseObject;
import com.volcengine.ark.runtime.model.tokenization.TokenizationRequest;
import com.volcengine.ark.runtime.model.tokenization.TokenizationResult;
import io.reactivex.Flowable;


public interface ArkBaseServiceImpl {

    ChatCompletionResult createChatCompletion(ChatCompletionRequest request);

    ChatCompletionResult createBatchChatCompletion(ChatCompletionRequest request);

    Flowable<ChatCompletionChunk> streamChatCompletion(ChatCompletionRequest request);

    BotChatCompletionResult createBotChatCompletion(BotChatCompletionRequest request);

    Flowable<BotChatCompletionChunk> streamBotChatCompletion(BotChatCompletionRequest request);

    CreateContextResult createContext(CreateContextRequest request);

    ChatCompletionResult createContextChatCompletion(ContextChatCompletionRequest request);

    ResponseObject createResponse(CreateResponsesRequest request);

    Flowable<StreamEvent> streamResponse(CreateResponsesRequest request);

    Flowable<ChatCompletionChunk> streamContextChatCompletion(ContextChatCompletionRequest request);

    TokenizationResult createTokenization(TokenizationRequest request);

    EmbeddingResult createEmbeddings(EmbeddingRequest request);

    EmbeddingResult createBatchEmbeddings(EmbeddingRequest request);

    MultimodalEmbeddingResult createMultiModalEmbeddings(MultimodalEmbeddingRequest request);

    MultimodalEmbeddingResult createBatchMultiModalEmbeddings(MultimodalEmbeddingRequest request);

    ImagesResponse generateImages(GenerateImagesRequest request);

    CreateContentGenerationTaskResult createContentGenerationTask(CreateContentGenerationTaskRequest request);

    GetContentGenerationTaskResponse getContentGenerationTask(GetContentGenerationTaskRequest request);

    ListContentGenerationTasksResponse listContentGenerationTasks(ListContentGenerationTasksRequest request);

    DeleteContentGenerationTaskResponse deleteContentGenerationTask(DeleteContentGenerationTaskRequest request);

    ResponseObject getResponse(GetResponseRequest request);

    DeleteResponseResponse deleteResponse(DeleteResponseRequest request);

    ListInputItemsResponse listResponseInputItems(ListInputItemsRequest request);

    FileMeta uploadFile(UploadFileRequest file);

    FileMeta retrieveFile(String fileId);

    DeleteFileResponse deleteFile(String fileId);

    ListFilesResponse listFiles(ListFilesRequest request);
}
