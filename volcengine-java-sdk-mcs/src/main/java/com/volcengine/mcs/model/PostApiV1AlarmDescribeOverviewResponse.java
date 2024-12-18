/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcs.model.AlarmStatOverviewForPostApiV1AlarmDescribeOverviewOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PostApiV1AlarmDescribeOverviewResponse
 */



public class PostApiV1AlarmDescribeOverviewResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("alarm_stat_overview")
  private AlarmStatOverviewForPostApiV1AlarmDescribeOverviewOutput alarmStatOverview = null;

  public PostApiV1AlarmDescribeOverviewResponse alarmStatOverview(AlarmStatOverviewForPostApiV1AlarmDescribeOverviewOutput alarmStatOverview) {
    this.alarmStatOverview = alarmStatOverview;
    return this;
  }

   /**
   * Get alarmStatOverview
   * @return alarmStatOverview
  **/
  @Valid
  @Schema(description = "")
  public AlarmStatOverviewForPostApiV1AlarmDescribeOverviewOutput getAlarmStatOverview() {
    return alarmStatOverview;
  }

  public void setAlarmStatOverview(AlarmStatOverviewForPostApiV1AlarmDescribeOverviewOutput alarmStatOverview) {
    this.alarmStatOverview = alarmStatOverview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostApiV1AlarmDescribeOverviewResponse postApiV1AlarmDescribeOverviewResponse = (PostApiV1AlarmDescribeOverviewResponse) o;
    return Objects.equals(this.alarmStatOverview, postApiV1AlarmDescribeOverviewResponse.alarmStatOverview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmStatOverview);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostApiV1AlarmDescribeOverviewResponse {\n");
    
    sb.append("    alarmStatOverview: ").append(toIndentedString(alarmStatOverview)).append("\n");
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
