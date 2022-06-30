/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.autoscaling.model.LifecycleHookForDescribeLifecycleHooksOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeLifecycleHooksResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class DescribeLifecycleHooksResponse {
  @SerializedName("LifecycleHooks")
  private List<LifecycleHookForDescribeLifecycleHooksOutput> lifecycleHooks = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeLifecycleHooksResponse lifecycleHooks(List<LifecycleHookForDescribeLifecycleHooksOutput> lifecycleHooks) {
    this.lifecycleHooks = lifecycleHooks;
    return this;
  }

  public DescribeLifecycleHooksResponse addLifecycleHooksItem(LifecycleHookForDescribeLifecycleHooksOutput lifecycleHooksItem) {
    if (this.lifecycleHooks == null) {
      this.lifecycleHooks = new ArrayList<LifecycleHookForDescribeLifecycleHooksOutput>();
    }
    this.lifecycleHooks.add(lifecycleHooksItem);
    return this;
  }

   /**
   * Get lifecycleHooks
   * @return lifecycleHooks
  **/
  @Valid
  @Schema(description = "")
  public List<LifecycleHookForDescribeLifecycleHooksOutput> getLifecycleHooks() {
    return lifecycleHooks;
  }

  public void setLifecycleHooks(List<LifecycleHookForDescribeLifecycleHooksOutput> lifecycleHooks) {
    this.lifecycleHooks = lifecycleHooks;
  }

  public DescribeLifecycleHooksResponse pageNumber(Integer pageNumber) {
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

  public DescribeLifecycleHooksResponse pageSize(Integer pageSize) {
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

  public DescribeLifecycleHooksResponse totalCount(Integer totalCount) {
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
    DescribeLifecycleHooksResponse describeLifecycleHooksResponse = (DescribeLifecycleHooksResponse) o;
    return Objects.equals(this.lifecycleHooks, describeLifecycleHooksResponse.lifecycleHooks) &&
        Objects.equals(this.pageNumber, describeLifecycleHooksResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeLifecycleHooksResponse.pageSize) &&
        Objects.equals(this.totalCount, describeLifecycleHooksResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleHooks, pageNumber, pageSize, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeLifecycleHooksResponse {\n");
    
    sb.append("    lifecycleHooks: ").append(toIndentedString(lifecycleHooks)).append("\n");
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