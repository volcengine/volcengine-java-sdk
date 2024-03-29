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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TopDataResultForGetTopDataOutput
 */



public class TopDataResultForGetTopDataOutput {
  @SerializedName("GroupKeys")
  private Map<String, Object> groupKeys = null;

  @SerializedName("MetricData")
  private Map<String, Object> metricData = null;

  public TopDataResultForGetTopDataOutput groupKeys(Map<String, Object> groupKeys) {
    this.groupKeys = groupKeys;
    return this;
  }

  public TopDataResultForGetTopDataOutput putGroupKeysItem(String key, Object groupKeysItem) {
    if (this.groupKeys == null) {
      this.groupKeys = new HashMap<String, Object>();
    }
    this.groupKeys.put(key, groupKeysItem);
    return this;
  }

   /**
   * Get groupKeys
   * @return groupKeys
  **/
  @Schema(description = "")
  public Map<String, Object> getGroupKeys() {
    return groupKeys;
  }

  public void setGroupKeys(Map<String, Object> groupKeys) {
    this.groupKeys = groupKeys;
  }

  public TopDataResultForGetTopDataOutput metricData(Map<String, Object> metricData) {
    this.metricData = metricData;
    return this;
  }

  public TopDataResultForGetTopDataOutput putMetricDataItem(String key, Object metricDataItem) {
    if (this.metricData == null) {
      this.metricData = new HashMap<String, Object>();
    }
    this.metricData.put(key, metricDataItem);
    return this;
  }

   /**
   * Get metricData
   * @return metricData
  **/
  @Schema(description = "")
  public Map<String, Object> getMetricData() {
    return metricData;
  }

  public void setMetricData(Map<String, Object> metricData) {
    this.metricData = metricData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopDataResultForGetTopDataOutput topDataResultForGetTopDataOutput = (TopDataResultForGetTopDataOutput) o;
    return Objects.equals(this.groupKeys, topDataResultForGetTopDataOutput.groupKeys) &&
        Objects.equals(this.metricData, topDataResultForGetTopDataOutput.metricData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupKeys, metricData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopDataResultForGetTopDataOutput {\n");
    
    sb.append("    groupKeys: ").append(toIndentedString(groupKeys)).append("\n");
    sb.append("    metricData: ").append(toIndentedString(metricData)).append("\n");
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
