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
 * InstanceTypeOverrideForCreateScalingConfigurationInput
 */


public class InstanceTypeOverrideForCreateScalingConfigurationInput {
  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("PriceLimit")
  private Float priceLimit = null;

  public InstanceTypeOverrideForCreateScalingConfigurationInput instanceType(String instanceType) {
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

  public InstanceTypeOverrideForCreateScalingConfigurationInput priceLimit(Float priceLimit) {
    this.priceLimit = priceLimit;
    return this;
  }

   /**
   * Get priceLimit
   * @return priceLimit
  **/
  @Schema(description = "")
  public Float getPriceLimit() {
    return priceLimit;
  }

  public void setPriceLimit(Float priceLimit) {
    this.priceLimit = priceLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTypeOverrideForCreateScalingConfigurationInput instanceTypeOverrideForCreateScalingConfigurationInput = (InstanceTypeOverrideForCreateScalingConfigurationInput) o;
    return Objects.equals(this.instanceType, instanceTypeOverrideForCreateScalingConfigurationInput.instanceType) &&
        Objects.equals(this.priceLimit, instanceTypeOverrideForCreateScalingConfigurationInput.priceLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, priceLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTypeOverrideForCreateScalingConfigurationInput {\n");
    
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    priceLimit: ").append(toIndentedString(priceLimit)).append("\n");
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
