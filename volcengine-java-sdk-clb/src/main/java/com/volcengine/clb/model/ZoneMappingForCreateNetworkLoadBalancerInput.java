/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * ZoneMappingForCreateNetworkLoadBalancerInput
 */



public class ZoneMappingForCreateNetworkLoadBalancerInput {
  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("Ipv4Address")
  private String ipv4Address = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ZoneMappingForCreateNetworkLoadBalancerInput eipId(String eipId) {
    this.eipId = eipId;
    return this;
  }

   /**
   * Get eipId
   * @return eipId
  **/
  @Schema(description = "")
  public String getEipId() {
    return eipId;
  }

  public void setEipId(String eipId) {
    this.eipId = eipId;
  }

  public ZoneMappingForCreateNetworkLoadBalancerInput ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

   /**
   * Get ipv4Address
   * @return ipv4Address
  **/
  @Schema(description = "")
  public String getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  public ZoneMappingForCreateNetworkLoadBalancerInput subnetId(String subnetId) {
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

  public ZoneMappingForCreateNetworkLoadBalancerInput zoneId(String zoneId) {
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
    ZoneMappingForCreateNetworkLoadBalancerInput zoneMappingForCreateNetworkLoadBalancerInput = (ZoneMappingForCreateNetworkLoadBalancerInput) o;
    return Objects.equals(this.eipId, zoneMappingForCreateNetworkLoadBalancerInput.eipId) &&
        Objects.equals(this.ipv4Address, zoneMappingForCreateNetworkLoadBalancerInput.ipv4Address) &&
        Objects.equals(this.subnetId, zoneMappingForCreateNetworkLoadBalancerInput.subnetId) &&
        Objects.equals(this.zoneId, zoneMappingForCreateNetworkLoadBalancerInput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eipId, ipv4Address, subnetId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneMappingForCreateNetworkLoadBalancerInput {\n");
    
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
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
