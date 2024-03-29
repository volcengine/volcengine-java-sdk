/*
 * spark
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.spark.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.spark.model.ResourceMeterageForlistApplicationHistoryOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataListForlistApplicationHistoryOutput
 */


public class DataListForlistApplicationHistoryOutput {
  @SerializedName("AppCreateTime")
  private String appCreateTime = null;

  @SerializedName("AppFinishTime")
  private String appFinishTime = null;

  @SerializedName("AppStartTime")
  private String appStartTime = null;

  @SerializedName("ResourceMeterage")
  private ResourceMeterageForlistApplicationHistoryOutput resourceMeterage = null;

  @SerializedName("RetryCount")
  private Integer retryCount = null;

  @SerializedName("State")
  private String state = null;

  public DataListForlistApplicationHistoryOutput appCreateTime(String appCreateTime) {
    this.appCreateTime = appCreateTime;
    return this;
  }

   /**
   * Get appCreateTime
   * @return appCreateTime
  **/
  @Schema(description = "")
  public String getAppCreateTime() {
    return appCreateTime;
  }

  public void setAppCreateTime(String appCreateTime) {
    this.appCreateTime = appCreateTime;
  }

  public DataListForlistApplicationHistoryOutput appFinishTime(String appFinishTime) {
    this.appFinishTime = appFinishTime;
    return this;
  }

   /**
   * Get appFinishTime
   * @return appFinishTime
  **/
  @Schema(description = "")
  public String getAppFinishTime() {
    return appFinishTime;
  }

  public void setAppFinishTime(String appFinishTime) {
    this.appFinishTime = appFinishTime;
  }

  public DataListForlistApplicationHistoryOutput appStartTime(String appStartTime) {
    this.appStartTime = appStartTime;
    return this;
  }

   /**
   * Get appStartTime
   * @return appStartTime
  **/
  @Schema(description = "")
  public String getAppStartTime() {
    return appStartTime;
  }

  public void setAppStartTime(String appStartTime) {
    this.appStartTime = appStartTime;
  }

  public DataListForlistApplicationHistoryOutput resourceMeterage(ResourceMeterageForlistApplicationHistoryOutput resourceMeterage) {
    this.resourceMeterage = resourceMeterage;
    return this;
  }

   /**
   * Get resourceMeterage
   * @return resourceMeterage
  **/
  @Valid
  @Schema(description = "")
  public ResourceMeterageForlistApplicationHistoryOutput getResourceMeterage() {
    return resourceMeterage;
  }

  public void setResourceMeterage(ResourceMeterageForlistApplicationHistoryOutput resourceMeterage) {
    this.resourceMeterage = resourceMeterage;
  }

  public DataListForlistApplicationHistoryOutput retryCount(Integer retryCount) {
    this.retryCount = retryCount;
    return this;
  }

   /**
   * Get retryCount
   * @return retryCount
  **/
  @Schema(description = "")
  public Integer getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }

  public DataListForlistApplicationHistoryOutput state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataListForlistApplicationHistoryOutput dataListForlistApplicationHistoryOutput = (DataListForlistApplicationHistoryOutput) o;
    return Objects.equals(this.appCreateTime, dataListForlistApplicationHistoryOutput.appCreateTime) &&
        Objects.equals(this.appFinishTime, dataListForlistApplicationHistoryOutput.appFinishTime) &&
        Objects.equals(this.appStartTime, dataListForlistApplicationHistoryOutput.appStartTime) &&
        Objects.equals(this.resourceMeterage, dataListForlistApplicationHistoryOutput.resourceMeterage) &&
        Objects.equals(this.retryCount, dataListForlistApplicationHistoryOutput.retryCount) &&
        Objects.equals(this.state, dataListForlistApplicationHistoryOutput.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCreateTime, appFinishTime, appStartTime, resourceMeterage, retryCount, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataListForlistApplicationHistoryOutput {\n");
    
    sb.append("    appCreateTime: ").append(toIndentedString(appCreateTime)).append("\n");
    sb.append("    appFinishTime: ").append(toIndentedString(appFinishTime)).append("\n");
    sb.append("    appStartTime: ").append(toIndentedString(appStartTime)).append("\n");
    sb.append("    resourceMeterage: ").append(toIndentedString(resourceMeterage)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
