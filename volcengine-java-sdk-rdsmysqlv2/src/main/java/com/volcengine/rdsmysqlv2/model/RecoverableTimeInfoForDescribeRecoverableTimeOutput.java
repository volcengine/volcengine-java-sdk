/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * RecoverableTimeInfoForDescribeRecoverableTimeOutput
 */



public class RecoverableTimeInfoForDescribeRecoverableTimeOutput {
  @SerializedName("EarliestRecoverableTime")
  private String earliestRecoverableTime = null;

  @SerializedName("LatestRecoverableTime")
  private String latestRecoverableTime = null;

  public RecoverableTimeInfoForDescribeRecoverableTimeOutput earliestRecoverableTime(String earliestRecoverableTime) {
    this.earliestRecoverableTime = earliestRecoverableTime;
    return this;
  }

   /**
   * Get earliestRecoverableTime
   * @return earliestRecoverableTime
  **/
  @Schema(description = "")
  public String getEarliestRecoverableTime() {
    return earliestRecoverableTime;
  }

  public void setEarliestRecoverableTime(String earliestRecoverableTime) {
    this.earliestRecoverableTime = earliestRecoverableTime;
  }

  public RecoverableTimeInfoForDescribeRecoverableTimeOutput latestRecoverableTime(String latestRecoverableTime) {
    this.latestRecoverableTime = latestRecoverableTime;
    return this;
  }

   /**
   * Get latestRecoverableTime
   * @return latestRecoverableTime
  **/
  @Schema(description = "")
  public String getLatestRecoverableTime() {
    return latestRecoverableTime;
  }

  public void setLatestRecoverableTime(String latestRecoverableTime) {
    this.latestRecoverableTime = latestRecoverableTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoverableTimeInfoForDescribeRecoverableTimeOutput recoverableTimeInfoForDescribeRecoverableTimeOutput = (RecoverableTimeInfoForDescribeRecoverableTimeOutput) o;
    return Objects.equals(this.earliestRecoverableTime, recoverableTimeInfoForDescribeRecoverableTimeOutput.earliestRecoverableTime) &&
        Objects.equals(this.latestRecoverableTime, recoverableTimeInfoForDescribeRecoverableTimeOutput.latestRecoverableTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestRecoverableTime, latestRecoverableTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoverableTimeInfoForDescribeRecoverableTimeOutput {\n");
    
    sb.append("    earliestRecoverableTime: ").append(toIndentedString(earliestRecoverableTime)).append("\n");
    sb.append("    latestRecoverableTime: ").append(toIndentedString(latestRecoverableTime)).append("\n");
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
