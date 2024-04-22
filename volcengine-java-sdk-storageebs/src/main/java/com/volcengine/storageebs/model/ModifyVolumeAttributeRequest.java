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
 * ModifyVolumeAttributeRequest
 */


public class ModifyVolumeAttributeRequest {
  @SerializedName("DeleteWithInstance")
  private Boolean deleteWithInstance = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("VolumeId")
  private String volumeId = null;

  @SerializedName("VolumeName")
  private String volumeName = null;

  public ModifyVolumeAttributeRequest deleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
    return this;
  }

   /**
   * Get deleteWithInstance
   * @return deleteWithInstance
  **/
  @Schema(description = "")
  public Boolean isDeleteWithInstance() {
    return deleteWithInstance;
  }

  public void setDeleteWithInstance(Boolean deleteWithInstance) {
    this.deleteWithInstance = deleteWithInstance;
  }

  public ModifyVolumeAttributeRequest description(String description) {
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

  public ModifyVolumeAttributeRequest volumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Get volumeId
   * @return volumeId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }

  public ModifyVolumeAttributeRequest volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyVolumeAttributeRequest modifyVolumeAttributeRequest = (ModifyVolumeAttributeRequest) o;
    return Objects.equals(this.deleteWithInstance, modifyVolumeAttributeRequest.deleteWithInstance) &&
        Objects.equals(this.description, modifyVolumeAttributeRequest.description) &&
        Objects.equals(this.volumeId, modifyVolumeAttributeRequest.volumeId) &&
        Objects.equals(this.volumeName, modifyVolumeAttributeRequest.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteWithInstance, description, volumeId, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyVolumeAttributeRequest {\n");
    
    sb.append("    deleteWithInstance: ").append(toIndentedString(deleteWithInstance)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
