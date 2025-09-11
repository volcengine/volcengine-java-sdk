package com.volcengine.ark.runtime.model.responses.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volcengine.ark.runtime.model.responses.constant.ResponsesConstants;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessGroundingOptions;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessPointOptions;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessRotateOptions;
import com.volcengine.ark.runtime.model.responses.tool.imageprocess.ImageProcessZoomOptions;

public class ToolImageProcess extends ResponsesTool {

    @JsonProperty("point")
    private ImageProcessPointOptions point;

    @JsonProperty("grounding")
    private ImageProcessGroundingOptions grounding;

    @JsonProperty("zoom")
    private ImageProcessZoomOptions zoom;

    @JsonProperty("rotate")
    private ImageProcessRotateOptions rotate;

    public ToolImageProcess() {
        super(ResponsesConstants.TOOL_TYPE_IMAGE_PROCESS);
    }

    public ImageProcessPointOptions getPoint() {
        return point;
    }

    public void setPoint(ImageProcessPointOptions point) {
        this.point = point;
    }

    public ImageProcessGroundingOptions getGrounding() {
        return grounding;
    }

    public void setGrounding(ImageProcessGroundingOptions grounding) {
        this.grounding = grounding;
    }

    public ImageProcessZoomOptions getZoom() {
        return zoom;
    }

    public void setZoom(ImageProcessZoomOptions zoom) {
        this.zoom = zoom;
    }

    public ImageProcessRotateOptions getRotate() {
        return rotate;
    }

    public void setRotate(ImageProcessRotateOptions rotate) {
        this.rotate = rotate;
    }

    @Override
    public String toString() {
        return "ToolImageProcess{" +
                "type='" + getType() + '\'' +
                ", point=" + point +
                ", grounding=" + grounding +
                ", zoom=" + zoom +
                ", rotate=" + rotate +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ImageProcessPointOptions point;
        private ImageProcessGroundingOptions grounding;
        private ImageProcessZoomOptions zoom;
        private ImageProcessRotateOptions rotate;

        public Builder point(ImageProcessPointOptions point) {
            this.point = point;
            return this;
        }

        public Builder grounding(ImageProcessGroundingOptions grounding) {
            this.grounding = grounding;
            return this;
        }

        public Builder zoom(ImageProcessZoomOptions zoom) {
            this.zoom = zoom;
            return this;
        }

        public Builder rotate(ImageProcessRotateOptions rotate) {
            this.rotate = rotate;
            return this;
        }

        public ToolImageProcess build() {
            ToolImageProcess toolImageProcess = new ToolImageProcess();
            toolImageProcess.setPoint(point);
            toolImageProcess.setGrounding(grounding);
            toolImageProcess.setZoom(zoom);
            toolImageProcess.setRotate(rotate);
            return toolImageProcess;
        }
    }
}