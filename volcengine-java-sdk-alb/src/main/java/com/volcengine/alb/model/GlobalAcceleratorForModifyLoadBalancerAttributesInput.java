/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * GlobalAcceleratorForModifyLoadBalancerAttributesInput
 */



public class GlobalAcceleratorForModifyLoadBalancerAttributesInput {
  @SerializedName("AcceleratorId")
  private String acceleratorId = null;

  @SerializedName("AcceleratorListenerId")
  private String acceleratorListenerId = null;

  @SerializedName("EndpointGroupId")
  private String endpointGroupId = null;

  @SerializedName("Weight")
  private Integer weight = null;

  public GlobalAcceleratorForModifyLoadBalancerAttributesInput acceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
    return this;
  }

   /**
   * Get acceleratorId
   * @return acceleratorId
  **/
  @Schema(description = "")
  public String getAcceleratorId() {
    return acceleratorId;
  }

  public void setAcceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
  }

  public GlobalAcceleratorForModifyLoadBalancerAttributesInput acceleratorListenerId(String acceleratorListenerId) {
    this.acceleratorListenerId = acceleratorListenerId;
    return this;
  }

   /**
   * Get acceleratorListenerId
   * @return acceleratorListenerId
  **/
  @Schema(description = "")
  public String getAcceleratorListenerId() {
    return acceleratorListenerId;
  }

  public void setAcceleratorListenerId(String acceleratorListenerId) {
    this.acceleratorListenerId = acceleratorListenerId;
  }

  public GlobalAcceleratorForModifyLoadBalancerAttributesInput endpointGroupId(String endpointGroupId) {
    this.endpointGroupId = endpointGroupId;
    return this;
  }

   /**
   * Get endpointGroupId
   * @return endpointGroupId
  **/
  @Schema(description = "")
  public String getEndpointGroupId() {
    return endpointGroupId;
  }

  public void setEndpointGroupId(String endpointGroupId) {
    this.endpointGroupId = endpointGroupId;
  }

  public GlobalAcceleratorForModifyLoadBalancerAttributesInput weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalAcceleratorForModifyLoadBalancerAttributesInput globalAcceleratorForModifyLoadBalancerAttributesInput = (GlobalAcceleratorForModifyLoadBalancerAttributesInput) o;
    return Objects.equals(this.acceleratorId, globalAcceleratorForModifyLoadBalancerAttributesInput.acceleratorId) &&
        Objects.equals(this.acceleratorListenerId, globalAcceleratorForModifyLoadBalancerAttributesInput.acceleratorListenerId) &&
        Objects.equals(this.endpointGroupId, globalAcceleratorForModifyLoadBalancerAttributesInput.endpointGroupId) &&
        Objects.equals(this.weight, globalAcceleratorForModifyLoadBalancerAttributesInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratorId, acceleratorListenerId, endpointGroupId, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalAcceleratorForModifyLoadBalancerAttributesInput {\n");
    
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    acceleratorListenerId: ").append(toIndentedString(acceleratorListenerId)).append("\n");
    sb.append("    endpointGroupId: ").append(toIndentedString(endpointGroupId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
