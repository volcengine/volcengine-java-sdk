/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * ServerNodeForDescribeDBInstanceShardsOutput
 */



public class ServerNodeForDescribeDBInstanceShardsOutput {
  @SerializedName("CurrentRole")
  private String currentRole = null;

  @SerializedName("NodeId")
  private String nodeId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ServerNodeForDescribeDBInstanceShardsOutput currentRole(String currentRole) {
    this.currentRole = currentRole;
    return this;
  }

   /**
   * Get currentRole
   * @return currentRole
  **/
  @Schema(description = "")
  public String getCurrentRole() {
    return currentRole;
  }

  public void setCurrentRole(String currentRole) {
    this.currentRole = currentRole;
  }

  public ServerNodeForDescribeDBInstanceShardsOutput nodeId(String nodeId) {
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

  public ServerNodeForDescribeDBInstanceShardsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ServerNodeForDescribeDBInstanceShardsOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerNodeForDescribeDBInstanceShardsOutput serverNodeForDescribeDBInstanceShardsOutput = (ServerNodeForDescribeDBInstanceShardsOutput) o;
    return Objects.equals(this.currentRole, serverNodeForDescribeDBInstanceShardsOutput.currentRole) &&
        Objects.equals(this.nodeId, serverNodeForDescribeDBInstanceShardsOutput.nodeId) &&
        Objects.equals(this.status, serverNodeForDescribeDBInstanceShardsOutput.status) &&
        Objects.equals(this.zoneId, serverNodeForDescribeDBInstanceShardsOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentRole, nodeId, status, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerNodeForDescribeDBInstanceShardsOutput {\n");
    
    sb.append("    currentRole: ").append(toIndentedString(currentRole)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
