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
import com.volcengine.dcdn.model.ResultForDescribeStatisticsOutput;
import com.volcengine.dcdn.model.TotalStatisticsForDescribeStatisticsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeStatisticsResponse
 */



public class DescribeStatisticsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DomainCount")
  private Integer domainCount = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("Metrics")
  private List<String> metrics = null;

  @SerializedName("Results")
  private List<ResultForDescribeStatisticsOutput> results = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("TotalStatistics")
  private TotalStatisticsForDescribeStatisticsOutput totalStatistics = null;

  public DescribeStatisticsResponse domainCount(Integer domainCount) {
    this.domainCount = domainCount;
    return this;
  }

   /**
   * Get domainCount
   * @return domainCount
  **/
  @Schema(description = "")
  public Integer getDomainCount() {
    return domainCount;
  }

  public void setDomainCount(Integer domainCount) {
    this.domainCount = domainCount;
  }

  public DescribeStatisticsResponse endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DescribeStatisticsResponse metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public DescribeStatisticsResponse addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<String>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  public DescribeStatisticsResponse results(List<ResultForDescribeStatisticsOutput> results) {
    this.results = results;
    return this;
  }

  public DescribeStatisticsResponse addResultsItem(ResultForDescribeStatisticsOutput resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ResultForDescribeStatisticsOutput>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Valid
  @Schema(description = "")
  public List<ResultForDescribeStatisticsOutput> getResults() {
    return results;
  }

  public void setResults(List<ResultForDescribeStatisticsOutput> results) {
    this.results = results;
  }

  public DescribeStatisticsResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DescribeStatisticsResponse totalStatistics(TotalStatisticsForDescribeStatisticsOutput totalStatistics) {
    this.totalStatistics = totalStatistics;
    return this;
  }

   /**
   * Get totalStatistics
   * @return totalStatistics
  **/
  @Valid
  @Schema(description = "")
  public TotalStatisticsForDescribeStatisticsOutput getTotalStatistics() {
    return totalStatistics;
  }

  public void setTotalStatistics(TotalStatisticsForDescribeStatisticsOutput totalStatistics) {
    this.totalStatistics = totalStatistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeStatisticsResponse describeStatisticsResponse = (DescribeStatisticsResponse) o;
    return Objects.equals(this.domainCount, describeStatisticsResponse.domainCount) &&
        Objects.equals(this.endTime, describeStatisticsResponse.endTime) &&
        Objects.equals(this.metrics, describeStatisticsResponse.metrics) &&
        Objects.equals(this.results, describeStatisticsResponse.results) &&
        Objects.equals(this.startTime, describeStatisticsResponse.startTime) &&
        Objects.equals(this.totalStatistics, describeStatisticsResponse.totalStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainCount, endTime, metrics, results, startTime, totalStatistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeStatisticsResponse {\n");
    
    sb.append("    domainCount: ").append(toIndentedString(domainCount)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalStatistics: ").append(toIndentedString(totalStatistics)).append("\n");
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
