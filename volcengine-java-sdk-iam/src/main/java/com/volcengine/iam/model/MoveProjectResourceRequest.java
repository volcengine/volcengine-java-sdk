package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MoveProjectResourceRequest
 */
public class MoveProjectResourceRequest {

    @SerializedName("ResourceTrn")
    private List<String> resourceTrn = null;

    @SerializedName("TargetProjectName")
    private String targetProjectName = null;

    public MoveProjectResourceRequest resourceTrn(List<String> resourceTrn) {
        this.resourceTrn = resourceTrn;
        return this;
    }

    public MoveProjectResourceRequest addResourceTrnItem(String resourceTrnItem) {
        if (this.resourceTrn == null) {
            this.resourceTrn = new ArrayList<String>();
        }
        this.resourceTrn.add(resourceTrnItem);
        return this;
    }

    @Schema(description = "")
    public List<String> getResourceTrn() {
        return resourceTrn;
    }

    public void setResourceTrn(List<String> resourceTrn) {
        this.resourceTrn = resourceTrn;
    }

    @Schema(description = "")
    public String getTargetProjectName() {
        return targetProjectName;
    }

    public void setTargetProjectName(String targetProjectName) {
        this.targetProjectName = targetProjectName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MoveProjectResourceRequest moveProjectResourceRequest = (MoveProjectResourceRequest) o;
        return Objects.equals(this.resourceTrn, moveProjectResourceRequest.resourceTrn) &&
                Objects.equals(this.targetProjectName, moveProjectResourceRequest.targetProjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceTrn, targetProjectName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveProjectResourceRequest {\n");

        sb.append("    clientToken: ").append(toIndentedString(resourceTrn)).append("\n");
        sb.append("    forceStop: ").append(toIndentedString(targetProjectName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
