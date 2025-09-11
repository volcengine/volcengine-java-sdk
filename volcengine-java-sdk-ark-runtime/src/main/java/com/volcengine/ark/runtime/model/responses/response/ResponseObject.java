package com.volcengine.ark.runtime.model.responses.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.common.Error;
import com.volcengine.ark.runtime.model.responses.item.BaseItem;
import com.volcengine.ark.runtime.model.responses.usage.IncompleteDetails;
import com.volcengine.ark.runtime.model.responses.usage.Usage;
import com.volcengine.ark.runtime.model.responses.common.ResponsesCaching;
import com.volcengine.ark.runtime.model.responses.common.ResponsesText;
import com.volcengine.ark.runtime.model.responses.common.ResponsesThinking;
import com.volcengine.ark.runtime.model.responses.item.OutputItem;
import com.volcengine.ark.runtime.model.responses.tool.ResponsesTool;
import com.volcengine.ark.runtime.model.responses.tool.ResponsesToolChoice;

import java.util.List;

public class ResponseObject {
    @JsonProperty("created_at")
    private Long createdAt;

    @JsonProperty("error")
    private Error error;

    @JsonProperty("id")
    private String id;

    @JsonProperty("incomplete_details")
    private IncompleteDetails incompleteDetails;

    @JsonProperty("max_output_tokens")
    private Long maxOutputTokens;

    @JsonProperty("model")
    private String model;

    @JsonProperty("object")
    private String object;

    @JsonProperty("output")
    private List<BaseItem> output;

    @JsonProperty("previous_response_id")
    private String previousResponseId;

    @JsonProperty("thinking")
    private ResponsesThinking thinking;

    @JsonProperty("service_tier")
    private String serviceTier;

    @JsonProperty("status")
    private String status;

    @JsonProperty("temperature")
    private Double temperature;

    @JsonProperty("tools")
    private List<ResponsesTool> tools;

    @JsonProperty("top_p")
    private Double topP;

    @JsonProperty("usage")
    private Usage usage;

    @JsonProperty("caching")
    private ResponsesCaching caching;

    @JsonProperty("text")
    private ResponsesText text;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("store")
    private Boolean store;

    @JsonProperty("expire_at")
    private Long expireAt;

    @JsonProperty("tool_choice")
    private ResponsesToolChoice toolChoice;

    @JsonProperty("parallel_tool_calls")
    private Boolean parallelToolCalls;

    @JsonProperty("max_tool_calls")
    private Long maxToolCalls;

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IncompleteDetails getIncompleteDetails() {
        return incompleteDetails;
    }

    public void setIncompleteDetails(IncompleteDetails incompleteDetails) {
        this.incompleteDetails = incompleteDetails;
    }

    public Long getMaxOutputTokens() {
        return maxOutputTokens;
    }

    public void setMaxOutputTokens(Long maxOutputTokens) {
        this.maxOutputTokens = maxOutputTokens;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<BaseItem> getOutput() {
        return output;
    }

    public void setOutput(List<BaseItem> output) {
        this.output = output;
    }

    public String getPreviousResponseId() {
        return previousResponseId;
    }

    public void setPreviousResponseId(String previousResponseId) {
        this.previousResponseId = previousResponseId;
    }

    public ResponsesThinking getThinking() {
        return thinking;
    }

    public void setThinking(ResponsesThinking thinking) {
        this.thinking = thinking;
    }

    public String getServiceTier() {
        return serviceTier;
    }

    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public List<ResponsesTool> getTools() {
        return tools;
    }

    public void setTools(List<ResponsesTool> tools) {
        this.tools = tools;
    }

    public Double getTopP() {
        return topP;
    }

    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public ResponsesCaching getCaching() {
        return caching;
    }

    public void setCaching(ResponsesCaching caching) {
        this.caching = caching;
    }

    public ResponsesText getText() {
        return text;
    }

    public void setText(ResponsesText text) {
        this.text = text;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Boolean getStore() {
        return store;
    }

    public void setStore(Boolean store) {
        this.store = store;
    }

    public Long getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
    }

    public ResponsesToolChoice getToolChoice() {
        return toolChoice;
    }

    public void setToolChoice(ResponsesToolChoice toolChoice) {
        this.toolChoice = toolChoice;
    }

    public Boolean getParallelToolCalls() {
        return parallelToolCalls;
    }

    public void setParallelToolCalls(Boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
    }

    public Long getMaxToolCalls() {
        return maxToolCalls;
    }

    public void setMaxToolCalls(Long maxToolCalls) {
        this.maxToolCalls = maxToolCalls;
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "createdAt=" + createdAt +
                ", error=" + error +
                ", id='" + id + '\'' +
                ", incompleteDetails=" + incompleteDetails +
                ", maxOutputTokens=" + maxOutputTokens +
                ", model='" + model + '\'' +
                ", object='" + object + '\'' +
                ", output=" + output +
                ", previousResponseId='" + previousResponseId + '\'' +
                ", thinking=" + thinking +
                ", serviceTier='" + serviceTier + '\'' +
                ", status='" + status + '\'' +
                ", temperature=" + temperature +
                ", tools=" + tools +
                ", topP=" + topP +
                ", usage=" + usage +
                ", caching=" + caching +
                ", text=" + text +
                ", instructions='" + instructions + '\'' +
                ", store=" + store +
                ", expireAt=" + expireAt +
                ", toolChoice=" + toolChoice +
                ", parallelToolCalls=" + parallelToolCalls +
                ", maxToolCalls=" + maxToolCalls +
                '}';
    }
}