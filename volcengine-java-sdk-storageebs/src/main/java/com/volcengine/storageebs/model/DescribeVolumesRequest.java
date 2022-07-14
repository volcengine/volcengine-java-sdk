/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * DescribeVolumesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:15.605776+08:00[Asia/Shanghai]")
public class DescribeVolumesRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Kind")
  private String kind = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("VolumeIds")
  private List<String> volumeIds = null;

  @SerializedName("VolumeName")
  private String volumeName = null;

  @SerializedName("VolumeStatus")
  private String volumeStatus = null;

  @SerializedName("VolumeType")
  private String volumeType = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeVolumesRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public DescribeVolumesRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(description = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public DescribeVolumesRequest pageNumber(Integer pageNumber) {
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

  public DescribeVolumesRequest pageSize(Integer pageSize) {
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

  public DescribeVolumesRequest volumeIds(List<String> volumeIds) {
    this.volumeIds = volumeIds;
    return this;
  }

  public DescribeVolumesRequest addVolumeIdsItem(String volumeIdsItem) {
    if (this.volumeIds == null) {
      this.volumeIds = new ArrayList<String>();
    }
    this.volumeIds.add(volumeIdsItem);
    return this;
  }

   /**
   * Get volumeIds
   * @return volumeIds
  **/
  @Schema(description = "")
  public List<String> getVolumeIds() {
    return volumeIds;
  }

  public void setVolumeIds(List<String> volumeIds) {
    this.volumeIds = volumeIds;
  }

  public DescribeVolumesRequest volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @Schema(description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public DescribeVolumesRequest volumeStatus(String volumeStatus) {
    this.volumeStatus = volumeStatus;
    return this;
  }

   /**
   * Get volumeStatus
   * @return volumeStatus
  **/
  @Schema(description = "")
  public String getVolumeStatus() {
    return volumeStatus;
  }

  public void setVolumeStatus(String volumeStatus) {
    this.volumeStatus = volumeStatus;
  }

  public DescribeVolumesRequest volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @Schema(description = "")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  public DescribeVolumesRequest zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVolumesRequest describeVolumesRequest = (DescribeVolumesRequest) o;
    return Objects.equals(this.instanceId, describeVolumesRequest.instanceId) &&
        Objects.equals(this.kind, describeVolumesRequest.kind) &&
        Objects.equals(this.pageNumber, describeVolumesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVolumesRequest.pageSize) &&
        Objects.equals(this.volumeIds, describeVolumesRequest.volumeIds) &&
        Objects.equals(this.volumeName, describeVolumesRequest.volumeName) &&
        Objects.equals(this.volumeStatus, describeVolumesRequest.volumeStatus) &&
        Objects.equals(this.volumeType, describeVolumesRequest.volumeType) &&
        Objects.equals(this.zoneId, describeVolumesRequest.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, kind, pageNumber, pageSize, volumeIds, volumeName, volumeStatus, volumeType, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVolumesRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeStatus: ").append(toIndentedString(volumeStatus)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
