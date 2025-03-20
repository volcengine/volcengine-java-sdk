/*
 * cloud_detect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clouddetect.model;

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
 * EndTimeForGetTaskOutput
 */



public class EndTimeForGetTaskOutput {
  @SerializedName("Hour")
  private Integer hour = null;

  @SerializedName("Minute")
  private Integer minute = null;

  public EndTimeForGetTaskOutput hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  @Schema(description = "")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public EndTimeForGetTaskOutput minute(Integer minute) {
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @Schema(description = "")
  public Integer getMinute() {
    return minute;
  }

  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndTimeForGetTaskOutput endTimeForGetTaskOutput = (EndTimeForGetTaskOutput) o;
    return Objects.equals(this.hour, endTimeForGetTaskOutput.hour) &&
        Objects.equals(this.minute, endTimeForGetTaskOutput.minute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndTimeForGetTaskOutput {\n");
    
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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
