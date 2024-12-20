package com.volcengine.ark.runtime.model.context.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.volcengine.ark.runtime.model.completion.chat.ChatTool;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextChatCompletionRequest extends ChatCompletionRequest {

    @JsonProperty("context_id")
    private String contextId;

    public String getContextId() {
        return contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    @Override
    public String toString() {
        return "ContextChatCompletionRequest{" +
                "contextId='" + getContextId() + '\'' +
                "model='" + getModel() + '\'' +
                ", messages=" + getMessages() +
                ", temperature=" + getTemperature() +
                ", topP=" + getTopP() +
                ", stream=" + getStream() +
                ", streamOptions=" + getStreamOptions() +
                ", stop=" + getStop() +
                ", maxTokens=" + getMaxTokens() +
                ", presencePenalty=" + getPresencePenalty() +
                ", frequencyPenalty=" + getFrequencyPenalty() +
                ", logitBias=" + getLogitBias() +
                ", user='" + getUser() + '\'' +
                ", tools=" + getTools() +
                ", functionCall=" + getFunctionCall() +
                ", logprobs=" + getLogprobs() +
                ", topLogprobs=" + getTopLogprobs() +
                '}';
    }


    public static ContextChatCompletionRequest.Builder builder() {
        return new Builder();
    }

    public static class Builder extends ChatCompletionRequest.Builder {
        private String contextId;
        private String model;
        private List<ChatMessage> messages;
        private Double temperature;
        private Double topP;
        private Boolean stream;
        private ChatCompletionRequestStreamOptions streamOptions;
        private List<String> stop;
        private Integer maxTokens;
        private Double presencePenalty;
        private Double frequencyPenalty;
        private Map<String, Integer> logitBias;
        private String user;
        private List<ChatTool> tools;
        private ChatCompletionRequestFunctionCall functionCall;
        private Boolean logprobs;
        private Integer topLogprobs;
        private Double repetitionPenalty;
        private Integer n;
        private Object toolChoice;
        private ChatCompletionRequestResponseFormat responseFormat;

        private Builder() {
        }

        public Builder contextId(String contextId) {
            this.contextId = contextId;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder messages(List<ChatMessage> messages) {
            this.messages = messages;
            return this;
        }

        public Builder temperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder topP(Double topP) {
            this.topP = topP;
            return this;
        }

        public Builder stream(Boolean stream) {
            this.stream = stream;
            return this;
        }

        public Builder streamOptions(ChatCompletionRequestStreamOptions streamOptions) {
            this.streamOptions = streamOptions;
            return this;
        }

        public Builder stop(List<String> stop) {
            this.stop = stop;
            return this;
        }

        public Builder maxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }

        public Builder presencePenalty(Double presencePenalty) {
            this.presencePenalty = presencePenalty;
            return this;
        }

        public Builder frequencyPenalty(Double frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            return this;
        }

        public Builder logitBias(Map<String, Integer> logitBias) {
            this.logitBias = logitBias;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public Builder tools(List<ChatTool> tools) {
            this.tools = tools;
            return this;
        }

        public Builder functionCall(ChatCompletionRequestFunctionCall functionCall) {
            this.functionCall = functionCall;
            return this;
        }

        public Builder logprobs(Boolean logprobs) {
            this.logprobs = logprobs;
            return this;
        }

        public Builder topLogprobs(Integer topLogprobs) {
            this.topLogprobs = topLogprobs;
            return this;
        }

        public Builder repetitionPenalty(Double repetitionPenalty) {
            this.repetitionPenalty = repetitionPenalty;
            return this;
        }

        public Builder n(Integer n) {
            this.n = n;
            return this;
        }

        public Builder toolChoice(Object toolChoice) {
            this.toolChoice = toolChoice;
            return this;
        }

        public Builder responseFormat(ChatCompletionRequestResponseFormat responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public ContextChatCompletionRequest build() {
            ContextChatCompletionRequest contextChatCompletionRequest = new ContextChatCompletionRequest();
            contextChatCompletionRequest.setContextId(contextId);
            contextChatCompletionRequest.setModel(model);
            contextChatCompletionRequest.setMessages(messages);
            contextChatCompletionRequest.setTemperature(temperature);
            contextChatCompletionRequest.setTopP(topP);
            contextChatCompletionRequest.setStream(stream);
            contextChatCompletionRequest.setStreamOptions(streamOptions);
            contextChatCompletionRequest.setStop(stop);
            contextChatCompletionRequest.setMaxTokens(maxTokens);
            contextChatCompletionRequest.setPresencePenalty(presencePenalty);
            contextChatCompletionRequest.setFrequencyPenalty(frequencyPenalty);
            contextChatCompletionRequest.setLogitBias(logitBias);
            contextChatCompletionRequest.setUser(user);
            contextChatCompletionRequest.setTools(tools);
            contextChatCompletionRequest.setFunctionCall(functionCall);
            contextChatCompletionRequest.setLogprobs(logprobs);
            contextChatCompletionRequest.setTopLogprobs(topLogprobs);
            contextChatCompletionRequest.setRepetitionPenalty(repetitionPenalty);
            contextChatCompletionRequest.setN(n);
            contextChatCompletionRequest.setToolChoice(toolChoice);
            contextChatCompletionRequest.setResponseFormat(responseFormat);
            return contextChatCompletionRequest;
        }
    }
}
