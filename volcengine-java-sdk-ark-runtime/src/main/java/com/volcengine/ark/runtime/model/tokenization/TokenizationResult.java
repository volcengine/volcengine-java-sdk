package com.volcengine.ark.runtime.model.tokenization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.volcengine.ark.runtime.model.embeddings.Embedding;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenizationResult {
    /**
     * Unique id assigned to this tokenization
     */
    String id;

    /**
     * The creation time in epoch seconds.
     */
    String created;

    /**
     * The model used for generating tokenization
     */
    String model;

    /**
     * The type of object returned, should be "list"
     */
    String object;

    /**
     * A list of the calculated tokenization
     */
    List<Tokenization> data;

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

    public List<Tokenization> getData() {
        return data;
    }

    public void setData(List<Tokenization> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TokenizationResult{" +
                "id='" + id + '\'' +
                ", created='" + created + '\'' +
                ", model='" + model + '\'' +
                ", object='" + object + '\'' +
                ", data=" + data +
                '}';
    }
}
