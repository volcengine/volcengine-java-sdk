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
 * SpeedLimitTimeForUpdateCdnConfigInput
 */



public class SpeedLimitTimeForUpdateCdnConfigInput {
  @SerializedName("BeginTime")
  private String beginTime = null;

  @SerializedName("DayWeek")
  private String dayWeek = null;

  @SerializedName("EndTime")
  private String endTime = null;

  public SpeedLimitTimeForUpdateCdnConfigInput beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Get beginTime
   * @return beginTime
  **/
  @Schema(description = "")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public SpeedLimitTimeForUpdateCdnConfigInput dayWeek(String dayWeek) {
    this.dayWeek = dayWeek;
    return this;
  }

   /**
   * Get dayWeek
   * @return dayWeek
  **/
  @Schema(description = "")
  public String getDayWeek() {
    return dayWeek;
  }

  public void setDayWeek(String dayWeek) {
    this.dayWeek = dayWeek;
  }

  public SpeedLimitTimeForUpdateCdnConfigInput endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeedLimitTimeForUpdateCdnConfigInput speedLimitTimeForUpdateCdnConfigInput = (SpeedLimitTimeForUpdateCdnConfigInput) o;
    return Objects.equals(this.beginTime, speedLimitTimeForUpdateCdnConfigInput.beginTime) &&
        Objects.equals(this.dayWeek, speedLimitTimeForUpdateCdnConfigInput.dayWeek) &&
        Objects.equals(this.endTime, speedLimitTimeForUpdateCdnConfigInput.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, dayWeek, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeedLimitTimeForUpdateCdnConfigInput {\n");
    
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    dayWeek: ").append(toIndentedString(dayWeek)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
