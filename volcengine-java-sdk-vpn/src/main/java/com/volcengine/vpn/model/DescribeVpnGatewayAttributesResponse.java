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
import com.volcengine.vpn.model.TagForDescribeVpnGatewayAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpnGatewayAttributesResponse
 */



public class DescribeVpnGatewayAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Asn")
  private Integer asn = null;

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

  @SerializedName("DualTunnelEnabled")
  private Boolean dualTunnelEnabled = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("IpsecEnabled")
  private Boolean ipsecEnabled = null;

  @SerializedName("IsBlocked")
  private Boolean isBlocked = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("RouteCount")
  private Integer routeCount = null;

  @SerializedName("SecondaryIpAddress")
  private String secondaryIpAddress = null;

  @SerializedName("SecondarySubnetId")
  private String secondarySubnetId = null;

  @SerializedName("SslEnabled")
  private Boolean sslEnabled = null;

  @SerializedName("SslMaxConnection")
  private Integer sslMaxConnection = null;

  @SerializedName("SslMaxConnections")
  private Integer sslMaxConnections = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Tags")
  private List<TagForDescribeVpnGatewayAttributesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  @SerializedName("VpnGatewayName")
  private String vpnGatewayName = null;

  public DescribeVpnGatewayAttributesResponse accountId(String accountId) {
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

  public DescribeVpnGatewayAttributesResponse asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @Schema(description = "")
  public Integer getAsn() {
    return asn;
  }

  public void setAsn(Integer asn) {
    this.asn = asn;
  }

  public DescribeVpnGatewayAttributesResponse bandwidth(Integer bandwidth) {
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

  public DescribeVpnGatewayAttributesResponse billingType(Integer billingType) {
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

  public DescribeVpnGatewayAttributesResponse businessStatus(String businessStatus) {
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

  public DescribeVpnGatewayAttributesResponse connectionCount(Integer connectionCount) {
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

  public DescribeVpnGatewayAttributesResponse creationTime(String creationTime) {
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

  public DescribeVpnGatewayAttributesResponse deletedTime(String deletedTime) {
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

  public DescribeVpnGatewayAttributesResponse description(String description) {
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

  public DescribeVpnGatewayAttributesResponse dualTunnelEnabled(Boolean dualTunnelEnabled) {
    this.dualTunnelEnabled = dualTunnelEnabled;
    return this;
  }

   /**
   * Get dualTunnelEnabled
   * @return dualTunnelEnabled
  **/
  @Schema(description = "")
  public Boolean isDualTunnelEnabled() {
    return dualTunnelEnabled;
  }

  public void setDualTunnelEnabled(Boolean dualTunnelEnabled) {
    this.dualTunnelEnabled = dualTunnelEnabled;
  }

  public DescribeVpnGatewayAttributesResponse expiredTime(String expiredTime) {
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

  public DescribeVpnGatewayAttributesResponse ipAddress(String ipAddress) {
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

  public DescribeVpnGatewayAttributesResponse ipsecEnabled(Boolean ipsecEnabled) {
    this.ipsecEnabled = ipsecEnabled;
    return this;
  }

   /**
   * Get ipsecEnabled
   * @return ipsecEnabled
  **/
  @Schema(description = "")
  public Boolean isIpsecEnabled() {
    return ipsecEnabled;
  }

  public void setIpsecEnabled(Boolean ipsecEnabled) {
    this.ipsecEnabled = ipsecEnabled;
  }

  public DescribeVpnGatewayAttributesResponse isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

   /**
   * Get isBlocked
   * @return isBlocked
  **/
  @Schema(description = "")
  public Boolean isIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public DescribeVpnGatewayAttributesResponse lockReason(String lockReason) {
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

  public DescribeVpnGatewayAttributesResponse overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public DescribeVpnGatewayAttributesResponse projectName(String projectName) {
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

  public DescribeVpnGatewayAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeVpnGatewayAttributesResponse routeCount(Integer routeCount) {
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

  public DescribeVpnGatewayAttributesResponse secondaryIpAddress(String secondaryIpAddress) {
    this.secondaryIpAddress = secondaryIpAddress;
    return this;
  }

   /**
   * Get secondaryIpAddress
   * @return secondaryIpAddress
  **/
  @Schema(description = "")
  public String getSecondaryIpAddress() {
    return secondaryIpAddress;
  }

  public void setSecondaryIpAddress(String secondaryIpAddress) {
    this.secondaryIpAddress = secondaryIpAddress;
  }

  public DescribeVpnGatewayAttributesResponse secondarySubnetId(String secondarySubnetId) {
    this.secondarySubnetId = secondarySubnetId;
    return this;
  }

   /**
   * Get secondarySubnetId
   * @return secondarySubnetId
  **/
  @Schema(description = "")
  public String getSecondarySubnetId() {
    return secondarySubnetId;
  }

  public void setSecondarySubnetId(String secondarySubnetId) {
    this.secondarySubnetId = secondarySubnetId;
  }

  public DescribeVpnGatewayAttributesResponse sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

   /**
   * Get sslEnabled
   * @return sslEnabled
  **/
  @Schema(description = "")
  public Boolean isSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  public DescribeVpnGatewayAttributesResponse sslMaxConnection(Integer sslMaxConnection) {
    this.sslMaxConnection = sslMaxConnection;
    return this;
  }

   /**
   * Get sslMaxConnection
   * @return sslMaxConnection
  **/
  @Schema(description = "")
  public Integer getSslMaxConnection() {
    return sslMaxConnection;
  }

  public void setSslMaxConnection(Integer sslMaxConnection) {
    this.sslMaxConnection = sslMaxConnection;
  }

  public DescribeVpnGatewayAttributesResponse sslMaxConnections(Integer sslMaxConnections) {
    this.sslMaxConnections = sslMaxConnections;
    return this;
  }

   /**
   * Get sslMaxConnections
   * @return sslMaxConnections
  **/
  @Schema(description = "")
  public Integer getSslMaxConnections() {
    return sslMaxConnections;
  }

  public void setSslMaxConnections(Integer sslMaxConnections) {
    this.sslMaxConnections = sslMaxConnections;
  }

  public DescribeVpnGatewayAttributesResponse status(String status) {
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

  public DescribeVpnGatewayAttributesResponse subnetId(String subnetId) {
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

  public DescribeVpnGatewayAttributesResponse tags(List<TagForDescribeVpnGatewayAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeVpnGatewayAttributesResponse addTagsItem(TagForDescribeVpnGatewayAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeVpnGatewayAttributesOutput>();
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
  public List<TagForDescribeVpnGatewayAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeVpnGatewayAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeVpnGatewayAttributesResponse updateTime(String updateTime) {
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

  public DescribeVpnGatewayAttributesResponse vpcId(String vpcId) {
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

  public DescribeVpnGatewayAttributesResponse vpnGatewayId(String vpnGatewayId) {
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

  public DescribeVpnGatewayAttributesResponse vpnGatewayName(String vpnGatewayName) {
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
    DescribeVpnGatewayAttributesResponse describeVpnGatewayAttributesResponse = (DescribeVpnGatewayAttributesResponse) o;
    return Objects.equals(this.accountId, describeVpnGatewayAttributesResponse.accountId) &&
        Objects.equals(this.asn, describeVpnGatewayAttributesResponse.asn) &&
        Objects.equals(this.bandwidth, describeVpnGatewayAttributesResponse.bandwidth) &&
        Objects.equals(this.billingType, describeVpnGatewayAttributesResponse.billingType) &&
        Objects.equals(this.businessStatus, describeVpnGatewayAttributesResponse.businessStatus) &&
        Objects.equals(this.connectionCount, describeVpnGatewayAttributesResponse.connectionCount) &&
        Objects.equals(this.creationTime, describeVpnGatewayAttributesResponse.creationTime) &&
        Objects.equals(this.deletedTime, describeVpnGatewayAttributesResponse.deletedTime) &&
        Objects.equals(this.description, describeVpnGatewayAttributesResponse.description) &&
        Objects.equals(this.dualTunnelEnabled, describeVpnGatewayAttributesResponse.dualTunnelEnabled) &&
        Objects.equals(this.expiredTime, describeVpnGatewayAttributesResponse.expiredTime) &&
        Objects.equals(this.ipAddress, describeVpnGatewayAttributesResponse.ipAddress) &&
        Objects.equals(this.ipsecEnabled, describeVpnGatewayAttributesResponse.ipsecEnabled) &&
        Objects.equals(this.isBlocked, describeVpnGatewayAttributesResponse.isBlocked) &&
        Objects.equals(this.lockReason, describeVpnGatewayAttributesResponse.lockReason) &&
        Objects.equals(this.overdueTime, describeVpnGatewayAttributesResponse.overdueTime) &&
        Objects.equals(this.projectName, describeVpnGatewayAttributesResponse.projectName) &&
        Objects.equals(this.requestId, describeVpnGatewayAttributesResponse.requestId) &&
        Objects.equals(this.routeCount, describeVpnGatewayAttributesResponse.routeCount) &&
        Objects.equals(this.secondaryIpAddress, describeVpnGatewayAttributesResponse.secondaryIpAddress) &&
        Objects.equals(this.secondarySubnetId, describeVpnGatewayAttributesResponse.secondarySubnetId) &&
        Objects.equals(this.sslEnabled, describeVpnGatewayAttributesResponse.sslEnabled) &&
        Objects.equals(this.sslMaxConnection, describeVpnGatewayAttributesResponse.sslMaxConnection) &&
        Objects.equals(this.sslMaxConnections, describeVpnGatewayAttributesResponse.sslMaxConnections) &&
        Objects.equals(this.status, describeVpnGatewayAttributesResponse.status) &&
        Objects.equals(this.subnetId, describeVpnGatewayAttributesResponse.subnetId) &&
        Objects.equals(this.tags, describeVpnGatewayAttributesResponse.tags) &&
        Objects.equals(this.updateTime, describeVpnGatewayAttributesResponse.updateTime) &&
        Objects.equals(this.vpcId, describeVpnGatewayAttributesResponse.vpcId) &&
        Objects.equals(this.vpnGatewayId, describeVpnGatewayAttributesResponse.vpnGatewayId) &&
        Objects.equals(this.vpnGatewayName, describeVpnGatewayAttributesResponse.vpnGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, asn, bandwidth, billingType, businessStatus, connectionCount, creationTime, deletedTime, description, dualTunnelEnabled, expiredTime, ipAddress, ipsecEnabled, isBlocked, lockReason, overdueTime, projectName, requestId, routeCount, secondaryIpAddress, secondarySubnetId, sslEnabled, sslMaxConnection, sslMaxConnections, status, subnetId, tags, updateTime, vpcId, vpnGatewayId, vpnGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnGatewayAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dualTunnelEnabled: ").append(toIndentedString(dualTunnelEnabled)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipsecEnabled: ").append(toIndentedString(ipsecEnabled)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    routeCount: ").append(toIndentedString(routeCount)).append("\n");
    sb.append("    secondaryIpAddress: ").append(toIndentedString(secondaryIpAddress)).append("\n");
    sb.append("    secondarySubnetId: ").append(toIndentedString(secondarySubnetId)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    sslMaxConnection: ").append(toIndentedString(sslMaxConnection)).append("\n");
    sb.append("    sslMaxConnections: ").append(toIndentedString(sslMaxConnections)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
