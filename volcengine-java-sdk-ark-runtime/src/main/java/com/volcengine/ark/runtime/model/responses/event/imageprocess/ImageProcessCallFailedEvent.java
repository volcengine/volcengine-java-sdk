package com.volcengine.ark.runtime.model.responses.event.imageprocess;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessAction;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessArguments;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessError;

public class ImageProcessCallFailedEvent extends ItemEvent {
    @JsonProperty("action") private ImageProcessAction action;
    @JsonProperty("arguments") private ImageProcessArguments arguments;
    @JsonProperty("error") private ImageProcessError error;

    public ImageProcessAction getAction() { return action; }
    public void setAction(ImageProcessAction action) { this.action = action; }
    public ImageProcessArguments getArguments() { return arguments; }
    public void setArguments(ImageProcessArguments arguments) { this.arguments = arguments; }
    public ImageProcessError getError() { return error; }
    public void setError(ImageProcessError error) { this.error = error; }

    public ImageProcessCallFailedEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_FAILED);
    }

    @Override
    public String toString() {
        return "ImageProcessCallFailedEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", action=" + action +
                ", arguments=" + arguments +
                ", error=" + error +
                '}';
    }


}