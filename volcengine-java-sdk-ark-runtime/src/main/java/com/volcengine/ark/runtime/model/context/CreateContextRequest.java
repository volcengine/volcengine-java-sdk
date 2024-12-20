package com.volcengine.ark.runtime.model.context;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.completion.chat.ChatMessage;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateContextRequest {

    @JsonProperty("model")
    private String model;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("messages")
    private List<ChatMessage> messages;

    @JsonProperty("ttl")
    private Integer ttl;

    @JsonProperty("truncation_strategy")
    private TruncationStrategy truncationStrategy;

    public CreateContextRequest() {
    }

    public CreateContextRequest(String model, String mode, List<ChatMessage> messages, Integer ttl, TruncationStrategy truncationStrategy) {
        this.model = model;
        this.mode = mode;
        this.messages = messages;
        this.ttl = ttl;
        this.truncationStrategy = truncationStrategy;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public List<ChatMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatMessage> messages) {
        this.messages = messages;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public TruncationStrategy getTruncationStrategy() {
        return truncationStrategy;
    }

    public void setTruncationStrategy(TruncationStrategy truncationStrategy) {
        this.truncationStrategy = truncationStrategy;
    }

    @Override
    public String toString() {
        return "CreateContextRequest{" +
                "model='" + model + '\'' +
                ", mode='" + mode + '\'' +
                ", messages=" + messages +
                ", ttl=" + ttl +
                ", truncationStrategy=" + truncationStrategy +
                '}';
    }

    public static CreateContextRequest.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String model;
        private String mode;
        private List<ChatMessage> messages;
        private Integer ttl;
        private TruncationStrategy truncationStrategy;

        private Builder() {
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public Builder messages(List<ChatMessage> messages) {
            this.messages = messages;
            return this;
        }

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder truncationStrategy(TruncationStrategy truncationStrategy) {
            this.truncationStrategy = truncationStrategy;
            return this;
        }

        public CreateContextRequest build() {
            CreateContextRequest createContextRequest = new CreateContextRequest();
            createContextRequest.setModel(model);
            createContextRequest.setMode(mode);
            createContextRequest.setMessages(messages);
            createContextRequest.setTtl(ttl);
            createContextRequest.setTruncationStrategy(truncationStrategy);
            return createContextRequest;
        }
    }
}
