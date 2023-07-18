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
import com.volcengine.directconnect.model.TagForDescribeDirectConnectVirtualInterfaceAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectVirtualInterfaceAttributesResponse
 */



public class DescribeDirectConnectVirtualInterfaceAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BfdDetectInterval")
  private Integer bfdDetectInterval = null;

  @SerializedName("BfdDetectMultiplier")
  private Integer bfdDetectMultiplier = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("EnableBfd")
  private Boolean enableBfd = null;

  @SerializedName("EnableNqa")
  private Boolean enableNqa = null;

  @SerializedName("LocalIp")
  private String localIp = null;

  @SerializedName("NqaDetectInterval")
  private Integer nqaDetectInterval = null;

  @SerializedName("NqaDetectMultiplier")
  private Integer nqaDetectMultiplier = null;

  @SerializedName("PeerIp")
  private String peerIp = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("RouteType")
  private String routeType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeDirectConnectVirtualInterfaceAttributesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VirtualInterfaceId")
  private String virtualInterfaceId = null;

  @SerializedName("VirtualInterfaceName")
  private String virtualInterfaceName = null;

  @SerializedName("VlanId")
  private Integer vlanId = null;

  public DescribeDirectConnectVirtualInterfaceAttributesResponse accountId(String accountId) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse bandwidth(Integer bandwidth) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse bfdDetectInterval(Integer bfdDetectInterval) {
    this.bfdDetectInterval = bfdDetectInterval;
    return this;
  }

   /**
   * Get bfdDetectInterval
   * @return bfdDetectInterval
  **/
  @Schema(description = "")
  public Integer getBfdDetectInterval() {
    return bfdDetectInterval;
  }

  public void setBfdDetectInterval(Integer bfdDetectInterval) {
    this.bfdDetectInterval = bfdDetectInterval;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse bfdDetectMultiplier(Integer bfdDetectMultiplier) {
    this.bfdDetectMultiplier = bfdDetectMultiplier;
    return this;
  }

   /**
   * Get bfdDetectMultiplier
   * @return bfdDetectMultiplier
  **/
  @Schema(description = "")
  public Integer getBfdDetectMultiplier() {
    return bfdDetectMultiplier;
  }

  public void setBfdDetectMultiplier(Integer bfdDetectMultiplier) {
    this.bfdDetectMultiplier = bfdDetectMultiplier;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse creationTime(String creationTime) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse description(String description) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse directConnectConnectionId(String directConnectConnectionId) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse directConnectGatewayId(String directConnectGatewayId) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse enableBfd(Boolean enableBfd) {
    this.enableBfd = enableBfd;
    return this;
  }

   /**
   * Get enableBfd
   * @return enableBfd
  **/
  @Schema(description = "")
  public Boolean isEnableBfd() {
    return enableBfd;
  }

  public void setEnableBfd(Boolean enableBfd) {
    this.enableBfd = enableBfd;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse enableNqa(Boolean enableNqa) {
    this.enableNqa = enableNqa;
    return this;
  }

   /**
   * Get enableNqa
   * @return enableNqa
  **/
  @Schema(description = "")
  public Boolean isEnableNqa() {
    return enableNqa;
  }

  public void setEnableNqa(Boolean enableNqa) {
    this.enableNqa = enableNqa;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse localIp(String localIp) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse nqaDetectInterval(Integer nqaDetectInterval) {
    this.nqaDetectInterval = nqaDetectInterval;
    return this;
  }

   /**
   * Get nqaDetectInterval
   * @return nqaDetectInterval
  **/
  @Schema(description = "")
  public Integer getNqaDetectInterval() {
    return nqaDetectInterval;
  }

  public void setNqaDetectInterval(Integer nqaDetectInterval) {
    this.nqaDetectInterval = nqaDetectInterval;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse nqaDetectMultiplier(Integer nqaDetectMultiplier) {
    this.nqaDetectMultiplier = nqaDetectMultiplier;
    return this;
  }

   /**
   * Get nqaDetectMultiplier
   * @return nqaDetectMultiplier
  **/
  @Schema(description = "")
  public Integer getNqaDetectMultiplier() {
    return nqaDetectMultiplier;
  }

  public void setNqaDetectMultiplier(Integer nqaDetectMultiplier) {
    this.nqaDetectMultiplier = nqaDetectMultiplier;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse peerIp(String peerIp) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse requestId(String requestId) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse routeType(String routeType) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse status(String status) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse tags(List<TagForDescribeDirectConnectVirtualInterfaceAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse addTagsItem(TagForDescribeDirectConnectVirtualInterfaceAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeDirectConnectVirtualInterfaceAttributesOutput>();
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
  public List<TagForDescribeDirectConnectVirtualInterfaceAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeDirectConnectVirtualInterfaceAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse updateTime(String updateTime) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse virtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
    return this;
  }

   /**
   * Get virtualInterfaceId
   * @return virtualInterfaceId
  **/
  @Schema(description = "")
  public String getVirtualInterfaceId() {
    return virtualInterfaceId;
  }

  public void setVirtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
  }

  public DescribeDirectConnectVirtualInterfaceAttributesResponse virtualInterfaceName(String virtualInterfaceName) {
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

  public DescribeDirectConnectVirtualInterfaceAttributesResponse vlanId(Integer vlanId) {
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
    DescribeDirectConnectVirtualInterfaceAttributesResponse describeDirectConnectVirtualInterfaceAttributesResponse = (DescribeDirectConnectVirtualInterfaceAttributesResponse) o;
    return Objects.equals(this.accountId, describeDirectConnectVirtualInterfaceAttributesResponse.accountId) &&
        Objects.equals(this.bandwidth, describeDirectConnectVirtualInterfaceAttributesResponse.bandwidth) &&
        Objects.equals(this.bfdDetectInterval, describeDirectConnectVirtualInterfaceAttributesResponse.bfdDetectInterval) &&
        Objects.equals(this.bfdDetectMultiplier, describeDirectConnectVirtualInterfaceAttributesResponse.bfdDetectMultiplier) &&
        Objects.equals(this.creationTime, describeDirectConnectVirtualInterfaceAttributesResponse.creationTime) &&
        Objects.equals(this.description, describeDirectConnectVirtualInterfaceAttributesResponse.description) &&
        Objects.equals(this.directConnectConnectionId, describeDirectConnectVirtualInterfaceAttributesResponse.directConnectConnectionId) &&
        Objects.equals(this.directConnectGatewayId, describeDirectConnectVirtualInterfaceAttributesResponse.directConnectGatewayId) &&
        Objects.equals(this.enableBfd, describeDirectConnectVirtualInterfaceAttributesResponse.enableBfd) &&
        Objects.equals(this.enableNqa, describeDirectConnectVirtualInterfaceAttributesResponse.enableNqa) &&
        Objects.equals(this.localIp, describeDirectConnectVirtualInterfaceAttributesResponse.localIp) &&
        Objects.equals(this.nqaDetectInterval, describeDirectConnectVirtualInterfaceAttributesResponse.nqaDetectInterval) &&
        Objects.equals(this.nqaDetectMultiplier, describeDirectConnectVirtualInterfaceAttributesResponse.nqaDetectMultiplier) &&
        Objects.equals(this.peerIp, describeDirectConnectVirtualInterfaceAttributesResponse.peerIp) &&
        Objects.equals(this.requestId, describeDirectConnectVirtualInterfaceAttributesResponse.requestId) &&
        Objects.equals(this.routeType, describeDirectConnectVirtualInterfaceAttributesResponse.routeType) &&
        Objects.equals(this.status, describeDirectConnectVirtualInterfaceAttributesResponse.status) &&
        Objects.equals(this.tags, describeDirectConnectVirtualInterfaceAttributesResponse.tags) &&
        Objects.equals(this.updateTime, describeDirectConnectVirtualInterfaceAttributesResponse.updateTime) &&
        Objects.equals(this.virtualInterfaceId, describeDirectConnectVirtualInterfaceAttributesResponse.virtualInterfaceId) &&
        Objects.equals(this.virtualInterfaceName, describeDirectConnectVirtualInterfaceAttributesResponse.virtualInterfaceName) &&
        Objects.equals(this.vlanId, describeDirectConnectVirtualInterfaceAttributesResponse.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bandwidth, bfdDetectInterval, bfdDetectMultiplier, creationTime, description, directConnectConnectionId, directConnectGatewayId, enableBfd, enableNqa, localIp, nqaDetectInterval, nqaDetectMultiplier, peerIp, requestId, routeType, status, tags, updateTime, virtualInterfaceId, virtualInterfaceName, vlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectVirtualInterfaceAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    bfdDetectInterval: ").append(toIndentedString(bfdDetectInterval)).append("\n");
    sb.append("    bfdDetectMultiplier: ").append(toIndentedString(bfdDetectMultiplier)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    enableBfd: ").append(toIndentedString(enableBfd)).append("\n");
    sb.append("    enableNqa: ").append(toIndentedString(enableNqa)).append("\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    nqaDetectInterval: ").append(toIndentedString(nqaDetectInterval)).append("\n");
    sb.append("    nqaDetectMultiplier: ").append(toIndentedString(nqaDetectMultiplier)).append("\n");
    sb.append("    peerIp: ").append(toIndentedString(peerIp)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
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
