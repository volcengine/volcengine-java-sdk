package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

// 消息结构
public class MessageV2 {
    @JsonProperty("Role")
    private String role;        // 消息内容ID @tpl=select @jsonCEnums=["user","assistant","system","rag"]

    @JsonProperty("Content")
    private String content;     // 内容文本或链接

    @JsonProperty("ContentType")
    private ContentTypeV2 contentType;  // 内容类型

    @JsonProperty("MultiPart")
    private List<MultiPart> multiPart;  // 多模态内容

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ToolCallID")
    private String toolCallID;          // 工具调用ID

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ToolCall")
    private List<ToolCall> toolCall;    // 工具调用

    // 深拷贝构造方法
    public MessageV2(MessageV2 other) {
        // String是不可变类型，直接赋值即可
        this.role = other.role;
        this.content = other.content;
        this.contentType = other.contentType;
        this.toolCallID = other.toolCallID;

        // List<multiPart>：新建List并对每个元素深拷贝
        if (other.multiPart != null) {
            this.multiPart = new ArrayList<>();
            for (MultiPart contPart : other.multiPart) {
                this.multiPart.add(new MultiPart(contPart)); // 假设MultiPart有深拷贝构造方法
            }
        }

        // List<toolCall>：新建List并对每个元素深拷贝
        if (other.toolCall != null) {
            this.toolCall = new ArrayList<>();
            for (ToolCall tc : other.toolCall) {
                this.toolCall.add(new ToolCall(tc));
            }
        }
    }

    // 无参构造方法（保留，用于JSON反序列化等场景）
    public MessageV2() {}
    // Getters and Setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ContentTypeV2 getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeV2 contentType) {
        this.contentType = contentType;
    }

    public List<MultiPart> getMultiPart() { return multiPart; }

    public void setMultiPart(List<MultiPart> multiPart) { this.multiPart = multiPart; }

    public String getToolCallID() { return toolCallID; }

    public void setToolCallID(String toolCallID) { this.toolCallID = toolCallID; }

    public List<ToolCall> getToolCall() { return toolCall; }

    public void setToolCall(List<ToolCall> toolCall) { this.toolCall = toolCall; }

    // 追加单条历史消息
    public MessageV2 appendMultiPart(MultiPart contPart) {
        if (this.multiPart == null) {
            this.multiPart = new ArrayList<>();
        }
        this.multiPart.add(contPart);
        return this; // 支持链式调用
    }

    // 追加单条工具调用
    public MessageV2 appendToolCall(ToolCall tc) {
        if (this.toolCall == null) {
            this.toolCall = new ArrayList<>();
        }
        this.toolCall.add(tc);
        return this; // 支持链式调用
    }
}
