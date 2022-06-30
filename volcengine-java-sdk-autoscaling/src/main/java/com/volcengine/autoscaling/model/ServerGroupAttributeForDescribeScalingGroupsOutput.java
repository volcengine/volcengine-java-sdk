/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * ServerGroupAttributeForDescribeScalingGroupsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:17:46.205154+08:00[Asia/Shanghai]")
public class ServerGroupAttributeForDescribeScalingGroupsOutput {
  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("Weight")
  private Integer weight = null;

  public ServerGroupAttributeForDescribeScalingGroupsOutput loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public ServerGroupAttributeForDescribeScalingGroupsOutput port(Integer port) {
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

  public ServerGroupAttributeForDescribeScalingGroupsOutput serverGroupId(String serverGroupId) {
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

  public ServerGroupAttributeForDescribeScalingGroupsOutput weight(Integer weight) {
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
    ServerGroupAttributeForDescribeScalingGroupsOutput serverGroupAttributeForDescribeScalingGroupsOutput = (ServerGroupAttributeForDescribeScalingGroupsOutput) o;
    return Objects.equals(this.loadBalancerId, serverGroupAttributeForDescribeScalingGroupsOutput.loadBalancerId) &&
        Objects.equals(this.port, serverGroupAttributeForDescribeScalingGroupsOutput.port) &&
        Objects.equals(this.serverGroupId, serverGroupAttributeForDescribeScalingGroupsOutput.serverGroupId) &&
        Objects.equals(this.weight, serverGroupAttributeForDescribeScalingGroupsOutput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerId, port, serverGroupId, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerGroupAttributeForDescribeScalingGroupsOutput {\n");
    
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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
