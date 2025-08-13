package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = BaseMessageItem.BaseMessageItemDeserializer.class)
public class BaseMessageItem extends BaseItem {

    @JsonProperty("id")
    private String id;

    @JsonProperty("role")
    private String role;

    public BaseMessageItem() {
        super(ResponsesConstants.ITEM_TYPE_MESSAGE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    static class BaseMessageItemDeserializer extends JsonDeserializer<BaseMessageItem> {
        @Override
        public BaseMessageItem deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            JsonNode node = p.getCodec().readTree(p);
            JsonNode status = node.get("status");
            Class<? extends BaseMessageItem> targetType;
            if (status != null) {
                targetType = ItemOutputMessage.class;
            } else {
                targetType = ItemEasyMessage.class;
            }

            return p.getCodec().treeToValue(node, targetType);
        }
    }
}
