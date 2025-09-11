package com.volcengine.ark.runtime.model.responses.tool.mcp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(using = MCPRequireApproval.MCPRequireApprovalSerializer.class)
@JsonDeserialize(using = MCPRequireApproval.MCPRequireApprovalDeserializer.class)
public class MCPRequireApproval {

    private String mode;

    private MCPToolApprovalFilter filter;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public MCPToolApprovalFilter getFilter() {
        return filter;
    }

    public void setFilter(MCPToolApprovalFilter filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "MCPRequireApproval{" +
                "mode='" + mode + '\'' +
                ", filter=" + filter +
                '}';
    }

    static class MCPRequireApprovalSerializer extends JsonSerializer<MCPRequireApproval> {
        @Override
        public void serialize(MCPRequireApproval value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value.mode != null) {
                gen.writeString(value.mode);
            } else if (value.filter != null) {
                gen.writeObject(value.filter);
            } else {
                gen.writeNull();
            }
        }
    }

    static class MCPRequireApprovalDeserializer extends JsonDeserializer<MCPRequireApproval> {
        @Override
        public MCPRequireApproval deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode node = p.getCodec().readTree(p);
            if (node.isObject()) {
                MCPToolApprovalFilter toolFilter = p.getCodec().treeToValue(node, MCPToolApprovalFilter.class);
                return MCPRequireApproval.builder().filter(toolFilter).build();
            } else if (node.isTextual()) {
                return MCPRequireApproval.builder().mode(node.asText()).build();
            } else {
                throw new IOException("Unexpected JSON type for MCPRequireApproval");
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String mode;
        private MCPToolApprovalFilter filter;

        private Builder() {
        }

        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public Builder filter(MCPToolApprovalFilter filter) {
            this.filter = filter;
            return this;
        }

        public MCPRequireApproval build() {
            MCPRequireApproval mCPRequireApproval = new MCPRequireApproval();
            mCPRequireApproval.setMode(mode);
            mCPRequireApproval.setFilter(filter);
            return mCPRequireApproval;
        }
    }
}
