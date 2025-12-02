package com.volcengine.ark.runtime.model.responses.item.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class DoubaoAppCallBlockOutputText extends DoubaoAppCallBlock {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = ResponsesConstants.DOBAO_APP_BLOCK_TYPE_OUTPUT_TEXT;

    @JsonProperty("text")
    private String text;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public DoubaoAppCallBlockOutputText() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String text;
        private String status;
        private String parentId;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
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

        public DoubaoAppCallBlockOutputText build() {
            DoubaoAppCallBlockOutputText outputText = new DoubaoAppCallBlockOutputText();
            outputText.setId(id);
            outputText.setText(text);
            outputText.setStatus(status);
            outputText.setParentId(parentId);
            return outputText;
        }
    }

    @Override
    public String toString() {
        return "DoubaoAppCallBlockOutputText{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", status='" + status + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
