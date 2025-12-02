package com.volcengine.ark.runtime.model.responses.tool.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoubaoAppFeature {

    @JsonProperty("chat")
    private DoubaoAppFeatureItem chat;

    @JsonProperty("deep_chat")
    private DoubaoAppFeatureItem deepChat;

    @JsonProperty("ai_search")
    private DoubaoAppFeatureItem aiSearch;

    @JsonProperty("reasoning_search")
    private DoubaoAppFeatureItem reasoningSearch;

    public DoubaoAppFeatureItem getChat() {
        return chat;
    }

    public void setChat(DoubaoAppFeatureItem chat) {
        this.chat = chat;
    }

    public DoubaoAppFeatureItem getDeepChat() {
        return deepChat;
    }

    public void setDeepChat(DoubaoAppFeatureItem deepChat) {
        this.deepChat = deepChat;
    }

    public DoubaoAppFeatureItem getAiSearch() {
        return aiSearch;
    }

    public void setAiSearch(DoubaoAppFeatureItem aiSearch) {
        this.aiSearch = aiSearch;
    }

    public DoubaoAppFeatureItem getReasoningSearch() {
        return reasoningSearch;
    }

    public void setReasoningSearch(DoubaoAppFeatureItem reasoningSearch) {
        this.reasoningSearch = reasoningSearch;
    }

    public DoubaoAppFeature() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private DoubaoAppFeatureItem chat;
        private DoubaoAppFeatureItem deepChat;
        private DoubaoAppFeatureItem aiSearch;
        private DoubaoAppFeatureItem reasoningSearch;

        public Builder chat(DoubaoAppFeatureItem chat) {
            this.chat = chat;
            return this;
        }

        public Builder deepChat(DoubaoAppFeatureItem deepChat) {
            this.deepChat = deepChat;
            return this;
        }

        public Builder aiSearch(DoubaoAppFeatureItem aiSearch) {
            this.aiSearch = aiSearch;
            return this;
        }

        public Builder reasoningSearch(DoubaoAppFeatureItem reasoningSearch) {
            this.reasoningSearch = reasoningSearch;
            return this;
        }

        public DoubaoAppFeature build() {
            DoubaoAppFeature feature = new DoubaoAppFeature();
            feature.setChat(chat);
            feature.setDeepChat(deepChat);
            feature.setAiSearch(aiSearch);
            feature.setReasoningSearch(reasoningSearch);
            return feature;
        }
    }

    @Override
    public String toString() {
        return "DoubaoAppFeature{" +
                "chat=" + chat +
                ", deepChat=" + deepChat +
                ", aiSearch=" + aiSearch +
                ", reasoningSearch=" + reasoningSearch +
                '}';
    }
}
