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
 * ListBaselineCheckItemHostsRequest
 */



public class ListBaselineCheckItemHostsRequest {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("AgentIDList")
  private List<String> agentIDList = null;

  @SerializedName("AssetID")
  private String assetID = null;

  @SerializedName("AssetIDList")
  private List<String> assetIDList = null;

  @SerializedName("AssetName")
  private String assetName = null;

  /**
   * Gets or Sets assetType
   */
  @JsonAdapter(AssetTypeEnum.Adapter.class)
  public enum AssetTypeEnum {
    @SerializedName("Host")
    HOST("Host"),
    @SerializedName("Dev")
    DEV("Dev");

    private String value;

    AssetTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AssetTypeEnum fromValue(String input) {
      for (AssetTypeEnum b : AssetTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AssetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AssetTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AssetTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("AssetType")
  private AssetTypeEnum assetType = null;

  @SerializedName("BaselineID")
  private Integer baselineID = null;

  @SerializedName("CheckID")
  private Integer checkID = null;

  @SerializedName("CloudProviders")
  private List<String> cloudProviders = null;

  @SerializedName("ClusterName")
  private String clusterName = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("IP")
  private String IP = null;

  @SerializedName("LeafGroupIDs")
  private List<String> leafGroupIDs = null;

  @SerializedName("NodeIP")
  private String nodeIP = null;

  @SerializedName("NodeName")
  private String nodeName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("Result")
  private List<String> result = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  @SerializedName("Tag")
  private List<String> tag = null;

  @SerializedName("TopGroupID")
  private String topGroupID = null;

  public ListBaselineCheckItemHostsRequest agentID(String agentID) {
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

  public ListBaselineCheckItemHostsRequest agentIDList(List<String> agentIDList) {
    this.agentIDList = agentIDList;
    return this;
  }

  public ListBaselineCheckItemHostsRequest addAgentIDListItem(String agentIDListItem) {
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

  public ListBaselineCheckItemHostsRequest assetID(String assetID) {
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

  public ListBaselineCheckItemHostsRequest assetIDList(List<String> assetIDList) {
    this.assetIDList = assetIDList;
    return this;
  }

  public ListBaselineCheckItemHostsRequest addAssetIDListItem(String assetIDListItem) {
    if (this.assetIDList == null) {
      this.assetIDList = new ArrayList<String>();
    }
    this.assetIDList.add(assetIDListItem);
    return this;
  }

   /**
   * Get assetIDList
   * @return assetIDList
  **/
  @Schema(description = "")
  public List<String> getAssetIDList() {
    return assetIDList;
  }

  public void setAssetIDList(List<String> assetIDList) {
    this.assetIDList = assetIDList;
  }

  public ListBaselineCheckItemHostsRequest assetName(String assetName) {
    this.assetName = assetName;
    return this;
  }

   /**
   * Get assetName
   * @return assetName
  **/
  @Schema(description = "")
  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public ListBaselineCheckItemHostsRequest assetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public AssetTypeEnum getAssetType() {
    return assetType;
  }

  public void setAssetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
  }

  public ListBaselineCheckItemHostsRequest baselineID(Integer baselineID) {
    this.baselineID = baselineID;
    return this;
  }

   /**
   * Get baselineID
   * @return baselineID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getBaselineID() {
    return baselineID;
  }

  public void setBaselineID(Integer baselineID) {
    this.baselineID = baselineID;
  }

  public ListBaselineCheckItemHostsRequest checkID(Integer checkID) {
    this.checkID = checkID;
    return this;
  }

   /**
   * Get checkID
   * @return checkID
  **/
  @Schema(description = "")
  public Integer getCheckID() {
    return checkID;
  }

  public void setCheckID(Integer checkID) {
    this.checkID = checkID;
  }

  public ListBaselineCheckItemHostsRequest cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public ListBaselineCheckItemHostsRequest addCloudProvidersItem(String cloudProvidersItem) {
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

  public ListBaselineCheckItemHostsRequest clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Get clusterName
   * @return clusterName
  **/
  @Schema(description = "")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public ListBaselineCheckItemHostsRequest hostname(String hostname) {
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

  public ListBaselineCheckItemHostsRequest IP(String IP) {
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

  public ListBaselineCheckItemHostsRequest leafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
    return this;
  }

  public ListBaselineCheckItemHostsRequest addLeafGroupIDsItem(String leafGroupIDsItem) {
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

  public ListBaselineCheckItemHostsRequest nodeIP(String nodeIP) {
    this.nodeIP = nodeIP;
    return this;
  }

   /**
   * Get nodeIP
   * @return nodeIP
  **/
  @Schema(description = "")
  public String getNodeIP() {
    return nodeIP;
  }

  public void setNodeIP(String nodeIP) {
    this.nodeIP = nodeIP;
  }

  public ListBaselineCheckItemHostsRequest nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @Schema(description = "")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public ListBaselineCheckItemHostsRequest pageNumber(Integer pageNumber) {
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

  public ListBaselineCheckItemHostsRequest pageSize(Integer pageSize) {
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

  public ListBaselineCheckItemHostsRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ListBaselineCheckItemHostsRequest result(List<String> result) {
    this.result = result;
    return this;
  }

  public ListBaselineCheckItemHostsRequest addResultItem(String resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<String>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public List<String> getResult() {
    return result;
  }

  public void setResult(List<String> result) {
    this.result = result;
  }

  public ListBaselineCheckItemHostsRequest sortBy(String sortBy) {
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

  public ListBaselineCheckItemHostsRequest sortOrder(String sortOrder) {
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

  public ListBaselineCheckItemHostsRequest tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public ListBaselineCheckItemHostsRequest addTagItem(String tagItem) {
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

  public ListBaselineCheckItemHostsRequest topGroupID(String topGroupID) {
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
    ListBaselineCheckItemHostsRequest listBaselineCheckItemHostsRequest = (ListBaselineCheckItemHostsRequest) o;
    return Objects.equals(this.agentID, listBaselineCheckItemHostsRequest.agentID) &&
        Objects.equals(this.agentIDList, listBaselineCheckItemHostsRequest.agentIDList) &&
        Objects.equals(this.assetID, listBaselineCheckItemHostsRequest.assetID) &&
        Objects.equals(this.assetIDList, listBaselineCheckItemHostsRequest.assetIDList) &&
        Objects.equals(this.assetName, listBaselineCheckItemHostsRequest.assetName) &&
        Objects.equals(this.assetType, listBaselineCheckItemHostsRequest.assetType) &&
        Objects.equals(this.baselineID, listBaselineCheckItemHostsRequest.baselineID) &&
        Objects.equals(this.checkID, listBaselineCheckItemHostsRequest.checkID) &&
        Objects.equals(this.cloudProviders, listBaselineCheckItemHostsRequest.cloudProviders) &&
        Objects.equals(this.clusterName, listBaselineCheckItemHostsRequest.clusterName) &&
        Objects.equals(this.hostname, listBaselineCheckItemHostsRequest.hostname) &&
        Objects.equals(this.IP, listBaselineCheckItemHostsRequest.IP) &&
        Objects.equals(this.leafGroupIDs, listBaselineCheckItemHostsRequest.leafGroupIDs) &&
        Objects.equals(this.nodeIP, listBaselineCheckItemHostsRequest.nodeIP) &&
        Objects.equals(this.nodeName, listBaselineCheckItemHostsRequest.nodeName) &&
        Objects.equals(this.pageNumber, listBaselineCheckItemHostsRequest.pageNumber) &&
        Objects.equals(this.pageSize, listBaselineCheckItemHostsRequest.pageSize) &&
        Objects.equals(this.region, listBaselineCheckItemHostsRequest.region) &&
        Objects.equals(this.result, listBaselineCheckItemHostsRequest.result) &&
        Objects.equals(this.sortBy, listBaselineCheckItemHostsRequest.sortBy) &&
        Objects.equals(this.sortOrder, listBaselineCheckItemHostsRequest.sortOrder) &&
        Objects.equals(this.tag, listBaselineCheckItemHostsRequest.tag) &&
        Objects.equals(this.topGroupID, listBaselineCheckItemHostsRequest.topGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, agentIDList, assetID, assetIDList, assetName, assetType, baselineID, checkID, cloudProviders, clusterName, hostname, IP, leafGroupIDs, nodeIP, nodeName, pageNumber, pageSize, region, result, sortBy, sortOrder, tag, topGroupID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBaselineCheckItemHostsRequest {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    agentIDList: ").append(toIndentedString(agentIDList)).append("\n");
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    assetIDList: ").append(toIndentedString(assetIDList)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    baselineID: ").append(toIndentedString(baselineID)).append("\n");
    sb.append("    checkID: ").append(toIndentedString(checkID)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    leafGroupIDs: ").append(toIndentedString(leafGroupIDs)).append("\n");
    sb.append("    nodeIP: ").append(toIndentedString(nodeIP)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
