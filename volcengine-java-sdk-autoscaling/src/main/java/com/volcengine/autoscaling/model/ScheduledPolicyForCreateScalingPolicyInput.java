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
 * ScheduledPolicyForCreateScalingPolicyInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:52.868690+08:00[Asia/Shanghai]")
public class ScheduledPolicyForCreateScalingPolicyInput {
  @SerializedName("LaunchTime")
  private String launchTime = null;

  @SerializedName("RecurrenceEndTime")
  private String recurrenceEndTime = null;

  @SerializedName("RecurrenceType")
  private String recurrenceType = null;

  @SerializedName("RecurrenceValue")
  private String recurrenceValue = null;

  public ScheduledPolicyForCreateScalingPolicyInput launchTime(String launchTime) {
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

  public ScheduledPolicyForCreateScalingPolicyInput recurrenceEndTime(String recurrenceEndTime) {
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

  public ScheduledPolicyForCreateScalingPolicyInput recurrenceType(String recurrenceType) {
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

  public ScheduledPolicyForCreateScalingPolicyInput recurrenceValue(String recurrenceValue) {
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
    ScheduledPolicyForCreateScalingPolicyInput scheduledPolicyForCreateScalingPolicyInput = (ScheduledPolicyForCreateScalingPolicyInput) o;
    return Objects.equals(this.launchTime, scheduledPolicyForCreateScalingPolicyInput.launchTime) &&
        Objects.equals(this.recurrenceEndTime, scheduledPolicyForCreateScalingPolicyInput.recurrenceEndTime) &&
        Objects.equals(this.recurrenceType, scheduledPolicyForCreateScalingPolicyInput.recurrenceType) &&
        Objects.equals(this.recurrenceValue, scheduledPolicyForCreateScalingPolicyInput.recurrenceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchTime, recurrenceEndTime, recurrenceType, recurrenceValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledPolicyForCreateScalingPolicyInput {\n");
    
    sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
    sb.append("    recurrenceEndTime: ").append(toIndentedString(recurrenceEndTime)).append("\n");
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
