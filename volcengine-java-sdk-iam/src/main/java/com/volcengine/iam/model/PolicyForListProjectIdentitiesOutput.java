package com.volcengine.iam.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PolicyForListProjectIdentitiesOutput
 */
public class PolicyForListProjectIdentitiesOutput {

    @SerializedName("PolicyTrn")
    private String policyTrn = null;

    @SerializedName("PolicyName")
    private String policyName = null;

    @SerializedName("PolicyType")
    private String policyType = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("AttachDate")
    private String attachDate = null;

    @SerializedName("IsServiceRolePolicy")
    private String isServiceRolePolicy = null;


    public PolicyForListProjectIdentitiesOutput policyTrn(String policyTrn) {
        this.policyTrn = policyTrn;
        return this;
    }

    /**
     * Get policyTrn
     *
     * @return policyTrn
     */
    @Schema(description = "")
    public String getPolicyTrn() {
        return policyTrn;
    }

    public void setPolicyTrn(String policyTrn) {
        this.policyTrn = policyTrn;
    }

    public PolicyForListProjectIdentitiesOutput policyName(String policyName) {
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

    public PolicyForListProjectIdentitiesOutput policyType(String policyType) {
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

    public PolicyForListProjectIdentitiesOutput description(String description) {
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

    public PolicyForListProjectIdentitiesOutput attachDate(String attachDate) {
        this.attachDate = attachDate;
        return this;
    }

    /**
     * Get attachDate
     *
     * @return attachDate
     */
    @Schema(description = "")
    public String getAttachDate() {
        return attachDate;
    }

    public void setAttachDate(String attachDate) {
        this.attachDate = attachDate;
    }

    public PolicyForListProjectIdentitiesOutput isServiceRolePolicy(String isServiceRolePolicy) {
        this.isServiceRolePolicy = isServiceRolePolicy;
        return this;
    }

    /**
     * Get isServiceRolePolicy
     *
     * @return isServiceRolePolicy
     */
    @Schema(description = "")
    public String getIsServiceRolePolicy() {
        return isServiceRolePolicy;
    }

    public void setIsServiceRolePolicy(String isServiceRolePolicy) {
        this.isServiceRolePolicy = isServiceRolePolicy;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyForListProjectIdentitiesOutput policyForListProjectIdentitiesOutput = (PolicyForListProjectIdentitiesOutput) o;
        return Objects.equals(this.policyTrn, policyForListProjectIdentitiesOutput.policyTrn) &&
                Objects.equals(this.policyName, policyForListProjectIdentitiesOutput.policyName) &&
                Objects.equals(this.policyType, policyForListProjectIdentitiesOutput.policyType) &&
                Objects.equals(this.description, policyForListProjectIdentitiesOutput.description) &&
                Objects.equals(this.attachDate, policyForListProjectIdentitiesOutput.attachDate) &&
                Objects.equals(this.isServiceRolePolicy, policyForListProjectIdentitiesOutput.isServiceRolePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyTrn, policyName, policyType, description, attachDate, isServiceRolePolicy);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyForListProjectIdentitiesOutput {\n");

        sb.append("    policyTrn: ").append(toIndentedString(policyTrn)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    attachDate: ").append(toIndentedString(attachDate)).append("\n");
        sb.append("    isServiceRolePolicy: ").append(toIndentedString(isServiceRolePolicy)).append("\n");
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

