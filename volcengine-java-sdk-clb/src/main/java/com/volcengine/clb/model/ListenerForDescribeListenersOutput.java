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
import com.volcengine.clb.model.HealthCheckForDescribeListenersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListenerForDescribeListenersOutput
 */


public class ListenerForDescribeListenersOutput {
  @SerializedName("AclIds")
  private List<String> aclIds = null;

  @SerializedName("AclStatus")
  private String aclStatus = null;

  @SerializedName("AclType")
  private String aclType = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("ConnectionDrainEnabled")
  private String connectionDrainEnabled = null;

  @SerializedName("ConnectionDrainTimeout")
  private Integer connectionDrainTimeout = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("HealthCheck")
  private HealthCheckForDescribeListenersOutput healthCheck = null;

  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("PersistenceTimeout")
  private Integer persistenceTimeout = null;

  @SerializedName("PersistenceType")
  private String persistenceType = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("ProxyProtocolType")
  private String proxyProtocolType = null;

  @SerializedName("Scheduler")
  private String scheduler = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public ListenerForDescribeListenersOutput aclIds(List<String> aclIds) {
    this.aclIds = aclIds;
    return this;
  }

  public ListenerForDescribeListenersOutput addAclIdsItem(String aclIdsItem) {
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

  public ListenerForDescribeListenersOutput aclStatus(String aclStatus) {
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

  public ListenerForDescribeListenersOutput aclType(String aclType) {
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

  public ListenerForDescribeListenersOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public ListenerForDescribeListenersOutput certificateId(String certificateId) {
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

  public ListenerForDescribeListenersOutput connectionDrainEnabled(String connectionDrainEnabled) {
    this.connectionDrainEnabled = connectionDrainEnabled;
    return this;
  }

   /**
   * Get connectionDrainEnabled
   * @return connectionDrainEnabled
  **/
  @Schema(description = "")
  public String getConnectionDrainEnabled() {
    return connectionDrainEnabled;
  }

  public void setConnectionDrainEnabled(String connectionDrainEnabled) {
    this.connectionDrainEnabled = connectionDrainEnabled;
  }

  public ListenerForDescribeListenersOutput connectionDrainTimeout(Integer connectionDrainTimeout) {
    this.connectionDrainTimeout = connectionDrainTimeout;
    return this;
  }

   /**
   * Get connectionDrainTimeout
   * @return connectionDrainTimeout
  **/
  @Schema(description = "")
  public Integer getConnectionDrainTimeout() {
    return connectionDrainTimeout;
  }

  public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
    this.connectionDrainTimeout = connectionDrainTimeout;
  }

  public ListenerForDescribeListenersOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ListenerForDescribeListenersOutput enabled(String enabled) {
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

  public ListenerForDescribeListenersOutput healthCheck(HealthCheckForDescribeListenersOutput healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckForDescribeListenersOutput getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthCheckForDescribeListenersOutput healthCheck) {
    this.healthCheck = healthCheck;
  }

  public ListenerForDescribeListenersOutput listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @Schema(description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public ListenerForDescribeListenersOutput listenerName(String listenerName) {
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

  public ListenerForDescribeListenersOutput persistenceTimeout(Integer persistenceTimeout) {
    this.persistenceTimeout = persistenceTimeout;
    return this;
  }

   /**
   * Get persistenceTimeout
   * @return persistenceTimeout
  **/
  @Schema(description = "")
  public Integer getPersistenceTimeout() {
    return persistenceTimeout;
  }

  public void setPersistenceTimeout(Integer persistenceTimeout) {
    this.persistenceTimeout = persistenceTimeout;
  }

  public ListenerForDescribeListenersOutput persistenceType(String persistenceType) {
    this.persistenceType = persistenceType;
    return this;
  }

   /**
   * Get persistenceType
   * @return persistenceType
  **/
  @Schema(description = "")
  public String getPersistenceType() {
    return persistenceType;
  }

  public void setPersistenceType(String persistenceType) {
    this.persistenceType = persistenceType;
  }

  public ListenerForDescribeListenersOutput port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ListenerForDescribeListenersOutput protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public ListenerForDescribeListenersOutput proxyProtocolType(String proxyProtocolType) {
    this.proxyProtocolType = proxyProtocolType;
    return this;
  }

   /**
   * Get proxyProtocolType
   * @return proxyProtocolType
  **/
  @Schema(description = "")
  public String getProxyProtocolType() {
    return proxyProtocolType;
  }

  public void setProxyProtocolType(String proxyProtocolType) {
    this.proxyProtocolType = proxyProtocolType;
  }

  public ListenerForDescribeListenersOutput scheduler(String scheduler) {
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

  public ListenerForDescribeListenersOutput serverGroupId(String serverGroupId) {
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

  public ListenerForDescribeListenersOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ListenerForDescribeListenersOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListenerForDescribeListenersOutput listenerForDescribeListenersOutput = (ListenerForDescribeListenersOutput) o;
    return Objects.equals(this.aclIds, listenerForDescribeListenersOutput.aclIds) &&
        Objects.equals(this.aclStatus, listenerForDescribeListenersOutput.aclStatus) &&
        Objects.equals(this.aclType, listenerForDescribeListenersOutput.aclType) &&
        Objects.equals(this.bandwidth, listenerForDescribeListenersOutput.bandwidth) &&
        Objects.equals(this.certificateId, listenerForDescribeListenersOutput.certificateId) &&
        Objects.equals(this.connectionDrainEnabled, listenerForDescribeListenersOutput.connectionDrainEnabled) &&
        Objects.equals(this.connectionDrainTimeout, listenerForDescribeListenersOutput.connectionDrainTimeout) &&
        Objects.equals(this.createTime, listenerForDescribeListenersOutput.createTime) &&
        Objects.equals(this.enabled, listenerForDescribeListenersOutput.enabled) &&
        Objects.equals(this.healthCheck, listenerForDescribeListenersOutput.healthCheck) &&
        Objects.equals(this.listenerId, listenerForDescribeListenersOutput.listenerId) &&
        Objects.equals(this.listenerName, listenerForDescribeListenersOutput.listenerName) &&
        Objects.equals(this.persistenceTimeout, listenerForDescribeListenersOutput.persistenceTimeout) &&
        Objects.equals(this.persistenceType, listenerForDescribeListenersOutput.persistenceType) &&
        Objects.equals(this.port, listenerForDescribeListenersOutput.port) &&
        Objects.equals(this.protocol, listenerForDescribeListenersOutput.protocol) &&
        Objects.equals(this.proxyProtocolType, listenerForDescribeListenersOutput.proxyProtocolType) &&
        Objects.equals(this.scheduler, listenerForDescribeListenersOutput.scheduler) &&
        Objects.equals(this.serverGroupId, listenerForDescribeListenersOutput.serverGroupId) &&
        Objects.equals(this.status, listenerForDescribeListenersOutput.status) &&
        Objects.equals(this.updateTime, listenerForDescribeListenersOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclIds, aclStatus, aclType, bandwidth, certificateId, connectionDrainEnabled, connectionDrainTimeout, createTime, enabled, healthCheck, listenerId, listenerName, persistenceTimeout, persistenceType, port, protocol, proxyProtocolType, scheduler, serverGroupId, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenerForDescribeListenersOutput {\n");
    
    sb.append("    aclIds: ").append(toIndentedString(aclIds)).append("\n");
    sb.append("    aclStatus: ").append(toIndentedString(aclStatus)).append("\n");
    sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    connectionDrainEnabled: ").append(toIndentedString(connectionDrainEnabled)).append("\n");
    sb.append("    connectionDrainTimeout: ").append(toIndentedString(connectionDrainTimeout)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    persistenceTimeout: ").append(toIndentedString(persistenceTimeout)).append("\n");
    sb.append("    persistenceType: ").append(toIndentedString(persistenceType)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    proxyProtocolType: ").append(toIndentedString(proxyProtocolType)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
