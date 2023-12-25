package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProjectUsersForListProjectIdentitiesOutput
 */
public class ProjectUsersForListProjectIdentitiesOutput {

    @SerializedName("UserName")
    private String userName = null;

    @SerializedName("DisplayName")
    private String displayName = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("UpdateDate")
    private String updateDate = null;

    @SerializedName("Policy")
    private PolicyForListProjectIdentitiesOutput policy = null;


    public ProjectUsersForListProjectIdentitiesOutput userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get userName
     *
     * @return userName
     */
    @Schema(description = "")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ProjectUsersForListProjectIdentitiesOutput displayName(String displayName) {
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

    public ProjectUsersForListProjectIdentitiesOutput description(String description) {
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

    public ProjectUsersForListProjectIdentitiesOutput updateDate(String updateDate) {
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

    public ProjectUsersForListProjectIdentitiesOutput policy(PolicyForListProjectIdentitiesOutput policy) {
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
        ProjectUsersForListProjectIdentitiesOutput projectUsersForListProjectIdentitiesOutput = (ProjectUsersForListProjectIdentitiesOutput) o;
        return Objects.equals(this.userName, projectUsersForListProjectIdentitiesOutput.userName) &&
                Objects.equals(this.displayName, projectUsersForListProjectIdentitiesOutput.displayName) &&
                Objects.equals(this.description, projectUsersForListProjectIdentitiesOutput.description) &&
                Objects.equals(this.updateDate, projectUsersForListProjectIdentitiesOutput.updateDate) &&
                Objects.equals(this.policy, projectUsersForListProjectIdentitiesOutput.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, displayName, description, updateDate, policy);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectUsersForListProjectIdentitiesOutput {\n");

        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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


