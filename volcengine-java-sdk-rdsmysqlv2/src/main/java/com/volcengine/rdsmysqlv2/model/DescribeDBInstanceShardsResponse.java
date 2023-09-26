/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.ShardDetailInfoForDescribeDBInstanceShardsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstanceShardsResponse
 */


public class DescribeDBInstanceShardsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ShardDetailInfo")
  private List<ShardDetailInfoForDescribeDBInstanceShardsOutput> shardDetailInfo = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeDBInstanceShardsResponse shardDetailInfo(List<ShardDetailInfoForDescribeDBInstanceShardsOutput> shardDetailInfo) {
    this.shardDetailInfo = shardDetailInfo;
    return this;
  }

  public DescribeDBInstanceShardsResponse addShardDetailInfoItem(ShardDetailInfoForDescribeDBInstanceShardsOutput shardDetailInfoItem) {
    if (this.shardDetailInfo == null) {
      this.shardDetailInfo = new ArrayList<ShardDetailInfoForDescribeDBInstanceShardsOutput>();
    }
    this.shardDetailInfo.add(shardDetailInfoItem);
    return this;
  }

   /**
   * Get shardDetailInfo
   * @return shardDetailInfo
  **/
  @Valid
  @Schema(description = "")
  public List<ShardDetailInfoForDescribeDBInstanceShardsOutput> getShardDetailInfo() {
    return shardDetailInfo;
  }

  public void setShardDetailInfo(List<ShardDetailInfoForDescribeDBInstanceShardsOutput> shardDetailInfo) {
    this.shardDetailInfo = shardDetailInfo;
  }

  public DescribeDBInstanceShardsResponse total(Integer total) {
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
    DescribeDBInstanceShardsResponse describeDBInstanceShardsResponse = (DescribeDBInstanceShardsResponse) o;
    return Objects.equals(this.shardDetailInfo, describeDBInstanceShardsResponse.shardDetailInfo) &&
        Objects.equals(this.total, describeDBInstanceShardsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shardDetailInfo, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstanceShardsResponse {\n");
    
    sb.append("    shardDetailInfo: ").append(toIndentedString(shardDetailInfo)).append("\n");
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