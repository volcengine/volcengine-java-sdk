package com.volcengine.ark.runtime.model.bot.completion.chat.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.volcengine.ark.runtime.model.Usage;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BotModelUsage extends Usage {

    /**
     * The model name
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BotModelUsage{" +
                "promptTokens=" + getPromptTokens() +
                ", completionTokens=" + getCompletionTokens() +
                ", totalTokens=" + getTotalTokens() +
                ", name='" + name + '\'' +
                '}';
    }
}
