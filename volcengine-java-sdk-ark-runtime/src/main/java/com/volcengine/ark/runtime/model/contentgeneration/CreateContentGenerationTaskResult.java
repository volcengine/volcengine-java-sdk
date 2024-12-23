package com.volcengine.ark.runtime.model.contentgeneration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateContentGenerationTaskResult {

    @JsonProperty("id")
    private String id;

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

    @Override
    public String toString() {
        return "CreateContentGenerationTaskResult{" +
                "id='" + id + '\'' +
                '}';
    }

    public static CreateContentGenerationTaskResult.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;

        private Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public CreateContentGenerationTaskResult build() {
            CreateContentGenerationTaskResult createContentGenerationTaskResult = new CreateContentGenerationTaskResult();
            createContentGenerationTaskResult.setId(id);
            return createContentGenerationTaskResult;
        }
    }
}
