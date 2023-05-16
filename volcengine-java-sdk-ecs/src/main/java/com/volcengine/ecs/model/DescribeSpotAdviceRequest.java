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
import com.volcengine.ecs.model.GpuForDescribeSpotAdviceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSpotAdviceRequest
 */


public class DescribeSpotAdviceRequest {
  @SerializedName("Cpus")
  private Integer cpus = null;

  @SerializedName("Gpu")
  private GpuForDescribeSpotAdviceInput gpu = null;

  @SerializedName("InstanceTypeFamily")
  private String instanceTypeFamily = null;

  @SerializedName("InstanceTypeIds")
  private List<String> instanceTypeIds = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("MemorySize")
  private Integer memorySize = null;

  @SerializedName("MinCpus")
  private Integer minCpus = null;

  @SerializedName("MinMemorySize")
  private Integer minMemorySize = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public DescribeSpotAdviceRequest cpus(Integer cpus) {
    this.cpus = cpus;
    return this;
  }

   /**
   * Get cpus
   * @return cpus
  **/
  @Schema(description = "")
  public Integer getCpus() {
    return cpus;
  }

  public void setCpus(Integer cpus) {
    this.cpus = cpus;
  }

  public DescribeSpotAdviceRequest gpu(GpuForDescribeSpotAdviceInput gpu) {
    this.gpu = gpu;
    return this;
  }

   /**
   * Get gpu
   * @return gpu
  **/
  @Valid
  @Schema(description = "")
  public GpuForDescribeSpotAdviceInput getGpu() {
    return gpu;
  }

  public void setGpu(GpuForDescribeSpotAdviceInput gpu) {
    this.gpu = gpu;
  }

  public DescribeSpotAdviceRequest instanceTypeFamily(String instanceTypeFamily) {
    this.instanceTypeFamily = instanceTypeFamily;
    return this;
  }

   /**
   * Get instanceTypeFamily
   * @return instanceTypeFamily
  **/
  @Schema(description = "")
  public String getInstanceTypeFamily() {
    return instanceTypeFamily;
  }

  public void setInstanceTypeFamily(String instanceTypeFamily) {
    this.instanceTypeFamily = instanceTypeFamily;
  }

  public DescribeSpotAdviceRequest instanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
    return this;
  }

  public DescribeSpotAdviceRequest addInstanceTypeIdsItem(String instanceTypeIdsItem) {
    if (this.instanceTypeIds == null) {
      this.instanceTypeIds = new ArrayList<String>();
    }
    this.instanceTypeIds.add(instanceTypeIdsItem);
    return this;
  }

   /**
   * Get instanceTypeIds
   * @return instanceTypeIds
  **/
  @Schema(description = "")
  public List<String> getInstanceTypeIds() {
    return instanceTypeIds;
  }

  public void setInstanceTypeIds(List<String> instanceTypeIds) {
    this.instanceTypeIds = instanceTypeIds;
  }

  public DescribeSpotAdviceRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeSpotAdviceRequest memorySize(Integer memorySize) {
    this.memorySize = memorySize;
    return this;
  }

   /**
   * Get memorySize
   * @return memorySize
  **/
  @Schema(description = "")
  public Integer getMemorySize() {
    return memorySize;
  }

  public void setMemorySize(Integer memorySize) {
    this.memorySize = memorySize;
  }

  public DescribeSpotAdviceRequest minCpus(Integer minCpus) {
    this.minCpus = minCpus;
    return this;
  }

   /**
   * Get minCpus
   * @return minCpus
  **/
  @Schema(description = "")
  public Integer getMinCpus() {
    return minCpus;
  }

  public void setMinCpus(Integer minCpus) {
    this.minCpus = minCpus;
  }

  public DescribeSpotAdviceRequest minMemorySize(Integer minMemorySize) {
    this.minMemorySize = minMemorySize;
    return this;
  }

   /**
   * Get minMemorySize
   * @return minMemorySize
  **/
  @Schema(description = "")
  public Integer getMinMemorySize() {
    return minMemorySize;
  }

  public void setMinMemorySize(Integer minMemorySize) {
    this.minMemorySize = minMemorySize;
  }

  public DescribeSpotAdviceRequest nextToken(String nextToken) {
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
    DescribeSpotAdviceRequest describeSpotAdviceRequest = (DescribeSpotAdviceRequest) o;
    return Objects.equals(this.cpus, describeSpotAdviceRequest.cpus) &&
        Objects.equals(this.gpu, describeSpotAdviceRequest.gpu) &&
        Objects.equals(this.instanceTypeFamily, describeSpotAdviceRequest.instanceTypeFamily) &&
        Objects.equals(this.instanceTypeIds, describeSpotAdviceRequest.instanceTypeIds) &&
        Objects.equals(this.maxResults, describeSpotAdviceRequest.maxResults) &&
        Objects.equals(this.memorySize, describeSpotAdviceRequest.memorySize) &&
        Objects.equals(this.minCpus, describeSpotAdviceRequest.minCpus) &&
        Objects.equals(this.minMemorySize, describeSpotAdviceRequest.minMemorySize) &&
        Objects.equals(this.nextToken, describeSpotAdviceRequest.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpus, gpu, instanceTypeFamily, instanceTypeIds, maxResults, memorySize, minCpus, minMemorySize, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSpotAdviceRequest {\n");
    
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    instanceTypeFamily: ").append(toIndentedString(instanceTypeFamily)).append("\n");
    sb.append("    instanceTypeIds: ").append(toIndentedString(instanceTypeIds)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    minCpus: ").append(toIndentedString(minCpus)).append("\n");
    sb.append("    minMemorySize: ").append(toIndentedString(minMemorySize)).append("\n");
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