/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.ChargeInfoForCreateDBInstanceInput;
import com.volcengine.rdsmysqlv2.model.InstanceTagForCreateDBInstanceInput;
import com.volcengine.rdsmysqlv2.model.NodeInfoForCreateDBInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDBInstanceRequest
 */


public class CreateDBInstanceRequest {
  @SerializedName("ChargeInfo")
  private ChargeInfoForCreateDBInstanceInput chargeInfo = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("DBParamGroupId")
  private String dbParamGroupId = null;

  @SerializedName("DBTimeZone")
  private String dbTimeZone = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceTags")
  private List<InstanceTagForCreateDBInstanceInput> instanceTags = null;

  @SerializedName("LowerCaseTableNames")
  private String lowerCaseTableNames = null;

  @SerializedName("NodeInfo")
  private List<NodeInfoForCreateDBInstanceInput> nodeInfo = null;

  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("SuperAccountName")
  private String superAccountName = null;

  @SerializedName("SuperAccountPassword")
  private String superAccountPassword = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateDBInstanceRequest chargeInfo(ChargeInfoForCreateDBInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
    return this;
  }

   /**
   * Get chargeInfo
   * @return chargeInfo
  **/
  @Valid
  @Schema(description = "")
  public ChargeInfoForCreateDBInstanceInput getChargeInfo() {
    return chargeInfo;
  }

  public void setChargeInfo(ChargeInfoForCreateDBInstanceInput chargeInfo) {
    this.chargeInfo = chargeInfo;
  }

  public CreateDBInstanceRequest dbEngineVersion(String dbEngineVersion) {
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

  public CreateDBInstanceRequest dbParamGroupId(String dbParamGroupId) {
    this.dbParamGroupId = dbParamGroupId;
    return this;
  }

   /**
   * Get dbParamGroupId
   * @return dbParamGroupId
  **/
  @Schema(description = "")
  public String getDbParamGroupId() {
    return dbParamGroupId;
  }

  public void setDbParamGroupId(String dbParamGroupId) {
    this.dbParamGroupId = dbParamGroupId;
  }

  public CreateDBInstanceRequest dbTimeZone(String dbTimeZone) {
    this.dbTimeZone = dbTimeZone;
    return this;
  }

   /**
   * Get dbTimeZone
   * @return dbTimeZone
  **/
  @Schema(description = "")
  public String getDbTimeZone() {
    return dbTimeZone;
  }

  public void setDbTimeZone(String dbTimeZone) {
    this.dbTimeZone = dbTimeZone;
  }

  public CreateDBInstanceRequest instanceName(String instanceName) {
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

  public CreateDBInstanceRequest instanceTags(List<InstanceTagForCreateDBInstanceInput> instanceTags) {
    this.instanceTags = instanceTags;
    return this;
  }

  public CreateDBInstanceRequest addInstanceTagsItem(InstanceTagForCreateDBInstanceInput instanceTagsItem) {
    if (this.instanceTags == null) {
      this.instanceTags = new ArrayList<InstanceTagForCreateDBInstanceInput>();
    }
    this.instanceTags.add(instanceTagsItem);
    return this;
  }

   /**
   * Get instanceTags
   * @return instanceTags
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceTagForCreateDBInstanceInput> getInstanceTags() {
    return instanceTags;
  }

  public void setInstanceTags(List<InstanceTagForCreateDBInstanceInput> instanceTags) {
    this.instanceTags = instanceTags;
  }

  public CreateDBInstanceRequest lowerCaseTableNames(String lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
    return this;
  }

   /**
   * Get lowerCaseTableNames
   * @return lowerCaseTableNames
  **/
  @Schema(description = "")
  public String getLowerCaseTableNames() {
    return lowerCaseTableNames;
  }

  public void setLowerCaseTableNames(String lowerCaseTableNames) {
    this.lowerCaseTableNames = lowerCaseTableNames;
  }

  public CreateDBInstanceRequest nodeInfo(List<NodeInfoForCreateDBInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public CreateDBInstanceRequest addNodeInfoItem(NodeInfoForCreateDBInstanceInput nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<NodeInfoForCreateDBInstanceInput>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeInfoForCreateDBInstanceInput> getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(List<NodeInfoForCreateDBInstanceInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public CreateDBInstanceRequest number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public CreateDBInstanceRequest projectName(String projectName) {
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

  public CreateDBInstanceRequest storageSpace(Integer storageSpace) {
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

  public CreateDBInstanceRequest storageType(String storageType) {
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

  public CreateDBInstanceRequest subnetId(String subnetId) {
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

  public CreateDBInstanceRequest superAccountName(String superAccountName) {
    this.superAccountName = superAccountName;
    return this;
  }

   /**
   * Get superAccountName
   * @return superAccountName
  **/
 @Size(min=2,max=16)  @Schema(description = "")
  public String getSuperAccountName() {
    return superAccountName;
  }

  public void setSuperAccountName(String superAccountName) {
    this.superAccountName = superAccountName;
  }

  public CreateDBInstanceRequest superAccountPassword(String superAccountPassword) {
    this.superAccountPassword = superAccountPassword;
    return this;
  }

   /**
   * Get superAccountPassword
   * @return superAccountPassword
  **/
 @Size(min=8,max=32)  @Schema(description = "")
  public String getSuperAccountPassword() {
    return superAccountPassword;
  }

  public void setSuperAccountPassword(String superAccountPassword) {
    this.superAccountPassword = superAccountPassword;
  }

  public CreateDBInstanceRequest vpcId(String vpcId) {
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
    CreateDBInstanceRequest createDBInstanceRequest = (CreateDBInstanceRequest) o;
    return Objects.equals(this.chargeInfo, createDBInstanceRequest.chargeInfo) &&
        Objects.equals(this.dbEngineVersion, createDBInstanceRequest.dbEngineVersion) &&
        Objects.equals(this.dbParamGroupId, createDBInstanceRequest.dbParamGroupId) &&
        Objects.equals(this.dbTimeZone, createDBInstanceRequest.dbTimeZone) &&
        Objects.equals(this.instanceName, createDBInstanceRequest.instanceName) &&
        Objects.equals(this.instanceTags, createDBInstanceRequest.instanceTags) &&
        Objects.equals(this.lowerCaseTableNames, createDBInstanceRequest.lowerCaseTableNames) &&
        Objects.equals(this.nodeInfo, createDBInstanceRequest.nodeInfo) &&
        Objects.equals(this.number, createDBInstanceRequest.number) &&
        Objects.equals(this.projectName, createDBInstanceRequest.projectName) &&
        Objects.equals(this.storageSpace, createDBInstanceRequest.storageSpace) &&
        Objects.equals(this.storageType, createDBInstanceRequest.storageType) &&
        Objects.equals(this.subnetId, createDBInstanceRequest.subnetId) &&
        Objects.equals(this.superAccountName, createDBInstanceRequest.superAccountName) &&
        Objects.equals(this.superAccountPassword, createDBInstanceRequest.superAccountPassword) &&
        Objects.equals(this.vpcId, createDBInstanceRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeInfo, dbEngineVersion, dbParamGroupId, dbTimeZone, instanceName, instanceTags, lowerCaseTableNames, nodeInfo, number, projectName, storageSpace, storageType, subnetId, superAccountName, superAccountPassword, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBInstanceRequest {\n");
    
    sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    dbParamGroupId: ").append(toIndentedString(dbParamGroupId)).append("\n");
    sb.append("    dbTimeZone: ").append(toIndentedString(dbTimeZone)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceTags: ").append(toIndentedString(instanceTags)).append("\n");
    sb.append("    lowerCaseTableNames: ").append(toIndentedString(lowerCaseTableNames)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    superAccountName: ").append(toIndentedString(superAccountName)).append("\n");
    sb.append("    superAccountPassword: ").append(toIndentedString(superAccountPassword)).append("\n");
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