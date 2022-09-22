/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * DescribeAvailableResourceRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:28.947116+08:00[Asia/Shanghai]")
public class DescribeAvailableResourceRequest {
  @SerializedName("DestinationResource")
  private String destinationResource = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("InstanceTypeId")
  private String instanceTypeId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeAvailableResourceRequest destinationResource(String destinationResource) {
    this.destinationResource = destinationResource;
    return this;
  }

   /**
   * Get destinationResource
   * @return destinationResource
  **/
  @Schema(description = "")
  public String getDestinationResource() {
    return destinationResource;
  }

  public void setDestinationResource(String destinationResource) {
    this.destinationResource = destinationResource;
  }

  public DescribeAvailableResourceRequest instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public DescribeAvailableResourceRequest instanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

   /**
   * Get instanceTypeId
   * @return instanceTypeId
  **/
  @Schema(description = "")
  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public void setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
  }

  public DescribeAvailableResourceRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAvailableResourceRequest describeAvailableResourceRequest = (DescribeAvailableResourceRequest) o;
    return Objects.equals(this.destinationResource, describeAvailableResourceRequest.destinationResource) &&
        Objects.equals(this.instanceType, describeAvailableResourceRequest.instanceType) &&
        Objects.equals(this.instanceTypeId, describeAvailableResourceRequest.instanceTypeId) &&
        Objects.equals(this.zoneId, describeAvailableResourceRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationResource, instanceType, instanceTypeId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAvailableResourceRequest {\n");
    
    sb.append("    destinationResource: ").append(toIndentedString(destinationResource)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceTypeId: ").append(toIndentedString(instanceTypeId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
