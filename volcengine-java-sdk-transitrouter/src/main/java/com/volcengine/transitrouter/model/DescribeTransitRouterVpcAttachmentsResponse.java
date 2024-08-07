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
import com.volcengine.transitrouter.model.TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRouterVpcAttachmentsResponse
 */



public class DescribeTransitRouterVpcAttachmentsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("TransitRouterAttachments")
  private List<TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput> transitRouterAttachments = null;

  public DescribeTransitRouterVpcAttachmentsResponse pageNumber(Integer pageNumber) {
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

  public DescribeTransitRouterVpcAttachmentsResponse pageSize(Integer pageSize) {
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

  public DescribeTransitRouterVpcAttachmentsResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public DescribeTransitRouterVpcAttachmentsResponse transitRouterAttachments(List<TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput> transitRouterAttachments) {
    this.transitRouterAttachments = transitRouterAttachments;
    return this;
  }

  public DescribeTransitRouterVpcAttachmentsResponse addTransitRouterAttachmentsItem(TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput transitRouterAttachmentsItem) {
    if (this.transitRouterAttachments == null) {
      this.transitRouterAttachments = new ArrayList<TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput>();
    }
    this.transitRouterAttachments.add(transitRouterAttachmentsItem);
    return this;
  }

   /**
   * Get transitRouterAttachments
   * @return transitRouterAttachments
  **/
  @Valid
  @Schema(description = "")
  public List<TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput> getTransitRouterAttachments() {
    return transitRouterAttachments;
  }

  public void setTransitRouterAttachments(List<TransitRouterAttachmentForDescribeTransitRouterVpcAttachmentsOutput> transitRouterAttachments) {
    this.transitRouterAttachments = transitRouterAttachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTransitRouterVpcAttachmentsResponse describeTransitRouterVpcAttachmentsResponse = (DescribeTransitRouterVpcAttachmentsResponse) o;
    return Objects.equals(this.pageNumber, describeTransitRouterVpcAttachmentsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterVpcAttachmentsResponse.pageSize) &&
        Objects.equals(this.totalCount, describeTransitRouterVpcAttachmentsResponse.totalCount) &&
        Objects.equals(this.transitRouterAttachments, describeTransitRouterVpcAttachmentsResponse.transitRouterAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, transitRouterAttachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterVpcAttachmentsResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    transitRouterAttachments: ").append(toIndentedString(transitRouterAttachments)).append("\n");
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
