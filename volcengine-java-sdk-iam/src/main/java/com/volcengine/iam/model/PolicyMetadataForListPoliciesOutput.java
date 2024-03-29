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
 * PolicyMetadataForListPoliciesOutput
 */


public class PolicyMetadataForListPoliciesOutput {
  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PolicyDocument")
  private String policyDocument = null;

  @SerializedName("PolicyName")
  private String policyName = null;

  @SerializedName("PolicyTrn")
  private String policyTrn = null;

  @SerializedName("PolicyType")
  private String policyType = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  public PolicyMetadataForListPoliciesOutput createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public PolicyMetadataForListPoliciesOutput description(String description) {
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

  public PolicyMetadataForListPoliciesOutput policyDocument(String policyDocument) {
    this.policyDocument = policyDocument;
    return this;
  }

   /**
   * Get policyDocument
   * @return policyDocument
  **/
  @Schema(description = "")
  public String getPolicyDocument() {
    return policyDocument;
  }

  public void setPolicyDocument(String policyDocument) {
    this.policyDocument = policyDocument;
  }

  public PolicyMetadataForListPoliciesOutput policyName(String policyName) {
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

  public PolicyMetadataForListPoliciesOutput policyTrn(String policyTrn) {
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

  public PolicyMetadataForListPoliciesOutput policyType(String policyType) {
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

  public PolicyMetadataForListPoliciesOutput updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @Schema(description = "")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyMetadataForListPoliciesOutput policyMetadataForListPoliciesOutput = (PolicyMetadataForListPoliciesOutput) o;
    return Objects.equals(this.createDate, policyMetadataForListPoliciesOutput.createDate) &&
        Objects.equals(this.description, policyMetadataForListPoliciesOutput.description) &&
        Objects.equals(this.policyDocument, policyMetadataForListPoliciesOutput.policyDocument) &&
        Objects.equals(this.policyName, policyMetadataForListPoliciesOutput.policyName) &&
        Objects.equals(this.policyTrn, policyMetadataForListPoliciesOutput.policyTrn) &&
        Objects.equals(this.policyType, policyMetadataForListPoliciesOutput.policyType) &&
        Objects.equals(this.updateDate, policyMetadataForListPoliciesOutput.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, description, policyDocument, policyName, policyTrn, policyType, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyMetadataForListPoliciesOutput {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyDocument: ").append(toIndentedString(policyDocument)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyTrn: ").append(toIndentedString(policyTrn)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
