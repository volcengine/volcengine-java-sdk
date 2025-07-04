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
import com.volcengine.clb.model.HealthCheckForDescribeNLBServerGroupsOutput;
import com.volcengine.clb.model.TagForDescribeNLBServerGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ServerGroupForDescribeNLBServerGroupsOutput
 */



public class ServerGroupForDescribeNLBServerGroupsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AnyPortEnabled")
  private Boolean anyPortEnabled = null;

  @SerializedName("BypassSecurityGroupEnabled")
  private Boolean bypassSecurityGroupEnabled = null;

  @SerializedName("ConnectionDrainEnabled")
  private Boolean connectionDrainEnabled = null;

  @SerializedName("ConnectionDrainTimeout")
  private Integer connectionDrainTimeout = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("HealthCheck")
  private HealthCheckForDescribeNLBServerGroupsOutput healthCheck = null;

  @SerializedName("IpAddressVersion")
  private String ipAddressVersion = null;

  @SerializedName("PreserveClientIpEnabled")
  private Boolean preserveClientIpEnabled = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("ProxyProtocolType")
  private String proxyProtocolType = null;

  @SerializedName("RelatedLoadBalancerIds")
  private List<String> relatedLoadBalancerIds = null;

  @SerializedName("Scheduler")
  private String scheduler = null;

  @SerializedName("ServerCount")
  private Integer serverCount = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  @SerializedName("SessionPersistenceEnabled")
  private Boolean sessionPersistenceEnabled = null;

  @SerializedName("SessionPersistenceTimeout")
  private Integer sessionPersistenceTimeout = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeNLBServerGroupsOutput> tags = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public ServerGroupForDescribeNLBServerGroupsOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput anyPortEnabled(Boolean anyPortEnabled) {
    this.anyPortEnabled = anyPortEnabled;
    return this;
  }

   /**
   * Get anyPortEnabled
   * @return anyPortEnabled
  **/
  @Schema(description = "")
  public Boolean isAnyPortEnabled() {
    return anyPortEnabled;
  }

  public void setAnyPortEnabled(Boolean anyPortEnabled) {
    this.anyPortEnabled = anyPortEnabled;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput bypassSecurityGroupEnabled(Boolean bypassSecurityGroupEnabled) {
    this.bypassSecurityGroupEnabled = bypassSecurityGroupEnabled;
    return this;
  }

   /**
   * Get bypassSecurityGroupEnabled
   * @return bypassSecurityGroupEnabled
  **/
  @Schema(description = "")
  public Boolean isBypassSecurityGroupEnabled() {
    return bypassSecurityGroupEnabled;
  }

  public void setBypassSecurityGroupEnabled(Boolean bypassSecurityGroupEnabled) {
    this.bypassSecurityGroupEnabled = bypassSecurityGroupEnabled;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput connectionDrainEnabled(Boolean connectionDrainEnabled) {
    this.connectionDrainEnabled = connectionDrainEnabled;
    return this;
  }

   /**
   * Get connectionDrainEnabled
   * @return connectionDrainEnabled
  **/
  @Schema(description = "")
  public Boolean isConnectionDrainEnabled() {
    return connectionDrainEnabled;
  }

  public void setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
    this.connectionDrainEnabled = connectionDrainEnabled;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput connectionDrainTimeout(Integer connectionDrainTimeout) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput createTime(String createTime) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput description(String description) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput healthCheck(HealthCheckForDescribeNLBServerGroupsOutput healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Valid
  @Schema(description = "")
  public HealthCheckForDescribeNLBServerGroupsOutput getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(HealthCheckForDescribeNLBServerGroupsOutput healthCheck) {
    this.healthCheck = healthCheck;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput ipAddressVersion(String ipAddressVersion) {
    this.ipAddressVersion = ipAddressVersion;
    return this;
  }

   /**
   * Get ipAddressVersion
   * @return ipAddressVersion
  **/
  @Schema(description = "")
  public String getIpAddressVersion() {
    return ipAddressVersion;
  }

  public void setIpAddressVersion(String ipAddressVersion) {
    this.ipAddressVersion = ipAddressVersion;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput preserveClientIpEnabled(Boolean preserveClientIpEnabled) {
    this.preserveClientIpEnabled = preserveClientIpEnabled;
    return this;
  }

   /**
   * Get preserveClientIpEnabled
   * @return preserveClientIpEnabled
  **/
  @Schema(description = "")
  public Boolean isPreserveClientIpEnabled() {
    return preserveClientIpEnabled;
  }

  public void setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
    this.preserveClientIpEnabled = preserveClientIpEnabled;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput projectName(String projectName) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput protocol(String protocol) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput proxyProtocolType(String proxyProtocolType) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput relatedLoadBalancerIds(List<String> relatedLoadBalancerIds) {
    this.relatedLoadBalancerIds = relatedLoadBalancerIds;
    return this;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput addRelatedLoadBalancerIdsItem(String relatedLoadBalancerIdsItem) {
    if (this.relatedLoadBalancerIds == null) {
      this.relatedLoadBalancerIds = new ArrayList<String>();
    }
    this.relatedLoadBalancerIds.add(relatedLoadBalancerIdsItem);
    return this;
  }

   /**
   * Get relatedLoadBalancerIds
   * @return relatedLoadBalancerIds
  **/
  @Schema(description = "")
  public List<String> getRelatedLoadBalancerIds() {
    return relatedLoadBalancerIds;
  }

  public void setRelatedLoadBalancerIds(List<String> relatedLoadBalancerIds) {
    this.relatedLoadBalancerIds = relatedLoadBalancerIds;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput scheduler(String scheduler) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput serverCount(Integer serverCount) {
    this.serverCount = serverCount;
    return this;
  }

   /**
   * Get serverCount
   * @return serverCount
  **/
  @Schema(description = "")
  public Integer getServerCount() {
    return serverCount;
  }

  public void setServerCount(Integer serverCount) {
    this.serverCount = serverCount;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput serverGroupId(String serverGroupId) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput sessionPersistenceEnabled(Boolean sessionPersistenceEnabled) {
    this.sessionPersistenceEnabled = sessionPersistenceEnabled;
    return this;
  }

   /**
   * Get sessionPersistenceEnabled
   * @return sessionPersistenceEnabled
  **/
  @Schema(description = "")
  public Boolean isSessionPersistenceEnabled() {
    return sessionPersistenceEnabled;
  }

  public void setSessionPersistenceEnabled(Boolean sessionPersistenceEnabled) {
    this.sessionPersistenceEnabled = sessionPersistenceEnabled;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput sessionPersistenceTimeout(Integer sessionPersistenceTimeout) {
    this.sessionPersistenceTimeout = sessionPersistenceTimeout;
    return this;
  }

   /**
   * Get sessionPersistenceTimeout
   * @return sessionPersistenceTimeout
  **/
  @Schema(description = "")
  public Integer getSessionPersistenceTimeout() {
    return sessionPersistenceTimeout;
  }

  public void setSessionPersistenceTimeout(Integer sessionPersistenceTimeout) {
    this.sessionPersistenceTimeout = sessionPersistenceTimeout;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput status(String status) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput tags(List<TagForDescribeNLBServerGroupsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput addTagsItem(TagForDescribeNLBServerGroupsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeNLBServerGroupsOutput>();
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
  public List<TagForDescribeNLBServerGroupsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeNLBServerGroupsOutput> tags) {
    this.tags = tags;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServerGroupForDescribeNLBServerGroupsOutput updateTime(String updateTime) {
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

  public ServerGroupForDescribeNLBServerGroupsOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerGroupForDescribeNLBServerGroupsOutput serverGroupForDescribeNLBServerGroupsOutput = (ServerGroupForDescribeNLBServerGroupsOutput) o;
    return Objects.equals(this.accountId, serverGroupForDescribeNLBServerGroupsOutput.accountId) &&
        Objects.equals(this.anyPortEnabled, serverGroupForDescribeNLBServerGroupsOutput.anyPortEnabled) &&
        Objects.equals(this.bypassSecurityGroupEnabled, serverGroupForDescribeNLBServerGroupsOutput.bypassSecurityGroupEnabled) &&
        Objects.equals(this.connectionDrainEnabled, serverGroupForDescribeNLBServerGroupsOutput.connectionDrainEnabled) &&
        Objects.equals(this.connectionDrainTimeout, serverGroupForDescribeNLBServerGroupsOutput.connectionDrainTimeout) &&
        Objects.equals(this.createTime, serverGroupForDescribeNLBServerGroupsOutput.createTime) &&
        Objects.equals(this.description, serverGroupForDescribeNLBServerGroupsOutput.description) &&
        Objects.equals(this.healthCheck, serverGroupForDescribeNLBServerGroupsOutput.healthCheck) &&
        Objects.equals(this.ipAddressVersion, serverGroupForDescribeNLBServerGroupsOutput.ipAddressVersion) &&
        Objects.equals(this.preserveClientIpEnabled, serverGroupForDescribeNLBServerGroupsOutput.preserveClientIpEnabled) &&
        Objects.equals(this.projectName, serverGroupForDescribeNLBServerGroupsOutput.projectName) &&
        Objects.equals(this.protocol, serverGroupForDescribeNLBServerGroupsOutput.protocol) &&
        Objects.equals(this.proxyProtocolType, serverGroupForDescribeNLBServerGroupsOutput.proxyProtocolType) &&
        Objects.equals(this.relatedLoadBalancerIds, serverGroupForDescribeNLBServerGroupsOutput.relatedLoadBalancerIds) &&
        Objects.equals(this.scheduler, serverGroupForDescribeNLBServerGroupsOutput.scheduler) &&
        Objects.equals(this.serverCount, serverGroupForDescribeNLBServerGroupsOutput.serverCount) &&
        Objects.equals(this.serverGroupId, serverGroupForDescribeNLBServerGroupsOutput.serverGroupId) &&
        Objects.equals(this.serverGroupName, serverGroupForDescribeNLBServerGroupsOutput.serverGroupName) &&
        Objects.equals(this.sessionPersistenceEnabled, serverGroupForDescribeNLBServerGroupsOutput.sessionPersistenceEnabled) &&
        Objects.equals(this.sessionPersistenceTimeout, serverGroupForDescribeNLBServerGroupsOutput.sessionPersistenceTimeout) &&
        Objects.equals(this.status, serverGroupForDescribeNLBServerGroupsOutput.status) &&
        Objects.equals(this.tags, serverGroupForDescribeNLBServerGroupsOutput.tags) &&
        Objects.equals(this.type, serverGroupForDescribeNLBServerGroupsOutput.type) &&
        Objects.equals(this.updateTime, serverGroupForDescribeNLBServerGroupsOutput.updateTime) &&
        Objects.equals(this.vpcId, serverGroupForDescribeNLBServerGroupsOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, anyPortEnabled, bypassSecurityGroupEnabled, connectionDrainEnabled, connectionDrainTimeout, createTime, description, healthCheck, ipAddressVersion, preserveClientIpEnabled, projectName, protocol, proxyProtocolType, relatedLoadBalancerIds, scheduler, serverCount, serverGroupId, serverGroupName, sessionPersistenceEnabled, sessionPersistenceTimeout, status, tags, type, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerGroupForDescribeNLBServerGroupsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    anyPortEnabled: ").append(toIndentedString(anyPortEnabled)).append("\n");
    sb.append("    bypassSecurityGroupEnabled: ").append(toIndentedString(bypassSecurityGroupEnabled)).append("\n");
    sb.append("    connectionDrainEnabled: ").append(toIndentedString(connectionDrainEnabled)).append("\n");
    sb.append("    connectionDrainTimeout: ").append(toIndentedString(connectionDrainTimeout)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    ipAddressVersion: ").append(toIndentedString(ipAddressVersion)).append("\n");
    sb.append("    preserveClientIpEnabled: ").append(toIndentedString(preserveClientIpEnabled)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    proxyProtocolType: ").append(toIndentedString(proxyProtocolType)).append("\n");
    sb.append("    relatedLoadBalancerIds: ").append(toIndentedString(relatedLoadBalancerIds)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
    sb.append("    serverCount: ").append(toIndentedString(serverCount)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
    sb.append("    sessionPersistenceEnabled: ").append(toIndentedString(sessionPersistenceEnabled)).append("\n");
    sb.append("    sessionPersistenceTimeout: ").append(toIndentedString(sessionPersistenceTimeout)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
