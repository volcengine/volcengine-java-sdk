/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.transitrouter.model.TagFilterForDescribeTransitRoutersInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRoutersRequest
 */



public class DescribeTransitRoutersRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeTransitRoutersInput> tagFilters = null;

  @SerializedName("TransitRouterIds")
  private List<String> transitRouterIds = null;

  @SerializedName("TransitRouterName")
  private String transitRouterName = null;

  public DescribeTransitRoutersRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeTransitRoutersRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeTransitRoutersRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DescribeTransitRoutersRequest tagFilters(List<TagFilterForDescribeTransitRoutersInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeTransitRoutersRequest addTagFiltersItem(TagFilterForDescribeTransitRoutersInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeTransitRoutersInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeTransitRoutersInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeTransitRoutersInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeTransitRoutersRequest transitRouterIds(List<String> transitRouterIds) {
    this.transitRouterIds = transitRouterIds;
    return this;
  }

  public DescribeTransitRoutersRequest addTransitRouterIdsItem(String transitRouterIdsItem) {
    if (this.transitRouterIds == null) {
      this.transitRouterIds = new ArrayList<String>();
    }
    this.transitRouterIds.add(transitRouterIdsItem);
    return this;
  }

   /**
   * Get transitRouterIds
   * @return transitRouterIds
  **/
  @Schema(description = "")
  public List<String> getTransitRouterIds() {
    return transitRouterIds;
  }

  public void setTransitRouterIds(List<String> transitRouterIds) {
    this.transitRouterIds = transitRouterIds;
  }

  public DescribeTransitRoutersRequest transitRouterName(String transitRouterName) {
    this.transitRouterName = transitRouterName;
    return this;
  }

   /**
   * Get transitRouterName
   * @return transitRouterName
  **/
  @Schema(description = "")
  public String getTransitRouterName() {
    return transitRouterName;
  }

  public void setTransitRouterName(String transitRouterName) {
    this.transitRouterName = transitRouterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRoutersRequest describeTransitRoutersRequest = (DescribeTransitRoutersRequest) o;
    return Objects.equals(this.pageNumber, describeTransitRoutersRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRoutersRequest.pageSize) &&
        Objects.equals(this.projectName, describeTransitRoutersRequest.projectName) &&
        Objects.equals(this.tagFilters, describeTransitRoutersRequest.tagFilters) &&
        Objects.equals(this.transitRouterIds, describeTransitRoutersRequest.transitRouterIds) &&
        Objects.equals(this.transitRouterName, describeTransitRoutersRequest.transitRouterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, projectName, tagFilters, transitRouterIds, transitRouterName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRoutersRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    transitRouterIds: ").append(toIndentedString(transitRouterIds)).append("\n");
    sb.append("    transitRouterName: ").append(toIndentedString(transitRouterName)).append("\n");
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