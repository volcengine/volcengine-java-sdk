/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * LoadBalancerSpecForDescribeLoadBalancerSpecsOutput
 */



public class LoadBalancerSpecForDescribeLoadBalancerSpecsOutput {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("ChineseSpec")
  private String chineseSpec = null;

  @SerializedName("EnglishSpec")
  private String englishSpec = null;

  @SerializedName("MaxConnections")
  private Integer maxConnections = null;

  @SerializedName("NewConnectionsPerSecond")
  private Integer newConnectionsPerSecond = null;

  @SerializedName("QueriesPerSecond")
  private Integer queriesPerSecond = null;

  public LoadBalancerSpecForDescribeLoadBalancerSpecsOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public LoadBalancerSpecForDescribeLoadBalancerSpecsOutput chineseSpec(String chineseSpec) {
    this.chineseSpec = chineseSpec;
    return this;
  }

   /**
   * Get chineseSpec
   * @return chineseSpec
  **/
  @Schema(description = "")
  public String getChineseSpec() {
    return chineseSpec;
  }

  public void setChineseSpec(String chineseSpec) {
    this.chineseSpec = chineseSpec;
  }

  public LoadBalancerSpecForDescribeLoadBalancerSpecsOutput englishSpec(String englishSpec) {
    this.englishSpec = englishSpec;
    return this;
  }

   /**
   * Get englishSpec
   * @return englishSpec
  **/
  @Schema(description = "")
  public String getEnglishSpec() {
    return englishSpec;
  }

  public void setEnglishSpec(String englishSpec) {
    this.englishSpec = englishSpec;
  }

  public LoadBalancerSpecForDescribeLoadBalancerSpecsOutput maxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

   /**
   * Get maxConnections
   * @return maxConnections
  **/
  @Schema(description = "")
  public Integer getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
  }

  public LoadBalancerSpecForDescribeLoadBalancerSpecsOutput newConnectionsPerSecond(Integer newConnectionsPerSecond) {
    this.newConnectionsPerSecond = newConnectionsPerSecond;
    return this;
  }

   /**
   * Get newConnectionsPerSecond
   * @return newConnectionsPerSecond
  **/
  @Schema(description = "")
  public Integer getNewConnectionsPerSecond() {
    return newConnectionsPerSecond;
  }

  public void setNewConnectionsPerSecond(Integer newConnectionsPerSecond) {
    this.newConnectionsPerSecond = newConnectionsPerSecond;
  }

  public LoadBalancerSpecForDescribeLoadBalancerSpecsOutput queriesPerSecond(Integer queriesPerSecond) {
    this.queriesPerSecond = queriesPerSecond;
    return this;
  }

   /**
   * Get queriesPerSecond
   * @return queriesPerSecond
  **/
  @Schema(description = "")
  public Integer getQueriesPerSecond() {
    return queriesPerSecond;
  }

  public void setQueriesPerSecond(Integer queriesPerSecond) {
    this.queriesPerSecond = queriesPerSecond;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerSpecForDescribeLoadBalancerSpecsOutput loadBalancerSpecForDescribeLoadBalancerSpecsOutput = (LoadBalancerSpecForDescribeLoadBalancerSpecsOutput) o;
    return Objects.equals(this.bandwidth, loadBalancerSpecForDescribeLoadBalancerSpecsOutput.bandwidth) &&
        Objects.equals(this.chineseSpec, loadBalancerSpecForDescribeLoadBalancerSpecsOutput.chineseSpec) &&
        Objects.equals(this.englishSpec, loadBalancerSpecForDescribeLoadBalancerSpecsOutput.englishSpec) &&
        Objects.equals(this.maxConnections, loadBalancerSpecForDescribeLoadBalancerSpecsOutput.maxConnections) &&
        Objects.equals(this.newConnectionsPerSecond, loadBalancerSpecForDescribeLoadBalancerSpecsOutput.newConnectionsPerSecond) &&
        Objects.equals(this.queriesPerSecond, loadBalancerSpecForDescribeLoadBalancerSpecsOutput.queriesPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, chineseSpec, englishSpec, maxConnections, newConnectionsPerSecond, queriesPerSecond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerSpecForDescribeLoadBalancerSpecsOutput {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    chineseSpec: ").append(toIndentedString(chineseSpec)).append("\n");
    sb.append("    englishSpec: ").append(toIndentedString(englishSpec)).append("\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    newConnectionsPerSecond: ").append(toIndentedString(newConnectionsPerSecond)).append("\n");
    sb.append("    queriesPerSecond: ").append(toIndentedString(queriesPerSecond)).append("\n");
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
