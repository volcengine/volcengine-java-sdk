package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetProjectResponse
 */
public class GetProjectResponse {

    @SerializedName("AccountID")
    private Long accountId = null;

    @SerializedName("ProjectName")
    private String projectName = null;

    @SerializedName("ParentProjectName")
    private String parentProjectName = null;

    @SerializedName("Path")
    private String path = null;

    @SerializedName("DisplayName")
    private String displayName = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("CreateDate")
    private String createDate = null;

    @SerializedName("UpdateDate")
    private String updateDate = null;

    @SerializedName("Status")
    private String status = null;

    /**
     * Get accountId
     *
     * @return accountId
     */
    @Schema(description = "")
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Get projectName
     *
     * @return projectName
     */
    @Schema(description = "")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Get parentProjectName
     *
     * @return parentProjectName
     */
    @Schema(description = "")
    public String getParentProjectName() {
        return parentProjectName;
    }

    public void setParentProjectName(String parentProjectName) {
        this.parentProjectName = parentProjectName;
    }

    /**
     * Get path
     *
     * @return path
     */
    @Schema(description = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Get displayName
     *
     * @return displayName
     */
    @Schema(description = "")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Get description
     *
     * @return description
     */
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get createDate
     *
     * @return createDate
     */
    @Schema(description = "")
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * Get updateDate
     *
     * @return updateDate
     */
    @Schema(description = "")
    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Get status
     *
     * @return status
     */
    @Schema(description = "")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProjectResponse GetProjectResponse = (GetProjectResponse) o;
        return Objects.equals(this.accountId, GetProjectResponse.accountId) &&
                Objects.equals(this.projectName, GetProjectResponse.projectName) &&
                Objects.equals(this.parentProjectName, GetProjectResponse.parentProjectName) &&
                Objects.equals(this.path, GetProjectResponse.path) &&
                Objects.equals(this.displayName, GetProjectResponse.displayName) &&
                Objects.equals(this.description, GetProjectResponse.description) &&
                Objects.equals(this.createDate, GetProjectResponse.createDate) &&
                Objects.equals(this.updateDate, GetProjectResponse.updateDate) &&
                Objects.equals(this.status, GetProjectResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, projectName, parentProjectName, path, displayName, description, createDate, updateDate, status);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class GetProjectResponse {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    parentProjectName: ").append(toIndentedString(parentProjectName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
