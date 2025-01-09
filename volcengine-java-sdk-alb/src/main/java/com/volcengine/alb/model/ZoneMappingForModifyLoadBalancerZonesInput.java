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
 * ZoneMappingForModifyLoadBalancerZonesInput
 */



public class ZoneMappingForModifyLoadBalancerZonesInput {
  @SerializedName("AllocationId")
  private String allocationId = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ZoneMappingForModifyLoadBalancerZonesInput allocationId(String allocationId) {
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

  public ZoneMappingForModifyLoadBalancerZonesInput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public ZoneMappingForModifyLoadBalancerZonesInput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    ZoneMappingForModifyLoadBalancerZonesInput zoneMappingForModifyLoadBalancerZonesInput = (ZoneMappingForModifyLoadBalancerZonesInput) o;
    return Objects.equals(this.allocationId, zoneMappingForModifyLoadBalancerZonesInput.allocationId) &&
        Objects.equals(this.subnetId, zoneMappingForModifyLoadBalancerZonesInput.subnetId) &&
        Objects.equals(this.zoneId, zoneMappingForModifyLoadBalancerZonesInput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, subnetId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneMappingForModifyLoadBalancerZonesInput {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
