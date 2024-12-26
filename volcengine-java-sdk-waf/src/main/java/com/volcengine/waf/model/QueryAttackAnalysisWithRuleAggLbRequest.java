/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryAttackAnalysisWithRuleAggLbRequest
 */



public class QueryAttackAnalysisWithRuleAggLbRequest {
  @SerializedName("AnalysisKey")
  private String analysisKey = null;

  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("Plugins")
  private List<String> plugins = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  public QueryAttackAnalysisWithRuleAggLbRequest analysisKey(String analysisKey) {
    this.analysisKey = analysisKey;
    return this;
  }

   /**
   * Get analysisKey
   * @return analysisKey
  **/
  @Schema(description = "")
  public String getAnalysisKey() {
    return analysisKey;
  }

  public void setAnalysisKey(String analysisKey) {
    this.analysisKey = analysisKey;
  }

  public QueryAttackAnalysisWithRuleAggLbRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public QueryAttackAnalysisWithRuleAggLbRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public QueryAttackAnalysisWithRuleAggLbRequest plugins(List<String> plugins) {
    this.plugins = plugins;
    return this;
  }

  public QueryAttackAnalysisWithRuleAggLbRequest addPluginsItem(String pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<String>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

   /**
   * Get plugins
   * @return plugins
  **/
  @Schema(description = "")
  public List<String> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<String> plugins) {
    this.plugins = plugins;
  }

  public QueryAttackAnalysisWithRuleAggLbRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAttackAnalysisWithRuleAggLbRequest queryAttackAnalysisWithRuleAggLbRequest = (QueryAttackAnalysisWithRuleAggLbRequest) o;
    return Objects.equals(this.analysisKey, queryAttackAnalysisWithRuleAggLbRequest.analysisKey) &&
        Objects.equals(this.endTime, queryAttackAnalysisWithRuleAggLbRequest.endTime) &&
        Objects.equals(this.host, queryAttackAnalysisWithRuleAggLbRequest.host) &&
        Objects.equals(this.plugins, queryAttackAnalysisWithRuleAggLbRequest.plugins) &&
        Objects.equals(this.startTime, queryAttackAnalysisWithRuleAggLbRequest.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisKey, endTime, host, plugins, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAttackAnalysisWithRuleAggLbRequest {\n");
    
    sb.append("    analysisKey: ").append(toIndentedString(analysisKey)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
