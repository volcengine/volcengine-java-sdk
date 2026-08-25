package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonProperty;

// 命中位置信息
public class PositionInfo {
    @JsonProperty("ImagePosition")
    private ImagePositionInfo imagePosition; // 图片命中位置

    public ImagePositionInfo getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(ImagePositionInfo imagePosition) {
        this.imagePosition = imagePosition;
    }
}
