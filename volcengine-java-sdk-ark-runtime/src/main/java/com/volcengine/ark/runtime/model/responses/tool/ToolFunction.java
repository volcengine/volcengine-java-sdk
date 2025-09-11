package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class ToolFunction extends ResponsesTool {
    @JsonProperty("name")
    private String name;

    @JsonProperty("strict")
    private Boolean strict;

    @JsonProperty("description")
    private String description;

    @JsonProperty("parameters")
    private JsonNode parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStrict() {
        return strict;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JsonNode getParameters() {
        return parameters;
    }

    public void setParameters(JsonNode parameters) {
        this.parameters = parameters;
    }

    public ToolFunction() {
        super(ResponsesConstants.TOOL_TYPE_FUNCTION);
    }

    @Override
    public String toString() {
        return "ToolFunction{" +
                "name='" + name + '\'' +
                ", strict=" + strict +
                ", type='" + getType() + '\'' +
                ", description='" + description + '\'' +
                ", parameters=" + parameters +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private Boolean strict;
        private String type;
        private String description;
        private JsonNode parameters;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder strict(Boolean strict) {
            this.strict = strict;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder parameters(JsonNode parameters) {
            this.parameters = parameters;
            return this;
        }

        public ToolFunction build() {
            ToolFunction toolFunction = new ToolFunction();
            toolFunction.setName(name);
            toolFunction.setStrict(strict);
            toolFunction.setDescription(description);
            toolFunction.setParameters(parameters);
            return toolFunction;
        }
    }
}