package com.volcengine.ark.runtime.model.responses.event.imageprocess;

import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.event.ItemEvent;
import com.volcengine.ark.runtime.model.responses.event.OutputEvent;

public class ImageProcessCallInProgressEvent extends ItemEvent {

    public ImageProcessCallInProgressEvent() {
        super(ResponsesConstants.EVENT_TYPE_RESPONSE_IMAGE_PROCESS_CALL_IN_PROGRESS);
    }

    @Override
    public String toString() {
        return "ImageProcessCallInProgressEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", itemId='" + getItemId() + '\'' +
                ", outputIndex=" + getOutputIndex() +
                '}';
    }


}