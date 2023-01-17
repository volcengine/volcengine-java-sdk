/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateSystemEventsRequest
 */


public class UpdateSystemEventsRequest {
  @SerializedName("EventIds")
  private List<String> eventIds = null;

  @SerializedName("OperatedEndAt")
  private String operatedEndAt = null;

  @SerializedName("OperatedStartAt")
  private String operatedStartAt = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  public UpdateSystemEventsRequest eventIds(List<String> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public UpdateSystemEventsRequest addEventIdsItem(String eventIdsItem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<String>();
    }
    this.eventIds.add(eventIdsItem);
    return this;
  }

   /**
   * Get eventIds
   * @return eventIds
  **/
  @Schema(description = "")
  public List<String> getEventIds() {
    return eventIds;
  }

  public void setEventIds(List<String> eventIds) {
    this.eventIds = eventIds;
  }

  public UpdateSystemEventsRequest operatedEndAt(String operatedEndAt) {
    this.operatedEndAt = operatedEndAt;
    return this;
  }

   /**
   * Get operatedEndAt
   * @return operatedEndAt
  **/
  @Schema(description = "")
  public String getOperatedEndAt() {
    return operatedEndAt;
  }

  public void setOperatedEndAt(String operatedEndAt) {
    this.operatedEndAt = operatedEndAt;
  }

  public UpdateSystemEventsRequest operatedStartAt(String operatedStartAt) {
    this.operatedStartAt = operatedStartAt;
    return this;
  }

   /**
   * Get operatedStartAt
   * @return operatedStartAt
  **/
  @Schema(description = "")
  public String getOperatedStartAt() {
    return operatedStartAt;
  }

  public void setOperatedStartAt(String operatedStartAt) {
    this.operatedStartAt = operatedStartAt;
  }

  public UpdateSystemEventsRequest status(String status) {
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

  public UpdateSystemEventsRequest updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSystemEventsRequest updateSystemEventsRequest = (UpdateSystemEventsRequest) o;
    return Objects.equals(this.eventIds, updateSystemEventsRequest.eventIds) &&
        Objects.equals(this.operatedEndAt, updateSystemEventsRequest.operatedEndAt) &&
        Objects.equals(this.operatedStartAt, updateSystemEventsRequest.operatedStartAt) &&
        Objects.equals(this.status, updateSystemEventsRequest.status) &&
        Objects.equals(this.updatedAt, updateSystemEventsRequest.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventIds, operatedEndAt, operatedStartAt, status, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemEventsRequest {\n");
    
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
    sb.append("    operatedEndAt: ").append(toIndentedString(operatedEndAt)).append("\n");
    sb.append("    operatedStartAt: ").append(toIndentedString(operatedStartAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
