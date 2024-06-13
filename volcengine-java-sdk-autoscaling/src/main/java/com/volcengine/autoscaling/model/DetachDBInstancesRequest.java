/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * DetachDBInstancesRequest
 */


public class DetachDBInstancesRequest {
  @SerializedName("DBInstanceIds")
  private List<String> dbInstanceIds = null;

  @SerializedName("ForceDetach")
  private Boolean forceDetach = null;

  @SerializedName("ScalingGroupId")
  private String scalingGroupId = null;

  public DetachDBInstancesRequest dbInstanceIds(List<String> dbInstanceIds) {
    this.dbInstanceIds = dbInstanceIds;
    return this;
  }

  public DetachDBInstancesRequest addDbInstanceIdsItem(String dbInstanceIdsItem) {
    if (this.dbInstanceIds == null) {
      this.dbInstanceIds = new ArrayList<String>();
    }
    this.dbInstanceIds.add(dbInstanceIdsItem);
    return this;
  }

   /**
   * Get dbInstanceIds
   * @return dbInstanceIds
  **/
  @Schema(description = "")
  public List<String> getDbInstanceIds() {
    return dbInstanceIds;
  }

  public void setDbInstanceIds(List<String> dbInstanceIds) {
    this.dbInstanceIds = dbInstanceIds;
  }

  public DetachDBInstancesRequest forceDetach(Boolean forceDetach) {
    this.forceDetach = forceDetach;
    return this;
  }

   /**
   * Get forceDetach
   * @return forceDetach
  **/
  @Schema(description = "")
  public Boolean isForceDetach() {
    return forceDetach;
  }

  public void setForceDetach(Boolean forceDetach) {
    this.forceDetach = forceDetach;
  }

  public DetachDBInstancesRequest scalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
    return this;
  }

   /**
   * Get scalingGroupId
   * @return scalingGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getScalingGroupId() {
    return scalingGroupId;
  }

  public void setScalingGroupId(String scalingGroupId) {
    this.scalingGroupId = scalingGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetachDBInstancesRequest detachDBInstancesRequest = (DetachDBInstancesRequest) o;
    return Objects.equals(this.dbInstanceIds, detachDBInstancesRequest.dbInstanceIds) &&
        Objects.equals(this.forceDetach, detachDBInstancesRequest.forceDetach) &&
        Objects.equals(this.scalingGroupId, detachDBInstancesRequest.scalingGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbInstanceIds, forceDetach, scalingGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetachDBInstancesRequest {\n");
    
    sb.append("    dbInstanceIds: ").append(toIndentedString(dbInstanceIds)).append("\n");
    sb.append("    forceDetach: ").append(toIndentedString(forceDetach)).append("\n");
    sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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
