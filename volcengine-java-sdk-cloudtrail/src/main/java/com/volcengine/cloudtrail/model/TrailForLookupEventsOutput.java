/*
 * cloud_trail
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cloudtrail.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cloudtrail.model.RelatedResourceForLookupEventsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TrailForLookupEventsOutput
 */



public class TrailForLookupEventsOutput {
  @SerializedName("AccessKeyID")
  private String accessKeyID = null;

  @SerializedName("ErrorCode")
  private String errorCode = null;

  @SerializedName("EventDetail")
  private String eventDetail = null;

  @SerializedName("EventID")
  private String eventID = null;

  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("EventNameDisplay")
  private String eventNameDisplay = null;

  @SerializedName("EventSource")
  private String eventSource = null;

  @SerializedName("EventSourceDisplay")
  private String eventSourceDisplay = null;

  @SerializedName("EventTime")
  private String eventTime = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("RelatedResources")
  private List<RelatedResourceForLookupEventsOutput> relatedResources = null;

  @SerializedName("RequestID")
  private String requestID = null;

  @SerializedName("SourceIPAddress")
  private String sourceIPAddress = null;

  @SerializedName("UserName")
  private String userName = null;

  public TrailForLookupEventsOutput accessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
    return this;
  }

   /**
   * Get accessKeyID
   * @return accessKeyID
  **/
  @Schema(description = "")
  public String getAccessKeyID() {
    return accessKeyID;
  }

  public void setAccessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
  }

  public TrailForLookupEventsOutput errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public TrailForLookupEventsOutput eventDetail(String eventDetail) {
    this.eventDetail = eventDetail;
    return this;
  }

   /**
   * Get eventDetail
   * @return eventDetail
  **/
  @Schema(description = "")
  public String getEventDetail() {
    return eventDetail;
  }

  public void setEventDetail(String eventDetail) {
    this.eventDetail = eventDetail;
  }

  public TrailForLookupEventsOutput eventID(String eventID) {
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @Schema(description = "")
  public String getEventID() {
    return eventID;
  }

  public void setEventID(String eventID) {
    this.eventID = eventID;
  }

  public TrailForLookupEventsOutput eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @Schema(description = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public TrailForLookupEventsOutput eventNameDisplay(String eventNameDisplay) {
    this.eventNameDisplay = eventNameDisplay;
    return this;
  }

   /**
   * Get eventNameDisplay
   * @return eventNameDisplay
  **/
  @Schema(description = "")
  public String getEventNameDisplay() {
    return eventNameDisplay;
  }

  public void setEventNameDisplay(String eventNameDisplay) {
    this.eventNameDisplay = eventNameDisplay;
  }

  public TrailForLookupEventsOutput eventSource(String eventSource) {
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Get eventSource
   * @return eventSource
  **/
  @Schema(description = "")
  public String getEventSource() {
    return eventSource;
  }

  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }

  public TrailForLookupEventsOutput eventSourceDisplay(String eventSourceDisplay) {
    this.eventSourceDisplay = eventSourceDisplay;
    return this;
  }

   /**
   * Get eventSourceDisplay
   * @return eventSourceDisplay
  **/
  @Schema(description = "")
  public String getEventSourceDisplay() {
    return eventSourceDisplay;
  }

  public void setEventSourceDisplay(String eventSourceDisplay) {
    this.eventSourceDisplay = eventSourceDisplay;
  }

  public TrailForLookupEventsOutput eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Get eventTime
   * @return eventTime
  **/
  @Schema(description = "")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public TrailForLookupEventsOutput region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public TrailForLookupEventsOutput relatedResources(List<RelatedResourceForLookupEventsOutput> relatedResources) {
    this.relatedResources = relatedResources;
    return this;
  }

  public TrailForLookupEventsOutput addRelatedResourcesItem(RelatedResourceForLookupEventsOutput relatedResourcesItem) {
    if (this.relatedResources == null) {
      this.relatedResources = new ArrayList<RelatedResourceForLookupEventsOutput>();
    }
    this.relatedResources.add(relatedResourcesItem);
    return this;
  }

   /**
   * Get relatedResources
   * @return relatedResources
  **/
  @Valid
  @Schema(description = "")
  public List<RelatedResourceForLookupEventsOutput> getRelatedResources() {
    return relatedResources;
  }

  public void setRelatedResources(List<RelatedResourceForLookupEventsOutput> relatedResources) {
    this.relatedResources = relatedResources;
  }

  public TrailForLookupEventsOutput requestID(String requestID) {
    this.requestID = requestID;
    return this;
  }

   /**
   * Get requestID
   * @return requestID
  **/
  @Schema(description = "")
  public String getRequestID() {
    return requestID;
  }

  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  public TrailForLookupEventsOutput sourceIPAddress(String sourceIPAddress) {
    this.sourceIPAddress = sourceIPAddress;
    return this;
  }

   /**
   * Get sourceIPAddress
   * @return sourceIPAddress
  **/
  @Schema(description = "")
  public String getSourceIPAddress() {
    return sourceIPAddress;
  }

  public void setSourceIPAddress(String sourceIPAddress) {
    this.sourceIPAddress = sourceIPAddress;
  }

  public TrailForLookupEventsOutput userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrailForLookupEventsOutput trailForLookupEventsOutput = (TrailForLookupEventsOutput) o;
    return Objects.equals(this.accessKeyID, trailForLookupEventsOutput.accessKeyID) &&
        Objects.equals(this.errorCode, trailForLookupEventsOutput.errorCode) &&
        Objects.equals(this.eventDetail, trailForLookupEventsOutput.eventDetail) &&
        Objects.equals(this.eventID, trailForLookupEventsOutput.eventID) &&
        Objects.equals(this.eventName, trailForLookupEventsOutput.eventName) &&
        Objects.equals(this.eventNameDisplay, trailForLookupEventsOutput.eventNameDisplay) &&
        Objects.equals(this.eventSource, trailForLookupEventsOutput.eventSource) &&
        Objects.equals(this.eventSourceDisplay, trailForLookupEventsOutput.eventSourceDisplay) &&
        Objects.equals(this.eventTime, trailForLookupEventsOutput.eventTime) &&
        Objects.equals(this.region, trailForLookupEventsOutput.region) &&
        Objects.equals(this.relatedResources, trailForLookupEventsOutput.relatedResources) &&
        Objects.equals(this.requestID, trailForLookupEventsOutput.requestID) &&
        Objects.equals(this.sourceIPAddress, trailForLookupEventsOutput.sourceIPAddress) &&
        Objects.equals(this.userName, trailForLookupEventsOutput.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyID, errorCode, eventDetail, eventID, eventName, eventNameDisplay, eventSource, eventSourceDisplay, eventTime, region, relatedResources, requestID, sourceIPAddress, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrailForLookupEventsOutput {\n");
    
    sb.append("    accessKeyID: ").append(toIndentedString(accessKeyID)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    eventDetail: ").append(toIndentedString(eventDetail)).append("\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventNameDisplay: ").append(toIndentedString(eventNameDisplay)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventSourceDisplay: ").append(toIndentedString(eventSourceDisplay)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    relatedResources: ").append(toIndentedString(relatedResources)).append("\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    sourceIPAddress: ").append(toIndentedString(sourceIPAddress)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
