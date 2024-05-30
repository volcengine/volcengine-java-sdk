/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.DomainLockForListCdnDomainsOutput;
import com.volcengine.cdn.model.FeatureConfigForListCdnDomainsOutput;
import com.volcengine.cdn.model.ResourceTagForListCdnDomainsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForListCdnDomainsOutput
 */



public class DataForListCdnDomainsOutput {
  @SerializedName("BackupCname")
  private String backupCname = null;

  @SerializedName("BackupOrigin")
  private List<String> backupOrigin = null;

  @SerializedName("CacheShared")
  private String cacheShared = null;

  @SerializedName("CacheSharedTargetHost")
  private String cacheSharedTargetHost = null;

  @SerializedName("Cname")
  private String cname = null;

  @SerializedName("ConfigStatus")
  private String configStatus = null;

  @SerializedName("CreateTime")
  private Long createTime = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("DomainLock")
  private DomainLockForListCdnDomainsOutput domainLock = null;

  @SerializedName("FeatureConfig")
  private FeatureConfigForListCdnDomainsOutput featureConfig = null;

  @SerializedName("HTTPS")
  private Boolean HTTPS = null;

  @SerializedName("IPv6")
  private Boolean ipv6 = null;

  @SerializedName("IsConflictDomain")
  private Boolean isConflictDomain = null;

  @SerializedName("OriginProtocol")
  private String originProtocol = null;

  @SerializedName("PrimaryOrigin")
  private List<String> primaryOrigin = null;

  @SerializedName("Project")
  private String project = null;

  @SerializedName("ResourceTags")
  private List<ResourceTagForListCdnDomainsOutput> resourceTags = null;

  @SerializedName("ServiceRegion")
  private String serviceRegion = null;

  @SerializedName("ServiceType")
  private String serviceType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private Long updateTime = null;

  public DataForListCdnDomainsOutput backupCname(String backupCname) {
    this.backupCname = backupCname;
    return this;
  }

   /**
   * Get backupCname
   * @return backupCname
  **/
  @Schema(description = "")
  public String getBackupCname() {
    return backupCname;
  }

  public void setBackupCname(String backupCname) {
    this.backupCname = backupCname;
  }

  public DataForListCdnDomainsOutput backupOrigin(List<String> backupOrigin) {
    this.backupOrigin = backupOrigin;
    return this;
  }

  public DataForListCdnDomainsOutput addBackupOriginItem(String backupOriginItem) {
    if (this.backupOrigin == null) {
      this.backupOrigin = new ArrayList<String>();
    }
    this.backupOrigin.add(backupOriginItem);
    return this;
  }

   /**
   * Get backupOrigin
   * @return backupOrigin
  **/
  @Schema(description = "")
  public List<String> getBackupOrigin() {
    return backupOrigin;
  }

  public void setBackupOrigin(List<String> backupOrigin) {
    this.backupOrigin = backupOrigin;
  }

  public DataForListCdnDomainsOutput cacheShared(String cacheShared) {
    this.cacheShared = cacheShared;
    return this;
  }

   /**
   * Get cacheShared
   * @return cacheShared
  **/
  @Schema(description = "")
  public String getCacheShared() {
    return cacheShared;
  }

  public void setCacheShared(String cacheShared) {
    this.cacheShared = cacheShared;
  }

  public DataForListCdnDomainsOutput cacheSharedTargetHost(String cacheSharedTargetHost) {
    this.cacheSharedTargetHost = cacheSharedTargetHost;
    return this;
  }

   /**
   * Get cacheSharedTargetHost
   * @return cacheSharedTargetHost
  **/
  @Schema(description = "")
  public String getCacheSharedTargetHost() {
    return cacheSharedTargetHost;
  }

  public void setCacheSharedTargetHost(String cacheSharedTargetHost) {
    this.cacheSharedTargetHost = cacheSharedTargetHost;
  }

  public DataForListCdnDomainsOutput cname(String cname) {
    this.cname = cname;
    return this;
  }

   /**
   * Get cname
   * @return cname
  **/
  @Schema(description = "")
  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public DataForListCdnDomainsOutput configStatus(String configStatus) {
    this.configStatus = configStatus;
    return this;
  }

   /**
   * Get configStatus
   * @return configStatus
  **/
  @Schema(description = "")
  public String getConfigStatus() {
    return configStatus;
  }

  public void setConfigStatus(String configStatus) {
    this.configStatus = configStatus;
  }

  public DataForListCdnDomainsOutput createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public DataForListCdnDomainsOutput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DataForListCdnDomainsOutput domainLock(DomainLockForListCdnDomainsOutput domainLock) {
    this.domainLock = domainLock;
    return this;
  }

   /**
   * Get domainLock
   * @return domainLock
  **/
  @Valid
  @Schema(description = "")
  public DomainLockForListCdnDomainsOutput getDomainLock() {
    return domainLock;
  }

  public void setDomainLock(DomainLockForListCdnDomainsOutput domainLock) {
    this.domainLock = domainLock;
  }

  public DataForListCdnDomainsOutput featureConfig(FeatureConfigForListCdnDomainsOutput featureConfig) {
    this.featureConfig = featureConfig;
    return this;
  }

   /**
   * Get featureConfig
   * @return featureConfig
  **/
  @Valid
  @Schema(description = "")
  public FeatureConfigForListCdnDomainsOutput getFeatureConfig() {
    return featureConfig;
  }

  public void setFeatureConfig(FeatureConfigForListCdnDomainsOutput featureConfig) {
    this.featureConfig = featureConfig;
  }

  public DataForListCdnDomainsOutput HTTPS(Boolean HTTPS) {
    this.HTTPS = HTTPS;
    return this;
  }

   /**
   * Get HTTPS
   * @return HTTPS
  **/
  @Schema(description = "")
  public Boolean isHTTPS() {
    return HTTPS;
  }

  public void setHTTPS(Boolean HTTPS) {
    this.HTTPS = HTTPS;
  }

  public DataForListCdnDomainsOutput ipv6(Boolean ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @Schema(description = "")
  public Boolean isIpv6() {
    return ipv6;
  }

  public void setIpv6(Boolean ipv6) {
    this.ipv6 = ipv6;
  }

  public DataForListCdnDomainsOutput isConflictDomain(Boolean isConflictDomain) {
    this.isConflictDomain = isConflictDomain;
    return this;
  }

   /**
   * Get isConflictDomain
   * @return isConflictDomain
  **/
  @Schema(description = "")
  public Boolean isIsConflictDomain() {
    return isConflictDomain;
  }

  public void setIsConflictDomain(Boolean isConflictDomain) {
    this.isConflictDomain = isConflictDomain;
  }

  public DataForListCdnDomainsOutput originProtocol(String originProtocol) {
    this.originProtocol = originProtocol;
    return this;
  }

   /**
   * Get originProtocol
   * @return originProtocol
  **/
  @Schema(description = "")
  public String getOriginProtocol() {
    return originProtocol;
  }

  public void setOriginProtocol(String originProtocol) {
    this.originProtocol = originProtocol;
  }

  public DataForListCdnDomainsOutput primaryOrigin(List<String> primaryOrigin) {
    this.primaryOrigin = primaryOrigin;
    return this;
  }

  public DataForListCdnDomainsOutput addPrimaryOriginItem(String primaryOriginItem) {
    if (this.primaryOrigin == null) {
      this.primaryOrigin = new ArrayList<String>();
    }
    this.primaryOrigin.add(primaryOriginItem);
    return this;
  }

   /**
   * Get primaryOrigin
   * @return primaryOrigin
  **/
  @Schema(description = "")
  public List<String> getPrimaryOrigin() {
    return primaryOrigin;
  }

  public void setPrimaryOrigin(List<String> primaryOrigin) {
    this.primaryOrigin = primaryOrigin;
  }

  public DataForListCdnDomainsOutput project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public DataForListCdnDomainsOutput resourceTags(List<ResourceTagForListCdnDomainsOutput> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  public DataForListCdnDomainsOutput addResourceTagsItem(ResourceTagForListCdnDomainsOutput resourceTagsItem) {
    if (this.resourceTags == null) {
      this.resourceTags = new ArrayList<ResourceTagForListCdnDomainsOutput>();
    }
    this.resourceTags.add(resourceTagsItem);
    return this;
  }

   /**
   * Get resourceTags
   * @return resourceTags
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceTagForListCdnDomainsOutput> getResourceTags() {
    return resourceTags;
  }

  public void setResourceTags(List<ResourceTagForListCdnDomainsOutput> resourceTags) {
    this.resourceTags = resourceTags;
  }

  public DataForListCdnDomainsOutput serviceRegion(String serviceRegion) {
    this.serviceRegion = serviceRegion;
    return this;
  }

   /**
   * Get serviceRegion
   * @return serviceRegion
  **/
  @Schema(description = "")
  public String getServiceRegion() {
    return serviceRegion;
  }

  public void setServiceRegion(String serviceRegion) {
    this.serviceRegion = serviceRegion;
  }

  public DataForListCdnDomainsOutput serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @Schema(description = "")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public DataForListCdnDomainsOutput status(String status) {
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

  public DataForListCdnDomainsOutput updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public Long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Long updateTime) {
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
    DataForListCdnDomainsOutput dataForListCdnDomainsOutput = (DataForListCdnDomainsOutput) o;
    return Objects.equals(this.backupCname, dataForListCdnDomainsOutput.backupCname) &&
        Objects.equals(this.backupOrigin, dataForListCdnDomainsOutput.backupOrigin) &&
        Objects.equals(this.cacheShared, dataForListCdnDomainsOutput.cacheShared) &&
        Objects.equals(this.cacheSharedTargetHost, dataForListCdnDomainsOutput.cacheSharedTargetHost) &&
        Objects.equals(this.cname, dataForListCdnDomainsOutput.cname) &&
        Objects.equals(this.configStatus, dataForListCdnDomainsOutput.configStatus) &&
        Objects.equals(this.createTime, dataForListCdnDomainsOutput.createTime) &&
        Objects.equals(this.domain, dataForListCdnDomainsOutput.domain) &&
        Objects.equals(this.domainLock, dataForListCdnDomainsOutput.domainLock) &&
        Objects.equals(this.featureConfig, dataForListCdnDomainsOutput.featureConfig) &&
        Objects.equals(this.HTTPS, dataForListCdnDomainsOutput.HTTPS) &&
        Objects.equals(this.ipv6, dataForListCdnDomainsOutput.ipv6) &&
        Objects.equals(this.isConflictDomain, dataForListCdnDomainsOutput.isConflictDomain) &&
        Objects.equals(this.originProtocol, dataForListCdnDomainsOutput.originProtocol) &&
        Objects.equals(this.primaryOrigin, dataForListCdnDomainsOutput.primaryOrigin) &&
        Objects.equals(this.project, dataForListCdnDomainsOutput.project) &&
        Objects.equals(this.resourceTags, dataForListCdnDomainsOutput.resourceTags) &&
        Objects.equals(this.serviceRegion, dataForListCdnDomainsOutput.serviceRegion) &&
        Objects.equals(this.serviceType, dataForListCdnDomainsOutput.serviceType) &&
        Objects.equals(this.status, dataForListCdnDomainsOutput.status) &&
        Objects.equals(this.updateTime, dataForListCdnDomainsOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupCname, backupOrigin, cacheShared, cacheSharedTargetHost, cname, configStatus, createTime, domain, domainLock, featureConfig, HTTPS, ipv6, isConflictDomain, originProtocol, primaryOrigin, project, resourceTags, serviceRegion, serviceType, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForListCdnDomainsOutput {\n");
    
    sb.append("    backupCname: ").append(toIndentedString(backupCname)).append("\n");
    sb.append("    backupOrigin: ").append(toIndentedString(backupOrigin)).append("\n");
    sb.append("    cacheShared: ").append(toIndentedString(cacheShared)).append("\n");
    sb.append("    cacheSharedTargetHost: ").append(toIndentedString(cacheSharedTargetHost)).append("\n");
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
    sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    domainLock: ").append(toIndentedString(domainLock)).append("\n");
    sb.append("    featureConfig: ").append(toIndentedString(featureConfig)).append("\n");
    sb.append("    HTTPS: ").append(toIndentedString(HTTPS)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    isConflictDomain: ").append(toIndentedString(isConflictDomain)).append("\n");
    sb.append("    originProtocol: ").append(toIndentedString(originProtocol)).append("\n");
    sb.append("    primaryOrigin: ").append(toIndentedString(primaryOrigin)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
    sb.append("    serviceRegion: ").append(toIndentedString(serviceRegion)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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