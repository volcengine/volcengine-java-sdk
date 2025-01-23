package com.volcengine.ark.runtime.model.multimodalembeddings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultimodalEmbeddingRequest {

    /**
     * The name of the model to use.
     * Required if using the new v1/embeddings endpoint.
     */
    private String model;

    /**
     * Input text to get embeddings for, encoded as a string or array of tokens.
     * To get embeddings for multiple inputs in a single request, pass an array of strings or array of token arrays.
     * Each input must not exceed 2048 tokens in length.
     * <p>
     * Unless you are embedding code, we suggest replacing newlines (\n) in your input with a single space,
     * as we have observed inferior results when newlines are present.
     */
    private List<MultimodalEmbeddingInput> input;

    @JsonProperty("encoding_format")
    private String encodingFormat;

    public MultimodalEmbeddingRequest() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<MultimodalEmbeddingInput> getInput() {
        return input;
    }

    public void setInput(List<MultimodalEmbeddingInput> input) {
        this.input = input;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public String getEncodingFormat() {
        return encodingFormat;
    }


    public static MultimodalEmbeddingRequest.Builder builder() {
        return new MultimodalEmbeddingRequest.Builder();
    }

    public static final class Builder {
        private String model;
        private List<MultimodalEmbeddingInput> input;
        private String encodingFormat;

        private Builder() {
        }

        public MultimodalEmbeddingRequest.Builder model(String model) {
            this.model = model;
            return this;
        }

        public MultimodalEmbeddingRequest.Builder input(List<MultimodalEmbeddingInput> input) {
            this.input = input;
            return this;
        }

        public MultimodalEmbeddingRequest.Builder encodingFormat(String encodingFormat) {
            this.encodingFormat = encodingFormat;
            return this;
        }

        public MultimodalEmbeddingRequest build() {
            MultimodalEmbeddingRequest embeddingRequest = new MultimodalEmbeddingRequest();
            embeddingRequest.setModel(model);
            embeddingRequest.setInput(input);
            embeddingRequest.setEncodingFormat(encodingFormat);
            return embeddingRequest;
        }
    }
}
