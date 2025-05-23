/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rocketmq.model.BasicInfoForDescribeInstanceDetailOutput;
import com.volcengine.rocketmq.model.ChargeDetailForDescribeInstanceDetailOutput;
import com.volcengine.rocketmq.model.ConnectionInfoForDescribeInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeInstanceDetailResponse
 */



public class DescribeInstanceDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BasicInfo")
  private BasicInfoForDescribeInstanceDetailOutput basicInfo = null;

  @SerializedName("ChargeDetail")
  private ChargeDetailForDescribeInstanceDetailOutput chargeDetail = null;

  @SerializedName("ConnectionInfo")
  private List<ConnectionInfoForDescribeInstanceDetailOutput> connectionInfo = null;

  @SerializedName("FileReservedTime")
  private Integer fileReservedTime = null;

  public DescribeInstanceDetailResponse basicInfo(BasicInfoForDescribeInstanceDetailOutput basicInfo) {
    this.basicInfo = basicInfo;
    return this;
  }

   /**
   * Get basicInfo
   * @return basicInfo
  **/
  @Valid
  @Schema(description = "")
  public BasicInfoForDescribeInstanceDetailOutput getBasicInfo() {
    return basicInfo;
  }

  public void setBasicInfo(BasicInfoForDescribeInstanceDetailOutput basicInfo) {
    this.basicInfo = basicInfo;
  }

  public DescribeInstanceDetailResponse chargeDetail(ChargeDetailForDescribeInstanceDetailOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
    return this;
  }

   /**
   * Get chargeDetail
   * @return chargeDetail
  **/
  @Valid
  @Schema(description = "")
  public ChargeDetailForDescribeInstanceDetailOutput getChargeDetail() {
    return chargeDetail;
  }

  public void setChargeDetail(ChargeDetailForDescribeInstanceDetailOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
  }

  public DescribeInstanceDetailResponse connectionInfo(List<ConnectionInfoForDescribeInstanceDetailOutput> connectionInfo) {
    this.connectionInfo = connectionInfo;
    return this;
  }

  public DescribeInstanceDetailResponse addConnectionInfoItem(ConnectionInfoForDescribeInstanceDetailOutput connectionInfoItem) {
    if (this.connectionInfo == null) {
      this.connectionInfo = new ArrayList<ConnectionInfoForDescribeInstanceDetailOutput>();
    }
    this.connectionInfo.add(connectionInfoItem);
    return this;
  }

   /**
   * Get connectionInfo
   * @return connectionInfo
  **/
  @Valid
  @Schema(description = "")
  public List<ConnectionInfoForDescribeInstanceDetailOutput> getConnectionInfo() {
    return connectionInfo;
  }

  public void setConnectionInfo(List<ConnectionInfoForDescribeInstanceDetailOutput> connectionInfo) {
    this.connectionInfo = connectionInfo;
  }

  public DescribeInstanceDetailResponse fileReservedTime(Integer fileReservedTime) {
    this.fileReservedTime = fileReservedTime;
    return this;
  }

   /**
   * Get fileReservedTime
   * @return fileReservedTime
  **/
  @Schema(description = "")
  public Integer getFileReservedTime() {
    return fileReservedTime;
  }

  public void setFileReservedTime(Integer fileReservedTime) {
    this.fileReservedTime = fileReservedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeInstanceDetailResponse describeInstanceDetailResponse = (DescribeInstanceDetailResponse) o;
    return Objects.equals(this.basicInfo, describeInstanceDetailResponse.basicInfo) &&
        Objects.equals(this.chargeDetail, describeInstanceDetailResponse.chargeDetail) &&
        Objects.equals(this.connectionInfo, describeInstanceDetailResponse.connectionInfo) &&
        Objects.equals(this.fileReservedTime, describeInstanceDetailResponse.fileReservedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicInfo, chargeDetail, connectionInfo, fileReservedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInstanceDetailResponse {\n");
    
    sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
    sb.append("    chargeDetail: ").append(toIndentedString(chargeDetail)).append("\n");
    sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
    sb.append("    fileReservedTime: ").append(toIndentedString(fileReservedTime)).append("\n");
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
