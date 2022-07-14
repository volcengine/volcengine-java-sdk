/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * VpnGatewayForDescribeVpnGatewaysOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:33.618811+08:00[Asia/Shanghai]")
public class VpnGatewayForDescribeVpnGatewaysOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("ConnectionCount")
  private Integer connectionCount = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("RouteCount")
  private Integer routeCount = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  @SerializedName("VpnGatewayName")
  private String vpnGatewayName = null;

  public VpnGatewayForDescribeVpnGatewaysOutput accountId(String accountId) {
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

  public VpnGatewayForDescribeVpnGatewaysOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput billingType(Integer billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @Schema(description = "")
  public Integer getBillingType() {
    return billingType;
  }

  public void setBillingType(Integer billingType) {
    this.billingType = billingType;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput connectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * Get connectionCount
   * @return connectionCount
  **/
  @Schema(description = "")
  public Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput creationTime(String creationTime) {
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

  public VpnGatewayForDescribeVpnGatewaysOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput description(String description) {
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

  public VpnGatewayForDescribeVpnGatewaysOutput expiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
    return this;
  }

   /**
   * Get expiredTime
   * @return expiredTime
  **/
  @Schema(description = "")
  public String getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(String expiredTime) {
    this.expiredTime = expiredTime;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput lockReason(String lockReason) {
    this.lockReason = lockReason;
    return this;
  }

   /**
   * Get lockReason
   * @return lockReason
  **/
  @Schema(description = "")
  public String getLockReason() {
    return lockReason;
  }

  public void setLockReason(String lockReason) {
    this.lockReason = lockReason;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput routeCount(Integer routeCount) {
    this.routeCount = routeCount;
    return this;
  }

   /**
   * Get routeCount
   * @return routeCount
  **/
  @Schema(description = "")
  public Integer getRouteCount() {
    return routeCount;
  }

  public void setRouteCount(Integer routeCount) {
    this.routeCount = routeCount;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput status(String status) {
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

  public VpnGatewayForDescribeVpnGatewaysOutput subnetId(String subnetId) {
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

  public VpnGatewayForDescribeVpnGatewaysOutput updateTime(String updateTime) {
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

  public VpnGatewayForDescribeVpnGatewaysOutput vpcId(String vpcId) {
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

  public VpnGatewayForDescribeVpnGatewaysOutput vpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
    return this;
  }

   /**
   * Get vpnGatewayId
   * @return vpnGatewayId
  **/
  @Schema(description = "")
  public String getVpnGatewayId() {
    return vpnGatewayId;
  }

  public void setVpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
  }

  public VpnGatewayForDescribeVpnGatewaysOutput vpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
    return this;
  }

   /**
   * Get vpnGatewayName
   * @return vpnGatewayName
  **/
  @Schema(description = "")
  public String getVpnGatewayName() {
    return vpnGatewayName;
  }

  public void setVpnGatewayName(String vpnGatewayName) {
    this.vpnGatewayName = vpnGatewayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpnGatewayForDescribeVpnGatewaysOutput vpnGatewayForDescribeVpnGatewaysOutput = (VpnGatewayForDescribeVpnGatewaysOutput) o;
    return Objects.equals(this.accountId, vpnGatewayForDescribeVpnGatewaysOutput.accountId) &&
        Objects.equals(this.bandwidth, vpnGatewayForDescribeVpnGatewaysOutput.bandwidth) &&
        Objects.equals(this.billingType, vpnGatewayForDescribeVpnGatewaysOutput.billingType) &&
        Objects.equals(this.businessStatus, vpnGatewayForDescribeVpnGatewaysOutput.businessStatus) &&
        Objects.equals(this.connectionCount, vpnGatewayForDescribeVpnGatewaysOutput.connectionCount) &&
        Objects.equals(this.creationTime, vpnGatewayForDescribeVpnGatewaysOutput.creationTime) &&
        Objects.equals(this.deletedTime, vpnGatewayForDescribeVpnGatewaysOutput.deletedTime) &&
        Objects.equals(this.description, vpnGatewayForDescribeVpnGatewaysOutput.description) &&
        Objects.equals(this.expiredTime, vpnGatewayForDescribeVpnGatewaysOutput.expiredTime) &&
        Objects.equals(this.ipAddress, vpnGatewayForDescribeVpnGatewaysOutput.ipAddress) &&
        Objects.equals(this.lockReason, vpnGatewayForDescribeVpnGatewaysOutput.lockReason) &&
        Objects.equals(this.routeCount, vpnGatewayForDescribeVpnGatewaysOutput.routeCount) &&
        Objects.equals(this.status, vpnGatewayForDescribeVpnGatewaysOutput.status) &&
        Objects.equals(this.subnetId, vpnGatewayForDescribeVpnGatewaysOutput.subnetId) &&
        Objects.equals(this.updateTime, vpnGatewayForDescribeVpnGatewaysOutput.updateTime) &&
        Objects.equals(this.vpcId, vpnGatewayForDescribeVpnGatewaysOutput.vpcId) &&
        Objects.equals(this.vpnGatewayId, vpnGatewayForDescribeVpnGatewaysOutput.vpnGatewayId) &&
        Objects.equals(this.vpnGatewayName, vpnGatewayForDescribeVpnGatewaysOutput.vpnGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, billingType, businessStatus, connectionCount, creationTime, deletedTime, description, expiredTime, ipAddress, lockReason, routeCount, status, subnetId, updateTime, vpcId, vpnGatewayId, vpnGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpnGatewayForDescribeVpnGatewaysOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    routeCount: ").append(toIndentedString(routeCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
    sb.append("    vpnGatewayName: ").append(toIndentedString(vpnGatewayName)).append("\n");
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
