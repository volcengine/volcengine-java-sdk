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
import com.volcengine.rdsmysqlv2.model.TableMetaForRestoreToExistedInstanceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RestoreToExistedInstanceRequest
 */



public class RestoreToExistedInstanceRequest {
  @SerializedName("BackupId")
  private String backupId = null;

  @SerializedName("RestoreTime")
  private String restoreTime = null;

  @SerializedName("RestoreType")
  private String restoreType = null;

  @SerializedName("SourceDBInstanceId")
  private String sourceDBInstanceId = null;

  @SerializedName("TableMeta")
  private List<TableMetaForRestoreToExistedInstanceInput> tableMeta = null;

  public RestoreToExistedInstanceRequest backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @Schema(description = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public RestoreToExistedInstanceRequest restoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
    return this;
  }

   /**
   * Get restoreTime
   * @return restoreTime
  **/
  @Schema(description = "")
  public String getRestoreTime() {
    return restoreTime;
  }

  public void setRestoreTime(String restoreTime) {
    this.restoreTime = restoreTime;
  }

  public RestoreToExistedInstanceRequest restoreType(String restoreType) {
    this.restoreType = restoreType;
    return this;
  }

   /**
   * Get restoreType
   * @return restoreType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRestoreType() {
    return restoreType;
  }

  public void setRestoreType(String restoreType) {
    this.restoreType = restoreType;
  }

  public RestoreToExistedInstanceRequest sourceDBInstanceId(String sourceDBInstanceId) {
    this.sourceDBInstanceId = sourceDBInstanceId;
    return this;
  }

   /**
   * Get sourceDBInstanceId
   * @return sourceDBInstanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSourceDBInstanceId() {
    return sourceDBInstanceId;
  }

  public void setSourceDBInstanceId(String sourceDBInstanceId) {
    this.sourceDBInstanceId = sourceDBInstanceId;
  }

  public RestoreToExistedInstanceRequest tableMeta(List<TableMetaForRestoreToExistedInstanceInput> tableMeta) {
    this.tableMeta = tableMeta;
    return this;
  }

  public RestoreToExistedInstanceRequest addTableMetaItem(TableMetaForRestoreToExistedInstanceInput tableMetaItem) {
    if (this.tableMeta == null) {
      this.tableMeta = new ArrayList<TableMetaForRestoreToExistedInstanceInput>();
    }
    this.tableMeta.add(tableMetaItem);
    return this;
  }

   /**
   * Get tableMeta
   * @return tableMeta
  **/
  @Valid
  @Schema(description = "")
  public List<TableMetaForRestoreToExistedInstanceInput> getTableMeta() {
    return tableMeta;
  }

  public void setTableMeta(List<TableMetaForRestoreToExistedInstanceInput> tableMeta) {
    this.tableMeta = tableMeta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreToExistedInstanceRequest restoreToExistedInstanceRequest = (RestoreToExistedInstanceRequest) o;
    return Objects.equals(this.backupId, restoreToExistedInstanceRequest.backupId) &&
        Objects.equals(this.restoreTime, restoreToExistedInstanceRequest.restoreTime) &&
        Objects.equals(this.restoreType, restoreToExistedInstanceRequest.restoreType) &&
        Objects.equals(this.sourceDBInstanceId, restoreToExistedInstanceRequest.sourceDBInstanceId) &&
        Objects.equals(this.tableMeta, restoreToExistedInstanceRequest.tableMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupId, restoreTime, restoreType, sourceDBInstanceId, tableMeta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreToExistedInstanceRequest {\n");
    
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
    sb.append("    restoreType: ").append(toIndentedString(restoreType)).append("\n");
    sb.append("    sourceDBInstanceId: ").append(toIndentedString(sourceDBInstanceId)).append("\n");
    sb.append("    tableMeta: ").append(toIndentedString(tableMeta)).append("\n");
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
