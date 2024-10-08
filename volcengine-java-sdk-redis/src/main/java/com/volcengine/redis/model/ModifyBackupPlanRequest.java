/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyBackupPlanRequest
 */



public class ModifyBackupPlanRequest {
  @SerializedName("Active")
  private Boolean active = null;

  @SerializedName("BackupHour")
  private Integer backupHour = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Period")
  private List<Integer> period = null;

  public ModifyBackupPlanRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ModifyBackupPlanRequest backupHour(Integer backupHour) {
    this.backupHour = backupHour;
    return this;
  }

   /**
   * Get backupHour
   * @return backupHour
  **/
  @Schema(description = "")
  public Integer getBackupHour() {
    return backupHour;
  }

  public void setBackupHour(Integer backupHour) {
    this.backupHour = backupHour;
  }

  public ModifyBackupPlanRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public ModifyBackupPlanRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyBackupPlanRequest period(List<Integer> period) {
    this.period = period;
    return this;
  }

  public ModifyBackupPlanRequest addPeriodItem(Integer periodItem) {
    if (this.period == null) {
      this.period = new ArrayList<Integer>();
    }
    this.period.add(periodItem);
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public List<Integer> getPeriod() {
    return period;
  }

  public void setPeriod(List<Integer> period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyBackupPlanRequest modifyBackupPlanRequest = (ModifyBackupPlanRequest) o;
    return Objects.equals(this.active, modifyBackupPlanRequest.active) &&
        Objects.equals(this.backupHour, modifyBackupPlanRequest.backupHour) &&
        Objects.equals(this.clientToken, modifyBackupPlanRequest.clientToken) &&
        Objects.equals(this.instanceId, modifyBackupPlanRequest.instanceId) &&
        Objects.equals(this.period, modifyBackupPlanRequest.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, backupHour, clientToken, instanceId, period);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyBackupPlanRequest {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    backupHour: ").append(toIndentedString(backupHour)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
