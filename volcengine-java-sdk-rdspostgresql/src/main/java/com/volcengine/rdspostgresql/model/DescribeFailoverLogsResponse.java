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
import com.volcengine.rdspostgresql.model.FailoverLogForDescribeFailoverLogsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeFailoverLogsResponse
 */



public class DescribeFailoverLogsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Context")
  private String context = null;

  @SerializedName("FailoverLogs")
  private List<FailoverLogForDescribeFailoverLogsOutput> failoverLogs = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeFailoverLogsResponse context(String context) {
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

  public DescribeFailoverLogsResponse failoverLogs(List<FailoverLogForDescribeFailoverLogsOutput> failoverLogs) {
    this.failoverLogs = failoverLogs;
    return this;
  }

  public DescribeFailoverLogsResponse addFailoverLogsItem(FailoverLogForDescribeFailoverLogsOutput failoverLogsItem) {
    if (this.failoverLogs == null) {
      this.failoverLogs = new ArrayList<FailoverLogForDescribeFailoverLogsOutput>();
    }
    this.failoverLogs.add(failoverLogsItem);
    return this;
  }

   /**
   * Get failoverLogs
   * @return failoverLogs
  **/
  @Valid
  @Schema(description = "")
  public List<FailoverLogForDescribeFailoverLogsOutput> getFailoverLogs() {
    return failoverLogs;
  }

  public void setFailoverLogs(List<FailoverLogForDescribeFailoverLogsOutput> failoverLogs) {
    this.failoverLogs = failoverLogs;
  }

  public DescribeFailoverLogsResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeFailoverLogsResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeFailoverLogsResponse describeFailoverLogsResponse = (DescribeFailoverLogsResponse) o;
    return Objects.equals(this.context, describeFailoverLogsResponse.context) &&
        Objects.equals(this.failoverLogs, describeFailoverLogsResponse.failoverLogs) &&
        Objects.equals(this.instanceId, describeFailoverLogsResponse.instanceId) &&
        Objects.equals(this.total, describeFailoverLogsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, failoverLogs, instanceId, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeFailoverLogsResponse {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    failoverLogs: ").append(toIndentedString(failoverLogs)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
