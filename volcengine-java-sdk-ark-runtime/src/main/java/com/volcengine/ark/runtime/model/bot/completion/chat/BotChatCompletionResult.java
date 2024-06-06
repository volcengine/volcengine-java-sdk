package com.volcengine.ark.runtime.model.bot.completion.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.bot.completion.chat.usage.BotUsage;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BotChatCompletionResult extends ChatCompletionResult {

    /**
     * Same as BotChaCompletionRequest.metadata
     */
    private Map<String, Object> metadata;

    /**
     * In bot chat completion, the bot_usage will be returned instead of usage
     */
    @JsonProperty("bot_usage")
    private BotUsage botUsage;
}
