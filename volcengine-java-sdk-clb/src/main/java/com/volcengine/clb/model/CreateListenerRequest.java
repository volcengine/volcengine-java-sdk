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
import com.volcengine.clb.model.HealthCheckForCreateListenerInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateListenerRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:20.753228+08:00[Asia/Shanghai]")
public class CreateListenerRequest {
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
  private HealthCheckForCreateListenerInput healthCheck = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("Scheduler")
  private String scheduler = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  public CreateListenerRequest aclIds(List<String> aclIds) {
    this.aclIds = aclIds;
    return this;
  }

  public CreateListenerRequest addAclIdsItem(String aclIdsItem) {
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

  public CreateListenerRequest aclStatus(String aclStatus) {
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

  public CreateListenerRequest aclType(String aclType) {
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

  public CreateListenerRequest certificateId(String certificateId) {
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

  public CreateListenerRequest description(String description) {
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

  public CreateListenerRequest enabled(String enabled) {
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

  public CreateListenerRequest establishedTimeout(Integer establishedTimeout) {
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

  public CreateListenerRequest healthCheck(HealthCheckForCreateListenerInput healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckForCreateListenerInput getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthCheckForCreateListenerInput healthCheck) {
    this.healthCheck = healthCheck;
  }

  public CreateListenerRequest listenerName(String listenerName) {
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

  public CreateListenerRequest loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public CreateListenerRequest port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public CreateListenerRequest protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public CreateListenerRequest scheduler(String scheduler) {
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

  public CreateListenerRequest serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
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
    CreateListenerRequest createListenerRequest = (CreateListenerRequest) o;
    return Objects.equals(this.aclIds, createListenerRequest.aclIds) &&
        Objects.equals(this.aclStatus, createListenerRequest.aclStatus) &&
        Objects.equals(this.aclType, createListenerRequest.aclType) &&
        Objects.equals(this.certificateId, createListenerRequest.certificateId) &&
        Objects.equals(this.description, createListenerRequest.description) &&
        Objects.equals(this.enabled, createListenerRequest.enabled) &&
        Objects.equals(this.establishedTimeout, createListenerRequest.establishedTimeout) &&
        Objects.equals(this.healthCheck, createListenerRequest.healthCheck) &&
        Objects.equals(this.listenerName, createListenerRequest.listenerName) &&
        Objects.equals(this.loadBalancerId, createListenerRequest.loadBalancerId) &&
        Objects.equals(this.port, createListenerRequest.port) &&
        Objects.equals(this.protocol, createListenerRequest.protocol) &&
        Objects.equals(this.scheduler, createListenerRequest.scheduler) &&
        Objects.equals(this.serverGroupId, createListenerRequest.serverGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclIds, aclStatus, aclType, certificateId, description, enabled, establishedTimeout, healthCheck, listenerName, loadBalancerId, port, protocol, scheduler, serverGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateListenerRequest {\n");
    
    sb.append("    aclIds: ").append(toIndentedString(aclIds)).append("\n");
    sb.append("    aclStatus: ").append(toIndentedString(aclStatus)).append("\n");
    sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    establishedTimeout: ").append(toIndentedString(establishedTimeout)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
