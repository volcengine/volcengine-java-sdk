package com.volcengine.ark.runtime.model.responses.tool.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(using = MCPAllowedTools.MCPAllowedToolsSerializer.class)
@JsonDeserialize(using = MCPAllowedTools.MCPAllowedToolsDeserializer.class)
public class MCPAllowedTools {

    private List<String> allowedTools;

    private MCPToolFilter filter;

    public List<String> getAllowedTools() {
        return allowedTools;
    }

    public void setAllowedTools(List<String> allowedTools) {
        this.allowedTools = allowedTools;
    }

    public MCPToolFilter getFilter() {
        return filter;
    }

    public void setFilter(MCPToolFilter filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "MCPAllowedTools{" +
                "allowedTools=" + allowedTools +
                ", toolFilter=" + filter +
                '}';
    }

    static class MCPAllowedToolsSerializer extends JsonSerializer<MCPAllowedTools> {
        @Override
        public void serialize(MCPAllowedTools value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value.allowedTools != null) {
                gen.writeArray(value.allowedTools.toArray(new String[0]), 0, value.allowedTools.size());
            } else if (value.filter != null) {
                gen.writeObject(value.filter);
            } else {
                gen.writeNull();
            }
        }
    }

    static class MCPAllowedToolsDeserializer extends JsonDeserializer<MCPAllowedTools> {
        @Override
        public MCPAllowedTools deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode node = p.getCodec().readTree(p);
            if (node.isArray()) {
                List<String> allowedTools = Arrays.asList(p.getCodec().treeToValue(node, String[].class));
                return MCPAllowedTools.builder().allowedTools(allowedTools).build();
            } else if (node.isObject()) {
                MCPToolFilter toolFilter = p.getCodec().treeToValue(node, MCPToolFilter.class);
                return MCPAllowedTools.builder().toolFilter(toolFilter).build();
            } else {
                throw new IOException("Unexpected JSON type for MCPAllowedTools");
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private List<String> allowedTools;
        private MCPToolFilter toolFilter;

        private Builder() {
        }

        public static Builder aMCPAllowedTools() {
            return new Builder();
        }

        public Builder allowedTools(List<String> allowedTools) {
            this.allowedTools = allowedTools;
            return this;
        }

        public Builder toolFilter(MCPToolFilter toolFilter) {
            this.toolFilter = toolFilter;
            return this;
        }

        public MCPAllowedTools build() {
            MCPAllowedTools mCPAllowedTools = new MCPAllowedTools();
            mCPAllowedTools.setAllowedTools(allowedTools);
            mCPAllowedTools.setFilter(toolFilter);
            return mCPAllowedTools;
        }
    }
}
