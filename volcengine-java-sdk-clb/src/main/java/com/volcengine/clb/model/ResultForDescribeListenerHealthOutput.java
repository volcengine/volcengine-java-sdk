/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * ResultForDescribeListenerHealthOutput
 */


public class ResultForDescribeListenerHealthOutput {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("RuleNumber")
  private Integer ruleNumber = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public ResultForDescribeListenerHealthOutput instanceId(String instanceId) {
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

  public ResultForDescribeListenerHealthOutput ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public ResultForDescribeListenerHealthOutput port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ResultForDescribeListenerHealthOutput ruleNumber(Integer ruleNumber) {
    this.ruleNumber = ruleNumber;
    return this;
  }

   /**
   * Get ruleNumber
   * @return ruleNumber
  **/
  @Schema(description = "")
  public Integer getRuleNumber() {
    return ruleNumber;
  }

  public void setRuleNumber(Integer ruleNumber) {
    this.ruleNumber = ruleNumber;
  }

  public ResultForDescribeListenerHealthOutput serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public ResultForDescribeListenerHealthOutput serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public ResultForDescribeListenerHealthOutput status(String status) {
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

  public ResultForDescribeListenerHealthOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResultForDescribeListenerHealthOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultForDescribeListenerHealthOutput resultForDescribeListenerHealthOutput = (ResultForDescribeListenerHealthOutput) o;
    return Objects.equals(this.instanceId, resultForDescribeListenerHealthOutput.instanceId) &&
        Objects.equals(this.ip, resultForDescribeListenerHealthOutput.ip) &&
        Objects.equals(this.port, resultForDescribeListenerHealthOutput.port) &&
        Objects.equals(this.ruleNumber, resultForDescribeListenerHealthOutput.ruleNumber) &&
        Objects.equals(this.serverGroupId, resultForDescribeListenerHealthOutput.serverGroupId) &&
        Objects.equals(this.serverId, resultForDescribeListenerHealthOutput.serverId) &&
        Objects.equals(this.status, resultForDescribeListenerHealthOutput.status) &&
        Objects.equals(this.type, resultForDescribeListenerHealthOutput.type) &&
        Objects.equals(this.updatedAt, resultForDescribeListenerHealthOutput.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, ip, port, ruleNumber, serverGroupId, serverId, status, type, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultForDescribeListenerHealthOutput {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    ruleNumber: ").append(toIndentedString(ruleNumber)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
