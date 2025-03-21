/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vefaas.model.FilterForListFunctionsInput;
import com.volcengine.vefaas.model.TagFilterForListFunctionsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListFunctionsRequest
 */



public class ListFunctionsRequest {
  @SerializedName("Filters")
  private List<FilterForListFunctionsInput> filters = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TagFilters")
  private List<TagFilterForListFunctionsInput> tagFilters = null;

  public ListFunctionsRequest filters(List<FilterForListFunctionsInput> filters) {
    this.filters = filters;
    return this;
  }

  public ListFunctionsRequest addFiltersItem(FilterForListFunctionsInput filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<FilterForListFunctionsInput>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Valid
  @Schema(description = "")
  public List<FilterForListFunctionsInput> getFilters() {
    return filters;
  }

  public void setFilters(List<FilterForListFunctionsInput> filters) {
    this.filters = filters;
  }

  public ListFunctionsRequest pageNumber(Integer pageNumber) {
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

  public ListFunctionsRequest pageSize(Integer pageSize) {
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

  public ListFunctionsRequest tagFilters(List<TagFilterForListFunctionsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public ListFunctionsRequest addTagFiltersItem(TagFilterForListFunctionsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForListFunctionsInput>();
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
  public List<TagFilterForListFunctionsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForListFunctionsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFunctionsRequest listFunctionsRequest = (ListFunctionsRequest) o;
    return Objects.equals(this.filters, listFunctionsRequest.filters) &&
        Objects.equals(this.pageNumber, listFunctionsRequest.pageNumber) &&
        Objects.equals(this.pageSize, listFunctionsRequest.pageSize) &&
        Objects.equals(this.tagFilters, listFunctionsRequest.tagFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, pageNumber, pageSize, tagFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFunctionsRequest {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
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
