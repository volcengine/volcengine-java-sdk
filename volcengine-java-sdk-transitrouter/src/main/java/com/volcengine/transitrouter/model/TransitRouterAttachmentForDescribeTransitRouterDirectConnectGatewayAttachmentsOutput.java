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
import com.volcengine.transitrouter.model.TagForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput
 */



public class TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AutoPublishRouteEnabled")
  private Boolean autoPublishRouteEnabled = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput> tags = null;

  @SerializedName("TransitRouterAttachmentId")
  private String transitRouterAttachmentId = null;

  @SerializedName("TransitRouterAttachmentName")
  private String transitRouterAttachmentName = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
    this.autoPublishRouteEnabled = autoPublishRouteEnabled;
    return this;
  }

   /**
   * Get autoPublishRouteEnabled
   * @return autoPublishRouteEnabled
  **/
  @Schema(description = "")
  public Boolean isAutoPublishRouteEnabled() {
    return autoPublishRouteEnabled;
  }

  public void setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
    this.autoPublishRouteEnabled = autoPublishRouteEnabled;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput creationTime(String creationTime) {
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

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput description(String description) {
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

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput status(String status) {
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

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput tags(List<TagForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput addTagsItem(TagForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput> tags) {
    this.tags = tags;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput transitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
    return this;
  }

   /**
   * Get transitRouterAttachmentId
   * @return transitRouterAttachmentId
  **/
  @Schema(description = "")
  public String getTransitRouterAttachmentId() {
    return transitRouterAttachmentId;
  }

  public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput transitRouterAttachmentName(String transitRouterAttachmentName) {
    this.transitRouterAttachmentName = transitRouterAttachmentName;
    return this;
  }

   /**
   * Get transitRouterAttachmentName
   * @return transitRouterAttachmentName
  **/
  @Schema(description = "")
  public String getTransitRouterAttachmentName() {
    return transitRouterAttachmentName;
  }

  public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
    this.transitRouterAttachmentName = transitRouterAttachmentName;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput transitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
    return this;
  }

   /**
   * Get transitRouterId
   * @return transitRouterId
  **/
  @Schema(description = "")
  public String getTransitRouterId() {
    return transitRouterId;
  }

  public void setTransitRouterId(String transitRouterId) {
    this.transitRouterId = transitRouterId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput updateTime(String updateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput = (TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput) o;
    return Objects.equals(this.accountId, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.accountId) &&
        Objects.equals(this.autoPublishRouteEnabled, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.autoPublishRouteEnabled) &&
        Objects.equals(this.creationTime, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.creationTime) &&
        Objects.equals(this.description, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.description) &&
        Objects.equals(this.directConnectGatewayId, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.directConnectGatewayId) &&
        Objects.equals(this.status, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.status) &&
        Objects.equals(this.tags, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.tags) &&
        Objects.equals(this.transitRouterAttachmentId, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.transitRouterAttachmentId) &&
        Objects.equals(this.transitRouterAttachmentName, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.transitRouterAttachmentName) &&
        Objects.equals(this.transitRouterId, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.transitRouterId) &&
        Objects.equals(this.updateTime, transitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, autoPublishRouteEnabled, creationTime, description, directConnectGatewayId, status, tags, transitRouterAttachmentId, transitRouterAttachmentName, transitRouterId, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterAttachmentForDescribeTransitRouterDirectConnectGatewayAttachmentsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    autoPublishRouteEnabled: ").append(toIndentedString(autoPublishRouteEnabled)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transitRouterAttachmentId: ").append(toIndentedString(transitRouterAttachmentId)).append("\n");
    sb.append("    transitRouterAttachmentName: ").append(toIndentedString(transitRouterAttachmentName)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
