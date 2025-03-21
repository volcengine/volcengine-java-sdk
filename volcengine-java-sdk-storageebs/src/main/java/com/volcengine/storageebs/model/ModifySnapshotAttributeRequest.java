/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * ModifySnapshotAttributeRequest
 */



public class ModifySnapshotAttributeRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("RetentionDays")
  private Integer retentionDays = null;

  @SerializedName("SnapshotId")
  private String snapshotId = null;

  @SerializedName("SnapshotName")
  private String snapshotName = null;

  public ModifySnapshotAttributeRequest description(String description) {
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

  public ModifySnapshotAttributeRequest retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

   /**
   * Get retentionDays
   * minimum: 1
   * maximum: 65536
   * @return retentionDays
  **/
 @Min(1) @Max(65536)  @Schema(description = "")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public ModifySnapshotAttributeRequest snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Get snapshotId
   * @return snapshotId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public ModifySnapshotAttributeRequest snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Get snapshotName
   * @return snapshotName
  **/
  @Schema(description = "")
  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifySnapshotAttributeRequest modifySnapshotAttributeRequest = (ModifySnapshotAttributeRequest) o;
    return Objects.equals(this.description, modifySnapshotAttributeRequest.description) &&
        Objects.equals(this.retentionDays, modifySnapshotAttributeRequest.retentionDays) &&
        Objects.equals(this.snapshotId, modifySnapshotAttributeRequest.snapshotId) &&
        Objects.equals(this.snapshotName, modifySnapshotAttributeRequest.snapshotName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, retentionDays, snapshotId, snapshotName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifySnapshotAttributeRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
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
