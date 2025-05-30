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
 * ListBaselinesRequest
 */



public class ListBaselinesRequest {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("AssetID")
  private String assetID = null;

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

  @SerializedName("BaselineName")
  private String baselineName = null;

  @SerializedName("CloudProviders")
  private List<String> cloudProviders = null;

  @SerializedName("ClusterID")
  private String clusterID = null;

  @SerializedName("GroupID")
  private Integer groupID = null;

  @SerializedName("LastDetectedTimeEnd")
  private Integer lastDetectedTimeEnd = null;

  @SerializedName("LastDetectedTimeStart")
  private Integer lastDetectedTimeStart = null;

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
  private String status = null;

  @SerializedName("TopGroupID")
  private String topGroupID = null;

  public ListBaselinesRequest agentID(String agentID) {
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

  public ListBaselinesRequest assetID(String assetID) {
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

  public ListBaselinesRequest assetType(AssetTypeEnum assetType) {
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

  public ListBaselinesRequest baselineName(String baselineName) {
    this.baselineName = baselineName;
    return this;
  }

   /**
   * Get baselineName
   * @return baselineName
  **/
  @Schema(description = "")
  public String getBaselineName() {
    return baselineName;
  }

  public void setBaselineName(String baselineName) {
    this.baselineName = baselineName;
  }

  public ListBaselinesRequest cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public ListBaselinesRequest addCloudProvidersItem(String cloudProvidersItem) {
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

  public ListBaselinesRequest clusterID(String clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * Get clusterID
   * @return clusterID
  **/
  @Schema(description = "")
  public String getClusterID() {
    return clusterID;
  }

  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  public ListBaselinesRequest groupID(Integer groupID) {
    this.groupID = groupID;
    return this;
  }

   /**
   * Get groupID
   * @return groupID
  **/
  @Schema(description = "")
  public Integer getGroupID() {
    return groupID;
  }

  public void setGroupID(Integer groupID) {
    this.groupID = groupID;
  }

  public ListBaselinesRequest lastDetectedTimeEnd(Integer lastDetectedTimeEnd) {
    this.lastDetectedTimeEnd = lastDetectedTimeEnd;
    return this;
  }

   /**
   * Get lastDetectedTimeEnd
   * @return lastDetectedTimeEnd
  **/
  @Schema(description = "")
  public Integer getLastDetectedTimeEnd() {
    return lastDetectedTimeEnd;
  }

  public void setLastDetectedTimeEnd(Integer lastDetectedTimeEnd) {
    this.lastDetectedTimeEnd = lastDetectedTimeEnd;
  }

  public ListBaselinesRequest lastDetectedTimeStart(Integer lastDetectedTimeStart) {
    this.lastDetectedTimeStart = lastDetectedTimeStart;
    return this;
  }

   /**
   * Get lastDetectedTimeStart
   * @return lastDetectedTimeStart
  **/
  @Schema(description = "")
  public Integer getLastDetectedTimeStart() {
    return lastDetectedTimeStart;
  }

  public void setLastDetectedTimeStart(Integer lastDetectedTimeStart) {
    this.lastDetectedTimeStart = lastDetectedTimeStart;
  }

  public ListBaselinesRequest leafGroupIDs(List<String> leafGroupIDs) {
    this.leafGroupIDs = leafGroupIDs;
    return this;
  }

  public ListBaselinesRequest addLeafGroupIDsItem(String leafGroupIDsItem) {
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

  public ListBaselinesRequest pageNumber(Integer pageNumber) {
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

  public ListBaselinesRequest pageSize(Integer pageSize) {
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

  public ListBaselinesRequest sortBy(String sortBy) {
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

  public ListBaselinesRequest sortOrder(String sortOrder) {
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

  public ListBaselinesRequest status(String status) {
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

  public ListBaselinesRequest topGroupID(String topGroupID) {
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
    ListBaselinesRequest listBaselinesRequest = (ListBaselinesRequest) o;
    return Objects.equals(this.agentID, listBaselinesRequest.agentID) &&
        Objects.equals(this.assetID, listBaselinesRequest.assetID) &&
        Objects.equals(this.assetType, listBaselinesRequest.assetType) &&
        Objects.equals(this.baselineName, listBaselinesRequest.baselineName) &&
        Objects.equals(this.cloudProviders, listBaselinesRequest.cloudProviders) &&
        Objects.equals(this.clusterID, listBaselinesRequest.clusterID) &&
        Objects.equals(this.groupID, listBaselinesRequest.groupID) &&
        Objects.equals(this.lastDetectedTimeEnd, listBaselinesRequest.lastDetectedTimeEnd) &&
        Objects.equals(this.lastDetectedTimeStart, listBaselinesRequest.lastDetectedTimeStart) &&
        Objects.equals(this.leafGroupIDs, listBaselinesRequest.leafGroupIDs) &&
        Objects.equals(this.pageNumber, listBaselinesRequest.pageNumber) &&
        Objects.equals(this.pageSize, listBaselinesRequest.pageSize) &&
        Objects.equals(this.sortBy, listBaselinesRequest.sortBy) &&
        Objects.equals(this.sortOrder, listBaselinesRequest.sortOrder) &&
        Objects.equals(this.status, listBaselinesRequest.status) &&
        Objects.equals(this.topGroupID, listBaselinesRequest.topGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, assetID, assetType, baselineName, cloudProviders, clusterID, groupID, lastDetectedTimeEnd, lastDetectedTimeStart, leafGroupIDs, pageNumber, pageSize, sortBy, sortOrder, status, topGroupID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBaselinesRequest {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    baselineName: ").append(toIndentedString(baselineName)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    groupID: ").append(toIndentedString(groupID)).append("\n");
    sb.append("    lastDetectedTimeEnd: ").append(toIndentedString(lastDetectedTimeEnd)).append("\n");
    sb.append("    lastDetectedTimeStart: ").append(toIndentedString(lastDetectedTimeStart)).append("\n");
    sb.append("    leafGroupIDs: ").append(toIndentedString(leafGroupIDs)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
