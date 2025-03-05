/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.emr.model.NodeAttributeForListClustersOutput;
import com.volcengine.emr.model.StateChangeReasonForListClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListClustersOutput
 */



public class ItemForListClustersOutput {
  @SerializedName("AccountId")
  private Long accountId = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("ClusterName")
  private String clusterName = null;

  @SerializedName("ClusterState")
  private String clusterState = null;

  @SerializedName("ClusterType")
  private String clusterType = null;

  @SerializedName("CreateTime")
  private Long createTime = null;

  @SerializedName("Creator")
  private String creator = null;

  @SerializedName("ExpireTime")
  private Long expireTime = null;

  @SerializedName("NodeAttribute")
  private NodeAttributeForListClustersOutput nodeAttribute = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ReadyTime")
  private Long readyTime = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ReleaseVersion")
  private String releaseVersion = null;

  @SerializedName("SecurityGroupId")
  private String securityGroupId = null;

  @SerializedName("StateChangeReason")
  private StateChangeReasonForListClustersOutput stateChangeReason = null;

  @SerializedName("TerminateTime")
  private Long terminateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public ItemForListClustersOutput accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ItemForListClustersOutput chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ItemForListClustersOutput clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public ItemForListClustersOutput clusterName(String clusterName) {
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

  public ItemForListClustersOutput clusterState(String clusterState) {
    this.clusterState = clusterState;
    return this;
  }

   /**
   * Get clusterState
   * @return clusterState
  **/
  @Schema(description = "")
  public String getClusterState() {
    return clusterState;
  }

  public void setClusterState(String clusterState) {
    this.clusterState = clusterState;
  }

  public ItemForListClustersOutput clusterType(String clusterType) {
    this.clusterType = clusterType;
    return this;
  }

   /**
   * Get clusterType
   * @return clusterType
  **/
  @Schema(description = "")
  public String getClusterType() {
    return clusterType;
  }

  public void setClusterType(String clusterType) {
    this.clusterType = clusterType;
  }

  public ItemForListClustersOutput createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public ItemForListClustersOutput creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @Schema(description = "")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public ItemForListClustersOutput expireTime(Long expireTime) {
    this.expireTime = expireTime;
    return this;
  }

   /**
   * Get expireTime
   * @return expireTime
  **/
  @Schema(description = "")
  public Long getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(Long expireTime) {
    this.expireTime = expireTime;
  }

  public ItemForListClustersOutput nodeAttribute(NodeAttributeForListClustersOutput nodeAttribute) {
    this.nodeAttribute = nodeAttribute;
    return this;
  }

   /**
   * Get nodeAttribute
   * @return nodeAttribute
  **/
  @Valid
  @Schema(description = "")
  public NodeAttributeForListClustersOutput getNodeAttribute() {
    return nodeAttribute;
  }

  public void setNodeAttribute(NodeAttributeForListClustersOutput nodeAttribute) {
    this.nodeAttribute = nodeAttribute;
  }

  public ItemForListClustersOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ItemForListClustersOutput readyTime(Long readyTime) {
    this.readyTime = readyTime;
    return this;
  }

   /**
   * Get readyTime
   * @return readyTime
  **/
  @Schema(description = "")
  public Long getReadyTime() {
    return readyTime;
  }

  public void setReadyTime(Long readyTime) {
    this.readyTime = readyTime;
  }

  public ItemForListClustersOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public ItemForListClustersOutput releaseVersion(String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

   /**
   * Get releaseVersion
   * @return releaseVersion
  **/
  @Schema(description = "")
  public String getReleaseVersion() {
    return releaseVersion;
  }

  public void setReleaseVersion(String releaseVersion) {
    this.releaseVersion = releaseVersion;
  }

  public ItemForListClustersOutput securityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @Schema(description = "")
  public String getSecurityGroupId() {
    return securityGroupId;
  }

  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }

  public ItemForListClustersOutput stateChangeReason(StateChangeReasonForListClustersOutput stateChangeReason) {
    this.stateChangeReason = stateChangeReason;
    return this;
  }

   /**
   * Get stateChangeReason
   * @return stateChangeReason
  **/
  @Valid
  @Schema(description = "")
  public StateChangeReasonForListClustersOutput getStateChangeReason() {
    return stateChangeReason;
  }

  public void setStateChangeReason(StateChangeReasonForListClustersOutput stateChangeReason) {
    this.stateChangeReason = stateChangeReason;
  }

  public ItemForListClustersOutput terminateTime(Long terminateTime) {
    this.terminateTime = terminateTime;
    return this;
  }

   /**
   * Get terminateTime
   * @return terminateTime
  **/
  @Schema(description = "")
  public Long getTerminateTime() {
    return terminateTime;
  }

  public void setTerminateTime(Long terminateTime) {
    this.terminateTime = terminateTime;
  }

  public ItemForListClustersOutput vpcId(String vpcId) {
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
    ItemForListClustersOutput itemForListClustersOutput = (ItemForListClustersOutput) o;
    return Objects.equals(this.accountId, itemForListClustersOutput.accountId) &&
        Objects.equals(this.chargeType, itemForListClustersOutput.chargeType) &&
        Objects.equals(this.clusterId, itemForListClustersOutput.clusterId) &&
        Objects.equals(this.clusterName, itemForListClustersOutput.clusterName) &&
        Objects.equals(this.clusterState, itemForListClustersOutput.clusterState) &&
        Objects.equals(this.clusterType, itemForListClustersOutput.clusterType) &&
        Objects.equals(this.createTime, itemForListClustersOutput.createTime) &&
        Objects.equals(this.creator, itemForListClustersOutput.creator) &&
        Objects.equals(this.expireTime, itemForListClustersOutput.expireTime) &&
        Objects.equals(this.nodeAttribute, itemForListClustersOutput.nodeAttribute) &&
        Objects.equals(this.projectName, itemForListClustersOutput.projectName) &&
        Objects.equals(this.readyTime, itemForListClustersOutput.readyTime) &&
        Objects.equals(this.regionId, itemForListClustersOutput.regionId) &&
        Objects.equals(this.releaseVersion, itemForListClustersOutput.releaseVersion) &&
        Objects.equals(this.securityGroupId, itemForListClustersOutput.securityGroupId) &&
        Objects.equals(this.stateChangeReason, itemForListClustersOutput.stateChangeReason) &&
        Objects.equals(this.terminateTime, itemForListClustersOutput.terminateTime) &&
        Objects.equals(this.vpcId, itemForListClustersOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, chargeType, clusterId, clusterName, clusterState, clusterType, createTime, creator, expireTime, nodeAttribute, projectName, readyTime, regionId, releaseVersion, securityGroupId, stateChangeReason, terminateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListClustersOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterState: ").append(toIndentedString(clusterState)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    nodeAttribute: ").append(toIndentedString(nodeAttribute)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    readyTime: ").append(toIndentedString(readyTime)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    stateChangeReason: ").append(toIndentedString(stateChangeReason)).append("\n");
    sb.append("    terminateTime: ").append(toIndentedString(terminateTime)).append("\n");
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
