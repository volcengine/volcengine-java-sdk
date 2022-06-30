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
 * LifecycleActivityForDescribeLifecycleActivitiesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:54:53.055566+08:00[Asia/Shanghai]")
public class LifecycleActivityForDescribeLifecycleActivitiesOutput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("LifecycleActivityId")
  private String lifecycleActivityId = null;

  @SerializedName("LifecycleActivityStatus")
  private String lifecycleActivityStatus = null;

  @SerializedName("LifecycleHookId")
  private String lifecycleHookId = null;

  @SerializedName("LifecycleHookPolicy")
  private String lifecycleHookPolicy = null;

  @SerializedName("ScalingActivityId")
  private String scalingActivityId = null;

  public LifecycleActivityForDescribeLifecycleActivitiesOutput instanceId(String instanceId) {
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

  public LifecycleActivityForDescribeLifecycleActivitiesOutput lifecycleActivityId(String lifecycleActivityId) {
    this.lifecycleActivityId = lifecycleActivityId;
    return this;
  }

   /**
   * Get lifecycleActivityId
   * @return lifecycleActivityId
  **/
  @Schema(description = "")
  public String getLifecycleActivityId() {
    return lifecycleActivityId;
  }

  public void setLifecycleActivityId(String lifecycleActivityId) {
    this.lifecycleActivityId = lifecycleActivityId;
  }

  public LifecycleActivityForDescribeLifecycleActivitiesOutput lifecycleActivityStatus(String lifecycleActivityStatus) {
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

  public LifecycleActivityForDescribeLifecycleActivitiesOutput lifecycleHookId(String lifecycleHookId) {
    this.lifecycleHookId = lifecycleHookId;
    return this;
  }

   /**
   * Get lifecycleHookId
   * @return lifecycleHookId
  **/
  @Schema(description = "")
  public String getLifecycleHookId() {
    return lifecycleHookId;
  }

  public void setLifecycleHookId(String lifecycleHookId) {
    this.lifecycleHookId = lifecycleHookId;
  }

  public LifecycleActivityForDescribeLifecycleActivitiesOutput lifecycleHookPolicy(String lifecycleHookPolicy) {
    this.lifecycleHookPolicy = lifecycleHookPolicy;
    return this;
  }

   /**
   * Get lifecycleHookPolicy
   * @return lifecycleHookPolicy
  **/
  @Schema(description = "")
  public String getLifecycleHookPolicy() {
    return lifecycleHookPolicy;
  }

  public void setLifecycleHookPolicy(String lifecycleHookPolicy) {
    this.lifecycleHookPolicy = lifecycleHookPolicy;
  }

  public LifecycleActivityForDescribeLifecycleActivitiesOutput scalingActivityId(String scalingActivityId) {
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
    LifecycleActivityForDescribeLifecycleActivitiesOutput lifecycleActivityForDescribeLifecycleActivitiesOutput = (LifecycleActivityForDescribeLifecycleActivitiesOutput) o;
    return Objects.equals(this.instanceId, lifecycleActivityForDescribeLifecycleActivitiesOutput.instanceId) &&
        Objects.equals(this.lifecycleActivityId, lifecycleActivityForDescribeLifecycleActivitiesOutput.lifecycleActivityId) &&
        Objects.equals(this.lifecycleActivityStatus, lifecycleActivityForDescribeLifecycleActivitiesOutput.lifecycleActivityStatus) &&
        Objects.equals(this.lifecycleHookId, lifecycleActivityForDescribeLifecycleActivitiesOutput.lifecycleHookId) &&
        Objects.equals(this.lifecycleHookPolicy, lifecycleActivityForDescribeLifecycleActivitiesOutput.lifecycleHookPolicy) &&
        Objects.equals(this.scalingActivityId, lifecycleActivityForDescribeLifecycleActivitiesOutput.scalingActivityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, lifecycleActivityId, lifecycleActivityStatus, lifecycleHookId, lifecycleHookPolicy, scalingActivityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleActivityForDescribeLifecycleActivitiesOutput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    lifecycleActivityId: ").append(toIndentedString(lifecycleActivityId)).append("\n");
    sb.append("    lifecycleActivityStatus: ").append(toIndentedString(lifecycleActivityStatus)).append("\n");
    sb.append("    lifecycleHookId: ").append(toIndentedString(lifecycleHookId)).append("\n");
    sb.append("    lifecycleHookPolicy: ").append(toIndentedString(lifecycleHookPolicy)).append("\n");
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
