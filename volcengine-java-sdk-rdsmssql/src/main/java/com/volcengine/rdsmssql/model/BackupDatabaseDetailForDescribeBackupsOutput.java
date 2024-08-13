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
 * BackupDatabaseDetailForDescribeBackupsOutput
 */



public class BackupDatabaseDetailForDescribeBackupsOutput {
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

  public BackupDatabaseDetailForDescribeBackupsOutput backupDownloadLinkEIP(String backupDownloadLinkEIP) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput backupDownloadLinkInner(String backupDownloadLinkInner) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput backupEndTime(String backupEndTime) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput backupFileName(String backupFileName) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput backupFileSize(Long backupFileSize) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput backupStartTime(String backupStartTime) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput backupType(String backupType) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput databaseName(String databaseName) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput downloadProgress(Integer downloadProgress) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput downloadStatus(String downloadStatus) {
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

  public BackupDatabaseDetailForDescribeBackupsOutput linkExpiredTime(String linkExpiredTime) {
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
    BackupDatabaseDetailForDescribeBackupsOutput backupDatabaseDetailForDescribeBackupsOutput = (BackupDatabaseDetailForDescribeBackupsOutput) o;
    return Objects.equals(this.backupDownloadLinkEIP, backupDatabaseDetailForDescribeBackupsOutput.backupDownloadLinkEIP) &&
        Objects.equals(this.backupDownloadLinkInner, backupDatabaseDetailForDescribeBackupsOutput.backupDownloadLinkInner) &&
        Objects.equals(this.backupEndTime, backupDatabaseDetailForDescribeBackupsOutput.backupEndTime) &&
        Objects.equals(this.backupFileName, backupDatabaseDetailForDescribeBackupsOutput.backupFileName) &&
        Objects.equals(this.backupFileSize, backupDatabaseDetailForDescribeBackupsOutput.backupFileSize) &&
        Objects.equals(this.backupStartTime, backupDatabaseDetailForDescribeBackupsOutput.backupStartTime) &&
        Objects.equals(this.backupType, backupDatabaseDetailForDescribeBackupsOutput.backupType) &&
        Objects.equals(this.databaseName, backupDatabaseDetailForDescribeBackupsOutput.databaseName) &&
        Objects.equals(this.downloadProgress, backupDatabaseDetailForDescribeBackupsOutput.downloadProgress) &&
        Objects.equals(this.downloadStatus, backupDatabaseDetailForDescribeBackupsOutput.downloadStatus) &&
        Objects.equals(this.linkExpiredTime, backupDatabaseDetailForDescribeBackupsOutput.linkExpiredTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupDownloadLinkEIP, backupDownloadLinkInner, backupEndTime, backupFileName, backupFileSize, backupStartTime, backupType, databaseName, downloadProgress, downloadStatus, linkExpiredTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDatabaseDetailForDescribeBackupsOutput {\n");
    
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
