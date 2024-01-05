package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProjectUserGroupsForListProjectIdentitiesOutput
 */
public class ProjectUserGroupsForListProjectIdentitiesOutput {

    @SerializedName("DisplayName")
    private String displayName = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("UpdateDate")
    private String updateDate = null;

    @SerializedName("UserGroupName")
    private String userGroupName = null;

    @SerializedName("Policy")
    private PolicyForListProjectIdentitiesOutput policy = null;

    public ProjectUserGroupsForListProjectIdentitiesOutput displayName(String displayName) {
        this.displayName = displayName;
        return this;
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

    public ProjectUserGroupsForListProjectIdentitiesOutput description(String description) {
        this.description = description;
        return this;
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

    public ProjectUserGroupsForListProjectIdentitiesOutput updateDate(String updateDate) {
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

    public ProjectUserGroupsForListProjectIdentitiesOutput userGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * Get userGroupName
     *
     * @return userGroupName
     */
    @Schema(description = "")
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public ProjectUserGroupsForListProjectIdentitiesOutput policy(PolicyForListProjectIdentitiesOutput policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Get Policy
     *
     * @return Policy
     */
    @Schema(description = "")
    public PolicyForListProjectIdentitiesOutput getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyForListProjectIdentitiesOutput policy) {
        this.policy = policy;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectUserGroupsForListProjectIdentitiesOutput projectUserGroupsForListProjectIdentitiesOutput = (ProjectUserGroupsForListProjectIdentitiesOutput) o;
        return Objects.equals(this.displayName, projectUserGroupsForListProjectIdentitiesOutput.displayName) &&
                Objects.equals(this.description, projectUserGroupsForListProjectIdentitiesOutput.description) &&
                Objects.equals(this.updateDate, projectUserGroupsForListProjectIdentitiesOutput.updateDate) &&
                Objects.equals(this.userGroupName, projectUserGroupsForListProjectIdentitiesOutput.userGroupName) &&
                Objects.equals(this.policy, projectUserGroupsForListProjectIdentitiesOutput.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, description, updateDate, userGroupName, policy);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectUserGroupsForListProjectIdentitiesOutput {\n");

        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

