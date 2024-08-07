/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * DescribeUserDataRequest
 */



public class DescribeUserDataRequest {
  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("EndTime")
  private Long endTime = null;

  @SerializedName("Interval")
  private String interval = null;

  @SerializedName("IpVersion")
  private String ipVersion = null;

  @SerializedName("Location")
  private String location = null;

  @SerializedName("Province")
  private String province = null;

  @SerializedName("StartTime")
  private Long startTime = null;

  public DescribeUserDataRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DescribeUserDataRequest endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public DescribeUserDataRequest interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public DescribeUserDataRequest ipVersion(String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * Get ipVersion
   * @return ipVersion
  **/
  @Schema(description = "")
  public String getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(String ipVersion) {
    this.ipVersion = ipVersion;
  }

  public DescribeUserDataRequest location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public DescribeUserDataRequest province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @Schema(description = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public DescribeUserDataRequest startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
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
    DescribeUserDataRequest describeUserDataRequest = (DescribeUserDataRequest) o;
    return Objects.equals(this.domain, describeUserDataRequest.domain) &&
        Objects.equals(this.endTime, describeUserDataRequest.endTime) &&
        Objects.equals(this.interval, describeUserDataRequest.interval) &&
        Objects.equals(this.ipVersion, describeUserDataRequest.ipVersion) &&
        Objects.equals(this.location, describeUserDataRequest.location) &&
        Objects.equals(this.province, describeUserDataRequest.province) &&
        Objects.equals(this.startTime, describeUserDataRequest.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, endTime, interval, ipVersion, location, province, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeUserDataRequest {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
