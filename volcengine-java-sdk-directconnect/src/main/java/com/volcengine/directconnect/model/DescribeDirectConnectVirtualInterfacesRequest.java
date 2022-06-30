/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * DescribeDirectConnectVirtualInterfacesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:09.552456+08:00[Asia/Shanghai]")
public class DescribeDirectConnectVirtualInterfacesRequest {
  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("LocalIp")
  private String localIp = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("PeerIp")
  private String peerIp = null;

  @SerializedName("RouteType")
  private String routeType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("VirtualInterfaceIds")
  private List<String> virtualInterfaceIds = null;

  @SerializedName("VirtualInterfaceName")
  private String virtualInterfaceName = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public DescribeDirectConnectVirtualInterfacesRequest directConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
    return this;
  }

   /**
   * Get directConnectConnectionId
   * @return directConnectConnectionId
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionId() {
    return directConnectConnectionId;
  }

  public void setDirectConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
  }

  public DescribeDirectConnectVirtualInterfacesRequest directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public DescribeDirectConnectVirtualInterfacesRequest localIp(String localIp) {
    this.localIp = localIp;
    return this;
  }

   /**
   * Get localIp
   * @return localIp
  **/
  @Schema(description = "")
  public String getLocalIp() {
    return localIp;
  }

  public void setLocalIp(String localIp) {
    this.localIp = localIp;
  }

  public DescribeDirectConnectVirtualInterfacesRequest pageNumber(Integer pageNumber) {
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

  public DescribeDirectConnectVirtualInterfacesRequest pageSize(Integer pageSize) {
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

  public DescribeDirectConnectVirtualInterfacesRequest peerIp(String peerIp) {
    this.peerIp = peerIp;
    return this;
  }

   /**
   * Get peerIp
   * @return peerIp
  **/
  @Schema(description = "")
  public String getPeerIp() {
    return peerIp;
  }

  public void setPeerIp(String peerIp) {
    this.peerIp = peerIp;
  }

  public DescribeDirectConnectVirtualInterfacesRequest routeType(String routeType) {
    this.routeType = routeType;
    return this;
  }

   /**
   * Get routeType
   * @return routeType
  **/
  @Schema(description = "")
  public String getRouteType() {
    return routeType;
  }

  public void setRouteType(String routeType) {
    this.routeType = routeType;
  }

  public DescribeDirectConnectVirtualInterfacesRequest status(String status) {
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

  public DescribeDirectConnectVirtualInterfacesRequest virtualInterfaceIds(List<String> virtualInterfaceIds) {
    this.virtualInterfaceIds = virtualInterfaceIds;
    return this;
  }

  public DescribeDirectConnectVirtualInterfacesRequest addVirtualInterfaceIdsItem(String virtualInterfaceIdsItem) {
    if (this.virtualInterfaceIds == null) {
      this.virtualInterfaceIds = new ArrayList<String>();
    }
    this.virtualInterfaceIds.add(virtualInterfaceIdsItem);
    return this;
  }

   /**
   * Get virtualInterfaceIds
   * @return virtualInterfaceIds
  **/
  @Schema(description = "")
  public List<String> getVirtualInterfaceIds() {
    return virtualInterfaceIds;
  }

  public void setVirtualInterfaceIds(List<String> virtualInterfaceIds) {
    this.virtualInterfaceIds = virtualInterfaceIds;
  }

  public DescribeDirectConnectVirtualInterfacesRequest virtualInterfaceName(String virtualInterfaceName) {
    this.virtualInterfaceName = virtualInterfaceName;
    return this;
  }

   /**
   * Get virtualInterfaceName
   * @return virtualInterfaceName
  **/
  @Schema(description = "")
  public String getVirtualInterfaceName() {
    return virtualInterfaceName;
  }

  public void setVirtualInterfaceName(String virtualInterfaceName) {
    this.virtualInterfaceName = virtualInterfaceName;
  }

  public DescribeDirectConnectVirtualInterfacesRequest vlanId(Integer vlanId) {
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @Schema(description = "")
  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectVirtualInterfacesRequest describeDirectConnectVirtualInterfacesRequest = (DescribeDirectConnectVirtualInterfacesRequest) o;
    return Objects.equals(this.directConnectConnectionId, describeDirectConnectVirtualInterfacesRequest.directConnectConnectionId) &&
        Objects.equals(this.directConnectGatewayId, describeDirectConnectVirtualInterfacesRequest.directConnectGatewayId) &&
        Objects.equals(this.localIp, describeDirectConnectVirtualInterfacesRequest.localIp) &&
        Objects.equals(this.pageNumber, describeDirectConnectVirtualInterfacesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDirectConnectVirtualInterfacesRequest.pageSize) &&
        Objects.equals(this.peerIp, describeDirectConnectVirtualInterfacesRequest.peerIp) &&
        Objects.equals(this.routeType, describeDirectConnectVirtualInterfacesRequest.routeType) &&
        Objects.equals(this.status, describeDirectConnectVirtualInterfacesRequest.status) &&
        Objects.equals(this.virtualInterfaceIds, describeDirectConnectVirtualInterfacesRequest.virtualInterfaceIds) &&
        Objects.equals(this.virtualInterfaceName, describeDirectConnectVirtualInterfacesRequest.virtualInterfaceName) &&
        Objects.equals(this.vlanId, describeDirectConnectVirtualInterfacesRequest.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directConnectConnectionId, directConnectGatewayId, localIp, pageNumber, pageSize, peerIp, routeType, status, virtualInterfaceIds, virtualInterfaceName, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectVirtualInterfacesRequest {\n");
    
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    virtualInterfaceIds: ").append(toIndentedString(virtualInterfaceIds)).append("\n");
    sb.append("    virtualInterfaceName: ").append(toIndentedString(virtualInterfaceName)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
