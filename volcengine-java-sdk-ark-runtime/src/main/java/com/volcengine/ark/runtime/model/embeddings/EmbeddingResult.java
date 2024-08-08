package com.volcengine.ark.runtime.model.embeddings;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.volcengine.ark.runtime.model.Usage;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbeddingResult {

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
    String model;

    /**
     * The type of object returned, should be "list"
     */
    String object;

    /**
     * A list of the calculated embeddings
     */
    List<Embedding> data;

    /**
     * The API usage for this request
     */
    Usage usage;

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

    public List<Embedding> getData() {
        return data;
    }

    public void setData(List<Embedding> data) {
        this.data = data;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
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
        return "EmbeddingResult{" +
                "id='" + id + '\'' +
                ", created='" + created + '\'' +
                ", model='" + model + '\'' +
                ", object='" + object + '\'' +
                ", data=" + data +
                ", usage=" + usage +
                '}';
    }
}
