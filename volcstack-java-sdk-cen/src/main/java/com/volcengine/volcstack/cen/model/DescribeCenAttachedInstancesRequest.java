/*
 * cen
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.cen.model;

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
 * DescribeCenAttachedInstancesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:17.092992+08:00[Asia/Shanghai]")
public class DescribeCenAttachedInstancesRequest {
  @SerializedName("CenId")
  private String cenId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceRegionId")
  private String instanceRegionId = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeCenAttachedInstancesRequest cenId(String cenId) {
    this.cenId = cenId;
    return this;
  }

   /**
   * Get cenId
   * @return cenId
  **/
  @Schema(description = "")
  public String getCenId() {
    return cenId;
  }

  public void setCenId(String cenId) {
    this.cenId = cenId;
  }

  public DescribeCenAttachedInstancesRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeCenAttachedInstancesRequest instanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
    return this;
  }

   /**
   * Get instanceRegionId
   * @return instanceRegionId
  **/
  @Schema(description = "")
  public String getInstanceRegionId() {
    return instanceRegionId;
  }

  public void setInstanceRegionId(String instanceRegionId) {
    this.instanceRegionId = instanceRegionId;
  }

  public DescribeCenAttachedInstancesRequest instanceType(String instanceType) {
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

  public DescribeCenAttachedInstancesRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeCenAttachedInstancesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeCenAttachedInstancesRequest describeCenAttachedInstancesRequest = (DescribeCenAttachedInstancesRequest) o;
    return Objects.equals(this.cenId, describeCenAttachedInstancesRequest.cenId) &&
        Objects.equals(this.instanceId, describeCenAttachedInstancesRequest.instanceId) &&
        Objects.equals(this.instanceRegionId, describeCenAttachedInstancesRequest.instanceRegionId) &&
        Objects.equals(this.instanceType, describeCenAttachedInstancesRequest.instanceType) &&
        Objects.equals(this.pageNumber, describeCenAttachedInstancesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeCenAttachedInstancesRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cenId, instanceId, instanceRegionId, instanceType, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeCenAttachedInstancesRequest {\n");
    
    sb.append("    cenId: ").append(toIndentedString(cenId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceRegionId: ").append(toIndentedString(instanceRegionId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
