package com.volcengine.ark.runtime.model.responses.event.imageprocess;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessAction;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessArguments;

public class ImageProcessCallProcessingEvent extends ItemEvent {
    @JsonProperty("action")
    private ImageProcessAction action;
    @JsonProperty("arguments")
    private ImageProcessArguments arguments;

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

    public ImageProcessCallProcessingEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_PROGRESSING);
    }

    @Override
    public String toString() {
        return "ImageProcessCallProcessingEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                ", action=" + action +
                ", arguments=" + arguments +
                '}';
    }


}