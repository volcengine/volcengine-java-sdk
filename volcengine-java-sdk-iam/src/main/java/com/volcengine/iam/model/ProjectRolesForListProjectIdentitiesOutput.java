package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProjectRolesForListProjectIdentitiesOutput
 */
public class ProjectRolesForListProjectIdentitiesOutput {

    @SerializedName("RoleName")
    private String roleName = null;

    @SerializedName("DisplayName")
    private String displayName = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("UpdateDate")
    private String updateDate = null;

    @SerializedName("Policy")
    private PolicyForListProjectIdentitiesOutput policy = null;


    public ProjectRolesForListProjectIdentitiesOutput roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get roleName
     *
     * @return roleName
     */
    @Schema(description = "")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public ProjectRolesForListProjectIdentitiesOutput displayName(String displayName) {
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

    public ProjectRolesForListProjectIdentitiesOutput description(String description) {
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

    public ProjectRolesForListProjectIdentitiesOutput updateDate(String updateDate) {
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

    public ProjectRolesForListProjectIdentitiesOutput policy(PolicyForListProjectIdentitiesOutput policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Get policy
     *
     * @return policy
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
        ProjectRolesForListProjectIdentitiesOutput projectRolesForListProjectIdentitiesOutput = (ProjectRolesForListProjectIdentitiesOutput) o;
        return Objects.equals(this.roleName, projectRolesForListProjectIdentitiesOutput.roleName) &&
                Objects.equals(this.displayName, projectRolesForListProjectIdentitiesOutput.displayName) &&
                Objects.equals(this.description, projectRolesForListProjectIdentitiesOutput.description) &&
                Objects.equals(this.updateDate, projectRolesForListProjectIdentitiesOutput.updateDate) &&
                Objects.equals(this.policy, projectRolesForListProjectIdentitiesOutput.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName, displayName, description, updateDate, policy);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectRolesForListProjectIdentitiesOutput {\n");

        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

