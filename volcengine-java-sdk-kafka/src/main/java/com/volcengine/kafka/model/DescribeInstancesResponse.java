/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kafka.model.InstancesInfoForDescribeInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeInstancesResponse
 */



public class DescribeInstancesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstancesInfo")
  private List<InstancesInfoForDescribeInstancesOutput> instancesInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeInstancesResponse instancesInfo(List<InstancesInfoForDescribeInstancesOutput> instancesInfo) {
    this.instancesInfo = instancesInfo;
    return this;
  }

  public DescribeInstancesResponse addInstancesInfoItem(InstancesInfoForDescribeInstancesOutput instancesInfoItem) {
    if (this.instancesInfo == null) {
      this.instancesInfo = new ArrayList<InstancesInfoForDescribeInstancesOutput>();
    }
    this.instancesInfo.add(instancesInfoItem);
    return this;
  }

   /**
   * Get instancesInfo
   * @return instancesInfo
  **/
  @Valid
  @Schema(description = "")
  public List<InstancesInfoForDescribeInstancesOutput> getInstancesInfo() {
    return instancesInfo;
  }

  public void setInstancesInfo(List<InstancesInfoForDescribeInstancesOutput> instancesInfo) {
    this.instancesInfo = instancesInfo;
  }

  public DescribeInstancesResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeInstancesResponse describeInstancesResponse = (DescribeInstancesResponse) o;
    return Objects.equals(this.instancesInfo, describeInstancesResponse.instancesInfo) &&
        Objects.equals(this.total, describeInstancesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instancesInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInstancesResponse {\n");
    
    sb.append("    instancesInfo: ").append(toIndentedString(instancesInfo)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
