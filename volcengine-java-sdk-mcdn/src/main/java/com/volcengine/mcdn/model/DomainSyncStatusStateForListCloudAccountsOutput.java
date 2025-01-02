/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

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
 * DomainSyncStatusStateForListCloudAccountsOutput
 */



public class DomainSyncStatusStateForListCloudAccountsOutput {
  @SerializedName("LastSyncAt")
  private Long lastSyncAt = null;

  @SerializedName("SyncStatus")
  private String syncStatus = null;

  public DomainSyncStatusStateForListCloudAccountsOutput lastSyncAt(Long lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
    return this;
  }

   /**
   * Get lastSyncAt
   * @return lastSyncAt
  **/
  @Schema(description = "")
  public Long getLastSyncAt() {
    return lastSyncAt;
  }

  public void setLastSyncAt(Long lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
  }

  public DomainSyncStatusStateForListCloudAccountsOutput syncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  @Schema(description = "")
  public String getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainSyncStatusStateForListCloudAccountsOutput domainSyncStatusStateForListCloudAccountsOutput = (DomainSyncStatusStateForListCloudAccountsOutput) o;
    return Objects.equals(this.lastSyncAt, domainSyncStatusStateForListCloudAccountsOutput.lastSyncAt) &&
        Objects.equals(this.syncStatus, domainSyncStatusStateForListCloudAccountsOutput.syncStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSyncAt, syncStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainSyncStatusStateForListCloudAccountsOutput {\n");
    
    sb.append("    lastSyncAt: ").append(toIndentedString(lastSyncAt)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
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