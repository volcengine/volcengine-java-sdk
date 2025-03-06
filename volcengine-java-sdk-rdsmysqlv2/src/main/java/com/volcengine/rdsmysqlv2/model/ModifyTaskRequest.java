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
 * ModifyTaskRequest
 */



public class ModifyTaskRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ModifyBeginTime")
  private String modifyBeginTime = null;

  @SerializedName("ModifyEndTime")
  private String modifyEndTime = null;

  @SerializedName("ModifyType")
  private String modifyType = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SwitchTime")
  private String switchTime = null;

  @SerializedName("TaskEventOperation")
  private String taskEventOperation = null;

  @SerializedName("TaskId")
  private String taskId = null;

  public ModifyTaskRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyTaskRequest modifyBeginTime(String modifyBeginTime) {
    this.modifyBeginTime = modifyBeginTime;
    return this;
  }

   /**
   * Get modifyBeginTime
   * @return modifyBeginTime
  **/
  @Schema(description = "")
  public String getModifyBeginTime() {
    return modifyBeginTime;
  }

  public void setModifyBeginTime(String modifyBeginTime) {
    this.modifyBeginTime = modifyBeginTime;
  }

  public ModifyTaskRequest modifyEndTime(String modifyEndTime) {
    this.modifyEndTime = modifyEndTime;
    return this;
  }

   /**
   * Get modifyEndTime
   * @return modifyEndTime
  **/
  @Schema(description = "")
  public String getModifyEndTime() {
    return modifyEndTime;
  }

  public void setModifyEndTime(String modifyEndTime) {
    this.modifyEndTime = modifyEndTime;
  }

  public ModifyTaskRequest modifyType(String modifyType) {
    this.modifyType = modifyType;
    return this;
  }

   /**
   * Get modifyType
   * @return modifyType
  **/
  @Schema(description = "")
  public String getModifyType() {
    return modifyType;
  }

  public void setModifyType(String modifyType) {
    this.modifyType = modifyType;
  }

  public ModifyTaskRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ModifyTaskRequest switchTime(String switchTime) {
    this.switchTime = switchTime;
    return this;
  }

   /**
   * Get switchTime
   * @return switchTime
  **/
  @Schema(description = "")
  public String getSwitchTime() {
    return switchTime;
  }

  public void setSwitchTime(String switchTime) {
    this.switchTime = switchTime;
  }

  public ModifyTaskRequest taskEventOperation(String taskEventOperation) {
    this.taskEventOperation = taskEventOperation;
    return this;
  }

   /**
   * Get taskEventOperation
   * @return taskEventOperation
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTaskEventOperation() {
    return taskEventOperation;
  }

  public void setTaskEventOperation(String taskEventOperation) {
    this.taskEventOperation = taskEventOperation;
  }

  public ModifyTaskRequest taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyTaskRequest modifyTaskRequest = (ModifyTaskRequest) o;
    return Objects.equals(this.instanceId, modifyTaskRequest.instanceId) &&
        Objects.equals(this.modifyBeginTime, modifyTaskRequest.modifyBeginTime) &&
        Objects.equals(this.modifyEndTime, modifyTaskRequest.modifyEndTime) &&
        Objects.equals(this.modifyType, modifyTaskRequest.modifyType) &&
        Objects.equals(this.projectName, modifyTaskRequest.projectName) &&
        Objects.equals(this.switchTime, modifyTaskRequest.switchTime) &&
        Objects.equals(this.taskEventOperation, modifyTaskRequest.taskEventOperation) &&
        Objects.equals(this.taskId, modifyTaskRequest.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, modifyBeginTime, modifyEndTime, modifyType, projectName, switchTime, taskEventOperation, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyTaskRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    modifyBeginTime: ").append(toIndentedString(modifyBeginTime)).append("\n");
    sb.append("    modifyEndTime: ").append(toIndentedString(modifyEndTime)).append("\n");
    sb.append("    modifyType: ").append(toIndentedString(modifyType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    switchTime: ").append(toIndentedString(switchTime)).append("\n");
    sb.append("    taskEventOperation: ").append(toIndentedString(taskEventOperation)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
