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
 * ScheduledPolicyForDescribeScalingPoliciesOutput
 */


public class ScheduledPolicyForDescribeScalingPoliciesOutput {
  @SerializedName("LaunchTime")
  private String launchTime = null;

  @SerializedName("RecurrenceEndTime")
  private String recurrenceEndTime = null;

  @SerializedName("RecurrenceStartTime")
  private String recurrenceStartTime = null;

  @SerializedName("RecurrenceType")
  private String recurrenceType = null;

  @SerializedName("RecurrenceValue")
  private String recurrenceValue = null;

  public ScheduledPolicyForDescribeScalingPoliciesOutput launchTime(String launchTime) {
    this.launchTime = launchTime;
    return this;
  }

   /**
   * Get launchTime
   * @return launchTime
  **/
  @Schema(description = "")
  public String getLaunchTime() {
    return launchTime;
  }

  public void setLaunchTime(String launchTime) {
    this.launchTime = launchTime;
  }

  public ScheduledPolicyForDescribeScalingPoliciesOutput recurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
    return this;
  }

   /**
   * Get recurrenceEndTime
   * @return recurrenceEndTime
  **/
  @Schema(description = "")
  public String getRecurrenceEndTime() {
    return recurrenceEndTime;
  }

  public void setRecurrenceEndTime(String recurrenceEndTime) {
    this.recurrenceEndTime = recurrenceEndTime;
  }

  public ScheduledPolicyForDescribeScalingPoliciesOutput recurrenceStartTime(String recurrenceStartTime) {
    this.recurrenceStartTime = recurrenceStartTime;
    return this;
  }

   /**
   * Get recurrenceStartTime
   * @return recurrenceStartTime
  **/
  @Schema(description = "")
  public String getRecurrenceStartTime() {
    return recurrenceStartTime;
  }

  public void setRecurrenceStartTime(String recurrenceStartTime) {
    this.recurrenceStartTime = recurrenceStartTime;
  }

  public ScheduledPolicyForDescribeScalingPoliciesOutput recurrenceType(String recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @Schema(description = "")
  public String getRecurrenceType() {
    return recurrenceType;
  }

  public void setRecurrenceType(String recurrenceType) {
    this.recurrenceType = recurrenceType;
  }

  public ScheduledPolicyForDescribeScalingPoliciesOutput recurrenceValue(String recurrenceValue) {
    this.recurrenceValue = recurrenceValue;
    return this;
  }

   /**
   * Get recurrenceValue
   * @return recurrenceValue
  **/
  @Schema(description = "")
  public String getRecurrenceValue() {
    return recurrenceValue;
  }

  public void setRecurrenceValue(String recurrenceValue) {
    this.recurrenceValue = recurrenceValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledPolicyForDescribeScalingPoliciesOutput scheduledPolicyForDescribeScalingPoliciesOutput = (ScheduledPolicyForDescribeScalingPoliciesOutput) o;
    return Objects.equals(this.launchTime, scheduledPolicyForDescribeScalingPoliciesOutput.launchTime) &&
        Objects.equals(this.recurrenceEndTime, scheduledPolicyForDescribeScalingPoliciesOutput.recurrenceEndTime) &&
        Objects.equals(this.recurrenceStartTime, scheduledPolicyForDescribeScalingPoliciesOutput.recurrenceStartTime) &&
        Objects.equals(this.recurrenceType, scheduledPolicyForDescribeScalingPoliciesOutput.recurrenceType) &&
        Objects.equals(this.recurrenceValue, scheduledPolicyForDescribeScalingPoliciesOutput.recurrenceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchTime, recurrenceEndTime, recurrenceStartTime, recurrenceType, recurrenceValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledPolicyForDescribeScalingPoliciesOutput {\n");
    
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    recurrenceEndTime: ").append(toIndentedString(recurrenceEndTime)).append("\n");
    sb.append("    recurrenceStartTime: ").append(toIndentedString(recurrenceStartTime)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrenceValue: ").append(toIndentedString(recurrenceValue)).append("\n");
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
