package com.volcengine.ark.runtime.model.responses.item.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class DoubaoAppCallBlockReasoningText extends DoubaoAppCallBlock {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = ResponsesConstants.DOBAO_APP_BLOCK_TYPE_REASONING_TEXT;

    @JsonProperty("reasoning_text")
    private String reasoningText;

    @JsonProperty("status")
    private String status;

    @JsonProperty("parent_id")
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReasoningText() {
        return reasoningText;
    }

    public void setReasoningText(String reasoningText) {
        this.reasoningText = reasoningText;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DoubaoAppCallBlockReasoningText() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String reasoningText;
        private String status;
        private String parentId;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder reasoningText(String reasoningText) {
            this.reasoningText = reasoningText;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public DoubaoAppCallBlockReasoningText build() {
            DoubaoAppCallBlockReasoningText reasoningText = new DoubaoAppCallBlockReasoningText();
            reasoningText.setId(id);
            reasoningText.setReasoningText(this.reasoningText);
            reasoningText.setStatus(status);
            reasoningText.setParentId(parentId);
            return reasoningText;
        }
    }

    @Override
    public String toString() {
        return "DoubaoAppCallBlockReasoningText{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", reasoningText='" + reasoningText + '\'' +
                ", status='" + status + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
