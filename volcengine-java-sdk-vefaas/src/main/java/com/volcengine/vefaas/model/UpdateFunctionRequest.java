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
import com.volcengine.vefaas.model.EnvForUpdateFunctionInput;
import com.volcengine.vefaas.model.NasStorageForUpdateFunctionInput;
import com.volcengine.vefaas.model.SourceAccessConfigForUpdateFunctionInput;
import com.volcengine.vefaas.model.TlsConfigForUpdateFunctionInput;
import com.volcengine.vefaas.model.TosMountConfigForUpdateFunctionInput;
import com.volcengine.vefaas.model.VpcConfigForUpdateFunctionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateFunctionRequest
 */



public class UpdateFunctionRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Envs")
  private List<EnvForUpdateFunctionInput> envs = null;

  @SerializedName("ExclusiveMode")
  private Boolean exclusiveMode = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InitializerSec")
  private Integer initializerSec = null;

  @SerializedName("MaxConcurrency")
  private Integer maxConcurrency = null;

  @SerializedName("MemoryMB")
  private Integer memoryMB = null;

  @SerializedName("NasStorage")
  private NasStorageForUpdateFunctionInput nasStorage = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestTimeout")
  private Integer requestTimeout = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("SourceAccessConfig")
  private SourceAccessConfigForUpdateFunctionInput sourceAccessConfig = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("TlsConfig")
  private TlsConfigForUpdateFunctionInput tlsConfig = null;

  @SerializedName("TosMountConfig")
  private TosMountConfigForUpdateFunctionInput tosMountConfig = null;

  @SerializedName("VpcConfig")
  private VpcConfigForUpdateFunctionInput vpcConfig = null;

  public UpdateFunctionRequest description(String description) {
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

  public UpdateFunctionRequest envs(List<EnvForUpdateFunctionInput> envs) {
    this.envs = envs;
    return this;
  }

  public UpdateFunctionRequest addEnvsItem(EnvForUpdateFunctionInput envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<EnvForUpdateFunctionInput>();
    }
    this.envs.add(envsItem);
    return this;
  }

   /**
   * Get envs
   * @return envs
  **/
  @Valid
  @Schema(description = "")
  public List<EnvForUpdateFunctionInput> getEnvs() {
    return envs;
  }

  public void setEnvs(List<EnvForUpdateFunctionInput> envs) {
    this.envs = envs;
  }

  public UpdateFunctionRequest exclusiveMode(Boolean exclusiveMode) {
    this.exclusiveMode = exclusiveMode;
    return this;
  }

   /**
   * Get exclusiveMode
   * @return exclusiveMode
  **/
  @Schema(description = "")
  public Boolean isExclusiveMode() {
    return exclusiveMode;
  }

  public void setExclusiveMode(Boolean exclusiveMode) {
    this.exclusiveMode = exclusiveMode;
  }

  public UpdateFunctionRequest id(String id) {
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

  public UpdateFunctionRequest initializerSec(Integer initializerSec) {
    this.initializerSec = initializerSec;
    return this;
  }

   /**
   * Get initializerSec
   * @return initializerSec
  **/
  @Schema(description = "")
  public Integer getInitializerSec() {
    return initializerSec;
  }

  public void setInitializerSec(Integer initializerSec) {
    this.initializerSec = initializerSec;
  }

  public UpdateFunctionRequest maxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
    return this;
  }

   /**
   * Get maxConcurrency
   * @return maxConcurrency
  **/
  @Schema(description = "")
  public Integer getMaxConcurrency() {
    return maxConcurrency;
  }

  public void setMaxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
  }

  public UpdateFunctionRequest memoryMB(Integer memoryMB) {
    this.memoryMB = memoryMB;
    return this;
  }

   /**
   * Get memoryMB
   * @return memoryMB
  **/
  @Schema(description = "")
  public Integer getMemoryMB() {
    return memoryMB;
  }

  public void setMemoryMB(Integer memoryMB) {
    this.memoryMB = memoryMB;
  }

  public UpdateFunctionRequest nasStorage(NasStorageForUpdateFunctionInput nasStorage) {
    this.nasStorage = nasStorage;
    return this;
  }

   /**
   * Get nasStorage
   * @return nasStorage
  **/
  @Valid
  @Schema(description = "")
  public NasStorageForUpdateFunctionInput getNasStorage() {
    return nasStorage;
  }

  public void setNasStorage(NasStorageForUpdateFunctionInput nasStorage) {
    this.nasStorage = nasStorage;
  }

  public UpdateFunctionRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public UpdateFunctionRequest requestTimeout(Integer requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

   /**
   * Get requestTimeout
   * @return requestTimeout
  **/
  @Schema(description = "")
  public Integer getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(Integer requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public UpdateFunctionRequest source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public UpdateFunctionRequest sourceAccessConfig(SourceAccessConfigForUpdateFunctionInput sourceAccessConfig) {
    this.sourceAccessConfig = sourceAccessConfig;
    return this;
  }

   /**
   * Get sourceAccessConfig
   * @return sourceAccessConfig
  **/
  @Valid
  @Schema(description = "")
  public SourceAccessConfigForUpdateFunctionInput getSourceAccessConfig() {
    return sourceAccessConfig;
  }

  public void setSourceAccessConfig(SourceAccessConfigForUpdateFunctionInput sourceAccessConfig) {
    this.sourceAccessConfig = sourceAccessConfig;
  }

  public UpdateFunctionRequest sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @Schema(description = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public UpdateFunctionRequest tlsConfig(TlsConfigForUpdateFunctionInput tlsConfig) {
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @Valid
  @Schema(description = "")
  public TlsConfigForUpdateFunctionInput getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(TlsConfigForUpdateFunctionInput tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  public UpdateFunctionRequest tosMountConfig(TosMountConfigForUpdateFunctionInput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
    return this;
  }

   /**
   * Get tosMountConfig
   * @return tosMountConfig
  **/
  @Valid
  @Schema(description = "")
  public TosMountConfigForUpdateFunctionInput getTosMountConfig() {
    return tosMountConfig;
  }

  public void setTosMountConfig(TosMountConfigForUpdateFunctionInput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
  }

  public UpdateFunctionRequest vpcConfig(VpcConfigForUpdateFunctionInput vpcConfig) {
    this.vpcConfig = vpcConfig;
    return this;
  }

   /**
   * Get vpcConfig
   * @return vpcConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcConfigForUpdateFunctionInput getVpcConfig() {
    return vpcConfig;
  }

  public void setVpcConfig(VpcConfigForUpdateFunctionInput vpcConfig) {
    this.vpcConfig = vpcConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFunctionRequest updateFunctionRequest = (UpdateFunctionRequest) o;
    return Objects.equals(this.description, updateFunctionRequest.description) &&
        Objects.equals(this.envs, updateFunctionRequest.envs) &&
        Objects.equals(this.exclusiveMode, updateFunctionRequest.exclusiveMode) &&
        Objects.equals(this.id, updateFunctionRequest.id) &&
        Objects.equals(this.initializerSec, updateFunctionRequest.initializerSec) &&
        Objects.equals(this.maxConcurrency, updateFunctionRequest.maxConcurrency) &&
        Objects.equals(this.memoryMB, updateFunctionRequest.memoryMB) &&
        Objects.equals(this.nasStorage, updateFunctionRequest.nasStorage) &&
        Objects.equals(this.projectName, updateFunctionRequest.projectName) &&
        Objects.equals(this.requestTimeout, updateFunctionRequest.requestTimeout) &&
        Objects.equals(this.source, updateFunctionRequest.source) &&
        Objects.equals(this.sourceAccessConfig, updateFunctionRequest.sourceAccessConfig) &&
        Objects.equals(this.sourceType, updateFunctionRequest.sourceType) &&
        Objects.equals(this.tlsConfig, updateFunctionRequest.tlsConfig) &&
        Objects.equals(this.tosMountConfig, updateFunctionRequest.tosMountConfig) &&
        Objects.equals(this.vpcConfig, updateFunctionRequest.vpcConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, envs, exclusiveMode, id, initializerSec, maxConcurrency, memoryMB, nasStorage, projectName, requestTimeout, source, sourceAccessConfig, sourceType, tlsConfig, tosMountConfig, vpcConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFunctionRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    exclusiveMode: ").append(toIndentedString(exclusiveMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initializerSec: ").append(toIndentedString(initializerSec)).append("\n");
    sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
    sb.append("    memoryMB: ").append(toIndentedString(memoryMB)).append("\n");
    sb.append("    nasStorage: ").append(toIndentedString(nasStorage)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceAccessConfig: ").append(toIndentedString(sourceAccessConfig)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    tosMountConfig: ").append(toIndentedString(tosMountConfig)).append("\n");
    sb.append("    vpcConfig: ").append(toIndentedString(vpcConfig)).append("\n");
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
