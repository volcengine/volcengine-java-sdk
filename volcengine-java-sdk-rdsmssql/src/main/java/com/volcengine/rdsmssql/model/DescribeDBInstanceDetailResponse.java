/*
 * rds_mssql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmssql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmssql.model.BasicInfoForDescribeDBInstanceDetailOutput;
import com.volcengine.rdsmssql.model.ChargeDetailForDescribeDBInstanceDetailOutput;
import com.volcengine.rdsmssql.model.ConnectionInfoForDescribeDBInstanceDetailOutput;
import com.volcengine.rdsmssql.model.NodeDetailInfoForDescribeDBInstanceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstanceDetailResponse
 */



public class DescribeDBInstanceDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BasicInfo")
  private BasicInfoForDescribeDBInstanceDetailOutput basicInfo = null;

  @SerializedName("ChargeDetail")
  private ChargeDetailForDescribeDBInstanceDetailOutput chargeDetail = null;

  @SerializedName("ConnectionInfo")
  private List<ConnectionInfoForDescribeDBInstanceDetailOutput> connectionInfo = null;

  @SerializedName("NodeDetailInfo")
  private List<NodeDetailInfoForDescribeDBInstanceDetailOutput> nodeDetailInfo = null;

  public DescribeDBInstanceDetailResponse basicInfo(BasicInfoForDescribeDBInstanceDetailOutput basicInfo) {
    this.basicInfo = basicInfo;
    return this;
  }

   /**
   * Get basicInfo
   * @return basicInfo
  **/
  @Valid
  @Schema(description = "")
  public BasicInfoForDescribeDBInstanceDetailOutput getBasicInfo() {
    return basicInfo;
  }

  public void setBasicInfo(BasicInfoForDescribeDBInstanceDetailOutput basicInfo) {
    this.basicInfo = basicInfo;
  }

  public DescribeDBInstanceDetailResponse chargeDetail(ChargeDetailForDescribeDBInstanceDetailOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
    return this;
  }

   /**
   * Get chargeDetail
   * @return chargeDetail
  **/
  @Valid
  @Schema(description = "")
  public ChargeDetailForDescribeDBInstanceDetailOutput getChargeDetail() {
    return chargeDetail;
  }

  public void setChargeDetail(ChargeDetailForDescribeDBInstanceDetailOutput chargeDetail) {
    this.chargeDetail = chargeDetail;
  }

  public DescribeDBInstanceDetailResponse connectionInfo(List<ConnectionInfoForDescribeDBInstanceDetailOutput> connectionInfo) {
    this.connectionInfo = connectionInfo;
    return this;
  }

  public DescribeDBInstanceDetailResponse addConnectionInfoItem(ConnectionInfoForDescribeDBInstanceDetailOutput connectionInfoItem) {
    if (this.connectionInfo == null) {
      this.connectionInfo = new ArrayList<ConnectionInfoForDescribeDBInstanceDetailOutput>();
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
  public List<ConnectionInfoForDescribeDBInstanceDetailOutput> getConnectionInfo() {
    return connectionInfo;
  }

  public void setConnectionInfo(List<ConnectionInfoForDescribeDBInstanceDetailOutput> connectionInfo) {
    this.connectionInfo = connectionInfo;
  }

  public DescribeDBInstanceDetailResponse nodeDetailInfo(List<NodeDetailInfoForDescribeDBInstanceDetailOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
    return this;
  }

  public DescribeDBInstanceDetailResponse addNodeDetailInfoItem(NodeDetailInfoForDescribeDBInstanceDetailOutput nodeDetailInfoItem) {
    if (this.nodeDetailInfo == null) {
      this.nodeDetailInfo = new ArrayList<NodeDetailInfoForDescribeDBInstanceDetailOutput>();
    }
    this.nodeDetailInfo.add(nodeDetailInfoItem);
    return this;
  }

   /**
   * Get nodeDetailInfo
   * @return nodeDetailInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeDetailInfoForDescribeDBInstanceDetailOutput> getNodeDetailInfo() {
    return nodeDetailInfo;
  }

  public void setNodeDetailInfo(List<NodeDetailInfoForDescribeDBInstanceDetailOutput> nodeDetailInfo) {
    this.nodeDetailInfo = nodeDetailInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstanceDetailResponse describeDBInstanceDetailResponse = (DescribeDBInstanceDetailResponse) o;
    return Objects.equals(this.basicInfo, describeDBInstanceDetailResponse.basicInfo) &&
        Objects.equals(this.chargeDetail, describeDBInstanceDetailResponse.chargeDetail) &&
        Objects.equals(this.connectionInfo, describeDBInstanceDetailResponse.connectionInfo) &&
        Objects.equals(this.nodeDetailInfo, describeDBInstanceDetailResponse.nodeDetailInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicInfo, chargeDetail, connectionInfo, nodeDetailInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstanceDetailResponse {\n");
    
    sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
    sb.append("    chargeDetail: ").append(toIndentedString(chargeDetail)).append("\n");
    sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
    sb.append("    nodeDetailInfo: ").append(toIndentedString(nodeDetailInfo)).append("\n");
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
