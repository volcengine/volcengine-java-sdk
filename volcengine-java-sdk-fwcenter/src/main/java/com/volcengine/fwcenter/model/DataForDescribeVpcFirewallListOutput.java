/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

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
 * DataForDescribeVpcFirewallListOutput
 */



public class DataForDescribeVpcFirewallListOutput {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BypassStatus")
  private String bypassStatus = null;

  @SerializedName("ErrMessage")
  private String errMessage = null;

  @SerializedName("FirewallStatus")
  private String firewallStatus = null;

  @SerializedName("PeakTrafficWithin7Day")
  private Integer peakTrafficWithin7Day = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("RouteMode")
  private String routeMode = null;

  @SerializedName("RoutePolicyStatus")
  private String routePolicyStatus = null;

  @SerializedName("TransitRouterDescription")
  private String transitRouterDescription = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("TransitRouterName")
  private String transitRouterName = null;

  @SerializedName("VpcFirewallId")
  private String vpcFirewallId = null;

  @SerializedName("VpcFirewallName")
  private String vpcFirewallName = null;

  public DataForDescribeVpcFirewallListOutput bandwidth(Integer bandwidth) {
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

  public DataForDescribeVpcFirewallListOutput bypassStatus(String bypassStatus) {
    this.bypassStatus = bypassStatus;
    return this;
  }

   /**
   * Get bypassStatus
   * @return bypassStatus
  **/
  @Schema(description = "")
  public String getBypassStatus() {
    return bypassStatus;
  }

  public void setBypassStatus(String bypassStatus) {
    this.bypassStatus = bypassStatus;
  }

  public DataForDescribeVpcFirewallListOutput errMessage(String errMessage) {
    this.errMessage = errMessage;
    return this;
  }

   /**
   * Get errMessage
   * @return errMessage
  **/
  @Schema(description = "")
  public String getErrMessage() {
    return errMessage;
  }

  public void setErrMessage(String errMessage) {
    this.errMessage = errMessage;
  }

  public DataForDescribeVpcFirewallListOutput firewallStatus(String firewallStatus) {
    this.firewallStatus = firewallStatus;
    return this;
  }

   /**
   * Get firewallStatus
   * @return firewallStatus
  **/
  @Schema(description = "")
  public String getFirewallStatus() {
    return firewallStatus;
  }

  public void setFirewallStatus(String firewallStatus) {
    this.firewallStatus = firewallStatus;
  }

  public DataForDescribeVpcFirewallListOutput peakTrafficWithin7Day(Integer peakTrafficWithin7Day) {
    this.peakTrafficWithin7Day = peakTrafficWithin7Day;
    return this;
  }

   /**
   * Get peakTrafficWithin7Day
   * @return peakTrafficWithin7Day
  **/
  @Schema(description = "")
  public Integer getPeakTrafficWithin7Day() {
    return peakTrafficWithin7Day;
  }

  public void setPeakTrafficWithin7Day(Integer peakTrafficWithin7Day) {
    this.peakTrafficWithin7Day = peakTrafficWithin7Day;
  }

  public DataForDescribeVpcFirewallListOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public DataForDescribeVpcFirewallListOutput routeMode(String routeMode) {
    this.routeMode = routeMode;
    return this;
  }

   /**
   * Get routeMode
   * @return routeMode
  **/
  @Schema(description = "")
  public String getRouteMode() {
    return routeMode;
  }

  public void setRouteMode(String routeMode) {
    this.routeMode = routeMode;
  }

  public DataForDescribeVpcFirewallListOutput routePolicyStatus(String routePolicyStatus) {
    this.routePolicyStatus = routePolicyStatus;
    return this;
  }

   /**
   * Get routePolicyStatus
   * @return routePolicyStatus
  **/
  @Schema(description = "")
  public String getRoutePolicyStatus() {
    return routePolicyStatus;
  }

  public void setRoutePolicyStatus(String routePolicyStatus) {
    this.routePolicyStatus = routePolicyStatus;
  }

  public DataForDescribeVpcFirewallListOutput transitRouterDescription(String transitRouterDescription) {
    this.transitRouterDescription = transitRouterDescription;
    return this;
  }

   /**
   * Get transitRouterDescription
   * @return transitRouterDescription
  **/
  @Schema(description = "")
  public String getTransitRouterDescription() {
    return transitRouterDescription;
  }

  public void setTransitRouterDescription(String transitRouterDescription) {
    this.transitRouterDescription = transitRouterDescription;
  }

  public DataForDescribeVpcFirewallListOutput transitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
    return this;
  }

   /**
   * Get transitRouterId
   * @return transitRouterId
  **/
  @Schema(description = "")
  public String getTransitRouterId() {
    return transitRouterId;
  }

  public void setTransitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
  }

  public DataForDescribeVpcFirewallListOutput transitRouterName(String transitRouterName) {
    this.transitRouterName = transitRouterName;
    return this;
  }

   /**
   * Get transitRouterName
   * @return transitRouterName
  **/
  @Schema(description = "")
  public String getTransitRouterName() {
    return transitRouterName;
  }

  public void setTransitRouterName(String transitRouterName) {
    this.transitRouterName = transitRouterName;
  }

  public DataForDescribeVpcFirewallListOutput vpcFirewallId(String vpcFirewallId) {
    this.vpcFirewallId = vpcFirewallId;
    return this;
  }

   /**
   * Get vpcFirewallId
   * @return vpcFirewallId
  **/
  @Schema(description = "")
  public String getVpcFirewallId() {
    return vpcFirewallId;
  }

  public void setVpcFirewallId(String vpcFirewallId) {
    this.vpcFirewallId = vpcFirewallId;
  }

  public DataForDescribeVpcFirewallListOutput vpcFirewallName(String vpcFirewallName) {
    this.vpcFirewallName = vpcFirewallName;
    return this;
  }

   /**
   * Get vpcFirewallName
   * @return vpcFirewallName
  **/
  @Schema(description = "")
  public String getVpcFirewallName() {
    return vpcFirewallName;
  }

  public void setVpcFirewallName(String vpcFirewallName) {
    this.vpcFirewallName = vpcFirewallName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForDescribeVpcFirewallListOutput dataForDescribeVpcFirewallListOutput = (DataForDescribeVpcFirewallListOutput) o;
    return Objects.equals(this.bandwidth, dataForDescribeVpcFirewallListOutput.bandwidth) &&
        Objects.equals(this.bypassStatus, dataForDescribeVpcFirewallListOutput.bypassStatus) &&
        Objects.equals(this.errMessage, dataForDescribeVpcFirewallListOutput.errMessage) &&
        Objects.equals(this.firewallStatus, dataForDescribeVpcFirewallListOutput.firewallStatus) &&
        Objects.equals(this.peakTrafficWithin7Day, dataForDescribeVpcFirewallListOutput.peakTrafficWithin7Day) &&
        Objects.equals(this.region, dataForDescribeVpcFirewallListOutput.region) &&
        Objects.equals(this.routeMode, dataForDescribeVpcFirewallListOutput.routeMode) &&
        Objects.equals(this.routePolicyStatus, dataForDescribeVpcFirewallListOutput.routePolicyStatus) &&
        Objects.equals(this.transitRouterDescription, dataForDescribeVpcFirewallListOutput.transitRouterDescription) &&
        Objects.equals(this.transitRouterId, dataForDescribeVpcFirewallListOutput.transitRouterId) &&
        Objects.equals(this.transitRouterName, dataForDescribeVpcFirewallListOutput.transitRouterName) &&
        Objects.equals(this.vpcFirewallId, dataForDescribeVpcFirewallListOutput.vpcFirewallId) &&
        Objects.equals(this.vpcFirewallName, dataForDescribeVpcFirewallListOutput.vpcFirewallName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, bypassStatus, errMessage, firewallStatus, peakTrafficWithin7Day, region, routeMode, routePolicyStatus, transitRouterDescription, transitRouterId, transitRouterName, vpcFirewallId, vpcFirewallName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForDescribeVpcFirewallListOutput {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    bypassStatus: ").append(toIndentedString(bypassStatus)).append("\n");
    sb.append("    errMessage: ").append(toIndentedString(errMessage)).append("\n");
    sb.append("    firewallStatus: ").append(toIndentedString(firewallStatus)).append("\n");
    sb.append("    peakTrafficWithin7Day: ").append(toIndentedString(peakTrafficWithin7Day)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
    sb.append("    routePolicyStatus: ").append(toIndentedString(routePolicyStatus)).append("\n");
    sb.append("    transitRouterDescription: ").append(toIndentedString(transitRouterDescription)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
    sb.append("    transitRouterName: ").append(toIndentedString(transitRouterName)).append("\n");
    sb.append("    vpcFirewallId: ").append(toIndentedString(vpcFirewallId)).append("\n");
    sb.append("    vpcFirewallName: ").append(toIndentedString(vpcFirewallName)).append("\n");
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
