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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetGroupCheckStatusResponse
 */



public class GetGroupCheckStatusResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("LastCheckTime")
  private Integer lastCheckTime = null;

  @SerializedName("Progress")
  private Integer progress = null;

  @SerializedName("Status")
  private String status = null;

  public GetGroupCheckStatusResponse lastCheckTime(Integer lastCheckTime) {
    this.lastCheckTime = lastCheckTime;
    return this;
  }

   /**
   * Get lastCheckTime
   * @return lastCheckTime
  **/
  @Schema(description = "")
  public Integer getLastCheckTime() {
    return lastCheckTime;
  }

  public void setLastCheckTime(Integer lastCheckTime) {
    this.lastCheckTime = lastCheckTime;
  }

  public GetGroupCheckStatusResponse progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public GetGroupCheckStatusResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupCheckStatusResponse getGroupCheckStatusResponse = (GetGroupCheckStatusResponse) o;
    return Objects.equals(this.lastCheckTime, getGroupCheckStatusResponse.lastCheckTime) &&
        Objects.equals(this.progress, getGroupCheckStatusResponse.progress) &&
        Objects.equals(this.status, getGroupCheckStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastCheckTime, progress, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupCheckStatusResponse {\n");
    
    sb.append("    lastCheckTime: ").append(toIndentedString(lastCheckTime)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
