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
import com.volcengine.autoscaling.model.AlarmPolicyForCreateScalingPolicyInput;
import com.volcengine.autoscaling.model.ScheduledPolicyForCreateScalingPolicyInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateScalingPolicyRequest
 */


public class CreateScalingPolicyRequest {
  @SerializedName("AdjustmentType")
  private String adjustmentType = null;

  @SerializedName("AdjustmentValue")
  private Integer adjustmentValue = null;

  @SerializedName("AlarmPolicy")
  private AlarmPolicyForCreateScalingPolicyInput alarmPolicy = null;

  @SerializedName("Cooldown")
  private Integer cooldown = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("ScalingPolicyName")
  private String scalingPolicyName = null;

  @SerializedName("ScalingPolicyType")
  private String scalingPolicyType = null;

  @SerializedName("ScheduledPolicy")
  private ScheduledPolicyForCreateScalingPolicyInput scheduledPolicy = null;

  public CreateScalingPolicyRequest adjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
    return this;
  }

   /**
   * Get adjustmentType
   * @return adjustmentType
  **/
  @Schema(description = "")
  public String getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  public CreateScalingPolicyRequest adjustmentValue(Integer adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
    return this;
  }

   /**
   * Get adjustmentValue
   * @return adjustmentValue
  **/
  @Schema(description = "")
  public Integer getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(Integer adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  public CreateScalingPolicyRequest alarmPolicy(AlarmPolicyForCreateScalingPolicyInput alarmPolicy) {
    this.alarmPolicy = alarmPolicy;
    return this;
  }

   /**
   * Get alarmPolicy
   * @return alarmPolicy
  **/
  @Valid
  @Schema(description = "")
  public AlarmPolicyForCreateScalingPolicyInput getAlarmPolicy() {
    return alarmPolicy;
  }

  public void setAlarmPolicy(AlarmPolicyForCreateScalingPolicyInput alarmPolicy) {
    this.alarmPolicy = alarmPolicy;
  }

  public CreateScalingPolicyRequest cooldown(Integer cooldown) {
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

  public CreateScalingPolicyRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }

  public CreateScalingPolicyRequest scalingPolicyName(String scalingPolicyName) {
    this.scalingPolicyName = scalingPolicyName;
    return this;
  }

   /**
   * Get scalingPolicyName
   * @return scalingPolicyName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getScalingPolicyName() {
    return scalingPolicyName;
  }

  public void setScalingPolicyName(String scalingPolicyName) {
    this.scalingPolicyName = scalingPolicyName;
  }

  public CreateScalingPolicyRequest scalingPolicyType(String scalingPolicyType) {
    this.scalingPolicyType = scalingPolicyType;
    return this;
  }

   /**
   * Get scalingPolicyType
   * @return scalingPolicyType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getScalingPolicyType() {
    return scalingPolicyType;
  }

  public void setScalingPolicyType(String scalingPolicyType) {
    this.scalingPolicyType = scalingPolicyType;
  }

  public CreateScalingPolicyRequest scheduledPolicy(ScheduledPolicyForCreateScalingPolicyInput scheduledPolicy) {
    this.scheduledPolicy = scheduledPolicy;
    return this;
  }

   /**
   * Get scheduledPolicy
   * @return scheduledPolicy
  **/
  @Valid
  @Schema(description = "")
  public ScheduledPolicyForCreateScalingPolicyInput getScheduledPolicy() {
    return scheduledPolicy;
  }

  public void setScheduledPolicy(ScheduledPolicyForCreateScalingPolicyInput scheduledPolicy) {
    this.scheduledPolicy = scheduledPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScalingPolicyRequest createScalingPolicyRequest = (CreateScalingPolicyRequest) o;
    return Objects.equals(this.adjustmentType, createScalingPolicyRequest.adjustmentType) &&
        Objects.equals(this.adjustmentValue, createScalingPolicyRequest.adjustmentValue) &&
        Objects.equals(this.alarmPolicy, createScalingPolicyRequest.alarmPolicy) &&
        Objects.equals(this.cooldown, createScalingPolicyRequest.cooldown) &&
        Objects.equals(this.scalingGroupId, createScalingPolicyRequest.scalingGroupId) &&
        Objects.equals(this.scalingPolicyName, createScalingPolicyRequest.scalingPolicyName) &&
        Objects.equals(this.scalingPolicyType, createScalingPolicyRequest.scalingPolicyType) &&
        Objects.equals(this.scheduledPolicy, createScalingPolicyRequest.scheduledPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentType, adjustmentValue, alarmPolicy, cooldown, scalingGroupId, scalingPolicyName, scalingPolicyType, scheduledPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScalingPolicyRequest {\n");
    
    sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
    sb.append("    adjustmentValue: ").append(toIndentedString(adjustmentValue)).append("\n");
    sb.append("    alarmPolicy: ").append(toIndentedString(alarmPolicy)).append("\n");
    sb.append("    cooldown: ").append(toIndentedString(cooldown)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    scalingPolicyName: ").append(toIndentedString(scalingPolicyName)).append("\n");
    sb.append("    scalingPolicyType: ").append(toIndentedString(scalingPolicyType)).append("\n");
    sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
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
