package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ToolFunction.class, name = "function"),
        @JsonSubTypes.Type(value = ToolWebSearch.class, name = "web_search"),
        @JsonSubTypes.Type(value = ToolImageProcess.class, name = "image_process"),
        @JsonSubTypes.Type(value = ToolMCP.class, name = "mcp"),
        @JsonSubTypes.Type(value = ToolDoubaoApp.class, name = "doubao_app")
})
public abstract class ResponsesTool {
    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResponsesTool() {
    }

    public ResponsesTool(String type) {
        this.type = type;
    }
}