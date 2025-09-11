package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.tool.websearch.Action;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemWebSearchCall extends BaseItem implements OutputItem {
    @JsonProperty("action")
    private Action action;

    @JsonProperty("status")
    private String status;

    @JsonProperty("id")
    private String id;

    public ItemWebSearchCall() {
        super(ResponsesConstants.ITEM_TYPE_WEB_SEARCH_CALL);
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ItemWebSearchCall{" +
                "type='" + getType() + '\'' +
                ", action=" + action +
                ", status='" + status + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Action action;
        private String status;
        private String id;

        public Builder action(Action action) {
            this.action = action;
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

        public ItemWebSearchCall build() {
            ItemWebSearchCall itemWebSearchCall = new ItemWebSearchCall();
            itemWebSearchCall.setAction(action);
            itemWebSearchCall.setStatus(status);
            itemWebSearchCall.setId(id);
            return itemWebSearchCall;
        }
    }
}