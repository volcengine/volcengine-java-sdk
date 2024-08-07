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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DeleteUsageReportResponse
 */



public class DeleteUsageReportResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("TaskIds")
  private List<String> taskIds = null;

  public DeleteUsageReportResponse taskIds(List<String> taskIds) {
    this.taskIds = taskIds;
    return this;
  }

  public DeleteUsageReportResponse addTaskIdsItem(String taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<String>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * Get taskIds
   * @return taskIds
  **/
  @Schema(description = "")
  public List<String> getTaskIds() {
    return taskIds;
  }

  public void setTaskIds(List<String> taskIds) {
    this.taskIds = taskIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteUsageReportResponse deleteUsageReportResponse = (DeleteUsageReportResponse) o;
    return Objects.equals(this.taskIds, deleteUsageReportResponse.taskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteUsageReportResponse {\n");
    
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
