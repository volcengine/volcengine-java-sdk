package com.volcengine.ark.runtime.model.responses.tool.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MCPToolApprovalFilter {
    @JsonProperty("always")
    private MCPToolFilter always;
    @JsonProperty("never")
    private MCPToolFilter never;

    public MCPToolFilter getAlways() {
        return always;
    }

    public void setAlways(MCPToolFilter always) {
        this.always = always;
    }

    public MCPToolFilter getNever() {
        return never;
    }

    public void setNever(MCPToolFilter never) {
        this.never = never;
    }

    @Override
    public String toString() {
        return "MCPToolApprovalFilter{" +
                "always=" + always +
                ", never=" + never +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private MCPToolFilter always;
        private MCPToolFilter never;

        private Builder() {
        }

        public Builder always(MCPToolFilter always) {
            this.always = always;
            return this;
        }

        public Builder never(MCPToolFilter never) {
            this.never = never;
            return this;
        }

        public MCPToolApprovalFilter build() {
            MCPToolApprovalFilter mCPToolApprovalFilter = new MCPToolApprovalFilter();
            mCPToolApprovalFilter.setAlways(always);
            mCPToolApprovalFilter.setNever(never);
            return mCPToolApprovalFilter;
        }
    }
}
