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
import com.volcengine.vefaas.model.EnvForListRevisionsOutput;
import com.volcengine.vefaas.model.HealthCheckConfigForListRevisionsOutput;
import com.volcengine.vefaas.model.NasStorageForListRevisionsOutput;
import com.volcengine.vefaas.model.TlsConfigForListRevisionsOutput;
import com.volcengine.vefaas.model.TosMountConfigForListRevisionsOutput;
import com.volcengine.vefaas.model.VpcConfigForListRevisionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListRevisionsOutput
 */



public class ItemForListRevisionsOutput {
  @SerializedName("CodeSize")
  private Integer codeSize = null;

  @SerializedName("CodeSizeLimit")
  private Integer codeSizeLimit = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Envs")
  private List<EnvForListRevisionsOutput> envs = null;

  @SerializedName("ExclusiveMode")
  private Boolean exclusiveMode = null;

  @SerializedName("HealthCheckConfig")
  private HealthCheckConfigForListRevisionsOutput healthCheckConfig = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InitializerSec")
  private Integer initializerSec = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("MaxConcurrency")
  private Integer maxConcurrency = null;

  @SerializedName("MaxReplicas")
  private Integer maxReplicas = null;

  @SerializedName("MemoryMB")
  private Integer memoryMB = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NasStorage")
  private NasStorageForListRevisionsOutput nasStorage = null;

  @SerializedName("RequestTimeout")
  private Integer requestTimeout = null;

  @SerializedName("RevisionCreationTime")
  private String revisionCreationTime = null;

  @SerializedName("RevisionDescription")
  private String revisionDescription = null;

  @SerializedName("RevisionNumber")
  private Integer revisionNumber = null;

  @SerializedName("Runtime")
  private String runtime = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("SourceLocation")
  private String sourceLocation = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("TlsConfig")
  private TlsConfigForListRevisionsOutput tlsConfig = null;

  @SerializedName("TosMountConfig")
  private TosMountConfigForListRevisionsOutput tosMountConfig = null;

  @SerializedName("VpcConfig")
  private VpcConfigForListRevisionsOutput vpcConfig = null;

  public ItemForListRevisionsOutput codeSize(Integer codeSize) {
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

  public ItemForListRevisionsOutput codeSizeLimit(Integer codeSizeLimit) {
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

  public ItemForListRevisionsOutput creationTime(String creationTime) {
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

  public ItemForListRevisionsOutput description(String description) {
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

  public ItemForListRevisionsOutput envs(List<EnvForListRevisionsOutput> envs) {
    this.envs = envs;
    return this;
  }

  public ItemForListRevisionsOutput addEnvsItem(EnvForListRevisionsOutput envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<EnvForListRevisionsOutput>();
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
  public List<EnvForListRevisionsOutput> getEnvs() {
    return envs;
  }

  public void setEnvs(List<EnvForListRevisionsOutput> envs) {
    this.envs = envs;
  }

  public ItemForListRevisionsOutput exclusiveMode(Boolean exclusiveMode) {
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

  public ItemForListRevisionsOutput healthCheckConfig(HealthCheckConfigForListRevisionsOutput healthCheckConfig) {
    this.healthCheckConfig = healthCheckConfig;
    return this;
  }

   /**
   * Get healthCheckConfig
   * @return healthCheckConfig
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckConfigForListRevisionsOutput getHealthCheckConfig() {
    return healthCheckConfig;
  }

  public void setHealthCheckConfig(HealthCheckConfigForListRevisionsOutput healthCheckConfig) {
    this.healthCheckConfig = healthCheckConfig;
  }

  public ItemForListRevisionsOutput id(String id) {
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

  public ItemForListRevisionsOutput initializerSec(Integer initializerSec) {
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

  public ItemForListRevisionsOutput instanceType(String instanceType) {
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

  public ItemForListRevisionsOutput maxConcurrency(Integer maxConcurrency) {
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

  public ItemForListRevisionsOutput maxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * Get maxReplicas
   * @return maxReplicas
  **/
  @Schema(description = "")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public ItemForListRevisionsOutput memoryMB(Integer memoryMB) {
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

  public ItemForListRevisionsOutput name(String name) {
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

  public ItemForListRevisionsOutput nasStorage(NasStorageForListRevisionsOutput nasStorage) {
    this.nasStorage = nasStorage;
    return this;
  }

   /**
   * Get nasStorage
   * @return nasStorage
  **/
  @Valid
  @Schema(description = "")
  public NasStorageForListRevisionsOutput getNasStorage() {
    return nasStorage;
  }

  public void setNasStorage(NasStorageForListRevisionsOutput nasStorage) {
    this.nasStorage = nasStorage;
  }

  public ItemForListRevisionsOutput requestTimeout(Integer requestTimeout) {
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

  public ItemForListRevisionsOutput revisionCreationTime(String revisionCreationTime) {
    this.revisionCreationTime = revisionCreationTime;
    return this;
  }

   /**
   * Get revisionCreationTime
   * @return revisionCreationTime
  **/
  @Schema(description = "")
  public String getRevisionCreationTime() {
    return revisionCreationTime;
  }

  public void setRevisionCreationTime(String revisionCreationTime) {
    this.revisionCreationTime = revisionCreationTime;
  }

  public ItemForListRevisionsOutput revisionDescription(String revisionDescription) {
    this.revisionDescription = revisionDescription;
    return this;
  }

   /**
   * Get revisionDescription
   * @return revisionDescription
  **/
  @Schema(description = "")
  public String getRevisionDescription() {
    return revisionDescription;
  }

  public void setRevisionDescription(String revisionDescription) {
    this.revisionDescription = revisionDescription;
  }

  public ItemForListRevisionsOutput revisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
    return this;
  }

   /**
   * Get revisionNumber
   * @return revisionNumber
  **/
  @Schema(description = "")
  public Integer getRevisionNumber() {
    return revisionNumber;
  }

  public void setRevisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
  }

  public ItemForListRevisionsOutput runtime(String runtime) {
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

  public ItemForListRevisionsOutput source(String source) {
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

  public ItemForListRevisionsOutput sourceLocation(String sourceLocation) {
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

  public ItemForListRevisionsOutput sourceType(String sourceType) {
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

  public ItemForListRevisionsOutput tlsConfig(TlsConfigForListRevisionsOutput tlsConfig) {
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @Valid
  @Schema(description = "")
  public TlsConfigForListRevisionsOutput getTlsConfig() {
    return tlsConfig;
  }

  public void setTlsConfig(TlsConfigForListRevisionsOutput tlsConfig) {
    this.tlsConfig = tlsConfig;
  }

  public ItemForListRevisionsOutput tosMountConfig(TosMountConfigForListRevisionsOutput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
    return this;
  }

   /**
   * Get tosMountConfig
   * @return tosMountConfig
  **/
  @Valid
  @Schema(description = "")
  public TosMountConfigForListRevisionsOutput getTosMountConfig() {
    return tosMountConfig;
  }

  public void setTosMountConfig(TosMountConfigForListRevisionsOutput tosMountConfig) {
    this.tosMountConfig = tosMountConfig;
  }

  public ItemForListRevisionsOutput vpcConfig(VpcConfigForListRevisionsOutput vpcConfig) {
    this.vpcConfig = vpcConfig;
    return this;
  }

   /**
   * Get vpcConfig
   * @return vpcConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcConfigForListRevisionsOutput getVpcConfig() {
    return vpcConfig;
  }

  public void setVpcConfig(VpcConfigForListRevisionsOutput vpcConfig) {
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
    ItemForListRevisionsOutput itemForListRevisionsOutput = (ItemForListRevisionsOutput) o;
    return Objects.equals(this.codeSize, itemForListRevisionsOutput.codeSize) &&
        Objects.equals(this.codeSizeLimit, itemForListRevisionsOutput.codeSizeLimit) &&
        Objects.equals(this.creationTime, itemForListRevisionsOutput.creationTime) &&
        Objects.equals(this.description, itemForListRevisionsOutput.description) &&
        Objects.equals(this.envs, itemForListRevisionsOutput.envs) &&
        Objects.equals(this.exclusiveMode, itemForListRevisionsOutput.exclusiveMode) &&
        Objects.equals(this.healthCheckConfig, itemForListRevisionsOutput.healthCheckConfig) &&
        Objects.equals(this.id, itemForListRevisionsOutput.id) &&
        Objects.equals(this.initializerSec, itemForListRevisionsOutput.initializerSec) &&
        Objects.equals(this.instanceType, itemForListRevisionsOutput.instanceType) &&
        Objects.equals(this.maxConcurrency, itemForListRevisionsOutput.maxConcurrency) &&
        Objects.equals(this.maxReplicas, itemForListRevisionsOutput.maxReplicas) &&
        Objects.equals(this.memoryMB, itemForListRevisionsOutput.memoryMB) &&
        Objects.equals(this.name, itemForListRevisionsOutput.name) &&
        Objects.equals(this.nasStorage, itemForListRevisionsOutput.nasStorage) &&
        Objects.equals(this.requestTimeout, itemForListRevisionsOutput.requestTimeout) &&
        Objects.equals(this.revisionCreationTime, itemForListRevisionsOutput.revisionCreationTime) &&
        Objects.equals(this.revisionDescription, itemForListRevisionsOutput.revisionDescription) &&
        Objects.equals(this.revisionNumber, itemForListRevisionsOutput.revisionNumber) &&
        Objects.equals(this.runtime, itemForListRevisionsOutput.runtime) &&
        Objects.equals(this.source, itemForListRevisionsOutput.source) &&
        Objects.equals(this.sourceLocation, itemForListRevisionsOutput.sourceLocation) &&
        Objects.equals(this.sourceType, itemForListRevisionsOutput.sourceType) &&
        Objects.equals(this.tlsConfig, itemForListRevisionsOutput.tlsConfig) &&
        Objects.equals(this.tosMountConfig, itemForListRevisionsOutput.tosMountConfig) &&
        Objects.equals(this.vpcConfig, itemForListRevisionsOutput.vpcConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSize, codeSizeLimit, creationTime, description, envs, exclusiveMode, healthCheckConfig, id, initializerSec, instanceType, maxConcurrency, maxReplicas, memoryMB, name, nasStorage, requestTimeout, revisionCreationTime, revisionDescription, revisionNumber, runtime, source, sourceLocation, sourceType, tlsConfig, tosMountConfig, vpcConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListRevisionsOutput {\n");
    
    sb.append("    codeSize: ").append(toIndentedString(codeSize)).append("\n");
    sb.append("    codeSizeLimit: ").append(toIndentedString(codeSizeLimit)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    exclusiveMode: ").append(toIndentedString(exclusiveMode)).append("\n");
    sb.append("    healthCheckConfig: ").append(toIndentedString(healthCheckConfig)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initializerSec: ").append(toIndentedString(initializerSec)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    memoryMB: ").append(toIndentedString(memoryMB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nasStorage: ").append(toIndentedString(nasStorage)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    revisionCreationTime: ").append(toIndentedString(revisionCreationTime)).append("\n");
    sb.append("    revisionDescription: ").append(toIndentedString(revisionDescription)).append("\n");
    sb.append("    revisionNumber: ").append(toIndentedString(revisionNumber)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
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
