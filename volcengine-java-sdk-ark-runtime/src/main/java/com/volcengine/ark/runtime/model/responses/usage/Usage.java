package com.volcengine.ark.runtime.model.responses.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usage {
    @JsonProperty("input_tokens")
    private Long inputTokens;

    @JsonProperty("output_tokens")
    private Long outputTokens;

    @JsonProperty("total_tokens")
    private Long totalTokens;

    @JsonProperty("input_tokens_details")
    private InputTokensDetails inputTokensDetails;

    @JsonProperty("output_tokens_details")
    private OutputTokensDetails outputTokensDetails;

    @JsonProperty("tool_usage")
    private Map<String, Object> toolUsage;

    @JsonProperty("tool_usage_details")
    private Map<String, Object> toolUsageDetails;

    public Long getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
    }

    public Long getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
    }

    public Long getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
    }

    public InputTokensDetails getInputTokensDetails() {
        return inputTokensDetails;
    }

    public void setInputTokensDetails(InputTokensDetails inputTokensDetails) {
        this.inputTokensDetails = inputTokensDetails;
    }

    public OutputTokensDetails getOutputTokensDetails() {
        return outputTokensDetails;
    }

    public void setOutputTokensDetails(OutputTokensDetails outputTokensDetails) {
        this.outputTokensDetails = outputTokensDetails;
    }

    public Map<String, Object> getToolUsage() {
        return toolUsage;
    }

    public void setToolUsage(Map<String, Object> toolUsage) {
        this.toolUsage = toolUsage;
    }

    public Map<String, Object> getToolUsageDetails() {
        return toolUsageDetails;
    }

    public void setToolUsageDetails(Map<String, Object> toolUsageDetails) {
        this.toolUsageDetails = toolUsageDetails;
    }

    @Override
    public String toString() {
        return "Usage{" +
                "inputTokens=" + inputTokens +
                ", outputTokens=" + outputTokens +
                ", totalTokens=" + totalTokens +
                ", inputTokensDetails=" + inputTokensDetails +
                ", outputTokensDetails=" + outputTokensDetails +
                ", toolUsage=" + toolUsage +
                ", toolUsageDetails=" + toolUsageDetails +
                '}';
    }
}