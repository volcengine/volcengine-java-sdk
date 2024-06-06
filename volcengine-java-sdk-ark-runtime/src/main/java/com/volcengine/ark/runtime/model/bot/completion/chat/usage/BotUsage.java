package com.volcengine.ark.runtime.model.bot.completion.chat.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BotUsage {

    /**
     * The model usages
     */
    @JsonProperty("model_usage")
    private List<BotModelUsage> modelUsage;

    /**
     * The action usages
     */
    @JsonProperty("action_usage")
    private List<BotActionUsage> actionUsage;
}
