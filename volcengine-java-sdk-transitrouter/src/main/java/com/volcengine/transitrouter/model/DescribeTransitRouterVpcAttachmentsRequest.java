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
import com.volcengine.transitrouter.model.TagFilterForDescribeTransitRouterVpcAttachmentsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTransitRouterVpcAttachmentsRequest
 */



public class DescribeTransitRouterVpcAttachmentsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("TagFilters")
  private List<TagFilterForDescribeTransitRouterVpcAttachmentsInput> tagFilters = null;

  @SerializedName("TransitRouterAttachmentIds")
  private List<String> transitRouterAttachmentIds = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeTransitRouterVpcAttachmentsRequest pageNumber(Integer pageNumber) {
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

  public DescribeTransitRouterVpcAttachmentsRequest pageSize(Integer pageSize) {
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

  public DescribeTransitRouterVpcAttachmentsRequest tagFilters(List<TagFilterForDescribeTransitRouterVpcAttachmentsInput> tagFilters) {
    this.tagFilters = tagFilters;
    return this;
  }

  public DescribeTransitRouterVpcAttachmentsRequest addTagFiltersItem(TagFilterForDescribeTransitRouterVpcAttachmentsInput tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<TagFilterForDescribeTransitRouterVpcAttachmentsInput>();
    }
    this.tagFilters.add(tagFiltersItem);
    return this;
  }

   /**
   * Get tagFilters
   * @return tagFilters
  **/
  @Valid
  @Schema(description = "")
  public List<TagFilterForDescribeTransitRouterVpcAttachmentsInput> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<TagFilterForDescribeTransitRouterVpcAttachmentsInput> tagFilters) {
    this.tagFilters = tagFilters;
  }

  public DescribeTransitRouterVpcAttachmentsRequest transitRouterAttachmentIds(List<String> transitRouterAttachmentIds) {
    this.transitRouterAttachmentIds = transitRouterAttachmentIds;
    return this;
  }

  public DescribeTransitRouterVpcAttachmentsRequest addTransitRouterAttachmentIdsItem(String transitRouterAttachmentIdsItem) {
    if (this.transitRouterAttachmentIds == null) {
      this.transitRouterAttachmentIds = new ArrayList<String>();
    }
    this.transitRouterAttachmentIds.add(transitRouterAttachmentIdsItem);
    return this;
  }

   /**
   * Get transitRouterAttachmentIds
   * @return transitRouterAttachmentIds
  **/
  @Schema(description = "")
  public List<String> getTransitRouterAttachmentIds() {
    return transitRouterAttachmentIds;
  }

  public void setTransitRouterAttachmentIds(List<String> transitRouterAttachmentIds) {
    this.transitRouterAttachmentIds = transitRouterAttachmentIds;
  }

  public DescribeTransitRouterVpcAttachmentsRequest transitRouterId(String transitRouterId) {
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

  public DescribeTransitRouterVpcAttachmentsRequest vpcId(String vpcId) {
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
    DescribeTransitRouterVpcAttachmentsRequest describeTransitRouterVpcAttachmentsRequest = (DescribeTransitRouterVpcAttachmentsRequest) o;
    return Objects.equals(this.pageNumber, describeTransitRouterVpcAttachmentsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeTransitRouterVpcAttachmentsRequest.pageSize) &&
        Objects.equals(this.tagFilters, describeTransitRouterVpcAttachmentsRequest.tagFilters) &&
        Objects.equals(this.transitRouterAttachmentIds, describeTransitRouterVpcAttachmentsRequest.transitRouterAttachmentIds) &&
        Objects.equals(this.transitRouterId, describeTransitRouterVpcAttachmentsRequest.transitRouterId) &&
        Objects.equals(this.vpcId, describeTransitRouterVpcAttachmentsRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, tagFilters, transitRouterAttachmentIds, transitRouterId, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTransitRouterVpcAttachmentsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
    sb.append("    transitRouterAttachmentIds: ").append(toIndentedString(transitRouterAttachmentIds)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
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
