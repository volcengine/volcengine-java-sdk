/*
 * rds_mssql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmssql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmssql.model.ChargeDetailForDescribeDBInstancesOutput;
import com.volcengine.rdsmssql.model.NodeDetailInfoForDescribeDBInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InstancesInfoForDescribeDBInstancesOutput
 */



public class InstancesInfoForDescribeDBInstancesOutput {
  @SerializedName("ChargeDetail")
  private ChargeDetailForDescribeDBInstancesOutput chargeDetail = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("InstanceCategory")
  private String instanceCategory = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("NodeDetailInfo")
  private List<NodeDetailInfoForDescribeDBInstancesOutput> nodeDetailInfo = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("PrimaryInstanceId")
  private String primaryInstanceId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ReadOnlyNumber")
  private Integer readOnlyNumber = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("ServerCollation")
  private String serverCollation = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("TimeZone")
  private String timeZone = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public InstancesInfoForDescribeDBInstancesOutput chargeDetail(ChargeDetailForDescribeDBInstancesOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
    return this;
  }

   /**
   * Get chargeDetail
   * @return chargeDetail
  **/
  @Valid
  @Schema(description = "")
  public ChargeDetailForDescribeDBInstancesOutput getChargeDetail() {
    return chargeDetail;
  }

  public void setChargeDetail(ChargeDetailForDescribeDBInstancesOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
  }

  public InstancesInfoForDescribeDBInstancesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public InstancesInfoForDescribeDBInstancesOutput dbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
    return this;
  }

   /**
   * Get dbEngineVersion
   * @return dbEngineVersion
  **/
  @Schema(description = "")
  public String getDbEngineVersion() {
    return dbEngineVersion;
  }

  public void setDbEngineVersion(String dbEngineVersion) {
    this.dbEngineVersion = dbEngineVersion;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceCategory(String instanceCategory) {
    this.instanceCategory = instanceCategory;
    return this;
  }

   /**
   * Get instanceCategory
   * @return instanceCategory
  **/
  @Schema(description = "")
  public String getInstanceCategory() {
    return instanceCategory;
  }

  public void setInstanceCategory(String instanceCategory) {
    this.instanceCategory = instanceCategory;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public InstancesInfoForDescribeDBInstancesOutput instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public InstancesInfoForDescribeDBInstancesOutput nodeDetailInfo(List<NodeDetailInfoForDescribeDBInstancesOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
    return this;
  }

  public InstancesInfoForDescribeDBInstancesOutput addNodeDetailInfoItem(NodeDetailInfoForDescribeDBInstancesOutput nodeDetailInfoItem) {
    if (this.nodeDetailInfo == null) {
      this.nodeDetailInfo = new ArrayList<NodeDetailInfoForDescribeDBInstancesOutput>();
    }
    this.nodeDetailInfo.add(nodeDetailInfoItem);
    return this;
  }

   /**
   * Get nodeDetailInfo
   * @return nodeDetailInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeDetailInfoForDescribeDBInstancesOutput> getNodeDetailInfo() {
    return nodeDetailInfo;
  }

  public void setNodeDetailInfo(List<NodeDetailInfoForDescribeDBInstancesOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
  }

  public InstancesInfoForDescribeDBInstancesOutput nodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
    return this;
  }

   /**
   * Get nodeSpec
   * @return nodeSpec
  **/
  @Schema(description = "")
  public String getNodeSpec() {
    return nodeSpec;
  }

  public void setNodeSpec(String nodeSpec) {
    this.nodeSpec = nodeSpec;
  }

  public InstancesInfoForDescribeDBInstancesOutput port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public InstancesInfoForDescribeDBInstancesOutput primaryInstanceId(String primaryInstanceId) {
    this.primaryInstanceId = primaryInstanceId;
    return this;
  }

   /**
   * Get primaryInstanceId
   * @return primaryInstanceId
  **/
  @Schema(description = "")
  public String getPrimaryInstanceId() {
    return primaryInstanceId;
  }

  public void setPrimaryInstanceId(String primaryInstanceId) {
    this.primaryInstanceId = primaryInstanceId;
  }

  public InstancesInfoForDescribeDBInstancesOutput projectName(String projectName) {
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

  public InstancesInfoForDescribeDBInstancesOutput readOnlyNumber(Integer readOnlyNumber) {
    this.readOnlyNumber = readOnlyNumber;
    return this;
  }

   /**
   * Get readOnlyNumber
   * @return readOnlyNumber
  **/
  @Schema(description = "")
  public Integer getReadOnlyNumber() {
    return readOnlyNumber;
  }

  public void setReadOnlyNumber(Integer readOnlyNumber) {
    this.readOnlyNumber = readOnlyNumber;
  }

  public InstancesInfoForDescribeDBInstancesOutput regionId(String regionId) {
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

  public InstancesInfoForDescribeDBInstancesOutput serverCollation(String serverCollation) {
    this.serverCollation = serverCollation;
    return this;
  }

   /**
   * Get serverCollation
   * @return serverCollation
  **/
  @Schema(description = "")
  public String getServerCollation() {
    return serverCollation;
  }

  public void setServerCollation(String serverCollation) {
    this.serverCollation = serverCollation;
  }

  public InstancesInfoForDescribeDBInstancesOutput storageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
    return this;
  }

   /**
   * Get storageSpace
   * @return storageSpace
  **/
  @Schema(description = "")
  public Integer getStorageSpace() {
    return storageSpace;
  }

  public void setStorageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
  }

  public InstancesInfoForDescribeDBInstancesOutput storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @Schema(description = "")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  public InstancesInfoForDescribeDBInstancesOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public InstancesInfoForDescribeDBInstancesOutput timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @Schema(description = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public InstancesInfoForDescribeDBInstancesOutput vpcId(String vpcId) {
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

  public InstancesInfoForDescribeDBInstancesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancesInfoForDescribeDBInstancesOutput instancesInfoForDescribeDBInstancesOutput = (InstancesInfoForDescribeDBInstancesOutput) o;
    return Objects.equals(this.chargeDetail, instancesInfoForDescribeDBInstancesOutput.chargeDetail) &&
        Objects.equals(this.createTime, instancesInfoForDescribeDBInstancesOutput.createTime) &&
        Objects.equals(this.dbEngineVersion, instancesInfoForDescribeDBInstancesOutput.dbEngineVersion) &&
        Objects.equals(this.instanceCategory, instancesInfoForDescribeDBInstancesOutput.instanceCategory) &&
        Objects.equals(this.instanceId, instancesInfoForDescribeDBInstancesOutput.instanceId) &&
        Objects.equals(this.instanceName, instancesInfoForDescribeDBInstancesOutput.instanceName) &&
        Objects.equals(this.instanceStatus, instancesInfoForDescribeDBInstancesOutput.instanceStatus) &&
        Objects.equals(this.instanceType, instancesInfoForDescribeDBInstancesOutput.instanceType) &&
        Objects.equals(this.nodeDetailInfo, instancesInfoForDescribeDBInstancesOutput.nodeDetailInfo) &&
        Objects.equals(this.nodeSpec, instancesInfoForDescribeDBInstancesOutput.nodeSpec) &&
        Objects.equals(this.port, instancesInfoForDescribeDBInstancesOutput.port) &&
        Objects.equals(this.primaryInstanceId, instancesInfoForDescribeDBInstancesOutput.primaryInstanceId) &&
        Objects.equals(this.projectName, instancesInfoForDescribeDBInstancesOutput.projectName) &&
        Objects.equals(this.readOnlyNumber, instancesInfoForDescribeDBInstancesOutput.readOnlyNumber) &&
        Objects.equals(this.regionId, instancesInfoForDescribeDBInstancesOutput.regionId) &&
        Objects.equals(this.serverCollation, instancesInfoForDescribeDBInstancesOutput.serverCollation) &&
        Objects.equals(this.storageSpace, instancesInfoForDescribeDBInstancesOutput.storageSpace) &&
        Objects.equals(this.storageType, instancesInfoForDescribeDBInstancesOutput.storageType) &&
        Objects.equals(this.subnetId, instancesInfoForDescribeDBInstancesOutput.subnetId) &&
        Objects.equals(this.timeZone, instancesInfoForDescribeDBInstancesOutput.timeZone) &&
        Objects.equals(this.vpcId, instancesInfoForDescribeDBInstancesOutput.vpcId) &&
        Objects.equals(this.zoneId, instancesInfoForDescribeDBInstancesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeDetail, createTime, dbEngineVersion, instanceCategory, instanceId, instanceName, instanceStatus, instanceType, nodeDetailInfo, nodeSpec, port, primaryInstanceId, projectName, readOnlyNumber, regionId, serverCollation, storageSpace, storageType, subnetId, timeZone, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancesInfoForDescribeDBInstancesOutput {\n");
    
    sb.append("    chargeDetail: ").append(toIndentedString(chargeDetail)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    instanceCategory: ").append(toIndentedString(instanceCategory)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    nodeDetailInfo: ").append(toIndentedString(nodeDetailInfo)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    primaryInstanceId: ").append(toIndentedString(primaryInstanceId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    readOnlyNumber: ").append(toIndentedString(readOnlyNumber)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    serverCollation: ").append(toIndentedString(serverCollation)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
