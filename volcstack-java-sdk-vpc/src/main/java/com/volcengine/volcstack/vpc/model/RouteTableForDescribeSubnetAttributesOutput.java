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

package com.volcengine.volcstack.vpc.model;

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
 * RouteTableForDescribeSubnetAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:40.504123+08:00[Asia/Shanghai]")
public class RouteTableForDescribeSubnetAttributesOutput {
  @SerializedName("RouteTableId")
  private String routeTableId = null;

  @SerializedName("RouteTableType")
  private String routeTableType = null;

  public RouteTableForDescribeSubnetAttributesOutput routeTableId(String routeTableId) {
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

  public RouteTableForDescribeSubnetAttributesOutput routeTableType(String routeTableType) {
    this.routeTableType = routeTableType;
    return this;
  }

   /**
   * Get routeTableType
   * @return routeTableType
  **/
  @Schema(description = "")
  public String getRouteTableType() {
    return routeTableType;
  }

  public void setRouteTableType(String routeTableType) {
    this.routeTableType = routeTableType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteTableForDescribeSubnetAttributesOutput routeTableForDescribeSubnetAttributesOutput = (RouteTableForDescribeSubnetAttributesOutput) o;
    return Objects.equals(this.routeTableId, routeTableForDescribeSubnetAttributesOutput.routeTableId) &&
        Objects.equals(this.routeTableType, routeTableForDescribeSubnetAttributesOutput.routeTableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTableId, routeTableType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteTableForDescribeSubnetAttributesOutput {\n");
    
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    routeTableType: ").append(toIndentedString(routeTableType)).append("\n");
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
