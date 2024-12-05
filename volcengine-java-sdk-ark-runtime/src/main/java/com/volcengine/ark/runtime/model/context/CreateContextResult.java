package com.volcengine.ark.runtime.model.context;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.Usage;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateContextResult {

    @JsonProperty("id")
    private String id;

    @JsonProperty("model")
    private String model;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("ttl")
    private Integer ttl;

    @JsonProperty("truncation_strategy")
    private TruncationStrategy truncationStrategy;

    @JsonProperty("usage")
    private Usage usage;

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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "CreateContextResult{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", mode='" + mode + '\'' +
                ", ttl=" + ttl +
                ", truncationStrategy=" + truncationStrategy +
                ", usage=" + usage +
                '}';
    }
}
