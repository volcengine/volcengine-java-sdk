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

package com.volcengine.volcstack.vpn.model;

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
 * VpnGatewayForDescribeVpnGatewaysBillingOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-24T18:21:18.622599+08:00[Asia/Shanghai]")
public class VpnGatewayForDescribeVpnGatewaysBillingOutput {
  @SerializedName("BillingStatus")
  private Integer billingStatus = null;

  @SerializedName("BillingType")
  private Integer billingType = null;

  @SerializedName("ExpiredTime")
  private String expiredTime = null;

  @SerializedName("ReclaimTime")
  private String reclaimTime = null;

  @SerializedName("RemainRenewTimes")
  private Integer remainRenewTimes = null;

  @SerializedName("RenewType")
  private Integer renewType = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  public VpnGatewayForDescribeVpnGatewaysBillingOutput billingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
    return this;
  }

   /**
   * Get billingStatus
   * @return billingStatus
  **/
  @Schema(description = "")
  public Integer getBillingStatus() {
    return billingStatus;
  }

  public void setBillingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
  }

  public VpnGatewayForDescribeVpnGatewaysBillingOutput billingType(Integer billingType) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput expiredTime(String expiredTime) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput reclaimTime(String reclaimTime) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput remainRenewTimes(Integer remainRenewTimes) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput renewType(Integer renewType) {
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

  public VpnGatewayForDescribeVpnGatewaysBillingOutput vpnGatewayId(String vpnGatewayId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VpnGatewayForDescribeVpnGatewaysBillingOutput vpnGatewayForDescribeVpnGatewaysBillingOutput = (VpnGatewayForDescribeVpnGatewaysBillingOutput) o;
    return Objects.equals(this.billingStatus, vpnGatewayForDescribeVpnGatewaysBillingOutput.billingStatus) &&
        Objects.equals(this.billingType, vpnGatewayForDescribeVpnGatewaysBillingOutput.billingType) &&
        Objects.equals(this.expiredTime, vpnGatewayForDescribeVpnGatewaysBillingOutput.expiredTime) &&
        Objects.equals(this.reclaimTime, vpnGatewayForDescribeVpnGatewaysBillingOutput.reclaimTime) &&
        Objects.equals(this.remainRenewTimes, vpnGatewayForDescribeVpnGatewaysBillingOutput.remainRenewTimes) &&
        Objects.equals(this.renewType, vpnGatewayForDescribeVpnGatewaysBillingOutput.renewType) &&
        Objects.equals(this.vpnGatewayId, vpnGatewayForDescribeVpnGatewaysBillingOutput.vpnGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingStatus, billingType, expiredTime, reclaimTime, remainRenewTimes, renewType, vpnGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VpnGatewayForDescribeVpnGatewaysBillingOutput {\n");
    
    sb.append("    billingStatus: ").append(toIndentedString(billingStatus)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
    sb.append("    reclaimTime: ").append(toIndentedString(reclaimTime)).append("\n");
    sb.append("    remainRenewTimes: ").append(toIndentedString(remainRenewTimes)).append("\n");
    sb.append("    renewType: ").append(toIndentedString(renewType)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
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
