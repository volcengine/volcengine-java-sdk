/*
 * rds_mssql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmssql.model;

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
 * ModifyBackupPolicyRequest
 */



public class ModifyBackupPolicyRequest {
  @SerializedName("BackupRetentionPeriod")
  private Integer backupRetentionPeriod = null;

  @SerializedName("BackupTime")
  private String backupTime = null;

  @SerializedName("FullBackupPeriod")
  private String fullBackupPeriod = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("LogBackupInterval")
  private Integer logBackupInterval = null;

  public ModifyBackupPolicyRequest backupRetentionPeriod(Integer backupRetentionPeriod) {
    this.backupRetentionPeriod = backupRetentionPeriod;
    return this;
  }

   /**
   * Get backupRetentionPeriod
   * @return backupRetentionPeriod
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getBackupRetentionPeriod() {
    return backupRetentionPeriod;
  }

  public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
    this.backupRetentionPeriod = backupRetentionPeriod;
  }

  public ModifyBackupPolicyRequest backupTime(String backupTime) {
    this.backupTime = backupTime;
    return this;
  }

   /**
   * Get backupTime
   * @return backupTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getBackupTime() {
    return backupTime;
  }

  public void setBackupTime(String backupTime) {
    this.backupTime = backupTime;
  }

  public ModifyBackupPolicyRequest fullBackupPeriod(String fullBackupPeriod) {
    this.fullBackupPeriod = fullBackupPeriod;
    return this;
  }

   /**
   * Get fullBackupPeriod
   * @return fullBackupPeriod
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getFullBackupPeriod() {
    return fullBackupPeriod;
  }

  public void setFullBackupPeriod(String fullBackupPeriod) {
    this.fullBackupPeriod = fullBackupPeriod;
  }

  public ModifyBackupPolicyRequest instanceId(String instanceId) {
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

  public ModifyBackupPolicyRequest logBackupInterval(Integer logBackupInterval) {
    this.logBackupInterval = logBackupInterval;
    return this;
  }

   /**
   * Get logBackupInterval
   * @return logBackupInterval
  **/
  @Schema(description = "")
  public Integer getLogBackupInterval() {
    return logBackupInterval;
  }

  public void setLogBackupInterval(Integer logBackupInterval) {
    this.logBackupInterval = logBackupInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyBackupPolicyRequest modifyBackupPolicyRequest = (ModifyBackupPolicyRequest) o;
    return Objects.equals(this.backupRetentionPeriod, modifyBackupPolicyRequest.backupRetentionPeriod) &&
        Objects.equals(this.backupTime, modifyBackupPolicyRequest.backupTime) &&
        Objects.equals(this.fullBackupPeriod, modifyBackupPolicyRequest.fullBackupPeriod) &&
        Objects.equals(this.instanceId, modifyBackupPolicyRequest.instanceId) &&
        Objects.equals(this.logBackupInterval, modifyBackupPolicyRequest.logBackupInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupRetentionPeriod, backupTime, fullBackupPeriod, instanceId, logBackupInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyBackupPolicyRequest {\n");
    
    sb.append("    backupRetentionPeriod: ").append(toIndentedString(backupRetentionPeriod)).append("\n");
    sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
    sb.append("    fullBackupPeriod: ").append(toIndentedString(fullBackupPeriod)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    logBackupInterval: ").append(toIndentedString(logBackupInterval)).append("\n");
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
