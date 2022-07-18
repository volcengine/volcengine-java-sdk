/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.HealthCheckTemplateForDescribeHealthCheckTemplatesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeHealthCheckTemplatesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-18T11:53:48.716788+08:00[Asia/Shanghai]")
public class DescribeHealthCheckTemplatesResponse {
  @SerializedName("HealthCheckTemplates")
  private List<HealthCheckTemplateForDescribeHealthCheckTemplatesOutput> healthCheckTemplates = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeHealthCheckTemplatesResponse healthCheckTemplates(List<HealthCheckTemplateForDescribeHealthCheckTemplatesOutput> healthCheckTemplates) {
    this.healthCheckTemplates = healthCheckTemplates;
    return this;
  }

  public DescribeHealthCheckTemplatesResponse addHealthCheckTemplatesItem(HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckTemplatesItem) {
    if (this.healthCheckTemplates == null) {
      this.healthCheckTemplates = new ArrayList<HealthCheckTemplateForDescribeHealthCheckTemplatesOutput>();
    }
    this.healthCheckTemplates.add(healthCheckTemplatesItem);
    return this;
  }

   /**
   * Get healthCheckTemplates
   * @return healthCheckTemplates
  **/
  @Valid
  @Schema(description = "")
  public List<HealthCheckTemplateForDescribeHealthCheckTemplatesOutput> getHealthCheckTemplates() {
    return healthCheckTemplates;
  }

  public void setHealthCheckTemplates(List<HealthCheckTemplateForDescribeHealthCheckTemplatesOutput> healthCheckTemplates) {
    this.healthCheckTemplates = healthCheckTemplates;
  }

  public DescribeHealthCheckTemplatesResponse pageNumber(Integer pageNumber) {
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

  public DescribeHealthCheckTemplatesResponse pageSize(Integer pageSize) {
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

  public DescribeHealthCheckTemplatesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeHealthCheckTemplatesResponse totalCount(Integer totalCount) {
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
    DescribeHealthCheckTemplatesResponse describeHealthCheckTemplatesResponse = (DescribeHealthCheckTemplatesResponse) o;
    return Objects.equals(this.healthCheckTemplates, describeHealthCheckTemplatesResponse.healthCheckTemplates) &&
        Objects.equals(this.pageNumber, describeHealthCheckTemplatesResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeHealthCheckTemplatesResponse.pageSize) &&
        Objects.equals(this.requestId, describeHealthCheckTemplatesResponse.requestId) &&
        Objects.equals(this.totalCount, describeHealthCheckTemplatesResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCheckTemplates, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeHealthCheckTemplatesResponse {\n");
    
    sb.append("    healthCheckTemplates: ").append(toIndentedString(healthCheckTemplates)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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