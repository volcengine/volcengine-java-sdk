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
import com.volcengine.dcdn.model.DetailInfoForDescribeStatisticsDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RealTimeResultForDescribeStatisticsDetailOutput
 */



public class RealTimeResultForDescribeStatisticsDetailOutput {
  @SerializedName("DetailInfo")
  private List<DetailInfoForDescribeStatisticsDetailOutput> detailInfo = null;

  @SerializedName("DomainName")
  private String domainName = null;

  public RealTimeResultForDescribeStatisticsDetailOutput detailInfo(List<DetailInfoForDescribeStatisticsDetailOutput> detailInfo) {
    this.detailInfo = detailInfo;
    return this;
  }

  public RealTimeResultForDescribeStatisticsDetailOutput addDetailInfoItem(DetailInfoForDescribeStatisticsDetailOutput detailInfoItem) {
    if (this.detailInfo == null) {
      this.detailInfo = new ArrayList<DetailInfoForDescribeStatisticsDetailOutput>();
    }
    this.detailInfo.add(detailInfoItem);
    return this;
  }

   /**
   * Get detailInfo
   * @return detailInfo
  **/
  @Valid
  @Schema(description = "")
  public List<DetailInfoForDescribeStatisticsDetailOutput> getDetailInfo() {
    return detailInfo;
  }

  public void setDetailInfo(List<DetailInfoForDescribeStatisticsDetailOutput> detailInfo) {
    this.detailInfo = detailInfo;
  }

  public RealTimeResultForDescribeStatisticsDetailOutput domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeResultForDescribeStatisticsDetailOutput realTimeResultForDescribeStatisticsDetailOutput = (RealTimeResultForDescribeStatisticsDetailOutput) o;
    return Objects.equals(this.detailInfo, realTimeResultForDescribeStatisticsDetailOutput.detailInfo) &&
        Objects.equals(this.domainName, realTimeResultForDescribeStatisticsDetailOutput.domainName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailInfo, domainName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeResultForDescribeStatisticsDetailOutput {\n");
    
    sb.append("    detailInfo: ").append(toIndentedString(detailInfo)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
