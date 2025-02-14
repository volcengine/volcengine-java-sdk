/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * AllocateIpv6AddressBandwidthRequest
 */



public class AllocateIpv6AddressBandwidthRequest {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BandwidthPackageId")
  private String bandwidthPackageId = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Ipv6Address")
  private String ipv6Address = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  public AllocateIpv6AddressBandwidthRequest bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * minimum: 1
   * @return bandwidth
  **/
 @Min(1)  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public AllocateIpv6AddressBandwidthRequest bandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
    return this;
  }

   /**
   * Get bandwidthPackageId
   * @return bandwidthPackageId
  **/
  @Schema(description = "")
  public String getBandwidthPackageId() {
    return bandwidthPackageId;
  }

  public void setBandwidthPackageId(String bandwidthPackageId) {
    this.bandwidthPackageId = bandwidthPackageId;
  }

  public AllocateIpv6AddressBandwidthRequest billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public AllocateIpv6AddressBandwidthRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public AllocateIpv6AddressBandwidthRequest ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

   /**
   * Get ipv6Address
   * @return ipv6Address
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  public AllocateIpv6AddressBandwidthRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocateIpv6AddressBandwidthRequest allocateIpv6AddressBandwidthRequest = (AllocateIpv6AddressBandwidthRequest) o;
    return Objects.equals(this.bandwidth, allocateIpv6AddressBandwidthRequest.bandwidth) &&
        Objects.equals(this.bandwidthPackageId, allocateIpv6AddressBandwidthRequest.bandwidthPackageId) &&
        Objects.equals(this.billingType, allocateIpv6AddressBandwidthRequest.billingType) &&
        Objects.equals(this.clientToken, allocateIpv6AddressBandwidthRequest.clientToken) &&
        Objects.equals(this.ipv6Address, allocateIpv6AddressBandwidthRequest.ipv6Address) &&
        Objects.equals(this.projectName, allocateIpv6AddressBandwidthRequest.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, bandwidthPackageId, billingType, clientToken, ipv6Address, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateIpv6AddressBandwidthRequest {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
