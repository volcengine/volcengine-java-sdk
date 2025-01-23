package com.volcengine.ark.runtime.model.multimodalembeddings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
                '}';
    }
}
