/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

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
 * DataForListBackupsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:11.413715+08:00[Asia/Shanghai]")
public class DataForListBackupsOutput {
  @SerializedName("BackupEndTime")
  private String backupEndTime = null;

  @SerializedName("BackupFileName")
  private String backupFileName = null;

  @SerializedName("BackupFileSize")
  private Long backupFileSize = null;

  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("BackupMode")
  private String backupMode = null;

  @SerializedName("BackupStartTime")
  private String backupStartTime = null;

  @SerializedName("BackupStatus")
  private String backupStatus = null;

  @SerializedName("BackupStrategy")
  private String backupStrategy = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("CreateType")
  private String createType = null;

  public DataForListBackupsOutput backupEndTime(String backupEndTime) {
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

  public DataForListBackupsOutput backupFileName(String backupFileName) {
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

  public DataForListBackupsOutput backupFileSize(Long backupFileSize) {
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

  public DataForListBackupsOutput backupId(String backupId) {
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

  public DataForListBackupsOutput backupMode(String backupMode) {
    this.backupMode = backupMode;
    return this;
  }

   /**
   * Get backupMode
   * @return backupMode
  **/
  @Schema(description = "")
  public String getBackupMode() {
    return backupMode;
  }

  public void setBackupMode(String backupMode) {
    this.backupMode = backupMode;
  }

  public DataForListBackupsOutput backupStartTime(String backupStartTime) {
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

  public DataForListBackupsOutput backupStatus(String backupStatus) {
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

  public DataForListBackupsOutput backupStrategy(String backupStrategy) {
    this.backupStrategy = backupStrategy;
    return this;
  }

   /**
   * Get backupStrategy
   * @return backupStrategy
  **/
  @Schema(description = "")
  public String getBackupStrategy() {
    return backupStrategy;
  }

  public void setBackupStrategy(String backupStrategy) {
    this.backupStrategy = backupStrategy;
  }

  public DataForListBackupsOutput backupType(String backupType) {
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

  public DataForListBackupsOutput createType(String createType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForListBackupsOutput dataForListBackupsOutput = (DataForListBackupsOutput) o;
    return Objects.equals(this.backupEndTime, dataForListBackupsOutput.backupEndTime) &&
        Objects.equals(this.backupFileName, dataForListBackupsOutput.backupFileName) &&
        Objects.equals(this.backupFileSize, dataForListBackupsOutput.backupFileSize) &&
        Objects.equals(this.backupId, dataForListBackupsOutput.backupId) &&
        Objects.equals(this.backupMode, dataForListBackupsOutput.backupMode) &&
        Objects.equals(this.backupStartTime, dataForListBackupsOutput.backupStartTime) &&
        Objects.equals(this.backupStatus, dataForListBackupsOutput.backupStatus) &&
        Objects.equals(this.backupStrategy, dataForListBackupsOutput.backupStrategy) &&
        Objects.equals(this.backupType, dataForListBackupsOutput.backupType) &&
        Objects.equals(this.createType, dataForListBackupsOutput.createType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupEndTime, backupFileName, backupFileSize, backupId, backupMode, backupStartTime, backupStatus, backupStrategy, backupType, createType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListBackupsOutput {\n");
    
    sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
    sb.append("    backupFileName: ").append(toIndentedString(backupFileName)).append("\n");
    sb.append("    backupFileSize: ").append(toIndentedString(backupFileSize)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupMode: ").append(toIndentedString(backupMode)).append("\n");
    sb.append("    backupStartTime: ").append(toIndentedString(backupStartTime)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
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
