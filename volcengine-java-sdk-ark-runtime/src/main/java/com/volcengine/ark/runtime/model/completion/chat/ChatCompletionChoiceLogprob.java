package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatCompletionChoiceLogprob {

    List<ChatCompletionChoiceLogprobContent> content;

    public List<ChatCompletionChoiceLogprobContent> getContent() {
        return content;
    }

    public void setContent(List<ChatCompletionChoiceLogprobContent> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ChatCompletionChoiceLogprob{" +
                "content=" + content +
                '}';
    }
}
