/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.PaginationForListDnsSchedulesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDnsSchedulesRequest
 */



public class ListDnsSchedulesRequest {
  @SerializedName("CloudAccountIds")
  private List<String> cloudAccountIds = null;

  @SerializedName("DomainName")
  private String domainName = null;

  @SerializedName("ExactDomainName")
  private String exactDomainName = null;

  @SerializedName("Pagination")
  private PaginationForListDnsSchedulesInput pagination = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("ScheduleStatus")
  private String scheduleStatus = null;

  @SerializedName("ScheduleStrategy")
  private String scheduleStrategy = null;

  @SerializedName("SortBy")
  private String sortBy = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  @SerializedName("Vendors")
  private List<String> vendors = null;

  public ListDnsSchedulesRequest cloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
    return this;
  }

  public ListDnsSchedulesRequest addCloudAccountIdsItem(String cloudAccountIdsItem) {
    if (this.cloudAccountIds == null) {
      this.cloudAccountIds = new ArrayList<String>();
    }
    this.cloudAccountIds.add(cloudAccountIdsItem);
    return this;
  }

   /**
   * Get cloudAccountIds
   * @return cloudAccountIds
  **/
  @Schema(description = "")
  public List<String> getCloudAccountIds() {
    return cloudAccountIds;
  }

  public void setCloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
  }

  public ListDnsSchedulesRequest domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public ListDnsSchedulesRequest exactDomainName(String exactDomainName) {
    this.exactDomainName = exactDomainName;
    return this;
  }

   /**
   * Get exactDomainName
   * @return exactDomainName
  **/
  @Schema(description = "")
  public String getExactDomainName() {
    return exactDomainName;
  }

  public void setExactDomainName(String exactDomainName) {
    this.exactDomainName = exactDomainName;
  }

  public ListDnsSchedulesRequest pagination(PaginationForListDnsSchedulesInput pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @Valid
  @Schema(description = "")
  public PaginationForListDnsSchedulesInput getPagination() {
    return pagination;
  }

  public void setPagination(PaginationForListDnsSchedulesInput pagination) {
    this.pagination = pagination;
  }

  public ListDnsSchedulesRequest region(String region) {
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

  public ListDnsSchedulesRequest scheduleStatus(String scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
    return this;
  }

   /**
   * Get scheduleStatus
   * @return scheduleStatus
  **/
  @Schema(description = "")
  public String getScheduleStatus() {
    return scheduleStatus;
  }

  public void setScheduleStatus(String scheduleStatus) {
    this.scheduleStatus = scheduleStatus;
  }

  public ListDnsSchedulesRequest scheduleStrategy(String scheduleStrategy) {
    this.scheduleStrategy = scheduleStrategy;
    return this;
  }

   /**
   * Get scheduleStrategy
   * @return scheduleStrategy
  **/
  @Schema(description = "")
  public String getScheduleStrategy() {
    return scheduleStrategy;
  }

  public void setScheduleStrategy(String scheduleStrategy) {
    this.scheduleStrategy = scheduleStrategy;
  }

  public ListDnsSchedulesRequest sortBy(String sortBy) {
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

  public ListDnsSchedulesRequest sortOrder(String sortOrder) {
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

  public ListDnsSchedulesRequest vendors(List<String> vendors) {
    this.vendors = vendors;
    return this;
  }

  public ListDnsSchedulesRequest addVendorsItem(String vendorsItem) {
    if (this.vendors == null) {
      this.vendors = new ArrayList<String>();
    }
    this.vendors.add(vendorsItem);
    return this;
  }

   /**
   * Get vendors
   * @return vendors
  **/
  @Schema(description = "")
  public List<String> getVendors() {
    return vendors;
  }

  public void setVendors(List<String> vendors) {
    this.vendors = vendors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDnsSchedulesRequest listDnsSchedulesRequest = (ListDnsSchedulesRequest) o;
    return Objects.equals(this.cloudAccountIds, listDnsSchedulesRequest.cloudAccountIds) &&
        Objects.equals(this.domainName, listDnsSchedulesRequest.domainName) &&
        Objects.equals(this.exactDomainName, listDnsSchedulesRequest.exactDomainName) &&
        Objects.equals(this.pagination, listDnsSchedulesRequest.pagination) &&
        Objects.equals(this.region, listDnsSchedulesRequest.region) &&
        Objects.equals(this.scheduleStatus, listDnsSchedulesRequest.scheduleStatus) &&
        Objects.equals(this.scheduleStrategy, listDnsSchedulesRequest.scheduleStrategy) &&
        Objects.equals(this.sortBy, listDnsSchedulesRequest.sortBy) &&
        Objects.equals(this.sortOrder, listDnsSchedulesRequest.sortOrder) &&
        Objects.equals(this.vendors, listDnsSchedulesRequest.vendors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountIds, domainName, exactDomainName, pagination, region, scheduleStatus, scheduleStrategy, sortBy, sortOrder, vendors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDnsSchedulesRequest {\n");
    
    sb.append("    cloudAccountIds: ").append(toIndentedString(cloudAccountIds)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    exactDomainName: ").append(toIndentedString(exactDomainName)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
    sb.append("    scheduleStrategy: ").append(toIndentedString(scheduleStrategy)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
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
