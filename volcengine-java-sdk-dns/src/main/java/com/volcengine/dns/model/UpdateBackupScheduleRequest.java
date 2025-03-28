/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

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
 * UpdateBackupScheduleRequest
 */



public class UpdateBackupScheduleRequest {
  @SerializedName("Schedule")
  private Integer schedule = null;

  @SerializedName("ZID")
  private Long ZID = null;

  public UpdateBackupScheduleRequest schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }

  public UpdateBackupScheduleRequest ZID(Long ZID) {
    this.ZID = ZID;
    return this;
  }

   /**
   * Get ZID
   * @return ZID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Long getZID() {
    return ZID;
  }

  public void setZID(Long ZID) {
    this.ZID = ZID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBackupScheduleRequest updateBackupScheduleRequest = (UpdateBackupScheduleRequest) o;
    return Objects.equals(this.schedule, updateBackupScheduleRequest.schedule) &&
        Objects.equals(this.ZID, updateBackupScheduleRequest.ZID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, ZID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBackupScheduleRequest {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    ZID: ").append(toIndentedString(ZID)).append("\n");
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
