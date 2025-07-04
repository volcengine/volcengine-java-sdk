/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

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
 * HealthyConfigForDescribeEndpointGroupOutput
 */



public class HealthyConfigForDescribeEndpointGroupOutput {
  @SerializedName("HealthCheckEnable")
  private Boolean healthCheckEnable = null;

  @SerializedName("HealthCheckInterval")
  private Integer healthCheckInterval = null;

  @SerializedName("HealthCheckPort")
  private Integer healthCheckPort = null;

  @SerializedName("HealthCheckProtocol")
  private String healthCheckProtocol = null;

  @SerializedName("HealthResponseTimeOut")
  private Integer healthResponseTimeOut = null;

  @SerializedName("HealthyThreshold")
  private Integer healthyThreshold = null;

  public HealthyConfigForDescribeEndpointGroupOutput healthCheckEnable(Boolean healthCheckEnable) {
    this.healthCheckEnable = healthCheckEnable;
    return this;
  }

   /**
   * Get healthCheckEnable
   * @return healthCheckEnable
  **/
  @Schema(description = "")
  public Boolean isHealthCheckEnable() {
    return healthCheckEnable;
  }

  public void setHealthCheckEnable(Boolean healthCheckEnable) {
    this.healthCheckEnable = healthCheckEnable;
  }

  public HealthyConfigForDescribeEndpointGroupOutput healthCheckInterval(Integer healthCheckInterval) {
    this.healthCheckInterval = healthCheckInterval;
    return this;
  }

   /**
   * Get healthCheckInterval
   * @return healthCheckInterval
  **/
  @Schema(description = "")
  public Integer getHealthCheckInterval() {
    return healthCheckInterval;
  }

  public void setHealthCheckInterval(Integer healthCheckInterval) {
    this.healthCheckInterval = healthCheckInterval;
  }

  public HealthyConfigForDescribeEndpointGroupOutput healthCheckPort(Integer healthCheckPort) {
    this.healthCheckPort = healthCheckPort;
    return this;
  }

   /**
   * Get healthCheckPort
   * @return healthCheckPort
  **/
  @Schema(description = "")
  public Integer getHealthCheckPort() {
    return healthCheckPort;
  }

  public void setHealthCheckPort(Integer healthCheckPort) {
    this.healthCheckPort = healthCheckPort;
  }

  public HealthyConfigForDescribeEndpointGroupOutput healthCheckProtocol(String healthCheckProtocol) {
    this.healthCheckProtocol = healthCheckProtocol;
    return this;
  }

   /**
   * Get healthCheckProtocol
   * @return healthCheckProtocol
  **/
  @Schema(description = "")
  public String getHealthCheckProtocol() {
    return healthCheckProtocol;
  }

  public void setHealthCheckProtocol(String healthCheckProtocol) {
    this.healthCheckProtocol = healthCheckProtocol;
  }

  public HealthyConfigForDescribeEndpointGroupOutput healthResponseTimeOut(Integer healthResponseTimeOut) {
    this.healthResponseTimeOut = healthResponseTimeOut;
    return this;
  }

   /**
   * Get healthResponseTimeOut
   * @return healthResponseTimeOut
  **/
  @Schema(description = "")
  public Integer getHealthResponseTimeOut() {
    return healthResponseTimeOut;
  }

  public void setHealthResponseTimeOut(Integer healthResponseTimeOut) {
    this.healthResponseTimeOut = healthResponseTimeOut;
  }

  public HealthyConfigForDescribeEndpointGroupOutput healthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
    return this;
  }

   /**
   * Get healthyThreshold
   * @return healthyThreshold
  **/
  @Schema(description = "")
  public Integer getHealthyThreshold() {
    return healthyThreshold;
  }

  public void setHealthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthyConfigForDescribeEndpointGroupOutput healthyConfigForDescribeEndpointGroupOutput = (HealthyConfigForDescribeEndpointGroupOutput) o;
    return Objects.equals(this.healthCheckEnable, healthyConfigForDescribeEndpointGroupOutput.healthCheckEnable) &&
        Objects.equals(this.healthCheckInterval, healthyConfigForDescribeEndpointGroupOutput.healthCheckInterval) &&
        Objects.equals(this.healthCheckPort, healthyConfigForDescribeEndpointGroupOutput.healthCheckPort) &&
        Objects.equals(this.healthCheckProtocol, healthyConfigForDescribeEndpointGroupOutput.healthCheckProtocol) &&
        Objects.equals(this.healthResponseTimeOut, healthyConfigForDescribeEndpointGroupOutput.healthResponseTimeOut) &&
        Objects.equals(this.healthyThreshold, healthyConfigForDescribeEndpointGroupOutput.healthyThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCheckEnable, healthCheckInterval, healthCheckPort, healthCheckProtocol, healthResponseTimeOut, healthyThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthyConfigForDescribeEndpointGroupOutput {\n");
    
    sb.append("    healthCheckEnable: ").append(toIndentedString(healthCheckEnable)).append("\n");
    sb.append("    healthCheckInterval: ").append(toIndentedString(healthCheckInterval)).append("\n");
    sb.append("    healthCheckPort: ").append(toIndentedString(healthCheckPort)).append("\n");
    sb.append("    healthCheckProtocol: ").append(toIndentedString(healthCheckProtocol)).append("\n");
    sb.append("    healthResponseTimeOut: ").append(toIndentedString(healthResponseTimeOut)).append("\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
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
