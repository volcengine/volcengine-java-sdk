package com.volcengine.ark.runtime.model.completion.chat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseFormatJSONSchemaJSONSchemaParam {
    String name;
    String description;
    JsonNode schema;
    boolean strict;

    @Override
    public String toString() {
        return "ResponseFormatJSONSchemaJSONSchemaParam{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", schema=" + schema +
                ", strict=" + strict +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JsonNode getSchema() {
        return schema;
    }

    public void setSchema(JsonNode schema) {
        this.schema = schema;
    }

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }


    public ResponseFormatJSONSchemaJSONSchemaParam(String name) {
        this.name = name;
    }

    public ResponseFormatJSONSchemaJSONSchemaParam(String name, String description, JsonNode schema, boolean strict) {
        this.name = name;
        this.description = description;
        this.schema = schema;
        this.strict = strict;
    }
}