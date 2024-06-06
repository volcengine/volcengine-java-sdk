package com.volcengine.ark.runtime.model.embeddings;


import java.util.List;


public class EmbeddingRequest {

    /**
     * The name of the model to use.
     * Required if using the new v1/embeddings endpoint.
     */
    String model;

    /**
     * Input text to get embeddings for, encoded as a string or array of tokens.
     * To get embeddings for multiple inputs in a single request, pass an array of strings or array of token arrays.
     * Each input must not exceed 2048 tokens in length.
     * <p>
     * Unless you are embedding code, we suggest replacing newlines (\n) in your input with a single space,
     * as we have observed inferior results when newlines are present.
     */
    List<String> input;

    /**
     * A unique identifier representing your end-user, which will help OpenAI to monitor and detect abuse.
     */
    String user;

    public EmbeddingRequest() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static EmbeddingRequest.Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String model;
        private List<String> input;
        private String user;

        private Builder() {
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder input(List<String> input) {
            this.input = input;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public EmbeddingRequest build() {
            EmbeddingRequest embeddingRequest = new EmbeddingRequest();
            embeddingRequest.setModel(model);
            embeddingRequest.setInput(input);
            embeddingRequest.setUser(user);
            return embeddingRequest;
        }
    }
}
