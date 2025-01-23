package com.volcengine.ark.runtime.model.multimodalembeddings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultimodalEmbeddingResult {

    /**
     * Unique id assigned to this embedding
     */
    String id;

    /**
     * The creation time in epoch seconds.
     */
    String created;

    /**
     * The model used for generating embeddings
     */
    private String model;

    /**
     * The type of object returned, should be "list"
     */
    private String object;

    /**
     * A list of the calculated embeddings
     */
    private MultimodalEmbedding data;

    /**
     * The API usage for this request
     */
    private MultimodalEmbeddingUsage usage;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public MultimodalEmbedding getData() {
        return data;
    }

    public void setData(MultimodalEmbedding data) {
        this.data = data;
    }

    public MultimodalEmbeddingUsage getUsage() {
        return usage;
    }

    public void setUsage(MultimodalEmbeddingUsage usage) {
        this.usage = usage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "EmbeddingResult{" + "id='" + id + '\'' + ", created='" + created + '\'' + ", model='" + model + '\'' + ", object='" + object + '\'' + ", data=" + data + ", usage=" + usage + '}';
    }
}
