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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpnGatewayRoutesRequest
 */



public class DescribeVpnGatewayRoutesRequest {
  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  @SerializedName("VpnGatewayRouteIds")
  private List<String> vpnGatewayRouteIds = null;

  public DescribeVpnGatewayRoutesRequest destinationCidrBlock(String destinationCidrBlock) {
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

  public DescribeVpnGatewayRoutesRequest nextHopId(String nextHopId) {
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

  public DescribeVpnGatewayRoutesRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeVpnGatewayRoutesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeVpnGatewayRoutesRequest vpnGatewayId(String vpnGatewayId) {
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

  public DescribeVpnGatewayRoutesRequest vpnGatewayRouteIds(List<String> vpnGatewayRouteIds) {
    this.vpnGatewayRouteIds = vpnGatewayRouteIds;
    return this;
  }

  public DescribeVpnGatewayRoutesRequest addVpnGatewayRouteIdsItem(String vpnGatewayRouteIdsItem) {
    if (this.vpnGatewayRouteIds == null) {
      this.vpnGatewayRouteIds = new ArrayList<String>();
    }
    this.vpnGatewayRouteIds.add(vpnGatewayRouteIdsItem);
    return this;
  }

   /**
   * Get vpnGatewayRouteIds
   * @return vpnGatewayRouteIds
  **/
  @Schema(description = "")
  public List<String> getVpnGatewayRouteIds() {
    return vpnGatewayRouteIds;
  }

  public void setVpnGatewayRouteIds(List<String> vpnGatewayRouteIds) {
    this.vpnGatewayRouteIds = vpnGatewayRouteIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnGatewayRoutesRequest describeVpnGatewayRoutesRequest = (DescribeVpnGatewayRoutesRequest) o;
    return Objects.equals(this.destinationCidrBlock, describeVpnGatewayRoutesRequest.destinationCidrBlock) &&
        Objects.equals(this.nextHopId, describeVpnGatewayRoutesRequest.nextHopId) &&
        Objects.equals(this.pageNumber, describeVpnGatewayRoutesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVpnGatewayRoutesRequest.pageSize) &&
        Objects.equals(this.vpnGatewayId, describeVpnGatewayRoutesRequest.vpnGatewayId) &&
        Objects.equals(this.vpnGatewayRouteIds, describeVpnGatewayRoutesRequest.vpnGatewayRouteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationCidrBlock, nextHopId, pageNumber, pageSize, vpnGatewayId, vpnGatewayRouteIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnGatewayRoutesRequest {\n");
    
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
    sb.append("    vpnGatewayRouteIds: ").append(toIndentedString(vpnGatewayRouteIds)).append("\n");
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
