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
 * DescribeReadOnlyNodeDelayResponse
 */


public class DescribeReadOnlyNodeDelayResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DelayReplicationTime")
  private Integer delayReplicationTime = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  public DescribeReadOnlyNodeDelayResponse delayReplicationTime(Integer delayReplicationTime) {
    this.delayReplicationTime = delayReplicationTime;
    return this;
  }

   /**
   * Get delayReplicationTime
   * @return delayReplicationTime
  **/
  @Schema(description = "")
  public Integer getDelayReplicationTime() {
    return delayReplicationTime;
  }

  public void setDelayReplicationTime(Integer delayReplicationTime) {
    this.delayReplicationTime = delayReplicationTime;
  }

  public DescribeReadOnlyNodeDelayResponse nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeReadOnlyNodeDelayResponse describeReadOnlyNodeDelayResponse = (DescribeReadOnlyNodeDelayResponse) o;
    return Objects.equals(this.delayReplicationTime, describeReadOnlyNodeDelayResponse.delayReplicationTime) &&
        Objects.equals(this.nodeId, describeReadOnlyNodeDelayResponse.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delayReplicationTime, nodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeReadOnlyNodeDelayResponse {\n");
    
    sb.append("    delayReplicationTime: ").append(toIndentedString(delayReplicationTime)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
