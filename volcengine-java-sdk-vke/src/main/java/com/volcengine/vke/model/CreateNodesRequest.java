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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateNodesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:56.909838+08:00[Asia/Shanghai]")
public class CreateNodesRequest {
  @SerializedName("AdditionalContainerStorageEnabled")
  private Boolean additionalContainerStorageEnabled = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("ContainerStoragePath")
  private String containerStoragePath = null;

  @SerializedName("InstanceIds")
  private List<String> instanceIds = null;

  @SerializedName("KeepInstanceName")
  private Boolean keepInstanceName = null;

  public CreateNodesRequest additionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
    return this;
  }

   /**
   * Get additionalContainerStorageEnabled
   * @return additionalContainerStorageEnabled
  **/
  @Schema(description = "")
  public Boolean isAdditionalContainerStorageEnabled() {
    return additionalContainerStorageEnabled;
  }

  public void setAdditionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
  }

  public CreateNodesRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateNodesRequest clusterId(String clusterId) {
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

  public CreateNodesRequest containerStoragePath(String containerStoragePath) {
    this.containerStoragePath = containerStoragePath;
    return this;
  }

   /**
   * Get containerStoragePath
   * @return containerStoragePath
  **/
  @Schema(description = "")
  public String getContainerStoragePath() {
    return containerStoragePath;
  }

  public void setContainerStoragePath(String containerStoragePath) {
    this.containerStoragePath = containerStoragePath;
  }

  public CreateNodesRequest instanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public CreateNodesRequest addInstanceIdsItem(String instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<String>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @Schema(description = "")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  public CreateNodesRequest keepInstanceName(Boolean keepInstanceName) {
    this.keepInstanceName = keepInstanceName;
    return this;
  }

   /**
   * Get keepInstanceName
   * @return keepInstanceName
  **/
  @Schema(description = "")
  public Boolean isKeepInstanceName() {
    return keepInstanceName;
  }

  public void setKeepInstanceName(Boolean keepInstanceName) {
    this.keepInstanceName = keepInstanceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNodesRequest createNodesRequest = (CreateNodesRequest) o;
    return Objects.equals(this.additionalContainerStorageEnabled, createNodesRequest.additionalContainerStorageEnabled) &&
        Objects.equals(this.clientToken, createNodesRequest.clientToken) &&
        Objects.equals(this.clusterId, createNodesRequest.clusterId) &&
        Objects.equals(this.containerStoragePath, createNodesRequest.containerStoragePath) &&
        Objects.equals(this.instanceIds, createNodesRequest.instanceIds) &&
        Objects.equals(this.keepInstanceName, createNodesRequest.keepInstanceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalContainerStorageEnabled, clientToken, clusterId, containerStoragePath, instanceIds, keepInstanceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNodesRequest {\n");
    
    sb.append("    additionalContainerStorageEnabled: ").append(toIndentedString(additionalContainerStorageEnabled)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    containerStoragePath: ").append(toIndentedString(containerStoragePath)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    keepInstanceName: ").append(toIndentedString(keepInstanceName)).append("\n");
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
