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
 * ZoneMappingForModifyLoadBalancerTypeInput
 */



public class ZoneMappingForModifyLoadBalancerTypeInput {
  @SerializedName("AllocationId")
  private String allocationId = null;

  @SerializedName("EipType")
  private String eipType = null;

  @SerializedName("PopLocations")
  private String popLocations = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ZoneMappingForModifyLoadBalancerTypeInput allocationId(String allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @Schema(description = "")
  public String getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(String allocationId) {
    this.allocationId = allocationId;
  }

  public ZoneMappingForModifyLoadBalancerTypeInput eipType(String eipType) {
    this.eipType = eipType;
    return this;
  }

   /**
   * Get eipType
   * @return eipType
  **/
  @Schema(description = "")
  public String getEipType() {
    return eipType;
  }

  public void setEipType(String eipType) {
    this.eipType = eipType;
  }

  public ZoneMappingForModifyLoadBalancerTypeInput popLocations(String popLocations) {
    this.popLocations = popLocations;
    return this;
  }

   /**
   * Get popLocations
   * @return popLocations
  **/
  @Schema(description = "")
  public String getPopLocations() {
    return popLocations;
  }

  public void setPopLocations(String popLocations) {
    this.popLocations = popLocations;
  }

  public ZoneMappingForModifyLoadBalancerTypeInput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneMappingForModifyLoadBalancerTypeInput zoneMappingForModifyLoadBalancerTypeInput = (ZoneMappingForModifyLoadBalancerTypeInput) o;
    return Objects.equals(this.allocationId, zoneMappingForModifyLoadBalancerTypeInput.allocationId) &&
        Objects.equals(this.eipType, zoneMappingForModifyLoadBalancerTypeInput.eipType) &&
        Objects.equals(this.popLocations, zoneMappingForModifyLoadBalancerTypeInput.popLocations) &&
        Objects.equals(this.zoneId, zoneMappingForModifyLoadBalancerTypeInput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, eipType, popLocations, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneMappingForModifyLoadBalancerTypeInput {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    eipType: ").append(toIndentedString(eipType)).append("\n");
    sb.append("    popLocations: ").append(toIndentedString(popLocations)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
