package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 工具调用
public class ToolCall {
    @JsonProperty("ID")
    private String id;          // 工具调用ID

    @JsonProperty("Type")
    private String type;        // 工具类型

    @JsonProperty("Function")
    private FunctionCall function;  // 调用的工具

    // 深拷贝构造方法
    public ToolCall(ToolCall other) {
        this.id = other.id;
        this.type = other.type;
        if (other.function != null) {
            this.function = new FunctionCall(other.function);
        }
    }

    // 无参构造方法（保留，用于JSON反序列化等场景）
    public ToolCall() {}

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

    public FunctionCall getFunction() {
        return function;
    }

    public void setFunction(FunctionCall function) {
        this.function = function;
    }
}
