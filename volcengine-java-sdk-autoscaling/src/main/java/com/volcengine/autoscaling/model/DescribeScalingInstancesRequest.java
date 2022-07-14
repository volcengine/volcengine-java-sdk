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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeScalingInstancesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:44.255986+08:00[Asia/Shanghai]")
public class DescribeScalingInstancesRequest {
  @SerializedName("CreationType")
  private String creationType = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ScalingConfigurationId")
  private String scalingConfigurationId = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("Status")
  private String status = null;

  public DescribeScalingInstancesRequest creationType(String creationType) {
    this.creationType = creationType;
    return this;
  }

   /**
   * Get creationType
   * @return creationType
  **/
  @Schema(description = "")
  public String getCreationType() {
    return creationType;
  }

  public void setCreationType(String creationType) {
    this.creationType = creationType;
  }

  public DescribeScalingInstancesRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public DescribeScalingInstancesRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public DescribeScalingInstancesRequest pageNumber(Integer pageNumber) {
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

  public DescribeScalingInstancesRequest pageSize(Integer pageSize) {
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

  public DescribeScalingInstancesRequest scalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
    return this;
  }

   /**
   * Get scalingConfigurationId
   * @return scalingConfigurationId
  **/
  @Schema(description = "")
  public String getScalingConfigurationId() {
    return scalingConfigurationId;
  }

  public void setScalingConfigurationId(String scalingConfigurationId) {
    this.scalingConfigurationId = scalingConfigurationId;
  }

  public DescribeScalingInstancesRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @Schema(description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }

  public DescribeScalingInstancesRequest status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeScalingInstancesRequest describeScalingInstancesRequest = (DescribeScalingInstancesRequest) o;
    return Objects.equals(this.creationType, describeScalingInstancesRequest.creationType) &&
        Objects.equals(this.instanceIds, describeScalingInstancesRequest.instanceIds) &&
        Objects.equals(this.pageNumber, describeScalingInstancesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeScalingInstancesRequest.pageSize) &&
        Objects.equals(this.scalingConfigurationId, describeScalingInstancesRequest.scalingConfigurationId) &&
        Objects.equals(this.scalingGroupId, describeScalingInstancesRequest.scalingGroupId) &&
        Objects.equals(this.status, describeScalingInstancesRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationType, instanceIds, pageNumber, pageSize, scalingConfigurationId, scalingGroupId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeScalingInstancesRequest {\n");
    
    sb.append("    creationType: ").append(toIndentedString(creationType)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
