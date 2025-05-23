/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

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
 * VepfsForGetResourceGroupOutput
 */



public class VepfsForGetResourceGroupOutput {
  @SerializedName("FileSystemIds")
  private List<String> fileSystemIds = null;

  @SerializedName("MountServiceId")
  private String mountServiceId = null;

  @SerializedName("PrefetchEnabled")
  private Boolean prefetchEnabled = null;

  @SerializedName("UnavailableNodeCount")
  private Integer unavailableNodeCount = null;

  public VepfsForGetResourceGroupOutput fileSystemIds(List<String> fileSystemIds) {
    this.fileSystemIds = fileSystemIds;
    return this;
  }

  public VepfsForGetResourceGroupOutput addFileSystemIdsItem(String fileSystemIdsItem) {
    if (this.fileSystemIds == null) {
      this.fileSystemIds = new ArrayList<String>();
    }
    this.fileSystemIds.add(fileSystemIdsItem);
    return this;
  }

   /**
   * Get fileSystemIds
   * @return fileSystemIds
  **/
  @Schema(description = "")
  public List<String> getFileSystemIds() {
    return fileSystemIds;
  }

  public void setFileSystemIds(List<String> fileSystemIds) {
    this.fileSystemIds = fileSystemIds;
  }

  public VepfsForGetResourceGroupOutput mountServiceId(String mountServiceId) {
    this.mountServiceId = mountServiceId;
    return this;
  }

   /**
   * Get mountServiceId
   * @return mountServiceId
  **/
  @Schema(description = "")
  public String getMountServiceId() {
    return mountServiceId;
  }

  public void setMountServiceId(String mountServiceId) {
    this.mountServiceId = mountServiceId;
  }

  public VepfsForGetResourceGroupOutput prefetchEnabled(Boolean prefetchEnabled) {
    this.prefetchEnabled = prefetchEnabled;
    return this;
  }

   /**
   * Get prefetchEnabled
   * @return prefetchEnabled
  **/
  @Schema(description = "")
  public Boolean isPrefetchEnabled() {
    return prefetchEnabled;
  }

  public void setPrefetchEnabled(Boolean prefetchEnabled) {
    this.prefetchEnabled = prefetchEnabled;
  }

  public VepfsForGetResourceGroupOutput unavailableNodeCount(Integer unavailableNodeCount) {
    this.unavailableNodeCount = unavailableNodeCount;
    return this;
  }

   /**
   * Get unavailableNodeCount
   * @return unavailableNodeCount
  **/
  @Schema(description = "")
  public Integer getUnavailableNodeCount() {
    return unavailableNodeCount;
  }

  public void setUnavailableNodeCount(Integer unavailableNodeCount) {
    this.unavailableNodeCount = unavailableNodeCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VepfsForGetResourceGroupOutput vepfsForGetResourceGroupOutput = (VepfsForGetResourceGroupOutput) o;
    return Objects.equals(this.fileSystemIds, vepfsForGetResourceGroupOutput.fileSystemIds) &&
        Objects.equals(this.mountServiceId, vepfsForGetResourceGroupOutput.mountServiceId) &&
        Objects.equals(this.prefetchEnabled, vepfsForGetResourceGroupOutput.prefetchEnabled) &&
        Objects.equals(this.unavailableNodeCount, vepfsForGetResourceGroupOutput.unavailableNodeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemIds, mountServiceId, prefetchEnabled, unavailableNodeCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VepfsForGetResourceGroupOutput {\n");
    
    sb.append("    fileSystemIds: ").append(toIndentedString(fileSystemIds)).append("\n");
    sb.append("    mountServiceId: ").append(toIndentedString(mountServiceId)).append("\n");
    sb.append("    prefetchEnabled: ").append(toIndentedString(prefetchEnabled)).append("\n");
    sb.append("    unavailableNodeCount: ").append(toIndentedString(unavailableNodeCount)).append("\n");
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
