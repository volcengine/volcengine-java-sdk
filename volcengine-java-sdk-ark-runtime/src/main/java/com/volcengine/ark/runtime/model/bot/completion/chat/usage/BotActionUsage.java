package com.volcengine.ark.runtime.model.bot.completion.chat.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BotActionUsage {

    /**
     * For Search Action: The source type name
     */
    private String name;

    @JsonProperty("prompt_tokens")
    private String promptTokens;

    @JsonProperty("completion_tokens")
    private Integer completionTokens;

    @JsonProperty("total_tokens")
    private Integer totalTokens;

    /**
     * For Search Action: return the search count from this source type
     */
    @JsonProperty("search_count")
    private Integer searchCount;

    @JsonProperty("action_name")
    private String actionName;

    @JsonProperty("count")
    private Integer count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(String promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Integer getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Integer getSearchCount() {
        return searchCount;
    }

    public void setSearchCount(Integer searchCount) {
        this.searchCount = searchCount;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BotActionUsage{" +
                "name='" + name + '\'' +
                ", promptTokens='" + promptTokens + '\'' +
                ", completionTokens=" + completionTokens +
                ", totalTokens=" + totalTokens +
                ", searchCount=" + searchCount +
                ", actionName='" + actionName + '\'' +
                ", count=" + count +
                '}';
    }
}
