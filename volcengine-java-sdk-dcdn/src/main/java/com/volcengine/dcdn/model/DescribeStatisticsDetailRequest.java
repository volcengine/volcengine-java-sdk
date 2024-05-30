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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeStatisticsDetailRequest
 */


public class DescribeStatisticsDetailRequest {
  @SerializedName("AcceleratingRegion")
  private String acceleratingRegion = null;

  @SerializedName("AcceleratingScope")
  private String acceleratingScope = null;

  @SerializedName("Area")
  private String area = null;

  @SerializedName("Domains")
  private List<String> domains = null;

  @SerializedName("EndTime")
  private String endTime = null;

  @SerializedName("IPVersion")
  private String ipVersion = null;

  @SerializedName("Interval")
  private Integer interval = null;

  @SerializedName("IspNameEn")
  private List<String> ispNameEn = null;

  @SerializedName("Metrics")
  private List<String> metrics = null;

  @SerializedName("ProjectName")
  private List<String> projectName = null;

  @SerializedName("Protocol")
  private List<String> protocol = null;

  @SerializedName("Region")
  private List<String> region = null;

  @SerializedName("StartTime")
  private String startTime = null;

  @SerializedName("Type")
  private String type = null;

  public DescribeStatisticsDetailRequest acceleratingRegion(String acceleratingRegion) {
    this.acceleratingRegion = acceleratingRegion;
    return this;
  }

   /**
   * Get acceleratingRegion
   * @return acceleratingRegion
  **/
  @Schema(description = "")
  public String getAcceleratingRegion() {
    return acceleratingRegion;
  }

  public void setAcceleratingRegion(String acceleratingRegion) {
    this.acceleratingRegion = acceleratingRegion;
  }

  public DescribeStatisticsDetailRequest acceleratingScope(String acceleratingScope) {
    this.acceleratingScope = acceleratingScope;
    return this;
  }

   /**
   * Get acceleratingScope
   * @return acceleratingScope
  **/
  @Schema(description = "")
  public String getAcceleratingScope() {
    return acceleratingScope;
  }

  public void setAcceleratingScope(String acceleratingScope) {
    this.acceleratingScope = acceleratingScope;
  }

  public DescribeStatisticsDetailRequest area(String area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @Schema(description = "")
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public DescribeStatisticsDetailRequest domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public DescribeStatisticsDetailRequest addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<String>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @Schema(description = "")
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public DescribeStatisticsDetailRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DescribeStatisticsDetailRequest ipVersion(String ipVersion) {
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

  public DescribeStatisticsDetailRequest interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(description = "")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public DescribeStatisticsDetailRequest ispNameEn(List<String> ispNameEn) {
    this.ispNameEn = ispNameEn;
    return this;
  }

  public DescribeStatisticsDetailRequest addIspNameEnItem(String ispNameEnItem) {
    if (this.ispNameEn == null) {
      this.ispNameEn = new ArrayList<String>();
    }
    this.ispNameEn.add(ispNameEnItem);
    return this;
  }

   /**
   * Get ispNameEn
   * @return ispNameEn
  **/
  @Schema(description = "")
  public List<String> getIspNameEn() {
    return ispNameEn;
  }

  public void setIspNameEn(List<String> ispNameEn) {
    this.ispNameEn = ispNameEn;
  }

  public DescribeStatisticsDetailRequest metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public DescribeStatisticsDetailRequest addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<String>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  public DescribeStatisticsDetailRequest projectName(List<String> projectName) {
    this.projectName = projectName;
    return this;
  }

  public DescribeStatisticsDetailRequest addProjectNameItem(String projectNameItem) {
    if (this.projectName == null) {
      this.projectName = new ArrayList<String>();
    }
    this.projectName.add(projectNameItem);
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public List<String> getProjectName() {
    return projectName;
  }

  public void setProjectName(List<String> projectName) {
    this.projectName = projectName;
  }

  public DescribeStatisticsDetailRequest protocol(List<String> protocol) {
    this.protocol = protocol;
    return this;
  }

  public DescribeStatisticsDetailRequest addProtocolItem(String protocolItem) {
    if (this.protocol == null) {
      this.protocol = new ArrayList<String>();
    }
    this.protocol.add(protocolItem);
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public List<String> getProtocol() {
    return protocol;
  }

  public void setProtocol(List<String> protocol) {
    this.protocol = protocol;
  }

  public DescribeStatisticsDetailRequest region(List<String> region) {
    this.region = region;
    return this;
  }

  public DescribeStatisticsDetailRequest addRegionItem(String regionItem) {
    if (this.region == null) {
      this.region = new ArrayList<String>();
    }
    this.region.add(regionItem);
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public List<String> getRegion() {
    return region;
  }

  public void setRegion(List<String> region) {
    this.region = region;
  }

  public DescribeStatisticsDetailRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DescribeStatisticsDetailRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeStatisticsDetailRequest describeStatisticsDetailRequest = (DescribeStatisticsDetailRequest) o;
    return Objects.equals(this.acceleratingRegion, describeStatisticsDetailRequest.acceleratingRegion) &&
        Objects.equals(this.acceleratingScope, describeStatisticsDetailRequest.acceleratingScope) &&
        Objects.equals(this.area, describeStatisticsDetailRequest.area) &&
        Objects.equals(this.domains, describeStatisticsDetailRequest.domains) &&
        Objects.equals(this.endTime, describeStatisticsDetailRequest.endTime) &&
        Objects.equals(this.ipVersion, describeStatisticsDetailRequest.ipVersion) &&
        Objects.equals(this.interval, describeStatisticsDetailRequest.interval) &&
        Objects.equals(this.ispNameEn, describeStatisticsDetailRequest.ispNameEn) &&
        Objects.equals(this.metrics, describeStatisticsDetailRequest.metrics) &&
        Objects.equals(this.projectName, describeStatisticsDetailRequest.projectName) &&
        Objects.equals(this.protocol, describeStatisticsDetailRequest.protocol) &&
        Objects.equals(this.region, describeStatisticsDetailRequest.region) &&
        Objects.equals(this.startTime, describeStatisticsDetailRequest.startTime) &&
        Objects.equals(this.type, describeStatisticsDetailRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratingRegion, acceleratingScope, area, domains, endTime, ipVersion, interval, ispNameEn, metrics, projectName, protocol, region, startTime, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeStatisticsDetailRequest {\n");
    
    sb.append("    acceleratingRegion: ").append(toIndentedString(acceleratingRegion)).append("\n");
    sb.append("    acceleratingScope: ").append(toIndentedString(acceleratingScope)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    ispNameEn: ").append(toIndentedString(ispNameEn)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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