/*
 * quota
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.quota.model;

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
 * QuotaAlarmRuleListForListQuotaAlarmRulesOutput
 */



public class QuotaAlarmRuleListForListQuotaAlarmRulesOutput {
  @SerializedName("AlarmType")
  private String alarmType = null;

  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Dimensions")
  private String dimensions = null;

  @SerializedName("EnableState")
  private String enableState = null;

  @SerializedName("MetricUnit")
  private String metricUnit = null;

  @SerializedName("ProductName")
  private String productName = null;

  @SerializedName("ProviderCode")
  private String providerCode = null;

  @SerializedName("QuotaCode")
  private String quotaCode = null;

  @SerializedName("QuotaType")
  private String quotaType = null;

  @SerializedName("RuleID")
  private String ruleID = null;

  @SerializedName("RuleName")
  private String ruleName = null;

  @SerializedName("SilenceTime")
  private Integer silenceTime = null;

  @SerializedName("Statistics")
  private String statistics = null;

  @SerializedName("Threshold")
  private String threshold = null;

  @SerializedName("UpdatedTime")
  private String updatedTime = null;

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput alarmType(String alarmType) {
    this.alarmType = alarmType;
    return this;
  }

   /**
   * Get alarmType
   * @return alarmType
  **/
  @Schema(description = "")
  public String getAlarmType() {
    return alarmType;
  }

  public void setAlarmType(String alarmType) {
    this.alarmType = alarmType;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput dimensions(String dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @Schema(description = "")
  public String getDimensions() {
    return dimensions;
  }

  public void setDimensions(String dimensions) {
    this.dimensions = dimensions;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput enableState(String enableState) {
    this.enableState = enableState;
    return this;
  }

   /**
   * Get enableState
   * @return enableState
  **/
  @Schema(description = "")
  public String getEnableState() {
    return enableState;
  }

  public void setEnableState(String enableState) {
    this.enableState = enableState;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput metricUnit(String metricUnit) {
    this.metricUnit = metricUnit;
    return this;
  }

   /**
   * Get metricUnit
   * @return metricUnit
  **/
  @Schema(description = "")
  public String getMetricUnit() {
    return metricUnit;
  }

  public void setMetricUnit(String metricUnit) {
    this.metricUnit = metricUnit;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @Schema(description = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput providerCode(String providerCode) {
    this.providerCode = providerCode;
    return this;
  }

   /**
   * Get providerCode
   * @return providerCode
  **/
  @Schema(description = "")
  public String getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput quotaCode(String quotaCode) {
    this.quotaCode = quotaCode;
    return this;
  }

   /**
   * Get quotaCode
   * @return quotaCode
  **/
  @Schema(description = "")
  public String getQuotaCode() {
    return quotaCode;
  }

  public void setQuotaCode(String quotaCode) {
    this.quotaCode = quotaCode;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput quotaType(String quotaType) {
    this.quotaType = quotaType;
    return this;
  }

   /**
   * Get quotaType
   * @return quotaType
  **/
  @Schema(description = "")
  public String getQuotaType() {
    return quotaType;
  }

  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput ruleID(String ruleID) {
    this.ruleID = ruleID;
    return this;
  }

   /**
   * Get ruleID
   * @return ruleID
  **/
  @Schema(description = "")
  public String getRuleID() {
    return ruleID;
  }

  public void setRuleID(String ruleID) {
    this.ruleID = ruleID;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @Schema(description = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput silenceTime(Integer silenceTime) {
    this.silenceTime = silenceTime;
    return this;
  }

   /**
   * Get silenceTime
   * @return silenceTime
  **/
  @Schema(description = "")
  public Integer getSilenceTime() {
    return silenceTime;
  }

  public void setSilenceTime(Integer silenceTime) {
    this.silenceTime = silenceTime;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput statistics(String statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @Schema(description = "")
  public String getStatistics() {
    return statistics;
  }

  public void setStatistics(String statistics) {
    this.statistics = statistics;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput threshold(String threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @Schema(description = "")
  public String getThreshold() {
    return threshold;
  }

  public void setThreshold(String threshold) {
    this.threshold = threshold;
  }

  public QuotaAlarmRuleListForListQuotaAlarmRulesOutput updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @Schema(description = "")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaAlarmRuleListForListQuotaAlarmRulesOutput quotaAlarmRuleListForListQuotaAlarmRulesOutput = (QuotaAlarmRuleListForListQuotaAlarmRulesOutput) o;
    return Objects.equals(this.alarmType, quotaAlarmRuleListForListQuotaAlarmRulesOutput.alarmType) &&
        Objects.equals(this.createdTime, quotaAlarmRuleListForListQuotaAlarmRulesOutput.createdTime) &&
        Objects.equals(this.description, quotaAlarmRuleListForListQuotaAlarmRulesOutput.description) &&
        Objects.equals(this.dimensions, quotaAlarmRuleListForListQuotaAlarmRulesOutput.dimensions) &&
        Objects.equals(this.enableState, quotaAlarmRuleListForListQuotaAlarmRulesOutput.enableState) &&
        Objects.equals(this.metricUnit, quotaAlarmRuleListForListQuotaAlarmRulesOutput.metricUnit) &&
        Objects.equals(this.productName, quotaAlarmRuleListForListQuotaAlarmRulesOutput.productName) &&
        Objects.equals(this.providerCode, quotaAlarmRuleListForListQuotaAlarmRulesOutput.providerCode) &&
        Objects.equals(this.quotaCode, quotaAlarmRuleListForListQuotaAlarmRulesOutput.quotaCode) &&
        Objects.equals(this.quotaType, quotaAlarmRuleListForListQuotaAlarmRulesOutput.quotaType) &&
        Objects.equals(this.ruleID, quotaAlarmRuleListForListQuotaAlarmRulesOutput.ruleID) &&
        Objects.equals(this.ruleName, quotaAlarmRuleListForListQuotaAlarmRulesOutput.ruleName) &&
        Objects.equals(this.silenceTime, quotaAlarmRuleListForListQuotaAlarmRulesOutput.silenceTime) &&
        Objects.equals(this.statistics, quotaAlarmRuleListForListQuotaAlarmRulesOutput.statistics) &&
        Objects.equals(this.threshold, quotaAlarmRuleListForListQuotaAlarmRulesOutput.threshold) &&
        Objects.equals(this.updatedTime, quotaAlarmRuleListForListQuotaAlarmRulesOutput.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmType, createdTime, description, dimensions, enableState, metricUnit, productName, providerCode, quotaCode, quotaType, ruleID, ruleName, silenceTime, statistics, threshold, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaAlarmRuleListForListQuotaAlarmRulesOutput {\n");
    
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    enableState: ").append(toIndentedString(enableState)).append("\n");
    sb.append("    metricUnit: ").append(toIndentedString(metricUnit)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    quotaCode: ").append(toIndentedString(quotaCode)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    ruleID: ").append(toIndentedString(ruleID)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    silenceTime: ").append(toIndentedString(silenceTime)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
