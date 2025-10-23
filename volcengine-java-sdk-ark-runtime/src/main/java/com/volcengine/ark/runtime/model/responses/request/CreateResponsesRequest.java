package com.volcengine.ark.runtime.model.responses.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.common.ResponsesCaching;
import com.volcengine.ark.runtime.model.responses.common.ResponsesReasoning;
import com.volcengine.ark.runtime.model.responses.common.ResponsesText;
import com.volcengine.ark.runtime.model.responses.common.ResponsesThinking;
import com.volcengine.ark.runtime.model.responses.tool.ResponsesTool;
import com.volcengine.ark.runtime.model.responses.tool.ResponsesToolChoice;

import java.util.List;

public class CreateResponsesRequest {
    @JsonProperty("input")
    private ResponsesInput input;

    @JsonProperty("model")
    private String model;

    @JsonProperty("max_output_tokens")
    private Long maxOutputTokens;

    @JsonProperty("previous_response_id")
    private String previousResponseId;

    @JsonProperty("thinking")
    private ResponsesThinking thinking;

    @JsonProperty("reasoning")
    private ResponsesReasoning reasoning;

    @JsonProperty("service_tier")
    private String serviceTier;

    @JsonProperty("store")
    private Boolean store;

    @JsonProperty("stream")
    private Boolean stream;

    @JsonProperty("temperature")
    private Double temperature;

    @JsonProperty("tools")
    private List<ResponsesTool> tools;

    @JsonProperty("top_p")
    private Double topP;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("include")
    private List<String> include;

    @JsonProperty("caching")
    private ResponsesCaching caching;

    @JsonProperty("text")
    private ResponsesText text;

    @JsonProperty("expire_at")
    private Long expireAt;

    @JsonProperty("tool_choice")
    private ResponsesToolChoice toolChoice;

    @JsonProperty("parallel_tool_calls")
    private Boolean parallelToolCalls;

    @JsonProperty("max_tool_calls")
    private Long maxToolCalls;

    public ResponsesInput getInput() {
        return input;
    }

    public void setInput(ResponsesInput input) {
        this.input = input;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getMaxOutputTokens() {
        return maxOutputTokens;
    }

    public void setMaxOutputTokens(Long maxOutputTokens) {
        this.maxOutputTokens = maxOutputTokens;
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

    public ResponsesReasoning getReasoning() {
        return reasoning;
    }

    public void setReasoning(ResponsesReasoning reasoning) {
        this.reasoning = reasoning;
    }

    public String getServiceTier() {
        return serviceTier;
    }

    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    public Boolean getStore() {
        return store;
    }

    public void setStore(Boolean store) {
        this.store = store;
    }

    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<String> getInclude() {
        return include;
    }

    public void setInclude(List<String> include) {
        this.include = include;
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
        return "ResponsesRequest{" +
                "input=" + input +
                ", model='" + model + '\'' +
                ", maxOutputTokens=" + maxOutputTokens +
                ", previousResponseId='" + previousResponseId + '\'' +
                ", thinking=" + thinking +
                ", reasoning=" + reasoning +
                ", serviceTier='" + serviceTier + '\'' +
                ", store=" + store +
                ", stream=" + stream +
                ", temperature=" + temperature +
                ", tools=" + tools +
                ", topP=" + topP +
                ", instructions='" + instructions + '\'' +
                ", include=" + include +
                ", caching=" + caching +
                ", text=" + text +
                ", expireAt=" + expireAt +
                ", toolChoice=" + toolChoice +
                ", parallelToolCalls=" + parallelToolCalls +
                ", maxToolCalls=" + maxToolCalls +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ResponsesInput input;
        private String model;
        private Long maxOutputTokens;
        private String previousResponseId;
        private ResponsesThinking thinking;
        private ResponsesReasoning reasoning;
        private String serviceTier;
        private Boolean store;
        private Boolean stream;
        private Double temperature;
        private List<ResponsesTool> tools;
        private Double topP;
        private String instructions;
        private List<String> include;
        private ResponsesCaching caching;
        private ResponsesText text;
        private Long expireAt;
        private ResponsesToolChoice toolChoice;
        private Boolean parallelToolCalls;
        private Long maxToolCalls;

        public Builder input(ResponsesInput input) {
            this.input = input;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder maxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }

        public Builder previousResponseId(String previousResponseId) {
            this.previousResponseId = previousResponseId;
            return this;
        }

        public Builder thinking(ResponsesThinking thinking) {
            this.thinking = thinking;
            return this;
        }

        public Builder reasoning(ResponsesReasoning reasoning) {
            this.reasoning = reasoning;
            return this;
        }

        public Builder serviceTier(String serviceTier) {
            this.serviceTier = serviceTier;
            return this;
        }

        public Builder store(Boolean store) {
            this.store = store;
            return this;
        }

        public Builder stream(Boolean stream) {
            this.stream = stream;
            return this;
        }

        public Builder temperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder tools(List<ResponsesTool> tools) {
            this.tools = tools;
            return this;
        }

        public Builder topP(Double topP) {
            this.topP = topP;
            return this;
        }

        public Builder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        public Builder include(List<String> include) {
            this.include = include;
            return this;
        }

        public Builder caching(ResponsesCaching caching) {
            this.caching = caching;
            return this;
        }

        public Builder text(ResponsesText text) {
            this.text = text;
            return this;
        }

        public Builder expireAt(Long expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        public Builder toolChoice(ResponsesToolChoice toolChoice) {
            this.toolChoice = toolChoice;
            return this;
        }

        public Builder parallelToolCalls(Boolean parallelToolCalls) {
            this.parallelToolCalls = parallelToolCalls;
            return this;
        }

        public Builder maxToolCalls(Long maxToolCalls) {
            this.maxToolCalls = maxToolCalls;
            return this;
        }

        public CreateResponsesRequest build() {
            CreateResponsesRequest responsesRequest = new CreateResponsesRequest();
            responsesRequest.setInput(input);
            responsesRequest.setModel(model);
            responsesRequest.setMaxOutputTokens(maxOutputTokens);
            responsesRequest.setPreviousResponseId(previousResponseId);
            responsesRequest.setThinking(thinking);
            responsesRequest.setReasoning(reasoning);
            responsesRequest.setServiceTier(serviceTier);
            responsesRequest.setStore(store);
            responsesRequest.setStream(stream);
            responsesRequest.setTemperature(temperature);
            responsesRequest.setTools(tools);
            responsesRequest.setTopP(topP);
            responsesRequest.setInstructions(instructions);
            responsesRequest.setInclude(include);
            responsesRequest.setCaching(caching);
            responsesRequest.setText(text);
            responsesRequest.setExpireAt(expireAt);
            responsesRequest.setToolChoice(toolChoice);
            responsesRequest.setParallelToolCalls(parallelToolCalls);
            responsesRequest.setMaxToolCalls(maxToolCalls);
            return responsesRequest;
        }
    }
}