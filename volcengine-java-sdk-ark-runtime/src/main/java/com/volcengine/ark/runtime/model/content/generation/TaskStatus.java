package com.volcengine.ark.runtime.model.content.generation;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskStatus {
    QUEUED("queued"),
    RUNNING("running"),
    SUCCEEDED("succeeded"),
    FAILED("failed"),
    CANCELLED("cancelled");


    @JsonValue
    private final String value;

    TaskStatus(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
