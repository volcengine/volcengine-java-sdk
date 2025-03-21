/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.emr.model.ConfigForUpdateApplicationConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateApplicationConfigRequest
 */



public class UpdateApplicationConfigRequest {
  @SerializedName("ApplicationName")
  private String applicationName = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Configs")
  private List<ConfigForUpdateApplicationConfigInput> configs = null;

  @SerializedName("Remark")
  private String remark = null;

  public UpdateApplicationConfigRequest applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public UpdateApplicationConfigRequest clientToken(String clientToken) {
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

  public UpdateApplicationConfigRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public UpdateApplicationConfigRequest configs(List<ConfigForUpdateApplicationConfigInput> configs) {
    this.configs = configs;
    return this;
  }

  public UpdateApplicationConfigRequest addConfigsItem(ConfigForUpdateApplicationConfigInput configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<ConfigForUpdateApplicationConfigInput>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * Get configs
   * @return configs
  **/
  @Valid
  @Schema(description = "")
  public List<ConfigForUpdateApplicationConfigInput> getConfigs() {
    return configs;
  }

  public void setConfigs(List<ConfigForUpdateApplicationConfigInput> configs) {
    this.configs = configs;
  }

  public UpdateApplicationConfigRequest remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateApplicationConfigRequest updateApplicationConfigRequest = (UpdateApplicationConfigRequest) o;
    return Objects.equals(this.applicationName, updateApplicationConfigRequest.applicationName) &&
        Objects.equals(this.clientToken, updateApplicationConfigRequest.clientToken) &&
        Objects.equals(this.clusterId, updateApplicationConfigRequest.clusterId) &&
        Objects.equals(this.configs, updateApplicationConfigRequest.configs) &&
        Objects.equals(this.remark, updateApplicationConfigRequest.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, clientToken, clusterId, configs, remark);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApplicationConfigRequest {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
