/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AttachedPolicyMetadataForListAttachedRolePoliciesOutput
 */


public class AttachedPolicyMetadataForListAttachedRolePoliciesOutput {
  @SerializedName("AttachDate")
  private String attachDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PolicyName")
  private String policyName = null;

  @SerializedName("PolicyTrn")
  private String policyTrn = null;

  @SerializedName("PolicyType")
  private String policyType = null;

  public AttachedPolicyMetadataForListAttachedRolePoliciesOutput attachDate(String attachDate) {
    this.attachDate = attachDate;
    return this;
  }

   /**
   * Get attachDate
   * @return attachDate
  **/
  @Schema(description = "")
  public String getAttachDate() {
    return attachDate;
  }

  public void setAttachDate(String attachDate) {
    this.attachDate = attachDate;
  }

  public AttachedPolicyMetadataForListAttachedRolePoliciesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AttachedPolicyMetadataForListAttachedRolePoliciesOutput policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Get policyName
   * @return policyName
  **/
  @Schema(description = "")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public AttachedPolicyMetadataForListAttachedRolePoliciesOutput policyTrn(String policyTrn) {
    this.policyTrn = policyTrn;
    return this;
  }

   /**
   * Get policyTrn
   * @return policyTrn
  **/
  @Schema(description = "")
  public String getPolicyTrn() {
    return policyTrn;
  }

  public void setPolicyTrn(String policyTrn) {
    this.policyTrn = policyTrn;
  }

  public AttachedPolicyMetadataForListAttachedRolePoliciesOutput policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @Schema(description = "")
  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachedPolicyMetadataForListAttachedRolePoliciesOutput attachedPolicyMetadataForListAttachedRolePoliciesOutput = (AttachedPolicyMetadataForListAttachedRolePoliciesOutput) o;
    return Objects.equals(this.attachDate, attachedPolicyMetadataForListAttachedRolePoliciesOutput.attachDate) &&
        Objects.equals(this.description, attachedPolicyMetadataForListAttachedRolePoliciesOutput.description) &&
        Objects.equals(this.policyName, attachedPolicyMetadataForListAttachedRolePoliciesOutput.policyName) &&
        Objects.equals(this.policyTrn, attachedPolicyMetadataForListAttachedRolePoliciesOutput.policyTrn) &&
        Objects.equals(this.policyType, attachedPolicyMetadataForListAttachedRolePoliciesOutput.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachDate, description, policyName, policyTrn, policyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachedPolicyMetadataForListAttachedRolePoliciesOutput {\n");
    
    sb.append("    attachDate: ").append(toIndentedString(attachDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyTrn: ").append(toIndentedString(policyTrn)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}