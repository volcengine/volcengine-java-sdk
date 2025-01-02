/*
 * cloud_trail20180101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cloudtrail20180101.model;

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
 * TrailForDescribeTrailsOutput
 */



public class TrailForDescribeTrailsOutput {
  @SerializedName("CreatedTime")
  private String createdTime = null;

  @SerializedName("CreatorID")
  private Long creatorID = null;

  @SerializedName("EventRW")
  private String eventRW = null;

  @SerializedName("EventSources")
  private List<String> eventSources = null;

  @SerializedName("LatestDeliveryError")
  private String latestDeliveryError = null;

  @SerializedName("LatestDeliveryTime")
  private String latestDeliveryTime = null;

  @SerializedName("LoggingStatus")
  private String loggingStatus = null;

  @SerializedName("OrganizationID")
  private Long organizationID = null;

  @SerializedName("StartLoggingTime")
  private String startLoggingTime = null;

  @SerializedName("StopLoggingTime")
  private String stopLoggingTime = null;

  @SerializedName("TlsProjectName")
  private String tlsProjectName = null;

  @SerializedName("TlsProjectRegion")
  private String tlsProjectRegion = null;

  @SerializedName("TlsTopicName")
  private String tlsTopicName = null;

  @SerializedName("TosBucketName")
  private String tosBucketName = null;

  @SerializedName("TosBucketRegion")
  private String tosBucketRegion = null;

  @SerializedName("TosKeyPrefix")
  private String tosKeyPrefix = null;

  @SerializedName("TrailName")
  private String trailName = null;

  @SerializedName("TrailType")
  private Integer trailType = null;

  @SerializedName("UpdatedTime")
  private String updatedTime = null;

  public TrailForDescribeTrailsOutput createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public TrailForDescribeTrailsOutput creatorID(Long creatorID) {
    this.creatorID = creatorID;
    return this;
  }

   /**
   * Get creatorID
   * @return creatorID
  **/
  @Schema(description = "")
  public Long getCreatorID() {
    return creatorID;
  }

  public void setCreatorID(Long creatorID) {
    this.creatorID = creatorID;
  }

  public TrailForDescribeTrailsOutput eventRW(String eventRW) {
    this.eventRW = eventRW;
    return this;
  }

   /**
   * Get eventRW
   * @return eventRW
  **/
  @Schema(description = "")
  public String getEventRW() {
    return eventRW;
  }

  public void setEventRW(String eventRW) {
    this.eventRW = eventRW;
  }

  public TrailForDescribeTrailsOutput eventSources(List<String> eventSources) {
    this.eventSources = eventSources;
    return this;
  }

  public TrailForDescribeTrailsOutput addEventSourcesItem(String eventSourcesItem) {
    if (this.eventSources == null) {
      this.eventSources = new ArrayList<String>();
    }
    this.eventSources.add(eventSourcesItem);
    return this;
  }

   /**
   * Get eventSources
   * @return eventSources
  **/
  @Schema(description = "")
  public List<String> getEventSources() {
    return eventSources;
  }

  public void setEventSources(List<String> eventSources) {
    this.eventSources = eventSources;
  }

  public TrailForDescribeTrailsOutput latestDeliveryError(String latestDeliveryError) {
    this.latestDeliveryError = latestDeliveryError;
    return this;
  }

   /**
   * Get latestDeliveryError
   * @return latestDeliveryError
  **/
  @Schema(description = "")
  public String getLatestDeliveryError() {
    return latestDeliveryError;
  }

  public void setLatestDeliveryError(String latestDeliveryError) {
    this.latestDeliveryError = latestDeliveryError;
  }

  public TrailForDescribeTrailsOutput latestDeliveryTime(String latestDeliveryTime) {
    this.latestDeliveryTime = latestDeliveryTime;
    return this;
  }

   /**
   * Get latestDeliveryTime
   * @return latestDeliveryTime
  **/
  @Schema(description = "")
  public String getLatestDeliveryTime() {
    return latestDeliveryTime;
  }

  public void setLatestDeliveryTime(String latestDeliveryTime) {
    this.latestDeliveryTime = latestDeliveryTime;
  }

  public TrailForDescribeTrailsOutput loggingStatus(String loggingStatus) {
    this.loggingStatus = loggingStatus;
    return this;
  }

   /**
   * Get loggingStatus
   * @return loggingStatus
  **/
  @Schema(description = "")
  public String getLoggingStatus() {
    return loggingStatus;
  }

  public void setLoggingStatus(String loggingStatus) {
    this.loggingStatus = loggingStatus;
  }

  public TrailForDescribeTrailsOutput organizationID(Long organizationID) {
    this.organizationID = organizationID;
    return this;
  }

   /**
   * Get organizationID
   * @return organizationID
  **/
  @Schema(description = "")
  public Long getOrganizationID() {
    return organizationID;
  }

  public void setOrganizationID(Long organizationID) {
    this.organizationID = organizationID;
  }

  public TrailForDescribeTrailsOutput startLoggingTime(String startLoggingTime) {
    this.startLoggingTime = startLoggingTime;
    return this;
  }

   /**
   * Get startLoggingTime
   * @return startLoggingTime
  **/
  @Schema(description = "")
  public String getStartLoggingTime() {
    return startLoggingTime;
  }

  public void setStartLoggingTime(String startLoggingTime) {
    this.startLoggingTime = startLoggingTime;
  }

  public TrailForDescribeTrailsOutput stopLoggingTime(String stopLoggingTime) {
    this.stopLoggingTime = stopLoggingTime;
    return this;
  }

   /**
   * Get stopLoggingTime
   * @return stopLoggingTime
  **/
  @Schema(description = "")
  public String getStopLoggingTime() {
    return stopLoggingTime;
  }

  public void setStopLoggingTime(String stopLoggingTime) {
    this.stopLoggingTime = stopLoggingTime;
  }

  public TrailForDescribeTrailsOutput tlsProjectName(String tlsProjectName) {
    this.tlsProjectName = tlsProjectName;
    return this;
  }

   /**
   * Get tlsProjectName
   * @return tlsProjectName
  **/
  @Schema(description = "")
  public String getTlsProjectName() {
    return tlsProjectName;
  }

  public void setTlsProjectName(String tlsProjectName) {
    this.tlsProjectName = tlsProjectName;
  }

  public TrailForDescribeTrailsOutput tlsProjectRegion(String tlsProjectRegion) {
    this.tlsProjectRegion = tlsProjectRegion;
    return this;
  }

   /**
   * Get tlsProjectRegion
   * @return tlsProjectRegion
  **/
  @Schema(description = "")
  public String getTlsProjectRegion() {
    return tlsProjectRegion;
  }

  public void setTlsProjectRegion(String tlsProjectRegion) {
    this.tlsProjectRegion = tlsProjectRegion;
  }

  public TrailForDescribeTrailsOutput tlsTopicName(String tlsTopicName) {
    this.tlsTopicName = tlsTopicName;
    return this;
  }

   /**
   * Get tlsTopicName
   * @return tlsTopicName
  **/
  @Schema(description = "")
  public String getTlsTopicName() {
    return tlsTopicName;
  }

  public void setTlsTopicName(String tlsTopicName) {
    this.tlsTopicName = tlsTopicName;
  }

  public TrailForDescribeTrailsOutput tosBucketName(String tosBucketName) {
    this.tosBucketName = tosBucketName;
    return this;
  }

   /**
   * Get tosBucketName
   * @return tosBucketName
  **/
  @Schema(description = "")
  public String getTosBucketName() {
    return tosBucketName;
  }

  public void setTosBucketName(String tosBucketName) {
    this.tosBucketName = tosBucketName;
  }

  public TrailForDescribeTrailsOutput tosBucketRegion(String tosBucketRegion) {
    this.tosBucketRegion = tosBucketRegion;
    return this;
  }

   /**
   * Get tosBucketRegion
   * @return tosBucketRegion
  **/
  @Schema(description = "")
  public String getTosBucketRegion() {
    return tosBucketRegion;
  }

  public void setTosBucketRegion(String tosBucketRegion) {
    this.tosBucketRegion = tosBucketRegion;
  }

  public TrailForDescribeTrailsOutput tosKeyPrefix(String tosKeyPrefix) {
    this.tosKeyPrefix = tosKeyPrefix;
    return this;
  }

   /**
   * Get tosKeyPrefix
   * @return tosKeyPrefix
  **/
  @Schema(description = "")
  public String getTosKeyPrefix() {
    return tosKeyPrefix;
  }

  public void setTosKeyPrefix(String tosKeyPrefix) {
    this.tosKeyPrefix = tosKeyPrefix;
  }

  public TrailForDescribeTrailsOutput trailName(String trailName) {
    this.trailName = trailName;
    return this;
  }

   /**
   * Get trailName
   * @return trailName
  **/
  @Schema(description = "")
  public String getTrailName() {
    return trailName;
  }

  public void setTrailName(String trailName) {
    this.trailName = trailName;
  }

  public TrailForDescribeTrailsOutput trailType(Integer trailType) {
    this.trailType = trailType;
    return this;
  }

   /**
   * Get trailType
   * @return trailType
  **/
  @Schema(description = "")
  public Integer getTrailType() {
    return trailType;
  }

  public void setTrailType(Integer trailType) {
    this.trailType = trailType;
  }

  public TrailForDescribeTrailsOutput updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @Schema(description = "")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrailForDescribeTrailsOutput trailForDescribeTrailsOutput = (TrailForDescribeTrailsOutput) o;
    return Objects.equals(this.createdTime, trailForDescribeTrailsOutput.createdTime) &&
        Objects.equals(this.creatorID, trailForDescribeTrailsOutput.creatorID) &&
        Objects.equals(this.eventRW, trailForDescribeTrailsOutput.eventRW) &&
        Objects.equals(this.eventSources, trailForDescribeTrailsOutput.eventSources) &&
        Objects.equals(this.latestDeliveryError, trailForDescribeTrailsOutput.latestDeliveryError) &&
        Objects.equals(this.latestDeliveryTime, trailForDescribeTrailsOutput.latestDeliveryTime) &&
        Objects.equals(this.loggingStatus, trailForDescribeTrailsOutput.loggingStatus) &&
        Objects.equals(this.organizationID, trailForDescribeTrailsOutput.organizationID) &&
        Objects.equals(this.startLoggingTime, trailForDescribeTrailsOutput.startLoggingTime) &&
        Objects.equals(this.stopLoggingTime, trailForDescribeTrailsOutput.stopLoggingTime) &&
        Objects.equals(this.tlsProjectName, trailForDescribeTrailsOutput.tlsProjectName) &&
        Objects.equals(this.tlsProjectRegion, trailForDescribeTrailsOutput.tlsProjectRegion) &&
        Objects.equals(this.tlsTopicName, trailForDescribeTrailsOutput.tlsTopicName) &&
        Objects.equals(this.tosBucketName, trailForDescribeTrailsOutput.tosBucketName) &&
        Objects.equals(this.tosBucketRegion, trailForDescribeTrailsOutput.tosBucketRegion) &&
        Objects.equals(this.tosKeyPrefix, trailForDescribeTrailsOutput.tosKeyPrefix) &&
        Objects.equals(this.trailName, trailForDescribeTrailsOutput.trailName) &&
        Objects.equals(this.trailType, trailForDescribeTrailsOutput.trailType) &&
        Objects.equals(this.updatedTime, trailForDescribeTrailsOutput.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, creatorID, eventRW, eventSources, latestDeliveryError, latestDeliveryTime, loggingStatus, organizationID, startLoggingTime, stopLoggingTime, tlsProjectName, tlsProjectRegion, tlsTopicName, tosBucketName, tosBucketRegion, tosKeyPrefix, trailName, trailType, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrailForDescribeTrailsOutput {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    creatorID: ").append(toIndentedString(creatorID)).append("\n");
    sb.append("    eventRW: ").append(toIndentedString(eventRW)).append("\n");
    sb.append("    eventSources: ").append(toIndentedString(eventSources)).append("\n");
    sb.append("    latestDeliveryError: ").append(toIndentedString(latestDeliveryError)).append("\n");
    sb.append("    latestDeliveryTime: ").append(toIndentedString(latestDeliveryTime)).append("\n");
    sb.append("    loggingStatus: ").append(toIndentedString(loggingStatus)).append("\n");
    sb.append("    organizationID: ").append(toIndentedString(organizationID)).append("\n");
    sb.append("    startLoggingTime: ").append(toIndentedString(startLoggingTime)).append("\n");
    sb.append("    stopLoggingTime: ").append(toIndentedString(stopLoggingTime)).append("\n");
    sb.append("    tlsProjectName: ").append(toIndentedString(tlsProjectName)).append("\n");
    sb.append("    tlsProjectRegion: ").append(toIndentedString(tlsProjectRegion)).append("\n");
    sb.append("    tlsTopicName: ").append(toIndentedString(tlsTopicName)).append("\n");
    sb.append("    tosBucketName: ").append(toIndentedString(tosBucketName)).append("\n");
    sb.append("    tosBucketRegion: ").append(toIndentedString(tosBucketRegion)).append("\n");
    sb.append("    tosKeyPrefix: ").append(toIndentedString(tosKeyPrefix)).append("\n");
    sb.append("    trailName: ").append(toIndentedString(trailName)).append("\n");
    sb.append("    trailType: ").append(toIndentedString(trailType)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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