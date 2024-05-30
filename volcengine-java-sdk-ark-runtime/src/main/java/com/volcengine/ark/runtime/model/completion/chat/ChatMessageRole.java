package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * see {@link ChatMessage} documentation.
 */
public enum ChatMessageRole {
    SYSTEM("system"),
    USER("user"),
    ASSISTANT("assistant"),
    FUNCTION("function"),
    TOOL("tool");

    @JsonValue
    private final String value;

    ChatMessageRole(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
