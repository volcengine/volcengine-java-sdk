package com.volcengine.ark.runtime.model.completion.chat;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ChatCompletionContentPart {

    String type;

    String content;

    String text;

    ChatCompletionContentPartImageURL imageUrl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ChatCompletionContentPartImageURL getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(ChatCompletionContentPartImageURL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "ChatCompletionContentPart{" +
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", text='" + text + '\'' +
                ", imageUrl=" + imageUrl +
                '}';
    }

    public static class ChatCompletionContentPartImageURL {
        String url;

        String detail;

        public ChatCompletionContentPartImageURL(String url, String detail) {
            this.url = url;
            this.detail = detail;
        }

        public ChatCompletionContentPartImageURL(String url) {
            this.url = url;
        }

        public ChatCompletionContentPartImageURL(){}

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        @Override
        public String toString() {
            return "ChatCompletionContentPartImageURL{" +
                    "url='" + url + '\'' +
                    ", detail='" + detail + '\'' +
                    '}';
        }
    }

    public static final class Builder {
        private String type;
        private String content;
        private String text;
        private ChatCompletionContentPartImageURL imageUrl;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder imageUrl(ChatCompletionContentPartImageURL imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public ChatCompletionContentPart build() {
            ChatCompletionContentPart chatCompletionContentPart = new ChatCompletionContentPart();
            chatCompletionContentPart.setType(type);
            chatCompletionContentPart.setContent(content);
            chatCompletionContentPart.setText(text);
            chatCompletionContentPart.setImageUrl(imageUrl);
            return chatCompletionContentPart;
        }
    }
}
