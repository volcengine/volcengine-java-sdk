/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

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
 * ListEventsRequest
 */



public class ListEventsRequest {
  @SerializedName("Asc")
  private Boolean asc = null;

  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("EventType")
  private List<String> eventType = null;

  @SerializedName("ID")
  private List<String> ID = null;

  /**
   * Gets or Sets orderBy
   */
  @JsonAdapter(OrderByEnum.Adapter.class)
  public enum OrderByEnum {
    @SerializedName("HappenTime")
    HAPPENTIME("HappenTime");

    private String value;

    OrderByEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OrderByEnum fromValue(String input) {
      for (OrderByEnum b : OrderByEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OrderByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderByEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OrderByEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OrderByEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("OrderBy")
  private OrderByEnum orderBy = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("Source")
  private List<String> source = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  public ListEventsRequest asc(Boolean asc) {
    this.asc = asc;
    return this;
  }

   /**
   * Get asc
   * @return asc
  **/
  @Schema(description = "")
  public Boolean isAsc() {
    return asc;
  }

  public void setAsc(Boolean asc) {
    this.asc = asc;
  }

  public ListEventsRequest endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public ListEventsRequest eventType(List<String> eventType) {
    this.eventType = eventType;
    return this;
  }

  public ListEventsRequest addEventTypeItem(String eventTypeItem) {
    if (this.eventType == null) {
      this.eventType = new ArrayList<String>();
    }
    this.eventType.add(eventTypeItem);
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(description = "")
  public List<String> getEventType() {
    return eventType;
  }

  public void setEventType(List<String> eventType) {
    this.eventType = eventType;
  }

  public ListEventsRequest ID(List<String> ID) {
    this.ID = ID;
    return this;
  }

  public ListEventsRequest addIDItem(String IDItem) {
    if (this.ID == null) {
      this.ID = new ArrayList<String>();
    }
    this.ID.add(IDItem);
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public List<String> getID() {
    return ID;
  }

  public void setID(List<String> ID) {
    this.ID = ID;
  }

  public ListEventsRequest orderBy(OrderByEnum orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @Schema(description = "")
  public OrderByEnum getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(OrderByEnum orderBy) {
    this.orderBy = orderBy;
  }

  public ListEventsRequest pageNumber(Integer pageNumber) {
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

  public ListEventsRequest pageSize(Integer pageSize) {
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

  public ListEventsRequest region(String region) {
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

  public ListEventsRequest source(List<String> source) {
    this.source = source;
    return this;
  }

  public ListEventsRequest addSourceItem(String sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<String>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public List<String> getSource() {
    return source;
  }

  public void setSource(List<String> source) {
    this.source = source;
  }

  public ListEventsRequest startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEventsRequest listEventsRequest = (ListEventsRequest) o;
    return Objects.equals(this.asc, listEventsRequest.asc) &&
        Objects.equals(this.endTime, listEventsRequest.endTime) &&
        Objects.equals(this.eventType, listEventsRequest.eventType) &&
        Objects.equals(this.ID, listEventsRequest.ID) &&
        Objects.equals(this.orderBy, listEventsRequest.orderBy) &&
        Objects.equals(this.pageNumber, listEventsRequest.pageNumber) &&
        Objects.equals(this.pageSize, listEventsRequest.pageSize) &&
        Objects.equals(this.region, listEventsRequest.region) &&
        Objects.equals(this.source, listEventsRequest.source) &&
        Objects.equals(this.startTime, listEventsRequest.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asc, endTime, eventType, ID, orderBy, pageNumber, pageSize, region, source, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEventsRequest {\n");
    
    sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
