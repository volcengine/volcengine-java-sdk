/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdspostgresql.model.InstanceInfoForDescribeBackupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BackupForDescribeBackupsOutput
 */



public class BackupForDescribeBackupsOutput {
  @SerializedName("BackupEndTime")
  private String backupEndTime = null;

  @SerializedName("BackupFileName")
  private String backupFileName = null;

  @SerializedName("BackupFileSize")
  private Long backupFileSize = null;

  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("BackupProgress")
  private Integer backupProgress = null;

  @SerializedName("BackupStartTime")
  private String backupStartTime = null;

  @SerializedName("BackupStatus")
  private String backupStatus = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("CreateType")
  private String createType = null;

  @SerializedName("InstanceInfo")
  private InstanceInfoForDescribeBackupsOutput instanceInfo = null;

  public BackupForDescribeBackupsOutput backupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
    return this;
  }

   /**
   * Get backupEndTime
   * @return backupEndTime
  **/
  @Schema(description = "")
  public String getBackupEndTime() {
    return backupEndTime;
  }

  public void setBackupEndTime(String backupEndTime) {
    this.backupEndTime = backupEndTime;
  }

  public BackupForDescribeBackupsOutput backupFileName(String backupFileName) {
    this.backupFileName = backupFileName;
    return this;
  }

   /**
   * Get backupFileName
   * @return backupFileName
  **/
  @Schema(description = "")
  public String getBackupFileName() {
    return backupFileName;
  }

  public void setBackupFileName(String backupFileName) {
    this.backupFileName = backupFileName;
  }

  public BackupForDescribeBackupsOutput backupFileSize(Long backupFileSize) {
    this.backupFileSize = backupFileSize;
    return this;
  }

   /**
   * Get backupFileSize
   * @return backupFileSize
  **/
  @Schema(description = "")
  public Long getBackupFileSize() {
    return backupFileSize;
  }

  public void setBackupFileSize(Long backupFileSize) {
    this.backupFileSize = backupFileSize;
  }

  public BackupForDescribeBackupsOutput backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @Schema(description = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public BackupForDescribeBackupsOutput backupProgress(Integer backupProgress) {
    this.backupProgress = backupProgress;
    return this;
  }

   /**
   * Get backupProgress
   * @return backupProgress
  **/
  @Schema(description = "")
  public Integer getBackupProgress() {
    return backupProgress;
  }

  public void setBackupProgress(Integer backupProgress) {
    this.backupProgress = backupProgress;
  }

  public BackupForDescribeBackupsOutput backupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
    return this;
  }

   /**
   * Get backupStartTime
   * @return backupStartTime
  **/
  @Schema(description = "")
  public String getBackupStartTime() {
    return backupStartTime;
  }

  public void setBackupStartTime(String backupStartTime) {
    this.backupStartTime = backupStartTime;
  }

  public BackupForDescribeBackupsOutput backupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
    return this;
  }

   /**
   * Get backupStatus
   * @return backupStatus
  **/
  @Schema(description = "")
  public String getBackupStatus() {
    return backupStatus;
  }

  public void setBackupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
  }

  public BackupForDescribeBackupsOutput backupType(String backupType) {
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @Schema(description = "")
  public String getBackupType() {
    return backupType;
  }

  public void setBackupType(String backupType) {
    this.backupType = backupType;
  }

  public BackupForDescribeBackupsOutput createType(String createType) {
    this.createType = createType;
    return this;
  }

   /**
   * Get createType
   * @return createType
  **/
  @Schema(description = "")
  public String getCreateType() {
    return createType;
  }

  public void setCreateType(String createType) {
    this.createType = createType;
  }

  public BackupForDescribeBackupsOutput instanceInfo(InstanceInfoForDescribeBackupsOutput instanceInfo) {
    this.instanceInfo = instanceInfo;
    return this;
  }

   /**
   * Get instanceInfo
   * @return instanceInfo
  **/
  @Valid
  @Schema(description = "")
  public InstanceInfoForDescribeBackupsOutput getInstanceInfo() {
    return instanceInfo;
  }

  public void setInstanceInfo(InstanceInfoForDescribeBackupsOutput instanceInfo) {
    this.instanceInfo = instanceInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupForDescribeBackupsOutput backupForDescribeBackupsOutput = (BackupForDescribeBackupsOutput) o;
    return Objects.equals(this.backupEndTime, backupForDescribeBackupsOutput.backupEndTime) &&
        Objects.equals(this.backupFileName, backupForDescribeBackupsOutput.backupFileName) &&
        Objects.equals(this.backupFileSize, backupForDescribeBackupsOutput.backupFileSize) &&
        Objects.equals(this.backupId, backupForDescribeBackupsOutput.backupId) &&
        Objects.equals(this.backupProgress, backupForDescribeBackupsOutput.backupProgress) &&
        Objects.equals(this.backupStartTime, backupForDescribeBackupsOutput.backupStartTime) &&
        Objects.equals(this.backupStatus, backupForDescribeBackupsOutput.backupStatus) &&
        Objects.equals(this.backupType, backupForDescribeBackupsOutput.backupType) &&
        Objects.equals(this.createType, backupForDescribeBackupsOutput.createType) &&
        Objects.equals(this.instanceInfo, backupForDescribeBackupsOutput.instanceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupEndTime, backupFileName, backupFileSize, backupId, backupProgress, backupStartTime, backupStatus, backupType, createType, instanceInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupForDescribeBackupsOutput {\n");
    
    sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
    sb.append("    backupFileName: ").append(toIndentedString(backupFileName)).append("\n");
    sb.append("    backupFileSize: ").append(toIndentedString(backupFileSize)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupProgress: ").append(toIndentedString(backupProgress)).append("\n");
    sb.append("    backupStartTime: ").append(toIndentedString(backupStartTime)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
    sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
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
