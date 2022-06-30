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
import com.volcengine.ecs.model.DeploymentSetForDescribeDeploymentSetsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDeploymentSetsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class DescribeDeploymentSetsResponse {
  @SerializedName("DeploymentSets")
  private List<DeploymentSetForDescribeDeploymentSetsOutput> deploymentSets = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeDeploymentSetsResponse deploymentSets(List<DeploymentSetForDescribeDeploymentSetsOutput> deploymentSets) {
    this.deploymentSets = deploymentSets;
    return this;
  }

  public DescribeDeploymentSetsResponse addDeploymentSetsItem(DeploymentSetForDescribeDeploymentSetsOutput deploymentSetsItem) {
    if (this.deploymentSets == null) {
      this.deploymentSets = new ArrayList<DeploymentSetForDescribeDeploymentSetsOutput>();
    }
    this.deploymentSets.add(deploymentSetsItem);
    return this;
  }

   /**
   * Get deploymentSets
   * @return deploymentSets
  **/
  @Valid
  @Schema(description = "")
  public List<DeploymentSetForDescribeDeploymentSetsOutput> getDeploymentSets() {
    return deploymentSets;
  }

  public void setDeploymentSets(List<DeploymentSetForDescribeDeploymentSetsOutput> deploymentSets) {
    this.deploymentSets = deploymentSets;
  }

  public DescribeDeploymentSetsResponse nextToken(String nextToken) {
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

  public DescribeDeploymentSetsResponse pageNumber(Integer pageNumber) {
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

  public DescribeDeploymentSetsResponse pageSize(Integer pageSize) {
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

  public DescribeDeploymentSetsResponse totalCount(Integer totalCount) {
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
    DescribeDeploymentSetsResponse describeDeploymentSetsResponse = (DescribeDeploymentSetsResponse) o;
    return Objects.equals(this.deploymentSets, describeDeploymentSetsResponse.deploymentSets) &&
        Objects.equals(this.nextToken, describeDeploymentSetsResponse.nextToken) &&
        Objects.equals(this.pageNumber, describeDeploymentSetsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeDeploymentSetsResponse.pageSize) &&
        Objects.equals(this.totalCount, describeDeploymentSetsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentSets, nextToken, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDeploymentSetsResponse {\n");
    
    sb.append("    deploymentSets: ").append(toIndentedString(deploymentSets)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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