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
 * FailoverLogForDescribeFailoverLogsOutput
 */



public class FailoverLogForDescribeFailoverLogsOutput {
  @SerializedName("FailoverTime")
  private String failoverTime = null;

  @SerializedName("FailoverType")
  private String failoverType = null;

  @SerializedName("NewMasterNodeId")
  private String newMasterNodeId = null;

  @SerializedName("OldMasterNodeId")
  private String oldMasterNodeId = null;

  public FailoverLogForDescribeFailoverLogsOutput failoverTime(String failoverTime) {
    this.failoverTime = failoverTime;
    return this;
  }

   /**
   * Get failoverTime
   * @return failoverTime
  **/
  @Schema(description = "")
  public String getFailoverTime() {
    return failoverTime;
  }

  public void setFailoverTime(String failoverTime) {
    this.failoverTime = failoverTime;
  }

  public FailoverLogForDescribeFailoverLogsOutput failoverType(String failoverType) {
    this.failoverType = failoverType;
    return this;
  }

   /**
   * Get failoverType
   * @return failoverType
  **/
  @Schema(description = "")
  public String getFailoverType() {
    return failoverType;
  }

  public void setFailoverType(String failoverType) {
    this.failoverType = failoverType;
  }

  public FailoverLogForDescribeFailoverLogsOutput newMasterNodeId(String newMasterNodeId) {
    this.newMasterNodeId = newMasterNodeId;
    return this;
  }

   /**
   * Get newMasterNodeId
   * @return newMasterNodeId
  **/
  @Schema(description = "")
  public String getNewMasterNodeId() {
    return newMasterNodeId;
  }

  public void setNewMasterNodeId(String newMasterNodeId) {
    this.newMasterNodeId = newMasterNodeId;
  }

  public FailoverLogForDescribeFailoverLogsOutput oldMasterNodeId(String oldMasterNodeId) {
    this.oldMasterNodeId = oldMasterNodeId;
    return this;
  }

   /**
   * Get oldMasterNodeId
   * @return oldMasterNodeId
  **/
  @Schema(description = "")
  public String getOldMasterNodeId() {
    return oldMasterNodeId;
  }

  public void setOldMasterNodeId(String oldMasterNodeId) {
    this.oldMasterNodeId = oldMasterNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailoverLogForDescribeFailoverLogsOutput failoverLogForDescribeFailoverLogsOutput = (FailoverLogForDescribeFailoverLogsOutput) o;
    return Objects.equals(this.failoverTime, failoverLogForDescribeFailoverLogsOutput.failoverTime) &&
        Objects.equals(this.failoverType, failoverLogForDescribeFailoverLogsOutput.failoverType) &&
        Objects.equals(this.newMasterNodeId, failoverLogForDescribeFailoverLogsOutput.newMasterNodeId) &&
        Objects.equals(this.oldMasterNodeId, failoverLogForDescribeFailoverLogsOutput.oldMasterNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failoverTime, failoverType, newMasterNodeId, oldMasterNodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailoverLogForDescribeFailoverLogsOutput {\n");
    
    sb.append("    failoverTime: ").append(toIndentedString(failoverTime)).append("\n");
    sb.append("    failoverType: ").append(toIndentedString(failoverType)).append("\n");
    sb.append("    newMasterNodeId: ").append(toIndentedString(newMasterNodeId)).append("\n");
    sb.append("    oldMasterNodeId: ").append(toIndentedString(oldMasterNodeId)).append("\n");
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
