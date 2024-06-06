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
import com.volcengine.vpc.model.RouteTableForDescribeSubnetsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SubnetForDescribeSubnetsOutput
 */



public class SubnetForDescribeSubnetsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AvailableIpAddressCount")
  private Integer availableIpAddressCount = null;

  @SerializedName("CidrBlock")
  private String cidrBlock = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Ipv6CidrBlock")
  private String ipv6CidrBlock = null;

  @SerializedName("IsDefault")
  private Boolean isDefault = null;

  @SerializedName("NetworkAclId")
  private String networkAclId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RouteTable")
  private RouteTableForDescribeSubnetsOutput routeTable = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("SubnetName")
  private String subnetName = null;

  @SerializedName("TotalIpv4Count")
  private Integer totalIpv4Count = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public SubnetForDescribeSubnetsOutput accountId(String accountId) {
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

  public SubnetForDescribeSubnetsOutput availableIpAddressCount(Integer availableIpAddressCount) {
    this.availableIpAddressCount = availableIpAddressCount;
    return this;
  }

   /**
   * Get availableIpAddressCount
   * @return availableIpAddressCount
  **/
  @Schema(description = "")
  public Integer getAvailableIpAddressCount() {
    return availableIpAddressCount;
  }

  public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
    this.availableIpAddressCount = availableIpAddressCount;
  }

  public SubnetForDescribeSubnetsOutput cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @Schema(description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public SubnetForDescribeSubnetsOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public SubnetForDescribeSubnetsOutput description(String description) {
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

  public SubnetForDescribeSubnetsOutput ipv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
    return this;
  }

   /**
   * Get ipv6CidrBlock
   * @return ipv6CidrBlock
  **/
  @Schema(description = "")
  public String getIpv6CidrBlock() {
    return ipv6CidrBlock;
  }

  public void setIpv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
  }

  public SubnetForDescribeSubnetsOutput isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @Schema(description = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SubnetForDescribeSubnetsOutput networkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
    return this;
  }

   /**
   * Get networkAclId
   * @return networkAclId
  **/
  @Schema(description = "")
  public String getNetworkAclId() {
    return networkAclId;
  }

  public void setNetworkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
  }

  public SubnetForDescribeSubnetsOutput projectName(String projectName) {
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

  public SubnetForDescribeSubnetsOutput routeTable(RouteTableForDescribeSubnetsOutput routeTable) {
    this.routeTable = routeTable;
    return this;
  }

   /**
   * Get routeTable
   * @return routeTable
  **/
  @Valid
  @Schema(description = "")
  public RouteTableForDescribeSubnetsOutput getRouteTable() {
    return routeTable;
  }

  public void setRouteTable(RouteTableForDescribeSubnetsOutput routeTable) {
    this.routeTable = routeTable;
  }

  public SubnetForDescribeSubnetsOutput status(String status) {
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

  public SubnetForDescribeSubnetsOutput subnetId(String subnetId) {
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

  public SubnetForDescribeSubnetsOutput subnetName(String subnetName) {
    this.subnetName = subnetName;
    return this;
  }

   /**
   * Get subnetName
   * @return subnetName
  **/
  @Schema(description = "")
  public String getSubnetName() {
    return subnetName;
  }

  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  public SubnetForDescribeSubnetsOutput totalIpv4Count(Integer totalIpv4Count) {
    this.totalIpv4Count = totalIpv4Count;
    return this;
  }

   /**
   * Get totalIpv4Count
   * @return totalIpv4Count
  **/
  @Schema(description = "")
  public Integer getTotalIpv4Count() {
    return totalIpv4Count;
  }

  public void setTotalIpv4Count(Integer totalIpv4Count) {
    this.totalIpv4Count = totalIpv4Count;
  }

  public SubnetForDescribeSubnetsOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public SubnetForDescribeSubnetsOutput vpcId(String vpcId) {
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

  public SubnetForDescribeSubnetsOutput zoneId(String zoneId) {
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
    SubnetForDescribeSubnetsOutput subnetForDescribeSubnetsOutput = (SubnetForDescribeSubnetsOutput) o;
    return Objects.equals(this.accountId, subnetForDescribeSubnetsOutput.accountId) &&
        Objects.equals(this.availableIpAddressCount, subnetForDescribeSubnetsOutput.availableIpAddressCount) &&
        Objects.equals(this.cidrBlock, subnetForDescribeSubnetsOutput.cidrBlock) &&
        Objects.equals(this.creationTime, subnetForDescribeSubnetsOutput.creationTime) &&
        Objects.equals(this.description, subnetForDescribeSubnetsOutput.description) &&
        Objects.equals(this.ipv6CidrBlock, subnetForDescribeSubnetsOutput.ipv6CidrBlock) &&
        Objects.equals(this.isDefault, subnetForDescribeSubnetsOutput.isDefault) &&
        Objects.equals(this.networkAclId, subnetForDescribeSubnetsOutput.networkAclId) &&
        Objects.equals(this.projectName, subnetForDescribeSubnetsOutput.projectName) &&
        Objects.equals(this.routeTable, subnetForDescribeSubnetsOutput.routeTable) &&
        Objects.equals(this.status, subnetForDescribeSubnetsOutput.status) &&
        Objects.equals(this.subnetId, subnetForDescribeSubnetsOutput.subnetId) &&
        Objects.equals(this.subnetName, subnetForDescribeSubnetsOutput.subnetName) &&
        Objects.equals(this.totalIpv4Count, subnetForDescribeSubnetsOutput.totalIpv4Count) &&
        Objects.equals(this.updateTime, subnetForDescribeSubnetsOutput.updateTime) &&
        Objects.equals(this.vpcId, subnetForDescribeSubnetsOutput.vpcId) &&
        Objects.equals(this.zoneId, subnetForDescribeSubnetsOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, availableIpAddressCount, cidrBlock, creationTime, description, ipv6CidrBlock, isDefault, networkAclId, projectName, routeTable, status, subnetId, subnetName, totalIpv4Count, updateTime, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetForDescribeSubnetsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    availableIpAddressCount: ").append(toIndentedString(availableIpAddressCount)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipv6CidrBlock: ").append(toIndentedString(ipv6CidrBlock)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    networkAclId: ").append(toIndentedString(networkAclId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    totalIpv4Count: ").append(toIndentedString(totalIpv4Count)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
