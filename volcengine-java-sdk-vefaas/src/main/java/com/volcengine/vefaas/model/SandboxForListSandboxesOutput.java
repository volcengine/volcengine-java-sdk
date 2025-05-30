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
import com.volcengine.vefaas.model.MetadataForListSandboxesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SandboxForListSandboxesOutput
 */



public class SandboxForListSandboxesOutput {
  @SerializedName("AvailabilityZone")
  private String availabilityZone = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("ExpireAt")
  private String expireAt = null;

  @SerializedName("FunctionId")
  private String functionId = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  @SerializedName("Metadata")
  private MetadataForListSandboxesOutput metadata = null;

  @SerializedName("RevisionNumber")
  private Integer revisionNumber = null;

  @SerializedName("Status")
  private String status = null;

  public SandboxForListSandboxesOutput availabilityZone(String availabilityZone) {
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

  public SandboxForListSandboxesOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SandboxForListSandboxesOutput expireAt(String expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Get expireAt
   * @return expireAt
  **/
  @Schema(description = "")
  public String getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(String expireAt) {
    this.expireAt = expireAt;
  }

  public SandboxForListSandboxesOutput functionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

   /**
   * Get functionId
   * @return functionId
  **/
  @Schema(description = "")
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  public SandboxForListSandboxesOutput id(String id) {
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

  public SandboxForListSandboxesOutput instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public SandboxForListSandboxesOutput metadata(MetadataForListSandboxesOutput metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Valid
  @Schema(description = "")
  public MetadataForListSandboxesOutput getMetadata() {
    return metadata;
  }

  public void setMetadata(MetadataForListSandboxesOutput metadata) {
    this.metadata = metadata;
  }

  public SandboxForListSandboxesOutput revisionNumber(Integer revisionNumber) {
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

  public SandboxForListSandboxesOutput status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxForListSandboxesOutput sandboxForListSandboxesOutput = (SandboxForListSandboxesOutput) o;
    return Objects.equals(this.availabilityZone, sandboxForListSandboxesOutput.availabilityZone) &&
        Objects.equals(this.createdAt, sandboxForListSandboxesOutput.createdAt) &&
        Objects.equals(this.expireAt, sandboxForListSandboxesOutput.expireAt) &&
        Objects.equals(this.functionId, sandboxForListSandboxesOutput.functionId) &&
        Objects.equals(this.id, sandboxForListSandboxesOutput.id) &&
        Objects.equals(this.instanceType, sandboxForListSandboxesOutput.instanceType) &&
        Objects.equals(this.metadata, sandboxForListSandboxesOutput.metadata) &&
        Objects.equals(this.revisionNumber, sandboxForListSandboxesOutput.revisionNumber) &&
        Objects.equals(this.status, sandboxForListSandboxesOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, createdAt, expireAt, functionId, id, instanceType, metadata, revisionNumber, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxForListSandboxesOutput {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    revisionNumber: ").append(toIndentedString(revisionNumber)).append("\n");
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
