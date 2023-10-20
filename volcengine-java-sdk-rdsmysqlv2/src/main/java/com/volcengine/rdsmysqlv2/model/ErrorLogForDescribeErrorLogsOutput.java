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
 * ErrorLogForDescribeErrorLogsOutput
 */


public class ErrorLogForDescribeErrorLogsOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("LogInfo")
  private String logInfo = null;

  @SerializedName("LogLevel")
  private String logLevel = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  public ErrorLogForDescribeErrorLogsOutput createTime(String createTime) {
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

  public ErrorLogForDescribeErrorLogsOutput logInfo(String logInfo) {
    this.logInfo = logInfo;
    return this;
  }

   /**
   * Get logInfo
   * @return logInfo
  **/
  @Schema(description = "")
  public String getLogInfo() {
    return logInfo;
  }

  public void setLogInfo(String logInfo) {
    this.logInfo = logInfo;
  }

  public ErrorLogForDescribeErrorLogsOutput logLevel(String logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Get logLevel
   * @return logLevel
  **/
  @Schema(description = "")
  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public ErrorLogForDescribeErrorLogsOutput nodeId(String nodeId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorLogForDescribeErrorLogsOutput errorLogForDescribeErrorLogsOutput = (ErrorLogForDescribeErrorLogsOutput) o;
    return Objects.equals(this.createTime, errorLogForDescribeErrorLogsOutput.createTime) &&
        Objects.equals(this.logInfo, errorLogForDescribeErrorLogsOutput.logInfo) &&
        Objects.equals(this.logLevel, errorLogForDescribeErrorLogsOutput.logLevel) &&
        Objects.equals(this.nodeId, errorLogForDescribeErrorLogsOutput.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, logInfo, logLevel, nodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorLogForDescribeErrorLogsOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
