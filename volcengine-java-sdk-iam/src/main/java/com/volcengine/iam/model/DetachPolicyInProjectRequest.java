package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;
import java.util.Objects;

/**
 * DetachPolicyInProjectRequest
 */
public class DetachPolicyInProjectRequest {

    @SerializedName("PrincipalType")
    private String principalType = null;

    @SerializedName("PrincipalName")
    private String principalName = null;

    @SerializedName("PolicyType")
    private String policyType = null;

    @SerializedName("PolicyName")
    private String policyName = null;

    @SerializedName("ProjectName")
    private List<String> projectName = null;


    public DetachPolicyInProjectRequest principalType(String principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get principalType
     *
     * @return principalType
     */
    @Schema(description = "")
    public String getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    public DetachPolicyInProjectRequest principalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * Get principalName
     *
     * @return principalName
     */
    @Schema(description = "")
    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public DetachPolicyInProjectRequest policyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get policyType
     *
     * @return policyType
     */
    @Schema(description = "")
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public DetachPolicyInProjectRequest policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get policyName
     *
     * @return policyName
     */
    @Schema(description = "")
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public DetachPolicyInProjectRequest projectName(List<String> projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get projectName
     *
     * @return projectName
     */
    @Schema(description = "")
    public List<String> getProjectName() {
        return projectName;
    }

    public void setProjectName(List<String> projectName) {
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
        DetachPolicyInProjectRequest detachPolicyInProjectRequest = (DetachPolicyInProjectRequest) o;
        return Objects.equals(this.principalType, detachPolicyInProjectRequest.principalType) &&
                Objects.equals(this.principalName, detachPolicyInProjectRequest.principalName) &&
                Objects.equals(this.policyType, detachPolicyInProjectRequest.policyType) &&
                Objects.equals(this.policyName, detachPolicyInProjectRequest.policyName) &&
                Objects.equals(this.projectName, detachPolicyInProjectRequest.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalType, principalName, policyType, policyName, projectName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachPolicyInProjectRequest {\n");

        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
        sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
