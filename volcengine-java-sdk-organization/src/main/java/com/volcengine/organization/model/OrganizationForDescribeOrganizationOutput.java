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
 * OrganizationForDescribeOrganizationOutput
 */


public class OrganizationForDescribeOrganizationOutput {
  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("DeleteUk")
  private String deleteUk = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("Type")
  private Integer type = null;

  @SerializedName("UpdatedTime")
  private String updatedTime = null;

  public OrganizationForDescribeOrganizationOutput createdTime(String createdTime) {
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

  public OrganizationForDescribeOrganizationOutput deleteUk(String deleteUk) {
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

  public OrganizationForDescribeOrganizationOutput deletedTime(String deletedTime) {
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

  public OrganizationForDescribeOrganizationOutput description(String description) {
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

  public OrganizationForDescribeOrganizationOutput ID(String ID) {
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

  public OrganizationForDescribeOrganizationOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationForDescribeOrganizationOutput owner(String owner) {
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

  public OrganizationForDescribeOrganizationOutput status(Integer status) {
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

  public OrganizationForDescribeOrganizationOutput type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public OrganizationForDescribeOrganizationOutput updatedTime(String updatedTime) {
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
    OrganizationForDescribeOrganizationOutput organizationForDescribeOrganizationOutput = (OrganizationForDescribeOrganizationOutput) o;
    return Objects.equals(this.createdTime, organizationForDescribeOrganizationOutput.createdTime) &&
        Objects.equals(this.deleteUk, organizationForDescribeOrganizationOutput.deleteUk) &&
        Objects.equals(this.deletedTime, organizationForDescribeOrganizationOutput.deletedTime) &&
        Objects.equals(this.description, organizationForDescribeOrganizationOutput.description) &&
        Objects.equals(this.ID, organizationForDescribeOrganizationOutput.ID) &&
        Objects.equals(this.name, organizationForDescribeOrganizationOutput.name) &&
        Objects.equals(this.owner, organizationForDescribeOrganizationOutput.owner) &&
        Objects.equals(this.status, organizationForDescribeOrganizationOutput.status) &&
        Objects.equals(this.type, organizationForDescribeOrganizationOutput.type) &&
        Objects.equals(this.updatedTime, organizationForDescribeOrganizationOutput.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, deleteUk, deletedTime, description, ID, name, owner, status, type, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationForDescribeOrganizationOutput {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    deleteUk: ").append(toIndentedString(deleteUk)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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