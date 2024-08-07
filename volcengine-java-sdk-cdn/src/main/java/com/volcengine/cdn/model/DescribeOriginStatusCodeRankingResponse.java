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
import com.volcengine.cdn.model.TopDataDetailForDescribeOriginStatusCodeRankingOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeOriginStatusCodeRankingResponse
 */



public class DescribeOriginStatusCodeRankingResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Item")
  private String item = null;

  @SerializedName("Metric")
  private String metric = null;

  @SerializedName("TopDataDetails")
  private List<TopDataDetailForDescribeOriginStatusCodeRankingOutput> topDataDetails = null;

  public DescribeOriginStatusCodeRankingResponse item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @Schema(description = "")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public DescribeOriginStatusCodeRankingResponse metric(String metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @Schema(description = "")
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public DescribeOriginStatusCodeRankingResponse topDataDetails(List<TopDataDetailForDescribeOriginStatusCodeRankingOutput> topDataDetails) {
    this.topDataDetails = topDataDetails;
    return this;
  }

  public DescribeOriginStatusCodeRankingResponse addTopDataDetailsItem(TopDataDetailForDescribeOriginStatusCodeRankingOutput topDataDetailsItem) {
    if (this.topDataDetails == null) {
      this.topDataDetails = new ArrayList<TopDataDetailForDescribeOriginStatusCodeRankingOutput>();
    }
    this.topDataDetails.add(topDataDetailsItem);
    return this;
  }

   /**
   * Get topDataDetails
   * @return topDataDetails
  **/
  @Valid
  @Schema(description = "")
  public List<TopDataDetailForDescribeOriginStatusCodeRankingOutput> getTopDataDetails() {
    return topDataDetails;
  }

  public void setTopDataDetails(List<TopDataDetailForDescribeOriginStatusCodeRankingOutput> topDataDetails) {
    this.topDataDetails = topDataDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeOriginStatusCodeRankingResponse describeOriginStatusCodeRankingResponse = (DescribeOriginStatusCodeRankingResponse) o;
    return Objects.equals(this.item, describeOriginStatusCodeRankingResponse.item) &&
        Objects.equals(this.metric, describeOriginStatusCodeRankingResponse.metric) &&
        Objects.equals(this.topDataDetails, describeOriginStatusCodeRankingResponse.topDataDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, metric, topDataDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeOriginStatusCodeRankingResponse {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    topDataDetails: ").append(toIndentedString(topDataDetails)).append("\n");
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
