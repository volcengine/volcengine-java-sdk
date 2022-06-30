/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.HealthCheckForModifyListenerAttributesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyListenerAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T19:55:03.376515+08:00[Asia/Shanghai]")
public class ModifyListenerAttributesRequest {
  @SerializedName("AclIds")
  private List<String> aclIds = null;

  @SerializedName("AclStatus")
  private String aclStatus = null;

  @SerializedName("AclType")
  private String aclType = null;

  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("EstablishedTimeout")
  private Integer establishedTimeout = null;

  @SerializedName("HealthCheck")
  private HealthCheckForModifyListenerAttributesInput healthCheck = null;

  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("Scheduler")
  private String scheduler = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  public ModifyListenerAttributesRequest aclIds(List<String> aclIds) {
    this.aclIds = aclIds;
    return this;
  }

  public ModifyListenerAttributesRequest addAclIdsItem(String aclIdsItem) {
    if (this.aclIds == null) {
      this.aclIds = new ArrayList<String>();
    }
    this.aclIds.add(aclIdsItem);
    return this;
  }

   /**
   * Get aclIds
   * @return aclIds
  **/
  @Schema(description = "")
  public List<String> getAclIds() {
    return aclIds;
  }

  public void setAclIds(List<String> aclIds) {
    this.aclIds = aclIds;
  }

  public ModifyListenerAttributesRequest aclStatus(String aclStatus) {
    this.aclStatus = aclStatus;
    return this;
  }

   /**
   * Get aclStatus
   * @return aclStatus
  **/
  @Schema(description = "")
  public String getAclStatus() {
    return aclStatus;
  }

  public void setAclStatus(String aclStatus) {
    this.aclStatus = aclStatus;
  }

  public ModifyListenerAttributesRequest aclType(String aclType) {
    this.aclType = aclType;
    return this;
  }

   /**
   * Get aclType
   * @return aclType
  **/
  @Schema(description = "")
  public String getAclType() {
    return aclType;
  }

  public void setAclType(String aclType) {
    this.aclType = aclType;
  }

  public ModifyListenerAttributesRequest certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Get certificateId
   * @return certificateId
  **/
  @Schema(description = "")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public ModifyListenerAttributesRequest description(String description) {
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

  public ModifyListenerAttributesRequest enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public ModifyListenerAttributesRequest establishedTimeout(Integer establishedTimeout) {
    this.establishedTimeout = establishedTimeout;
    return this;
  }

   /**
   * Get establishedTimeout
   * @return establishedTimeout
  **/
  @Schema(description = "")
  public Integer getEstablishedTimeout() {
    return establishedTimeout;
  }

  public void setEstablishedTimeout(Integer establishedTimeout) {
    this.establishedTimeout = establishedTimeout;
  }

  public ModifyListenerAttributesRequest healthCheck(HealthCheckForModifyListenerAttributesInput healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckForModifyListenerAttributesInput getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthCheckForModifyListenerAttributesInput healthCheck) {
    this.healthCheck = healthCheck;
  }

  public ModifyListenerAttributesRequest listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public ModifyListenerAttributesRequest listenerName(String listenerName) {
    this.listenerName = listenerName;
    return this;
  }

   /**
   * Get listenerName
   * @return listenerName
  **/
  @Schema(description = "")
  public String getListenerName() {
    return listenerName;
  }

  public void setListenerName(String listenerName) {
    this.listenerName = listenerName;
  }

  public ModifyListenerAttributesRequest scheduler(String scheduler) {
    this.scheduler = scheduler;
    return this;
  }

   /**
   * Get scheduler
   * @return scheduler
  **/
  @Schema(description = "")
  public String getScheduler() {
    return scheduler;
  }

  public void setScheduler(String scheduler) {
    this.scheduler = scheduler;
  }

  public ModifyListenerAttributesRequest serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyListenerAttributesRequest modifyListenerAttributesRequest = (ModifyListenerAttributesRequest) o;
    return Objects.equals(this.aclIds, modifyListenerAttributesRequest.aclIds) &&
        Objects.equals(this.aclStatus, modifyListenerAttributesRequest.aclStatus) &&
        Objects.equals(this.aclType, modifyListenerAttributesRequest.aclType) &&
        Objects.equals(this.certificateId, modifyListenerAttributesRequest.certificateId) &&
        Objects.equals(this.description, modifyListenerAttributesRequest.description) &&
        Objects.equals(this.enabled, modifyListenerAttributesRequest.enabled) &&
        Objects.equals(this.establishedTimeout, modifyListenerAttributesRequest.establishedTimeout) &&
        Objects.equals(this.healthCheck, modifyListenerAttributesRequest.healthCheck) &&
        Objects.equals(this.listenerId, modifyListenerAttributesRequest.listenerId) &&
        Objects.equals(this.listenerName, modifyListenerAttributesRequest.listenerName) &&
        Objects.equals(this.scheduler, modifyListenerAttributesRequest.scheduler) &&
        Objects.equals(this.serverGroupId, modifyListenerAttributesRequest.serverGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclIds, aclStatus, aclType, certificateId, description, enabled, establishedTimeout, healthCheck, listenerId, listenerName, scheduler, serverGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyListenerAttributesRequest {\n");
    
    sb.append("    aclIds: ").append(toIndentedString(aclIds)).append("\n");
    sb.append("    aclStatus: ").append(toIndentedString(aclStatus)).append("\n");
    sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    establishedTimeout: ").append(toIndentedString(establishedTimeout)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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
