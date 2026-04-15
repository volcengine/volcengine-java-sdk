package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ChatCompletionContentPartType {
    TEXT("text"),
    IMAGE_URL("image_url"),
    VIDEO_URL("video_url"),
    INPUT_AUDIO("input_audio");

    @JsonValue
    private final String value;

    ChatCompletionContentPartType(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
