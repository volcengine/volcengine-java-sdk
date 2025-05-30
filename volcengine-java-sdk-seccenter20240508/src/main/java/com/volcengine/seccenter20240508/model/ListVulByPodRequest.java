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
 * ListVulByPodRequest
 */



public class ListVulByPodRequest {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("AssetID")
  private String assetID = null;

  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("CloudProviders")
  private List<String> cloudProviders = null;

  @SerializedName("ClusterID")
  private String clusterID = null;

  @SerializedName("CreateTimeEnd")
  private Integer createTimeEnd = null;

  @SerializedName("CreateTimeStart")
  private Integer createTimeStart = null;

  @SerializedName("CveID")
  private String cveID = null;

  @SerializedName("IfHighAvailability")
  private Boolean ifHighAvailability = null;

  @SerializedName("LeafGroupIDs")
  private List<String> leafGroupIDs = null;

  @SerializedName("Level")
  private List<String> level = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  @SerializedName("Status")
  private List<String> status = null;

  @SerializedName("Tag")
  private List<String> tag = null;

  @SerializedName("TopGroupID")
  private String topGroupID = null;

  @SerializedName("VulnName")
  private String vulnName = null;

  @SerializedName("VulnTypeList")
  private List<String> vulnTypeList = null;

  @SerializedName("WorkloadID")
  private String workloadID = null;

  public ListVulByPodRequest agentID(String agentID) {
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

  public ListVulByPodRequest assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

   /**
   * Get assetID
   * @return assetID
  **/
  @Schema(description = "")
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  public ListVulByPodRequest assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public ListVulByPodRequest cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public ListVulByPodRequest addCloudProvidersItem(String cloudProvidersItem) {
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

  public ListVulByPodRequest clusterID(String clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * Get clusterID
   * @return clusterID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterID() {
    return clusterID;
  }

  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  public ListVulByPodRequest createTimeEnd(Integer createTimeEnd) {
    this.createTimeEnd = createTimeEnd;
    return this;
  }

   /**
   * Get createTimeEnd
   * @return createTimeEnd
  **/
  @Schema(description = "")
  public Integer getCreateTimeEnd() {
    return createTimeEnd;
  }

  public void setCreateTimeEnd(Integer createTimeEnd) {
    this.createTimeEnd = createTimeEnd;
  }

  public ListVulByPodRequest createTimeStart(Integer createTimeStart) {
    this.createTimeStart = createTimeStart;
    return this;
  }

   /**
   * Get createTimeStart
   * @return createTimeStart
  **/
  @Schema(description = "")
  public Integer getCreateTimeStart() {
    return createTimeStart;
  }

  public void setCreateTimeStart(Integer createTimeStart) {
    this.createTimeStart = createTimeStart;
  }

  public ListVulByPodRequest cveID(String cveID) {
    this.cveID = cveID;
    return this;
  }

   /**
   * Get cveID
   * @return cveID
  **/
  @Schema(description = "")
  public String getCveID() {
    return cveID;
  }

  public void setCveID(String cveID) {
    this.cveID = cveID;
  }

  public ListVulByPodRequest ifHighAvailability(Boolean ifHighAvailability) {
    this.ifHighAvailability = ifHighAvailability;
    return this;
  }

   /**
   * Get ifHighAvailability
   * @return ifHighAvailability
  **/
  @Schema(description = "")
  public Boolean isIfHighAvailability() {
    return ifHighAvailability;
  }

  public void setIfHighAvailability(Boolean ifHighAvailability) {
    this.ifHighAvailability = ifHighAvailability;
  }

  public ListVulByPodRequest leafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
    return this;
  }

  public ListVulByPodRequest addLeafGroupIDsItem(String leafGroupIDsItem) {
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

  public ListVulByPodRequest level(List<String> level) {
    this.level = level;
    return this;
  }

  public ListVulByPodRequest addLevelItem(String levelItem) {
    if (this.level == null) {
      this.level = new ArrayList<String>();
    }
    this.level.add(levelItem);
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public List<String> getLevel() {
    return level;
  }

  public void setLevel(List<String> level) {
    this.level = level;
  }

  public ListVulByPodRequest pageNumber(Integer pageNumber) {
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

  public ListVulByPodRequest pageSize(Integer pageSize) {
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

  public ListVulByPodRequest sortBy(String sortBy) {
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

  public ListVulByPodRequest sortOrder(String sortOrder) {
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

  public ListVulByPodRequest status(List<String> status) {
    this.status = status;
    return this;
  }

  public ListVulByPodRequest addStatusItem(String statusItem) {
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

  public ListVulByPodRequest tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public ListVulByPodRequest addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<String>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public List<String> getTag() {
    return tag;
  }

  public void setTag(List<String> tag) {
    this.tag = tag;
  }

  public ListVulByPodRequest topGroupID(String topGroupID) {
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

  public ListVulByPodRequest vulnName(String vulnName) {
    this.vulnName = vulnName;
    return this;
  }

   /**
   * Get vulnName
   * @return vulnName
  **/
  @Schema(description = "")
  public String getVulnName() {
    return vulnName;
  }

  public void setVulnName(String vulnName) {
    this.vulnName = vulnName;
  }

  public ListVulByPodRequest vulnTypeList(List<String> vulnTypeList) {
    this.vulnTypeList = vulnTypeList;
    return this;
  }

  public ListVulByPodRequest addVulnTypeListItem(String vulnTypeListItem) {
    if (this.vulnTypeList == null) {
      this.vulnTypeList = new ArrayList<String>();
    }
    this.vulnTypeList.add(vulnTypeListItem);
    return this;
  }

   /**
   * Get vulnTypeList
   * @return vulnTypeList
  **/
  @Schema(description = "")
  public List<String> getVulnTypeList() {
    return vulnTypeList;
  }

  public void setVulnTypeList(List<String> vulnTypeList) {
    this.vulnTypeList = vulnTypeList;
  }

  public ListVulByPodRequest workloadID(String workloadID) {
    this.workloadID = workloadID;
    return this;
  }

   /**
   * Get workloadID
   * @return workloadID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getWorkloadID() {
    return workloadID;
  }

  public void setWorkloadID(String workloadID) {
    this.workloadID = workloadID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVulByPodRequest listVulByPodRequest = (ListVulByPodRequest) o;
    return Objects.equals(this.agentID, listVulByPodRequest.agentID) &&
        Objects.equals(this.assetID, listVulByPodRequest.assetID) &&
        Objects.equals(this.assetType, listVulByPodRequest.assetType) &&
        Objects.equals(this.cloudProviders, listVulByPodRequest.cloudProviders) &&
        Objects.equals(this.clusterID, listVulByPodRequest.clusterID) &&
        Objects.equals(this.createTimeEnd, listVulByPodRequest.createTimeEnd) &&
        Objects.equals(this.createTimeStart, listVulByPodRequest.createTimeStart) &&
        Objects.equals(this.cveID, listVulByPodRequest.cveID) &&
        Objects.equals(this.ifHighAvailability, listVulByPodRequest.ifHighAvailability) &&
        Objects.equals(this.leafGroupIDs, listVulByPodRequest.leafGroupIDs) &&
        Objects.equals(this.level, listVulByPodRequest.level) &&
        Objects.equals(this.pageNumber, listVulByPodRequest.pageNumber) &&
        Objects.equals(this.pageSize, listVulByPodRequest.pageSize) &&
        Objects.equals(this.sortBy, listVulByPodRequest.sortBy) &&
        Objects.equals(this.sortOrder, listVulByPodRequest.sortOrder) &&
        Objects.equals(this.status, listVulByPodRequest.status) &&
        Objects.equals(this.tag, listVulByPodRequest.tag) &&
        Objects.equals(this.topGroupID, listVulByPodRequest.topGroupID) &&
        Objects.equals(this.vulnName, listVulByPodRequest.vulnName) &&
        Objects.equals(this.vulnTypeList, listVulByPodRequest.vulnTypeList) &&
        Objects.equals(this.workloadID, listVulByPodRequest.workloadID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, assetID, assetType, cloudProviders, clusterID, createTimeEnd, createTimeStart, cveID, ifHighAvailability, leafGroupIDs, level, pageNumber, pageSize, sortBy, sortOrder, status, tag, topGroupID, vulnName, vulnTypeList, workloadID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVulByPodRequest {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
    sb.append("    createTimeStart: ").append(toIndentedString(createTimeStart)).append("\n");
    sb.append("    cveID: ").append(toIndentedString(cveID)).append("\n");
    sb.append("    ifHighAvailability: ").append(toIndentedString(ifHighAvailability)).append("\n");
    sb.append("    leafGroupIDs: ").append(toIndentedString(leafGroupIDs)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    topGroupID: ").append(toIndentedString(topGroupID)).append("\n");
    sb.append("    vulnName: ").append(toIndentedString(vulnName)).append("\n");
    sb.append("    vulnTypeList: ").append(toIndentedString(vulnTypeList)).append("\n");
    sb.append("    workloadID: ").append(toIndentedString(workloadID)).append("\n");
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
