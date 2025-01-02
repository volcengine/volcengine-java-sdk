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
import com.volcengine.mcdn.model.ValueForDescribeCdnOriginDataOfflineOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MetricForDescribeCdnOriginDataOfflineOutput
 */



public class MetricForDescribeCdnOriginDataOfflineOutput {
  @SerializedName("Metric")
  private String metric = null;

  @SerializedName("Values")
  private List<ValueForDescribeCdnOriginDataOfflineOutput> values = null;

  public MetricForDescribeCdnOriginDataOfflineOutput metric(String metric) {
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

  public MetricForDescribeCdnOriginDataOfflineOutput values(List<ValueForDescribeCdnOriginDataOfflineOutput> values) {
    this.values = values;
    return this;
  }

  public MetricForDescribeCdnOriginDataOfflineOutput addValuesItem(ValueForDescribeCdnOriginDataOfflineOutput valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<ValueForDescribeCdnOriginDataOfflineOutput>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Valid
  @Schema(description = "")
  public List<ValueForDescribeCdnOriginDataOfflineOutput> getValues() {
    return values;
  }

  public void setValues(List<ValueForDescribeCdnOriginDataOfflineOutput> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricForDescribeCdnOriginDataOfflineOutput metricForDescribeCdnOriginDataOfflineOutput = (MetricForDescribeCdnOriginDataOfflineOutput) o;
    return Objects.equals(this.metric, metricForDescribeCdnOriginDataOfflineOutput.metric) &&
        Objects.equals(this.values, metricForDescribeCdnOriginDataOfflineOutput.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricForDescribeCdnOriginDataOfflineOutput {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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