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
import com.volcengine.vke.model.ClusterConfigForUpdateClusterConfigInput;
import com.volcengine.vke.model.LoggingConfigForUpdateClusterConfigInput;
import com.volcengine.vke.model.PodsConfigForUpdateClusterConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateClusterConfigRequest
 */



public class UpdateClusterConfigRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterConfig")
  private ClusterConfigForUpdateClusterConfigInput clusterConfig = null;

  @SerializedName("DeleteProtectionEnabled")
  private Boolean deleteProtectionEnabled = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("LoggingConfig")
  private LoggingConfigForUpdateClusterConfigInput loggingConfig = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PodsConfig")
  private PodsConfigForUpdateClusterConfigInput podsConfig = null;

  public UpdateClusterConfigRequest clientToken(String clientToken) {
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

  public UpdateClusterConfigRequest clusterConfig(ClusterConfigForUpdateClusterConfigInput clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Valid
  @Schema(description = "")
  public ClusterConfigForUpdateClusterConfigInput getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(ClusterConfigForUpdateClusterConfigInput clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public UpdateClusterConfigRequest deleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
    return this;
  }

   /**
   * Get deleteProtectionEnabled
   * @return deleteProtectionEnabled
  **/
  @Schema(description = "")
  public Boolean isDeleteProtectionEnabled() {
    return deleteProtectionEnabled;
  }

  public void setDeleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
  }

  public UpdateClusterConfigRequest description(String description) {
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

  public UpdateClusterConfigRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateClusterConfigRequest loggingConfig(LoggingConfigForUpdateClusterConfigInput loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

   /**
   * Get loggingConfig
   * @return loggingConfig
  **/
  @Valid
  @Schema(description = "")
  public LoggingConfigForUpdateClusterConfigInput getLoggingConfig() {
    return loggingConfig;
  }

  public void setLoggingConfig(LoggingConfigForUpdateClusterConfigInput loggingConfig) {
    this.loggingConfig = loggingConfig;
  }

  public UpdateClusterConfigRequest name(String name) {
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

  public UpdateClusterConfigRequest podsConfig(PodsConfigForUpdateClusterConfigInput podsConfig) {
    this.podsConfig = podsConfig;
    return this;
  }

   /**
   * Get podsConfig
   * @return podsConfig
  **/
  @Valid
  @Schema(description = "")
  public PodsConfigForUpdateClusterConfigInput getPodsConfig() {
    return podsConfig;
  }

  public void setPodsConfig(PodsConfigForUpdateClusterConfigInput podsConfig) {
    this.podsConfig = podsConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClusterConfigRequest updateClusterConfigRequest = (UpdateClusterConfigRequest) o;
    return Objects.equals(this.clientToken, updateClusterConfigRequest.clientToken) &&
        Objects.equals(this.clusterConfig, updateClusterConfigRequest.clusterConfig) &&
        Objects.equals(this.deleteProtectionEnabled, updateClusterConfigRequest.deleteProtectionEnabled) &&
        Objects.equals(this.description, updateClusterConfigRequest.description) &&
        Objects.equals(this.id, updateClusterConfigRequest.id) &&
        Objects.equals(this.loggingConfig, updateClusterConfigRequest.loggingConfig) &&
        Objects.equals(this.name, updateClusterConfigRequest.name) &&
        Objects.equals(this.podsConfig, updateClusterConfigRequest.podsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, clusterConfig, deleteProtectionEnabled, description, id, loggingConfig, name, podsConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterConfigRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
    sb.append("    deleteProtectionEnabled: ").append(toIndentedString(deleteProtectionEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loggingConfig: ").append(toIndentedString(loggingConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podsConfig: ").append(toIndentedString(podsConfig)).append("\n");
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
