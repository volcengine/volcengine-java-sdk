/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * DescribeLifecycleActivitiesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class DescribeLifecycleActivitiesRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("LifecycleActivityStatus")
  private String lifecycleActivityStatus = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ScalingActivityId")
  private String scalingActivityId = null;

  public DescribeLifecycleActivitiesRequest instanceId(String instanceId) {
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

  public DescribeLifecycleActivitiesRequest lifecycleActivityStatus(String lifecycleActivityStatus) {
    this.lifecycleActivityStatus = lifecycleActivityStatus;
    return this;
  }

   /**
   * Get lifecycleActivityStatus
   * @return lifecycleActivityStatus
  **/
  @Schema(description = "")
  public String getLifecycleActivityStatus() {
    return lifecycleActivityStatus;
  }

  public void setLifecycleActivityStatus(String lifecycleActivityStatus) {
    this.lifecycleActivityStatus = lifecycleActivityStatus;
  }

  public DescribeLifecycleActivitiesRequest pageNumber(Integer pageNumber) {
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

  public DescribeLifecycleActivitiesRequest pageSize(Integer pageSize) {
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

  public DescribeLifecycleActivitiesRequest scalingActivityId(String scalingActivityId) {
    this.scalingActivityId = scalingActivityId;
    return this;
  }

   /**
   * Get scalingActivityId
   * @return scalingActivityId
  **/
  @Schema(description = "")
  public String getScalingActivityId() {
    return scalingActivityId;
  }

  public void setScalingActivityId(String scalingActivityId) {
    this.scalingActivityId = scalingActivityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeLifecycleActivitiesRequest describeLifecycleActivitiesRequest = (DescribeLifecycleActivitiesRequest) o;
    return Objects.equals(this.instanceId, describeLifecycleActivitiesRequest.instanceId) &&
        Objects.equals(this.lifecycleActivityStatus, describeLifecycleActivitiesRequest.lifecycleActivityStatus) &&
        Objects.equals(this.pageNumber, describeLifecycleActivitiesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeLifecycleActivitiesRequest.pageSize) &&
        Objects.equals(this.scalingActivityId, describeLifecycleActivitiesRequest.scalingActivityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, lifecycleActivityStatus, pageNumber, pageSize, scalingActivityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeLifecycleActivitiesRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    lifecycleActivityStatus: ").append(toIndentedString(lifecycleActivityStatus)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    scalingActivityId: ").append(toIndentedString(scalingActivityId)).append("\n");
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