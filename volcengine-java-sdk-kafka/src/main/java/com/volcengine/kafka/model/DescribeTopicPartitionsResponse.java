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
import com.volcengine.kafka.model.PartitionsInfoForDescribeTopicPartitionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTopicPartitionsResponse
 */



public class DescribeTopicPartitionsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PartitionsInfo")
  private List<PartitionsInfoForDescribeTopicPartitionsOutput> partitionsInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeTopicPartitionsResponse partitionsInfo(List<PartitionsInfoForDescribeTopicPartitionsOutput> partitionsInfo) {
    this.partitionsInfo = partitionsInfo;
    return this;
  }

  public DescribeTopicPartitionsResponse addPartitionsInfoItem(PartitionsInfoForDescribeTopicPartitionsOutput partitionsInfoItem) {
    if (this.partitionsInfo == null) {
      this.partitionsInfo = new ArrayList<PartitionsInfoForDescribeTopicPartitionsOutput>();
    }
    this.partitionsInfo.add(partitionsInfoItem);
    return this;
  }

   /**
   * Get partitionsInfo
   * @return partitionsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<PartitionsInfoForDescribeTopicPartitionsOutput> getPartitionsInfo() {
    return partitionsInfo;
  }

  public void setPartitionsInfo(List<PartitionsInfoForDescribeTopicPartitionsOutput> partitionsInfo) {
    this.partitionsInfo = partitionsInfo;
  }

  public DescribeTopicPartitionsResponse total(Integer total) {
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
    DescribeTopicPartitionsResponse describeTopicPartitionsResponse = (DescribeTopicPartitionsResponse) o;
    return Objects.equals(this.partitionsInfo, describeTopicPartitionsResponse.partitionsInfo) &&
        Objects.equals(this.total, describeTopicPartitionsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partitionsInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTopicPartitionsResponse {\n");
    
    sb.append("    partitionsInfo: ").append(toIndentedString(partitionsInfo)).append("\n");
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
