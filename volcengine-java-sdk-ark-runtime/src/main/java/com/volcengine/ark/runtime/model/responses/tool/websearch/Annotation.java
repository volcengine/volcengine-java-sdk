package com.volcengine.ark.runtime.model.responses.tool.websearch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Annotation {
    @JsonProperty("type")
    private String type;

    @JsonProperty("title")
    private String title;

    @JsonProperty("url")
    private String url;

    @JsonProperty("logo_url")
    private String logoUrl;

    @JsonProperty("mobile_url")
    private String mobileUrl;

    @JsonProperty("site_name")
    private String siteName;

    @JsonProperty("publish_time")
    private String publishTime;

    @JsonProperty("cover_image")
    private CoverImage coverImage;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("freshness_info")
    private String freshnessInfo;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public CoverImage getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(CoverImage coverImage) {
        this.coverImage = coverImage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFreshnessInfo() {
        return freshnessInfo;
    }

    public void setFreshnessInfo(String freshnessInfo) {
        this.freshnessInfo = freshnessInfo;
    }

    @Override
    public String toString() {
        return "Annotation{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", mobileUrl='" + mobileUrl + '\'' +
                ", siteName='" + siteName + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", coverImage=" + coverImage +
                ", summary='" + summary + '\'' +
                ", freshnessInfo='" + freshnessInfo + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String type;
        private String title;
        private String url;
        private String logoUrl;
        private String mobileUrl;
        private String siteName;
        private String publishTime;
        private CoverImage coverImage;
        private String summary;
        private String freshnessInfo;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        public Builder mobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }

        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        public Builder publishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        public Builder coverImage(CoverImage coverImage) {
            this.coverImage = coverImage;
            return this;
        }

        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder freshnessInfo(String freshnessInfo) {
            this.freshnessInfo = freshnessInfo;
            return this;
        }

        public Annotation build() {
            Annotation annotation = new Annotation();
            annotation.setType(type);
            annotation.setTitle(title);
            annotation.setUrl(url);
            annotation.setLogoUrl(logoUrl);
            annotation.setMobileUrl(mobileUrl);
            annotation.setSiteName(siteName);
            annotation.setPublishTime(publishTime);
            annotation.setCoverImage(coverImage);
            annotation.setSummary(summary);
            annotation.setFreshnessInfo(freshnessInfo);
            return annotation;
        }
    }
}