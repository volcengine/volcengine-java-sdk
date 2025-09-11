package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.tool.mcp.MCPAllowedTools;
import com.volcengine.ark.runtime.model.responses.tool.mcp.MCPRequireApproval;

import java.util.Map;

public class ToolMCP extends ResponsesTool {
    @JsonProperty("server_label")
    private String serverLabel;

    @JsonProperty("server_url")
    private String serverUrl;

    @JsonProperty("allowed_tools")
    private MCPAllowedTools allowedTools;

    @JsonProperty("headers")
    private Map<String, String> headers;

    @JsonProperty("require_approval")
    private MCPRequireApproval requireApproval;

    @JsonProperty("server_description")
    private String serverDescription;

    public ToolMCP() {
        super(ResponsesConstants.TOOL_TYPE_MCP);
    }

    public String getServerLabel() {
        return serverLabel;
    }

    public void setServerLabel(String serverLabel) {
        this.serverLabel = serverLabel;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public MCPAllowedTools getAllowedTools() {
        return allowedTools;
    }

    public void setAllowedTools(MCPAllowedTools allowedTools) {
        this.allowedTools = allowedTools;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public MCPRequireApproval getRequireApproval() {
        return requireApproval;
    }

    public void setRequireApproval(MCPRequireApproval requireApproval) {
        this.requireApproval = requireApproval;
    }

    public String getServerDescription() {
        return serverDescription;
    }

    public void setServerDescription(String serverDescription) {
        this.serverDescription = serverDescription;
    }

    @Override
    public String toString() {
        return "ToolMCP{" +
                "serverLabel='" + serverLabel + '\'' +
                ", serverUrl='" + serverUrl + '\'' +
                ", allowedTools=" + allowedTools +
                ", headers=" + headers +
                ", requireApproval=" + requireApproval +
                ", serverDescription='" + serverDescription + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String serverDescription;
        private MCPRequireApproval requireApproval;
        private Map<String, String> headers;
        private MCPAllowedTools allowedTools;
        private String serverUrl;
        private String serverLabel;

        private Builder() {
        }

        public Builder serverDescription(String serverDescription) {
            this.serverDescription = serverDescription;
            return this;
        }

        public Builder requireApproval(MCPRequireApproval requireApproval) {
            this.requireApproval = requireApproval;
            return this;
        }

        public Builder headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder allowedTools(MCPAllowedTools allowedTools) {
            this.allowedTools = allowedTools;
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder serverLabel(String serverLabel) {
            this.serverLabel = serverLabel;
            return this;
        }

        public ToolMCP build() {
            ToolMCP toolMCP = new ToolMCP();
            toolMCP.setServerDescription(serverDescription);
            toolMCP.setRequireApproval(requireApproval);
            toolMCP.setHeaders(headers);
            toolMCP.setAllowedTools(allowedTools);
            toolMCP.setServerUrl(serverUrl);
            toolMCP.setServerLabel(serverLabel);
            return toolMCP;
        }
    }
}
