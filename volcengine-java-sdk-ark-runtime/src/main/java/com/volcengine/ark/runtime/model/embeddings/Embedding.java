package com.volcengine.ark.runtime.model.embeddings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Embedding {

    /**
     * The type of object returned, should be "embedding"
     */
    String object;

    /**
     * The embedding vector
     */
    List<Double> embedding;

    /**
     * The position of this embedding in the list
     */
    Integer index;

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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Embedding{" +
                "object='" + object + '\'' +
                ", embedding=" + embedding +
                ", index=" + index +
                '}';
    }
}
