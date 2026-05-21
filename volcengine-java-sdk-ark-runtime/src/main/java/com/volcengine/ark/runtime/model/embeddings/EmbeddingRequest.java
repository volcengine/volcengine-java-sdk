package com.volcengine.ark.runtime.model.embeddings;


import com.fasterxml.jackson.annotation.JsonProperty;

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

    /**
     * The format of the embeddings data.
     * Currently supports "float" and "base64".
     */
    @JsonProperty("encoding_format")
    String encodingFormat;

    /**
     * The number of dimensions the resulting output embeddings should have.
     * Only supported in certain models that allow dynamic dimension output.
     */
    @JsonProperty("dimensions")
    Long dimensions;

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

    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public Long getDimensions() {
        return dimensions;
    }

    public void setDimensions(Long dimensions) {
        this.dimensions = dimensions;
    }

    public static EmbeddingRequest.Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String model;
        private List<String> input;
        private String user;
        private String encodingFormat;
        private Long dimensions;

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

        public Builder encodingFormat(String encodingFormat) {
            this.encodingFormat = encodingFormat;
            return this;
        }

        public Builder dimensions(Long dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public EmbeddingRequest build() {
            EmbeddingRequest embeddingRequest = new EmbeddingRequest();
            embeddingRequest.setModel(model);
            embeddingRequest.setInput(input);
            embeddingRequest.setUser(user);
            embeddingRequest.setEncodingFormat(encodingFormat);
            embeddingRequest.setDimensions(dimensions);
            return embeddingRequest;
        }
    }
}
