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
import com.volcengine.seccenter20240508.model.FilterForListRepoImageLayerVulnInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListRepoImageLayerVulnRequest
 */



public class ListRepoImageLayerVulnRequest {
  @SerializedName("AssetID")
  private String assetID = null;

  @SerializedName("Filter")
  private FilterForListRepoImageLayerVulnInput filter = null;

  @SerializedName("LayerID")
  private String layerID = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  public ListRepoImageLayerVulnRequest assetID(String assetID) {
    this.assetID = assetID;
    return this;
  }

   /**
   * Get assetID
   * @return assetID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAssetID() {
    return assetID;
  }

  public void setAssetID(String assetID) {
    this.assetID = assetID;
  }

  public ListRepoImageLayerVulnRequest filter(FilterForListRepoImageLayerVulnInput filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Valid
  @Schema(description = "")
  public FilterForListRepoImageLayerVulnInput getFilter() {
    return filter;
  }

  public void setFilter(FilterForListRepoImageLayerVulnInput filter) {
    this.filter = filter;
  }

  public ListRepoImageLayerVulnRequest layerID(String layerID) {
    this.layerID = layerID;
    return this;
  }

   /**
   * Get layerID
   * @return layerID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLayerID() {
    return layerID;
  }

  public void setLayerID(String layerID) {
    this.layerID = layerID;
  }

  public ListRepoImageLayerVulnRequest pageNumber(Integer pageNumber) {
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

  public ListRepoImageLayerVulnRequest pageSize(Integer pageSize) {
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

  public ListRepoImageLayerVulnRequest sortBy(String sortBy) {
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

  public ListRepoImageLayerVulnRequest sortOrder(String sortOrder) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRepoImageLayerVulnRequest listRepoImageLayerVulnRequest = (ListRepoImageLayerVulnRequest) o;
    return Objects.equals(this.assetID, listRepoImageLayerVulnRequest.assetID) &&
        Objects.equals(this.filter, listRepoImageLayerVulnRequest.filter) &&
        Objects.equals(this.layerID, listRepoImageLayerVulnRequest.layerID) &&
        Objects.equals(this.pageNumber, listRepoImageLayerVulnRequest.pageNumber) &&
        Objects.equals(this.pageSize, listRepoImageLayerVulnRequest.pageSize) &&
        Objects.equals(this.sortBy, listRepoImageLayerVulnRequest.sortBy) &&
        Objects.equals(this.sortOrder, listRepoImageLayerVulnRequest.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetID, filter, layerID, pageNumber, pageSize, sortBy, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRepoImageLayerVulnRequest {\n");
    
    sb.append("    assetID: ").append(toIndentedString(assetID)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    layerID: ").append(toIndentedString(layerID)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
