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
 * InvitationListForListInvitationsOutput
 */


public class InvitationListForListInvitationsOutput {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("AllowExit")
  private Integer allowExit = null;

  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("DeleteUk")
  private String deleteUk = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExTime")
  private String exTime = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("LinkID")
  private String linkID = null;

  @SerializedName("OrgID")
  private String orgID = null;

  @SerializedName("OrgUnitID")
  private String orgUnitID = null;

  @SerializedName("OrgUnitName")
  private String orgUnitName = null;

  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("RejectReason")
  private String rejectReason = null;

  @SerializedName("ShowName")
  private String showName = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("UpdatedTime")
  private String updatedTime = null;

  public InvitationListForListInvitationsOutput accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public InvitationListForListInvitationsOutput accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public InvitationListForListInvitationsOutput allowExit(Integer allowExit) {
    this.allowExit = allowExit;
    return this;
  }

   /**
   * Get allowExit
   * @return allowExit
  **/
  @Schema(description = "")
  public Integer getAllowExit() {
    return allowExit;
  }

  public void setAllowExit(Integer allowExit) {
    this.allowExit = allowExit;
  }

  public InvitationListForListInvitationsOutput createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public InvitationListForListInvitationsOutput deleteUk(String deleteUk) {
    this.deleteUk = deleteUk;
    return this;
  }

   /**
   * Get deleteUk
   * @return deleteUk
  **/
  @Schema(description = "")
  public String getDeleteUk() {
    return deleteUk;
  }

  public void setDeleteUk(String deleteUk) {
    this.deleteUk = deleteUk;
  }

  public InvitationListForListInvitationsOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public InvitationListForListInvitationsOutput description(String description) {
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

  public InvitationListForListInvitationsOutput exTime(String exTime) {
    this.exTime = exTime;
    return this;
  }

   /**
   * Get exTime
   * @return exTime
  **/
  @Schema(description = "")
  public String getExTime() {
    return exTime;
  }

  public void setExTime(String exTime) {
    this.exTime = exTime;
  }

  public InvitationListForListInvitationsOutput ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public InvitationListForListInvitationsOutput linkID(String linkID) {
    this.linkID = linkID;
    return this;
  }

   /**
   * Get linkID
   * @return linkID
  **/
  @Schema(description = "")
  public String getLinkID() {
    return linkID;
  }

  public void setLinkID(String linkID) {
    this.linkID = linkID;
  }

  public InvitationListForListInvitationsOutput orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * Get orgID
   * @return orgID
  **/
  @Schema(description = "")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public InvitationListForListInvitationsOutput orgUnitID(String orgUnitID) {
    this.orgUnitID = orgUnitID;
    return this;
  }

   /**
   * Get orgUnitID
   * @return orgUnitID
  **/
  @Schema(description = "")
  public String getOrgUnitID() {
    return orgUnitID;
  }

  public void setOrgUnitID(String orgUnitID) {
    this.orgUnitID = orgUnitID;
  }

  public InvitationListForListInvitationsOutput orgUnitName(String orgUnitName) {
    this.orgUnitName = orgUnitName;
    return this;
  }

   /**
   * Get orgUnitName
   * @return orgUnitName
  **/
  @Schema(description = "")
  public String getOrgUnitName() {
    return orgUnitName;
  }

  public void setOrgUnitName(String orgUnitName) {
    this.orgUnitName = orgUnitName;
  }

  public InvitationListForListInvitationsOutput owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public InvitationListForListInvitationsOutput rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * Get rejectReason
   * @return rejectReason
  **/
  @Schema(description = "")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public InvitationListForListInvitationsOutput showName(String showName) {
    this.showName = showName;
    return this;
  }

   /**
   * Get showName
   * @return showName
  **/
  @Schema(description = "")
  public String getShowName() {
    return showName;
  }

  public void setShowName(String showName) {
    this.showName = showName;
  }

  public InvitationListForListInvitationsOutput status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InvitationListForListInvitationsOutput updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @Schema(description = "")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationListForListInvitationsOutput invitationListForListInvitationsOutput = (InvitationListForListInvitationsOutput) o;
    return Objects.equals(this.accountID, invitationListForListInvitationsOutput.accountID) &&
        Objects.equals(this.accountName, invitationListForListInvitationsOutput.accountName) &&
        Objects.equals(this.allowExit, invitationListForListInvitationsOutput.allowExit) &&
        Objects.equals(this.createdTime, invitationListForListInvitationsOutput.createdTime) &&
        Objects.equals(this.deleteUk, invitationListForListInvitationsOutput.deleteUk) &&
        Objects.equals(this.deletedTime, invitationListForListInvitationsOutput.deletedTime) &&
        Objects.equals(this.description, invitationListForListInvitationsOutput.description) &&
        Objects.equals(this.exTime, invitationListForListInvitationsOutput.exTime) &&
        Objects.equals(this.ID, invitationListForListInvitationsOutput.ID) &&
        Objects.equals(this.linkID, invitationListForListInvitationsOutput.linkID) &&
        Objects.equals(this.orgID, invitationListForListInvitationsOutput.orgID) &&
        Objects.equals(this.orgUnitID, invitationListForListInvitationsOutput.orgUnitID) &&
        Objects.equals(this.orgUnitName, invitationListForListInvitationsOutput.orgUnitName) &&
        Objects.equals(this.owner, invitationListForListInvitationsOutput.owner) &&
        Objects.equals(this.rejectReason, invitationListForListInvitationsOutput.rejectReason) &&
        Objects.equals(this.showName, invitationListForListInvitationsOutput.showName) &&
        Objects.equals(this.status, invitationListForListInvitationsOutput.status) &&
        Objects.equals(this.updatedTime, invitationListForListInvitationsOutput.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, accountName, allowExit, createdTime, deleteUk, deletedTime, description, exTime, ID, linkID, orgID, orgUnitID, orgUnitName, owner, rejectReason, showName, status, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationListForListInvitationsOutput {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    allowExit: ").append(toIndentedString(allowExit)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    deleteUk: ").append(toIndentedString(deleteUk)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exTime: ").append(toIndentedString(exTime)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    linkID: ").append(toIndentedString(linkID)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    orgUnitID: ").append(toIndentedString(orgUnitID)).append("\n");
    sb.append("    orgUnitName: ").append(toIndentedString(orgUnitName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    showName: ").append(toIndentedString(showName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
