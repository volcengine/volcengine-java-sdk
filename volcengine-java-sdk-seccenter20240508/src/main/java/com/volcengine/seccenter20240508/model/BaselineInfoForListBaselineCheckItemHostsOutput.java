/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * BaselineInfoForListBaselineCheckItemHostsOutput
 */



public class BaselineInfoForListBaselineCheckItemHostsOutput {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("AssetID")
  private String assetID = null;

  @SerializedName("AssetName")
  private String assetName = null;

  @SerializedName("CheckLevel")
  private String checkLevel = null;

  @SerializedName("ClusterID")
  private String clusterID = null;

  @SerializedName("ClusterName")
  private String clusterName = null;

  @SerializedName("DetectStatus")
  private String detectStatus = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("FailedDetail")
  private String failedDetail = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("NodeID")
  private String nodeID = null;

  @SerializedName("NodeIP")
  private String nodeIP = null;

  @SerializedName("NodeName")
  private String nodeName = null;

  @SerializedName("PrimaryIpAddress")
  private String primaryIpAddress = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("Result")
  private String result = null;

  @SerializedName("Tag")
  private List<String> tag = null;

  @SerializedName("WhitelistDetail")
  private String whitelistDetail = null;

  @SerializedName("WhitelistStatus")
  private Boolean whitelistStatus = null;

  public BaselineInfoForListBaselineCheckItemHostsOutput agentID(String agentID) {
    this.agentID = agentID;
    return this;
  }

   /**
   * Get agentID
   * @return agentID
  **/
  @Schema(description = "")
  public String getAgentID() {
    return agentID;
  }

  public void setAgentID(String agentID) {
    this.agentID = agentID;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

   /**
   * Get assetID
   * @return assetID
  **/
  @Schema(description = "")
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput assetName(String assetName) {
    this.assetName = assetName;
    return this;
  }

   /**
   * Get assetName
   * @return assetName
  **/
  @Schema(description = "")
  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput checkLevel(String checkLevel) {
    this.checkLevel = checkLevel;
    return this;
  }

   /**
   * Get checkLevel
   * @return checkLevel
  **/
  @Schema(description = "")
  public String getCheckLevel() {
    return checkLevel;
  }

  public void setCheckLevel(String checkLevel) {
    this.checkLevel = checkLevel;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput clusterID(String clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * Get clusterID
   * @return clusterID
  **/
  @Schema(description = "")
  public String getClusterID() {
    return clusterID;
  }

  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Get clusterName
   * @return clusterName
  **/
  @Schema(description = "")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput detectStatus(String detectStatus) {
    this.detectStatus = detectStatus;
    return this;
  }

   /**
   * Get detectStatus
   * @return detectStatus
  **/
  @Schema(description = "")
  public String getDetectStatus() {
    return detectStatus;
  }

  public void setDetectStatus(String detectStatus) {
    this.detectStatus = detectStatus;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput eipAddress(String eipAddress) {
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

  public BaselineInfoForListBaselineCheckItemHostsOutput failedDetail(String failedDetail) {
    this.failedDetail = failedDetail;
    return this;
  }

   /**
   * Get failedDetail
   * @return failedDetail
  **/
  @Schema(description = "")
  public String getFailedDetail() {
    return failedDetail;
  }

  public void setFailedDetail(String failedDetail) {
    this.failedDetail = failedDetail;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

   /**
   * Get nodeID
   * @return nodeID
  **/
  @Schema(description = "")
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput nodeIP(String nodeIP) {
    this.nodeIP = nodeIP;
    return this;
  }

   /**
   * Get nodeIP
   * @return nodeIP
  **/
  @Schema(description = "")
  public String getNodeIP() {
    return nodeIP;
  }

  public void setNodeIP(String nodeIP) {
    this.nodeIP = nodeIP;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @Schema(description = "")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput primaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
    return this;
  }

   /**
   * Get primaryIpAddress
   * @return primaryIpAddress
  **/
  @Schema(description = "")
  public String getPrimaryIpAddress() {
    return primaryIpAddress;
  }

  public void setPrimaryIpAddress(String primaryIpAddress) {
    this.primaryIpAddress = primaryIpAddress;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput region(String region) {
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

  public BaselineInfoForListBaselineCheckItemHostsOutput result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<String>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public List<String> getTag() {
    return tag;
  }

  public void setTag(List<String> tag) {
    this.tag = tag;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput whitelistDetail(String whitelistDetail) {
    this.whitelistDetail = whitelistDetail;
    return this;
  }

   /**
   * Get whitelistDetail
   * @return whitelistDetail
  **/
  @Schema(description = "")
  public String getWhitelistDetail() {
    return whitelistDetail;
  }

  public void setWhitelistDetail(String whitelistDetail) {
    this.whitelistDetail = whitelistDetail;
  }

  public BaselineInfoForListBaselineCheckItemHostsOutput whitelistStatus(Boolean whitelistStatus) {
    this.whitelistStatus = whitelistStatus;
    return this;
  }

   /**
   * Get whitelistStatus
   * @return whitelistStatus
  **/
  @Schema(description = "")
  public Boolean isWhitelistStatus() {
    return whitelistStatus;
  }

  public void setWhitelistStatus(Boolean whitelistStatus) {
    this.whitelistStatus = whitelistStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaselineInfoForListBaselineCheckItemHostsOutput baselineInfoForListBaselineCheckItemHostsOutput = (BaselineInfoForListBaselineCheckItemHostsOutput) o;
    return Objects.equals(this.agentID, baselineInfoForListBaselineCheckItemHostsOutput.agentID) &&
        Objects.equals(this.assetID, baselineInfoForListBaselineCheckItemHostsOutput.assetID) &&
        Objects.equals(this.assetName, baselineInfoForListBaselineCheckItemHostsOutput.assetName) &&
        Objects.equals(this.checkLevel, baselineInfoForListBaselineCheckItemHostsOutput.checkLevel) &&
        Objects.equals(this.clusterID, baselineInfoForListBaselineCheckItemHostsOutput.clusterID) &&
        Objects.equals(this.clusterName, baselineInfoForListBaselineCheckItemHostsOutput.clusterName) &&
        Objects.equals(this.detectStatus, baselineInfoForListBaselineCheckItemHostsOutput.detectStatus) &&
        Objects.equals(this.eipAddress, baselineInfoForListBaselineCheckItemHostsOutput.eipAddress) &&
        Objects.equals(this.failedDetail, baselineInfoForListBaselineCheckItemHostsOutput.failedDetail) &&
        Objects.equals(this.hostname, baselineInfoForListBaselineCheckItemHostsOutput.hostname) &&
        Objects.equals(this.nodeID, baselineInfoForListBaselineCheckItemHostsOutput.nodeID) &&
        Objects.equals(this.nodeIP, baselineInfoForListBaselineCheckItemHostsOutput.nodeIP) &&
        Objects.equals(this.nodeName, baselineInfoForListBaselineCheckItemHostsOutput.nodeName) &&
        Objects.equals(this.primaryIpAddress, baselineInfoForListBaselineCheckItemHostsOutput.primaryIpAddress) &&
        Objects.equals(this.region, baselineInfoForListBaselineCheckItemHostsOutput.region) &&
        Objects.equals(this.result, baselineInfoForListBaselineCheckItemHostsOutput.result) &&
        Objects.equals(this.tag, baselineInfoForListBaselineCheckItemHostsOutput.tag) &&
        Objects.equals(this.whitelistDetail, baselineInfoForListBaselineCheckItemHostsOutput.whitelistDetail) &&
        Objects.equals(this.whitelistStatus, baselineInfoForListBaselineCheckItemHostsOutput.whitelistStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, assetID, assetName, checkLevel, clusterID, clusterName, detectStatus, eipAddress, failedDetail, hostname, nodeID, nodeIP, nodeName, primaryIpAddress, region, result, tag, whitelistDetail, whitelistStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaselineInfoForListBaselineCheckItemHostsOutput {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    checkLevel: ").append(toIndentedString(checkLevel)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    detectStatus: ").append(toIndentedString(detectStatus)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    failedDetail: ").append(toIndentedString(failedDetail)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    nodeIP: ").append(toIndentedString(nodeIP)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    primaryIpAddress: ").append(toIndentedString(primaryIpAddress)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    whitelistDetail: ").append(toIndentedString(whitelistDetail)).append("\n");
    sb.append("    whitelistStatus: ").append(toIndentedString(whitelistStatus)).append("\n");
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
