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
import com.volcengine.vpc.model.AssociatedElasticIpForDescribeNetworkInterfacesOutput;
import com.volcengine.vpc.model.PrivateIpSetsForDescribeNetworkInterfacesOutput;
import com.volcengine.vpc.model.TagForDescribeNetworkInterfacesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NetworkInterfaceSetForDescribeNetworkInterfacesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:39.157783+08:00[Asia/Shanghai]")
public class NetworkInterfaceSetForDescribeNetworkInterfacesOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AssociatedElasticIp")
  private AssociatedElasticIpForDescribeNetworkInterfacesOutput associatedElasticIp = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("MacAddress")
  private String macAddress = null;

  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("NetworkInterfaceName")
  private String networkInterfaceName = null;

  @SerializedName("PortSecurityEnabled")
  private Boolean portSecurityEnabled = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("PrivateIpSets")
  private PrivateIpSetsForDescribeNetworkInterfacesOutput privateIpSets = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecurityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("ServiceManaged")
  private Boolean serviceManaged = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeNetworkInterfacesOutput> tags = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpcName")
  private String vpcName = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput associatedElasticIp(AssociatedElasticIpForDescribeNetworkInterfacesOutput associatedElasticIp) {
    this.associatedElasticIp = associatedElasticIp;
    return this;
  }

   /**
   * Get associatedElasticIp
   * @return associatedElasticIp
  **/
  @Valid
  @Schema(description = "")
  public AssociatedElasticIpForDescribeNetworkInterfacesOutput getAssociatedElasticIp() {
    return associatedElasticIp;
  }

  public void setAssociatedElasticIp(AssociatedElasticIpForDescribeNetworkInterfacesOutput associatedElasticIp) {
    this.associatedElasticIp = associatedElasticIp;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput description(String description) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @Schema(description = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput macAddress(String macAddress) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput networkInterfaceId(String networkInterfaceId) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput networkInterfaceName(String networkInterfaceName) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput portSecurityEnabled(Boolean portSecurityEnabled) {
    this.portSecurityEnabled = portSecurityEnabled;
    return this;
  }

   /**
   * Get portSecurityEnabled
   * @return portSecurityEnabled
  **/
  @Schema(description = "")
  public Boolean isPortSecurityEnabled() {
    return portSecurityEnabled;
  }

  public void setPortSecurityEnabled(Boolean portSecurityEnabled) {
    this.portSecurityEnabled = portSecurityEnabled;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput primaryIpAddress(String primaryIpAddress) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput privateIpSets(PrivateIpSetsForDescribeNetworkInterfacesOutput privateIpSets) {
    this.privateIpSets = privateIpSets;
    return this;
  }

   /**
   * Get privateIpSets
   * @return privateIpSets
  **/
  @Valid
  @Schema(description = "")
  public PrivateIpSetsForDescribeNetworkInterfacesOutput getPrivateIpSets() {
    return privateIpSets;
  }

  public void setPrivateIpSets(PrivateIpSetsForDescribeNetworkInterfacesOutput privateIpSets) {
    this.privateIpSets = privateIpSets;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput projectName(String projectName) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput addSecurityGroupIdsItem(String securityGroupIdsItem) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput serviceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
    return this;
  }

   /**
   * Get serviceManaged
   * @return serviceManaged
  **/
  @Schema(description = "")
  public Boolean isServiceManaged() {
    return serviceManaged;
  }

  public void setServiceManaged(Boolean serviceManaged) {
    this.serviceManaged = serviceManaged;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput subnetId(String subnetId) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput tags(List<TagForDescribeNetworkInterfacesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput addTagsItem(TagForDescribeNetworkInterfacesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeNetworkInterfacesOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeNetworkInterfacesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeNetworkInterfacesOutput> tags) {
    this.tags = tags;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput type(String type) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput vpcId(String vpcId) {
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

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput vpcName(String vpcName) {
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Get vpcName
   * @return vpcName
  **/
  @Schema(description = "")
  public String getVpcName() {
    return vpcName;
  }

  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }

  public NetworkInterfaceSetForDescribeNetworkInterfacesOutput zoneId(String zoneId) {
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
    NetworkInterfaceSetForDescribeNetworkInterfacesOutput networkInterfaceSetForDescribeNetworkInterfacesOutput = (NetworkInterfaceSetForDescribeNetworkInterfacesOutput) o;
    return Objects.equals(this.accountId, networkInterfaceSetForDescribeNetworkInterfacesOutput.accountId) &&
        Objects.equals(this.associatedElasticIp, networkInterfaceSetForDescribeNetworkInterfacesOutput.associatedElasticIp) &&
        Objects.equals(this.createdAt, networkInterfaceSetForDescribeNetworkInterfacesOutput.createdAt) &&
        Objects.equals(this.description, networkInterfaceSetForDescribeNetworkInterfacesOutput.description) &&
        Objects.equals(this.deviceId, networkInterfaceSetForDescribeNetworkInterfacesOutput.deviceId) &&
        Objects.equals(this.macAddress, networkInterfaceSetForDescribeNetworkInterfacesOutput.macAddress) &&
        Objects.equals(this.networkInterfaceId, networkInterfaceSetForDescribeNetworkInterfacesOutput.networkInterfaceId) &&
        Objects.equals(this.networkInterfaceName, networkInterfaceSetForDescribeNetworkInterfacesOutput.networkInterfaceName) &&
        Objects.equals(this.portSecurityEnabled, networkInterfaceSetForDescribeNetworkInterfacesOutput.portSecurityEnabled) &&
        Objects.equals(this.primaryIpAddress, networkInterfaceSetForDescribeNetworkInterfacesOutput.primaryIpAddress) &&
        Objects.equals(this.privateIpSets, networkInterfaceSetForDescribeNetworkInterfacesOutput.privateIpSets) &&
        Objects.equals(this.projectName, networkInterfaceSetForDescribeNetworkInterfacesOutput.projectName) &&
        Objects.equals(this.securityGroupIds, networkInterfaceSetForDescribeNetworkInterfacesOutput.securityGroupIds) &&
        Objects.equals(this.serviceManaged, networkInterfaceSetForDescribeNetworkInterfacesOutput.serviceManaged) &&
        Objects.equals(this.status, networkInterfaceSetForDescribeNetworkInterfacesOutput.status) &&
        Objects.equals(this.subnetId, networkInterfaceSetForDescribeNetworkInterfacesOutput.subnetId) &&
        Objects.equals(this.tags, networkInterfaceSetForDescribeNetworkInterfacesOutput.tags) &&
        Objects.equals(this.type, networkInterfaceSetForDescribeNetworkInterfacesOutput.type) &&
        Objects.equals(this.updatedAt, networkInterfaceSetForDescribeNetworkInterfacesOutput.updatedAt) &&
        Objects.equals(this.vpcId, networkInterfaceSetForDescribeNetworkInterfacesOutput.vpcId) &&
        Objects.equals(this.vpcName, networkInterfaceSetForDescribeNetworkInterfacesOutput.vpcName) &&
        Objects.equals(this.zoneId, networkInterfaceSetForDescribeNetworkInterfacesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, associatedElasticIp, createdAt, description, deviceId, macAddress, networkInterfaceId, networkInterfaceName, portSecurityEnabled, primaryIpAddress, privateIpSets, projectName, securityGroupIds, serviceManaged, status, subnetId, tags, type, updatedAt, vpcId, vpcName, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterfaceSetForDescribeNetworkInterfacesOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    associatedElasticIp: ").append(toIndentedString(associatedElasticIp)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    networkInterfaceName: ").append(toIndentedString(networkInterfaceName)).append("\n");
    sb.append("    portSecurityEnabled: ").append(toIndentedString(portSecurityEnabled)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    privateIpSets: ").append(toIndentedString(privateIpSets)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    serviceManaged: ").append(toIndentedString(serviceManaged)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
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
