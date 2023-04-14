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
 * DescribeBackupPointDownloadUrlsRequest
 */


public class DescribeBackupPointDownloadUrlsRequest {
  @SerializedName("BackupPointId")
  private String backupPointId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public DescribeBackupPointDownloadUrlsRequest backupPointId(String backupPointId) {
    this.backupPointId = backupPointId;
    return this;
  }

   /**
   * Get backupPointId
   * @return backupPointId
  **/
  @Schema(description = "")
  public String getBackupPointId() {
    return backupPointId;
  }

  public void setBackupPointId(String backupPointId) {
    this.backupPointId = backupPointId;
  }

  public DescribeBackupPointDownloadUrlsRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBackupPointDownloadUrlsRequest describeBackupPointDownloadUrlsRequest = (DescribeBackupPointDownloadUrlsRequest) o;
    return Objects.equals(this.backupPointId, describeBackupPointDownloadUrlsRequest.backupPointId) &&
        Objects.equals(this.instanceId, describeBackupPointDownloadUrlsRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPointId, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBackupPointDownloadUrlsRequest {\n");
    
    sb.append("    backupPointId: ").append(toIndentedString(backupPointId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
