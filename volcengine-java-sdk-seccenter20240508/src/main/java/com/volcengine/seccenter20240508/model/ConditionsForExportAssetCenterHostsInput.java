/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.seccenter20240508.model.RiskForExportAssetCenterHostsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConditionsForExportAssetCenterHostsInput
 */



public class ConditionsForExportAssetCenterHostsInput {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("AgentIDList")
  private List<String> agentIDList = null;

  @SerializedName("AgentStatus")
  private List<String> agentStatus = null;

  @SerializedName("AllHost")
  private Boolean allHost = null;

  @SerializedName("CloudProviders")
  private List<String> cloudProviders = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("LeafGroupIDs")
  private List<String> leafGroupIDs = null;

  @SerializedName("Platforms")
  private List<String> platforms = null;

  @SerializedName("ProxyName")
  private String proxyName = null;

  @SerializedName("ProxyServerName")
  private String proxyServerName = null;

  @SerializedName("Regions")
  private List<String> regions = null;

  @SerializedName("Risk")
  private RiskForExportAssetCenterHostsInput risk = null;

  @SerializedName("SecurityEnhancement")
  private Boolean securityEnhancement = null;

  @SerializedName("Status")
  private List<String> status = null;

  @SerializedName("Tags")
  private List<String> tags = null;

  @SerializedName("TopGroupID")
  private String topGroupID = null;

  @SerializedName("VirusFileAutoIsolate")
  private Boolean virusFileAutoIsolate = null;

  @SerializedName("Visibility")
  private List<String> visibility = null;

  @SerializedName("VpcIds")
  private List<String> vpcIds = null;

  public ConditionsForExportAssetCenterHostsInput agentID(String agentID) {
    this.agentID = agentID;
    return this;
  }

   /**
   * Get agentID
   * @return agentID
  **/
  @Schema(description = "")
  public String getAgentID() {
    return agentID;
  }

  public void setAgentID(String agentID) {
    this.agentID = agentID;
  }

  public ConditionsForExportAssetCenterHostsInput agentIDList(List<String> agentIDList) {
    this.agentIDList = agentIDList;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addAgentIDListItem(String agentIDListItem) {
    if (this.agentIDList == null) {
      this.agentIDList = new ArrayList<String>();
    }
    this.agentIDList.add(agentIDListItem);
    return this;
  }

   /**
   * Get agentIDList
   * @return agentIDList
  **/
  @Schema(description = "")
  public List<String> getAgentIDList() {
    return agentIDList;
  }

  public void setAgentIDList(List<String> agentIDList) {
    this.agentIDList = agentIDList;
  }

  public ConditionsForExportAssetCenterHostsInput agentStatus(List<String> agentStatus) {
    this.agentStatus = agentStatus;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addAgentStatusItem(String agentStatusItem) {
    if (this.agentStatus == null) {
      this.agentStatus = new ArrayList<String>();
    }
    this.agentStatus.add(agentStatusItem);
    return this;
  }

   /**
   * Get agentStatus
   * @return agentStatus
  **/
  @Schema(description = "")
  public List<String> getAgentStatus() {
    return agentStatus;
  }

  public void setAgentStatus(List<String> agentStatus) {
    this.agentStatus = agentStatus;
  }

  public ConditionsForExportAssetCenterHostsInput allHost(Boolean allHost) {
    this.allHost = allHost;
    return this;
  }

   /**
   * Get allHost
   * @return allHost
  **/
  @Schema(description = "")
  public Boolean isAllHost() {
    return allHost;
  }

  public void setAllHost(Boolean allHost) {
    this.allHost = allHost;
  }

  public ConditionsForExportAssetCenterHostsInput cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addCloudProvidersItem(String cloudProvidersItem) {
    if (this.cloudProviders == null) {
      this.cloudProviders = new ArrayList<String>();
    }
    this.cloudProviders.add(cloudProvidersItem);
    return this;
  }

   /**
   * Get cloudProviders
   * @return cloudProviders
  **/
  @Schema(description = "")
  public List<String> getCloudProviders() {
    return cloudProviders;
  }

  public void setCloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
  }

  public ConditionsForExportAssetCenterHostsInput hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ConditionsForExportAssetCenterHostsInput ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public ConditionsForExportAssetCenterHostsInput leafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addLeafGroupIDsItem(String leafGroupIDsItem) {
    if (this.leafGroupIDs == null) {
      this.leafGroupIDs = new ArrayList<String>();
    }
    this.leafGroupIDs.add(leafGroupIDsItem);
    return this;
  }

   /**
   * Get leafGroupIDs
   * @return leafGroupIDs
  **/
  @Schema(description = "")
  public List<String> getLeafGroupIDs() {
    return leafGroupIDs;
  }

  public void setLeafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
  }

  public ConditionsForExportAssetCenterHostsInput platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<String>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * Get platforms
   * @return platforms
  **/
  @Schema(description = "")
  public List<String> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }

  public ConditionsForExportAssetCenterHostsInput proxyName(String proxyName) {
    this.proxyName = proxyName;
    return this;
  }

   /**
   * Get proxyName
   * @return proxyName
  **/
  @Schema(description = "")
  public String getProxyName() {
    return proxyName;
  }

  public void setProxyName(String proxyName) {
    this.proxyName = proxyName;
  }

  public ConditionsForExportAssetCenterHostsInput proxyServerName(String proxyServerName) {
    this.proxyServerName = proxyServerName;
    return this;
  }

   /**
   * Get proxyServerName
   * @return proxyServerName
  **/
  @Schema(description = "")
  public String getProxyServerName() {
    return proxyServerName;
  }

  public void setProxyServerName(String proxyServerName) {
    this.proxyServerName = proxyServerName;
  }

  public ConditionsForExportAssetCenterHostsInput regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<String>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @Schema(description = "")
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
  }

  public ConditionsForExportAssetCenterHostsInput risk(RiskForExportAssetCenterHostsInput risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @Valid
  @Schema(description = "")
  public RiskForExportAssetCenterHostsInput getRisk() {
    return risk;
  }

  public void setRisk(RiskForExportAssetCenterHostsInput risk) {
    this.risk = risk;
  }

  public ConditionsForExportAssetCenterHostsInput securityEnhancement(Boolean securityEnhancement) {
    this.securityEnhancement = securityEnhancement;
    return this;
  }

   /**
   * Get securityEnhancement
   * @return securityEnhancement
  **/
  @Schema(description = "")
  public Boolean isSecurityEnhancement() {
    return securityEnhancement;
  }

  public void setSecurityEnhancement(Boolean securityEnhancement) {
    this.securityEnhancement = securityEnhancement;
  }

  public ConditionsForExportAssetCenterHostsInput status(List<String> status) {
    this.status = status;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<String>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }

  public ConditionsForExportAssetCenterHostsInput tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ConditionsForExportAssetCenterHostsInput topGroupID(String topGroupID) {
    this.topGroupID = topGroupID;
    return this;
  }

   /**
   * Get topGroupID
   * @return topGroupID
  **/
  @Schema(description = "")
  public String getTopGroupID() {
    return topGroupID;
  }

  public void setTopGroupID(String topGroupID) {
    this.topGroupID = topGroupID;
  }

  public ConditionsForExportAssetCenterHostsInput virusFileAutoIsolate(Boolean virusFileAutoIsolate) {
    this.virusFileAutoIsolate = virusFileAutoIsolate;
    return this;
  }

   /**
   * Get virusFileAutoIsolate
   * @return virusFileAutoIsolate
  **/
  @Schema(description = "")
  public Boolean isVirusFileAutoIsolate() {
    return virusFileAutoIsolate;
  }

  public void setVirusFileAutoIsolate(Boolean virusFileAutoIsolate) {
    this.virusFileAutoIsolate = virusFileAutoIsolate;
  }

  public ConditionsForExportAssetCenterHostsInput visibility(List<String> visibility) {
    this.visibility = visibility;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addVisibilityItem(String visibilityItem) {
    if (this.visibility == null) {
      this.visibility = new ArrayList<String>();
    }
    this.visibility.add(visibilityItem);
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @Schema(description = "")
  public List<String> getVisibility() {
    return visibility;
  }

  public void setVisibility(List<String> visibility) {
    this.visibility = visibility;
  }

  public ConditionsForExportAssetCenterHostsInput vpcIds(List<String> vpcIds) {
    this.vpcIds = vpcIds;
    return this;
  }

  public ConditionsForExportAssetCenterHostsInput addVpcIdsItem(String vpcIdsItem) {
    if (this.vpcIds == null) {
      this.vpcIds = new ArrayList<String>();
    }
    this.vpcIds.add(vpcIdsItem);
    return this;
  }

   /**
   * Get vpcIds
   * @return vpcIds
  **/
  @Schema(description = "")
  public List<String> getVpcIds() {
    return vpcIds;
  }

  public void setVpcIds(List<String> vpcIds) {
    this.vpcIds = vpcIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionsForExportAssetCenterHostsInput conditionsForExportAssetCenterHostsInput = (ConditionsForExportAssetCenterHostsInput) o;
    return Objects.equals(this.agentID, conditionsForExportAssetCenterHostsInput.agentID) &&
        Objects.equals(this.agentIDList, conditionsForExportAssetCenterHostsInput.agentIDList) &&
        Objects.equals(this.agentStatus, conditionsForExportAssetCenterHostsInput.agentStatus) &&
        Objects.equals(this.allHost, conditionsForExportAssetCenterHostsInput.allHost) &&
        Objects.equals(this.cloudProviders, conditionsForExportAssetCenterHostsInput.cloudProviders) &&
        Objects.equals(this.hostname, conditionsForExportAssetCenterHostsInput.hostname) &&
        Objects.equals(this.ip, conditionsForExportAssetCenterHostsInput.ip) &&
        Objects.equals(this.leafGroupIDs, conditionsForExportAssetCenterHostsInput.leafGroupIDs) &&
        Objects.equals(this.platforms, conditionsForExportAssetCenterHostsInput.platforms) &&
        Objects.equals(this.proxyName, conditionsForExportAssetCenterHostsInput.proxyName) &&
        Objects.equals(this.proxyServerName, conditionsForExportAssetCenterHostsInput.proxyServerName) &&
        Objects.equals(this.regions, conditionsForExportAssetCenterHostsInput.regions) &&
        Objects.equals(this.risk, conditionsForExportAssetCenterHostsInput.risk) &&
        Objects.equals(this.securityEnhancement, conditionsForExportAssetCenterHostsInput.securityEnhancement) &&
        Objects.equals(this.status, conditionsForExportAssetCenterHostsInput.status) &&
        Objects.equals(this.tags, conditionsForExportAssetCenterHostsInput.tags) &&
        Objects.equals(this.topGroupID, conditionsForExportAssetCenterHostsInput.topGroupID) &&
        Objects.equals(this.virusFileAutoIsolate, conditionsForExportAssetCenterHostsInput.virusFileAutoIsolate) &&
        Objects.equals(this.visibility, conditionsForExportAssetCenterHostsInput.visibility) &&
        Objects.equals(this.vpcIds, conditionsForExportAssetCenterHostsInput.vpcIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, agentIDList, agentStatus, allHost, cloudProviders, hostname, ip, leafGroupIDs, platforms, proxyName, proxyServerName, regions, risk, securityEnhancement, status, tags, topGroupID, virusFileAutoIsolate, visibility, vpcIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionsForExportAssetCenterHostsInput {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    agentIDList: ").append(toIndentedString(agentIDList)).append("\n");
    sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
    sb.append("    allHost: ").append(toIndentedString(allHost)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    leafGroupIDs: ").append(toIndentedString(leafGroupIDs)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
    sb.append("    proxyServerName: ").append(toIndentedString(proxyServerName)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    securityEnhancement: ").append(toIndentedString(securityEnhancement)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    topGroupID: ").append(toIndentedString(topGroupID)).append("\n");
    sb.append("    virusFileAutoIsolate: ").append(toIndentedString(virusFileAutoIsolate)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    vpcIds: ").append(toIndentedString(vpcIds)).append("\n");
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
