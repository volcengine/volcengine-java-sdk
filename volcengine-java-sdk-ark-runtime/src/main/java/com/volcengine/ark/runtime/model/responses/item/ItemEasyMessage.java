package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize()
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class ItemEasyMessage extends BaseMessageItem implements InputItem {
    @JsonProperty("content")
    private MessageContent content;

    public MessageContent getContent() {
        return content;
    }

    public void setContent(MessageContent content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ItemEasyMessage{" +
                "type='" + getType() + '\'' +
                ", role='" + getRole() + '\'' +
                ", content=" + content +
                ", id='" + getId() + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String role;
        private MessageContent content;
        private String id;

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder content(MessageContent content) {
            this.content = content;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public ItemEasyMessage build() {
            ItemEasyMessage itemEasyMessage = new ItemEasyMessage();
            itemEasyMessage.setRole(role);
            itemEasyMessage.setContent(content);
            itemEasyMessage.setId(id);
            return itemEasyMessage;
        }
    }
}