package com.volcengine.ark.runtime.model.responses.item;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessAction;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessArguments;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessError;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemImageProcess extends BaseItem implements InputItem, OutputItem {
    @JsonProperty("action")
    private ImageProcessAction action;

    @JsonProperty("arguments")
    private ImageProcessArguments arguments;

    @JsonProperty("status")
    private String status;

    @JsonProperty("id")
    private String id;

    @JsonProperty("error")
    private ImageProcessError error;

    public ItemImageProcess() {
        super(ResponsesConstants.ITEM_TYPE_IMAGE_PROCESS);
    }

    public ImageProcessAction getAction() {
        return action;
    }

    public void setAction(ImageProcessAction action) {
        this.action = action;
    }

    public ImageProcessArguments getArguments() {
        return arguments;
    }

    public void setArguments(ImageProcessArguments arguments) {
        this.arguments = arguments;
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

    public ImageProcessError getError() {
        return error;
    }

    public void setError(ImageProcessError error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ItemImageProcess{" +
                "type='" + getType() + '\'' +
                ", action=" + action +
                ", arguments=" + arguments +
                ", status='" + status + '\'' +
                ", id='" + id + '\'' +
                ", error=" + error +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ImageProcessAction action;
        private ImageProcessArguments arguments;
        private String status;
        private String id;
        private ImageProcessError error;

        public Builder action(ImageProcessAction action) {
            this.action = action;
            return this;
        }

        public Builder arguments(ImageProcessArguments arguments) {
            this.arguments = arguments;
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

        public Builder error(ImageProcessError error) {
            this.error = error;
            return this;
        }

        public ItemImageProcess build() {
            ItemImageProcess itemImageProcess = new ItemImageProcess();
            itemImageProcess.setAction(action);
            itemImageProcess.setArguments(arguments);
            itemImageProcess.setStatus(status);
            itemImageProcess.setId(id);
            itemImageProcess.setError(error);
            return itemImageProcess;
        }
    }
}