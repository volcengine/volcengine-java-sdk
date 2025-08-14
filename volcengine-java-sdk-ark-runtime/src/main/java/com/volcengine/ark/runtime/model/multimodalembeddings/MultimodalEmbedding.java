package com.volcengine.ark.runtime.model.multimodalembeddings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultimodalEmbedding {
    /**
     * The type of object returned, should be "embedding"
     */
    private String object;

    /**
     * The embedding vector
     */
    private List<Double> embedding;

    @JsonProperty("sparse_embedding")
    private List<SparseEmbedding> sparseEmbedding;

    public List<SparseEmbedding> getSparseEmbedding() {
        return sparseEmbedding;
    }

    public void setSparseEmbedding(List<SparseEmbedding> sparseEmbedding) {
        this.sparseEmbedding = sparseEmbedding;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Double> getEmbedding() {
        return embedding;
    }

    public void setEmbedding(List<Double> embedding) {
        this.embedding = embedding;
    }

    @Override
    public String toString() {
        return "Embedding{" +
                "object='" + object + '\'' +
                ", embedding=" + embedding +
                ", sparseEmbedding=" + sparseEmbedding +
                '}';
    }
}
