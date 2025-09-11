package com.volcengine.ark.runtime.model.responses.tool.imageprocess;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageProcessArguments {

    @JsonProperty("image_index")
    private Integer imageIndex;

    @JsonProperty("points")
    private String points;

    @JsonProperty("draw_line")
    private Boolean drawLine;

    @JsonProperty("bbox_str")
    private String bboxStr;

    @JsonProperty("crop")
    private Boolean crop;

    @JsonProperty("degree")
    private Integer degree;

    @JsonProperty("scale")
    private Double scale;

    public Integer getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(Integer imageIndex) {
        this.imageIndex = imageIndex;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public Boolean getDrawLine() {
        return drawLine;
    }

    public void setDrawLine(Boolean drawLine) {
        this.drawLine = drawLine;
    }

    public String getBboxStr() {
        return bboxStr;
    }

    public void setBboxStr(String bboxStr) {
        this.bboxStr = bboxStr;
    }

    public Boolean getCrop() {
        return crop;
    }

    public void setCrop(Boolean crop) {
        this.crop = crop;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }
}