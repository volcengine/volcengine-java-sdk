package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 消息结构
public class MessageV2 {
    @JsonProperty("Role")
    private String role;        // 消息内容ID @tpl=select @jsonCEnums=["user","assistant","system","rag"]

    @JsonProperty("Content")
    private String content;     // 内容文本或链接

    @JsonProperty("ContentType")
    private ContentTypeV2 contentType;  // 内容类型

    // 深拷贝构造方法
    public MessageV2(MessageV2 other) {
        // String是不可变类型，直接赋值即可
        this.role = other.role;
        this.content = other.content;

        this.contentType = other.contentType;
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
}
