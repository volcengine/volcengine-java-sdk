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
 * UpdateRegistryFlowRateLimitRequest
 */



public class UpdateRegistryFlowRateLimitRequest {
  @SerializedName("FlowRateLimit")
  private Integer flowRateLimit = null;

  @SerializedName("RegistryID")
  private String registryID = null;

  public UpdateRegistryFlowRateLimitRequest flowRateLimit(Integer flowRateLimit) {
    this.flowRateLimit = flowRateLimit;
    return this;
  }

   /**
   * Get flowRateLimit
   * @return flowRateLimit
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getFlowRateLimit() {
    return flowRateLimit;
  }

  public void setFlowRateLimit(Integer flowRateLimit) {
    this.flowRateLimit = flowRateLimit;
  }

  public UpdateRegistryFlowRateLimitRequest registryID(String registryID) {
    this.registryID = registryID;
    return this;
  }

   /**
   * Get registryID
   * @return registryID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegistryID() {
    return registryID;
  }

  public void setRegistryID(String registryID) {
    this.registryID = registryID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRegistryFlowRateLimitRequest updateRegistryFlowRateLimitRequest = (UpdateRegistryFlowRateLimitRequest) o;
    return Objects.equals(this.flowRateLimit, updateRegistryFlowRateLimitRequest.flowRateLimit) &&
        Objects.equals(this.registryID, updateRegistryFlowRateLimitRequest.registryID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowRateLimit, registryID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRegistryFlowRateLimitRequest {\n");
    
    sb.append("    flowRateLimit: ").append(toIndentedString(flowRateLimit)).append("\n");
    sb.append("    registryID: ").append(toIndentedString(registryID)).append("\n");
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
