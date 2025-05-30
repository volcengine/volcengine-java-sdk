/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdspostgresql.model.ChargeInfoForDescribeDBInstancePriceDetailInput;
import com.volcengine.rdspostgresql.model.NodeInfoForDescribeDBInstancePriceDetailInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstancePriceDetailRequest
 */



public class DescribeDBInstancePriceDetailRequest {
  @SerializedName("ChargeInfo")
  private ChargeInfoForDescribeDBInstancePriceDetailInput chargeInfo = null;

  @SerializedName("NodeInfo")
  private List<NodeInfoForDescribeDBInstancePriceDetailInput> nodeInfo = null;

  @SerializedName("StorageSpace")
  private Integer storageSpace = null;

  @SerializedName("StorageType")
  private String storageType = null;

  public DescribeDBInstancePriceDetailRequest chargeInfo(ChargeInfoForDescribeDBInstancePriceDetailInput chargeInfo) {
    this.chargeInfo = chargeInfo;
    return this;
  }

   /**
   * Get chargeInfo
   * @return chargeInfo
  **/
  @Valid
  @Schema(description = "")
  public ChargeInfoForDescribeDBInstancePriceDetailInput getChargeInfo() {
    return chargeInfo;
  }

  public void setChargeInfo(ChargeInfoForDescribeDBInstancePriceDetailInput chargeInfo) {
    this.chargeInfo = chargeInfo;
  }

  public DescribeDBInstancePriceDetailRequest nodeInfo(List<NodeInfoForDescribeDBInstancePriceDetailInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public DescribeDBInstancePriceDetailRequest addNodeInfoItem(NodeInfoForDescribeDBInstancePriceDetailInput nodeInfoItem) {
    if (this.nodeInfo == null) {
      this.nodeInfo = new ArrayList<NodeInfoForDescribeDBInstancePriceDetailInput>();
    }
    this.nodeInfo.add(nodeInfoItem);
    return this;
  }

   /**
   * Get nodeInfo
   * @return nodeInfo
  **/
  @Valid
  @Schema(description = "")
  public List<NodeInfoForDescribeDBInstancePriceDetailInput> getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(List<NodeInfoForDescribeDBInstancePriceDetailInput> nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public DescribeDBInstancePriceDetailRequest storageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
    return this;
  }

   /**
   * Get storageSpace
   * @return storageSpace
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getStorageSpace() {
    return storageSpace;
  }

  public void setStorageSpace(Integer storageSpace) {
    this.storageSpace = storageSpace;
  }

  public DescribeDBInstancePriceDetailRequest storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstancePriceDetailRequest describeDBInstancePriceDetailRequest = (DescribeDBInstancePriceDetailRequest) o;
    return Objects.equals(this.chargeInfo, describeDBInstancePriceDetailRequest.chargeInfo) &&
        Objects.equals(this.nodeInfo, describeDBInstancePriceDetailRequest.nodeInfo) &&
        Objects.equals(this.storageSpace, describeDBInstancePriceDetailRequest.storageSpace) &&
        Objects.equals(this.storageType, describeDBInstancePriceDetailRequest.storageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeInfo, nodeInfo, storageSpace, storageType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstancePriceDetailRequest {\n");
    
    sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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
