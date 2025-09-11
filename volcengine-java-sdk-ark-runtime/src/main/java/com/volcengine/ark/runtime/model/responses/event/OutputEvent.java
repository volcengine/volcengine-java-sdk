package com.volcengine.ark.runtime.model.responses.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutputEvent extends StreamEvent {

    @JsonProperty("output_index")
    protected Long outputIndex;

    public Long getOutputIndex() {
        return outputIndex;
    }

    public void setOutputIndex(Long outputIndex) {
        this.outputIndex = outputIndex;
    }

    public OutputEvent(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "OutputEvent{" +
                "type='" + getType() + '\'' +
                ", sequenceNumber=" + getSequenceNumber() +
                ", outputIndex=" + outputIndex +
                '}';
    }
}