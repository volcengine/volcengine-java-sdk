package com.volcengine.ark.runtime.service;


import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionRequest;
import com.volcengine.ark.runtime.model.bot.completion.chat.BotChatCompletionResult;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionChunk;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;
import io.reactivex.Flowable;


public interface ArkBaseServiceImpl {

    ChatCompletionResult createChatCompletion(ChatCompletionRequest request);

    Flowable<ChatCompletionChunk> streamChatCompletion(ChatCompletionRequest request);

    BotChatCompletionResult createBotChatCompletion(BotChatCompletionRequest request);

    Flowable<ChatCompletionChunk> streamBotChatCompletion(BotChatCompletionRequest request);
}
