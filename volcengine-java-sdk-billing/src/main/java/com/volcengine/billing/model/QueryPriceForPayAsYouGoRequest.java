/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.billing.model.ConfigListForQueryPriceForPayAsYouGoInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryPriceForPayAsYouGoRequest
 */



public class QueryPriceForPayAsYouGoRequest {
  @SerializedName("ConfigList")
  private List<ConfigListForQueryPriceForPayAsYouGoInput> configList = null;

  @SerializedName("Product")
  private String product = null;

  public QueryPriceForPayAsYouGoRequest configList(List<ConfigListForQueryPriceForPayAsYouGoInput> configList) {
    this.configList = configList;
    return this;
  }

  public QueryPriceForPayAsYouGoRequest addConfigListItem(ConfigListForQueryPriceForPayAsYouGoInput configListItem) {
    if (this.configList == null) {
      this.configList = new ArrayList<ConfigListForQueryPriceForPayAsYouGoInput>();
    }
    this.configList.add(configListItem);
    return this;
  }

   /**
   * Get configList
   * @return configList
  **/
  @Valid
  @Schema(description = "")
  public List<ConfigListForQueryPriceForPayAsYouGoInput> getConfigList() {
    return configList;
  }

  public void setConfigList(List<ConfigListForQueryPriceForPayAsYouGoInput> configList) {
    this.configList = configList;
  }

  public QueryPriceForPayAsYouGoRequest product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryPriceForPayAsYouGoRequest queryPriceForPayAsYouGoRequest = (QueryPriceForPayAsYouGoRequest) o;
    return Objects.equals(this.configList, queryPriceForPayAsYouGoRequest.configList) &&
        Objects.equals(this.product, queryPriceForPayAsYouGoRequest.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configList, product);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryPriceForPayAsYouGoRequest {\n");
    
    sb.append("    configList: ").append(toIndentedString(configList)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
