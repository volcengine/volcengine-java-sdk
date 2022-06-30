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
 * DescribeVpnGatewayRouteAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:32.674934+08:00[Asia/Shanghai]")
public class DescribeVpnGatewayRouteAttributesResponse {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  @SerializedName("VpnGatewayRouteId")
  private String vpnGatewayRouteId = null;

  public DescribeVpnGatewayRouteAttributesResponse creationTime(String creationTime) {
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

  public DescribeVpnGatewayRouteAttributesResponse destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @Schema(description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public DescribeVpnGatewayRouteAttributesResponse nextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
    return this;
  }

   /**
   * Get nextHopId
   * @return nextHopId
  **/
  @Schema(description = "")
  public String getNextHopId() {
    return nextHopId;
  }

  public void setNextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
  }

  public DescribeVpnGatewayRouteAttributesResponse requestId(String requestId) {
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

  public DescribeVpnGatewayRouteAttributesResponse status(String status) {
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

  public DescribeVpnGatewayRouteAttributesResponse updateTime(String updateTime) {
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

  public DescribeVpnGatewayRouteAttributesResponse vpnGatewayId(String vpnGatewayId) {
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

  public DescribeVpnGatewayRouteAttributesResponse vpnGatewayRouteId(String vpnGatewayRouteId) {
    this.vpnGatewayRouteId = vpnGatewayRouteId;
    return this;
  }

   /**
   * Get vpnGatewayRouteId
   * @return vpnGatewayRouteId
  **/
  @Schema(description = "")
  public String getVpnGatewayRouteId() {
    return vpnGatewayRouteId;
  }

  public void setVpnGatewayRouteId(String vpnGatewayRouteId) {
    this.vpnGatewayRouteId = vpnGatewayRouteId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnGatewayRouteAttributesResponse describeVpnGatewayRouteAttributesResponse = (DescribeVpnGatewayRouteAttributesResponse) o;
    return Objects.equals(this.creationTime, describeVpnGatewayRouteAttributesResponse.creationTime) &&
        Objects.equals(this.destinationCidrBlock, describeVpnGatewayRouteAttributesResponse.destinationCidrBlock) &&
        Objects.equals(this.nextHopId, describeVpnGatewayRouteAttributesResponse.nextHopId) &&
        Objects.equals(this.requestId, describeVpnGatewayRouteAttributesResponse.requestId) &&
        Objects.equals(this.status, describeVpnGatewayRouteAttributesResponse.status) &&
        Objects.equals(this.updateTime, describeVpnGatewayRouteAttributesResponse.updateTime) &&
        Objects.equals(this.vpnGatewayId, describeVpnGatewayRouteAttributesResponse.vpnGatewayId) &&
        Objects.equals(this.vpnGatewayRouteId, describeVpnGatewayRouteAttributesResponse.vpnGatewayRouteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, destinationCidrBlock, nextHopId, requestId, status, updateTime, vpnGatewayId, vpnGatewayRouteId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnGatewayRouteAttributesResponse {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
    sb.append("    vpnGatewayRouteId: ").append(toIndentedString(vpnGatewayRouteId)).append("\n");
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
