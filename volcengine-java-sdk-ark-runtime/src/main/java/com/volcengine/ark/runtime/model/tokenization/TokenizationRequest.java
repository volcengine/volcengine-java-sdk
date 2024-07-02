package com.volcengine.ark.runtime.model.tokenization;

import com.volcengine.ark.runtime.model.embeddings.EmbeddingRequest;

import java.util.List;

public class TokenizationRequest {
    String model;

    List<String> text;

    /**
     * A unique identifier representing your end-user, which will help OpenAI to monitor and detect abuse.
     */
    String user;

    public TokenizationRequest(String model, List<String> text) {
        this.model = model;
        this.text = text;
    }

    public TokenizationRequest(String model, List<String> text, String user) {
        this.model = model;
        this.text = text;
        this.user = user;
    }

    public TokenizationRequest() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "TokenizationRequest{" +
                "model='" + model + '\'' +
                ", text=" + text +
                ", user='" + user + '\'' +
                '}';
    }

    public static TokenizationRequest.Builder builder() {
        return new TokenizationRequest.Builder();
    }

    public static final class Builder {
        private String model;
        private List<String> text;
        private String user;

        private Builder() {
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder text(List<String> text) {
            this.text = text;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public TokenizationRequest build() {
            TokenizationRequest tokenizationRequest = new TokenizationRequest();
            tokenizationRequest.setModel(model);
            tokenizationRequest.setText(text);
            tokenizationRequest.setUser(user);
            return tokenizationRequest;
        }
    }
}
