/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.StatusForListAddonsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListAddonsOutput
 */



public class ItemForListAddonsOutput {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Config")
  private String config = null;

  @SerializedName("CreateClientToken")
  private String createClientToken = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DeployMode")
  private String deployMode = null;

  @SerializedName("DeployNodeType")
  private String deployNodeType = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Status")
  private StatusForListAddonsOutput status = null;

  @SerializedName("UpdateClientToken")
  private String updateClientToken = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("Version")
  private String version = null;

  public ItemForListAddonsOutput clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public ItemForListAddonsOutput config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(description = "")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public ItemForListAddonsOutput createClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
    return this;
  }

   /**
   * Get createClientToken
   * @return createClientToken
  **/
  @Schema(description = "")
  public String getCreateClientToken() {
    return createClientToken;
  }

  public void setCreateClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
  }

  public ItemForListAddonsOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ItemForListAddonsOutput deployMode(String deployMode) {
    this.deployMode = deployMode;
    return this;
  }

   /**
   * Get deployMode
   * @return deployMode
  **/
  @Schema(description = "")
  public String getDeployMode() {
    return deployMode;
  }

  public void setDeployMode(String deployMode) {
    this.deployMode = deployMode;
  }

  public ItemForListAddonsOutput deployNodeType(String deployNodeType) {
    this.deployNodeType = deployNodeType;
    return this;
  }

   /**
   * Get deployNodeType
   * @return deployNodeType
  **/
  @Schema(description = "")
  public String getDeployNodeType() {
    return deployNodeType;
  }

  public void setDeployNodeType(String deployNodeType) {
    this.deployNodeType = deployNodeType;
  }

  public ItemForListAddonsOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemForListAddonsOutput status(StatusForListAddonsOutput status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Valid
  @Schema(description = "")
  public StatusForListAddonsOutput getStatus() {
    return status;
  }

  public void setStatus(StatusForListAddonsOutput status) {
    this.status = status;
  }

  public ItemForListAddonsOutput updateClientToken(String updateClientToken) {
    this.updateClientToken = updateClientToken;
    return this;
  }

   /**
   * Get updateClientToken
   * @return updateClientToken
  **/
  @Schema(description = "")
  public String getUpdateClientToken() {
    return updateClientToken;
  }

  public void setUpdateClientToken(String updateClientToken) {
    this.updateClientToken = updateClientToken;
  }

  public ItemForListAddonsOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public ItemForListAddonsOutput version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListAddonsOutput itemForListAddonsOutput = (ItemForListAddonsOutput) o;
    return Objects.equals(this.clusterId, itemForListAddonsOutput.clusterId) &&
        Objects.equals(this.config, itemForListAddonsOutput.config) &&
        Objects.equals(this.createClientToken, itemForListAddonsOutput.createClientToken) &&
        Objects.equals(this.createTime, itemForListAddonsOutput.createTime) &&
        Objects.equals(this.deployMode, itemForListAddonsOutput.deployMode) &&
        Objects.equals(this.deployNodeType, itemForListAddonsOutput.deployNodeType) &&
        Objects.equals(this.name, itemForListAddonsOutput.name) &&
        Objects.equals(this.status, itemForListAddonsOutput.status) &&
        Objects.equals(this.updateClientToken, itemForListAddonsOutput.updateClientToken) &&
        Objects.equals(this.updateTime, itemForListAddonsOutput.updateTime) &&
        Objects.equals(this.version, itemForListAddonsOutput.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, config, createClientToken, createTime, deployMode, deployNodeType, name, status, updateClientToken, updateTime, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListAddonsOutput {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createClientToken: ").append(toIndentedString(createClientToken)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
    sb.append("    deployNodeType: ").append(toIndentedString(deployNodeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateClientToken: ").append(toIndentedString(updateClientToken)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
