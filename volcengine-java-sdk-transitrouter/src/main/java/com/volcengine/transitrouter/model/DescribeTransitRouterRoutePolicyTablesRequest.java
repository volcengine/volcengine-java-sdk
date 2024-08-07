/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRouterRoutePolicyTablesRequest
 */



public class DescribeTransitRouterRoutePolicyTablesRequest {
  @SerializedName("Direction")
  private String direction = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("TransitRouterRoutePolicyTableIds")
  private List<String> transitRouterRoutePolicyTableIds = null;

  @SerializedName("TransitRouterRoutePolicyTableName")
  private String transitRouterRoutePolicyTableName = null;

  public DescribeTransitRouterRoutePolicyTablesRequest direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(description = "")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public DescribeTransitRouterRoutePolicyTablesRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeTransitRouterRoutePolicyTablesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeTransitRouterRoutePolicyTablesRequest transitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
    return this;
  }

   /**
   * Get transitRouterId
   * @return transitRouterId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterId() {
    return transitRouterId;
  }

  public void setTransitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
  }

  public DescribeTransitRouterRoutePolicyTablesRequest transitRouterRoutePolicyTableIds(List<String> transitRouterRoutePolicyTableIds) {
    this.transitRouterRoutePolicyTableIds = transitRouterRoutePolicyTableIds;
    return this;
  }

  public DescribeTransitRouterRoutePolicyTablesRequest addTransitRouterRoutePolicyTableIdsItem(String transitRouterRoutePolicyTableIdsItem) {
    if (this.transitRouterRoutePolicyTableIds == null) {
      this.transitRouterRoutePolicyTableIds = new ArrayList<String>();
    }
    this.transitRouterRoutePolicyTableIds.add(transitRouterRoutePolicyTableIdsItem);
    return this;
  }

   /**
   * Get transitRouterRoutePolicyTableIds
   * @return transitRouterRoutePolicyTableIds
  **/
  @Schema(description = "")
  public List<String> getTransitRouterRoutePolicyTableIds() {
    return transitRouterRoutePolicyTableIds;
  }

  public void setTransitRouterRoutePolicyTableIds(List<String> transitRouterRoutePolicyTableIds) {
    this.transitRouterRoutePolicyTableIds = transitRouterRoutePolicyTableIds;
  }

  public DescribeTransitRouterRoutePolicyTablesRequest transitRouterRoutePolicyTableName(String transitRouterRoutePolicyTableName) {
    this.transitRouterRoutePolicyTableName = transitRouterRoutePolicyTableName;
    return this;
  }

   /**
   * Get transitRouterRoutePolicyTableName
   * @return transitRouterRoutePolicyTableName
  **/
  @Schema(description = "")
  public String getTransitRouterRoutePolicyTableName() {
    return transitRouterRoutePolicyTableName;
  }

  public void setTransitRouterRoutePolicyTableName(String transitRouterRoutePolicyTableName) {
    this.transitRouterRoutePolicyTableName = transitRouterRoutePolicyTableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRouterRoutePolicyTablesRequest describeTransitRouterRoutePolicyTablesRequest = (DescribeTransitRouterRoutePolicyTablesRequest) o;
    return Objects.equals(this.direction, describeTransitRouterRoutePolicyTablesRequest.direction) &&
        Objects.equals(this.pageNumber, describeTransitRouterRoutePolicyTablesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterRoutePolicyTablesRequest.pageSize) &&
        Objects.equals(this.transitRouterId, describeTransitRouterRoutePolicyTablesRequest.transitRouterId) &&
        Objects.equals(this.transitRouterRoutePolicyTableIds, describeTransitRouterRoutePolicyTablesRequest.transitRouterRoutePolicyTableIds) &&
        Objects.equals(this.transitRouterRoutePolicyTableName, describeTransitRouterRoutePolicyTablesRequest.transitRouterRoutePolicyTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, pageNumber, pageSize, transitRouterId, transitRouterRoutePolicyTableIds, transitRouterRoutePolicyTableName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterRoutePolicyTablesRequest {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
    sb.append("    transitRouterRoutePolicyTableIds: ").append(toIndentedString(transitRouterRoutePolicyTableIds)).append("\n");
    sb.append("    transitRouterRoutePolicyTableName: ").append(toIndentedString(transitRouterRoutePolicyTableName)).append("\n");
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
