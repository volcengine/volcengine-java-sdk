/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ga.model.TopStatisticForDescribeTopStatisticsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTopStatisticsResponse
 */



public class DescribeTopStatisticsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("SortMetric")
  private String sortMetric = null;

  @SerializedName("TopStatistics")
  private List<TopStatisticForDescribeTopStatisticsOutput> topStatistics = null;

  public DescribeTopStatisticsResponse sortMetric(String sortMetric) {
    this.sortMetric = sortMetric;
    return this;
  }

   /**
   * Get sortMetric
   * @return sortMetric
  **/
  @Schema(description = "")
  public String getSortMetric() {
    return sortMetric;
  }

  public void setSortMetric(String sortMetric) {
    this.sortMetric = sortMetric;
  }

  public DescribeTopStatisticsResponse topStatistics(List<TopStatisticForDescribeTopStatisticsOutput> topStatistics) {
    this.topStatistics = topStatistics;
    return this;
  }

  public DescribeTopStatisticsResponse addTopStatisticsItem(TopStatisticForDescribeTopStatisticsOutput topStatisticsItem) {
    if (this.topStatistics == null) {
      this.topStatistics = new ArrayList<TopStatisticForDescribeTopStatisticsOutput>();
    }
    this.topStatistics.add(topStatisticsItem);
    return this;
  }

   /**
   * Get topStatistics
   * @return topStatistics
  **/
  @Valid
  @Schema(description = "")
  public List<TopStatisticForDescribeTopStatisticsOutput> getTopStatistics() {
    return topStatistics;
  }

  public void setTopStatistics(List<TopStatisticForDescribeTopStatisticsOutput> topStatistics) {
    this.topStatistics = topStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTopStatisticsResponse describeTopStatisticsResponse = (DescribeTopStatisticsResponse) o;
    return Objects.equals(this.sortMetric, describeTopStatisticsResponse.sortMetric) &&
        Objects.equals(this.topStatistics, describeTopStatisticsResponse.topStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortMetric, topStatistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTopStatisticsResponse {\n");
    
    sb.append("    sortMetric: ").append(toIndentedString(sortMetric)).append("\n");
    sb.append("    topStatistics: ").append(toIndentedString(topStatistics)).append("\n");
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
