/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CheckPurgePrefetchTaskRequest
 */



public class CheckPurgePrefetchTaskRequest {
  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("OrderType")
  private String orderType = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("TaskId")
  private String taskId = null;

  @SerializedName("TaskStatus")
  private List<String> taskStatus = null;

  @SerializedName("TaskType")
  private List<String> taskType = null;

  @SerializedName("Url")
  private String url = null;

  public CheckPurgePrefetchTaskRequest endTime(String endTime) {
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

  public CheckPurgePrefetchTaskRequest orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @Schema(description = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public CheckPurgePrefetchTaskRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public CheckPurgePrefetchTaskRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public CheckPurgePrefetchTaskRequest startTime(String startTime) {
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

  public CheckPurgePrefetchTaskRequest taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public CheckPurgePrefetchTaskRequest taskStatus(List<String> taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

  public CheckPurgePrefetchTaskRequest addTaskStatusItem(String taskStatusItem) {
    if (this.taskStatus == null) {
      this.taskStatus = new ArrayList<String>();
    }
    this.taskStatus.add(taskStatusItem);
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @Schema(description = "")
  public List<String> getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(List<String> taskStatus) {
    this.taskStatus = taskStatus;
  }

  public CheckPurgePrefetchTaskRequest taskType(List<String> taskType) {
    this.taskType = taskType;
    return this;
  }

  public CheckPurgePrefetchTaskRequest addTaskTypeItem(String taskTypeItem) {
    if (this.taskType == null) {
      this.taskType = new ArrayList<String>();
    }
    this.taskType.add(taskTypeItem);
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @Schema(description = "")
  public List<String> getTaskType() {
    return taskType;
  }

  public void setTaskType(List<String> taskType) {
    this.taskType = taskType;
  }

  public CheckPurgePrefetchTaskRequest url(String url) {
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
    CheckPurgePrefetchTaskRequest checkPurgePrefetchTaskRequest = (CheckPurgePrefetchTaskRequest) o;
    return Objects.equals(this.endTime, checkPurgePrefetchTaskRequest.endTime) &&
        Objects.equals(this.orderType, checkPurgePrefetchTaskRequest.orderType) &&
        Objects.equals(this.page, checkPurgePrefetchTaskRequest.page) &&
        Objects.equals(this.pageSize, checkPurgePrefetchTaskRequest.pageSize) &&
        Objects.equals(this.startTime, checkPurgePrefetchTaskRequest.startTime) &&
        Objects.equals(this.taskId, checkPurgePrefetchTaskRequest.taskId) &&
        Objects.equals(this.taskStatus, checkPurgePrefetchTaskRequest.taskStatus) &&
        Objects.equals(this.taskType, checkPurgePrefetchTaskRequest.taskType) &&
        Objects.equals(this.url, checkPurgePrefetchTaskRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, orderType, page, pageSize, startTime, taskId, taskStatus, taskType, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPurgePrefetchTaskRequest {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
