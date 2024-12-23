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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyEnterpriseDBInstanceCapacityRequest
 */



public class ModifyEnterpriseDBInstanceCapacityRequest {
  @SerializedName("ApplyImmediately")
  private Boolean applyImmediately = null;

  @SerializedName("BackupPointName")
  private String backupPointName = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("CreateBackup")
  private Boolean createBackup = null;

  @SerializedName("FlashPerShard")
  private Integer flashPerShard = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("RamPerShard")
  private Integer ramPerShard = null;

  @SerializedName("ShardNumber")
  private Integer shardNumber = null;

  public ModifyEnterpriseDBInstanceCapacityRequest applyImmediately(Boolean applyImmediately) {
    this.applyImmediately = applyImmediately;
    return this;
  }

   /**
   * Get applyImmediately
   * @return applyImmediately
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Boolean isApplyImmediately() {
    return applyImmediately;
  }

  public void setApplyImmediately(Boolean applyImmediately) {
    this.applyImmediately = applyImmediately;
  }

  public ModifyEnterpriseDBInstanceCapacityRequest backupPointName(String backupPointName) {
    this.backupPointName = backupPointName;
    return this;
  }

   /**
   * Get backupPointName
   * @return backupPointName
  **/
  @Schema(description = "")
  public String getBackupPointName() {
    return backupPointName;
  }

  public void setBackupPointName(String backupPointName) {
    this.backupPointName = backupPointName;
  }

  public ModifyEnterpriseDBInstanceCapacityRequest clientToken(String clientToken) {
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

  public ModifyEnterpriseDBInstanceCapacityRequest createBackup(Boolean createBackup) {
    this.createBackup = createBackup;
    return this;
  }

   /**
   * Get createBackup
   * @return createBackup
  **/
  @Schema(description = "")
  public Boolean isCreateBackup() {
    return createBackup;
  }

  public void setCreateBackup(Boolean createBackup) {
    this.createBackup = createBackup;
  }

  public ModifyEnterpriseDBInstanceCapacityRequest flashPerShard(Integer flashPerShard) {
    this.flashPerShard = flashPerShard;
    return this;
  }

   /**
   * Get flashPerShard
   * @return flashPerShard
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getFlashPerShard() {
    return flashPerShard;
  }

  public void setFlashPerShard(Integer flashPerShard) {
    this.flashPerShard = flashPerShard;
  }

  public ModifyEnterpriseDBInstanceCapacityRequest instanceId(String instanceId) {
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

  public ModifyEnterpriseDBInstanceCapacityRequest ramPerShard(Integer ramPerShard) {
    this.ramPerShard = ramPerShard;
    return this;
  }

   /**
   * Get ramPerShard
   * @return ramPerShard
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getRamPerShard() {
    return ramPerShard;
  }

  public void setRamPerShard(Integer ramPerShard) {
    this.ramPerShard = ramPerShard;
  }

  public ModifyEnterpriseDBInstanceCapacityRequest shardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
    return this;
  }

   /**
   * Get shardNumber
   * @return shardNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getShardNumber() {
    return shardNumber;
  }

  public void setShardNumber(Integer shardNumber) {
    this.shardNumber = shardNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyEnterpriseDBInstanceCapacityRequest modifyEnterpriseDBInstanceCapacityRequest = (ModifyEnterpriseDBInstanceCapacityRequest) o;
    return Objects.equals(this.applyImmediately, modifyEnterpriseDBInstanceCapacityRequest.applyImmediately) &&
        Objects.equals(this.backupPointName, modifyEnterpriseDBInstanceCapacityRequest.backupPointName) &&
        Objects.equals(this.clientToken, modifyEnterpriseDBInstanceCapacityRequest.clientToken) &&
        Objects.equals(this.createBackup, modifyEnterpriseDBInstanceCapacityRequest.createBackup) &&
        Objects.equals(this.flashPerShard, modifyEnterpriseDBInstanceCapacityRequest.flashPerShard) &&
        Objects.equals(this.instanceId, modifyEnterpriseDBInstanceCapacityRequest.instanceId) &&
        Objects.equals(this.ramPerShard, modifyEnterpriseDBInstanceCapacityRequest.ramPerShard) &&
        Objects.equals(this.shardNumber, modifyEnterpriseDBInstanceCapacityRequest.shardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyImmediately, backupPointName, clientToken, createBackup, flashPerShard, instanceId, ramPerShard, shardNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyEnterpriseDBInstanceCapacityRequest {\n");
    
    sb.append("    applyImmediately: ").append(toIndentedString(applyImmediately)).append("\n");
    sb.append("    backupPointName: ").append(toIndentedString(backupPointName)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    createBackup: ").append(toIndentedString(createBackup)).append("\n");
    sb.append("    flashPerShard: ").append(toIndentedString(flashPerShard)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    ramPerShard: ").append(toIndentedString(ramPerShard)).append("\n");
    sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
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
