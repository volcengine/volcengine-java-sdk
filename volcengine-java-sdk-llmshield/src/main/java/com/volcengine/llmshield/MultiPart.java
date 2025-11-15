package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiPart {
    @JsonProperty("Content")
    private String content;     // 内容文本或链接

    @JsonProperty("ContentType")
    private ContentTypeV2 contentType;  // 内容类型

    // 深拷贝构造方法
    public MultiPart(MultiPart other) {
        // String是不可变类型，直接赋值即可
        this.content = other.content;
        this.contentType = other.contentType;
    }

    // 无参构造方法（保留，用于JSON反序列化等场景）
    public MultiPart() {}
    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public ContentTypeV2 getContentType() { return contentType; }

    public void setContentType(ContentTypeV2 contentType) { this.contentType = contentType; }
}