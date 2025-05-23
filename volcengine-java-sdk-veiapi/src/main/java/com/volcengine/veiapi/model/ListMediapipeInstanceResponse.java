/*
 * vei_api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.veiapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.veiapi.model.ItemForListMediapipeInstanceOutput;
import com.volcengine.veiapi.model.PageinatorForListMediapipeInstanceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListMediapipeInstanceResponse
 */



public class ListMediapipeInstanceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("items")
  private List<ItemForListMediapipeInstanceOutput> items = null;

  @SerializedName("pageinator")
  private PageinatorForListMediapipeInstanceOutput pageinator = null;

  public ListMediapipeInstanceResponse items(List<ItemForListMediapipeInstanceOutput> items) {
    this.items = items;
    return this;
  }

  public ListMediapipeInstanceResponse addItemsItem(ItemForListMediapipeInstanceOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemForListMediapipeInstanceOutput>();
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
  public List<ItemForListMediapipeInstanceOutput> getItems() {
    return items;
  }

  public void setItems(List<ItemForListMediapipeInstanceOutput> items) {
    this.items = items;
  }

  public ListMediapipeInstanceResponse pageinator(PageinatorForListMediapipeInstanceOutput pageinator) {
    this.pageinator = pageinator;
    return this;
  }

   /**
   * Get pageinator
   * @return pageinator
  **/
  @Valid
  @Schema(description = "")
  public PageinatorForListMediapipeInstanceOutput getPageinator() {
    return pageinator;
  }

  public void setPageinator(PageinatorForListMediapipeInstanceOutput pageinator) {
    this.pageinator = pageinator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMediapipeInstanceResponse listMediapipeInstanceResponse = (ListMediapipeInstanceResponse) o;
    return Objects.equals(this.items, listMediapipeInstanceResponse.items) &&
        Objects.equals(this.pageinator, listMediapipeInstanceResponse.pageinator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, pageinator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMediapipeInstanceResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pageinator: ").append(toIndentedString(pageinator)).append("\n");
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
