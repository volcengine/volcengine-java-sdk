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
 * UpdateServiceControlPolicyResponse
 */



public class UpdateServiceControlPolicyResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CreateDate")
  private String createDate = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("PolicyID")
  private String policyID = null;

  @SerializedName("PolicyName")
  private String policyName = null;

  @SerializedName("PolicyType")
  private String policyType = null;

  @SerializedName("Statement")
  private String statement = null;

  @SerializedName("UpdateDate")
  private String updateDate = null;

  public UpdateServiceControlPolicyResponse createDate(String createDate) {
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

  public UpdateServiceControlPolicyResponse description(String description) {
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

  public UpdateServiceControlPolicyResponse policyID(String policyID) {
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

  public UpdateServiceControlPolicyResponse policyName(String policyName) {
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

  public UpdateServiceControlPolicyResponse policyType(String policyType) {
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

  public UpdateServiceControlPolicyResponse statement(String statement) {
    this.statement = statement;
    return this;
  }

   /**
   * Get statement
   * @return statement
  **/
  @Schema(description = "")
  public String getStatement() {
    return statement;
  }

  public void setStatement(String statement) {
    this.statement = statement;
  }

  public UpdateServiceControlPolicyResponse updateDate(String updateDate) {
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
    UpdateServiceControlPolicyResponse updateServiceControlPolicyResponse = (UpdateServiceControlPolicyResponse) o;
    return Objects.equals(this.createDate, updateServiceControlPolicyResponse.createDate) &&
        Objects.equals(this.description, updateServiceControlPolicyResponse.description) &&
        Objects.equals(this.policyID, updateServiceControlPolicyResponse.policyID) &&
        Objects.equals(this.policyName, updateServiceControlPolicyResponse.policyName) &&
        Objects.equals(this.policyType, updateServiceControlPolicyResponse.policyType) &&
        Objects.equals(this.statement, updateServiceControlPolicyResponse.statement) &&
        Objects.equals(this.updateDate, updateServiceControlPolicyResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, description, policyID, policyName, policyType, statement, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceControlPolicyResponse {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyID: ").append(toIndentedString(policyID)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
