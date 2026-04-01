package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateContentGenerationTaskResult {

    @JsonProperty("id")
    private String id;

    @JsonProperty("safety_identifier")
    private String safetyIdentifier;

    public CreateContentGenerationTaskResult() {
    }

    public CreateContentGenerationTaskResult(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSafetyIdentifier() {
        return safetyIdentifier;
    }

    public void setSafetyIdentifier(String safetyIdentifier) {
        this.safetyIdentifier = safetyIdentifier;
    }

    @Override
    public String toString() {
        return "CreateContentGenerationTaskResult{" +
                "id='" + id + '\'' +
                ", safetyIdentifier='" + safetyIdentifier + '\'' +
                '}';
    }

    public static CreateContentGenerationTaskResult.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String safetyIdentifier;

        private Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder safetyIdentifier(String safetyIdentifier) {
            this.safetyIdentifier = safetyIdentifier;
            return this;
        }

        public CreateContentGenerationTaskResult build() {
            CreateContentGenerationTaskResult createContentGenerationTaskResult = new CreateContentGenerationTaskResult();
            createContentGenerationTaskResult.setId(id);
            createContentGenerationTaskResult.setSafetyIdentifier(safetyIdentifier);
            return createContentGenerationTaskResult;
        }
    }
}
