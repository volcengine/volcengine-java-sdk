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
import com.volcengine.autoscaling.model.RelatedInstanceForDescribeScalingActivitiesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScalingActivityForDescribeScalingActivitiesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:54:53.055566+08:00[Asia/Shanghai]")
public class ScalingActivityForDescribeScalingActivitiesOutput {
  @SerializedName("ActivityType")
  private String activityType = null;

  @SerializedName("ActualAdjustInstanceNumber")
  private Integer actualAdjustInstanceNumber = null;

  @SerializedName("Cooldown")
  private Integer cooldown = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("CurrentInstanceNumber")
  private Integer currentInstanceNumber = null;

  @SerializedName("ExpectedRunTime")
  private String expectedRunTime = null;

  @SerializedName("MaxInstanceNumber")
  private Integer maxInstanceNumber = null;

  @SerializedName("MinInstanceNumber")
  private Integer minInstanceNumber = null;

  @SerializedName("RelatedInstances")
  private List<RelatedInstanceForDescribeScalingActivitiesOutput> relatedInstances = null;

  @SerializedName("ResultMsg")
  private String resultMsg = null;

  @SerializedName("ScalingActivityId")
  private String scalingActivityId = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("StatusCode")
  private String statusCode = null;

  @SerializedName("StoppedAt")
  private String stoppedAt = null;

  @SerializedName("TaskCategory")
  private String taskCategory = null;

  public ScalingActivityForDescribeScalingActivitiesOutput activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @Schema(description = "")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput actualAdjustInstanceNumber(Integer actualAdjustInstanceNumber) {
    this.actualAdjustInstanceNumber = actualAdjustInstanceNumber;
    return this;
  }

   /**
   * Get actualAdjustInstanceNumber
   * @return actualAdjustInstanceNumber
  **/
  @Schema(description = "")
  public Integer getActualAdjustInstanceNumber() {
    return actualAdjustInstanceNumber;
  }

  public void setActualAdjustInstanceNumber(Integer actualAdjustInstanceNumber) {
    this.actualAdjustInstanceNumber = actualAdjustInstanceNumber;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput cooldown(Integer cooldown) {
    this.cooldown = cooldown;
    return this;
  }

   /**
   * Get cooldown
   * @return cooldown
  **/
  @Schema(description = "")
  public Integer getCooldown() {
    return cooldown;
  }

  public void setCooldown(Integer cooldown) {
    this.cooldown = cooldown;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput currentInstanceNumber(Integer currentInstanceNumber) {
    this.currentInstanceNumber = currentInstanceNumber;
    return this;
  }

   /**
   * Get currentInstanceNumber
   * @return currentInstanceNumber
  **/
  @Schema(description = "")
  public Integer getCurrentInstanceNumber() {
    return currentInstanceNumber;
  }

  public void setCurrentInstanceNumber(Integer currentInstanceNumber) {
    this.currentInstanceNumber = currentInstanceNumber;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput expectedRunTime(String expectedRunTime) {
    this.expectedRunTime = expectedRunTime;
    return this;
  }

   /**
   * Get expectedRunTime
   * @return expectedRunTime
  **/
  @Schema(description = "")
  public String getExpectedRunTime() {
    return expectedRunTime;
  }

  public void setExpectedRunTime(String expectedRunTime) {
    this.expectedRunTime = expectedRunTime;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput maxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
    return this;
  }

   /**
   * Get maxInstanceNumber
   * @return maxInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMaxInstanceNumber() {
    return maxInstanceNumber;
  }

  public void setMaxInstanceNumber(Integer maxInstanceNumber) {
    this.maxInstanceNumber = maxInstanceNumber;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput minInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
    return this;
  }

   /**
   * Get minInstanceNumber
   * @return minInstanceNumber
  **/
  @Schema(description = "")
  public Integer getMinInstanceNumber() {
    return minInstanceNumber;
  }

  public void setMinInstanceNumber(Integer minInstanceNumber) {
    this.minInstanceNumber = minInstanceNumber;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput relatedInstances(List<RelatedInstanceForDescribeScalingActivitiesOutput> relatedInstances) {
    this.relatedInstances = relatedInstances;
    return this;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput addRelatedInstancesItem(RelatedInstanceForDescribeScalingActivitiesOutput relatedInstancesItem) {
    if (this.relatedInstances == null) {
      this.relatedInstances = new ArrayList<RelatedInstanceForDescribeScalingActivitiesOutput>();
    }
    this.relatedInstances.add(relatedInstancesItem);
    return this;
  }

   /**
   * Get relatedInstances
   * @return relatedInstances
  **/
  @Valid
  @Schema(description = "")
  public List<RelatedInstanceForDescribeScalingActivitiesOutput> getRelatedInstances() {
    return relatedInstances;
  }

  public void setRelatedInstances(List<RelatedInstanceForDescribeScalingActivitiesOutput> relatedInstances) {
    this.relatedInstances = relatedInstances;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput resultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
    return this;
  }

   /**
   * Get resultMsg
   * @return resultMsg
  **/
  @Schema(description = "")
  public String getResultMsg() {
    return resultMsg;
  }

  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput scalingActivityId(String scalingActivityId) {
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

  public ScalingActivityForDescribeScalingActivitiesOutput scalingGroupId(String scalingGroupId) {
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

  public ScalingActivityForDescribeScalingActivitiesOutput statusCode(String statusCode) {
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

  public ScalingActivityForDescribeScalingActivitiesOutput stoppedAt(String stoppedAt) {
    this.stoppedAt = stoppedAt;
    return this;
  }

   /**
   * Get stoppedAt
   * @return stoppedAt
  **/
  @Schema(description = "")
  public String getStoppedAt() {
    return stoppedAt;
  }

  public void setStoppedAt(String stoppedAt) {
    this.stoppedAt = stoppedAt;
  }

  public ScalingActivityForDescribeScalingActivitiesOutput taskCategory(String taskCategory) {
    this.taskCategory = taskCategory;
    return this;
  }

   /**
   * Get taskCategory
   * @return taskCategory
  **/
  @Schema(description = "")
  public String getTaskCategory() {
    return taskCategory;
  }

  public void setTaskCategory(String taskCategory) {
    this.taskCategory = taskCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalingActivityForDescribeScalingActivitiesOutput scalingActivityForDescribeScalingActivitiesOutput = (ScalingActivityForDescribeScalingActivitiesOutput) o;
    return Objects.equals(this.activityType, scalingActivityForDescribeScalingActivitiesOutput.activityType) &&
        Objects.equals(this.actualAdjustInstanceNumber, scalingActivityForDescribeScalingActivitiesOutput.actualAdjustInstanceNumber) &&
        Objects.equals(this.cooldown, scalingActivityForDescribeScalingActivitiesOutput.cooldown) &&
        Objects.equals(this.createdAt, scalingActivityForDescribeScalingActivitiesOutput.createdAt) &&
        Objects.equals(this.currentInstanceNumber, scalingActivityForDescribeScalingActivitiesOutput.currentInstanceNumber) &&
        Objects.equals(this.expectedRunTime, scalingActivityForDescribeScalingActivitiesOutput.expectedRunTime) &&
        Objects.equals(this.maxInstanceNumber, scalingActivityForDescribeScalingActivitiesOutput.maxInstanceNumber) &&
        Objects.equals(this.minInstanceNumber, scalingActivityForDescribeScalingActivitiesOutput.minInstanceNumber) &&
        Objects.equals(this.relatedInstances, scalingActivityForDescribeScalingActivitiesOutput.relatedInstances) &&
        Objects.equals(this.resultMsg, scalingActivityForDescribeScalingActivitiesOutput.resultMsg) &&
        Objects.equals(this.scalingActivityId, scalingActivityForDescribeScalingActivitiesOutput.scalingActivityId) &&
        Objects.equals(this.scalingGroupId, scalingActivityForDescribeScalingActivitiesOutput.scalingGroupId) &&
        Objects.equals(this.statusCode, scalingActivityForDescribeScalingActivitiesOutput.statusCode) &&
        Objects.equals(this.stoppedAt, scalingActivityForDescribeScalingActivitiesOutput.stoppedAt) &&
        Objects.equals(this.taskCategory, scalingActivityForDescribeScalingActivitiesOutput.taskCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityType, actualAdjustInstanceNumber, cooldown, createdAt, currentInstanceNumber, expectedRunTime, maxInstanceNumber, minInstanceNumber, relatedInstances, resultMsg, scalingActivityId, scalingGroupId, statusCode, stoppedAt, taskCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalingActivityForDescribeScalingActivitiesOutput {\n");
    
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    actualAdjustInstanceNumber: ").append(toIndentedString(actualAdjustInstanceNumber)).append("\n");
    sb.append("    cooldown: ").append(toIndentedString(cooldown)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentInstanceNumber: ").append(toIndentedString(currentInstanceNumber)).append("\n");
    sb.append("    expectedRunTime: ").append(toIndentedString(expectedRunTime)).append("\n");
    sb.append("    maxInstanceNumber: ").append(toIndentedString(maxInstanceNumber)).append("\n");
    sb.append("    minInstanceNumber: ").append(toIndentedString(minInstanceNumber)).append("\n");
    sb.append("    relatedInstances: ").append(toIndentedString(relatedInstances)).append("\n");
    sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
    sb.append("    scalingActivityId: ").append(toIndentedString(scalingActivityId)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    stoppedAt: ").append(toIndentedString(stoppedAt)).append("\n");
    sb.append("    taskCategory: ").append(toIndentedString(taskCategory)).append("\n");
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
