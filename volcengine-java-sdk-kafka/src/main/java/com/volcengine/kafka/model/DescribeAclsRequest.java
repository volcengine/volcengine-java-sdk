/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

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
 * DescribeAclsRequest
 */



public class DescribeAclsRequest {
  @SerializedName("AccessPolicy")
  private String accessPolicy = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PatternType")
  private String patternType = null;

  @SerializedName("Resource")
  private String resource = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("UserName")
  private String userName = null;

  public DescribeAclsRequest accessPolicy(String accessPolicy) {
    this.accessPolicy = accessPolicy;
    return this;
  }

   /**
   * Get accessPolicy
   * @return accessPolicy
  **/
  @Schema(description = "")
  public String getAccessPolicy() {
    return accessPolicy;
  }

  public void setAccessPolicy(String accessPolicy) {
    this.accessPolicy = accessPolicy;
  }

  public DescribeAclsRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeAclsRequest ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public DescribeAclsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeAclsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeAclsRequest patternType(String patternType) {
    this.patternType = patternType;
    return this;
  }

   /**
   * Get patternType
   * @return patternType
  **/
  @Schema(description = "")
  public String getPatternType() {
    return patternType;
  }

  public void setPatternType(String patternType) {
    this.patternType = patternType;
  }

  public DescribeAclsRequest resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Schema(description = "")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public DescribeAclsRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public DescribeAclsRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAclsRequest describeAclsRequest = (DescribeAclsRequest) o;
    return Objects.equals(this.accessPolicy, describeAclsRequest.accessPolicy) &&
        Objects.equals(this.instanceId, describeAclsRequest.instanceId) &&
        Objects.equals(this.ip, describeAclsRequest.ip) &&
        Objects.equals(this.pageNumber, describeAclsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeAclsRequest.pageSize) &&
        Objects.equals(this.patternType, describeAclsRequest.patternType) &&
        Objects.equals(this.resource, describeAclsRequest.resource) &&
        Objects.equals(this.resourceType, describeAclsRequest.resourceType) &&
        Objects.equals(this.userName, describeAclsRequest.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicy, instanceId, ip, pageNumber, pageSize, patternType, resource, resourceType, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAclsRequest {\n");
    
    sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
