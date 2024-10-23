/*
 * cr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cr.model.ItemForListTagsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListTagsResponse
 */



public class ListTagsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForListTagsOutput> items = null;

  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("PageNumber")
  private Long pageNumber = null;

  @SerializedName("PageSize")
  private Long pageSize = null;

  @SerializedName("Registry")
  private String registry = null;

  @SerializedName("Repository")
  private String repository = null;

  @SerializedName("TotalCount")
  private Long totalCount = null;

  public ListTagsResponse items(List<ItemForListTagsOutput> items) {
    this.items = items;
    return this;
  }

  public ListTagsResponse addItemsItem(ItemForListTagsOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListTagsOutput>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Valid
  @Schema(description = "")
  public List<ItemForListTagsOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListTagsOutput> items) {
    this.items = items;
  }

  public ListTagsResponse namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @Schema(description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ListTagsResponse pageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ListTagsResponse pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ListTagsResponse registry(String registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @Schema(description = "")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public ListTagsResponse repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @Schema(description = "")
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public ListTagsResponse totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTagsResponse listTagsResponse = (ListTagsResponse) o;
    return Objects.equals(this.items, listTagsResponse.items) &&
        Objects.equals(this.namespace, listTagsResponse.namespace) &&
        Objects.equals(this.pageNumber, listTagsResponse.pageNumber) &&
        Objects.equals(this.pageSize, listTagsResponse.pageSize) &&
        Objects.equals(this.registry, listTagsResponse.registry) &&
        Objects.equals(this.repository, listTagsResponse.repository) &&
        Objects.equals(this.totalCount, listTagsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, namespace, pageNumber, pageSize, registry, repository, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTagsResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
