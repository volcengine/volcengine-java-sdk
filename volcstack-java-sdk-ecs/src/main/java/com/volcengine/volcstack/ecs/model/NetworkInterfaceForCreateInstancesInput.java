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

package com.volcengine.volcstack.ecs.model;

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
 * NetworkInterfaceForCreateInstancesInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class NetworkInterfaceForCreateInstancesInput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("NetworkInterfaceName")
  private String networkInterfaceName = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("PrivateIpAddresses")
  private List<String> privateIpAddresses = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public NetworkInterfaceForCreateInstancesInput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NetworkInterfaceForCreateInstancesInput networkInterfaceName(String networkInterfaceName) {
    this.networkInterfaceName = networkInterfaceName;
    return this;
  }

   /**
   * Get networkInterfaceName
   * @return networkInterfaceName
  **/
  @Schema(description = "")
  public String getNetworkInterfaceName() {
    return networkInterfaceName;
  }

  public void setNetworkInterfaceName(String networkInterfaceName) {
    this.networkInterfaceName = networkInterfaceName;
  }

  public NetworkInterfaceForCreateInstancesInput primaryIpAddress(String primaryIpAddress) {
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

  public NetworkInterfaceForCreateInstancesInput privateIpAddresses(List<String> privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
    return this;
  }

  public NetworkInterfaceForCreateInstancesInput addPrivateIpAddressesItem(String privateIpAddressesItem) {
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

  public NetworkInterfaceForCreateInstancesInput securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public NetworkInterfaceForCreateInstancesInput addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * Get securityGroupIds
   * @return securityGroupIds
  **/
  @Schema(description = "")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public NetworkInterfaceForCreateInstancesInput subnetId(String subnetId) {
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

  public NetworkInterfaceForCreateInstancesInput vpcId(String vpcId) {
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
    NetworkInterfaceForCreateInstancesInput networkInterfaceForCreateInstancesInput = (NetworkInterfaceForCreateInstancesInput) o;
    return Objects.equals(this.description, networkInterfaceForCreateInstancesInput.description) &&
        Objects.equals(this.networkInterfaceName, networkInterfaceForCreateInstancesInput.networkInterfaceName) &&
        Objects.equals(this.primaryIpAddress, networkInterfaceForCreateInstancesInput.primaryIpAddress) &&
        Objects.equals(this.privateIpAddresses, networkInterfaceForCreateInstancesInput.privateIpAddresses) &&
        Objects.equals(this.securityGroupIds, networkInterfaceForCreateInstancesInput.securityGroupIds) &&
        Objects.equals(this.subnetId, networkInterfaceForCreateInstancesInput.subnetId) &&
        Objects.equals(this.vpcId, networkInterfaceForCreateInstancesInput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, networkInterfaceName, primaryIpAddress, privateIpAddresses, securityGroupIds, subnetId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterfaceForCreateInstancesInput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkInterfaceName: ").append(toIndentedString(networkInterfaceName)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    privateIpAddresses: ").append(toIndentedString(privateIpAddresses)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
