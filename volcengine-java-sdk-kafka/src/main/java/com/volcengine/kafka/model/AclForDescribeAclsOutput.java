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
 * AclForDescribeAclsOutput
 */



public class AclForDescribeAclsOutput {
  @SerializedName("AccessPolicy")
  private String accessPolicy = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("PatternType")
  private String patternType = null;

  @SerializedName("Resource")
  private String resource = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("UserName")
  private String userName = null;

  public AclForDescribeAclsOutput accessPolicy(String accessPolicy) {
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

  public AclForDescribeAclsOutput ip(String ip) {
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

  public AclForDescribeAclsOutput patternType(String patternType) {
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

  public AclForDescribeAclsOutput resource(String resource) {
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

  public AclForDescribeAclsOutput resourceType(String resourceType) {
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

  public AclForDescribeAclsOutput userName(String userName) {
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
    AclForDescribeAclsOutput aclForDescribeAclsOutput = (AclForDescribeAclsOutput) o;
    return Objects.equals(this.accessPolicy, aclForDescribeAclsOutput.accessPolicy) &&
        Objects.equals(this.ip, aclForDescribeAclsOutput.ip) &&
        Objects.equals(this.patternType, aclForDescribeAclsOutput.patternType) &&
        Objects.equals(this.resource, aclForDescribeAclsOutput.resource) &&
        Objects.equals(this.resourceType, aclForDescribeAclsOutput.resourceType) &&
        Objects.equals(this.userName, aclForDescribeAclsOutput.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicy, ip, patternType, resource, resourceType, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AclForDescribeAclsOutput {\n");
    
    sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
