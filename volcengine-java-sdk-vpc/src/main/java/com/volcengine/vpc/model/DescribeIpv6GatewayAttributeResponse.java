/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeIpv6GatewayAttributeResponse
 */



public class DescribeIpv6GatewayAttributeResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Ipv6GatewayId")
  private String ipv6GatewayId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("RouteTableId")
  private String routeTableId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeIpv6GatewayAttributeResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public DescribeIpv6GatewayAttributeResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DescribeIpv6GatewayAttributeResponse ipv6GatewayId(String ipv6GatewayId) {
    this.ipv6GatewayId = ipv6GatewayId;
    return this;
  }

   /**
   * Get ipv6GatewayId
   * @return ipv6GatewayId
  **/
  @Schema(description = "")
  public String getIpv6GatewayId() {
    return ipv6GatewayId;
  }

  public void setIpv6GatewayId(String ipv6GatewayId) {
    this.ipv6GatewayId = ipv6GatewayId;
  }

  public DescribeIpv6GatewayAttributeResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DescribeIpv6GatewayAttributeResponse projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public DescribeIpv6GatewayAttributeResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeIpv6GatewayAttributeResponse routeTableId(String routeTableId) {
    this.routeTableId = routeTableId;
    return this;
  }

   /**
   * Get routeTableId
   * @return routeTableId
  **/
  @Schema(description = "")
  public String getRouteTableId() {
    return routeTableId;
  }

  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }

  public DescribeIpv6GatewayAttributeResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DescribeIpv6GatewayAttributeResponse updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public DescribeIpv6GatewayAttributeResponse vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeIpv6GatewayAttributeResponse describeIpv6GatewayAttributeResponse = (DescribeIpv6GatewayAttributeResponse) o;
    return Objects.equals(this.creationTime, describeIpv6GatewayAttributeResponse.creationTime) &&
        Objects.equals(this.description, describeIpv6GatewayAttributeResponse.description) &&
        Objects.equals(this.ipv6GatewayId, describeIpv6GatewayAttributeResponse.ipv6GatewayId) &&
        Objects.equals(this.name, describeIpv6GatewayAttributeResponse.name) &&
        Objects.equals(this.projectName, describeIpv6GatewayAttributeResponse.projectName) &&
        Objects.equals(this.requestId, describeIpv6GatewayAttributeResponse.requestId) &&
        Objects.equals(this.routeTableId, describeIpv6GatewayAttributeResponse.routeTableId) &&
        Objects.equals(this.status, describeIpv6GatewayAttributeResponse.status) &&
        Objects.equals(this.updateTime, describeIpv6GatewayAttributeResponse.updateTime) &&
        Objects.equals(this.vpcId, describeIpv6GatewayAttributeResponse.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, ipv6GatewayId, name, projectName, requestId, routeTableId, status, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeIpv6GatewayAttributeResponse {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipv6GatewayId: ").append(toIndentedString(ipv6GatewayId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
