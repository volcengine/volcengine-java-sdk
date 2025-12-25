package com.volcengine.ark.runtime.model.responses.item.doubaoapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoubaoAppSearchResult {

    @JsonProperty("text_card")
    private DoubaoAppSearchTextItem textCard;

    public DoubaoAppSearchTextItem getTextCard() {
        return textCard;
    }

    public void setTextCard(DoubaoAppSearchTextItem textCard) {
        this.textCard = textCard;
    }

    public DoubaoAppSearchResult() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private DoubaoAppSearchTextItem textCard;

        public Builder textCard(DoubaoAppSearchTextItem textCard) {
            this.textCard = textCard;
            return this;
        }

        public DoubaoAppSearchResult build() {
            DoubaoAppSearchResult searchResult = new DoubaoAppSearchResult();
            searchResult.setTextCard(textCard);
            return searchResult;
        }
    }

    @Override
    public String toString() {
        return "DoubaoAppSearchResult{" +
                "textCard=" + textCard +
                '}';
    }
}
