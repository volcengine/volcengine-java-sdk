/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.seccenter20240508.model.ConfigForGetVirusTaskInfoOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetVirusTaskInfoResponse
 */



public class GetVirusTaskInfoResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("Config")
  private ConfigForGetVirusTaskInfoOutput config = null;

  @SerializedName("CreateTime")
  private Integer createTime = null;

  @SerializedName("DistributedCount")
  private Integer distributedCount = null;

  @SerializedName("IDCount")
  private Double idCount = null;

  @SerializedName("IDList")
  private List<String> idList = null;

  @SerializedName("SubTaskCreated")
  private Integer subTaskCreated = null;

  @SerializedName("SubTaskFailed")
  private Integer subTaskFailed = null;

  @SerializedName("SubTaskRunning")
  private Integer subTaskRunning = null;

  @SerializedName("SubTaskSucceed")
  private Integer subTaskSucceed = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("TaskID")
  private String taskID = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("TaskStatus")
  private String taskStatus = null;

  @SerializedName("TaskType")
  private String taskType = null;

  @SerializedName("TaskUser")
  private String taskUser = null;

  @SerializedName("UpdateTime")
  private Integer updateTime = null;

  public GetVirusTaskInfoResponse action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public GetVirusTaskInfoResponse config(ConfigForGetVirusTaskInfoOutput config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Valid
  @Schema(description = "")
  public ConfigForGetVirusTaskInfoOutput getConfig() {
    return config;
  }

  public void setConfig(ConfigForGetVirusTaskInfoOutput config) {
    this.config = config;
  }

  public GetVirusTaskInfoResponse createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public GetVirusTaskInfoResponse distributedCount(Integer distributedCount) {
    this.distributedCount = distributedCount;
    return this;
  }

   /**
   * Get distributedCount
   * @return distributedCount
  **/
  @Schema(description = "")
  public Integer getDistributedCount() {
    return distributedCount;
  }

  public void setDistributedCount(Integer distributedCount) {
    this.distributedCount = distributedCount;
  }

  public GetVirusTaskInfoResponse idCount(Double idCount) {
    this.idCount = idCount;
    return this;
  }

   /**
   * Get idCount
   * @return idCount
  **/
  @Schema(description = "")
  public Double getIdCount() {
    return idCount;
  }

  public void setIdCount(Double idCount) {
    this.idCount = idCount;
  }

  public GetVirusTaskInfoResponse idList(List<String> idList) {
    this.idList = idList;
    return this;
  }

  public GetVirusTaskInfoResponse addIdListItem(String idListItem) {
    if (this.idList == null) {
      this.idList = new ArrayList<String>();
    }
    this.idList.add(idListItem);
    return this;
  }

   /**
   * Get idList
   * @return idList
  **/
  @Schema(description = "")
  public List<String> getIdList() {
    return idList;
  }

  public void setIdList(List<String> idList) {
    this.idList = idList;
  }

  public GetVirusTaskInfoResponse subTaskCreated(Integer subTaskCreated) {
    this.subTaskCreated = subTaskCreated;
    return this;
  }

   /**
   * Get subTaskCreated
   * @return subTaskCreated
  **/
  @Schema(description = "")
  public Integer getSubTaskCreated() {
    return subTaskCreated;
  }

  public void setSubTaskCreated(Integer subTaskCreated) {
    this.subTaskCreated = subTaskCreated;
  }

  public GetVirusTaskInfoResponse subTaskFailed(Integer subTaskFailed) {
    this.subTaskFailed = subTaskFailed;
    return this;
  }

   /**
   * Get subTaskFailed
   * @return subTaskFailed
  **/
  @Schema(description = "")
  public Integer getSubTaskFailed() {
    return subTaskFailed;
  }

  public void setSubTaskFailed(Integer subTaskFailed) {
    this.subTaskFailed = subTaskFailed;
  }

  public GetVirusTaskInfoResponse subTaskRunning(Integer subTaskRunning) {
    this.subTaskRunning = subTaskRunning;
    return this;
  }

   /**
   * Get subTaskRunning
   * @return subTaskRunning
  **/
  @Schema(description = "")
  public Integer getSubTaskRunning() {
    return subTaskRunning;
  }

  public void setSubTaskRunning(Integer subTaskRunning) {
    this.subTaskRunning = subTaskRunning;
  }

  public GetVirusTaskInfoResponse subTaskSucceed(Integer subTaskSucceed) {
    this.subTaskSucceed = subTaskSucceed;
    return this;
  }

   /**
   * Get subTaskSucceed
   * @return subTaskSucceed
  **/
  @Schema(description = "")
  public Integer getSubTaskSucceed() {
    return subTaskSucceed;
  }

  public void setSubTaskSucceed(Integer subTaskSucceed) {
    this.subTaskSucceed = subTaskSucceed;
  }

  public GetVirusTaskInfoResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public GetVirusTaskInfoResponse taskID(String taskID) {
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

  public GetVirusTaskInfoResponse taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @Schema(description = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public GetVirusTaskInfoResponse taskStatus(String taskStatus) {
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

  public GetVirusTaskInfoResponse taskType(String taskType) {
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

  public GetVirusTaskInfoResponse taskUser(String taskUser) {
    this.taskUser = taskUser;
    return this;
  }

   /**
   * Get taskUser
   * @return taskUser
  **/
  @Schema(description = "")
  public String getTaskUser() {
    return taskUser;
  }

  public void setTaskUser(String taskUser) {
    this.taskUser = taskUser;
  }

  public GetVirusTaskInfoResponse updateTime(Integer updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public Integer getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetVirusTaskInfoResponse getVirusTaskInfoResponse = (GetVirusTaskInfoResponse) o;
    return Objects.equals(this.action, getVirusTaskInfoResponse.action) &&
        Objects.equals(this.config, getVirusTaskInfoResponse.config) &&
        Objects.equals(this.createTime, getVirusTaskInfoResponse.createTime) &&
        Objects.equals(this.distributedCount, getVirusTaskInfoResponse.distributedCount) &&
        Objects.equals(this.idCount, getVirusTaskInfoResponse.idCount) &&
        Objects.equals(this.idList, getVirusTaskInfoResponse.idList) &&
        Objects.equals(this.subTaskCreated, getVirusTaskInfoResponse.subTaskCreated) &&
        Objects.equals(this.subTaskFailed, getVirusTaskInfoResponse.subTaskFailed) &&
        Objects.equals(this.subTaskRunning, getVirusTaskInfoResponse.subTaskRunning) &&
        Objects.equals(this.subTaskSucceed, getVirusTaskInfoResponse.subTaskSucceed) &&
        Objects.equals(this.tag, getVirusTaskInfoResponse.tag) &&
        Objects.equals(this.taskID, getVirusTaskInfoResponse.taskID) &&
        Objects.equals(this.taskName, getVirusTaskInfoResponse.taskName) &&
        Objects.equals(this.taskStatus, getVirusTaskInfoResponse.taskStatus) &&
        Objects.equals(this.taskType, getVirusTaskInfoResponse.taskType) &&
        Objects.equals(this.taskUser, getVirusTaskInfoResponse.taskUser) &&
        Objects.equals(this.updateTime, getVirusTaskInfoResponse.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, config, createTime, distributedCount, idCount, idList, subTaskCreated, subTaskFailed, subTaskRunning, subTaskSucceed, tag, taskID, taskName, taskStatus, taskType, taskUser, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVirusTaskInfoResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    distributedCount: ").append(toIndentedString(distributedCount)).append("\n");
    sb.append("    idCount: ").append(toIndentedString(idCount)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
    sb.append("    subTaskCreated: ").append(toIndentedString(subTaskCreated)).append("\n");
    sb.append("    subTaskFailed: ").append(toIndentedString(subTaskFailed)).append("\n");
    sb.append("    subTaskRunning: ").append(toIndentedString(subTaskRunning)).append("\n");
    sb.append("    subTaskSucceed: ").append(toIndentedString(subTaskSucceed)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    taskUser: ").append(toIndentedString(taskUser)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
