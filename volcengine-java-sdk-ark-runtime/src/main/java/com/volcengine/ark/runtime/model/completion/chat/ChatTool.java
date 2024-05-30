package com.volcengine.ark.runtime.model.completion.chat;


public class ChatTool {

    /**
     * The type of the tool. Currently, only function is supported.
     */
    String type;


    ChatFunction function;

    public ChatTool(String type, ChatFunction function) {
        this.type = type;
        this.function = function;
    }

    public ChatTool(){}

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
        return "ChatTool{" +
                "type='" + type + '\'' +
                ", function=" + function +
                '}';
    }
}