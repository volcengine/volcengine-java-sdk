package com.volcengine.ark.runtime.model.responses.item.doubaoapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DoubaoAppSearchTextItem {

    @JsonProperty("title")
    private String title;

    @JsonProperty("sitename")
    private String siteName;

    @JsonProperty("url")
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DoubaoAppSearchTextItem() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String title;
        private String siteName;
        private String url;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DoubaoAppSearchTextItem build() {
            DoubaoAppSearchTextItem searchTextItem = new DoubaoAppSearchTextItem();
            searchTextItem.setTitle(title);
            searchTextItem.setSiteName(siteName);
            searchTextItem.setUrl(url);
            return searchTextItem;
        }
    }

    @Override
    public String toString() {
        return "DoubaoAppSearchTextItem{" +
                "title='" + title + '\'' +
                ", siteName='" + siteName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
