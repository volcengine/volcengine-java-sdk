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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetAutoIsolateAgentListRequest
 */



public class GetAutoIsolateAgentListRequest {
  @SerializedName("AgentId")
  private String agentId = null;

  @SerializedName("CloudProviders")
  private List<String> cloudProviders = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("Ip")
  private String ip = null;

  @SerializedName("LeafGroupIDs")
  private List<String> leafGroupIDs = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  @SerializedName("Tags")
  private List<String> tags = null;

  @SerializedName("TopGroupID")
  private String topGroupID = null;

  public GetAutoIsolateAgentListRequest agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @Schema(description = "")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public GetAutoIsolateAgentListRequest cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public GetAutoIsolateAgentListRequest addCloudProvidersItem(String cloudProvidersItem) {
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

  public GetAutoIsolateAgentListRequest hostname(String hostname) {
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

  public GetAutoIsolateAgentListRequest ip(String ip) {
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

  public GetAutoIsolateAgentListRequest leafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
    return this;
  }

  public GetAutoIsolateAgentListRequest addLeafGroupIDsItem(String leafGroupIDsItem) {
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

  public GetAutoIsolateAgentListRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public GetAutoIsolateAgentListRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public GetAutoIsolateAgentListRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @Schema(description = "")
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public GetAutoIsolateAgentListRequest sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @Schema(description = "")
  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public GetAutoIsolateAgentListRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetAutoIsolateAgentListRequest addTagsItem(String tagsItem) {
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

  public GetAutoIsolateAgentListRequest topGroupID(String topGroupID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAutoIsolateAgentListRequest getAutoIsolateAgentListRequest = (GetAutoIsolateAgentListRequest) o;
    return Objects.equals(this.agentId, getAutoIsolateAgentListRequest.agentId) &&
        Objects.equals(this.cloudProviders, getAutoIsolateAgentListRequest.cloudProviders) &&
        Objects.equals(this.hostname, getAutoIsolateAgentListRequest.hostname) &&
        Objects.equals(this.ip, getAutoIsolateAgentListRequest.ip) &&
        Objects.equals(this.leafGroupIDs, getAutoIsolateAgentListRequest.leafGroupIDs) &&
        Objects.equals(this.pageNumber, getAutoIsolateAgentListRequest.pageNumber) &&
        Objects.equals(this.pageSize, getAutoIsolateAgentListRequest.pageSize) &&
        Objects.equals(this.sortBy, getAutoIsolateAgentListRequest.sortBy) &&
        Objects.equals(this.sortOrder, getAutoIsolateAgentListRequest.sortOrder) &&
        Objects.equals(this.tags, getAutoIsolateAgentListRequest.tags) &&
        Objects.equals(this.topGroupID, getAutoIsolateAgentListRequest.topGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, cloudProviders, hostname, ip, leafGroupIDs, pageNumber, pageSize, sortBy, sortOrder, tags, topGroupID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAutoIsolateAgentListRequest {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    leafGroupIDs: ").append(toIndentedString(leafGroupIDs)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    topGroupID: ").append(toIndentedString(topGroupID)).append("\n");
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
