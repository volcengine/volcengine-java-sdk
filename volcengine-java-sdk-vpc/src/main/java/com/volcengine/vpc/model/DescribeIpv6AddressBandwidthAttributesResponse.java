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
import com.volcengine.vpc.model.TagForDescribeIpv6AddressBandwidthAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeIpv6AddressBandwidthAttributesResponse
 */



public class DescribeIpv6AddressBandwidthAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AllocationId")
  private String allocationId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BandwidthPackageId")
  private String bandwidthPackageId = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeleteTime")
  private String deleteTime = null;

  @SerializedName("ISP")
  private String ISP = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("Ipv6Address")
  private String ipv6Address = null;

  @SerializedName("Ipv6GatewayId")
  private String ipv6GatewayId = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("NetworkType")
  private String networkType = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ServiceManaged")
  private Boolean serviceManaged = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeIpv6AddressBandwidthAttributesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public DescribeIpv6AddressBandwidthAttributesResponse allocationId(String allocationId) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse bandwidth(Integer bandwidth) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse bandwidthPackageId(String bandwidthPackageId) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse billingType(Integer billingType) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse businessStatus(String businessStatus) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse creationTime(String creationTime) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse deleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

   /**
   * Get deleteTime
   * @return deleteTime
  **/
  @Schema(description = "")
  public String getDeleteTime() {
    return deleteTime;
  }

  public void setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse ISP(String ISP) {
    this.ISP = ISP;
    return this;
  }

   /**
   * Get ISP
   * @return ISP
  **/
  @Schema(description = "")
  public String getISP() {
    return ISP;
  }

  public void setISP(String ISP) {
    this.ISP = ISP;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

   /**
   * Get ipv6Address
   * @return ipv6Address
  **/
  @Schema(description = "")
  public String getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse ipv6GatewayId(String ipv6GatewayId) {
    this.ipv6GatewayId = ipv6GatewayId;
    return this;
  }

   /**
   * Get ipv6GatewayId
   * @return ipv6GatewayId
  **/
  @Schema(description = "")
  public String getIpv6GatewayId() {
    return ipv6GatewayId;
  }

  public void setIpv6GatewayId(String ipv6GatewayId) {
    this.ipv6GatewayId = ipv6GatewayId;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse lockReason(String lockReason) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Get networkType
   * @return networkType
  **/
  @Schema(description = "")
  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse overdueTime(String overdueTime) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse projectName(String projectName) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse requestId(String requestId) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse serviceManaged(Boolean serviceManaged) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse status(String status) {
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

  public DescribeIpv6AddressBandwidthAttributesResponse tags(List<TagForDescribeIpv6AddressBandwidthAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse addTagsItem(TagForDescribeIpv6AddressBandwidthAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeIpv6AddressBandwidthAttributesOutput>();
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
  public List<TagForDescribeIpv6AddressBandwidthAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeIpv6AddressBandwidthAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeIpv6AddressBandwidthAttributesResponse updateTime(String updateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeIpv6AddressBandwidthAttributesResponse describeIpv6AddressBandwidthAttributesResponse = (DescribeIpv6AddressBandwidthAttributesResponse) o;
    return Objects.equals(this.allocationId, describeIpv6AddressBandwidthAttributesResponse.allocationId) &&
        Objects.equals(this.bandwidth, describeIpv6AddressBandwidthAttributesResponse.bandwidth) &&
        Objects.equals(this.bandwidthPackageId, describeIpv6AddressBandwidthAttributesResponse.bandwidthPackageId) &&
        Objects.equals(this.billingType, describeIpv6AddressBandwidthAttributesResponse.billingType) &&
        Objects.equals(this.businessStatus, describeIpv6AddressBandwidthAttributesResponse.businessStatus) &&
        Objects.equals(this.creationTime, describeIpv6AddressBandwidthAttributesResponse.creationTime) &&
        Objects.equals(this.deleteTime, describeIpv6AddressBandwidthAttributesResponse.deleteTime) &&
        Objects.equals(this.ISP, describeIpv6AddressBandwidthAttributesResponse.ISP) &&
        Objects.equals(this.instanceId, describeIpv6AddressBandwidthAttributesResponse.instanceId) &&
        Objects.equals(this.instanceType, describeIpv6AddressBandwidthAttributesResponse.instanceType) &&
        Objects.equals(this.ipv6Address, describeIpv6AddressBandwidthAttributesResponse.ipv6Address) &&
        Objects.equals(this.ipv6GatewayId, describeIpv6AddressBandwidthAttributesResponse.ipv6GatewayId) &&
        Objects.equals(this.lockReason, describeIpv6AddressBandwidthAttributesResponse.lockReason) &&
        Objects.equals(this.networkType, describeIpv6AddressBandwidthAttributesResponse.networkType) &&
        Objects.equals(this.overdueTime, describeIpv6AddressBandwidthAttributesResponse.overdueTime) &&
        Objects.equals(this.projectName, describeIpv6AddressBandwidthAttributesResponse.projectName) &&
        Objects.equals(this.requestId, describeIpv6AddressBandwidthAttributesResponse.requestId) &&
        Objects.equals(this.serviceManaged, describeIpv6AddressBandwidthAttributesResponse.serviceManaged) &&
        Objects.equals(this.status, describeIpv6AddressBandwidthAttributesResponse.status) &&
        Objects.equals(this.tags, describeIpv6AddressBandwidthAttributesResponse.tags) &&
        Objects.equals(this.updateTime, describeIpv6AddressBandwidthAttributesResponse.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, bandwidth, bandwidthPackageId, billingType, businessStatus, creationTime, deleteTime, ISP, instanceId, instanceType, ipv6Address, ipv6GatewayId, lockReason, networkType, overdueTime, projectName, requestId, serviceManaged, status, tags, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeIpv6AddressBandwidthAttributesResponse {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
    sb.append("    ISP: ").append(toIndentedString(ISP)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    ipv6GatewayId: ").append(toIndentedString(ipv6GatewayId)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    serviceManaged: ").append(toIndentedString(serviceManaged)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
