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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UsageReportsDetailForListUsageReportsOutput
 */



public class UsageReportsDetailForListUsageReportsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("BillingCode")
  private String billingCode = null;

  @SerializedName("BillingRegion")
  private String billingRegion = null;

  @SerializedName("CalculationMethod")
  private String calculationMethod = null;

  @SerializedName("CreateTime")
  private Long createTime = null;

  @SerializedName("DownLoadUrl")
  private String downLoadUrl = null;

  @SerializedName("EndTime")
  private Long endTime = null;

  @SerializedName("ExportType")
  private String exportType = null;

  @SerializedName("Metric")
  private String metric = null;

  @SerializedName("StartTime")
  private Long startTime = null;

  @SerializedName("Status")
  private Long status = null;

  @SerializedName("TaskId")
  private String taskId = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("TimeZone")
  private String timeZone = null;

  public UsageReportsDetailForListUsageReportsOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UsageReportsDetailForListUsageReportsOutput billingCode(String billingCode) {
    this.billingCode = billingCode;
    return this;
  }

   /**
   * Get billingCode
   * @return billingCode
  **/
  @Schema(description = "")
  public String getBillingCode() {
    return billingCode;
  }

  public void setBillingCode(String billingCode) {
    this.billingCode = billingCode;
  }

  public UsageReportsDetailForListUsageReportsOutput billingRegion(String billingRegion) {
    this.billingRegion = billingRegion;
    return this;
  }

   /**
   * Get billingRegion
   * @return billingRegion
  **/
  @Schema(description = "")
  public String getBillingRegion() {
    return billingRegion;
  }

  public void setBillingRegion(String billingRegion) {
    this.billingRegion = billingRegion;
  }

  public UsageReportsDetailForListUsageReportsOutput calculationMethod(String calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

   /**
   * Get calculationMethod
   * @return calculationMethod
  **/
  @Schema(description = "")
  public String getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(String calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public UsageReportsDetailForListUsageReportsOutput createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public UsageReportsDetailForListUsageReportsOutput downLoadUrl(String downLoadUrl) {
    this.downLoadUrl = downLoadUrl;
    return this;
  }

   /**
   * Get downLoadUrl
   * @return downLoadUrl
  **/
  @Schema(description = "")
  public String getDownLoadUrl() {
    return downLoadUrl;
  }

  public void setDownLoadUrl(String downLoadUrl) {
    this.downLoadUrl = downLoadUrl;
  }

  public UsageReportsDetailForListUsageReportsOutput endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public UsageReportsDetailForListUsageReportsOutput exportType(String exportType) {
    this.exportType = exportType;
    return this;
  }

   /**
   * Get exportType
   * @return exportType
  **/
  @Schema(description = "")
  public String getExportType() {
    return exportType;
  }

  public void setExportType(String exportType) {
    this.exportType = exportType;
  }

  public UsageReportsDetailForListUsageReportsOutput metric(String metric) {
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

  public UsageReportsDetailForListUsageReportsOutput startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public UsageReportsDetailForListUsageReportsOutput status(Long status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public UsageReportsDetailForListUsageReportsOutput taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public UsageReportsDetailForListUsageReportsOutput taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @Schema(description = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public UsageReportsDetailForListUsageReportsOutput timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @Schema(description = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageReportsDetailForListUsageReportsOutput usageReportsDetailForListUsageReportsOutput = (UsageReportsDetailForListUsageReportsOutput) o;
    return Objects.equals(this.accountId, usageReportsDetailForListUsageReportsOutput.accountId) &&
        Objects.equals(this.billingCode, usageReportsDetailForListUsageReportsOutput.billingCode) &&
        Objects.equals(this.billingRegion, usageReportsDetailForListUsageReportsOutput.billingRegion) &&
        Objects.equals(this.calculationMethod, usageReportsDetailForListUsageReportsOutput.calculationMethod) &&
        Objects.equals(this.createTime, usageReportsDetailForListUsageReportsOutput.createTime) &&
        Objects.equals(this.downLoadUrl, usageReportsDetailForListUsageReportsOutput.downLoadUrl) &&
        Objects.equals(this.endTime, usageReportsDetailForListUsageReportsOutput.endTime) &&
        Objects.equals(this.exportType, usageReportsDetailForListUsageReportsOutput.exportType) &&
        Objects.equals(this.metric, usageReportsDetailForListUsageReportsOutput.metric) &&
        Objects.equals(this.startTime, usageReportsDetailForListUsageReportsOutput.startTime) &&
        Objects.equals(this.status, usageReportsDetailForListUsageReportsOutput.status) &&
        Objects.equals(this.taskId, usageReportsDetailForListUsageReportsOutput.taskId) &&
        Objects.equals(this.taskName, usageReportsDetailForListUsageReportsOutput.taskName) &&
        Objects.equals(this.timeZone, usageReportsDetailForListUsageReportsOutput.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, billingCode, billingRegion, calculationMethod, createTime, downLoadUrl, endTime, exportType, metric, startTime, status, taskId, taskName, timeZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageReportsDetailForListUsageReportsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    billingCode: ").append(toIndentedString(billingCode)).append("\n");
    sb.append("    billingRegion: ").append(toIndentedString(billingRegion)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    downLoadUrl: ").append(toIndentedString(downLoadUrl)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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