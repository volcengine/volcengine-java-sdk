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
    String arguments;

    public ChatFunctionCall(String name, String arguments) {
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

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
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
