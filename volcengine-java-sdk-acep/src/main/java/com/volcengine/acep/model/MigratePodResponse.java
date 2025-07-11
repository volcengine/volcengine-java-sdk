/*
 * acep
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.acep.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.acep.model.DetailForMigratePodOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MigratePodResponse
 */



public class MigratePodResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Details")
  private List<DetailForMigratePodOutput> details = null;

  @SerializedName("ProductId")
  private String productId = null;

  public MigratePodResponse details(List<DetailForMigratePodOutput> details) {
    this.details = details;
    return this;
  }

  public MigratePodResponse addDetailsItem(DetailForMigratePodOutput detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<DetailForMigratePodOutput>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Valid
  @Schema(description = "")
  public List<DetailForMigratePodOutput> getDetails() {
    return details;
  }

  public void setDetails(List<DetailForMigratePodOutput> details) {
    this.details = details;
  }

  public MigratePodResponse productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @Schema(description = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigratePodResponse migratePodResponse = (MigratePodResponse) o;
    return Objects.equals(this.details, migratePodResponse.details) &&
        Objects.equals(this.productId, migratePodResponse.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, productId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigratePodResponse {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
