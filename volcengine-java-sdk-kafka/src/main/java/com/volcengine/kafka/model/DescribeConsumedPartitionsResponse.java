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
import com.volcengine.kafka.model.ConsumedPartitionsInfoForDescribeConsumedPartitionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeConsumedPartitionsResponse
 */



public class DescribeConsumedPartitionsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ConsumedPartitionsInfo")
  private List<ConsumedPartitionsInfoForDescribeConsumedPartitionsOutput> consumedPartitionsInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeConsumedPartitionsResponse consumedPartitionsInfo(List<ConsumedPartitionsInfoForDescribeConsumedPartitionsOutput> consumedPartitionsInfo) {
    this.consumedPartitionsInfo = consumedPartitionsInfo;
    return this;
  }

  public DescribeConsumedPartitionsResponse addConsumedPartitionsInfoItem(ConsumedPartitionsInfoForDescribeConsumedPartitionsOutput consumedPartitionsInfoItem) {
    if (this.consumedPartitionsInfo == null) {
      this.consumedPartitionsInfo = new ArrayList<ConsumedPartitionsInfoForDescribeConsumedPartitionsOutput>();
    }
    this.consumedPartitionsInfo.add(consumedPartitionsInfoItem);
    return this;
  }

   /**
   * Get consumedPartitionsInfo
   * @return consumedPartitionsInfo
  **/
  @Valid
  @Schema(description = "")
  public List<ConsumedPartitionsInfoForDescribeConsumedPartitionsOutput> getConsumedPartitionsInfo() {
    return consumedPartitionsInfo;
  }

  public void setConsumedPartitionsInfo(List<ConsumedPartitionsInfoForDescribeConsumedPartitionsOutput> consumedPartitionsInfo) {
    this.consumedPartitionsInfo = consumedPartitionsInfo;
  }

  public DescribeConsumedPartitionsResponse total(Integer total) {
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
    DescribeConsumedPartitionsResponse describeConsumedPartitionsResponse = (DescribeConsumedPartitionsResponse) o;
    return Objects.equals(this.consumedPartitionsInfo, describeConsumedPartitionsResponse.consumedPartitionsInfo) &&
        Objects.equals(this.total, describeConsumedPartitionsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumedPartitionsInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeConsumedPartitionsResponse {\n");
    
    sb.append("    consumedPartitionsInfo: ").append(toIndentedString(consumedPartitionsInfo)).append("\n");
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
