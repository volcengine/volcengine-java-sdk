/*
 * iam20210801
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam20210801.model;

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
 * ListProjectsRequest
 */


public class ListProjectsRequest {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("Query")
  private String query = null;

  @SerializedName("WithParentProject")
  private Integer withParentProject = null;

  public ListProjectsRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListProjectsRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @Schema(description = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListProjectsRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @Schema(description = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ListProjectsRequest withParentProject(Integer withParentProject) {
    this.withParentProject = withParentProject;
    return this;
  }

   /**
   * Get withParentProject
   * @return withParentProject
  **/
  @Schema(description = "")
  public Integer getWithParentProject() {
    return withParentProject;
  }

  public void setWithParentProject(Integer withParentProject) {
    this.withParentProject = withParentProject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProjectsRequest listProjectsRequest = (ListProjectsRequest) o;
    return Objects.equals(this.limit, listProjectsRequest.limit) &&
        Objects.equals(this.offset, listProjectsRequest.offset) &&
        Objects.equals(this.query, listProjectsRequest.query) &&
        Objects.equals(this.withParentProject, listProjectsRequest.withParentProject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, query, withParentProject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProjectsRequest {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    withParentProject: ").append(toIndentedString(withParentProject)).append("\n");
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