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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForDescribeDeletedDBInstancesOutput
 */



public class DataForDescribeDeletedDBInstancesOutput {
  @SerializedName("BackupExpirationTime")
  private String backupExpirationTime = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DBEngineVersion")
  private String dbEngineVersion = null;

  @SerializedName("DataKeepDays")
  private Integer dataKeepDays = null;

  @SerializedName("DataKeepPolicy")
  private String dataKeepPolicy = null;

  @SerializedName("DeletionTime")
  private String deletionTime = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("NodeSpec")
  private String nodeSpec = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  public DataForDescribeDeletedDBInstancesOutput backupExpirationTime(String backupExpirationTime) {
    this.backupExpirationTime = backupExpirationTime;
    return this;
  }

   /**
   * Get backupExpirationTime
   * @return backupExpirationTime
  **/
  @Schema(description = "")
  public String getBackupExpirationTime() {
    return backupExpirationTime;
  }

  public void setBackupExpirationTime(String backupExpirationTime) {
    this.backupExpirationTime = backupExpirationTime;
  }

  public DataForDescribeDeletedDBInstancesOutput createTime(String createTime) {
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

  public DataForDescribeDeletedDBInstancesOutput dbEngineVersion(String dbEngineVersion) {
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

  public DataForDescribeDeletedDBInstancesOutput dataKeepDays(Integer dataKeepDays) {
    this.dataKeepDays = dataKeepDays;
    return this;
  }

   /**
   * Get dataKeepDays
   * @return dataKeepDays
  **/
  @Schema(description = "")
  public Integer getDataKeepDays() {
    return dataKeepDays;
  }

  public void setDataKeepDays(Integer dataKeepDays) {
    this.dataKeepDays = dataKeepDays;
  }

  public DataForDescribeDeletedDBInstancesOutput dataKeepPolicy(String dataKeepPolicy) {
    this.dataKeepPolicy = dataKeepPolicy;
    return this;
  }

   /**
   * Get dataKeepPolicy
   * @return dataKeepPolicy
  **/
  @Schema(description = "")
  public String getDataKeepPolicy() {
    return dataKeepPolicy;
  }

  public void setDataKeepPolicy(String dataKeepPolicy) {
    this.dataKeepPolicy = dataKeepPolicy;
  }

  public DataForDescribeDeletedDBInstancesOutput deletionTime(String deletionTime) {
    this.deletionTime = deletionTime;
    return this;
  }

   /**
   * Get deletionTime
   * @return deletionTime
  **/
  @Schema(description = "")
  public String getDeletionTime() {
    return deletionTime;
  }

  public void setDeletionTime(String deletionTime) {
    this.deletionTime = deletionTime;
  }

  public DataForDescribeDeletedDBInstancesOutput instanceId(String instanceId) {
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

  public DataForDescribeDeletedDBInstancesOutput instanceName(String instanceName) {
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

  public DataForDescribeDeletedDBInstancesOutput instanceStatus(String instanceStatus) {
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

  public DataForDescribeDeletedDBInstancesOutput instanceType(String instanceType) {
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

  public DataForDescribeDeletedDBInstancesOutput nodeSpec(String nodeSpec) {
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

  public DataForDescribeDeletedDBInstancesOutput projectName(String projectName) {
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

  public DataForDescribeDeletedDBInstancesOutput storageSpace(Integer storageSpace) {
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

  public DataForDescribeDeletedDBInstancesOutput storageType(String storageType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForDescribeDeletedDBInstancesOutput dataForDescribeDeletedDBInstancesOutput = (DataForDescribeDeletedDBInstancesOutput) o;
    return Objects.equals(this.backupExpirationTime, dataForDescribeDeletedDBInstancesOutput.backupExpirationTime) &&
        Objects.equals(this.createTime, dataForDescribeDeletedDBInstancesOutput.createTime) &&
        Objects.equals(this.dbEngineVersion, dataForDescribeDeletedDBInstancesOutput.dbEngineVersion) &&
        Objects.equals(this.dataKeepDays, dataForDescribeDeletedDBInstancesOutput.dataKeepDays) &&
        Objects.equals(this.dataKeepPolicy, dataForDescribeDeletedDBInstancesOutput.dataKeepPolicy) &&
        Objects.equals(this.deletionTime, dataForDescribeDeletedDBInstancesOutput.deletionTime) &&
        Objects.equals(this.instanceId, dataForDescribeDeletedDBInstancesOutput.instanceId) &&
        Objects.equals(this.instanceName, dataForDescribeDeletedDBInstancesOutput.instanceName) &&
        Objects.equals(this.instanceStatus, dataForDescribeDeletedDBInstancesOutput.instanceStatus) &&
        Objects.equals(this.instanceType, dataForDescribeDeletedDBInstancesOutput.instanceType) &&
        Objects.equals(this.nodeSpec, dataForDescribeDeletedDBInstancesOutput.nodeSpec) &&
        Objects.equals(this.projectName, dataForDescribeDeletedDBInstancesOutput.projectName) &&
        Objects.equals(this.storageSpace, dataForDescribeDeletedDBInstancesOutput.storageSpace) &&
        Objects.equals(this.storageType, dataForDescribeDeletedDBInstancesOutput.storageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupExpirationTime, createTime, dbEngineVersion, dataKeepDays, dataKeepPolicy, deletionTime, instanceId, instanceName, instanceStatus, instanceType, nodeSpec, projectName, storageSpace, storageType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForDescribeDeletedDBInstancesOutput {\n");
    
    sb.append("    backupExpirationTime: ").append(toIndentedString(backupExpirationTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dbEngineVersion: ").append(toIndentedString(dbEngineVersion)).append("\n");
    sb.append("    dataKeepDays: ").append(toIndentedString(dataKeepDays)).append("\n");
    sb.append("    dataKeepPolicy: ").append(toIndentedString(dataKeepPolicy)).append("\n");
    sb.append("    deletionTime: ").append(toIndentedString(deletionTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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
