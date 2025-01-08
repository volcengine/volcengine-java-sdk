/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * QueryAttackSecurityEventResponse
 */



public class QueryAttackSecurityEventResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AttackCount")
  private Integer attackCount = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("CurrentPage")
  private Integer currentPage = null;

  @SerializedName("EventEndTime")
  private Integer eventEndTime = null;

  @SerializedName("EventId")
  private String eventId = null;

  @SerializedName("EventStartTime")
  private Integer eventStartTime = null;

  @SerializedName("EventType")
  private String eventType = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("SecurityLevel")
  private String securityLevel = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public QueryAttackSecurityEventResponse attackCount(Integer attackCount) {
    this.attackCount = attackCount;
    return this;
  }

   /**
   * Get attackCount
   * @return attackCount
  **/
  @Schema(description = "")
  public Integer getAttackCount() {
    return attackCount;
  }

  public void setAttackCount(Integer attackCount) {
    this.attackCount = attackCount;
  }

  public QueryAttackSecurityEventResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public QueryAttackSecurityEventResponse currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @Schema(description = "")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public QueryAttackSecurityEventResponse eventEndTime(Integer eventEndTime) {
    this.eventEndTime = eventEndTime;
    return this;
  }

   /**
   * Get eventEndTime
   * @return eventEndTime
  **/
  @Schema(description = "")
  public Integer getEventEndTime() {
    return eventEndTime;
  }

  public void setEventEndTime(Integer eventEndTime) {
    this.eventEndTime = eventEndTime;
  }

  public QueryAttackSecurityEventResponse eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @Schema(description = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public QueryAttackSecurityEventResponse eventStartTime(Integer eventStartTime) {
    this.eventStartTime = eventStartTime;
    return this;
  }

   /**
   * Get eventStartTime
   * @return eventStartTime
  **/
  @Schema(description = "")
  public Integer getEventStartTime() {
    return eventStartTime;
  }

  public void setEventStartTime(Integer eventStartTime) {
    this.eventStartTime = eventStartTime;
  }

  public QueryAttackSecurityEventResponse eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(description = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public QueryAttackSecurityEventResponse host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public QueryAttackSecurityEventResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public QueryAttackSecurityEventResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public QueryAttackSecurityEventResponse securityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

   /**
   * Get securityLevel
   * @return securityLevel
  **/
  @Schema(description = "")
  public String getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
  }

  public QueryAttackSecurityEventResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryAttackSecurityEventResponse queryAttackSecurityEventResponse = (QueryAttackSecurityEventResponse) o;
    return Objects.equals(this.attackCount, queryAttackSecurityEventResponse.attackCount) &&
        Objects.equals(this.count, queryAttackSecurityEventResponse.count) &&
        Objects.equals(this.currentPage, queryAttackSecurityEventResponse.currentPage) &&
        Objects.equals(this.eventEndTime, queryAttackSecurityEventResponse.eventEndTime) &&
        Objects.equals(this.eventId, queryAttackSecurityEventResponse.eventId) &&
        Objects.equals(this.eventStartTime, queryAttackSecurityEventResponse.eventStartTime) &&
        Objects.equals(this.eventType, queryAttackSecurityEventResponse.eventType) &&
        Objects.equals(this.host, queryAttackSecurityEventResponse.host) &&
        Objects.equals(this.pageNumber, queryAttackSecurityEventResponse.pageNumber) &&
        Objects.equals(this.pageSize, queryAttackSecurityEventResponse.pageSize) &&
        Objects.equals(this.securityLevel, queryAttackSecurityEventResponse.securityLevel) &&
        Objects.equals(this.totalCount, queryAttackSecurityEventResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackCount, count, currentPage, eventEndTime, eventId, eventStartTime, eventType, host, pageNumber, pageSize, securityLevel, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryAttackSecurityEventResponse {\n");
    
    sb.append("    attackCount: ").append(toIndentedString(attackCount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    eventEndTime: ").append(toIndentedString(eventEndTime)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventStartTime: ").append(toIndentedString(eventStartTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
