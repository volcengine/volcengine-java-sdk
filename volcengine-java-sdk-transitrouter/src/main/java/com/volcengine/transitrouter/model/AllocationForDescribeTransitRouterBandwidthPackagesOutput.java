/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * AllocationForDescribeTransitRouterBandwidthPackagesOutput
 */



public class AllocationForDescribeTransitRouterBandwidthPackagesOutput {
  @SerializedName("AllocateTime")
  private String allocateTime = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("LocalRegionId")
  private String localRegionId = null;

  @SerializedName("PeerRegionId")
  private String peerRegionId = null;

  @SerializedName("TransitRouterPeerAttachmentId")
  private String transitRouterPeerAttachmentId = null;

  public AllocationForDescribeTransitRouterBandwidthPackagesOutput allocateTime(String allocateTime) {
    this.allocateTime = allocateTime;
    return this;
  }

   /**
   * Get allocateTime
   * @return allocateTime
  **/
  @Schema(description = "")
  public String getAllocateTime() {
    return allocateTime;
  }

  public void setAllocateTime(String allocateTime) {
    this.allocateTime = allocateTime;
  }

  public AllocationForDescribeTransitRouterBandwidthPackagesOutput bandwidth(Integer bandwidth) {
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

  public AllocationForDescribeTransitRouterBandwidthPackagesOutput localRegionId(String localRegionId) {
    this.localRegionId = localRegionId;
    return this;
  }

   /**
   * Get localRegionId
   * @return localRegionId
  **/
  @Schema(description = "")
  public String getLocalRegionId() {
    return localRegionId;
  }

  public void setLocalRegionId(String localRegionId) {
    this.localRegionId = localRegionId;
  }

  public AllocationForDescribeTransitRouterBandwidthPackagesOutput peerRegionId(String peerRegionId) {
    this.peerRegionId = peerRegionId;
    return this;
  }

   /**
   * Get peerRegionId
   * @return peerRegionId
  **/
  @Schema(description = "")
  public String getPeerRegionId() {
    return peerRegionId;
  }

  public void setPeerRegionId(String peerRegionId) {
    this.peerRegionId = peerRegionId;
  }

  public AllocationForDescribeTransitRouterBandwidthPackagesOutput transitRouterPeerAttachmentId(String transitRouterPeerAttachmentId) {
    this.transitRouterPeerAttachmentId = transitRouterPeerAttachmentId;
    return this;
  }

   /**
   * Get transitRouterPeerAttachmentId
   * @return transitRouterPeerAttachmentId
  **/
  @Schema(description = "")
  public String getTransitRouterPeerAttachmentId() {
    return transitRouterPeerAttachmentId;
  }

  public void setTransitRouterPeerAttachmentId(String transitRouterPeerAttachmentId) {
    this.transitRouterPeerAttachmentId = transitRouterPeerAttachmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationForDescribeTransitRouterBandwidthPackagesOutput allocationForDescribeTransitRouterBandwidthPackagesOutput = (AllocationForDescribeTransitRouterBandwidthPackagesOutput) o;
    return Objects.equals(this.allocateTime, allocationForDescribeTransitRouterBandwidthPackagesOutput.allocateTime) &&
        Objects.equals(this.bandwidth, allocationForDescribeTransitRouterBandwidthPackagesOutput.bandwidth) &&
        Objects.equals(this.localRegionId, allocationForDescribeTransitRouterBandwidthPackagesOutput.localRegionId) &&
        Objects.equals(this.peerRegionId, allocationForDescribeTransitRouterBandwidthPackagesOutput.peerRegionId) &&
        Objects.equals(this.transitRouterPeerAttachmentId, allocationForDescribeTransitRouterBandwidthPackagesOutput.transitRouterPeerAttachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocateTime, bandwidth, localRegionId, peerRegionId, transitRouterPeerAttachmentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationForDescribeTransitRouterBandwidthPackagesOutput {\n");
    
    sb.append("    allocateTime: ").append(toIndentedString(allocateTime)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    localRegionId: ").append(toIndentedString(localRegionId)).append("\n");
    sb.append("    peerRegionId: ").append(toIndentedString(peerRegionId)).append("\n");
    sb.append("    transitRouterPeerAttachmentId: ").append(toIndentedString(transitRouterPeerAttachmentId)).append("\n");
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
