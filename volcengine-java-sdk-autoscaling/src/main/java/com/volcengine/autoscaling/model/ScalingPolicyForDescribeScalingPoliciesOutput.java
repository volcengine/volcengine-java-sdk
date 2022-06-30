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
import com.volcengine.autoscaling.model.AlarmPolicyForDescribeScalingPoliciesOutput;
import com.volcengine.autoscaling.model.ScheduledPolicyForDescribeScalingPoliciesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScalingPolicyForDescribeScalingPoliciesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class ScalingPolicyForDescribeScalingPoliciesOutput {
  @SerializedName("AdjustmentType")
  private String adjustmentType = null;

  @SerializedName("AdjustmentValue")
  private Integer adjustmentValue = null;

  @SerializedName("AlarmId")
  private String alarmId = null;

  @SerializedName("AlarmPolicy")
  private AlarmPolicyForDescribeScalingPoliciesOutput alarmPolicy = null;

  @SerializedName("Cooldown")
  private Integer cooldown = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  @SerializedName("ScalingPolicyId")
  private String scalingPolicyId = null;

  @SerializedName("ScalingPolicyName")
  private String scalingPolicyName = null;

  @SerializedName("ScalingPolicyType")
  private String scalingPolicyType = null;

  @SerializedName("ScheduledPolicy")
  private ScheduledPolicyForDescribeScalingPoliciesOutput scheduledPolicy = null;

  @SerializedName("Status")
  private String status = null;

  public ScalingPolicyForDescribeScalingPoliciesOutput adjustmentType(String adjustmentType) {
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

  public ScalingPolicyForDescribeScalingPoliciesOutput adjustmentValue(Integer adjustmentValue) {
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

  public ScalingPolicyForDescribeScalingPoliciesOutput alarmId(String alarmId) {
    this.alarmId = alarmId;
    return this;
  }

   /**
   * Get alarmId
   * @return alarmId
  **/
  @Schema(description = "")
  public String getAlarmId() {
    return alarmId;
  }

  public void setAlarmId(String alarmId) {
    this.alarmId = alarmId;
  }

  public ScalingPolicyForDescribeScalingPoliciesOutput alarmPolicy(AlarmPolicyForDescribeScalingPoliciesOutput alarmPolicy) {
    this.alarmPolicy = alarmPolicy;
    return this;
  }

   /**
   * Get alarmPolicy
   * @return alarmPolicy
  **/
  @Valid
  @Schema(description = "")
  public AlarmPolicyForDescribeScalingPoliciesOutput getAlarmPolicy() {
    return alarmPolicy;
  }

  public void setAlarmPolicy(AlarmPolicyForDescribeScalingPoliciesOutput alarmPolicy) {
    this.alarmPolicy = alarmPolicy;
  }

  public ScalingPolicyForDescribeScalingPoliciesOutput cooldown(Integer cooldown) {
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

  public ScalingPolicyForDescribeScalingPoliciesOutput scalingGroupId(String scalingGroupId) {
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

  public ScalingPolicyForDescribeScalingPoliciesOutput scalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
    return this;
  }

   /**
   * Get scalingPolicyId
   * @return scalingPolicyId
  **/
  @Schema(description = "")
  public String getScalingPolicyId() {
    return scalingPolicyId;
  }

  public void setScalingPolicyId(String scalingPolicyId) {
    this.scalingPolicyId = scalingPolicyId;
  }

  public ScalingPolicyForDescribeScalingPoliciesOutput scalingPolicyName(String scalingPolicyName) {
    this.scalingPolicyName = scalingPolicyName;
    return this;
  }

   /**
   * Get scalingPolicyName
   * @return scalingPolicyName
  **/
  @Schema(description = "")
  public String getScalingPolicyName() {
    return scalingPolicyName;
  }

  public void setScalingPolicyName(String scalingPolicyName) {
    this.scalingPolicyName = scalingPolicyName;
  }

  public ScalingPolicyForDescribeScalingPoliciesOutput scalingPolicyType(String scalingPolicyType) {
    this.scalingPolicyType = scalingPolicyType;
    return this;
  }

   /**
   * Get scalingPolicyType
   * @return scalingPolicyType
  **/
  @Schema(description = "")
  public String getScalingPolicyType() {
    return scalingPolicyType;
  }

  public void setScalingPolicyType(String scalingPolicyType) {
    this.scalingPolicyType = scalingPolicyType;
  }

  public ScalingPolicyForDescribeScalingPoliciesOutput scheduledPolicy(ScheduledPolicyForDescribeScalingPoliciesOutput scheduledPolicy) {
    this.scheduledPolicy = scheduledPolicy;
    return this;
  }

   /**
   * Get scheduledPolicy
   * @return scheduledPolicy
  **/
  @Valid
  @Schema(description = "")
  public ScheduledPolicyForDescribeScalingPoliciesOutput getScheduledPolicy() {
    return scheduledPolicy;
  }

  public void setScheduledPolicy(ScheduledPolicyForDescribeScalingPoliciesOutput scheduledPolicy) {
    this.scheduledPolicy = scheduledPolicy;
  }

  public ScalingPolicyForDescribeScalingPoliciesOutput status(String status) {
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
    ScalingPolicyForDescribeScalingPoliciesOutput scalingPolicyForDescribeScalingPoliciesOutput = (ScalingPolicyForDescribeScalingPoliciesOutput) o;
    return Objects.equals(this.adjustmentType, scalingPolicyForDescribeScalingPoliciesOutput.adjustmentType) &&
        Objects.equals(this.adjustmentValue, scalingPolicyForDescribeScalingPoliciesOutput.adjustmentValue) &&
        Objects.equals(this.alarmId, scalingPolicyForDescribeScalingPoliciesOutput.alarmId) &&
        Objects.equals(this.alarmPolicy, scalingPolicyForDescribeScalingPoliciesOutput.alarmPolicy) &&
        Objects.equals(this.cooldown, scalingPolicyForDescribeScalingPoliciesOutput.cooldown) &&
        Objects.equals(this.scalingGroupId, scalingPolicyForDescribeScalingPoliciesOutput.scalingGroupId) &&
        Objects.equals(this.scalingPolicyId, scalingPolicyForDescribeScalingPoliciesOutput.scalingPolicyId) &&
        Objects.equals(this.scalingPolicyName, scalingPolicyForDescribeScalingPoliciesOutput.scalingPolicyName) &&
        Objects.equals(this.scalingPolicyType, scalingPolicyForDescribeScalingPoliciesOutput.scalingPolicyType) &&
        Objects.equals(this.scheduledPolicy, scalingPolicyForDescribeScalingPoliciesOutput.scheduledPolicy) &&
        Objects.equals(this.status, scalingPolicyForDescribeScalingPoliciesOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentType, adjustmentValue, alarmId, alarmPolicy, cooldown, scalingGroupId, scalingPolicyId, scalingPolicyName, scalingPolicyType, scheduledPolicy, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalingPolicyForDescribeScalingPoliciesOutput {\n");
    
    sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
    sb.append("    adjustmentValue: ").append(toIndentedString(adjustmentValue)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    alarmPolicy: ").append(toIndentedString(alarmPolicy)).append("\n");
    sb.append("    cooldown: ").append(toIndentedString(cooldown)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
    sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
    sb.append("    scalingPolicyName: ").append(toIndentedString(scalingPolicyName)).append("\n");
    sb.append("    scalingPolicyType: ").append(toIndentedString(scalingPolicyType)).append("\n");
    sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
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