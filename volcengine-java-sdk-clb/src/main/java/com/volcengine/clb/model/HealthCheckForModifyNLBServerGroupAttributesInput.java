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
 * HealthCheckForModifyNLBServerGroupAttributesInput
 */



public class HealthCheckForModifyNLBServerGroupAttributesInput {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("HealthyThreshold")
  private Integer healthyThreshold = null;

  @SerializedName("HttpCode")
  private String httpCode = null;

  @SerializedName("Interval")
  private Integer interval = null;

  @SerializedName("Method")
  private String method = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("URI")
  private String URI = null;

  @SerializedName("UdpExpect")
  private String udpExpect = null;

  @SerializedName("UdpRequest")
  private String udpRequest = null;

  @SerializedName("UnhealthyThreshold")
  private Integer unhealthyThreshold = null;

  public HealthCheckForModifyNLBServerGroupAttributesInput domain(String domain) {
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

  public HealthCheckForModifyNLBServerGroupAttributesInput enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput healthyThreshold(Integer healthyThreshold) {
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

  public HealthCheckForModifyNLBServerGroupAttributesInput httpCode(String httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @Schema(description = "")
  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(description = "")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput port(Integer port) {
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

  public HealthCheckForModifyNLBServerGroupAttributesInput timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput type(String type) {
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

  public HealthCheckForModifyNLBServerGroupAttributesInput URI(String URI) {
    this.URI = URI;
    return this;
  }

   /**
   * Get URI
   * @return URI
  **/
  @Schema(description = "")
  public String getURI() {
    return URI;
  }

  public void setURI(String URI) {
    this.URI = URI;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput udpExpect(String udpExpect) {
    this.udpExpect = udpExpect;
    return this;
  }

   /**
   * Get udpExpect
   * @return udpExpect
  **/
  @Schema(description = "")
  public String getUdpExpect() {
    return udpExpect;
  }

  public void setUdpExpect(String udpExpect) {
    this.udpExpect = udpExpect;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput udpRequest(String udpRequest) {
    this.udpRequest = udpRequest;
    return this;
  }

   /**
   * Get udpRequest
   * @return udpRequest
  **/
  @Schema(description = "")
  public String getUdpRequest() {
    return udpRequest;
  }

  public void setUdpRequest(String udpRequest) {
    this.udpRequest = udpRequest;
  }

  public HealthCheckForModifyNLBServerGroupAttributesInput unhealthyThreshold(Integer unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
    return this;
  }

   /**
   * Get unhealthyThreshold
   * @return unhealthyThreshold
  **/
  @Schema(description = "")
  public Integer getUnhealthyThreshold() {
    return unhealthyThreshold;
  }

  public void setUnhealthyThreshold(Integer unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckForModifyNLBServerGroupAttributesInput healthCheckForModifyNLBServerGroupAttributesInput = (HealthCheckForModifyNLBServerGroupAttributesInput) o;
    return Objects.equals(this.domain, healthCheckForModifyNLBServerGroupAttributesInput.domain) &&
        Objects.equals(this.enabled, healthCheckForModifyNLBServerGroupAttributesInput.enabled) &&
        Objects.equals(this.healthyThreshold, healthCheckForModifyNLBServerGroupAttributesInput.healthyThreshold) &&
        Objects.equals(this.httpCode, healthCheckForModifyNLBServerGroupAttributesInput.httpCode) &&
        Objects.equals(this.interval, healthCheckForModifyNLBServerGroupAttributesInput.interval) &&
        Objects.equals(this.method, healthCheckForModifyNLBServerGroupAttributesInput.method) &&
        Objects.equals(this.port, healthCheckForModifyNLBServerGroupAttributesInput.port) &&
        Objects.equals(this.timeout, healthCheckForModifyNLBServerGroupAttributesInput.timeout) &&
        Objects.equals(this.type, healthCheckForModifyNLBServerGroupAttributesInput.type) &&
        Objects.equals(this.URI, healthCheckForModifyNLBServerGroupAttributesInput.URI) &&
        Objects.equals(this.udpExpect, healthCheckForModifyNLBServerGroupAttributesInput.udpExpect) &&
        Objects.equals(this.udpRequest, healthCheckForModifyNLBServerGroupAttributesInput.udpRequest) &&
        Objects.equals(this.unhealthyThreshold, healthCheckForModifyNLBServerGroupAttributesInput.unhealthyThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, enabled, healthyThreshold, httpCode, interval, method, port, timeout, type, URI, udpExpect, udpRequest, unhealthyThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckForModifyNLBServerGroupAttributesInput {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    URI: ").append(toIndentedString(URI)).append("\n");
    sb.append("    udpExpect: ").append(toIndentedString(udpExpect)).append("\n");
    sb.append("    udpRequest: ").append(toIndentedString(udpRequest)).append("\n");
    sb.append("    unhealthyThreshold: ").append(toIndentedString(unhealthyThreshold)).append("\n");
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
