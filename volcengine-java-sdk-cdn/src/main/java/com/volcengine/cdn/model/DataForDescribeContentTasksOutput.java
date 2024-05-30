/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * DataForDescribeContentTasksOutput
 */



public class DataForDescribeContentTasksOutput {
  @SerializedName("CreateTime")
  private Long createTime = null;

  @SerializedName("Delete")
  private Boolean delete = null;

  @SerializedName("Layer")
  private String layer = null;

  @SerializedName("Process")
  private String process = null;

  @SerializedName("RefreshPrefix")
  private Boolean refreshPrefix = null;

  @SerializedName("Remark")
  private String remark = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TaskID")
  private String taskID = null;

  @SerializedName("TaskType")
  private String taskType = null;

  @SerializedName("Url")
  private String url = null;

  public DataForDescribeContentTasksOutput createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public DataForDescribeContentTasksOutput delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @Schema(description = "")
  public Boolean isDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public DataForDescribeContentTasksOutput layer(String layer) {
    this.layer = layer;
    return this;
  }

   /**
   * Get layer
   * @return layer
  **/
  @Schema(description = "")
  public String getLayer() {
    return layer;
  }

  public void setLayer(String layer) {
    this.layer = layer;
  }

  public DataForDescribeContentTasksOutput process(String process) {
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @Schema(description = "")
  public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public DataForDescribeContentTasksOutput refreshPrefix(Boolean refreshPrefix) {
    this.refreshPrefix = refreshPrefix;
    return this;
  }

   /**
   * Get refreshPrefix
   * @return refreshPrefix
  **/
  @Schema(description = "")
  public Boolean isRefreshPrefix() {
    return refreshPrefix;
  }

  public void setRefreshPrefix(Boolean refreshPrefix) {
    this.refreshPrefix = refreshPrefix;
  }

  public DataForDescribeContentTasksOutput remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @Schema(description = "")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public DataForDescribeContentTasksOutput status(String status) {
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

  public DataForDescribeContentTasksOutput taskID(String taskID) {
    this.taskID = taskID;
    return this;
  }

   /**
   * Get taskID
   * @return taskID
  **/
  @Schema(description = "")
  public String getTaskID() {
    return taskID;
  }

  public void setTaskID(String taskID) {
    this.taskID = taskID;
  }

  public DataForDescribeContentTasksOutput taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @Schema(description = "")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public DataForDescribeContentTasksOutput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForDescribeContentTasksOutput dataForDescribeContentTasksOutput = (DataForDescribeContentTasksOutput) o;
    return Objects.equals(this.createTime, dataForDescribeContentTasksOutput.createTime) &&
        Objects.equals(this.delete, dataForDescribeContentTasksOutput.delete) &&
        Objects.equals(this.layer, dataForDescribeContentTasksOutput.layer) &&
        Objects.equals(this.process, dataForDescribeContentTasksOutput.process) &&
        Objects.equals(this.refreshPrefix, dataForDescribeContentTasksOutput.refreshPrefix) &&
        Objects.equals(this.remark, dataForDescribeContentTasksOutput.remark) &&
        Objects.equals(this.status, dataForDescribeContentTasksOutput.status) &&
        Objects.equals(this.taskID, dataForDescribeContentTasksOutput.taskID) &&
        Objects.equals(this.taskType, dataForDescribeContentTasksOutput.taskType) &&
        Objects.equals(this.url, dataForDescribeContentTasksOutput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, delete, layer, process, refreshPrefix, remark, status, taskID, taskType, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForDescribeContentTasksOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    refreshPrefix: ").append(toIndentedString(refreshPrefix)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
