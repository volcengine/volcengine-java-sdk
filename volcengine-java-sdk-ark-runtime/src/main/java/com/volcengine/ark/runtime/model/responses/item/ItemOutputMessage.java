package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.content.OutputContentItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize()
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class ItemOutputMessage extends BaseMessageItem implements OutputItem {
    @JsonProperty("content")
    private List<OutputContentItem> content;

    @JsonProperty("status")
    private String status;

    public List<OutputContentItem> getContent() {
        return content;
    }

    public void setContent(List<OutputContentItem> content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemOutputMessage{" +
                "type='" + getType() + '\'' +
                ", role='" + getRole() + '\'' +
                ", content=" + content +
                ", status='" + status + '\'' +
                ", id='" + getId() + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String role;
        private List<OutputContentItem> content;
        private String status;
        private String id;

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder content(List<OutputContentItem> content) {
            this.content = content;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public ItemOutputMessage build() {
            ItemOutputMessage itemOutputMessage = new ItemOutputMessage();
            itemOutputMessage.setRole(role);
            itemOutputMessage.setContent(content);
            itemOutputMessage.setStatus(status);
            itemOutputMessage.setId(id);
            return itemOutputMessage;
        }
    }
}