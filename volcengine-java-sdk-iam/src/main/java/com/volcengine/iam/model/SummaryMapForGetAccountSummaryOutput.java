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
 * SummaryMapForGetAccountSummaryOutput
 */



public class SummaryMapForGetAccountSummaryOutput {
  @SerializedName("AccessKeysPerAccountQuota")
  private Long accessKeysPerAccountQuota = null;

  @SerializedName("AccessKeysPerUserQuota")
  private Long accessKeysPerUserQuota = null;

  @SerializedName("AttachedPoliciesPerGroupQuota")
  private Long attachedPoliciesPerGroupQuota = null;

  @SerializedName("AttachedPoliciesPerRoleQuota")
  private Long attachedPoliciesPerRoleQuota = null;

  @SerializedName("AttachedPoliciesPerUserQuota")
  private Long attachedPoliciesPerUserQuota = null;

  @SerializedName("AttachedSystemPoliciesPerGroupQuota")
  private Long attachedSystemPoliciesPerGroupQuota = null;

  @SerializedName("AttachedSystemPoliciesPerRoleQuota")
  private Long attachedSystemPoliciesPerRoleQuota = null;

  @SerializedName("AttachedSystemPoliciesPerUserQuota")
  private Long attachedSystemPoliciesPerUserQuota = null;

  @SerializedName("GroupsPerUserQuota")
  private Long groupsPerUserQuota = null;

  @SerializedName("GroupsQuota")
  private Long groupsQuota = null;

  @SerializedName("GroupsUsage")
  private Long groupsUsage = null;

  @SerializedName("PoliciesQuota")
  private Long policiesQuota = null;

  @SerializedName("PoliciesUsage")
  private Long policiesUsage = null;

  @SerializedName("PolicySize")
  private Long policySize = null;

  @SerializedName("RolesQuota")
  private Long rolesQuota = null;

  @SerializedName("RolesUsage")
  private Long rolesUsage = null;

  @SerializedName("UsersQuota")
  private Long usersQuota = null;

  @SerializedName("UsersUsage")
  private Long usersUsage = null;

  public SummaryMapForGetAccountSummaryOutput accessKeysPerAccountQuota(Long accessKeysPerAccountQuota) {
    this.accessKeysPerAccountQuota = accessKeysPerAccountQuota;
    return this;
  }

   /**
   * Get accessKeysPerAccountQuota
   * @return accessKeysPerAccountQuota
  **/
  @Schema(description = "")
  public Long getAccessKeysPerAccountQuota() {
    return accessKeysPerAccountQuota;
  }

  public void setAccessKeysPerAccountQuota(Long accessKeysPerAccountQuota) {
    this.accessKeysPerAccountQuota = accessKeysPerAccountQuota;
  }

  public SummaryMapForGetAccountSummaryOutput accessKeysPerUserQuota(Long accessKeysPerUserQuota) {
    this.accessKeysPerUserQuota = accessKeysPerUserQuota;
    return this;
  }

   /**
   * Get accessKeysPerUserQuota
   * @return accessKeysPerUserQuota
  **/
  @Schema(description = "")
  public Long getAccessKeysPerUserQuota() {
    return accessKeysPerUserQuota;
  }

  public void setAccessKeysPerUserQuota(Long accessKeysPerUserQuota) {
    this.accessKeysPerUserQuota = accessKeysPerUserQuota;
  }

  public SummaryMapForGetAccountSummaryOutput attachedPoliciesPerGroupQuota(Long attachedPoliciesPerGroupQuota) {
    this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
    return this;
  }

   /**
   * Get attachedPoliciesPerGroupQuota
   * @return attachedPoliciesPerGroupQuota
  **/
  @Schema(description = "")
  public Long getAttachedPoliciesPerGroupQuota() {
    return attachedPoliciesPerGroupQuota;
  }

  public void setAttachedPoliciesPerGroupQuota(Long attachedPoliciesPerGroupQuota) {
    this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
  }

  public SummaryMapForGetAccountSummaryOutput attachedPoliciesPerRoleQuota(Long attachedPoliciesPerRoleQuota) {
    this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
    return this;
  }

   /**
   * Get attachedPoliciesPerRoleQuota
   * @return attachedPoliciesPerRoleQuota
  **/
  @Schema(description = "")
  public Long getAttachedPoliciesPerRoleQuota() {
    return attachedPoliciesPerRoleQuota;
  }

  public void setAttachedPoliciesPerRoleQuota(Long attachedPoliciesPerRoleQuota) {
    this.attachedPoliciesPerRoleQuota = attachedPoliciesPerRoleQuota;
  }

  public SummaryMapForGetAccountSummaryOutput attachedPoliciesPerUserQuota(Long attachedPoliciesPerUserQuota) {
    this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
    return this;
  }

   /**
   * Get attachedPoliciesPerUserQuota
   * @return attachedPoliciesPerUserQuota
  **/
  @Schema(description = "")
  public Long getAttachedPoliciesPerUserQuota() {
    return attachedPoliciesPerUserQuota;
  }

  public void setAttachedPoliciesPerUserQuota(Long attachedPoliciesPerUserQuota) {
    this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
  }

  public SummaryMapForGetAccountSummaryOutput attachedSystemPoliciesPerGroupQuota(Long attachedSystemPoliciesPerGroupQuota) {
    this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
    return this;
  }

   /**
   * Get attachedSystemPoliciesPerGroupQuota
   * @return attachedSystemPoliciesPerGroupQuota
  **/
  @Schema(description = "")
  public Long getAttachedSystemPoliciesPerGroupQuota() {
    return attachedSystemPoliciesPerGroupQuota;
  }

  public void setAttachedSystemPoliciesPerGroupQuota(Long attachedSystemPoliciesPerGroupQuota) {
    this.attachedSystemPoliciesPerGroupQuota = attachedSystemPoliciesPerGroupQuota;
  }

  public SummaryMapForGetAccountSummaryOutput attachedSystemPoliciesPerRoleQuota(Long attachedSystemPoliciesPerRoleQuota) {
    this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
    return this;
  }

   /**
   * Get attachedSystemPoliciesPerRoleQuota
   * @return attachedSystemPoliciesPerRoleQuota
  **/
  @Schema(description = "")
  public Long getAttachedSystemPoliciesPerRoleQuota() {
    return attachedSystemPoliciesPerRoleQuota;
  }

  public void setAttachedSystemPoliciesPerRoleQuota(Long attachedSystemPoliciesPerRoleQuota) {
    this.attachedSystemPoliciesPerRoleQuota = attachedSystemPoliciesPerRoleQuota;
  }

  public SummaryMapForGetAccountSummaryOutput attachedSystemPoliciesPerUserQuota(Long attachedSystemPoliciesPerUserQuota) {
    this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
    return this;
  }

   /**
   * Get attachedSystemPoliciesPerUserQuota
   * @return attachedSystemPoliciesPerUserQuota
  **/
  @Schema(description = "")
  public Long getAttachedSystemPoliciesPerUserQuota() {
    return attachedSystemPoliciesPerUserQuota;
  }

  public void setAttachedSystemPoliciesPerUserQuota(Long attachedSystemPoliciesPerUserQuota) {
    this.attachedSystemPoliciesPerUserQuota = attachedSystemPoliciesPerUserQuota;
  }

  public SummaryMapForGetAccountSummaryOutput groupsPerUserQuota(Long groupsPerUserQuota) {
    this.groupsPerUserQuota = groupsPerUserQuota;
    return this;
  }

   /**
   * Get groupsPerUserQuota
   * @return groupsPerUserQuota
  **/
  @Schema(description = "")
  public Long getGroupsPerUserQuota() {
    return groupsPerUserQuota;
  }

  public void setGroupsPerUserQuota(Long groupsPerUserQuota) {
    this.groupsPerUserQuota = groupsPerUserQuota;
  }

  public SummaryMapForGetAccountSummaryOutput groupsQuota(Long groupsQuota) {
    this.groupsQuota = groupsQuota;
    return this;
  }

   /**
   * Get groupsQuota
   * @return groupsQuota
  **/
  @Schema(description = "")
  public Long getGroupsQuota() {
    return groupsQuota;
  }

  public void setGroupsQuota(Long groupsQuota) {
    this.groupsQuota = groupsQuota;
  }

  public SummaryMapForGetAccountSummaryOutput groupsUsage(Long groupsUsage) {
    this.groupsUsage = groupsUsage;
    return this;
  }

   /**
   * Get groupsUsage
   * @return groupsUsage
  **/
  @Schema(description = "")
  public Long getGroupsUsage() {
    return groupsUsage;
  }

  public void setGroupsUsage(Long groupsUsage) {
    this.groupsUsage = groupsUsage;
  }

  public SummaryMapForGetAccountSummaryOutput policiesQuota(Long policiesQuota) {
    this.policiesQuota = policiesQuota;
    return this;
  }

   /**
   * Get policiesQuota
   * @return policiesQuota
  **/
  @Schema(description = "")
  public Long getPoliciesQuota() {
    return policiesQuota;
  }

  public void setPoliciesQuota(Long policiesQuota) {
    this.policiesQuota = policiesQuota;
  }

  public SummaryMapForGetAccountSummaryOutput policiesUsage(Long policiesUsage) {
    this.policiesUsage = policiesUsage;
    return this;
  }

   /**
   * Get policiesUsage
   * @return policiesUsage
  **/
  @Schema(description = "")
  public Long getPoliciesUsage() {
    return policiesUsage;
  }

  public void setPoliciesUsage(Long policiesUsage) {
    this.policiesUsage = policiesUsage;
  }

  public SummaryMapForGetAccountSummaryOutput policySize(Long policySize) {
    this.policySize = policySize;
    return this;
  }

   /**
   * Get policySize
   * @return policySize
  **/
  @Schema(description = "")
  public Long getPolicySize() {
    return policySize;
  }

  public void setPolicySize(Long policySize) {
    this.policySize = policySize;
  }

  public SummaryMapForGetAccountSummaryOutput rolesQuota(Long rolesQuota) {
    this.rolesQuota = rolesQuota;
    return this;
  }

   /**
   * Get rolesQuota
   * @return rolesQuota
  **/
  @Schema(description = "")
  public Long getRolesQuota() {
    return rolesQuota;
  }

  public void setRolesQuota(Long rolesQuota) {
    this.rolesQuota = rolesQuota;
  }

  public SummaryMapForGetAccountSummaryOutput rolesUsage(Long rolesUsage) {
    this.rolesUsage = rolesUsage;
    return this;
  }

   /**
   * Get rolesUsage
   * @return rolesUsage
  **/
  @Schema(description = "")
  public Long getRolesUsage() {
    return rolesUsage;
  }

  public void setRolesUsage(Long rolesUsage) {
    this.rolesUsage = rolesUsage;
  }

  public SummaryMapForGetAccountSummaryOutput usersQuota(Long usersQuota) {
    this.usersQuota = usersQuota;
    return this;
  }

   /**
   * Get usersQuota
   * @return usersQuota
  **/
  @Schema(description = "")
  public Long getUsersQuota() {
    return usersQuota;
  }

  public void setUsersQuota(Long usersQuota) {
    this.usersQuota = usersQuota;
  }

  public SummaryMapForGetAccountSummaryOutput usersUsage(Long usersUsage) {
    this.usersUsage = usersUsage;
    return this;
  }

   /**
   * Get usersUsage
   * @return usersUsage
  **/
  @Schema(description = "")
  public Long getUsersUsage() {
    return usersUsage;
  }

  public void setUsersUsage(Long usersUsage) {
    this.usersUsage = usersUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryMapForGetAccountSummaryOutput summaryMapForGetAccountSummaryOutput = (SummaryMapForGetAccountSummaryOutput) o;
    return Objects.equals(this.accessKeysPerAccountQuota, summaryMapForGetAccountSummaryOutput.accessKeysPerAccountQuota) &&
        Objects.equals(this.accessKeysPerUserQuota, summaryMapForGetAccountSummaryOutput.accessKeysPerUserQuota) &&
        Objects.equals(this.attachedPoliciesPerGroupQuota, summaryMapForGetAccountSummaryOutput.attachedPoliciesPerGroupQuota) &&
        Objects.equals(this.attachedPoliciesPerRoleQuota, summaryMapForGetAccountSummaryOutput.attachedPoliciesPerRoleQuota) &&
        Objects.equals(this.attachedPoliciesPerUserQuota, summaryMapForGetAccountSummaryOutput.attachedPoliciesPerUserQuota) &&
        Objects.equals(this.attachedSystemPoliciesPerGroupQuota, summaryMapForGetAccountSummaryOutput.attachedSystemPoliciesPerGroupQuota) &&
        Objects.equals(this.attachedSystemPoliciesPerRoleQuota, summaryMapForGetAccountSummaryOutput.attachedSystemPoliciesPerRoleQuota) &&
        Objects.equals(this.attachedSystemPoliciesPerUserQuota, summaryMapForGetAccountSummaryOutput.attachedSystemPoliciesPerUserQuota) &&
        Objects.equals(this.groupsPerUserQuota, summaryMapForGetAccountSummaryOutput.groupsPerUserQuota) &&
        Objects.equals(this.groupsQuota, summaryMapForGetAccountSummaryOutput.groupsQuota) &&
        Objects.equals(this.groupsUsage, summaryMapForGetAccountSummaryOutput.groupsUsage) &&
        Objects.equals(this.policiesQuota, summaryMapForGetAccountSummaryOutput.policiesQuota) &&
        Objects.equals(this.policiesUsage, summaryMapForGetAccountSummaryOutput.policiesUsage) &&
        Objects.equals(this.policySize, summaryMapForGetAccountSummaryOutput.policySize) &&
        Objects.equals(this.rolesQuota, summaryMapForGetAccountSummaryOutput.rolesQuota) &&
        Objects.equals(this.rolesUsage, summaryMapForGetAccountSummaryOutput.rolesUsage) &&
        Objects.equals(this.usersQuota, summaryMapForGetAccountSummaryOutput.usersQuota) &&
        Objects.equals(this.usersUsage, summaryMapForGetAccountSummaryOutput.usersUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeysPerAccountQuota, accessKeysPerUserQuota, attachedPoliciesPerGroupQuota, attachedPoliciesPerRoleQuota, attachedPoliciesPerUserQuota, attachedSystemPoliciesPerGroupQuota, attachedSystemPoliciesPerRoleQuota, attachedSystemPoliciesPerUserQuota, groupsPerUserQuota, groupsQuota, groupsUsage, policiesQuota, policiesUsage, policySize, rolesQuota, rolesUsage, usersQuota, usersUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryMapForGetAccountSummaryOutput {\n");
    
    sb.append("    accessKeysPerAccountQuota: ").append(toIndentedString(accessKeysPerAccountQuota)).append("\n");
    sb.append("    accessKeysPerUserQuota: ").append(toIndentedString(accessKeysPerUserQuota)).append("\n");
    sb.append("    attachedPoliciesPerGroupQuota: ").append(toIndentedString(attachedPoliciesPerGroupQuota)).append("\n");
    sb.append("    attachedPoliciesPerRoleQuota: ").append(toIndentedString(attachedPoliciesPerRoleQuota)).append("\n");
    sb.append("    attachedPoliciesPerUserQuota: ").append(toIndentedString(attachedPoliciesPerUserQuota)).append("\n");
    sb.append("    attachedSystemPoliciesPerGroupQuota: ").append(toIndentedString(attachedSystemPoliciesPerGroupQuota)).append("\n");
    sb.append("    attachedSystemPoliciesPerRoleQuota: ").append(toIndentedString(attachedSystemPoliciesPerRoleQuota)).append("\n");
    sb.append("    attachedSystemPoliciesPerUserQuota: ").append(toIndentedString(attachedSystemPoliciesPerUserQuota)).append("\n");
    sb.append("    groupsPerUserQuota: ").append(toIndentedString(groupsPerUserQuota)).append("\n");
    sb.append("    groupsQuota: ").append(toIndentedString(groupsQuota)).append("\n");
    sb.append("    groupsUsage: ").append(toIndentedString(groupsUsage)).append("\n");
    sb.append("    policiesQuota: ").append(toIndentedString(policiesQuota)).append("\n");
    sb.append("    policiesUsage: ").append(toIndentedString(policiesUsage)).append("\n");
    sb.append("    policySize: ").append(toIndentedString(policySize)).append("\n");
    sb.append("    rolesQuota: ").append(toIndentedString(rolesQuota)).append("\n");
    sb.append("    rolesUsage: ").append(toIndentedString(rolesUsage)).append("\n");
    sb.append("    usersQuota: ").append(toIndentedString(usersQuota)).append("\n");
    sb.append("    usersUsage: ").append(toIndentedString(usersUsage)).append("\n");
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
