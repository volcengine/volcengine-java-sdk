/*
 * volc_content_platform
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volccontentplatform.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volccontentplatform.model.ModelInfoListForGetAuditTaskDetailedInfoOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TaskInfoForGetAuditTaskDetailedInfoOutput
 */



public class TaskInfoForGetAuditTaskDetailedInfoOutput {
  @SerializedName("HitInfo")
  private List<String> hitInfo = null;

  @SerializedName("MachineAuditResult")
  private String machineAuditResult = null;

  @SerializedName("ModelInfoList")
  private List<ModelInfoListForGetAuditTaskDetailedInfoOutput> modelInfoList = null;

  @SerializedName("ProcessType")
  private String processType = null;

  @SerializedName("ProjectId")
  private String projectId = null;

  @SerializedName("ProjectStrategyType")
  private String projectStrategyType = null;

  @SerializedName("ProjectTitle")
  private String projectTitle = null;

  @SerializedName("TaskId")
  private String taskId = null;

  @SerializedName("TaskResult")
  private String taskResult = null;

  @SerializedName("TaskRound")
  private String taskRound = null;

  @SerializedName("TaskStatus")
  private String taskStatus = null;

  public TaskInfoForGetAuditTaskDetailedInfoOutput hitInfo(List<String> hitInfo) {
    this.hitInfo = hitInfo;
    return this;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput addHitInfoItem(String hitInfoItem) {
    if (this.hitInfo == null) {
      this.hitInfo = new ArrayList<String>();
    }
    this.hitInfo.add(hitInfoItem);
    return this;
  }

   /**
   * Get hitInfo
   * @return hitInfo
  **/
  @Schema(description = "")
  public List<String> getHitInfo() {
    return hitInfo;
  }

  public void setHitInfo(List<String> hitInfo) {
    this.hitInfo = hitInfo;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput machineAuditResult(String machineAuditResult) {
    this.machineAuditResult = machineAuditResult;
    return this;
  }

   /**
   * Get machineAuditResult
   * @return machineAuditResult
  **/
  @Schema(description = "")
  public String getMachineAuditResult() {
    return machineAuditResult;
  }

  public void setMachineAuditResult(String machineAuditResult) {
    this.machineAuditResult = machineAuditResult;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput modelInfoList(List<ModelInfoListForGetAuditTaskDetailedInfoOutput> modelInfoList) {
    this.modelInfoList = modelInfoList;
    return this;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput addModelInfoListItem(ModelInfoListForGetAuditTaskDetailedInfoOutput modelInfoListItem) {
    if (this.modelInfoList == null) {
      this.modelInfoList = new ArrayList<ModelInfoListForGetAuditTaskDetailedInfoOutput>();
    }
    this.modelInfoList.add(modelInfoListItem);
    return this;
  }

   /**
   * Get modelInfoList
   * @return modelInfoList
  **/
  @Valid
  @Schema(description = "")
  public List<ModelInfoListForGetAuditTaskDetailedInfoOutput> getModelInfoList() {
    return modelInfoList;
  }

  public void setModelInfoList(List<ModelInfoListForGetAuditTaskDetailedInfoOutput> modelInfoList) {
    this.modelInfoList = modelInfoList;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput processType(String processType) {
    this.processType = processType;
    return this;
  }

   /**
   * Get processType
   * @return processType
  **/
  @Schema(description = "")
  public String getProcessType() {
    return processType;
  }

  public void setProcessType(String processType) {
    this.processType = processType;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput projectStrategyType(String projectStrategyType) {
    this.projectStrategyType = projectStrategyType;
    return this;
  }

   /**
   * Get projectStrategyType
   * @return projectStrategyType
  **/
  @Schema(description = "")
  public String getProjectStrategyType() {
    return projectStrategyType;
  }

  public void setProjectStrategyType(String projectStrategyType) {
    this.projectStrategyType = projectStrategyType;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput projectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
    return this;
  }

   /**
   * Get projectTitle
   * @return projectTitle
  **/
  @Schema(description = "")
  public String getProjectTitle() {
    return projectTitle;
  }

  public void setProjectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput taskId(String taskId) {
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

  public TaskInfoForGetAuditTaskDetailedInfoOutput taskResult(String taskResult) {
    this.taskResult = taskResult;
    return this;
  }

   /**
   * Get taskResult
   * @return taskResult
  **/
  @Schema(description = "")
  public String getTaskResult() {
    return taskResult;
  }

  public void setTaskResult(String taskResult) {
    this.taskResult = taskResult;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput taskRound(String taskRound) {
    this.taskRound = taskRound;
    return this;
  }

   /**
   * Get taskRound
   * @return taskRound
  **/
  @Schema(description = "")
  public String getTaskRound() {
    return taskRound;
  }

  public void setTaskRound(String taskRound) {
    this.taskRound = taskRound;
  }

  public TaskInfoForGetAuditTaskDetailedInfoOutput taskStatus(String taskStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInfoForGetAuditTaskDetailedInfoOutput taskInfoForGetAuditTaskDetailedInfoOutput = (TaskInfoForGetAuditTaskDetailedInfoOutput) o;
    return Objects.equals(this.hitInfo, taskInfoForGetAuditTaskDetailedInfoOutput.hitInfo) &&
        Objects.equals(this.machineAuditResult, taskInfoForGetAuditTaskDetailedInfoOutput.machineAuditResult) &&
        Objects.equals(this.modelInfoList, taskInfoForGetAuditTaskDetailedInfoOutput.modelInfoList) &&
        Objects.equals(this.processType, taskInfoForGetAuditTaskDetailedInfoOutput.processType) &&
        Objects.equals(this.projectId, taskInfoForGetAuditTaskDetailedInfoOutput.projectId) &&
        Objects.equals(this.projectStrategyType, taskInfoForGetAuditTaskDetailedInfoOutput.projectStrategyType) &&
        Objects.equals(this.projectTitle, taskInfoForGetAuditTaskDetailedInfoOutput.projectTitle) &&
        Objects.equals(this.taskId, taskInfoForGetAuditTaskDetailedInfoOutput.taskId) &&
        Objects.equals(this.taskResult, taskInfoForGetAuditTaskDetailedInfoOutput.taskResult) &&
        Objects.equals(this.taskRound, taskInfoForGetAuditTaskDetailedInfoOutput.taskRound) &&
        Objects.equals(this.taskStatus, taskInfoForGetAuditTaskDetailedInfoOutput.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hitInfo, machineAuditResult, modelInfoList, processType, projectId, projectStrategyType, projectTitle, taskId, taskResult, taskRound, taskStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInfoForGetAuditTaskDetailedInfoOutput {\n");
    
    sb.append("    hitInfo: ").append(toIndentedString(hitInfo)).append("\n");
    sb.append("    machineAuditResult: ").append(toIndentedString(machineAuditResult)).append("\n");
    sb.append("    modelInfoList: ").append(toIndentedString(modelInfoList)).append("\n");
    sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectStrategyType: ").append(toIndentedString(projectStrategyType)).append("\n");
    sb.append("    projectTitle: ").append(toIndentedString(projectTitle)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskResult: ").append(toIndentedString(taskResult)).append("\n");
    sb.append("    taskRound: ").append(toIndentedString(taskRound)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
