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
import com.volcengine.rdsmssql.model.BackupDatabaseDetailForDescribeBackupDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BackupsInfoForDescribeBackupDetailOutput
 */



public class BackupsInfoForDescribeBackupDetailOutput {
  @SerializedName("BackupDatabaseDetail")
  private List<BackupDatabaseDetailForDescribeBackupDetailOutput> backupDatabaseDetail = null;

  @SerializedName("BackupEndTime")
  private String backupEndTime = null;

  @SerializedName("BackupFileSize")
  private Long backupFileSize = null;

  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("BackupMethod")
  private String backupMethod = null;

  @SerializedName("BackupStartTime")
  private String backupStartTime = null;

  @SerializedName("BackupStatus")
  private String backupStatus = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("CreateType")
  private String createType = null;

  @SerializedName("DownloadProgress")
  private Integer downloadProgress = null;

  @SerializedName("DownloadStatus")
  private String downloadStatus = null;

  public BackupsInfoForDescribeBackupDetailOutput backupDatabaseDetail(List<BackupDatabaseDetailForDescribeBackupDetailOutput> backupDatabaseDetail) {
    this.backupDatabaseDetail = backupDatabaseDetail;
    return this;
  }

  public BackupsInfoForDescribeBackupDetailOutput addBackupDatabaseDetailItem(BackupDatabaseDetailForDescribeBackupDetailOutput backupDatabaseDetailItem) {
    if (this.backupDatabaseDetail == null) {
      this.backupDatabaseDetail = new ArrayList<BackupDatabaseDetailForDescribeBackupDetailOutput>();
    }
    this.backupDatabaseDetail.add(backupDatabaseDetailItem);
    return this;
  }

   /**
   * Get backupDatabaseDetail
   * @return backupDatabaseDetail
  **/
  @Valid
  @Schema(description = "")
  public List<BackupDatabaseDetailForDescribeBackupDetailOutput> getBackupDatabaseDetail() {
    return backupDatabaseDetail;
  }

  public void setBackupDatabaseDetail(List<BackupDatabaseDetailForDescribeBackupDetailOutput> backupDatabaseDetail) {
    this.backupDatabaseDetail = backupDatabaseDetail;
  }

  public BackupsInfoForDescribeBackupDetailOutput backupEndTime(String backupEndTime) {
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

  public BackupsInfoForDescribeBackupDetailOutput backupFileSize(Long backupFileSize) {
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

  public BackupsInfoForDescribeBackupDetailOutput backupId(String backupId) {
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

  public BackupsInfoForDescribeBackupDetailOutput backupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
    return this;
  }

   /**
   * Get backupMethod
   * @return backupMethod
  **/
  @Schema(description = "")
  public String getBackupMethod() {
    return backupMethod;
  }

  public void setBackupMethod(String backupMethod) {
    this.backupMethod = backupMethod;
  }

  public BackupsInfoForDescribeBackupDetailOutput backupStartTime(String backupStartTime) {
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

  public BackupsInfoForDescribeBackupDetailOutput backupStatus(String backupStatus) {
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

  public BackupsInfoForDescribeBackupDetailOutput backupType(String backupType) {
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

  public BackupsInfoForDescribeBackupDetailOutput createType(String createType) {
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

  public BackupsInfoForDescribeBackupDetailOutput downloadProgress(Integer downloadProgress) {
    this.downloadProgress = downloadProgress;
    return this;
  }

   /**
   * Get downloadProgress
   * @return downloadProgress
  **/
  @Schema(description = "")
  public Integer getDownloadProgress() {
    return downloadProgress;
  }

  public void setDownloadProgress(Integer downloadProgress) {
    this.downloadProgress = downloadProgress;
  }

  public BackupsInfoForDescribeBackupDetailOutput downloadStatus(String downloadStatus) {
    this.downloadStatus = downloadStatus;
    return this;
  }

   /**
   * Get downloadStatus
   * @return downloadStatus
  **/
  @Schema(description = "")
  public String getDownloadStatus() {
    return downloadStatus;
  }

  public void setDownloadStatus(String downloadStatus) {
    this.downloadStatus = downloadStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupsInfoForDescribeBackupDetailOutput backupsInfoForDescribeBackupDetailOutput = (BackupsInfoForDescribeBackupDetailOutput) o;
    return Objects.equals(this.backupDatabaseDetail, backupsInfoForDescribeBackupDetailOutput.backupDatabaseDetail) &&
        Objects.equals(this.backupEndTime, backupsInfoForDescribeBackupDetailOutput.backupEndTime) &&
        Objects.equals(this.backupFileSize, backupsInfoForDescribeBackupDetailOutput.backupFileSize) &&
        Objects.equals(this.backupId, backupsInfoForDescribeBackupDetailOutput.backupId) &&
        Objects.equals(this.backupMethod, backupsInfoForDescribeBackupDetailOutput.backupMethod) &&
        Objects.equals(this.backupStartTime, backupsInfoForDescribeBackupDetailOutput.backupStartTime) &&
        Objects.equals(this.backupStatus, backupsInfoForDescribeBackupDetailOutput.backupStatus) &&
        Objects.equals(this.backupType, backupsInfoForDescribeBackupDetailOutput.backupType) &&
        Objects.equals(this.createType, backupsInfoForDescribeBackupDetailOutput.createType) &&
        Objects.equals(this.downloadProgress, backupsInfoForDescribeBackupDetailOutput.downloadProgress) &&
        Objects.equals(this.downloadStatus, backupsInfoForDescribeBackupDetailOutput.downloadStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupDatabaseDetail, backupEndTime, backupFileSize, backupId, backupMethod, backupStartTime, backupStatus, backupType, createType, downloadProgress, downloadStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupsInfoForDescribeBackupDetailOutput {\n");
    
    sb.append("    backupDatabaseDetail: ").append(toIndentedString(backupDatabaseDetail)).append("\n");
    sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
    sb.append("    backupFileSize: ").append(toIndentedString(backupFileSize)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
    sb.append("    backupStartTime: ").append(toIndentedString(backupStartTime)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
    sb.append("    downloadProgress: ").append(toIndentedString(downloadProgress)).append("\n");
    sb.append("    downloadStatus: ").append(toIndentedString(downloadStatus)).append("\n");
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
