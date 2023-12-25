package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PolicyForProjectUsersOutput
 */
public class PolicyForProjectUsersOutput {

    @SerializedName("DisplayName")
    private String displayName = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("UpdateDate")
    private String updateDate = null;

    @SerializedName("UserGroupName")
    private String userGroupName = null;

    public PolicyForProjectUsersOutput displayName(String displayName) {
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

    public PolicyForProjectUsersOutput description(String description) {
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

    public PolicyForProjectUsersOutput updateDate(String updateDate) {
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

    public PolicyForProjectUsersOutput userGroupName(String userGroupName) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyForProjectUsersOutput policyForProjectUsersOutput = (PolicyForProjectUsersOutput) o;
        return Objects.equals(this.displayName, policyForProjectUsersOutput.displayName) &&
                Objects.equals(this.description, policyForProjectUsersOutput.description) &&
                Objects.equals(this.updateDate, policyForProjectUsersOutput.updateDate) &&
                Objects.equals(this.userGroupName, policyForProjectUsersOutput.userGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, description, updateDate, userGroupName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyForProjectUsersOutput {\n");

        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
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

