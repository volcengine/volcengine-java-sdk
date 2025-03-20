/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

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
 * DescribeFailoverLogsRequest
 */



public class DescribeFailoverLogsRequest {
  @SerializedName("Context")
  private String context = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("QueryEndTime")
  private String queryEndTime = null;

  @SerializedName("QueryStartTime")
  private String queryStartTime = null;

  public DescribeFailoverLogsRequest context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public DescribeFailoverLogsRequest instanceId(String instanceId) {
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

  public DescribeFailoverLogsRequest limit(Integer limit) {
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

  public DescribeFailoverLogsRequest queryEndTime(String queryEndTime) {
    this.queryEndTime = queryEndTime;
    return this;
  }

   /**
   * Get queryEndTime
   * @return queryEndTime
  **/
  @Schema(description = "")
  public String getQueryEndTime() {
    return queryEndTime;
  }

  public void setQueryEndTime(String queryEndTime) {
    this.queryEndTime = queryEndTime;
  }

  public DescribeFailoverLogsRequest queryStartTime(String queryStartTime) {
    this.queryStartTime = queryStartTime;
    return this;
  }

   /**
   * Get queryStartTime
   * @return queryStartTime
  **/
  @Schema(description = "")
  public String getQueryStartTime() {
    return queryStartTime;
  }

  public void setQueryStartTime(String queryStartTime) {
    this.queryStartTime = queryStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeFailoverLogsRequest describeFailoverLogsRequest = (DescribeFailoverLogsRequest) o;
    return Objects.equals(this.context, describeFailoverLogsRequest.context) &&
        Objects.equals(this.instanceId, describeFailoverLogsRequest.instanceId) &&
        Objects.equals(this.limit, describeFailoverLogsRequest.limit) &&
        Objects.equals(this.queryEndTime, describeFailoverLogsRequest.queryEndTime) &&
        Objects.equals(this.queryStartTime, describeFailoverLogsRequest.queryStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, instanceId, limit, queryEndTime, queryStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeFailoverLogsRequest {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
    sb.append("    queryStartTime: ").append(toIndentedString(queryStartTime)).append("\n");
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
