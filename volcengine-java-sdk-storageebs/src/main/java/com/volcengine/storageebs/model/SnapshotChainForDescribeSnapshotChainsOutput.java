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
 * SnapshotChainForDescribeSnapshotChainsOutput
 */



public class SnapshotChainForDescribeSnapshotChainsOutput {
  @SerializedName("SnapshotChainId")
  private String snapshotChainId = null;

  @SerializedName("SnapshotCount")
  private Integer snapshotCount = null;

  @SerializedName("SnapshotSize")
  private Long snapshotSize = null;

  @SerializedName("VolumeId")
  private String volumeId = null;

  public SnapshotChainForDescribeSnapshotChainsOutput snapshotChainId(String snapshotChainId) {
    this.snapshotChainId = snapshotChainId;
    return this;
  }

   /**
   * Get snapshotChainId
   * @return snapshotChainId
  **/
  @Schema(description = "")
  public String getSnapshotChainId() {
    return snapshotChainId;
  }

  public void setSnapshotChainId(String snapshotChainId) {
    this.snapshotChainId = snapshotChainId;
  }

  public SnapshotChainForDescribeSnapshotChainsOutput snapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
    return this;
  }

   /**
   * Get snapshotCount
   * @return snapshotCount
  **/
  @Schema(description = "")
  public Integer getSnapshotCount() {
    return snapshotCount;
  }

  public void setSnapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
  }

  public SnapshotChainForDescribeSnapshotChainsOutput snapshotSize(Long snapshotSize) {
    this.snapshotSize = snapshotSize;
    return this;
  }

   /**
   * Get snapshotSize
   * @return snapshotSize
  **/
  @Schema(description = "")
  public Long getSnapshotSize() {
    return snapshotSize;
  }

  public void setSnapshotSize(Long snapshotSize) {
    this.snapshotSize = snapshotSize;
  }

  public SnapshotChainForDescribeSnapshotChainsOutput volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @Schema(description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotChainForDescribeSnapshotChainsOutput snapshotChainForDescribeSnapshotChainsOutput = (SnapshotChainForDescribeSnapshotChainsOutput) o;
    return Objects.equals(this.snapshotChainId, snapshotChainForDescribeSnapshotChainsOutput.snapshotChainId) &&
        Objects.equals(this.snapshotCount, snapshotChainForDescribeSnapshotChainsOutput.snapshotCount) &&
        Objects.equals(this.snapshotSize, snapshotChainForDescribeSnapshotChainsOutput.snapshotSize) &&
        Objects.equals(this.volumeId, snapshotChainForDescribeSnapshotChainsOutput.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotChainId, snapshotCount, snapshotSize, volumeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotChainForDescribeSnapshotChainsOutput {\n");
    
    sb.append("    snapshotChainId: ").append(toIndentedString(snapshotChainId)).append("\n");
    sb.append("    snapshotCount: ").append(toIndentedString(snapshotCount)).append("\n");
    sb.append("    snapshotSize: ").append(toIndentedString(snapshotSize)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
