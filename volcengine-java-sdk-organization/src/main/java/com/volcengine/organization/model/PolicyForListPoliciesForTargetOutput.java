/*
 * organization
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.organization.model;

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
 * PolicyForListPoliciesForTargetOutput
 */



public class PolicyForListPoliciesForTargetOutput {
  @SerializedName("AttachedTime")
  private String attachedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PolicyID")
  private String policyID = null;

  @SerializedName("PolicyName")
  private String policyName = null;

  @SerializedName("PolicyType")
  private String policyType = null;

  public PolicyForListPoliciesForTargetOutput attachedTime(String attachedTime) {
    this.attachedTime = attachedTime;
    return this;
  }

   /**
   * Get attachedTime
   * @return attachedTime
  **/
  @Schema(description = "")
  public String getAttachedTime() {
    return attachedTime;
  }

  public void setAttachedTime(String attachedTime) {
    this.attachedTime = attachedTime;
  }

  public PolicyForListPoliciesForTargetOutput description(String description) {
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

  public PolicyForListPoliciesForTargetOutput policyID(String policyID) {
    this.policyID = policyID;
    return this;
  }

   /**
   * Get policyID
   * @return policyID
  **/
  @Schema(description = "")
  public String getPolicyID() {
    return policyID;
  }

  public void setPolicyID(String policyID) {
    this.policyID = policyID;
  }

  public PolicyForListPoliciesForTargetOutput policyName(String policyName) {
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

  public PolicyForListPoliciesForTargetOutput policyType(String policyType) {
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
    PolicyForListPoliciesForTargetOutput policyForListPoliciesForTargetOutput = (PolicyForListPoliciesForTargetOutput) o;
    return Objects.equals(this.attachedTime, policyForListPoliciesForTargetOutput.attachedTime) &&
        Objects.equals(this.description, policyForListPoliciesForTargetOutput.description) &&
        Objects.equals(this.policyID, policyForListPoliciesForTargetOutput.policyID) &&
        Objects.equals(this.policyName, policyForListPoliciesForTargetOutput.policyName) &&
        Objects.equals(this.policyType, policyForListPoliciesForTargetOutput.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedTime, description, policyID, policyName, policyType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyForListPoliciesForTargetOutput {\n");
    
    sb.append("    attachedTime: ").append(toIndentedString(attachedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyID: ").append(toIndentedString(policyID)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
