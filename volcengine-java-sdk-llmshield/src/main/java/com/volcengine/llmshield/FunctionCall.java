package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 函数调用
public class FunctionCall {
    @JsonProperty("Name")
    private String name;        // 函数名

    @JsonProperty("Arguments")
    private String arguments;   // 函数参数，JSON字符串

    // 深拷贝构造方法
    public FunctionCall(FunctionCall other) {
        this.name = other.name;
        this.arguments = other.arguments;
    }

    // 无参构造方法（保留，用于JSON反序列化等场景）
    public FunctionCall() {}

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
}
