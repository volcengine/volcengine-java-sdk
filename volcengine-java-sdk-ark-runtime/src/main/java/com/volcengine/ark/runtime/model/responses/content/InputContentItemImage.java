package com.volcengine.ark.runtime.model.responses.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;

public class InputContentItemImage extends InputContentItem {

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("image_pixel_limit")
    private ImagePixelLimit imagePixelLimit;

    public InputContentItemImage() {
        super(ResponsesConstants.CONTENT_ITEM_TYPE_INPUT_IMAGE);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ImagePixelLimit getImagePixelLimit() {
        return imagePixelLimit;
    }

    public void setImagePixelLimit(ImagePixelLimit imagePixelLimit) {
        this.imagePixelLimit = imagePixelLimit;
    }

    @Override
    public String toString() {
        return "ResponsesContentItemImage{" +
                "type='" + getType() + '\'' +
                ", detail='" + detail + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", fileId='" + fileId + '\'' +
                ", imagePixelLimit=" + imagePixelLimit +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String detail;
        private String imageUrl;
        private String fileId;
        private ImagePixelLimit imagePixelLimit;

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public Builder imagePixelLimit(ImagePixelLimit imagePixelLimit) {
            this.imagePixelLimit = imagePixelLimit;
            return this;
        }

        public InputContentItemImage build() {
            InputContentItemImage responsesContentItemImage = new InputContentItemImage();
            responsesContentItemImage.setDetail(detail);
            responsesContentItemImage.setImageUrl(imageUrl);
            responsesContentItemImage.setFileId(fileId);
            responsesContentItemImage.setImagePixelLimit(imagePixelLimit);
            return responsesContentItemImage;
        }
    }
}