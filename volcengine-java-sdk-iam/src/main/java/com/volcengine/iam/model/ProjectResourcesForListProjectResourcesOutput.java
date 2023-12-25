package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProjectResourcesForListProjectResourcesOutput
 */
public class ProjectResourcesForListProjectResourcesOutput {

    @SerializedName("ProjectName")
    private String projectName = null;

    @SerializedName("ResourceTrn")
    private String resourceTrn = null;

    @SerializedName("ResourceType")
    private String resourceType = null;

    @SerializedName("ResourceID")
    private String resourceId = null;

    @SerializedName("ResourceRegion")
    private String resourceRegion = null;

    @SerializedName("ServiceName")
    private String serviceName = null;

    @SerializedName("CreateDate")
    private String createDate = null;

    @SerializedName("UpdateDate")
    private String updateDate = null;

    @SerializedName("AccountID")
    private String accountId = null;

    public ProjectResourcesForListProjectResourcesOutput projectName(String projectName) {
        this.projectName = projectName;
        return this;
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

    public ProjectResourcesForListProjectResourcesOutput resourceTrn(String resourceTrn) {
        this.resourceTrn = resourceTrn;
        return this;
    }

    /**
     * Get resourceTrn
     *
     * @return resourceTrn
     */
    @Schema(description = "")
    public String getResourceTrn() {
        return resourceTrn;
    }

    public void setResourceTrn(String resourceTrn) {
        this.resourceTrn = resourceTrn;
    }

    public ProjectResourcesForListProjectResourcesOutput resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @Schema(description = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ProjectResourcesForListProjectResourcesOutput resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get resourceId
     *
     * @return resourceId
     */
    @Schema(description = "")
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ProjectResourcesForListProjectResourcesOutput resourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
        return this;
    }

    /**
     * Get resourceRegion
     *
     * @return resourceRegion
     */
    @Schema(description = "")
    public String getResourceRegion() {
        return resourceRegion;
    }

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    public ProjectResourcesForListProjectResourcesOutput serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get serviceName
     *
     * @return serviceName
     */
    @Schema(description = "")
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ProjectResourcesForListProjectResourcesOutput createDate(String createDate) {
        this.createDate = createDate;
        return this;
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

    public ProjectResourcesForListProjectResourcesOutput updateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
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

    public ProjectResourcesForListProjectResourcesOutput accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     */
    @Schema(description = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectResourcesForListProjectResourcesOutput projectResourcesForListProjectResourcesOutput = (ProjectResourcesForListProjectResourcesOutput) o;
        return Objects.equals(this.projectName, projectResourcesForListProjectResourcesOutput.projectName) &&
                Objects.equals(this.resourceTrn, projectResourcesForListProjectResourcesOutput.resourceTrn) &&
                Objects.equals(this.resourceType, projectResourcesForListProjectResourcesOutput.resourceType) &&
                Objects.equals(this.resourceId, projectResourcesForListProjectResourcesOutput.resourceId) &&
                Objects.equals(this.resourceRegion, projectResourcesForListProjectResourcesOutput.resourceRegion) &&
                Objects.equals(this.serviceName, projectResourcesForListProjectResourcesOutput.serviceName) &&
                Objects.equals(this.createDate, projectResourcesForListProjectResourcesOutput.createDate) &&
                Objects.equals(this.updateDate, projectResourcesForListProjectResourcesOutput.updateDate) &&
                Objects.equals(this.accountId, projectResourcesForListProjectResourcesOutput.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, resourceTrn, resourceType, resourceId, resourceRegion, serviceName, createDate, updateDate, accountId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SAMLProviderForListSAMLProvidersOutput {\n");

        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    resourceTrn: ").append(toIndentedString(resourceTrn)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceRegion: ").append(toIndentedString(resourceRegion)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
