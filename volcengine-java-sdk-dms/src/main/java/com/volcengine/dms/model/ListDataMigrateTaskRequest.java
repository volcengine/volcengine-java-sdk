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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDataMigrateTaskRequest
 */



public class ListDataMigrateTaskRequest {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

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

  public ListDataMigrateTaskRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * minimum: 1
   * maximum: 100
   * @return limit
  **/
 @Min(1) @Max(100)  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListDataMigrateTaskRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * minimum: 0
   * @return offset
  **/
  @NotNull
 @Min(0)  @Schema(required = true, description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListDataMigrateTaskRequest taskStatus(TaskStatusEnum taskStatus) {
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
    ListDataMigrateTaskRequest listDataMigrateTaskRequest = (ListDataMigrateTaskRequest) o;
    return Objects.equals(this.limit, listDataMigrateTaskRequest.limit) &&
        Objects.equals(this.offset, listDataMigrateTaskRequest.offset) &&
        Objects.equals(this.taskStatus, listDataMigrateTaskRequest.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, taskStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataMigrateTaskRequest {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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