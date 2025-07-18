/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mlplatform20240701.model.AllocatedComputeResourceForListResourceReservationRecordsOutput;
import com.volcengine.mlplatform20240701.model.DeliveredComputeResourceForListResourceReservationRecordsOutput;
import com.volcengine.mlplatform20240701.model.DesiredComputeResourceForListResourceReservationRecordsOutput;
import com.volcengine.mlplatform20240701.model.StatusForListResourceReservationRecordsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListResourceReservationRecordsOutput
 */



public class ItemForListResourceReservationRecordsOutput {
  @SerializedName("ActivationTime")
  private String activationTime = null;

  @SerializedName("AllocatedComputeResource")
  private AllocatedComputeResourceForListResourceReservationRecordsOutput allocatedComputeResource = null;

  @SerializedName("DeliveredComputeResource")
  private DeliveredComputeResourceForListResourceReservationRecordsOutput deliveredComputeResource = null;

  @SerializedName("DesiredComputeResource")
  private DesiredComputeResourceForListResourceReservationRecordsOutput desiredComputeResource = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("ResourceEndTime")
  private String resourceEndTime = null;

  @SerializedName("ResourceStartTime")
  private String resourceStartTime = null;

  @SerializedName("ResourceZoneId")
  private String resourceZoneId = null;

  @SerializedName("Status")
  private StatusForListResourceReservationRecordsOutput status = null;

  public ItemForListResourceReservationRecordsOutput activationTime(String activationTime) {
    this.activationTime = activationTime;
    return this;
  }

   /**
   * Get activationTime
   * @return activationTime
  **/
  @Schema(description = "")
  public String getActivationTime() {
    return activationTime;
  }

  public void setActivationTime(String activationTime) {
    this.activationTime = activationTime;
  }

  public ItemForListResourceReservationRecordsOutput allocatedComputeResource(AllocatedComputeResourceForListResourceReservationRecordsOutput allocatedComputeResource) {
    this.allocatedComputeResource = allocatedComputeResource;
    return this;
  }

   /**
   * Get allocatedComputeResource
   * @return allocatedComputeResource
  **/
  @Valid
  @Schema(description = "")
  public AllocatedComputeResourceForListResourceReservationRecordsOutput getAllocatedComputeResource() {
    return allocatedComputeResource;
  }

  public void setAllocatedComputeResource(AllocatedComputeResourceForListResourceReservationRecordsOutput allocatedComputeResource) {
    this.allocatedComputeResource = allocatedComputeResource;
  }

  public ItemForListResourceReservationRecordsOutput deliveredComputeResource(DeliveredComputeResourceForListResourceReservationRecordsOutput deliveredComputeResource) {
    this.deliveredComputeResource = deliveredComputeResource;
    return this;
  }

   /**
   * Get deliveredComputeResource
   * @return deliveredComputeResource
  **/
  @Valid
  @Schema(description = "")
  public DeliveredComputeResourceForListResourceReservationRecordsOutput getDeliveredComputeResource() {
    return deliveredComputeResource;
  }

  public void setDeliveredComputeResource(DeliveredComputeResourceForListResourceReservationRecordsOutput deliveredComputeResource) {
    this.deliveredComputeResource = deliveredComputeResource;
  }

  public ItemForListResourceReservationRecordsOutput desiredComputeResource(DesiredComputeResourceForListResourceReservationRecordsOutput desiredComputeResource) {
    this.desiredComputeResource = desiredComputeResource;
    return this;
  }

   /**
   * Get desiredComputeResource
   * @return desiredComputeResource
  **/
  @Valid
  @Schema(description = "")
  public DesiredComputeResourceForListResourceReservationRecordsOutput getDesiredComputeResource() {
    return desiredComputeResource;
  }

  public void setDesiredComputeResource(DesiredComputeResourceForListResourceReservationRecordsOutput desiredComputeResource) {
    this.desiredComputeResource = desiredComputeResource;
  }

  public ItemForListResourceReservationRecordsOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemForListResourceReservationRecordsOutput resourceEndTime(String resourceEndTime) {
    this.resourceEndTime = resourceEndTime;
    return this;
  }

   /**
   * Get resourceEndTime
   * @return resourceEndTime
  **/
  @Schema(description = "")
  public String getResourceEndTime() {
    return resourceEndTime;
  }

  public void setResourceEndTime(String resourceEndTime) {
    this.resourceEndTime = resourceEndTime;
  }

  public ItemForListResourceReservationRecordsOutput resourceStartTime(String resourceStartTime) {
    this.resourceStartTime = resourceStartTime;
    return this;
  }

   /**
   * Get resourceStartTime
   * @return resourceStartTime
  **/
  @Schema(description = "")
  public String getResourceStartTime() {
    return resourceStartTime;
  }

  public void setResourceStartTime(String resourceStartTime) {
    this.resourceStartTime = resourceStartTime;
  }

  public ItemForListResourceReservationRecordsOutput resourceZoneId(String resourceZoneId) {
    this.resourceZoneId = resourceZoneId;
    return this;
  }

   /**
   * Get resourceZoneId
   * @return resourceZoneId
  **/
  @Schema(description = "")
  public String getResourceZoneId() {
    return resourceZoneId;
  }

  public void setResourceZoneId(String resourceZoneId) {
    this.resourceZoneId = resourceZoneId;
  }

  public ItemForListResourceReservationRecordsOutput status(StatusForListResourceReservationRecordsOutput status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Valid
  @Schema(description = "")
  public StatusForListResourceReservationRecordsOutput getStatus() {
    return status;
  }

  public void setStatus(StatusForListResourceReservationRecordsOutput status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListResourceReservationRecordsOutput itemForListResourceReservationRecordsOutput = (ItemForListResourceReservationRecordsOutput) o;
    return Objects.equals(this.activationTime, itemForListResourceReservationRecordsOutput.activationTime) &&
        Objects.equals(this.allocatedComputeResource, itemForListResourceReservationRecordsOutput.allocatedComputeResource) &&
        Objects.equals(this.deliveredComputeResource, itemForListResourceReservationRecordsOutput.deliveredComputeResource) &&
        Objects.equals(this.desiredComputeResource, itemForListResourceReservationRecordsOutput.desiredComputeResource) &&
        Objects.equals(this.id, itemForListResourceReservationRecordsOutput.id) &&
        Objects.equals(this.resourceEndTime, itemForListResourceReservationRecordsOutput.resourceEndTime) &&
        Objects.equals(this.resourceStartTime, itemForListResourceReservationRecordsOutput.resourceStartTime) &&
        Objects.equals(this.resourceZoneId, itemForListResourceReservationRecordsOutput.resourceZoneId) &&
        Objects.equals(this.status, itemForListResourceReservationRecordsOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationTime, allocatedComputeResource, deliveredComputeResource, desiredComputeResource, id, resourceEndTime, resourceStartTime, resourceZoneId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListResourceReservationRecordsOutput {\n");
    
    sb.append("    activationTime: ").append(toIndentedString(activationTime)).append("\n");
    sb.append("    allocatedComputeResource: ").append(toIndentedString(allocatedComputeResource)).append("\n");
    sb.append("    deliveredComputeResource: ").append(toIndentedString(deliveredComputeResource)).append("\n");
    sb.append("    desiredComputeResource: ").append(toIndentedString(desiredComputeResource)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceEndTime: ").append(toIndentedString(resourceEndTime)).append("\n");
    sb.append("    resourceStartTime: ").append(toIndentedString(resourceStartTime)).append("\n");
    sb.append("    resourceZoneId: ").append(toIndentedString(resourceZoneId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
