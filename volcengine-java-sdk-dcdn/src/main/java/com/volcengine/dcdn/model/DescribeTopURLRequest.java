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
 * DescribeTopURLRequest
 */



public class DescribeTopURLRequest {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("ProjectName")
  private List<String> projectName = null;

  @SerializedName("Sort")
  private String sort = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("StatusCode")
  private List<String> statusCode = null;

  public DescribeTopURLRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DescribeTopURLRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DescribeTopURLRequest limit(Integer limit) {
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

  public DescribeTopURLRequest projectName(List<String> projectName) {
    this.projectName = projectName;
    return this;
  }

  public DescribeTopURLRequest addProjectNameItem(String projectNameItem) {
    if (this.projectName == null) {
      this.projectName = new ArrayList<String>();
    }
    this.projectName.add(projectNameItem);
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public List<String> getProjectName() {
    return projectName;
  }

  public void setProjectName(List<String> projectName) {
    this.projectName = projectName;
  }

  public DescribeTopURLRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public DescribeTopURLRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DescribeTopURLRequest statusCode(List<String> statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public DescribeTopURLRequest addStatusCodeItem(String statusCodeItem) {
    if (this.statusCode == null) {
      this.statusCode = new ArrayList<String>();
    }
    this.statusCode.add(statusCodeItem);
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(description = "")
  public List<String> getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(List<String> statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTopURLRequest describeTopURLRequest = (DescribeTopURLRequest) o;
    return Objects.equals(this.domain, describeTopURLRequest.domain) &&
        Objects.equals(this.endTime, describeTopURLRequest.endTime) &&
        Objects.equals(this.limit, describeTopURLRequest.limit) &&
        Objects.equals(this.projectName, describeTopURLRequest.projectName) &&
        Objects.equals(this.sort, describeTopURLRequest.sort) &&
        Objects.equals(this.startTime, describeTopURLRequest.startTime) &&
        Objects.equals(this.statusCode, describeTopURLRequest.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, endTime, limit, projectName, sort, startTime, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTopURLRequest {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
