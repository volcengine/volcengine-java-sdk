/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.MetricDataResultForGetMetricDataOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForGetMetricDataOutput
 */



public class DataForGetMetricDataOutput {
  @SerializedName("DescriptionCN")
  private String descriptionCN = null;

  @SerializedName("DescriptionEN")
  private String descriptionEN = null;

  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("MetricDataResults")
  private List<MetricDataResultForGetMetricDataOutput> metricDataResults = null;

  @SerializedName("MetricName")
  private String metricName = null;

  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("Period")
  private String period = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  @SerializedName("Unit")
  private String unit = null;

  public DataForGetMetricDataOutput descriptionCN(String descriptionCN) {
    this.descriptionCN = descriptionCN;
    return this;
  }

   /**
   * Get descriptionCN
   * @return descriptionCN
  **/
  @Schema(description = "")
  public String getDescriptionCN() {
    return descriptionCN;
  }

  public void setDescriptionCN(String descriptionCN) {
    this.descriptionCN = descriptionCN;
  }

  public DataForGetMetricDataOutput descriptionEN(String descriptionEN) {
    this.descriptionEN = descriptionEN;
    return this;
  }

   /**
   * Get descriptionEN
   * @return descriptionEN
  **/
  @Schema(description = "")
  public String getDescriptionEN() {
    return descriptionEN;
  }

  public void setDescriptionEN(String descriptionEN) {
    this.descriptionEN = descriptionEN;
  }

  public DataForGetMetricDataOutput endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public DataForGetMetricDataOutput metricDataResults(List<MetricDataResultForGetMetricDataOutput> metricDataResults) {
    this.metricDataResults = metricDataResults;
    return this;
  }

  public DataForGetMetricDataOutput addMetricDataResultsItem(MetricDataResultForGetMetricDataOutput metricDataResultsItem) {
    if (this.metricDataResults == null) {
      this.metricDataResults = new ArrayList<MetricDataResultForGetMetricDataOutput>();
    }
    this.metricDataResults.add(metricDataResultsItem);
    return this;
  }

   /**
   * Get metricDataResults
   * @return metricDataResults
  **/
  @Valid
  @Schema(description = "")
  public List<MetricDataResultForGetMetricDataOutput> getMetricDataResults() {
    return metricDataResults;
  }

  public void setMetricDataResults(List<MetricDataResultForGetMetricDataOutput> metricDataResults) {
    this.metricDataResults = metricDataResults;
  }

  public DataForGetMetricDataOutput metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * Get metricName
   * @return metricName
  **/
  @Schema(description = "")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public DataForGetMetricDataOutput namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @Schema(description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public DataForGetMetricDataOutput period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public DataForGetMetricDataOutput startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public DataForGetMetricDataOutput unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @Schema(description = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForGetMetricDataOutput dataForGetMetricDataOutput = (DataForGetMetricDataOutput) o;
    return Objects.equals(this.descriptionCN, dataForGetMetricDataOutput.descriptionCN) &&
        Objects.equals(this.descriptionEN, dataForGetMetricDataOutput.descriptionEN) &&
        Objects.equals(this.endTime, dataForGetMetricDataOutput.endTime) &&
        Objects.equals(this.metricDataResults, dataForGetMetricDataOutput.metricDataResults) &&
        Objects.equals(this.metricName, dataForGetMetricDataOutput.metricName) &&
        Objects.equals(this.namespace, dataForGetMetricDataOutput.namespace) &&
        Objects.equals(this.period, dataForGetMetricDataOutput.period) &&
        Objects.equals(this.startTime, dataForGetMetricDataOutput.startTime) &&
        Objects.equals(this.unit, dataForGetMetricDataOutput.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptionCN, descriptionEN, endTime, metricDataResults, metricName, namespace, period, startTime, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForGetMetricDataOutput {\n");
    
    sb.append("    descriptionCN: ").append(toIndentedString(descriptionCN)).append("\n");
    sb.append("    descriptionEN: ").append(toIndentedString(descriptionEN)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    metricDataResults: ").append(toIndentedString(metricDataResults)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
