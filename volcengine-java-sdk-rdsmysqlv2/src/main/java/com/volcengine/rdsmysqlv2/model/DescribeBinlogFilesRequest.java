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
 * DescribeBinlogFilesRequest
 */


public class DescribeBinlogFilesRequest {
  @SerializedName("BackupFileNumber")
  private Integer backupFileNumber = null;

  @SerializedName("Context")
  private String context = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("StartTime")
  private String startTime = null;

  public DescribeBinlogFilesRequest backupFileNumber(Integer backupFileNumber) {
    this.backupFileNumber = backupFileNumber;
    return this;
  }

   /**
   * Get backupFileNumber
   * @return backupFileNumber
  **/
  @Schema(description = "")
  public Integer getBackupFileNumber() {
    return backupFileNumber;
  }

  public void setBackupFileNumber(Integer backupFileNumber) {
    this.backupFileNumber = backupFileNumber;
  }

  public DescribeBinlogFilesRequest context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public DescribeBinlogFilesRequest endTime(String endTime) {
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

  public DescribeBinlogFilesRequest instanceId(String instanceId) {
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

  public DescribeBinlogFilesRequest nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public DescribeBinlogFilesRequest startTime(String startTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBinlogFilesRequest describeBinlogFilesRequest = (DescribeBinlogFilesRequest) o;
    return Objects.equals(this.backupFileNumber, describeBinlogFilesRequest.backupFileNumber) &&
        Objects.equals(this.context, describeBinlogFilesRequest.context) &&
        Objects.equals(this.endTime, describeBinlogFilesRequest.endTime) &&
        Objects.equals(this.instanceId, describeBinlogFilesRequest.instanceId) &&
        Objects.equals(this.nodeId, describeBinlogFilesRequest.nodeId) &&
        Objects.equals(this.startTime, describeBinlogFilesRequest.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupFileNumber, context, endTime, instanceId, nodeId, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBinlogFilesRequest {\n");
    
    sb.append("    backupFileNumber: ").append(toIndentedString(backupFileNumber)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
