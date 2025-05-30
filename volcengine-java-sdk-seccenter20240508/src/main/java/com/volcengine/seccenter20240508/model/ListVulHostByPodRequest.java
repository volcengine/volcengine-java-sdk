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
 * ListVulHostByPodRequest
 */



public class ListVulHostByPodRequest {
  @SerializedName("CloudProviders")
  private List<String> cloudProviders = null;

  @SerializedName("ClusterID")
  private String clusterID = null;

  @SerializedName("CwppID")
  private String cwppID = null;

  @SerializedName("HostName")
  private String hostName = null;

  @SerializedName("IP")
  private String IP = null;

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

  @SerializedName("Status")
  private List<String> status = null;

  @SerializedName("TopGroupID")
  private String topGroupID = null;

  @SerializedName("WorkloadID")
  private String workloadID = null;

  public ListVulHostByPodRequest cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public ListVulHostByPodRequest addCloudProvidersItem(String cloudProvidersItem) {
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

  public ListVulHostByPodRequest clusterID(String clusterID) {
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

  public ListVulHostByPodRequest cwppID(String cwppID) {
    this.cwppID = cwppID;
    return this;
  }

   /**
   * Get cwppID
   * @return cwppID
  **/
  @Schema(description = "")
  public String getCwppID() {
    return cwppID;
  }

  public void setCwppID(String cwppID) {
    this.cwppID = cwppID;
  }

  public ListVulHostByPodRequest hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @Schema(description = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public ListVulHostByPodRequest IP(String IP) {
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

  public ListVulHostByPodRequest leafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
    return this;
  }

  public ListVulHostByPodRequest addLeafGroupIDsItem(String leafGroupIDsItem) {
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

  public ListVulHostByPodRequest pageNumber(Integer pageNumber) {
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

  public ListVulHostByPodRequest pageSize(Integer pageSize) {
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

  public ListVulHostByPodRequest sortBy(String sortBy) {
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

  public ListVulHostByPodRequest sortOrder(String sortOrder) {
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

  public ListVulHostByPodRequest status(List<String> status) {
    this.status = status;
    return this;
  }

  public ListVulHostByPodRequest addStatusItem(String statusItem) {
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

  public ListVulHostByPodRequest topGroupID(String topGroupID) {
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

  public ListVulHostByPodRequest workloadID(String workloadID) {
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
    ListVulHostByPodRequest listVulHostByPodRequest = (ListVulHostByPodRequest) o;
    return Objects.equals(this.cloudProviders, listVulHostByPodRequest.cloudProviders) &&
        Objects.equals(this.clusterID, listVulHostByPodRequest.clusterID) &&
        Objects.equals(this.cwppID, listVulHostByPodRequest.cwppID) &&
        Objects.equals(this.hostName, listVulHostByPodRequest.hostName) &&
        Objects.equals(this.IP, listVulHostByPodRequest.IP) &&
        Objects.equals(this.leafGroupIDs, listVulHostByPodRequest.leafGroupIDs) &&
        Objects.equals(this.pageNumber, listVulHostByPodRequest.pageNumber) &&
        Objects.equals(this.pageSize, listVulHostByPodRequest.pageSize) &&
        Objects.equals(this.sortBy, listVulHostByPodRequest.sortBy) &&
        Objects.equals(this.sortOrder, listVulHostByPodRequest.sortOrder) &&
        Objects.equals(this.status, listVulHostByPodRequest.status) &&
        Objects.equals(this.topGroupID, listVulHostByPodRequest.topGroupID) &&
        Objects.equals(this.workloadID, listVulHostByPodRequest.workloadID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProviders, clusterID, cwppID, hostName, IP, leafGroupIDs, pageNumber, pageSize, sortBy, sortOrder, status, topGroupID, workloadID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVulHostByPodRequest {\n");
    
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    cwppID: ").append(toIndentedString(cwppID)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    leafGroupIDs: ").append(toIndentedString(leafGroupIDs)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    topGroupID: ").append(toIndentedString(topGroupID)).append("\n");
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
