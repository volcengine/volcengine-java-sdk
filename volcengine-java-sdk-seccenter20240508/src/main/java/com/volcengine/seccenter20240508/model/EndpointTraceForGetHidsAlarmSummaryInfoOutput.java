/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.seccenter20240508.model.ResultListForGetHidsAlarmSummaryInfoOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EndpointTraceForGetHidsAlarmSummaryInfoOutput
 */



public class EndpointTraceForGetHidsAlarmSummaryInfoOutput {
  @SerializedName("AlarmID")
  private String alarmID = null;

  @SerializedName("ResultList")
  private List<ResultListForGetHidsAlarmSummaryInfoOutput> resultList = null;

  @SerializedName("TraceID")
  private String traceID = null;

  public EndpointTraceForGetHidsAlarmSummaryInfoOutput alarmID(String alarmID) {
    this.alarmID = alarmID;
    return this;
  }

   /**
   * Get alarmID
   * @return alarmID
  **/
  @Schema(description = "")
  public String getAlarmID() {
    return alarmID;
  }

  public void setAlarmID(String alarmID) {
    this.alarmID = alarmID;
  }

  public EndpointTraceForGetHidsAlarmSummaryInfoOutput resultList(List<ResultListForGetHidsAlarmSummaryInfoOutput> resultList) {
    this.resultList = resultList;
    return this;
  }

  public EndpointTraceForGetHidsAlarmSummaryInfoOutput addResultListItem(ResultListForGetHidsAlarmSummaryInfoOutput resultListItem) {
    if (this.resultList == null) {
      this.resultList = new ArrayList<ResultListForGetHidsAlarmSummaryInfoOutput>();
    }
    this.resultList.add(resultListItem);
    return this;
  }

   /**
   * Get resultList
   * @return resultList
  **/
  @Valid
  @Schema(description = "")
  public List<ResultListForGetHidsAlarmSummaryInfoOutput> getResultList() {
    return resultList;
  }

  public void setResultList(List<ResultListForGetHidsAlarmSummaryInfoOutput> resultList) {
    this.resultList = resultList;
  }

  public EndpointTraceForGetHidsAlarmSummaryInfoOutput traceID(String traceID) {
    this.traceID = traceID;
    return this;
  }

   /**
   * Get traceID
   * @return traceID
  **/
  @Schema(description = "")
  public String getTraceID() {
    return traceID;
  }

  public void setTraceID(String traceID) {
    this.traceID = traceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointTraceForGetHidsAlarmSummaryInfoOutput endpointTraceForGetHidsAlarmSummaryInfoOutput = (EndpointTraceForGetHidsAlarmSummaryInfoOutput) o;
    return Objects.equals(this.alarmID, endpointTraceForGetHidsAlarmSummaryInfoOutput.alarmID) &&
        Objects.equals(this.resultList, endpointTraceForGetHidsAlarmSummaryInfoOutput.resultList) &&
        Objects.equals(this.traceID, endpointTraceForGetHidsAlarmSummaryInfoOutput.traceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmID, resultList, traceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointTraceForGetHidsAlarmSummaryInfoOutput {\n");
    
    sb.append("    alarmID: ").append(toIndentedString(alarmID)).append("\n");
    sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
    sb.append("    traceID: ").append(toIndentedString(traceID)).append("\n");
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
