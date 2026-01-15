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

        public ResponsesTextFormat build() {
            ResponsesTextFormat responsesTextFormat = new ResponsesTextFormat();
            responsesTextFormat.setType(type);
            responsesTextFormat.setName(name);
            responsesTextFormat.setSchema(schema);
            return responsesTextFormat;
        }
    }
}