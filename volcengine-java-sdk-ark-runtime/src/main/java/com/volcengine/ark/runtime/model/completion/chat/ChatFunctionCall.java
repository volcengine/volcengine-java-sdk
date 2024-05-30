package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.databind.JsonNode;

public class ChatFunctionCall {

    /**
     * The name of the function being called
     */
    String name;

    /**
     * The arguments of the call produced by the model, represented as a JsonNode for easy manipulation.
     */
    JsonNode arguments;

    public ChatFunctionCall(String name, JsonNode arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    public ChatFunctionCall(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonNode getArguments() {
        return arguments;
    }

    public void setArguments(JsonNode arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "ChatFunctionCall{" +
                "name='" + name + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
