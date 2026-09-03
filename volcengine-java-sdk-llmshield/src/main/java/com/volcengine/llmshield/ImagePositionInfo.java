package com.volcengine.llmshield;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

// 图片命中位置
@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE
)
public class ImagePositionInfo {
    @JsonProperty("xStart")
    private String xStart;

    @JsonProperty("yStart")
    private String yStart;

    @JsonProperty("xEnd")
    private String xEnd;

    @JsonProperty("yEnd")
    private String yEnd;

    public String getXStart() {
        return xStart;
    }

    public void setXStart(String xStart) {
        this.xStart = xStart;
    }

    public String getYStart() {
        return yStart;
    }

    public void setYStart(String yStart) {
        this.yStart = yStart;
    }

    public String getXEnd() {
        return xEnd;
    }

    public void setXEnd(String xEnd) {
        this.xEnd = xEnd;
    }

    public String getYEnd() {
        return yEnd;
    }

    public void setYEnd(String yEnd) {
        this.yEnd = yEnd;
    }
}
