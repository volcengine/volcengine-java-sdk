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
 * DescribeRealTimeDataRequest
 */


public class DescribeRealTimeDataRequest {
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

  public DescribeRealTimeDataRequest acceleratingRegion(String acceleratingRegion) {
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

  public DescribeRealTimeDataRequest acceleratingScope(String acceleratingScope) {
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

  public DescribeRealTimeDataRequest area(String area) {
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

  public DescribeRealTimeDataRequest domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public DescribeRealTimeDataRequest addDomainsItem(String domainsItem) {
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

  public DescribeRealTimeDataRequest endTime(String endTime) {
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

  public DescribeRealTimeDataRequest ipVersion(String ipVersion) {
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

  public DescribeRealTimeDataRequest ispNameEn(List<String> ispNameEn) {
    this.ispNameEn = ispNameEn;
    return this;
  }

  public DescribeRealTimeDataRequest addIspNameEnItem(String ispNameEnItem) {
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

  public DescribeRealTimeDataRequest metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public DescribeRealTimeDataRequest addMetricsItem(String metricsItem) {
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

  public DescribeRealTimeDataRequest projectName(List<String> projectName) {
    this.projectName = projectName;
    return this;
  }

  public DescribeRealTimeDataRequest addProjectNameItem(String projectNameItem) {
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

  public DescribeRealTimeDataRequest protocol(List<String> protocol) {
    this.protocol = protocol;
    return this;
  }

  public DescribeRealTimeDataRequest addProtocolItem(String protocolItem) {
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

  public DescribeRealTimeDataRequest region(List<String> region) {
    this.region = region;
    return this;
  }

  public DescribeRealTimeDataRequest addRegionItem(String regionItem) {
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

  public DescribeRealTimeDataRequest startTime(String startTime) {
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

  public DescribeRealTimeDataRequest type(String type) {
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
    DescribeRealTimeDataRequest describeRealTimeDataRequest = (DescribeRealTimeDataRequest) o;
    return Objects.equals(this.acceleratingRegion, describeRealTimeDataRequest.acceleratingRegion) &&
        Objects.equals(this.acceleratingScope, describeRealTimeDataRequest.acceleratingScope) &&
        Objects.equals(this.area, describeRealTimeDataRequest.area) &&
        Objects.equals(this.domains, describeRealTimeDataRequest.domains) &&
        Objects.equals(this.endTime, describeRealTimeDataRequest.endTime) &&
        Objects.equals(this.ipVersion, describeRealTimeDataRequest.ipVersion) &&
        Objects.equals(this.ispNameEn, describeRealTimeDataRequest.ispNameEn) &&
        Objects.equals(this.metrics, describeRealTimeDataRequest.metrics) &&
        Objects.equals(this.projectName, describeRealTimeDataRequest.projectName) &&
        Objects.equals(this.protocol, describeRealTimeDataRequest.protocol) &&
        Objects.equals(this.region, describeRealTimeDataRequest.region) &&
        Objects.equals(this.startTime, describeRealTimeDataRequest.startTime) &&
        Objects.equals(this.type, describeRealTimeDataRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratingRegion, acceleratingScope, area, domains, endTime, ipVersion, ispNameEn, metrics, projectName, protocol, region, startTime, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRealTimeDataRequest {\n");
    
    sb.append("    acceleratingRegion: ").append(toIndentedString(acceleratingRegion)).append("\n");
    sb.append("    acceleratingScope: ").append(toIndentedString(acceleratingScope)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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