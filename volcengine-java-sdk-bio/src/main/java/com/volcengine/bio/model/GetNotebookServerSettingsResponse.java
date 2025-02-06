/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

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
 * GetNotebookServerSettingsResponse
 */



public class GetNotebookServerSettingsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ImageID")
  private String imageID = null;

  @SerializedName("MountTOSEnabled")
  private Boolean mountTOSEnabled = null;

  @SerializedName("ResourceSize")
  private String resourceSize = null;

  @SerializedName("StorageCapacity")
  private Integer storageCapacity = null;

  @SerializedName("TempImageName")
  private String tempImageName = null;

  public GetNotebookServerSettingsResponse imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

   /**
   * Get imageID
   * @return imageID
  **/
  @Schema(description = "")
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  public GetNotebookServerSettingsResponse mountTOSEnabled(Boolean mountTOSEnabled) {
    this.mountTOSEnabled = mountTOSEnabled;
    return this;
  }

   /**
   * Get mountTOSEnabled
   * @return mountTOSEnabled
  **/
  @Schema(description = "")
  public Boolean isMountTOSEnabled() {
    return mountTOSEnabled;
  }

  public void setMountTOSEnabled(Boolean mountTOSEnabled) {
    this.mountTOSEnabled = mountTOSEnabled;
  }

  public GetNotebookServerSettingsResponse resourceSize(String resourceSize) {
    this.resourceSize = resourceSize;
    return this;
  }

   /**
   * Get resourceSize
   * @return resourceSize
  **/
  @Schema(description = "")
  public String getResourceSize() {
    return resourceSize;
  }

  public void setResourceSize(String resourceSize) {
    this.resourceSize = resourceSize;
  }

  public GetNotebookServerSettingsResponse storageCapacity(Integer storageCapacity) {
    this.storageCapacity = storageCapacity;
    return this;
  }

   /**
   * Get storageCapacity
   * @return storageCapacity
  **/
  @Schema(description = "")
  public Integer getStorageCapacity() {
    return storageCapacity;
  }

  public void setStorageCapacity(Integer storageCapacity) {
    this.storageCapacity = storageCapacity;
  }

  public GetNotebookServerSettingsResponse tempImageName(String tempImageName) {
    this.tempImageName = tempImageName;
    return this;
  }

   /**
   * Get tempImageName
   * @return tempImageName
  **/
  @Schema(description = "")
  public String getTempImageName() {
    return tempImageName;
  }

  public void setTempImageName(String tempImageName) {
    this.tempImageName = tempImageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNotebookServerSettingsResponse getNotebookServerSettingsResponse = (GetNotebookServerSettingsResponse) o;
    return Objects.equals(this.imageID, getNotebookServerSettingsResponse.imageID) &&
        Objects.equals(this.mountTOSEnabled, getNotebookServerSettingsResponse.mountTOSEnabled) &&
        Objects.equals(this.resourceSize, getNotebookServerSettingsResponse.resourceSize) &&
        Objects.equals(this.storageCapacity, getNotebookServerSettingsResponse.storageCapacity) &&
        Objects.equals(this.tempImageName, getNotebookServerSettingsResponse.tempImageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageID, mountTOSEnabled, resourceSize, storageCapacity, tempImageName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNotebookServerSettingsResponse {\n");
    
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    mountTOSEnabled: ").append(toIndentedString(mountTOSEnabled)).append("\n");
    sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
    sb.append("    storageCapacity: ").append(toIndentedString(storageCapacity)).append("\n");
    sb.append("    tempImageName: ").append(toIndentedString(tempImageName)).append("\n");
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
