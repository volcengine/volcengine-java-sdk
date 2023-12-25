package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CreateProjectRequest
 */
public class CreateProjectRequest {

    @SerializedName("DisplayName")
    private String displayName = null;

    @SerializedName("ProjectName")
    private String projectName = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("ParentProjectName")
    private String parentProjectName = null;


    public CreateProjectRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateProjectRequest projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get projectName
     *
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public CreateProjectRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateProjectRequest parentProjectName(String parentProjectName) {
        this.parentProjectName = parentProjectName;
        return this;
    }

    /**
     * Get parentProjectName
     *
     * @return parentProjectName
     */
    public String getParentProjectName() {
        return parentProjectName;
    }

    public void setParentProjectName(String parentProjectName) {
        this.parentProjectName = parentProjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProjectRequest createProjectRequest = (CreateProjectRequest) o;
        return Objects.equals(this.displayName, createProjectRequest.displayName) &&
                Objects.equals(this.projectName, createProjectRequest.projectName) &&
                Objects.equals(this.description, createProjectRequest.description) &&
                Objects.equals(this.parentProjectName, createProjectRequest.parentProjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, projectName, description, parentProjectName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserRequest {\n");

        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentProjectName: ").append(toIndentedString(parentProjectName)).append("\n");
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
