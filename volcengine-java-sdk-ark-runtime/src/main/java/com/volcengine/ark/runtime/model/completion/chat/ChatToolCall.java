package com.volcengine.ark.runtime.model.completion.chat;


public class ChatToolCall {

    /**
     * The ID of the tool call
     */
    String id;

    /**
     * The type of the tool. Currently, only function is supported
     */
    String type;

    /**
     * The function that the model called
     */
    ChatFunction function;

    public ChatToolCall(String id, String type, ChatFunction function) {
        this.id = id;
        this.type = type;
        this.function = function;
    }

    public ChatToolCall(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChatFunction getFunction() {
        return function;
    }

    public void setFunction(ChatFunction function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "ChatToolCall{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", function=" + function +
                '}';
    }
}
