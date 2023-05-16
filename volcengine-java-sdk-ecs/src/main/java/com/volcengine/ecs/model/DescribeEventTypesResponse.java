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
import com.volcengine.ecs.model.EventTypeForDescribeEventTypesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeEventTypesResponse
 */


public class DescribeEventTypesResponse {
  @SerializedName("EventTypes")
  private List<EventTypeForDescribeEventTypesOutput> eventTypes = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public DescribeEventTypesResponse eventTypes(List<EventTypeForDescribeEventTypesOutput> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public DescribeEventTypesResponse addEventTypesItem(EventTypeForDescribeEventTypesOutput eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<EventTypeForDescribeEventTypesOutput>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Get eventTypes
   * @return eventTypes
  **/
  @Valid
  @Schema(description = "")
  public List<EventTypeForDescribeEventTypesOutput> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<EventTypeForDescribeEventTypesOutput> eventTypes) {
    this.eventTypes = eventTypes;
  }

  public DescribeEventTypesResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeEventTypesResponse describeEventTypesResponse = (DescribeEventTypesResponse) o;
    return Objects.equals(this.eventTypes, describeEventTypesResponse.eventTypes) &&
        Objects.equals(this.nextToken, describeEventTypesResponse.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTypes, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeEventTypesResponse {\n");
    
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
