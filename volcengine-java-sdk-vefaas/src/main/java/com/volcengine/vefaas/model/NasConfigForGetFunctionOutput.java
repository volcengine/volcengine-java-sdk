/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

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
 * NasConfigForGetFunctionOutput
 */



public class NasConfigForGetFunctionOutput {
  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("Gid")
  private Long gid = null;

  @SerializedName("LocalMountPath")
  private String localMountPath = null;

  @SerializedName("MountPointId")
  private String mountPointId = null;

  @SerializedName("RemotePath")
  private String remotePath = null;

  @SerializedName("Uid")
  private Long uid = null;

  public NasConfigForGetFunctionOutput fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @Schema(description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }

  public NasConfigForGetFunctionOutput gid(Long gid) {
    this.gid = gid;
    return this;
  }

   /**
   * Get gid
   * @return gid
  **/
  @Schema(description = "")
  public Long getGid() {
    return gid;
  }

  public void setGid(Long gid) {
    this.gid = gid;
  }

  public NasConfigForGetFunctionOutput localMountPath(String localMountPath) {
    this.localMountPath = localMountPath;
    return this;
  }

   /**
   * Get localMountPath
   * @return localMountPath
  **/
  @Schema(description = "")
  public String getLocalMountPath() {
    return localMountPath;
  }

  public void setLocalMountPath(String localMountPath) {
    this.localMountPath = localMountPath;
  }

  public NasConfigForGetFunctionOutput mountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
    return this;
  }

   /**
   * Get mountPointId
   * @return mountPointId
  **/
  @Schema(description = "")
  public String getMountPointId() {
    return mountPointId;
  }

  public void setMountPointId(String mountPointId) {
    this.mountPointId = mountPointId;
  }

  public NasConfigForGetFunctionOutput remotePath(String remotePath) {
    this.remotePath = remotePath;
    return this;
  }

   /**
   * Get remotePath
   * @return remotePath
  **/
  @Schema(description = "")
  public String getRemotePath() {
    return remotePath;
  }

  public void setRemotePath(String remotePath) {
    this.remotePath = remotePath;
  }

  public NasConfigForGetFunctionOutput uid(Long uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NasConfigForGetFunctionOutput nasConfigForGetFunctionOutput = (NasConfigForGetFunctionOutput) o;
    return Objects.equals(this.fileSystemId, nasConfigForGetFunctionOutput.fileSystemId) &&
        Objects.equals(this.gid, nasConfigForGetFunctionOutput.gid) &&
        Objects.equals(this.localMountPath, nasConfigForGetFunctionOutput.localMountPath) &&
        Objects.equals(this.mountPointId, nasConfigForGetFunctionOutput.mountPointId) &&
        Objects.equals(this.remotePath, nasConfigForGetFunctionOutput.remotePath) &&
        Objects.equals(this.uid, nasConfigForGetFunctionOutput.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemId, gid, localMountPath, mountPointId, remotePath, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NasConfigForGetFunctionOutput {\n");
    
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    localMountPath: ").append(toIndentedString(localMountPath)).append("\n");
    sb.append("    mountPointId: ").append(toIndentedString(mountPointId)).append("\n");
    sb.append("    remotePath: ").append(toIndentedString(remotePath)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
