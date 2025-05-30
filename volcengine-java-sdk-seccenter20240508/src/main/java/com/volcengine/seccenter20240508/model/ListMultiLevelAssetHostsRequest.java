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
import com.volcengine.seccenter20240508.model.ConditionsForListMultiLevelAssetHostsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListMultiLevelAssetHostsRequest
 */



public class ListMultiLevelAssetHostsRequest {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("Conditions")
  private ConditionsForListMultiLevelAssetHostsInput conditions = null;

  @SerializedName("IdList")
  private List<String> idList = null;

  @SerializedName("InstitutionID")
  private String institutionID = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  public ListMultiLevelAssetHostsRequest accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public ListMultiLevelAssetHostsRequest conditions(ConditionsForListMultiLevelAssetHostsInput conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Valid
  @Schema(description = "")
  public ConditionsForListMultiLevelAssetHostsInput getConditions() {
    return conditions;
  }

  public void setConditions(ConditionsForListMultiLevelAssetHostsInput conditions) {
    this.conditions = conditions;
  }

  public ListMultiLevelAssetHostsRequest idList(List<String> idList) {
    this.idList = idList;
    return this;
  }

  public ListMultiLevelAssetHostsRequest addIdListItem(String idListItem) {
    if (this.idList == null) {
      this.idList = new ArrayList<String>();
    }
    this.idList.add(idListItem);
    return this;
  }

   /**
   * Get idList
   * @return idList
  **/
  @Schema(description = "")
  public List<String> getIdList() {
    return idList;
  }

  public void setIdList(List<String> idList) {
    this.idList = idList;
  }

  public ListMultiLevelAssetHostsRequest institutionID(String institutionID) {
    this.institutionID = institutionID;
    return this;
  }

   /**
   * Get institutionID
   * @return institutionID
  **/
  @Schema(description = "")
  public String getInstitutionID() {
    return institutionID;
  }

  public void setInstitutionID(String institutionID) {
    this.institutionID = institutionID;
  }

  public ListMultiLevelAssetHostsRequest pageNumber(Integer pageNumber) {
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

  public ListMultiLevelAssetHostsRequest pageSize(Integer pageSize) {
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

  public ListMultiLevelAssetHostsRequest sortBy(String sortBy) {
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

  public ListMultiLevelAssetHostsRequest sortOrder(String sortOrder) {
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
    ListMultiLevelAssetHostsRequest listMultiLevelAssetHostsRequest = (ListMultiLevelAssetHostsRequest) o;
    return Objects.equals(this.accountID, listMultiLevelAssetHostsRequest.accountID) &&
        Objects.equals(this.conditions, listMultiLevelAssetHostsRequest.conditions) &&
        Objects.equals(this.idList, listMultiLevelAssetHostsRequest.idList) &&
        Objects.equals(this.institutionID, listMultiLevelAssetHostsRequest.institutionID) &&
        Objects.equals(this.pageNumber, listMultiLevelAssetHostsRequest.pageNumber) &&
        Objects.equals(this.pageSize, listMultiLevelAssetHostsRequest.pageSize) &&
        Objects.equals(this.sortBy, listMultiLevelAssetHostsRequest.sortBy) &&
        Objects.equals(this.sortOrder, listMultiLevelAssetHostsRequest.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, conditions, idList, institutionID, pageNumber, pageSize, sortBy, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMultiLevelAssetHostsRequest {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
    sb.append("    institutionID: ").append(toIndentedString(institutionID)).append("\n");
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
