/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bio.model.FilterForListRunsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListRunsRequest
 */



public class ListRunsRequest {
  @SerializedName("Filter")
  private FilterForListRunsInput filter = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SubmissionID")
  private String submissionID = null;

  @SerializedName("WorkspaceID")
  private String workspaceID = null;

  public ListRunsRequest filter(FilterForListRunsInput filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Valid
  @Schema(description = "")
  public FilterForListRunsInput getFilter() {
    return filter;
  }

  public void setFilter(FilterForListRunsInput filter) {
    this.filter = filter;
  }

  public ListRunsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * minimum: 1
   * @return pageNumber
  **/
 @Min(1)  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ListRunsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * minimum: 0
   * maximum: 100
   * @return pageSize
  **/
 @Min(0) @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListRunsRequest submissionID(String submissionID) {
    this.submissionID = submissionID;
    return this;
  }

   /**
   * Get submissionID
   * @return submissionID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubmissionID() {
    return submissionID;
  }

  public void setSubmissionID(String submissionID) {
    this.submissionID = submissionID;
  }

  public ListRunsRequest workspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
    return this;
  }

   /**
   * Get workspaceID
   * @return workspaceID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getWorkspaceID() {
    return workspaceID;
  }

  public void setWorkspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRunsRequest listRunsRequest = (ListRunsRequest) o;
    return Objects.equals(this.filter, listRunsRequest.filter) &&
        Objects.equals(this.pageNumber, listRunsRequest.pageNumber) &&
        Objects.equals(this.pageSize, listRunsRequest.pageSize) &&
        Objects.equals(this.submissionID, listRunsRequest.submissionID) &&
        Objects.equals(this.workspaceID, listRunsRequest.workspaceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageNumber, pageSize, submissionID, workspaceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRunsRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    submissionID: ").append(toIndentedString(submissionID)).append("\n");
    sb.append("    workspaceID: ").append(toIndentedString(workspaceID)).append("\n");
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
