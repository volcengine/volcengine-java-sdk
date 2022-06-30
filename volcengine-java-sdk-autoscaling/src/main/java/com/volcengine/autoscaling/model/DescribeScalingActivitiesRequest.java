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
 * DescribeScalingActivitiesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:54:53.055566+08:00[Asia/Shanghai]")
public class DescribeScalingActivitiesRequest {
  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ScalingActivityIds")
  private List<String> scalingActivityIds = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("StatusCode")
  private String statusCode = null;

  public DescribeScalingActivitiesRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DescribeScalingActivitiesRequest pageNumber(Integer pageNumber) {
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

  public DescribeScalingActivitiesRequest pageSize(Integer pageSize) {
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

  public DescribeScalingActivitiesRequest scalingActivityIds(List<String> scalingActivityIds) {
    this.scalingActivityIds = scalingActivityIds;
    return this;
  }

  public DescribeScalingActivitiesRequest addScalingActivityIdsItem(String scalingActivityIdsItem) {
    if (this.scalingActivityIds == null) {
      this.scalingActivityIds = new ArrayList<String>();
    }
    this.scalingActivityIds.add(scalingActivityIdsItem);
    return this;
  }

   /**
   * Get scalingActivityIds
   * @return scalingActivityIds
  **/
  @Schema(description = "")
  public List<String> getScalingActivityIds() {
    return scalingActivityIds;
  }

  public void setScalingActivityIds(List<String> scalingActivityIds) {
    this.scalingActivityIds = scalingActivityIds;
  }

  public DescribeScalingActivitiesRequest scalingGroupId(String scalingGroupId) {
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

  public DescribeScalingActivitiesRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DescribeScalingActivitiesRequest statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(description = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeScalingActivitiesRequest describeScalingActivitiesRequest = (DescribeScalingActivitiesRequest) o;
    return Objects.equals(this.endTime, describeScalingActivitiesRequest.endTime) &&
        Objects.equals(this.pageNumber, describeScalingActivitiesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeScalingActivitiesRequest.pageSize) &&
        Objects.equals(this.scalingActivityIds, describeScalingActivitiesRequest.scalingActivityIds) &&
        Objects.equals(this.scalingGroupId, describeScalingActivitiesRequest.scalingGroupId) &&
        Objects.equals(this.startTime, describeScalingActivitiesRequest.startTime) &&
        Objects.equals(this.statusCode, describeScalingActivitiesRequest.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, pageNumber, pageSize, scalingActivityIds, scalingGroupId, startTime, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeScalingActivitiesRequest {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    scalingActivityIds: ").append(toIndentedString(scalingActivityIds)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
