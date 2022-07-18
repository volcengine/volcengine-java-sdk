/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * LoadBalancerForDescribeLoadBalancersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-18T11:53:48.716788+08:00[Asia/Shanghai]")
public class LoadBalancerForDescribeLoadBalancersOutput {
  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("EniAddress")
  private String eniAddress = null;

  @SerializedName("EniId")
  private String eniId = null;

  @SerializedName("LoadBalancerBillingType")
  private Integer loadBalancerBillingType = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("LoadBalancerName")
  private String loadBalancerName = null;

  @SerializedName("LoadBalancerSpec")
  private String loadBalancerSpec = null;

  @SerializedName("LockReason")
  private String lockReason = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public LoadBalancerForDescribeLoadBalancersOutput businessStatus(String businessStatus) {
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

  public LoadBalancerForDescribeLoadBalancersOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public LoadBalancerForDescribeLoadBalancersOutput deletedTime(String deletedTime) {
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

  public LoadBalancerForDescribeLoadBalancersOutput description(String description) {
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

  public LoadBalancerForDescribeLoadBalancersOutput eipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Schema(description = "")
  public String getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
  }

  public LoadBalancerForDescribeLoadBalancersOutput eipId(String eipId) {
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

  public LoadBalancerForDescribeLoadBalancersOutput eniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
    return this;
  }

   /**
   * Get eniAddress
   * @return eniAddress
  **/
  @Schema(description = "")
  public String getEniAddress() {
    return eniAddress;
  }

  public void setEniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
  }

  public LoadBalancerForDescribeLoadBalancersOutput eniId(String eniId) {
    this.eniId = eniId;
    return this;
  }

   /**
   * Get eniId
   * @return eniId
  **/
  @Schema(description = "")
  public String getEniId() {
    return eniId;
  }

  public void setEniId(String eniId) {
    this.eniId = eniId;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
    return this;
  }

   /**
   * Get loadBalancerBillingType
   * @return loadBalancerBillingType
  **/
  @Schema(description = "")
  public Integer getLoadBalancerBillingType() {
    return loadBalancerBillingType;
  }

  public void setLoadBalancerBillingType(Integer loadBalancerBillingType) {
    this.loadBalancerBillingType = loadBalancerBillingType;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * Get loadBalancerName
   * @return loadBalancerName
  **/
  @Schema(description = "")
  public String getLoadBalancerName() {
    return loadBalancerName;
  }

  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }

  public LoadBalancerForDescribeLoadBalancersOutput loadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
    return this;
  }

   /**
   * Get loadBalancerSpec
   * @return loadBalancerSpec
  **/
  @Schema(description = "")
  public String getLoadBalancerSpec() {
    return loadBalancerSpec;
  }

  public void setLoadBalancerSpec(String loadBalancerSpec) {
    this.loadBalancerSpec = loadBalancerSpec;
  }

  public LoadBalancerForDescribeLoadBalancersOutput lockReason(String lockReason) {
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

  public LoadBalancerForDescribeLoadBalancersOutput overdueTime(String overdueTime) {
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

  public LoadBalancerForDescribeLoadBalancersOutput status(String status) {
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

  public LoadBalancerForDescribeLoadBalancersOutput subnetId(String subnetId) {
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

  public LoadBalancerForDescribeLoadBalancersOutput type(String type) {
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

  public LoadBalancerForDescribeLoadBalancersOutput updateTime(String updateTime) {
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

  public LoadBalancerForDescribeLoadBalancersOutput vpcId(String vpcId) {
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
    LoadBalancerForDescribeLoadBalancersOutput loadBalancerForDescribeLoadBalancersOutput = (LoadBalancerForDescribeLoadBalancersOutput) o;
    return Objects.equals(this.businessStatus, loadBalancerForDescribeLoadBalancersOutput.businessStatus) &&
        Objects.equals(this.createTime, loadBalancerForDescribeLoadBalancersOutput.createTime) &&
        Objects.equals(this.deletedTime, loadBalancerForDescribeLoadBalancersOutput.deletedTime) &&
        Objects.equals(this.description, loadBalancerForDescribeLoadBalancersOutput.description) &&
        Objects.equals(this.eipAddress, loadBalancerForDescribeLoadBalancersOutput.eipAddress) &&
        Objects.equals(this.eipId, loadBalancerForDescribeLoadBalancersOutput.eipId) &&
        Objects.equals(this.eniAddress, loadBalancerForDescribeLoadBalancersOutput.eniAddress) &&
        Objects.equals(this.eniId, loadBalancerForDescribeLoadBalancersOutput.eniId) &&
        Objects.equals(this.loadBalancerBillingType, loadBalancerForDescribeLoadBalancersOutput.loadBalancerBillingType) &&
        Objects.equals(this.loadBalancerId, loadBalancerForDescribeLoadBalancersOutput.loadBalancerId) &&
        Objects.equals(this.loadBalancerName, loadBalancerForDescribeLoadBalancersOutput.loadBalancerName) &&
        Objects.equals(this.loadBalancerSpec, loadBalancerForDescribeLoadBalancersOutput.loadBalancerSpec) &&
        Objects.equals(this.lockReason, loadBalancerForDescribeLoadBalancersOutput.lockReason) &&
        Objects.equals(this.overdueTime, loadBalancerForDescribeLoadBalancersOutput.overdueTime) &&
        Objects.equals(this.status, loadBalancerForDescribeLoadBalancersOutput.status) &&
        Objects.equals(this.subnetId, loadBalancerForDescribeLoadBalancersOutput.subnetId) &&
        Objects.equals(this.type, loadBalancerForDescribeLoadBalancersOutput.type) &&
        Objects.equals(this.updateTime, loadBalancerForDescribeLoadBalancersOutput.updateTime) &&
        Objects.equals(this.vpcId, loadBalancerForDescribeLoadBalancersOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessStatus, createTime, deletedTime, description, eipAddress, eipId, eniAddress, eniId, loadBalancerBillingType, loadBalancerId, loadBalancerName, loadBalancerSpec, lockReason, overdueTime, status, subnetId, type, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerForDescribeLoadBalancersOutput {\n");
    
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    eniAddress: ").append(toIndentedString(eniAddress)).append("\n");
    sb.append("    eniId: ").append(toIndentedString(eniId)).append("\n");
    sb.append("    loadBalancerBillingType: ").append(toIndentedString(loadBalancerBillingType)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    loadBalancerSpec: ").append(toIndentedString(loadBalancerSpec)).append("\n");
    sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
