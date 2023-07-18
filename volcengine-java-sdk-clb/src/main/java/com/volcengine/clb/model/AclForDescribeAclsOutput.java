/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AclForDescribeAclsOutput
 */



public class AclForDescribeAclsOutput {
  @SerializedName("AclEntryCount")
  private Integer aclEntryCount = null;

  @SerializedName("AclId")
  private String aclId = null;

  @SerializedName("AclName")
  private String aclName = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Listeners")
  private List<String> listeners = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public AclForDescribeAclsOutput aclEntryCount(Integer aclEntryCount) {
    this.aclEntryCount = aclEntryCount;
    return this;
  }

   /**
   * Get aclEntryCount
   * @return aclEntryCount
  **/
  @Schema(description = "")
  public Integer getAclEntryCount() {
    return aclEntryCount;
  }

  public void setAclEntryCount(Integer aclEntryCount) {
    this.aclEntryCount = aclEntryCount;
  }

  public AclForDescribeAclsOutput aclId(String aclId) {
    this.aclId = aclId;
    return this;
  }

   /**
   * Get aclId
   * @return aclId
  **/
  @Schema(description = "")
  public String getAclId() {
    return aclId;
  }

  public void setAclId(String aclId) {
    this.aclId = aclId;
  }

  public AclForDescribeAclsOutput aclName(String aclName) {
    this.aclName = aclName;
    return this;
  }

   /**
   * Get aclName
   * @return aclName
  **/
  @Schema(description = "")
  public String getAclName() {
    return aclName;
  }

  public void setAclName(String aclName) {
    this.aclName = aclName;
  }

  public AclForDescribeAclsOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public AclForDescribeAclsOutput description(String description) {
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

  public AclForDescribeAclsOutput listeners(List<String> listeners) {
    this.listeners = listeners;
    return this;
  }

  public AclForDescribeAclsOutput addListenersItem(String listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<String>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Schema(description = "")
  public List<String> getListeners() {
    return listeners;
  }

  public void setListeners(List<String> listeners) {
    this.listeners = listeners;
  }

  public AclForDescribeAclsOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public AclForDescribeAclsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AclForDescribeAclsOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AclForDescribeAclsOutput aclForDescribeAclsOutput = (AclForDescribeAclsOutput) o;
    return Objects.equals(this.aclEntryCount, aclForDescribeAclsOutput.aclEntryCount) &&
        Objects.equals(this.aclId, aclForDescribeAclsOutput.aclId) &&
        Objects.equals(this.aclName, aclForDescribeAclsOutput.aclName) &&
        Objects.equals(this.createTime, aclForDescribeAclsOutput.createTime) &&
        Objects.equals(this.description, aclForDescribeAclsOutput.description) &&
        Objects.equals(this.listeners, aclForDescribeAclsOutput.listeners) &&
        Objects.equals(this.projectName, aclForDescribeAclsOutput.projectName) &&
        Objects.equals(this.status, aclForDescribeAclsOutput.status) &&
        Objects.equals(this.updateTime, aclForDescribeAclsOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclEntryCount, aclId, aclName, createTime, description, listeners, projectName, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AclForDescribeAclsOutput {\n");
    
    sb.append("    aclEntryCount: ").append(toIndentedString(aclEntryCount)).append("\n");
    sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
    sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
