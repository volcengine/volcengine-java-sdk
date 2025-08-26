package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.tool.mcp.MCPTool;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemMCPListTools extends BaseItem implements InputItem, OutputItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("server_label")
    private String serverLabel;

    @JsonProperty("tools")
    private List<MCPTool> tools;

    public ItemMCPListTools(String type) {
        super(ResponsesConstants.ITEM_TYPE_MCP_LIST_TOOLS);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServerLabel() {
        return serverLabel;
    }

    public void setServerLabel(String serverLabel) {
        this.serverLabel = serverLabel;
    }

    public List<MCPTool> getTools() {
        return tools;
    }

    public void setTools(List<MCPTool> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "ItemMCPListTools{" +
                "id='" + id + '\'' +
                ", serverLabel='" + serverLabel + '\'' +
                ", tools=" + tools +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private String serverLabel;
        private List<MCPTool> tools;

        private Builder() {
        }

        public static Builder anItemMCPListTools() {
            return new Builder();
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder serverLabel(String serverLabel) {
            this.serverLabel = serverLabel;
            return this;
        }

        public Builder tools(List<MCPTool> tools) {
            this.tools = tools;
            return this;
        }

        public ItemMCPListTools build() {
            ItemMCPListTools itemMCPListTools = new ItemMCPListTools(null);
            itemMCPListTools.setId(id);
            itemMCPListTools.setServerLabel(serverLabel);
            itemMCPListTools.setTools(tools);
            return itemMCPListTools;
        }
    }
}
