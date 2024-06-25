package com.volcengine.ark.runtime.model.bot.completion.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.bot.completion.chat.reference.BotChatResultReference;
import com.volcengine.ark.runtime.model.bot.completion.chat.usage.BotUsage;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionChoice;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionResult;

import java.util.List;
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

    /**
     * The references returned by Search Actions.
     */
    private List<BotChatResultReference> references;

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public BotUsage getBotUsage() {
        return botUsage;
    }

    public void setBotUsage(BotUsage botUsage) {
        this.botUsage = botUsage;
    }

    public List<BotChatResultReference> getReferences() {
        return references;
    }

    public void setReferences(List<BotChatResultReference> references) {
        this.references = references;
    }
}
