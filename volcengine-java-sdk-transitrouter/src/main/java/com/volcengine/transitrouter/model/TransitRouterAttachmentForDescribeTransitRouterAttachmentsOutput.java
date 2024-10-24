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
import com.volcengine.transitrouter.model.TagForDescribeTransitRouterAttachmentsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput
 */



public class TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AutoPublishRouteEnabled")
  private Boolean autoPublishRouteEnabled = null;

  @SerializedName("BusinessStatus")
  private String businessStatus = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DeletedTime")
  private String deletedTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Ipv6Enabled")
  private Boolean ipv6Enabled = null;

  @SerializedName("OverdueTime")
  private String overdueTime = null;

  @SerializedName("ResourceId")
  private String resourceId = null;

  @SerializedName("ResourceType")
  private String resourceType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeTransitRouterAttachmentsOutput> tags = null;

  @SerializedName("TransitRouterAttachmentId")
  private String transitRouterAttachmentId = null;

  @SerializedName("TransitRouterAttachmentName")
  private String transitRouterAttachmentName = null;

  @SerializedName("TransitRouterForwardPolicyTableId")
  private String transitRouterForwardPolicyTableId = null;

  @SerializedName("TransitRouterId")
  private String transitRouterId = null;

  @SerializedName("TransitRouterRouteTableId")
  private String transitRouterRouteTableId = null;

  @SerializedName("TransitRouterTrafficQosMarkingPolicyId")
  private String transitRouterTrafficQosMarkingPolicyId = null;

  @SerializedName("TransitRouterTrafficQosQueuePolicyId")
  private String transitRouterTrafficQosQueuePolicyId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput accountId(String accountId) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput businessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
    return this;
  }

   /**
   * Get businessStatus
   * @return businessStatus
  **/
  @Schema(description = "")
  public String getBusinessStatus() {
    return businessStatus;
  }

  public void setBusinessStatus(String businessStatus) {
    this.businessStatus = businessStatus;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput creationTime(String creationTime) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput deletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
    return this;
  }

   /**
   * Get deletedTime
   * @return deletedTime
  **/
  @Schema(description = "")
  public String getDeletedTime() {
    return deletedTime;
  }

  public void setDeletedTime(String deletedTime) {
    this.deletedTime = deletedTime;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput description(String description) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

   /**
   * Get ipv6Enabled
   * @return ipv6Enabled
  **/
  @Schema(description = "")
  public Boolean isIpv6Enabled() {
    return ipv6Enabled;
  }

  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput overdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
    return this;
  }

   /**
   * Get overdueTime
   * @return overdueTime
  **/
  @Schema(description = "")
  public String getOverdueTime() {
    return overdueTime;
  }

  public void setOverdueTime(String overdueTime) {
    this.overdueTime = overdueTime;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @Schema(description = "")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput status(String status) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput tags(List<TagForDescribeTransitRouterAttachmentsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput addTagsItem(TagForDescribeTransitRouterAttachmentsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeTransitRouterAttachmentsOutput>();
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
  public List<TagForDescribeTransitRouterAttachmentsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeTransitRouterAttachmentsOutput> tags) {
    this.tags = tags;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterAttachmentId(String transitRouterAttachmentId) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterAttachmentName(String transitRouterAttachmentName) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterForwardPolicyTableId(String transitRouterForwardPolicyTableId) {
    this.transitRouterForwardPolicyTableId = transitRouterForwardPolicyTableId;
    return this;
  }

   /**
   * Get transitRouterForwardPolicyTableId
   * @return transitRouterForwardPolicyTableId
  **/
  @Schema(description = "")
  public String getTransitRouterForwardPolicyTableId() {
    return transitRouterForwardPolicyTableId;
  }

  public void setTransitRouterForwardPolicyTableId(String transitRouterForwardPolicyTableId) {
    this.transitRouterForwardPolicyTableId = transitRouterForwardPolicyTableId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterId(String transitRouterId) {
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

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
    return this;
  }

   /**
   * Get transitRouterRouteTableId
   * @return transitRouterRouteTableId
  **/
  @Schema(description = "")
  public String getTransitRouterRouteTableId() {
    return transitRouterRouteTableId;
  }

  public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosMarkingPolicyId
   * @return transitRouterTrafficQosMarkingPolicyId
  **/
  @Schema(description = "")
  public String getTransitRouterTrafficQosMarkingPolicyId() {
    return transitRouterTrafficQosMarkingPolicyId;
  }

  public void setTransitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterTrafficQosQueuePolicyId(String transitRouterTrafficQosQueuePolicyId) {
    this.transitRouterTrafficQosQueuePolicyId = transitRouterTrafficQosQueuePolicyId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosQueuePolicyId
   * @return transitRouterTrafficQosQueuePolicyId
  **/
  @Schema(description = "")
  public String getTransitRouterTrafficQosQueuePolicyId() {
    return transitRouterTrafficQosQueuePolicyId;
  }

  public void setTransitRouterTrafficQosQueuePolicyId(String transitRouterTrafficQosQueuePolicyId) {
    this.transitRouterTrafficQosQueuePolicyId = transitRouterTrafficQosQueuePolicyId;
  }

  public TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput updateTime(String updateTime) {
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
    TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput = (TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput) o;
    return Objects.equals(this.accountId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.accountId) &&
        Objects.equals(this.autoPublishRouteEnabled, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.autoPublishRouteEnabled) &&
        Objects.equals(this.businessStatus, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.businessStatus) &&
        Objects.equals(this.creationTime, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.creationTime) &&
        Objects.equals(this.deletedTime, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.deletedTime) &&
        Objects.equals(this.description, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.description) &&
        Objects.equals(this.ipv6Enabled, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.ipv6Enabled) &&
        Objects.equals(this.overdueTime, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.overdueTime) &&
        Objects.equals(this.resourceId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.resourceId) &&
        Objects.equals(this.resourceType, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.resourceType) &&
        Objects.equals(this.status, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.status) &&
        Objects.equals(this.tags, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.tags) &&
        Objects.equals(this.transitRouterAttachmentId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.transitRouterAttachmentId) &&
        Objects.equals(this.transitRouterAttachmentName, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.transitRouterAttachmentName) &&
        Objects.equals(this.transitRouterForwardPolicyTableId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.transitRouterForwardPolicyTableId) &&
        Objects.equals(this.transitRouterId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.transitRouterId) &&
        Objects.equals(this.transitRouterRouteTableId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.transitRouterRouteTableId) &&
        Objects.equals(this.transitRouterTrafficQosMarkingPolicyId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.transitRouterTrafficQosMarkingPolicyId) &&
        Objects.equals(this.transitRouterTrafficQosQueuePolicyId, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.transitRouterTrafficQosQueuePolicyId) &&
        Objects.equals(this.updateTime, transitRouterAttachmentForDescribeTransitRouterAttachmentsOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, autoPublishRouteEnabled, businessStatus, creationTime, deletedTime, description, ipv6Enabled, overdueTime, resourceId, resourceType, status, tags, transitRouterAttachmentId, transitRouterAttachmentName, transitRouterForwardPolicyTableId, transitRouterId, transitRouterRouteTableId, transitRouterTrafficQosMarkingPolicyId, transitRouterTrafficQosQueuePolicyId, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterAttachmentForDescribeTransitRouterAttachmentsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    autoPublishRouteEnabled: ").append(toIndentedString(autoPublishRouteEnabled)).append("\n");
    sb.append("    businessStatus: ").append(toIndentedString(businessStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletedTime: ").append(toIndentedString(deletedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    overdueTime: ").append(toIndentedString(overdueTime)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transitRouterAttachmentId: ").append(toIndentedString(transitRouterAttachmentId)).append("\n");
    sb.append("    transitRouterAttachmentName: ").append(toIndentedString(transitRouterAttachmentName)).append("\n");
    sb.append("    transitRouterForwardPolicyTableId: ").append(toIndentedString(transitRouterForwardPolicyTableId)).append("\n");
    sb.append("    transitRouterId: ").append(toIndentedString(transitRouterId)).append("\n");
    sb.append("    transitRouterRouteTableId: ").append(toIndentedString(transitRouterRouteTableId)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingPolicyId: ").append(toIndentedString(transitRouterTrafficQosMarkingPolicyId)).append("\n");
    sb.append("    transitRouterTrafficQosQueuePolicyId: ").append(toIndentedString(transitRouterTrafficQosQueuePolicyId)).append("\n");
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
