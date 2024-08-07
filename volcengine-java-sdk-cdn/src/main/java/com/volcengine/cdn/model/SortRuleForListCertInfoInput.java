/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SortRuleForListCertInfoInput
 */



public class SortRuleForListCertInfoInput {
  @SerializedName("Asc")
  private Boolean asc = null;

  @SerializedName("OrderBy")
  private String orderBy = null;

  public SortRuleForListCertInfoInput asc(Boolean asc) {
    this.asc = asc;
    return this;
  }

   /**
   * Get asc
   * @return asc
  **/
  @Schema(description = "")
  public Boolean isAsc() {
    return asc;
  }

  public void setAsc(Boolean asc) {
    this.asc = asc;
  }

  public SortRuleForListCertInfoInput orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @Schema(description = "")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortRuleForListCertInfoInput sortRuleForListCertInfoInput = (SortRuleForListCertInfoInput) o;
    return Objects.equals(this.asc, sortRuleForListCertInfoInput.asc) &&
        Objects.equals(this.orderBy, sortRuleForListCertInfoInput.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asc, orderBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortRuleForListCertInfoInput {\n");
    
    sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
