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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ApplyAutoSnapshotPolicyRequest
 */



public class ApplyAutoSnapshotPolicyRequest {
  @SerializedName("AutoSnapshotPolicyId")
  private String autoSnapshotPolicyId = null;

  @SerializedName("VolumeIds")
  private List<String> volumeIds = null;

  public ApplyAutoSnapshotPolicyRequest autoSnapshotPolicyId(String autoSnapshotPolicyId) {
    this.autoSnapshotPolicyId = autoSnapshotPolicyId;
    return this;
  }

   /**
   * Get autoSnapshotPolicyId
   * @return autoSnapshotPolicyId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAutoSnapshotPolicyId() {
    return autoSnapshotPolicyId;
  }

  public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
    this.autoSnapshotPolicyId = autoSnapshotPolicyId;
  }

  public ApplyAutoSnapshotPolicyRequest volumeIds(List<String> volumeIds) {
    this.volumeIds = volumeIds;
    return this;
  }

  public ApplyAutoSnapshotPolicyRequest addVolumeIdsItem(String volumeIdsItem) {
    if (this.volumeIds == null) {
      this.volumeIds = new ArrayList<String>();
    }
    this.volumeIds.add(volumeIdsItem);
    return this;
  }

   /**
   * Get volumeIds
   * @return volumeIds
  **/
  @Schema(description = "")
  public List<String> getVolumeIds() {
    return volumeIds;
  }

  public void setVolumeIds(List<String> volumeIds) {
    this.volumeIds = volumeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyAutoSnapshotPolicyRequest applyAutoSnapshotPolicyRequest = (ApplyAutoSnapshotPolicyRequest) o;
    return Objects.equals(this.autoSnapshotPolicyId, applyAutoSnapshotPolicyRequest.autoSnapshotPolicyId) &&
        Objects.equals(this.volumeIds, applyAutoSnapshotPolicyRequest.volumeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoSnapshotPolicyId, volumeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyAutoSnapshotPolicyRequest {\n");
    
    sb.append("    autoSnapshotPolicyId: ").append(toIndentedString(autoSnapshotPolicyId)).append("\n");
    sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
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
