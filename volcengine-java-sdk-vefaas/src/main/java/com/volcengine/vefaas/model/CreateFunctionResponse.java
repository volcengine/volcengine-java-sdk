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
import com.volcengine.vefaas.model.EnvForCreateFunctionOutput;
import com.volcengine.vefaas.model.NasStorageForCreateFunctionOutput;
import com.volcengine.vefaas.model.TlsConfigForCreateFunctionOutput;
import com.volcengine.vefaas.model.TosMountConfigForCreateFunctionOutput;
import com.volcengine.vefaas.model.VpcConfigForCreateFunctionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateFunctionResponse
 */



public class CreateFunctionResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CodeSize")
  private Integer codeSize = null;

  @SerializedName("CodeSizeLimit")
  private Integer codeSizeLimit = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DebugInstanceEnable")
  private Boolean debugInstanceEnable = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Envs")
  private List<EnvForCreateFunctionOutput> envs = null;

  @SerializedName("ExclusiveMode")
  private Boolean exclusiveMode = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InitializerSec")
  private Integer initializerSec = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("LastUpdateTime")
  private String lastUpdateTime = null;

  @SerializedName("MaxConcurrency")
  private Integer maxConcurrency = null;

  @SerializedName("MemoryMB")
  private Integer memoryMB = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NasStorage")
  private NasStorageForCreateFunctionOutput nasStorage = null;

  @SerializedName("Owner")
  private String owner = null;

  @SerializedName("RequestTimeout")
  private Integer requestTimeout = null;

  @SerializedName("ResourcePoolId")
  private String resourcePoolId = null;

  @SerializedName("Runtime")
  private String runtime = null;

  @SerializedName("SourceLocation")
  private String sourceLocation = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("TlsConfig")
  private TlsConfigForCreateFunctionOutput tlsConfig = null;

  @SerializedName("TosMountConfig")
  private TosMountConfigForCreateFunctionOutput tosMountConfig = null;

  @SerializedName("TriggersCount")
  private Integer triggersCount = null;

  @SerializedName("UseStatus")
  private String useStatus = null;

  @SerializedName("VpcConfig")
  private VpcConfigForCreateFunctionOutput vpcConfig = null;

  public CreateFunctionResponse codeSize(Integer codeSize) {
    this.codeSize = codeSize;
    return this;
  }

   /**
   * Get codeSize
   * @return codeSize
  **/
  @Schema(description = "")
  public Integer getCodeSize() {
    return codeSize;
  }

  public void setCodeSize(Integer codeSize) {
    this.codeSize = codeSize;
  }

  public CreateFunctionResponse codeSizeLimit(Integer codeSizeLimit) {
    this.codeSizeLimit = codeSizeLimit;
    return this;
  }

   /**
   * Get codeSizeLimit
   * @return codeSizeLimit
  **/
  @Schema(description = "")
  public Integer getCodeSizeLimit() {
    return codeSizeLimit;
  }

  public void setCodeSizeLimit(Integer codeSizeLimit) {
    this.codeSizeLimit = codeSizeLimit;
  }

  public CreateFunctionResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public CreateFunctionResponse debugInstanceEnable(Boolean debugInstanceEnable) {
    this.debugInstanceEnable = debugInstanceEnable;
    return this;
  }

   /**
   * Get debugInstanceEnable
   * @return debugInstanceEnable
  **/
  @Schema(description = "")
  public Boolean isDebugInstanceEnable() {
    return debugInstanceEnable;
  }

  public void setDebugInstanceEnable(Boolean debugInstanceEnable) {
    this.debugInstanceEnable = debugInstanceEnable;
  }

  public CreateFunctionResponse description(String description) {
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

  public CreateFunctionResponse envs(List<EnvForCreateFunctionOutput> envs) {
    this.envs = envs;
    return this;
  }

  public CreateFunctionResponse addEnvsItem(EnvForCreateFunctionOutput envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<EnvForCreateFunctionOutput>();
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
  public List<EnvForCreateFunctionOutput> getEnvs() {
    return envs;
  }

  public void setEnvs(List<EnvForCreateFunctionOutput> envs) {
    this.envs = envs;
  }

  public CreateFunctionResponse exclusiveMode(Boolean exclusiveMode) {
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

  public CreateFunctionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateFunctionResponse initializerSec(Integer initializerSec) {
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

  public CreateFunctionResponse instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public CreateFunctionResponse lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Get lastUpdateTime
   * @return lastUpdateTime
  **/
  @Schema(description = "")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public CreateFunctionResponse maxConcurrency(Integer maxConcurrency) {
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

  public CreateFunctionResponse memoryMB(Integer memoryMB) {
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

  public CreateFunctionResponse name(String name) {
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

  public CreateFunctionResponse nasStorage(NasStorageForCreateFunctionOutput nasStorage) {
    this.nasStorage = nasStorage;
    return this;
  }

   /**
   * Get nasStorage
   * @return nasStorage
  **/
  @Valid
  @Schema(description = "")
  public NasStorageForCreateFunctionOutput getNasStorage() {
    return nasStorage;
  }

  public void setNasStorage(NasStorageForCreateFunctionOutput nasStorage) {
    this.nasStorage = nasStorage;
  }

  public CreateFunctionResponse owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public CreateFunctionResponse requestTimeout(Integer requestTimeout) {
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

  public CreateFunctionResponse resourcePoolId(String resourcePoolId) {
    this.resourcePoolId = resourcePoolId;
    return this;
  }

   /**
   * Get resourcePoolId
   * @return resourcePoolId
  **/
  @Schema(description = "")
  public String getResourcePoolId() {
    return resourcePoolId;
  }

  public void setResourcePoolId(String resourcePoolId) {
    this.resourcePoolId = resourcePoolId;
  }

  public CreateFunctionResponse runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @Schema(description = "")
  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public CreateFunctionResponse sourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

   /**
   * Get sourceLocation
   * @return sourceLocation
  **/
  @Schema(description = "")
  public String getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  public CreateFunctionResponse sourceType(String sourceType) {
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

  public CreateFunctionResponse tlsConfig(TlsConfigForCreateFunctionOutput tlsConfig) {
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @Valid
  @Schema(description = "")
  public TlsConfigForCreateFunctionOutput getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(TlsConfigForCreateFunctionOutput tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  public CreateFunctionResponse tosMountConfig(TosMountConfigForCreateFunctionOutput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
    return this;
  }

   /**
   * Get tosMountConfig
   * @return tosMountConfig
  **/
  @Valid
  @Schema(description = "")
  public TosMountConfigForCreateFunctionOutput getTosMountConfig() {
    return tosMountConfig;
  }

  public void setTosMountConfig(TosMountConfigForCreateFunctionOutput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
  }

  public CreateFunctionResponse triggersCount(Integer triggersCount) {
    this.triggersCount = triggersCount;
    return this;
  }

   /**
   * Get triggersCount
   * @return triggersCount
  **/
  @Schema(description = "")
  public Integer getTriggersCount() {
    return triggersCount;
  }

  public void setTriggersCount(Integer triggersCount) {
    this.triggersCount = triggersCount;
  }

  public CreateFunctionResponse useStatus(String useStatus) {
    this.useStatus = useStatus;
    return this;
  }

   /**
   * Get useStatus
   * @return useStatus
  **/
  @Schema(description = "")
  public String getUseStatus() {
    return useStatus;
  }

  public void setUseStatus(String useStatus) {
    this.useStatus = useStatus;
  }

  public CreateFunctionResponse vpcConfig(VpcConfigForCreateFunctionOutput vpcConfig) {
    this.vpcConfig = vpcConfig;
    return this;
  }

   /**
   * Get vpcConfig
   * @return vpcConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcConfigForCreateFunctionOutput getVpcConfig() {
    return vpcConfig;
  }

  public void setVpcConfig(VpcConfigForCreateFunctionOutput vpcConfig) {
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
    CreateFunctionResponse createFunctionResponse = (CreateFunctionResponse) o;
    return Objects.equals(this.codeSize, createFunctionResponse.codeSize) &&
        Objects.equals(this.codeSizeLimit, createFunctionResponse.codeSizeLimit) &&
        Objects.equals(this.creationTime, createFunctionResponse.creationTime) &&
        Objects.equals(this.debugInstanceEnable, createFunctionResponse.debugInstanceEnable) &&
        Objects.equals(this.description, createFunctionResponse.description) &&
        Objects.equals(this.envs, createFunctionResponse.envs) &&
        Objects.equals(this.exclusiveMode, createFunctionResponse.exclusiveMode) &&
        Objects.equals(this.id, createFunctionResponse.id) &&
        Objects.equals(this.initializerSec, createFunctionResponse.initializerSec) &&
        Objects.equals(this.instanceType, createFunctionResponse.instanceType) &&
        Objects.equals(this.lastUpdateTime, createFunctionResponse.lastUpdateTime) &&
        Objects.equals(this.maxConcurrency, createFunctionResponse.maxConcurrency) &&
        Objects.equals(this.memoryMB, createFunctionResponse.memoryMB) &&
        Objects.equals(this.name, createFunctionResponse.name) &&
        Objects.equals(this.nasStorage, createFunctionResponse.nasStorage) &&
        Objects.equals(this.owner, createFunctionResponse.owner) &&
        Objects.equals(this.requestTimeout, createFunctionResponse.requestTimeout) &&
        Objects.equals(this.resourcePoolId, createFunctionResponse.resourcePoolId) &&
        Objects.equals(this.runtime, createFunctionResponse.runtime) &&
        Objects.equals(this.sourceLocation, createFunctionResponse.sourceLocation) &&
        Objects.equals(this.sourceType, createFunctionResponse.sourceType) &&
        Objects.equals(this.tlsConfig, createFunctionResponse.tlsConfig) &&
        Objects.equals(this.tosMountConfig, createFunctionResponse.tosMountConfig) &&
        Objects.equals(this.triggersCount, createFunctionResponse.triggersCount) &&
        Objects.equals(this.useStatus, createFunctionResponse.useStatus) &&
        Objects.equals(this.vpcConfig, createFunctionResponse.vpcConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSize, codeSizeLimit, creationTime, debugInstanceEnable, description, envs, exclusiveMode, id, initializerSec, instanceType, lastUpdateTime, maxConcurrency, memoryMB, name, nasStorage, owner, requestTimeout, resourcePoolId, runtime, sourceLocation, sourceType, tlsConfig, tosMountConfig, triggersCount, useStatus, vpcConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFunctionResponse {\n");
    
    sb.append("    codeSize: ").append(toIndentedString(codeSize)).append("\n");
    sb.append("    codeSizeLimit: ").append(toIndentedString(codeSizeLimit)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    debugInstanceEnable: ").append(toIndentedString(debugInstanceEnable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    exclusiveMode: ").append(toIndentedString(exclusiveMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initializerSec: ").append(toIndentedString(initializerSec)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
    sb.append("    memoryMB: ").append(toIndentedString(memoryMB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nasStorage: ").append(toIndentedString(nasStorage)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    tosMountConfig: ").append(toIndentedString(tosMountConfig)).append("\n");
    sb.append("    triggersCount: ").append(toIndentedString(triggersCount)).append("\n");
    sb.append("    useStatus: ").append(toIndentedString(useStatus)).append("\n");
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
