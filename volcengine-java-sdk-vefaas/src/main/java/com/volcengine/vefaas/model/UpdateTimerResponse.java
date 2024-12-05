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
 * UpdateTimerResponse
 */



public class UpdateTimerResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Crontab")
  private String crontab = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EnableConcurrency")
  private Boolean enableConcurrency = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("FunctionId")
  private String functionId = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("LastUpdateTime")
  private String lastUpdateTime = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Payload")
  private String payload = null;

  @SerializedName("Retries")
  private Integer retries = null;

  public UpdateTimerResponse creationTime(String creationTime) {
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

  public UpdateTimerResponse crontab(String crontab) {
    this.crontab = crontab;
    return this;
  }

   /**
   * Get crontab
   * @return crontab
  **/
  @Schema(description = "")
  public String getCrontab() {
    return crontab;
  }

  public void setCrontab(String crontab) {
    this.crontab = crontab;
  }

  public UpdateTimerResponse description(String description) {
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

  public UpdateTimerResponse enableConcurrency(Boolean enableConcurrency) {
    this.enableConcurrency = enableConcurrency;
    return this;
  }

   /**
   * Get enableConcurrency
   * @return enableConcurrency
  **/
  @Schema(description = "")
  public Boolean isEnableConcurrency() {
    return enableConcurrency;
  }

  public void setEnableConcurrency(Boolean enableConcurrency) {
    this.enableConcurrency = enableConcurrency;
  }

  public UpdateTimerResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UpdateTimerResponse functionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

   /**
   * Get functionId
   * @return functionId
  **/
  @Schema(description = "")
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  public UpdateTimerResponse id(String id) {
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

  public UpdateTimerResponse lastUpdateTime(String lastUpdateTime) {
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

  public UpdateTimerResponse name(String name) {
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

  public UpdateTimerResponse payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @Schema(description = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public UpdateTimerResponse retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @Schema(description = "")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimerResponse updateTimerResponse = (UpdateTimerResponse) o;
    return Objects.equals(this.creationTime, updateTimerResponse.creationTime) &&
        Objects.equals(this.crontab, updateTimerResponse.crontab) &&
        Objects.equals(this.description, updateTimerResponse.description) &&
        Objects.equals(this.enableConcurrency, updateTimerResponse.enableConcurrency) &&
        Objects.equals(this.enabled, updateTimerResponse.enabled) &&
        Objects.equals(this.functionId, updateTimerResponse.functionId) &&
        Objects.equals(this.id, updateTimerResponse.id) &&
        Objects.equals(this.lastUpdateTime, updateTimerResponse.lastUpdateTime) &&
        Objects.equals(this.name, updateTimerResponse.name) &&
        Objects.equals(this.payload, updateTimerResponse.payload) &&
        Objects.equals(this.retries, updateTimerResponse.retries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, crontab, description, enableConcurrency, enabled, functionId, id, lastUpdateTime, name, payload, retries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimerResponse {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    crontab: ").append(toIndentedString(crontab)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableConcurrency: ").append(toIndentedString(enableConcurrency)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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
