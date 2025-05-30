/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * FailedHostForGetBaselineDetectProgressDetailOutput
 */



public class FailedHostForGetBaselineDetectProgressDetailOutput {
  @SerializedName("FailedReason")
  private String failedReason = null;

  @SerializedName("HostName")
  private String hostName = null;

  public FailedHostForGetBaselineDetectProgressDetailOutput failedReason(String failedReason) {
    this.failedReason = failedReason;
    return this;
  }

   /**
   * Get failedReason
   * @return failedReason
  **/
  @Schema(description = "")
  public String getFailedReason() {
    return failedReason;
  }

  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }

  public FailedHostForGetBaselineDetectProgressDetailOutput hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @Schema(description = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedHostForGetBaselineDetectProgressDetailOutput failedHostForGetBaselineDetectProgressDetailOutput = (FailedHostForGetBaselineDetectProgressDetailOutput) o;
    return Objects.equals(this.failedReason, failedHostForGetBaselineDetectProgressDetailOutput.failedReason) &&
        Objects.equals(this.hostName, failedHostForGetBaselineDetectProgressDetailOutput.hostName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedReason, hostName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedHostForGetBaselineDetectProgressDetailOutput {\n");
    
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
