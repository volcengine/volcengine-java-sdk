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
 * HealthCheckForCreateListenerInput
 */



public class HealthCheckForCreateListenerInput {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("HealthyThreshold")
  private Integer healthyThreshold = null;

  @SerializedName("HttpCode")
  private String httpCode = null;

  @SerializedName("Interval")
  private Integer interval = null;

  @SerializedName("Method")
  private String method = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("URI")
  private String URI = null;

  @SerializedName("UdpExpect")
  private String udpExpect = null;

  @SerializedName("UdpRequest")
  private String udpRequest = null;

  @SerializedName("UnhealthyThreshold")
  private Integer unhealthyThreshold = null;

  public HealthCheckForCreateListenerInput domain(String domain) {
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

  public HealthCheckForCreateListenerInput enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public HealthCheckForCreateListenerInput healthyThreshold(Integer healthyThreshold) {
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

  public HealthCheckForCreateListenerInput httpCode(String httpCode) {
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

  public HealthCheckForCreateListenerInput interval(Integer interval) {
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

  public HealthCheckForCreateListenerInput method(String method) {
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

  public HealthCheckForCreateListenerInput timeout(Integer timeout) {
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

  public HealthCheckForCreateListenerInput URI(String URI) {
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

  public HealthCheckForCreateListenerInput udpExpect(String udpExpect) {
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

  public HealthCheckForCreateListenerInput udpRequest(String udpRequest) {
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

  public HealthCheckForCreateListenerInput unhealthyThreshold(Integer unhealthyThreshold) {
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
    HealthCheckForCreateListenerInput healthCheckForCreateListenerInput = (HealthCheckForCreateListenerInput) o;
    return Objects.equals(this.domain, healthCheckForCreateListenerInput.domain) &&
        Objects.equals(this.enabled, healthCheckForCreateListenerInput.enabled) &&
        Objects.equals(this.healthyThreshold, healthCheckForCreateListenerInput.healthyThreshold) &&
        Objects.equals(this.httpCode, healthCheckForCreateListenerInput.httpCode) &&
        Objects.equals(this.interval, healthCheckForCreateListenerInput.interval) &&
        Objects.equals(this.method, healthCheckForCreateListenerInput.method) &&
        Objects.equals(this.timeout, healthCheckForCreateListenerInput.timeout) &&
        Objects.equals(this.URI, healthCheckForCreateListenerInput.URI) &&
        Objects.equals(this.udpExpect, healthCheckForCreateListenerInput.udpExpect) &&
        Objects.equals(this.udpRequest, healthCheckForCreateListenerInput.udpRequest) &&
        Objects.equals(this.unhealthyThreshold, healthCheckForCreateListenerInput.unhealthyThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, enabled, healthyThreshold, httpCode, interval, method, timeout, URI, udpExpect, udpRequest, unhealthyThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckForCreateListenerInput {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
