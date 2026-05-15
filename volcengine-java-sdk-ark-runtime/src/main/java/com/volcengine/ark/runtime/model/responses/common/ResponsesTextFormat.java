package com.volcengine.ark.runtime.model.responses.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class ResponsesTextFormat {
    @JsonProperty("type")
    private String type;

    @JsonProperty("name")
    private String name;

    @JsonProperty("schema")
    private JsonNode schema;

    @JsonProperty("description")
    private String description;

    @JsonProperty("strict")
    private Boolean strict;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonNode getSchema() {
        return schema;
    }

    public void setSchema(JsonNode schema) {
        this.schema = schema;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStrict() {
        return strict;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    @Override
    public String toString() {
        return "ResponsesTextFormat{" +
                "type='" + type + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private String name;
        private JsonNode schema;
        private String description;
        private Boolean strict;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder schema(JsonNode schema) {
            this.schema = schema;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder strict(Boolean strict) {
            this.strict = strict;
            return this;
        }

        public ResponsesTextFormat build() {
            ResponsesTextFormat responsesTextFormat = new ResponsesTextFormat();
            responsesTextFormat.setType(type);
            responsesTextFormat.setName(name);
            responsesTextFormat.setSchema(schema);
            responsesTextFormat.setDescription(description);
            responsesTextFormat.setStrict(strict);
            return responsesTextFormat;
        }
    }
}