/*
 * mcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcdn.model.MetricForDescribeCdnDataOfflineOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ResourceForDescribeCdnDataOfflineOutput
 */



public class ResourceForDescribeCdnDataOfflineOutput {
  @SerializedName("Metrics")
  private List<MetricForDescribeCdnDataOfflineOutput> metrics = null;

  @SerializedName("Name")
  private String name = null;

  public ResourceForDescribeCdnDataOfflineOutput metrics(List<MetricForDescribeCdnDataOfflineOutput> metrics) {
    this.metrics = metrics;
    return this;
  }

  public ResourceForDescribeCdnDataOfflineOutput addMetricsItem(MetricForDescribeCdnDataOfflineOutput metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<MetricForDescribeCdnDataOfflineOutput>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Valid
  @Schema(description = "")
  public List<MetricForDescribeCdnDataOfflineOutput> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<MetricForDescribeCdnDataOfflineOutput> metrics) {
    this.metrics = metrics;
  }

  public ResourceForDescribeCdnDataOfflineOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceForDescribeCdnDataOfflineOutput resourceForDescribeCdnDataOfflineOutput = (ResourceForDescribeCdnDataOfflineOutput) o;
    return Objects.equals(this.metrics, resourceForDescribeCdnDataOfflineOutput.metrics) &&
        Objects.equals(this.name, resourceForDescribeCdnDataOfflineOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceForDescribeCdnDataOfflineOutput {\n");
    
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
