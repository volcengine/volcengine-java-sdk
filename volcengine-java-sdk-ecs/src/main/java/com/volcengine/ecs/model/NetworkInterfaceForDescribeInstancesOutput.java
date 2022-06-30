/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NetworkInterfaceForDescribeInstancesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class NetworkInterfaceForDescribeInstancesOutput {
  @SerializedName("MacAddress")
  private String macAddress = null;

  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("PrivateIpAddresses")
  private List<String> privateIpAddresses = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public NetworkInterfaceForDescribeInstancesOutput macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @Schema(description = "")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public NetworkInterfaceForDescribeInstancesOutput networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @Schema(description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public NetworkInterfaceForDescribeInstancesOutput primaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
    return this;
  }

   /**
   * Get primaryIpAddress
   * @return primaryIpAddress
  **/
  @Schema(description = "")
  public String getPrimaryIpAddress() {
    return primaryIpAddress;
  }

  public void setPrimaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
  }

  public NetworkInterfaceForDescribeInstancesOutput privateIpAddresses(List<String> privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
    return this;
  }

  public NetworkInterfaceForDescribeInstancesOutput addPrivateIpAddressesItem(String privateIpAddressesItem) {
    if (this.privateIpAddresses == null) {
      this.privateIpAddresses = new ArrayList<String>();
    }
    this.privateIpAddresses.add(privateIpAddressesItem);
    return this;
  }

   /**
   * Get privateIpAddresses
   * @return privateIpAddresses
  **/
  @Schema(description = "")
  public List<String> getPrivateIpAddresses() {
    return privateIpAddresses;
  }

  public void setPrivateIpAddresses(List<String> privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
  }

  public NetworkInterfaceForDescribeInstancesOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public NetworkInterfaceForDescribeInstancesOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NetworkInterfaceForDescribeInstancesOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInterfaceForDescribeInstancesOutput networkInterfaceForDescribeInstancesOutput = (NetworkInterfaceForDescribeInstancesOutput) o;
    return Objects.equals(this.macAddress, networkInterfaceForDescribeInstancesOutput.macAddress) &&
        Objects.equals(this.networkInterfaceId, networkInterfaceForDescribeInstancesOutput.networkInterfaceId) &&
        Objects.equals(this.primaryIpAddress, networkInterfaceForDescribeInstancesOutput.primaryIpAddress) &&
        Objects.equals(this.privateIpAddresses, networkInterfaceForDescribeInstancesOutput.privateIpAddresses) &&
        Objects.equals(this.subnetId, networkInterfaceForDescribeInstancesOutput.subnetId) &&
        Objects.equals(this.type, networkInterfaceForDescribeInstancesOutput.type) &&
        Objects.equals(this.vpcId, networkInterfaceForDescribeInstancesOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddress, networkInterfaceId, primaryIpAddress, privateIpAddresses, subnetId, type, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterfaceForDescribeInstancesOutput {\n");
    
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    privateIpAddresses: ").append(toIndentedString(privateIpAddresses)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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