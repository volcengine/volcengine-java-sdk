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

package com.volcengine.volcstack.clb.model;

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
 * ServerForDescribeServerGroupAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:21.106708+08:00[Asia/Shanghai]")
public class ServerForDescribeServerGroupAttributesOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ServerId")
  private String serverId = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Weight")
  private Integer weight = null;

  public ServerForDescribeServerGroupAttributesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServerForDescribeServerGroupAttributesOutput instanceId(String instanceId) {
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

  public ServerForDescribeServerGroupAttributesOutput ip(String ip) {
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

  public ServerForDescribeServerGroupAttributesOutput port(Integer port) {
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

  public ServerForDescribeServerGroupAttributesOutput serverId(String serverId) {
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

  public ServerForDescribeServerGroupAttributesOutput type(String type) {
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

  public ServerForDescribeServerGroupAttributesOutput weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerForDescribeServerGroupAttributesOutput serverForDescribeServerGroupAttributesOutput = (ServerForDescribeServerGroupAttributesOutput) o;
    return Objects.equals(this.description, serverForDescribeServerGroupAttributesOutput.description) &&
        Objects.equals(this.instanceId, serverForDescribeServerGroupAttributesOutput.instanceId) &&
        Objects.equals(this.ip, serverForDescribeServerGroupAttributesOutput.ip) &&
        Objects.equals(this.port, serverForDescribeServerGroupAttributesOutput.port) &&
        Objects.equals(this.serverId, serverForDescribeServerGroupAttributesOutput.serverId) &&
        Objects.equals(this.type, serverForDescribeServerGroupAttributesOutput.type) &&
        Objects.equals(this.weight, serverForDescribeServerGroupAttributesOutput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, instanceId, ip, port, serverId, type, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerForDescribeServerGroupAttributesOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
