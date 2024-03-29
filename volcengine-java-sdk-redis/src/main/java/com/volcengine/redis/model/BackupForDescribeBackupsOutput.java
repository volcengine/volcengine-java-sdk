/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.redis.model.InstanceDetailForDescribeBackupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BackupForDescribeBackupsOutput
 */


public class BackupForDescribeBackupsOutput {
  @SerializedName("BackupPointId")
  private String backupPointId = null;

  @SerializedName("BackupStrategy")
  private String backupStrategy = null;

  @SerializedName("BackupType")
  private String backupType = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("InstanceDetail")
  private InstanceDetailForDescribeBackupsOutput instanceDetail = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Size")
  private Long size = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("Status")
  private String status = null;

  public BackupForDescribeBackupsOutput backupPointId(String backupPointId) {
    this.backupPointId = backupPointId;
    return this;
  }

   /**
   * Get backupPointId
   * @return backupPointId
  **/
  @Schema(description = "")
  public String getBackupPointId() {
    return backupPointId;
  }

  public void setBackupPointId(String backupPointId) {
    this.backupPointId = backupPointId;
  }

  public BackupForDescribeBackupsOutput backupStrategy(String backupStrategy) {
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

  public BackupForDescribeBackupsOutput endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public BackupForDescribeBackupsOutput instanceDetail(InstanceDetailForDescribeBackupsOutput instanceDetail) {
    this.instanceDetail = instanceDetail;
    return this;
  }

   /**
   * Get instanceDetail
   * @return instanceDetail
  **/
  @Valid
  @Schema(description = "")
  public InstanceDetailForDescribeBackupsOutput getInstanceDetail() {
    return instanceDetail;
  }

  public void setInstanceDetail(InstanceDetailForDescribeBackupsOutput instanceDetail) {
    this.instanceDetail = instanceDetail;
  }

  public BackupForDescribeBackupsOutput instanceId(String instanceId) {
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

  public BackupForDescribeBackupsOutput size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public BackupForDescribeBackupsOutput startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public BackupForDescribeBackupsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
    return Objects.equals(this.backupPointId, backupForDescribeBackupsOutput.backupPointId) &&
        Objects.equals(this.backupStrategy, backupForDescribeBackupsOutput.backupStrategy) &&
        Objects.equals(this.backupType, backupForDescribeBackupsOutput.backupType) &&
        Objects.equals(this.endTime, backupForDescribeBackupsOutput.endTime) &&
        Objects.equals(this.instanceDetail, backupForDescribeBackupsOutput.instanceDetail) &&
        Objects.equals(this.instanceId, backupForDescribeBackupsOutput.instanceId) &&
        Objects.equals(this.size, backupForDescribeBackupsOutput.size) &&
        Objects.equals(this.startTime, backupForDescribeBackupsOutput.startTime) &&
        Objects.equals(this.status, backupForDescribeBackupsOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPointId, backupStrategy, backupType, endTime, instanceDetail, instanceId, size, startTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupForDescribeBackupsOutput {\n");
    
    sb.append("    backupPointId: ").append(toIndentedString(backupPointId)).append("\n");
    sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    instanceDetail: ").append(toIndentedString(instanceDetail)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
