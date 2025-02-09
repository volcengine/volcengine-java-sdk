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
 * VKEConfigForListClustersOfWorkspaceOutput
 */



public class VKEConfigForListClustersOfWorkspaceOutput {
  @SerializedName("ClusterID")
  private String clusterID = null;

  @SerializedName("StorageClass")
  private String storageClass = null;

  @SerializedName("VCIEnabled")
  private Boolean vcIEnabled = null;

  public VKEConfigForListClustersOfWorkspaceOutput clusterID(String clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * Get clusterID
   * @return clusterID
  **/
  @Schema(description = "")
  public String getClusterID() {
    return clusterID;
  }

  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  public VKEConfigForListClustersOfWorkspaceOutput storageClass(String storageClass) {
    this.storageClass = storageClass;
    return this;
  }

   /**
   * Get storageClass
   * @return storageClass
  **/
  @Schema(description = "")
  public String getStorageClass() {
    return storageClass;
  }

  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }

  public VKEConfigForListClustersOfWorkspaceOutput vcIEnabled(Boolean vcIEnabled) {
    this.vcIEnabled = vcIEnabled;
    return this;
  }

   /**
   * Get vcIEnabled
   * @return vcIEnabled
  **/
  @Schema(description = "")
  public Boolean isVcIEnabled() {
    return vcIEnabled;
  }

  public void setVcIEnabled(Boolean vcIEnabled) {
    this.vcIEnabled = vcIEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VKEConfigForListClustersOfWorkspaceOutput vkEConfigForListClustersOfWorkspaceOutput = (VKEConfigForListClustersOfWorkspaceOutput) o;
    return Objects.equals(this.clusterID, vkEConfigForListClustersOfWorkspaceOutput.clusterID) &&
        Objects.equals(this.storageClass, vkEConfigForListClustersOfWorkspaceOutput.storageClass) &&
        Objects.equals(this.vcIEnabled, vkEConfigForListClustersOfWorkspaceOutput.vcIEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterID, storageClass, vcIEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VKEConfigForListClustersOfWorkspaceOutput {\n");
    
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
    sb.append("    vcIEnabled: ").append(toIndentedString(vcIEnabled)).append("\n");
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
