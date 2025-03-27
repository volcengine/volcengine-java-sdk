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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BackupDatabaseDetailForDescribeBackupDetailOutput
 */



public class BackupDatabaseDetailForDescribeBackupDetailOutput {
  @SerializedName("BackupDownloadLinkEIP")
  private String backupDownloadLinkEIP = null;

  @SerializedName("BackupDownloadLinkInner")
  private String backupDownloadLinkInner = null;

  @SerializedName("BackupEndTime")
  private String backupEndTime = null;

  @SerializedName("BackupFileName")
  private String backupFileName = null;

  @SerializedName("BackupFileSize")
  private Long backupFileSize = null;

  @SerializedName("BackupStartTime")
  private String backupStartTime = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("DatabaseName")
  private String databaseName = null;

  @SerializedName("DownloadProgress")
  private Integer downloadProgress = null;

  @SerializedName("DownloadStatus")
  private String downloadStatus = null;

  @SerializedName("LinkExpiredTime")
  private String linkExpiredTime = null;

  public BackupDatabaseDetailForDescribeBackupDetailOutput backupDownloadLinkEIP(String backupDownloadLinkEIP) {
    this.backupDownloadLinkEIP = backupDownloadLinkEIP;
    return this;
  }

   /**
   * Get backupDownloadLinkEIP
   * @return backupDownloadLinkEIP
  **/
  @Schema(description = "")
  public String getBackupDownloadLinkEIP() {
    return backupDownloadLinkEIP;
  }

  public void setBackupDownloadLinkEIP(String backupDownloadLinkEIP) {
    this.backupDownloadLinkEIP = backupDownloadLinkEIP;
  }

  public BackupDatabaseDetailForDescribeBackupDetailOutput backupDownloadLinkInner(String backupDownloadLinkInner) {
    this.backupDownloadLinkInner = backupDownloadLinkInner;
    return this;
  }

   /**
   * Get backupDownloadLinkInner
   * @return backupDownloadLinkInner
  **/
  @Schema(description = "")
  public String getBackupDownloadLinkInner() {
    return backupDownloadLinkInner;
  }

  public void setBackupDownloadLinkInner(String backupDownloadLinkInner) {
    this.backupDownloadLinkInner = backupDownloadLinkInner;
  }

  public BackupDatabaseDetailForDescribeBackupDetailOutput backupEndTime(String backupEndTime) {
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

  public BackupDatabaseDetailForDescribeBackupDetailOutput backupFileName(String backupFileName) {
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

  public BackupDatabaseDetailForDescribeBackupDetailOutput backupFileSize(Long backupFileSize) {
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

  public BackupDatabaseDetailForDescribeBackupDetailOutput backupStartTime(String backupStartTime) {
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

  public BackupDatabaseDetailForDescribeBackupDetailOutput backupType(String backupType) {
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

  public BackupDatabaseDetailForDescribeBackupDetailOutput databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @Schema(description = "")
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  public BackupDatabaseDetailForDescribeBackupDetailOutput downloadProgress(Integer downloadProgress) {
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

  public BackupDatabaseDetailForDescribeBackupDetailOutput downloadStatus(String downloadStatus) {
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

  public BackupDatabaseDetailForDescribeBackupDetailOutput linkExpiredTime(String linkExpiredTime) {
    this.linkExpiredTime = linkExpiredTime;
    return this;
  }

   /**
   * Get linkExpiredTime
   * @return linkExpiredTime
  **/
  @Schema(description = "")
  public String getLinkExpiredTime() {
    return linkExpiredTime;
  }

  public void setLinkExpiredTime(String linkExpiredTime) {
    this.linkExpiredTime = linkExpiredTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupDatabaseDetailForDescribeBackupDetailOutput backupDatabaseDetailForDescribeBackupDetailOutput = (BackupDatabaseDetailForDescribeBackupDetailOutput) o;
    return Objects.equals(this.backupDownloadLinkEIP, backupDatabaseDetailForDescribeBackupDetailOutput.backupDownloadLinkEIP) &&
        Objects.equals(this.backupDownloadLinkInner, backupDatabaseDetailForDescribeBackupDetailOutput.backupDownloadLinkInner) &&
        Objects.equals(this.backupEndTime, backupDatabaseDetailForDescribeBackupDetailOutput.backupEndTime) &&
        Objects.equals(this.backupFileName, backupDatabaseDetailForDescribeBackupDetailOutput.backupFileName) &&
        Objects.equals(this.backupFileSize, backupDatabaseDetailForDescribeBackupDetailOutput.backupFileSize) &&
        Objects.equals(this.backupStartTime, backupDatabaseDetailForDescribeBackupDetailOutput.backupStartTime) &&
        Objects.equals(this.backupType, backupDatabaseDetailForDescribeBackupDetailOutput.backupType) &&
        Objects.equals(this.databaseName, backupDatabaseDetailForDescribeBackupDetailOutput.databaseName) &&
        Objects.equals(this.downloadProgress, backupDatabaseDetailForDescribeBackupDetailOutput.downloadProgress) &&
        Objects.equals(this.downloadStatus, backupDatabaseDetailForDescribeBackupDetailOutput.downloadStatus) &&
        Objects.equals(this.linkExpiredTime, backupDatabaseDetailForDescribeBackupDetailOutput.linkExpiredTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupDownloadLinkEIP, backupDownloadLinkInner, backupEndTime, backupFileName, backupFileSize, backupStartTime, backupType, databaseName, downloadProgress, downloadStatus, linkExpiredTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDatabaseDetailForDescribeBackupDetailOutput {\n");
    
    sb.append("    backupDownloadLinkEIP: ").append(toIndentedString(backupDownloadLinkEIP)).append("\n");
    sb.append("    backupDownloadLinkInner: ").append(toIndentedString(backupDownloadLinkInner)).append("\n");
    sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
    sb.append("    backupFileName: ").append(toIndentedString(backupFileName)).append("\n");
    sb.append("    backupFileSize: ").append(toIndentedString(backupFileSize)).append("\n");
    sb.append("    backupStartTime: ").append(toIndentedString(backupStartTime)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    downloadProgress: ").append(toIndentedString(downloadProgress)).append("\n");
    sb.append("    downloadStatus: ").append(toIndentedString(downloadStatus)).append("\n");
    sb.append("    linkExpiredTime: ").append(toIndentedString(linkExpiredTime)).append("\n");
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
