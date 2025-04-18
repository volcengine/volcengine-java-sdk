/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.ValueForDescribeDomainRegionDataOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDomainRegionDataResponse
 */



public class DescribeDomainRegionDataResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("DomainName")
  private String domainName = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("Values")
  private List<ValueForDescribeDomainRegionDataOutput> values = null;

  public DescribeDomainRegionDataResponse domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public DescribeDomainRegionDataResponse endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DescribeDomainRegionDataResponse startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DescribeDomainRegionDataResponse values(List<ValueForDescribeDomainRegionDataOutput> values) {
    this.values = values;
    return this;
  }

  public DescribeDomainRegionDataResponse addValuesItem(ValueForDescribeDomainRegionDataOutput valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<ValueForDescribeDomainRegionDataOutput>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Valid
  @Schema(description = "")
  public List<ValueForDescribeDomainRegionDataOutput> getValues() {
    return values;
  }

  public void setValues(List<ValueForDescribeDomainRegionDataOutput> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDomainRegionDataResponse describeDomainRegionDataResponse = (DescribeDomainRegionDataResponse) o;
    return Objects.equals(this.domainName, describeDomainRegionDataResponse.domainName) &&
        Objects.equals(this.endTime, describeDomainRegionDataResponse.endTime) &&
        Objects.equals(this.startTime, describeDomainRegionDataResponse.startTime) &&
        Objects.equals(this.values, describeDomainRegionDataResponse.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, endTime, startTime, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDomainRegionDataResponse {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
