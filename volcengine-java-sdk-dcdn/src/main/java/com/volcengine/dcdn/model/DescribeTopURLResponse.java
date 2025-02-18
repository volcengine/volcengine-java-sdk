/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.TopURLForDescribeTopURLOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTopURLResponse
 */



public class DescribeTopURLResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("TopURLs")
  private List<TopURLForDescribeTopURLOutput> topURLs = null;

  public DescribeTopURLResponse topURLs(List<TopURLForDescribeTopURLOutput> topURLs) {
    this.topURLs = topURLs;
    return this;
  }

  public DescribeTopURLResponse addTopURLsItem(TopURLForDescribeTopURLOutput topURLsItem) {
    if (this.topURLs == null) {
      this.topURLs = new ArrayList<TopURLForDescribeTopURLOutput>();
    }
    this.topURLs.add(topURLsItem);
    return this;
  }

   /**
   * Get topURLs
   * @return topURLs
  **/
  @Valid
  @Schema(description = "")
  public List<TopURLForDescribeTopURLOutput> getTopURLs() {
    return topURLs;
  }

  public void setTopURLs(List<TopURLForDescribeTopURLOutput> topURLs) {
    this.topURLs = topURLs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTopURLResponse describeTopURLResponse = (DescribeTopURLResponse) o;
    return Objects.equals(this.topURLs, describeTopURLResponse.topURLs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topURLs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTopURLResponse {\n");
    
    sb.append("    topURLs: ").append(toIndentedString(topURLs)).append("\n");
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
