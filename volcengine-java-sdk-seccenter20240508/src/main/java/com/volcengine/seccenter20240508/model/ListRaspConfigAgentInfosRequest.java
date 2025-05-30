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
 * ListRaspConfigAgentInfosRequest
 */



public class ListRaspConfigAgentInfosRequest {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("CloudProviders")
  private List<String> cloudProviders = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("IP")
  private String IP = null;

  @SerializedName("LeafGroupIDs")
  private List<String> leafGroupIDs = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RaspEnableStatus")
  private List<String> raspEnableStatus = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  @SerializedName("Tags")
  private List<String> tags = null;

  @SerializedName("TopGroupID")
  private String topGroupID = null;

  public ListRaspConfigAgentInfosRequest agentID(String agentID) {
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

  public ListRaspConfigAgentInfosRequest cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public ListRaspConfigAgentInfosRequest addCloudProvidersItem(String cloudProvidersItem) {
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

  public ListRaspConfigAgentInfosRequest hostname(String hostname) {
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

  public ListRaspConfigAgentInfosRequest IP(String IP) {
    this.IP = IP;
    return this;
  }

   /**
   * Get IP
   * @return IP
  **/
  @Schema(description = "")
  public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }

  public ListRaspConfigAgentInfosRequest leafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
    return this;
  }

  public ListRaspConfigAgentInfosRequest addLeafGroupIDsItem(String leafGroupIDsItem) {
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

  public ListRaspConfigAgentInfosRequest pageNumber(Integer pageNumber) {
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

  public ListRaspConfigAgentInfosRequest pageSize(Integer pageSize) {
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

  public ListRaspConfigAgentInfosRequest raspEnableStatus(List<String> raspEnableStatus) {
    this.raspEnableStatus = raspEnableStatus;
    return this;
  }

  public ListRaspConfigAgentInfosRequest addRaspEnableStatusItem(String raspEnableStatusItem) {
    if (this.raspEnableStatus == null) {
      this.raspEnableStatus = new ArrayList<String>();
    }
    this.raspEnableStatus.add(raspEnableStatusItem);
    return this;
  }

   /**
   * Get raspEnableStatus
   * @return raspEnableStatus
  **/
  @Schema(description = "")
  public List<String> getRaspEnableStatus() {
    return raspEnableStatus;
  }

  public void setRaspEnableStatus(List<String> raspEnableStatus) {
    this.raspEnableStatus = raspEnableStatus;
  }

  public ListRaspConfigAgentInfosRequest sortBy(String sortBy) {
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

  public ListRaspConfigAgentInfosRequest sortOrder(String sortOrder) {
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

  public ListRaspConfigAgentInfosRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ListRaspConfigAgentInfosRequest addTagsItem(String tagsItem) {
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

  public ListRaspConfigAgentInfosRequest topGroupID(String topGroupID) {
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
    ListRaspConfigAgentInfosRequest listRaspConfigAgentInfosRequest = (ListRaspConfigAgentInfosRequest) o;
    return Objects.equals(this.agentID, listRaspConfigAgentInfosRequest.agentID) &&
        Objects.equals(this.cloudProviders, listRaspConfigAgentInfosRequest.cloudProviders) &&
        Objects.equals(this.hostname, listRaspConfigAgentInfosRequest.hostname) &&
        Objects.equals(this.IP, listRaspConfigAgentInfosRequest.IP) &&
        Objects.equals(this.leafGroupIDs, listRaspConfigAgentInfosRequest.leafGroupIDs) &&
        Objects.equals(this.pageNumber, listRaspConfigAgentInfosRequest.pageNumber) &&
        Objects.equals(this.pageSize, listRaspConfigAgentInfosRequest.pageSize) &&
        Objects.equals(this.raspEnableStatus, listRaspConfigAgentInfosRequest.raspEnableStatus) &&
        Objects.equals(this.sortBy, listRaspConfigAgentInfosRequest.sortBy) &&
        Objects.equals(this.sortOrder, listRaspConfigAgentInfosRequest.sortOrder) &&
        Objects.equals(this.tags, listRaspConfigAgentInfosRequest.tags) &&
        Objects.equals(this.topGroupID, listRaspConfigAgentInfosRequest.topGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, cloudProviders, hostname, IP, leafGroupIDs, pageNumber, pageSize, raspEnableStatus, sortBy, sortOrder, tags, topGroupID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRaspConfigAgentInfosRequest {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    leafGroupIDs: ").append(toIndentedString(leafGroupIDs)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    raspEnableStatus: ").append(toIndentedString(raspEnableStatus)).append("\n");
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
