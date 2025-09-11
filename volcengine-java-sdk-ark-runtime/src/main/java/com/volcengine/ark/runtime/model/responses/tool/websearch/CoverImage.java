package com.volcengine.ark.runtime.model.responses.tool.websearch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoverImage {
    @JsonProperty("url")
    private String url;

    @JsonProperty("width")
    private Long width;

    @JsonProperty("height")
    private Long height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "CoverImage{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String url;
        private Long width;
        private Long height;

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        public CoverImage build() {
            CoverImage coverImage = new CoverImage();
            coverImage.setUrl(url);
            coverImage.setWidth(width);
            coverImage.setHeight(height);
            return coverImage;
        }
    }
}