/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.AclEntryForDescribeAclAttributesOutput;
import com.volcengine.alb.model.ListenerForDescribeAclAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAclAttributesResponse
 */


public class DescribeAclAttributesResponse {
  @SerializedName("AclEntries")
  private List<AclEntryForDescribeAclAttributesOutput> aclEntries = null;

  @SerializedName("AclId")
  private String aclId = null;

  @SerializedName("AclName")
  private String aclName = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Listeners")
  private List<ListenerForDescribeAclAttributesOutput> listeners = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public DescribeAclAttributesResponse aclEntries(List<AclEntryForDescribeAclAttributesOutput> aclEntries) {
    this.aclEntries = aclEntries;
    return this;
  }

  public DescribeAclAttributesResponse addAclEntriesItem(AclEntryForDescribeAclAttributesOutput aclEntriesItem) {
    if (this.aclEntries == null) {
      this.aclEntries = new ArrayList<AclEntryForDescribeAclAttributesOutput>();
    }
    this.aclEntries.add(aclEntriesItem);
    return this;
  }

   /**
   * Get aclEntries
   * @return aclEntries
  **/
  @Valid
  @Schema(description = "")
  public List<AclEntryForDescribeAclAttributesOutput> getAclEntries() {
    return aclEntries;
  }

  public void setAclEntries(List<AclEntryForDescribeAclAttributesOutput> aclEntries) {
    this.aclEntries = aclEntries;
  }

  public DescribeAclAttributesResponse aclId(String aclId) {
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

  public DescribeAclAttributesResponse aclName(String aclName) {
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

  public DescribeAclAttributesResponse createTime(String createTime) {
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

  public DescribeAclAttributesResponse description(String description) {
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

  public DescribeAclAttributesResponse listeners(List<ListenerForDescribeAclAttributesOutput> listeners) {
    this.listeners = listeners;
    return this;
  }

  public DescribeAclAttributesResponse addListenersItem(ListenerForDescribeAclAttributesOutput listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<ListenerForDescribeAclAttributesOutput>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * Get listeners
   * @return listeners
  **/
  @Valid
  @Schema(description = "")
  public List<ListenerForDescribeAclAttributesOutput> getListeners() {
    return listeners;
  }

  public void setListeners(List<ListenerForDescribeAclAttributesOutput> listeners) {
    this.listeners = listeners;
  }

  public DescribeAclAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeAclAttributesResponse status(String status) {
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

  public DescribeAclAttributesResponse updateTime(String updateTime) {
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
    DescribeAclAttributesResponse describeAclAttributesResponse = (DescribeAclAttributesResponse) o;
    return Objects.equals(this.aclEntries, describeAclAttributesResponse.aclEntries) &&
        Objects.equals(this.aclId, describeAclAttributesResponse.aclId) &&
        Objects.equals(this.aclName, describeAclAttributesResponse.aclName) &&
        Objects.equals(this.createTime, describeAclAttributesResponse.createTime) &&
        Objects.equals(this.description, describeAclAttributesResponse.description) &&
        Objects.equals(this.listeners, describeAclAttributesResponse.listeners) &&
        Objects.equals(this.requestId, describeAclAttributesResponse.requestId) &&
        Objects.equals(this.status, describeAclAttributesResponse.status) &&
        Objects.equals(this.updateTime, describeAclAttributesResponse.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclEntries, aclId, aclName, createTime, description, listeners, requestId, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAclAttributesResponse {\n");
    
    sb.append("    aclEntries: ").append(toIndentedString(aclEntries)).append("\n");
    sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
    sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
