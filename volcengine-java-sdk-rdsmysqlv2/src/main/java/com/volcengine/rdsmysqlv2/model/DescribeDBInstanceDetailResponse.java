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
import com.volcengine.rdsmysqlv2.model.BasicInfoForDescribeDBInstanceDetailOutput;
import com.volcengine.rdsmysqlv2.model.ChargeDetailForDescribeDBInstanceDetailOutput;
import com.volcengine.rdsmysqlv2.model.EndpointForDescribeDBInstanceDetailOutput;
import com.volcengine.rdsmysqlv2.model.NodeForDescribeDBInstanceDetailOutput;
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

  @SerializedName("Endpoints")
  private List<EndpointForDescribeDBInstanceDetailOutput> endpoints = null;

  @SerializedName("Nodes")
  private List<NodeForDescribeDBInstanceDetailOutput> nodes = null;

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

  public DescribeDBInstanceDetailResponse endpoints(List<EndpointForDescribeDBInstanceDetailOutput> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public DescribeDBInstanceDetailResponse addEndpointsItem(EndpointForDescribeDBInstanceDetailOutput endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<EndpointForDescribeDBInstanceDetailOutput>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @Valid
  @Schema(description = "")
  public List<EndpointForDescribeDBInstanceDetailOutput> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<EndpointForDescribeDBInstanceDetailOutput> endpoints) {
    this.endpoints = endpoints;
  }

  public DescribeDBInstanceDetailResponse nodes(List<NodeForDescribeDBInstanceDetailOutput> nodes) {
    this.nodes = nodes;
    return this;
  }

  public DescribeDBInstanceDetailResponse addNodesItem(NodeForDescribeDBInstanceDetailOutput nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeForDescribeDBInstanceDetailOutput>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @Valid
  @Schema(description = "")
  public List<NodeForDescribeDBInstanceDetailOutput> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeForDescribeDBInstanceDetailOutput> nodes) {
    this.nodes = nodes;
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
        Objects.equals(this.endpoints, describeDBInstanceDetailResponse.endpoints) &&
        Objects.equals(this.nodes, describeDBInstanceDetailResponse.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicInfo, chargeDetail, endpoints, nodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstanceDetailResponse {\n");
    
    sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
    sb.append("    chargeDetail: ").append(toIndentedString(chargeDetail)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
