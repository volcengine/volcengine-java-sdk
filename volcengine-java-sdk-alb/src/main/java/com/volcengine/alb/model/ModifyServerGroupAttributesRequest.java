/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.HealthCheckForModifyServerGroupAttributesInput;
import com.volcengine.alb.model.StickySessionConfigForModifyServerGroupAttributesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyServerGroupAttributesRequest
 */



public class ModifyServerGroupAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("HealthCheck")
  private HealthCheckForModifyServerGroupAttributesInput healthCheck = null;

  @SerializedName("Scheduler")
  private String scheduler = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  @SerializedName("StickySessionConfig")
  private StickySessionConfigForModifyServerGroupAttributesInput stickySessionConfig = null;

  public ModifyServerGroupAttributesRequest description(String description) {
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

  public ModifyServerGroupAttributesRequest healthCheck(HealthCheckForModifyServerGroupAttributesInput healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckForModifyServerGroupAttributesInput getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthCheckForModifyServerGroupAttributesInput healthCheck) {
    this.healthCheck = healthCheck;
  }

  public ModifyServerGroupAttributesRequest scheduler(String scheduler) {
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Get scheduler
   * @return scheduler
  **/
  @Schema(description = "")
  public String getScheduler() {
    return scheduler;
  }

  public void setScheduler(String scheduler) {
    this.scheduler = scheduler;
  }

  public ModifyServerGroupAttributesRequest serverGroupId(String serverGroupId) {
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

  public ModifyServerGroupAttributesRequest serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }

  public ModifyServerGroupAttributesRequest stickySessionConfig(StickySessionConfigForModifyServerGroupAttributesInput stickySessionConfig) {
    this.stickySessionConfig = stickySessionConfig;
    return this;
  }

   /**
   * Get stickySessionConfig
   * @return stickySessionConfig
  **/
  @Valid
  @Schema(description = "")
  public StickySessionConfigForModifyServerGroupAttributesInput getStickySessionConfig() {
    return stickySessionConfig;
  }

  public void setStickySessionConfig(StickySessionConfigForModifyServerGroupAttributesInput stickySessionConfig) {
    this.stickySessionConfig = stickySessionConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyServerGroupAttributesRequest modifyServerGroupAttributesRequest = (ModifyServerGroupAttributesRequest) o;
    return Objects.equals(this.description, modifyServerGroupAttributesRequest.description) &&
        Objects.equals(this.healthCheck, modifyServerGroupAttributesRequest.healthCheck) &&
        Objects.equals(this.scheduler, modifyServerGroupAttributesRequest.scheduler) &&
        Objects.equals(this.serverGroupId, modifyServerGroupAttributesRequest.serverGroupId) &&
        Objects.equals(this.serverGroupName, modifyServerGroupAttributesRequest.serverGroupName) &&
        Objects.equals(this.stickySessionConfig, modifyServerGroupAttributesRequest.stickySessionConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, healthCheck, scheduler, serverGroupId, serverGroupName, stickySessionConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyServerGroupAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
    sb.append("    stickySessionConfig: ").append(toIndentedString(stickySessionConfig)).append("\n");
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
