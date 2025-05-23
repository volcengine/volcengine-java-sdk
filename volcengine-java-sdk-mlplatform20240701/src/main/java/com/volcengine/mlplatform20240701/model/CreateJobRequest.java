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
import com.volcengine.mlplatform20240701.model.DiagnoseConfigForCreateJobInput;
import com.volcengine.mlplatform20240701.model.ObservableConfigForCreateJobInput;
import com.volcengine.mlplatform20240701.model.ResourceConfigForCreateJobInput;
import com.volcengine.mlplatform20240701.model.RetryConfigForCreateJobInput;
import com.volcengine.mlplatform20240701.model.RuntimeConfigForCreateJobInput;
import com.volcengine.mlplatform20240701.model.StorageConfigForCreateJobInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateJobRequest
 */



public class CreateJobRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DiagnoseConfig")
  private List<DiagnoseConfigForCreateJobInput> diagnoseConfig = null;

  @SerializedName("DryRun")
  private Boolean dryRun = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ObservableConfig")
  private ObservableConfigForCreateJobInput observableConfig = null;

  @SerializedName("ResourceConfig")
  private ResourceConfigForCreateJobInput resourceConfig = null;

  @SerializedName("RetryConfig")
  private RetryConfigForCreateJobInput retryConfig = null;

  @SerializedName("RuntimeConfig")
  private RuntimeConfigForCreateJobInput runtimeConfig = null;

  @SerializedName("StorageConfig")
  private StorageConfigForCreateJobInput storageConfig = null;

  public CreateJobRequest description(String description) {
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

  public CreateJobRequest diagnoseConfig(List<DiagnoseConfigForCreateJobInput> diagnoseConfig) {
    this.diagnoseConfig = diagnoseConfig;
    return this;
  }

  public CreateJobRequest addDiagnoseConfigItem(DiagnoseConfigForCreateJobInput diagnoseConfigItem) {
    if (this.diagnoseConfig == null) {
      this.diagnoseConfig = new ArrayList<DiagnoseConfigForCreateJobInput>();
    }
    this.diagnoseConfig.add(diagnoseConfigItem);
    return this;
  }

   /**
   * Get diagnoseConfig
   * @return diagnoseConfig
  **/
  @Valid
  @Schema(description = "")
  public List<DiagnoseConfigForCreateJobInput> getDiagnoseConfig() {
    return diagnoseConfig;
  }

  public void setDiagnoseConfig(List<DiagnoseConfigForCreateJobInput> diagnoseConfig) {
    this.diagnoseConfig = diagnoseConfig;
  }

  public CreateJobRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @Schema(description = "")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public CreateJobRequest name(String name) {
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

  public CreateJobRequest observableConfig(ObservableConfigForCreateJobInput observableConfig) {
    this.observableConfig = observableConfig;
    return this;
  }

   /**
   * Get observableConfig
   * @return observableConfig
  **/
  @Valid
  @Schema(description = "")
  public ObservableConfigForCreateJobInput getObservableConfig() {
    return observableConfig;
  }

  public void setObservableConfig(ObservableConfigForCreateJobInput observableConfig) {
    this.observableConfig = observableConfig;
  }

  public CreateJobRequest resourceConfig(ResourceConfigForCreateJobInput resourceConfig) {
    this.resourceConfig = resourceConfig;
    return this;
  }

   /**
   * Get resourceConfig
   * @return resourceConfig
  **/
  @Valid
  @Schema(description = "")
  public ResourceConfigForCreateJobInput getResourceConfig() {
    return resourceConfig;
  }

  public void setResourceConfig(ResourceConfigForCreateJobInput resourceConfig) {
    this.resourceConfig = resourceConfig;
  }

  public CreateJobRequest retryConfig(RetryConfigForCreateJobInput retryConfig) {
    this.retryConfig = retryConfig;
    return this;
  }

   /**
   * Get retryConfig
   * @return retryConfig
  **/
  @Valid
  @Schema(description = "")
  public RetryConfigForCreateJobInput getRetryConfig() {
    return retryConfig;
  }

  public void setRetryConfig(RetryConfigForCreateJobInput retryConfig) {
    this.retryConfig = retryConfig;
  }

  public CreateJobRequest runtimeConfig(RuntimeConfigForCreateJobInput runtimeConfig) {
    this.runtimeConfig = runtimeConfig;
    return this;
  }

   /**
   * Get runtimeConfig
   * @return runtimeConfig
  **/
  @Valid
  @Schema(description = "")
  public RuntimeConfigForCreateJobInput getRuntimeConfig() {
    return runtimeConfig;
  }

  public void setRuntimeConfig(RuntimeConfigForCreateJobInput runtimeConfig) {
    this.runtimeConfig = runtimeConfig;
  }

  public CreateJobRequest storageConfig(StorageConfigForCreateJobInput storageConfig) {
    this.storageConfig = storageConfig;
    return this;
  }

   /**
   * Get storageConfig
   * @return storageConfig
  **/
  @Valid
  @Schema(description = "")
  public StorageConfigForCreateJobInput getStorageConfig() {
    return storageConfig;
  }

  public void setStorageConfig(StorageConfigForCreateJobInput storageConfig) {
    this.storageConfig = storageConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateJobRequest createJobRequest = (CreateJobRequest) o;
    return Objects.equals(this.description, createJobRequest.description) &&
        Objects.equals(this.diagnoseConfig, createJobRequest.diagnoseConfig) &&
        Objects.equals(this.dryRun, createJobRequest.dryRun) &&
        Objects.equals(this.name, createJobRequest.name) &&
        Objects.equals(this.observableConfig, createJobRequest.observableConfig) &&
        Objects.equals(this.resourceConfig, createJobRequest.resourceConfig) &&
        Objects.equals(this.retryConfig, createJobRequest.retryConfig) &&
        Objects.equals(this.runtimeConfig, createJobRequest.runtimeConfig) &&
        Objects.equals(this.storageConfig, createJobRequest.storageConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, diagnoseConfig, dryRun, name, observableConfig, resourceConfig, retryConfig, runtimeConfig, storageConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateJobRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    diagnoseConfig: ").append(toIndentedString(diagnoseConfig)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    observableConfig: ").append(toIndentedString(observableConfig)).append("\n");
    sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
    sb.append("    retryConfig: ").append(toIndentedString(retryConfig)).append("\n");
    sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
    sb.append("    storageConfig: ").append(toIndentedString(storageConfig)).append("\n");
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
