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
 * TimeOutActionForBatchUpdateCdnConfigInput
 */



public class TimeOutActionForBatchUpdateCdnConfigInput {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("Time")
  private Long time = null;

  public TimeOutActionForBatchUpdateCdnConfigInput action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public TimeOutActionForBatchUpdateCdnConfigInput time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOutActionForBatchUpdateCdnConfigInput timeOutActionForBatchUpdateCdnConfigInput = (TimeOutActionForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.action, timeOutActionForBatchUpdateCdnConfigInput.action) &&
        Objects.equals(this.time, timeOutActionForBatchUpdateCdnConfigInput.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOutActionForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
