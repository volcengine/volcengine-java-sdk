/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

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
 * ItemForListFunctionInstancesOutput
 */



public class ItemForListFunctionInstancesOutput {
  @SerializedName("AvailabilityZone")
  private String availabilityZone = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InstanceName")
  private String instanceName = null;

  @SerializedName("InstanceStatus")
  private String instanceStatus = null;

  @SerializedName("RevisionNumber")
  private Integer revisionNumber = null;

  public ItemForListFunctionInstancesOutput availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * Get availabilityZone
   * @return availabilityZone
  **/
  @Schema(description = "")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  public ItemForListFunctionInstancesOutput creationTime(String creationTime) {
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

  public ItemForListFunctionInstancesOutput id(String id) {
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

  public ItemForListFunctionInstancesOutput instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public ItemForListFunctionInstancesOutput instanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
    return this;
  }

   /**
   * Get instanceStatus
   * @return instanceStatus
  **/
  @Schema(description = "")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  public ItemForListFunctionInstancesOutput revisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
    return this;
  }

   /**
   * Get revisionNumber
   * @return revisionNumber
  **/
  @Schema(description = "")
  public Integer getRevisionNumber() {
    return revisionNumber;
  }

  public void setRevisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListFunctionInstancesOutput itemForListFunctionInstancesOutput = (ItemForListFunctionInstancesOutput) o;
    return Objects.equals(this.availabilityZone, itemForListFunctionInstancesOutput.availabilityZone) &&
        Objects.equals(this.creationTime, itemForListFunctionInstancesOutput.creationTime) &&
        Objects.equals(this.id, itemForListFunctionInstancesOutput.id) &&
        Objects.equals(this.instanceName, itemForListFunctionInstancesOutput.instanceName) &&
        Objects.equals(this.instanceStatus, itemForListFunctionInstancesOutput.instanceStatus) &&
        Objects.equals(this.revisionNumber, itemForListFunctionInstancesOutput.revisionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, creationTime, id, instanceName, instanceStatus, revisionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListFunctionInstancesOutput {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    revisionNumber: ").append(toIndentedString(revisionNumber)).append("\n");
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
