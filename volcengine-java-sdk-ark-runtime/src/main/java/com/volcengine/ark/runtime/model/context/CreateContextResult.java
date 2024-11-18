package com.volcengine.ark.runtime.model.context;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateContextResult {

    @JsonProperty("id")
    private String id;

    @JsonProperty("model")
    private String model;

    @JsonProperty("ttl")
    private Integer ttl;

    @JsonProperty("truncation_strategy")
    private TruncationStrategy truncationStrategy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public TruncationStrategy getTruncationStrategy() {
        return truncationStrategy;
    }

    public void setTruncationStrategy(TruncationStrategy truncationStrategy) {
        this.truncationStrategy = truncationStrategy;
    }

    @Override
    public String toString() {
        return "CreateContextResult{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", ttl=" + ttl +
                ", truncationStrategy=" + truncationStrategy +
                '}';
    }
}
