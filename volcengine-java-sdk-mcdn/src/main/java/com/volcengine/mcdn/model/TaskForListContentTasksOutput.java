/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.SubTaskForListContentTasksOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TaskForListContentTasksOutput
 */



public class TaskForListContentTasksOutput {
  @SerializedName("CreatedAt")
  private Long createdAt = null;

  @SerializedName("EndAt")
  private Long endAt = null;

  @SerializedName("SubTasks")
  private List<SubTaskForListContentTasksOutput> subTasks = null;

  @SerializedName("TaskId")
  private String taskId = null;

  @SerializedName("TaskStatus")
  private String taskStatus = null;

  @SerializedName("TaskType")
  private String taskType = null;

  @SerializedName("Vendor")
  private String vendor = null;

  public TaskForListContentTasksOutput createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public TaskForListContentTasksOutput endAt(Long endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @Schema(description = "")
  public Long getEndAt() {
    return endAt;
  }

  public void setEndAt(Long endAt) {
    this.endAt = endAt;
  }

  public TaskForListContentTasksOutput subTasks(List<SubTaskForListContentTasksOutput> subTasks) {
    this.subTasks = subTasks;
    return this;
  }

  public TaskForListContentTasksOutput addSubTasksItem(SubTaskForListContentTasksOutput subTasksItem) {
    if (this.subTasks == null) {
      this.subTasks = new ArrayList<SubTaskForListContentTasksOutput>();
    }
    this.subTasks.add(subTasksItem);
    return this;
  }

   /**
   * Get subTasks
   * @return subTasks
  **/
  @Valid
  @Schema(description = "")
  public List<SubTaskForListContentTasksOutput> getSubTasks() {
    return subTasks;
  }

  public void setSubTasks(List<SubTaskForListContentTasksOutput> subTasks) {
    this.subTasks = subTasks;
  }

  public TaskForListContentTasksOutput taskId(String taskId) {
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

  public TaskForListContentTasksOutput taskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @Schema(description = "")
  public String getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }

  public TaskForListContentTasksOutput taskType(String taskType) {
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

  public TaskForListContentTasksOutput vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @Schema(description = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskForListContentTasksOutput taskForListContentTasksOutput = (TaskForListContentTasksOutput) o;
    return Objects.equals(this.createdAt, taskForListContentTasksOutput.createdAt) &&
        Objects.equals(this.endAt, taskForListContentTasksOutput.endAt) &&
        Objects.equals(this.subTasks, taskForListContentTasksOutput.subTasks) &&
        Objects.equals(this.taskId, taskForListContentTasksOutput.taskId) &&
        Objects.equals(this.taskStatus, taskForListContentTasksOutput.taskStatus) &&
        Objects.equals(this.taskType, taskForListContentTasksOutput.taskType) &&
        Objects.equals(this.vendor, taskForListContentTasksOutput.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, endAt, subTasks, taskId, taskStatus, taskType, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskForListContentTasksOutput {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
