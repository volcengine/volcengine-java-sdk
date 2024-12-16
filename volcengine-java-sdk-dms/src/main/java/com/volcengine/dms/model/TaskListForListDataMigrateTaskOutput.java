/*
 * dms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dms.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dms.model.TaskProgressForListDataMigrateTaskOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TaskListForListDataMigrateTaskOutput
 */



public class TaskListForListDataMigrateTaskOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("TaskID")
  private Long taskID = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("TaskProgress")
  private TaskProgressForListDataMigrateTaskOutput taskProgress = null;

  /**
   * Gets or Sets taskStatus
   */
  @JsonAdapter(TaskStatusEnum.Adapter.class)
  public enum TaskStatusEnum {
    @SerializedName("Preparing")
    PREPARING("Preparing"),
    @SerializedName("Transferring")
    TRANSFERRING("Transferring"),
    @SerializedName("Suspended")
    SUSPENDED("Suspended"),
    @SerializedName("Success")
    SUCCESS("Success"),
    @SerializedName("Stopping")
    STOPPING("Stopping"),
    @SerializedName("Stopped")
    STOPPED("Stopped"),
    @SerializedName("Failure")
    FAILURE("Failure"),
    @SerializedName("ResultGenerating")
    RESULTGENERATING("ResultGenerating");

    private String value;

    TaskStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TaskStatusEnum fromValue(String input) {
      for (TaskStatusEnum b : TaskStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TaskStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaskStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TaskStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TaskStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("TaskStatus")
  private TaskStatusEnum taskStatus = null;

  public TaskListForListDataMigrateTaskOutput createTime(String createTime) {
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

  public TaskListForListDataMigrateTaskOutput taskID(Long taskID) {
    this.taskID = taskID;
    return this;
  }

   /**
   * Get taskID
   * @return taskID
  **/
  @Schema(description = "")
  public Long getTaskID() {
    return taskID;
  }

  public void setTaskID(Long taskID) {
    this.taskID = taskID;
  }

  public TaskListForListDataMigrateTaskOutput taskName(String taskName) {
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

  public TaskListForListDataMigrateTaskOutput taskProgress(TaskProgressForListDataMigrateTaskOutput taskProgress) {
    this.taskProgress = taskProgress;
    return this;
  }

   /**
   * Get taskProgress
   * @return taskProgress
  **/
  @Valid
  @Schema(description = "")
  public TaskProgressForListDataMigrateTaskOutput getTaskProgress() {
    return taskProgress;
  }

  public void setTaskProgress(TaskProgressForListDataMigrateTaskOutput taskProgress) {
    this.taskProgress = taskProgress;
  }

  public TaskListForListDataMigrateTaskOutput taskStatus(TaskStatusEnum taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @Schema(description = "")
  public TaskStatusEnum getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(TaskStatusEnum taskStatus) {
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
    TaskListForListDataMigrateTaskOutput taskListForListDataMigrateTaskOutput = (TaskListForListDataMigrateTaskOutput) o;
    return Objects.equals(this.createTime, taskListForListDataMigrateTaskOutput.createTime) &&
        Objects.equals(this.taskID, taskListForListDataMigrateTaskOutput.taskID) &&
        Objects.equals(this.taskName, taskListForListDataMigrateTaskOutput.taskName) &&
        Objects.equals(this.taskProgress, taskListForListDataMigrateTaskOutput.taskProgress) &&
        Objects.equals(this.taskStatus, taskListForListDataMigrateTaskOutput.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, taskID, taskName, taskProgress, taskStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListForListDataMigrateTaskOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    taskProgress: ").append(toIndentedString(taskProgress)).append("\n");
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