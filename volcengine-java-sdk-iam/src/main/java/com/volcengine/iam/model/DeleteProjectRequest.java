package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * DeleteProjectRequest
 */
public class DeleteProjectRequest {

    @SerializedName("ProjectName")
    private String projectName = null;

    public DeleteProjectRequest projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get projectName
     *
     * @return projectName
     **/
    @NotNull
    @Schema(required = true, description = "")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteProjectRequest deleteProjectRequest = (DeleteProjectRequest) o;
        return Objects.equals(this.projectName, deleteProjectRequest.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteProjectRequest {\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
