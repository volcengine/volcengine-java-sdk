/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.clb.model;

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
 * LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:20:52.429083+08:00[Asia/Shanghai]")
public class LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput {
  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("InstanceStatus")
  private Integer instanceStatus = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("OverdueReclaimTime")
  private String overdueReclaimTime = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ReclaimTime")
  private String reclaimTime = null;

  @SerializedName("RemainRenewTimes")
  private Integer remainRenewTimes = null;

  @SerializedName("RenewPeriodTimes")
  private Integer renewPeriodTimes = null;

  @SerializedName("RenewType")
  private Integer renewType = null;

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput billingType(Integer billingType) {
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

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput expiredTime(String expiredTime) {
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

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput instanceStatus(Integer instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public Integer getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(Integer instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput loadBalancerId(String loadBalancerId) {
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

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput overdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
    return this;
  }

   /**
   * Get overdueReclaimTime
   * @return overdueReclaimTime
  **/
  @Schema(description = "")
  public String getOverdueReclaimTime() {
    return overdueReclaimTime;
  }

  public void setOverdueReclaimTime(String overdueReclaimTime) {
    this.overdueReclaimTime = overdueReclaimTime;
  }

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput overdueTime(String overdueTime) {
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

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput reclaimTime(String reclaimTime) {
    this.reclaimTime = reclaimTime;
    return this;
  }

   /**
   * Get reclaimTime
   * @return reclaimTime
  **/
  @Schema(description = "")
  public String getReclaimTime() {
    return reclaimTime;
  }

  public void setReclaimTime(String reclaimTime) {
    this.reclaimTime = reclaimTime;
  }

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput remainRenewTimes(Integer remainRenewTimes) {
    this.remainRenewTimes = remainRenewTimes;
    return this;
  }

   /**
   * Get remainRenewTimes
   * @return remainRenewTimes
  **/
  @Schema(description = "")
  public Integer getRemainRenewTimes() {
    return remainRenewTimes;
  }

  public void setRemainRenewTimes(Integer remainRenewTimes) {
    this.remainRenewTimes = remainRenewTimes;
  }

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput renewPeriodTimes(Integer renewPeriodTimes) {
    this.renewPeriodTimes = renewPeriodTimes;
    return this;
  }

   /**
   * Get renewPeriodTimes
   * @return renewPeriodTimes
  **/
  @Schema(description = "")
  public Integer getRenewPeriodTimes() {
    return renewPeriodTimes;
  }

  public void setRenewPeriodTimes(Integer renewPeriodTimes) {
    this.renewPeriodTimes = renewPeriodTimes;
  }

  public LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput renewType(Integer renewType) {
    this.renewType = renewType;
    return this;
  }

   /**
   * Get renewType
   * @return renewType
  **/
  @Schema(description = "")
  public Integer getRenewType() {
    return renewType;
  }

  public void setRenewType(Integer renewType) {
    this.renewType = renewType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput = (LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput) o;
    return Objects.equals(this.billingType, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.billingType) &&
        Objects.equals(this.expiredTime, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.expiredTime) &&
        Objects.equals(this.instanceStatus, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.instanceStatus) &&
        Objects.equals(this.loadBalancerId, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.loadBalancerId) &&
        Objects.equals(this.overdueReclaimTime, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.overdueReclaimTime) &&
        Objects.equals(this.overdueTime, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.overdueTime) &&
        Objects.equals(this.reclaimTime, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.reclaimTime) &&
        Objects.equals(this.remainRenewTimes, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.remainRenewTimes) &&
        Objects.equals(this.renewPeriodTimes, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.renewPeriodTimes) &&
        Objects.equals(this.renewType, loadBalancerBillingConfigForDescribeLoadBalancersBillingOutput.renewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingType, expiredTime, instanceStatus, loadBalancerId, overdueReclaimTime, overdueTime, reclaimTime, remainRenewTimes, renewPeriodTimes, renewType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerBillingConfigForDescribeLoadBalancersBillingOutput {\n");
    
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    overdueReclaimTime: ").append(toIndentedString(overdueReclaimTime)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    reclaimTime: ").append(toIndentedString(reclaimTime)).append("\n");
    sb.append("    remainRenewTimes: ").append(toIndentedString(remainRenewTimes)).append("\n");
    sb.append("    renewPeriodTimes: ").append(toIndentedString(renewPeriodTimes)).append("\n");
    sb.append("    renewType: ").append(toIndentedString(renewType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
