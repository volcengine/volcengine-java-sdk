/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bio.model.ItemForListClustersOfWorkspaceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListClustersOfWorkspaceResponse
 */



public class ListClustersOfWorkspaceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Items")
  private List<ItemForListClustersOfWorkspaceOutput> items = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public ListClustersOfWorkspaceResponse items(List<ItemForListClustersOfWorkspaceOutput> items) {
    this.items = items;
    return this;
  }

  public ListClustersOfWorkspaceResponse addItemsItem(ItemForListClustersOfWorkspaceOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListClustersOfWorkspaceOutput>();
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
  public List<ItemForListClustersOfWorkspaceOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListClustersOfWorkspaceOutput> items) {
    this.items = items;
  }

  public ListClustersOfWorkspaceResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
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
    ListClustersOfWorkspaceResponse listClustersOfWorkspaceResponse = (ListClustersOfWorkspaceResponse) o;
    return Objects.equals(this.items, listClustersOfWorkspaceResponse.items) &&
        Objects.equals(this.totalCount, listClustersOfWorkspaceResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClustersOfWorkspaceResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
