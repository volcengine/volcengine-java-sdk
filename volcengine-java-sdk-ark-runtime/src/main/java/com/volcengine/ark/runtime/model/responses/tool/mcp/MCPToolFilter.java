package com.volcengine.ark.runtime.model.responses.tool.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties
public class MCPToolFilter {

    @JsonProperty("tool_names")
    private List<String> toolNames;

    public List<String> getToolNames() {
        return toolNames;
    }

    public void setToolNames(List<String> toolNames) {
        this.toolNames = toolNames;
    }

    @Override
    public String toString() {
        return "MCPToolFilter{" +
                "toolNames=" + toolNames +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private List<String> toolNames;

        private Builder() {
        }

        public Builder toolNames(List<String> toolNames) {
            this.toolNames = toolNames;
            return this;
        }

        public MCPToolFilter build() {
            MCPToolFilter mCPToolFilter = new MCPToolFilter();
            mCPToolFilter.setToolNames(toolNames);
            return mCPToolFilter;
        }
    }
}
