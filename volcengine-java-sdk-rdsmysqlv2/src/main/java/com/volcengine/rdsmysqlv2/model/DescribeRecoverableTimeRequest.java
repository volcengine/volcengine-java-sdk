/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * DescribeRecoverableTimeRequest
 */



public class DescribeRecoverableTimeRequest {
  @SerializedName("BackupRegion")
  private String backupRegion = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("RestoreType")
  private String restoreType = null;

  public DescribeRecoverableTimeRequest backupRegion(String backupRegion) {
    this.backupRegion = backupRegion;
    return this;
  }

   /**
   * Get backupRegion
   * @return backupRegion
  **/
  @Schema(description = "")
  public String getBackupRegion() {
    return backupRegion;
  }

  public void setBackupRegion(String backupRegion) {
    this.backupRegion = backupRegion;
  }

  public DescribeRecoverableTimeRequest instanceId(String instanceId) {
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

  public DescribeRecoverableTimeRequest restoreType(String restoreType) {
    this.restoreType = restoreType;
    return this;
  }

   /**
   * Get restoreType
   * @return restoreType
  **/
  @Schema(description = "")
  public String getRestoreType() {
    return restoreType;
  }

  public void setRestoreType(String restoreType) {
    this.restoreType = restoreType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRecoverableTimeRequest describeRecoverableTimeRequest = (DescribeRecoverableTimeRequest) o;
    return Objects.equals(this.backupRegion, describeRecoverableTimeRequest.backupRegion) &&
        Objects.equals(this.instanceId, describeRecoverableTimeRequest.instanceId) &&
        Objects.equals(this.restoreType, describeRecoverableTimeRequest.restoreType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupRegion, instanceId, restoreType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRecoverableTimeRequest {\n");
    
    sb.append("    backupRegion: ").append(toIndentedString(backupRegion)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    restoreType: ").append(toIndentedString(restoreType)).append("\n");
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
