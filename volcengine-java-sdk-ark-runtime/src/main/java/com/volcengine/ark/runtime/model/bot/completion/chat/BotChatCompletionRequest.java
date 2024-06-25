package com.volcengine.ark.runtime.model.bot.completion.chat;

import java.util.List;
import java.util.Map;

import com.volcengine.ark.runtime.model.completion.chat.ChatCompletionRequest;
import com.volcengine.ark.runtime.model.completion.chat.ChatFunction;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;
import com.volcengine.ark.runtime.model.completion.chat.ChatTool;

public class BotChatCompletionRequest extends ChatCompletionRequest {

    /**
     * In bot chat completion, the request.model supposed to be set with botId
     * Or you can pass botId directly, and the request.model will be replaced with it.
     */
    private String botId;

    /**
     * A map to pass extra parameters for bot chat completion.
     */
    private Map<String, Object> metadata;

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "BotChatCompletionRequest{" +
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
                ", functions=" + getFunctions() +
                ", tools=" + getTools() +
                ", functionCall=" + getFunctionCall() +
                ", logprobs=" + getLogprobs() +
                ", topLogprobs=" + getTopLogprobs() +
                ", botId=" + getBotId() +
                ", metadata=" + getMetadata() +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends ChatCompletionRequest.Builder {
        private Map<String, Object> metadata;
        private String botId;
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
        private List<ChatFunction> functions;
        private List<ChatTool> tools;
        private ChatCompletionRequestFunctionCall functionCall;
        private Boolean logprobs;
        private Integer topLogprobs;

        private Builder() {
        }

        public static Builder aBotChatCompletionRequest() {
            return new Builder();
        }

        public Builder metadata(Map<String, Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder botId(String botId) {
            this.botId = botId;
            // overwrite the model.
            this.model = botId;
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

        public Builder functions(List<ChatFunction> functions) {
            this.functions = functions;
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

        public BotChatCompletionRequest build() {
            BotChatCompletionRequest botChatCompletionRequest = new BotChatCompletionRequest();
            botChatCompletionRequest.setMetadata(metadata);
            botChatCompletionRequest.setModel(model);
            botChatCompletionRequest.setBotId(botId);
            botChatCompletionRequest.setMessages(messages);
            botChatCompletionRequest.setTemperature(temperature);
            botChatCompletionRequest.setTopP(topP);
            botChatCompletionRequest.setStream(stream);
            botChatCompletionRequest.setStreamOptions(streamOptions);
            botChatCompletionRequest.setStop(stop);
            botChatCompletionRequest.setMaxTokens(maxTokens);
            botChatCompletionRequest.setPresencePenalty(presencePenalty);
            botChatCompletionRequest.setFrequencyPenalty(frequencyPenalty);
            botChatCompletionRequest.setLogitBias(logitBias);
            botChatCompletionRequest.setUser(user);
            botChatCompletionRequest.setFunctions(functions);
            botChatCompletionRequest.setTools(tools);
            botChatCompletionRequest.setFunctionCall(functionCall);
            botChatCompletionRequest.setLogprobs(logprobs);
            botChatCompletionRequest.setTopLogprobs(topLogprobs);
            return botChatCompletionRequest;
        }
    }
}
