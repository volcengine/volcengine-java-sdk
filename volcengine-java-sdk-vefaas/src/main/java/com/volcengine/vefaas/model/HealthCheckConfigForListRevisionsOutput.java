/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vefaas.model.ProbeHandlerForListRevisionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * HealthCheckConfigForListRevisionsOutput
 */



public class HealthCheckConfigForListRevisionsOutput {
  @SerializedName("EnableHealthCheck")
  private Boolean enableHealthCheck = null;

  @SerializedName("FailureThreshold")
  private Integer failureThreshold = null;

  @SerializedName("InitialDelaySeconds")
  private Integer initialDelaySeconds = null;

  @SerializedName("PeriodSeconds")
  private Integer periodSeconds = null;

  @SerializedName("ProbeHandler")
  private ProbeHandlerForListRevisionsOutput probeHandler = null;

  @SerializedName("SuccessThreshold")
  private Integer successThreshold = null;

  @SerializedName("TimeoutSeconds")
  private Integer timeoutSeconds = null;

  public HealthCheckConfigForListRevisionsOutput enableHealthCheck(Boolean enableHealthCheck) {
    this.enableHealthCheck = enableHealthCheck;
    return this;
  }

   /**
   * Get enableHealthCheck
   * @return enableHealthCheck
  **/
  @Schema(description = "")
  public Boolean isEnableHealthCheck() {
    return enableHealthCheck;
  }

  public void setEnableHealthCheck(Boolean enableHealthCheck) {
    this.enableHealthCheck = enableHealthCheck;
  }

  public HealthCheckConfigForListRevisionsOutput failureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

   /**
   * Get failureThreshold
   * @return failureThreshold
  **/
  @Schema(description = "")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  public HealthCheckConfigForListRevisionsOutput initialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Get initialDelaySeconds
   * @return initialDelaySeconds
  **/
  @Schema(description = "")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }

  public HealthCheckConfigForListRevisionsOutput periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * Get periodSeconds
   * @return periodSeconds
  **/
  @Schema(description = "")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public HealthCheckConfigForListRevisionsOutput probeHandler(ProbeHandlerForListRevisionsOutput probeHandler) {
    this.probeHandler = probeHandler;
    return this;
  }

   /**
   * Get probeHandler
   * @return probeHandler
  **/
  @Valid
  @Schema(description = "")
  public ProbeHandlerForListRevisionsOutput getProbeHandler() {
    return probeHandler;
  }

  public void setProbeHandler(ProbeHandlerForListRevisionsOutput probeHandler) {
    this.probeHandler = probeHandler;
  }

  public HealthCheckConfigForListRevisionsOutput successThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
    return this;
  }

   /**
   * Get successThreshold
   * @return successThreshold
  **/
  @Schema(description = "")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }

  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }

  public HealthCheckConfigForListRevisionsOutput timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Get timeoutSeconds
   * @return timeoutSeconds
  **/
  @Schema(description = "")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckConfigForListRevisionsOutput healthCheckConfigForListRevisionsOutput = (HealthCheckConfigForListRevisionsOutput) o;
    return Objects.equals(this.enableHealthCheck, healthCheckConfigForListRevisionsOutput.enableHealthCheck) &&
        Objects.equals(this.failureThreshold, healthCheckConfigForListRevisionsOutput.failureThreshold) &&
        Objects.equals(this.initialDelaySeconds, healthCheckConfigForListRevisionsOutput.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, healthCheckConfigForListRevisionsOutput.periodSeconds) &&
        Objects.equals(this.probeHandler, healthCheckConfigForListRevisionsOutput.probeHandler) &&
        Objects.equals(this.successThreshold, healthCheckConfigForListRevisionsOutput.successThreshold) &&
        Objects.equals(this.timeoutSeconds, healthCheckConfigForListRevisionsOutput.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHealthCheck, failureThreshold, initialDelaySeconds, periodSeconds, probeHandler, successThreshold, timeoutSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckConfigForListRevisionsOutput {\n");
    
    sb.append("    enableHealthCheck: ").append(toIndentedString(enableHealthCheck)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    probeHandler: ").append(toIndentedString(probeHandler)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
