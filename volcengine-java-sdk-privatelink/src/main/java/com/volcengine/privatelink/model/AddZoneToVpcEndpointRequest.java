/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * AddZoneToVpcEndpointRequest
 */



public class AddZoneToVpcEndpointRequest {
  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("PrivateIpAddress")
  private String privateIpAddress = null;

  @SerializedName("PrivateIpv6Address")
  private String privateIpv6Address = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public AddZoneToVpcEndpointRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public AddZoneToVpcEndpointRequest privateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
    return this;
  }

   /**
   * Get privateIpAddress
   * @return privateIpAddress
  **/
  @Schema(description = "")
  public String getPrivateIpAddress() {
    return privateIpAddress;
  }

  public void setPrivateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
  }

  public AddZoneToVpcEndpointRequest privateIpv6Address(String privateIpv6Address) {
    this.privateIpv6Address = privateIpv6Address;
    return this;
  }

   /**
   * Get privateIpv6Address
   * @return privateIpv6Address
  **/
  @Schema(description = "")
  public String getPrivateIpv6Address() {
    return privateIpv6Address;
  }

  public void setPrivateIpv6Address(String privateIpv6Address) {
    this.privateIpv6Address = privateIpv6Address;
  }

  public AddZoneToVpcEndpointRequest subnetId(String subnetId) {
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

  public AddZoneToVpcEndpointRequest zoneId(String zoneId) {
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
    AddZoneToVpcEndpointRequest addZoneToVpcEndpointRequest = (AddZoneToVpcEndpointRequest) o;
    return Objects.equals(this.endpointId, addZoneToVpcEndpointRequest.endpointId) &&
        Objects.equals(this.privateIpAddress, addZoneToVpcEndpointRequest.privateIpAddress) &&
        Objects.equals(this.privateIpv6Address, addZoneToVpcEndpointRequest.privateIpv6Address) &&
        Objects.equals(this.subnetId, addZoneToVpcEndpointRequest.subnetId) &&
        Objects.equals(this.zoneId, addZoneToVpcEndpointRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, privateIpAddress, privateIpv6Address, subnetId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddZoneToVpcEndpointRequest {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
    sb.append("    privateIpv6Address: ").append(toIndentedString(privateIpv6Address)).append("\n");
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
