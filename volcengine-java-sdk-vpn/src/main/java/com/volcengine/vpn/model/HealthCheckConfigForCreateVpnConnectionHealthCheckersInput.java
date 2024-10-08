/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * HealthCheckConfigForCreateVpnConnectionHealthCheckersInput
 */



public class HealthCheckConfigForCreateVpnConnectionHealthCheckersInput {
  @SerializedName("CheckInterval")
  private Integer checkInterval = null;

  @SerializedName("DownTime")
  private Integer downTime = null;

  @SerializedName("LocalIp")
  private String localIp = null;

  @SerializedName("RemoteIp")
  private String remoteIp = null;

  @SerializedName("Timeout")
  private Integer timeout = null;

  @SerializedName("UpTime")
  private Integer upTime = null;

  public HealthCheckConfigForCreateVpnConnectionHealthCheckersInput checkInterval(Integer checkInterval) {
    this.checkInterval = checkInterval;
    return this;
  }

   /**
   * Get checkInterval
   * @return checkInterval
  **/
  @Schema(description = "")
  public Integer getCheckInterval() {
    return checkInterval;
  }

  public void setCheckInterval(Integer checkInterval) {
    this.checkInterval = checkInterval;
  }

  public HealthCheckConfigForCreateVpnConnectionHealthCheckersInput downTime(Integer downTime) {
    this.downTime = downTime;
    return this;
  }

   /**
   * Get downTime
   * @return downTime
  **/
  @Schema(description = "")
  public Integer getDownTime() {
    return downTime;
  }

  public void setDownTime(Integer downTime) {
    this.downTime = downTime;
  }

  public HealthCheckConfigForCreateVpnConnectionHealthCheckersInput localIp(String localIp) {
    this.localIp = localIp;
    return this;
  }

   /**
   * Get localIp
   * @return localIp
  **/
  @Schema(description = "")
  public String getLocalIp() {
    return localIp;
  }

  public void setLocalIp(String localIp) {
    this.localIp = localIp;
  }

  public HealthCheckConfigForCreateVpnConnectionHealthCheckersInput remoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }

   /**
   * Get remoteIp
   * @return remoteIp
  **/
  @Schema(description = "")
  public String getRemoteIp() {
    return remoteIp;
  }

  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }

  public HealthCheckConfigForCreateVpnConnectionHealthCheckersInput timeout(Integer timeout) {
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

  public HealthCheckConfigForCreateVpnConnectionHealthCheckersInput upTime(Integer upTime) {
    this.upTime = upTime;
    return this;
  }

   /**
   * Get upTime
   * @return upTime
  **/
  @Schema(description = "")
  public Integer getUpTime() {
    return upTime;
  }

  public void setUpTime(Integer upTime) {
    this.upTime = upTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckConfigForCreateVpnConnectionHealthCheckersInput healthCheckConfigForCreateVpnConnectionHealthCheckersInput = (HealthCheckConfigForCreateVpnConnectionHealthCheckersInput) o;
    return Objects.equals(this.checkInterval, healthCheckConfigForCreateVpnConnectionHealthCheckersInput.checkInterval) &&
        Objects.equals(this.downTime, healthCheckConfigForCreateVpnConnectionHealthCheckersInput.downTime) &&
        Objects.equals(this.localIp, healthCheckConfigForCreateVpnConnectionHealthCheckersInput.localIp) &&
        Objects.equals(this.remoteIp, healthCheckConfigForCreateVpnConnectionHealthCheckersInput.remoteIp) &&
        Objects.equals(this.timeout, healthCheckConfigForCreateVpnConnectionHealthCheckersInput.timeout) &&
        Objects.equals(this.upTime, healthCheckConfigForCreateVpnConnectionHealthCheckersInput.upTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInterval, downTime, localIp, remoteIp, timeout, upTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckConfigForCreateVpnConnectionHealthCheckersInput {\n");
    
    sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
    sb.append("    downTime: ").append(toIndentedString(downTime)).append("\n");
    sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    upTime: ").append(toIndentedString(upTime)).append("\n");
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
