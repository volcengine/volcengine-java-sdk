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
import com.volcengine.clb.model.HealthCheckForDescribeListenerAttributesOutput;
import com.volcengine.clb.model.TagForDescribeListenerAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeListenerAttributesResponse
 */



public class DescribeListenerAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AclIds")
  private List<String> aclIds = null;

  @SerializedName("AclStatus")
  private String aclStatus = null;

  @SerializedName("AclType")
  private String aclType = null;

  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("CACertificateId")
  private String caCertificateId = null;

  @SerializedName("CAEnabled")
  private String caEnabled = null;

  @SerializedName("CertCenterCertificateId")
  private String certCenterCertificateId = null;

  @SerializedName("CertificateId")
  private String certificateId = null;

  @SerializedName("CertificateSource")
  private String certificateSource = null;

  @SerializedName("ClientBodyTimeout")
  private Integer clientBodyTimeout = null;

  @SerializedName("ClientHeaderTimeout")
  private Integer clientHeaderTimeout = null;

  @SerializedName("ConnectionDrainEnabled")
  private String connectionDrainEnabled = null;

  @SerializedName("ConnectionDrainTimeout")
  private Integer connectionDrainTimeout = null;

  @SerializedName("Cookie")
  private String cookie = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Enabled")
  private String enabled = null;

  @SerializedName("EndPort")
  private Integer endPort = null;

  @SerializedName("EstablishedTimeout")
  private Integer establishedTimeout = null;

  @SerializedName("HealthCheck")
  private HealthCheckForDescribeListenerAttributesOutput healthCheck = null;

  @SerializedName("Http2Enabled")
  private String http2Enabled = null;

  @SerializedName("KeepaliveTimeout")
  private Integer keepaliveTimeout = null;

  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("PersistenceTimeout")
  private Integer persistenceTimeout = null;

  @SerializedName("PersistenceType")
  private String persistenceType = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("ProxyConnectTimeout")
  private Integer proxyConnectTimeout = null;

  @SerializedName("ProxyProtocolType")
  private String proxyProtocolType = null;

  @SerializedName("ProxyReadTimeout")
  private Integer proxyReadTimeout = null;

  @SerializedName("ProxySendTimeout")
  private Integer proxySendTimeout = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("ResponseCheckEnabled")
  private String responseCheckEnabled = null;

  @SerializedName("Scheduler")
  private String scheduler = null;

  @SerializedName("SecurityPolicyId")
  private String securityPolicyId = null;

  @SerializedName("SendTimeout")
  private Integer sendTimeout = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("StartPort")
  private Integer startPort = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeListenerAttributesOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("WafProtectionEnabled")
  private String wafProtectionEnabled = null;

  public DescribeListenerAttributesResponse aclIds(List<String> aclIds) {
    this.aclIds = aclIds;
    return this;
  }

  public DescribeListenerAttributesResponse addAclIdsItem(String aclIdsItem) {
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

  public DescribeListenerAttributesResponse aclStatus(String aclStatus) {
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

  public DescribeListenerAttributesResponse aclType(String aclType) {
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

  public DescribeListenerAttributesResponse bandwidth(Integer bandwidth) {
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

  public DescribeListenerAttributesResponse caCertificateId(String caCertificateId) {
    this.caCertificateId = caCertificateId;
    return this;
  }

   /**
   * Get caCertificateId
   * @return caCertificateId
  **/
  @Schema(description = "")
  public String getCaCertificateId() {
    return caCertificateId;
  }

  public void setCaCertificateId(String caCertificateId) {
    this.caCertificateId = caCertificateId;
  }

  public DescribeListenerAttributesResponse caEnabled(String caEnabled) {
    this.caEnabled = caEnabled;
    return this;
  }

   /**
   * Get caEnabled
   * @return caEnabled
  **/
  @Schema(description = "")
  public String getCaEnabled() {
    return caEnabled;
  }

  public void setCaEnabled(String caEnabled) {
    this.caEnabled = caEnabled;
  }

  public DescribeListenerAttributesResponse certCenterCertificateId(String certCenterCertificateId) {
    this.certCenterCertificateId = certCenterCertificateId;
    return this;
  }

   /**
   * Get certCenterCertificateId
   * @return certCenterCertificateId
  **/
  @Schema(description = "")
  public String getCertCenterCertificateId() {
    return certCenterCertificateId;
  }

  public void setCertCenterCertificateId(String certCenterCertificateId) {
    this.certCenterCertificateId = certCenterCertificateId;
  }

  public DescribeListenerAttributesResponse certificateId(String certificateId) {
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

  public DescribeListenerAttributesResponse certificateSource(String certificateSource) {
    this.certificateSource = certificateSource;
    return this;
  }

   /**
   * Get certificateSource
   * @return certificateSource
  **/
  @Schema(description = "")
  public String getCertificateSource() {
    return certificateSource;
  }

  public void setCertificateSource(String certificateSource) {
    this.certificateSource = certificateSource;
  }

  public DescribeListenerAttributesResponse clientBodyTimeout(Integer clientBodyTimeout) {
    this.clientBodyTimeout = clientBodyTimeout;
    return this;
  }

   /**
   * Get clientBodyTimeout
   * @return clientBodyTimeout
  **/
  @Schema(description = "")
  public Integer getClientBodyTimeout() {
    return clientBodyTimeout;
  }

  public void setClientBodyTimeout(Integer clientBodyTimeout) {
    this.clientBodyTimeout = clientBodyTimeout;
  }

  public DescribeListenerAttributesResponse clientHeaderTimeout(Integer clientHeaderTimeout) {
    this.clientHeaderTimeout = clientHeaderTimeout;
    return this;
  }

   /**
   * Get clientHeaderTimeout
   * @return clientHeaderTimeout
  **/
  @Schema(description = "")
  public Integer getClientHeaderTimeout() {
    return clientHeaderTimeout;
  }

  public void setClientHeaderTimeout(Integer clientHeaderTimeout) {
    this.clientHeaderTimeout = clientHeaderTimeout;
  }

  public DescribeListenerAttributesResponse connectionDrainEnabled(String connectionDrainEnabled) {
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

  public DescribeListenerAttributesResponse connectionDrainTimeout(Integer connectionDrainTimeout) {
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

  public DescribeListenerAttributesResponse cookie(String cookie) {
    this.cookie = cookie;
    return this;
  }

   /**
   * Get cookie
   * @return cookie
  **/
  @Schema(description = "")
  public String getCookie() {
    return cookie;
  }

  public void setCookie(String cookie) {
    this.cookie = cookie;
  }

  public DescribeListenerAttributesResponse createTime(String createTime) {
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

  public DescribeListenerAttributesResponse description(String description) {
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

  public DescribeListenerAttributesResponse enabled(String enabled) {
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

  public DescribeListenerAttributesResponse endPort(Integer endPort) {
    this.endPort = endPort;
    return this;
  }

   /**
   * Get endPort
   * @return endPort
  **/
  @Schema(description = "")
  public Integer getEndPort() {
    return endPort;
  }

  public void setEndPort(Integer endPort) {
    this.endPort = endPort;
  }

  public DescribeListenerAttributesResponse establishedTimeout(Integer establishedTimeout) {
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

  public DescribeListenerAttributesResponse healthCheck(HealthCheckForDescribeListenerAttributesOutput healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckForDescribeListenerAttributesOutput getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthCheckForDescribeListenerAttributesOutput healthCheck) {
    this.healthCheck = healthCheck;
  }

  public DescribeListenerAttributesResponse http2Enabled(String http2Enabled) {
    this.http2Enabled = http2Enabled;
    return this;
  }

   /**
   * Get http2Enabled
   * @return http2Enabled
  **/
  @Schema(description = "")
  public String getHttp2Enabled() {
    return http2Enabled;
  }

  public void setHttp2Enabled(String http2Enabled) {
    this.http2Enabled = http2Enabled;
  }

  public DescribeListenerAttributesResponse keepaliveTimeout(Integer keepaliveTimeout) {
    this.keepaliveTimeout = keepaliveTimeout;
    return this;
  }

   /**
   * Get keepaliveTimeout
   * @return keepaliveTimeout
  **/
  @Schema(description = "")
  public Integer getKeepaliveTimeout() {
    return keepaliveTimeout;
  }

  public void setKeepaliveTimeout(Integer keepaliveTimeout) {
    this.keepaliveTimeout = keepaliveTimeout;
  }

  public DescribeListenerAttributesResponse listenerId(String listenerId) {
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

  public DescribeListenerAttributesResponse listenerName(String listenerName) {
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

  public DescribeListenerAttributesResponse loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public DescribeListenerAttributesResponse persistenceTimeout(Integer persistenceTimeout) {
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

  public DescribeListenerAttributesResponse persistenceType(String persistenceType) {
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

  public DescribeListenerAttributesResponse port(Integer port) {
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

  public DescribeListenerAttributesResponse protocol(String protocol) {
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

  public DescribeListenerAttributesResponse proxyConnectTimeout(Integer proxyConnectTimeout) {
    this.proxyConnectTimeout = proxyConnectTimeout;
    return this;
  }

   /**
   * Get proxyConnectTimeout
   * @return proxyConnectTimeout
  **/
  @Schema(description = "")
  public Integer getProxyConnectTimeout() {
    return proxyConnectTimeout;
  }

  public void setProxyConnectTimeout(Integer proxyConnectTimeout) {
    this.proxyConnectTimeout = proxyConnectTimeout;
  }

  public DescribeListenerAttributesResponse proxyProtocolType(String proxyProtocolType) {
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

  public DescribeListenerAttributesResponse proxyReadTimeout(Integer proxyReadTimeout) {
    this.proxyReadTimeout = proxyReadTimeout;
    return this;
  }

   /**
   * Get proxyReadTimeout
   * @return proxyReadTimeout
  **/
  @Schema(description = "")
  public Integer getProxyReadTimeout() {
    return proxyReadTimeout;
  }

  public void setProxyReadTimeout(Integer proxyReadTimeout) {
    this.proxyReadTimeout = proxyReadTimeout;
  }

  public DescribeListenerAttributesResponse proxySendTimeout(Integer proxySendTimeout) {
    this.proxySendTimeout = proxySendTimeout;
    return this;
  }

   /**
   * Get proxySendTimeout
   * @return proxySendTimeout
  **/
  @Schema(description = "")
  public Integer getProxySendTimeout() {
    return proxySendTimeout;
  }

  public void setProxySendTimeout(Integer proxySendTimeout) {
    this.proxySendTimeout = proxySendTimeout;
  }

  public DescribeListenerAttributesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeListenerAttributesResponse responseCheckEnabled(String responseCheckEnabled) {
    this.responseCheckEnabled = responseCheckEnabled;
    return this;
  }

   /**
   * Get responseCheckEnabled
   * @return responseCheckEnabled
  **/
  @Schema(description = "")
  public String getResponseCheckEnabled() {
    return responseCheckEnabled;
  }

  public void setResponseCheckEnabled(String responseCheckEnabled) {
    this.responseCheckEnabled = responseCheckEnabled;
  }

  public DescribeListenerAttributesResponse scheduler(String scheduler) {
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

  public DescribeListenerAttributesResponse securityPolicyId(String securityPolicyId) {
    this.securityPolicyId = securityPolicyId;
    return this;
  }

   /**
   * Get securityPolicyId
   * @return securityPolicyId
  **/
  @Schema(description = "")
  public String getSecurityPolicyId() {
    return securityPolicyId;
  }

  public void setSecurityPolicyId(String securityPolicyId) {
    this.securityPolicyId = securityPolicyId;
  }

  public DescribeListenerAttributesResponse sendTimeout(Integer sendTimeout) {
    this.sendTimeout = sendTimeout;
    return this;
  }

   /**
   * Get sendTimeout
   * @return sendTimeout
  **/
  @Schema(description = "")
  public Integer getSendTimeout() {
    return sendTimeout;
  }

  public void setSendTimeout(Integer sendTimeout) {
    this.sendTimeout = sendTimeout;
  }

  public DescribeListenerAttributesResponse serverGroupId(String serverGroupId) {
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

  public DescribeListenerAttributesResponse startPort(Integer startPort) {
    this.startPort = startPort;
    return this;
  }

   /**
   * Get startPort
   * @return startPort
  **/
  @Schema(description = "")
  public Integer getStartPort() {
    return startPort;
  }

  public void setStartPort(Integer startPort) {
    this.startPort = startPort;
  }

  public DescribeListenerAttributesResponse status(String status) {
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

  public DescribeListenerAttributesResponse tags(List<TagForDescribeListenerAttributesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public DescribeListenerAttributesResponse addTagsItem(TagForDescribeListenerAttributesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeListenerAttributesOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeListenerAttributesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeListenerAttributesOutput> tags) {
    this.tags = tags;
  }

  public DescribeListenerAttributesResponse updateTime(String updateTime) {
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

  public DescribeListenerAttributesResponse wafProtectionEnabled(String wafProtectionEnabled) {
    this.wafProtectionEnabled = wafProtectionEnabled;
    return this;
  }

   /**
   * Get wafProtectionEnabled
   * @return wafProtectionEnabled
  **/
  @Schema(description = "")
  public String getWafProtectionEnabled() {
    return wafProtectionEnabled;
  }

  public void setWafProtectionEnabled(String wafProtectionEnabled) {
    this.wafProtectionEnabled = wafProtectionEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeListenerAttributesResponse describeListenerAttributesResponse = (DescribeListenerAttributesResponse) o;
    return Objects.equals(this.aclIds, describeListenerAttributesResponse.aclIds) &&
        Objects.equals(this.aclStatus, describeListenerAttributesResponse.aclStatus) &&
        Objects.equals(this.aclType, describeListenerAttributesResponse.aclType) &&
        Objects.equals(this.bandwidth, describeListenerAttributesResponse.bandwidth) &&
        Objects.equals(this.caCertificateId, describeListenerAttributesResponse.caCertificateId) &&
        Objects.equals(this.caEnabled, describeListenerAttributesResponse.caEnabled) &&
        Objects.equals(this.certCenterCertificateId, describeListenerAttributesResponse.certCenterCertificateId) &&
        Objects.equals(this.certificateId, describeListenerAttributesResponse.certificateId) &&
        Objects.equals(this.certificateSource, describeListenerAttributesResponse.certificateSource) &&
        Objects.equals(this.clientBodyTimeout, describeListenerAttributesResponse.clientBodyTimeout) &&
        Objects.equals(this.clientHeaderTimeout, describeListenerAttributesResponse.clientHeaderTimeout) &&
        Objects.equals(this.connectionDrainEnabled, describeListenerAttributesResponse.connectionDrainEnabled) &&
        Objects.equals(this.connectionDrainTimeout, describeListenerAttributesResponse.connectionDrainTimeout) &&
        Objects.equals(this.cookie, describeListenerAttributesResponse.cookie) &&
        Objects.equals(this.createTime, describeListenerAttributesResponse.createTime) &&
        Objects.equals(this.description, describeListenerAttributesResponse.description) &&
        Objects.equals(this.enabled, describeListenerAttributesResponse.enabled) &&
        Objects.equals(this.endPort, describeListenerAttributesResponse.endPort) &&
        Objects.equals(this.establishedTimeout, describeListenerAttributesResponse.establishedTimeout) &&
        Objects.equals(this.healthCheck, describeListenerAttributesResponse.healthCheck) &&
        Objects.equals(this.http2Enabled, describeListenerAttributesResponse.http2Enabled) &&
        Objects.equals(this.keepaliveTimeout, describeListenerAttributesResponse.keepaliveTimeout) &&
        Objects.equals(this.listenerId, describeListenerAttributesResponse.listenerId) &&
        Objects.equals(this.listenerName, describeListenerAttributesResponse.listenerName) &&
        Objects.equals(this.loadBalancerId, describeListenerAttributesResponse.loadBalancerId) &&
        Objects.equals(this.persistenceTimeout, describeListenerAttributesResponse.persistenceTimeout) &&
        Objects.equals(this.persistenceType, describeListenerAttributesResponse.persistenceType) &&
        Objects.equals(this.port, describeListenerAttributesResponse.port) &&
        Objects.equals(this.protocol, describeListenerAttributesResponse.protocol) &&
        Objects.equals(this.proxyConnectTimeout, describeListenerAttributesResponse.proxyConnectTimeout) &&
        Objects.equals(this.proxyProtocolType, describeListenerAttributesResponse.proxyProtocolType) &&
        Objects.equals(this.proxyReadTimeout, describeListenerAttributesResponse.proxyReadTimeout) &&
        Objects.equals(this.proxySendTimeout, describeListenerAttributesResponse.proxySendTimeout) &&
        Objects.equals(this.requestId, describeListenerAttributesResponse.requestId) &&
        Objects.equals(this.responseCheckEnabled, describeListenerAttributesResponse.responseCheckEnabled) &&
        Objects.equals(this.scheduler, describeListenerAttributesResponse.scheduler) &&
        Objects.equals(this.securityPolicyId, describeListenerAttributesResponse.securityPolicyId) &&
        Objects.equals(this.sendTimeout, describeListenerAttributesResponse.sendTimeout) &&
        Objects.equals(this.serverGroupId, describeListenerAttributesResponse.serverGroupId) &&
        Objects.equals(this.startPort, describeListenerAttributesResponse.startPort) &&
        Objects.equals(this.status, describeListenerAttributesResponse.status) &&
        Objects.equals(this.tags, describeListenerAttributesResponse.tags) &&
        Objects.equals(this.updateTime, describeListenerAttributesResponse.updateTime) &&
        Objects.equals(this.wafProtectionEnabled, describeListenerAttributesResponse.wafProtectionEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclIds, aclStatus, aclType, bandwidth, caCertificateId, caEnabled, certCenterCertificateId, certificateId, certificateSource, clientBodyTimeout, clientHeaderTimeout, connectionDrainEnabled, connectionDrainTimeout, cookie, createTime, description, enabled, endPort, establishedTimeout, healthCheck, http2Enabled, keepaliveTimeout, listenerId, listenerName, loadBalancerId, persistenceTimeout, persistenceType, port, protocol, proxyConnectTimeout, proxyProtocolType, proxyReadTimeout, proxySendTimeout, requestId, responseCheckEnabled, scheduler, securityPolicyId, sendTimeout, serverGroupId, startPort, status, tags, updateTime, wafProtectionEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeListenerAttributesResponse {\n");
    
    sb.append("    aclIds: ").append(toIndentedString(aclIds)).append("\n");
    sb.append("    aclStatus: ").append(toIndentedString(aclStatus)).append("\n");
    sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    caCertificateId: ").append(toIndentedString(caCertificateId)).append("\n");
    sb.append("    caEnabled: ").append(toIndentedString(caEnabled)).append("\n");
    sb.append("    certCenterCertificateId: ").append(toIndentedString(certCenterCertificateId)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    certificateSource: ").append(toIndentedString(certificateSource)).append("\n");
    sb.append("    clientBodyTimeout: ").append(toIndentedString(clientBodyTimeout)).append("\n");
    sb.append("    clientHeaderTimeout: ").append(toIndentedString(clientHeaderTimeout)).append("\n");
    sb.append("    connectionDrainEnabled: ").append(toIndentedString(connectionDrainEnabled)).append("\n");
    sb.append("    connectionDrainTimeout: ").append(toIndentedString(connectionDrainTimeout)).append("\n");
    sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endPort: ").append(toIndentedString(endPort)).append("\n");
    sb.append("    establishedTimeout: ").append(toIndentedString(establishedTimeout)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    http2Enabled: ").append(toIndentedString(http2Enabled)).append("\n");
    sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    persistenceTimeout: ").append(toIndentedString(persistenceTimeout)).append("\n");
    sb.append("    persistenceType: ").append(toIndentedString(persistenceType)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    proxyConnectTimeout: ").append(toIndentedString(proxyConnectTimeout)).append("\n");
    sb.append("    proxyProtocolType: ").append(toIndentedString(proxyProtocolType)).append("\n");
    sb.append("    proxyReadTimeout: ").append(toIndentedString(proxyReadTimeout)).append("\n");
    sb.append("    proxySendTimeout: ").append(toIndentedString(proxySendTimeout)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCheckEnabled: ").append(toIndentedString(responseCheckEnabled)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    securityPolicyId: ").append(toIndentedString(securityPolicyId)).append("\n");
    sb.append("    sendTimeout: ").append(toIndentedString(sendTimeout)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    startPort: ").append(toIndentedString(startPort)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    wafProtectionEnabled: ").append(toIndentedString(wafProtectionEnabled)).append("\n");
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
