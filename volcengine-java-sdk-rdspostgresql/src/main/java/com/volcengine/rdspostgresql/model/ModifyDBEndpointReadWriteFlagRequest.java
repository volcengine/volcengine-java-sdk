/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdspostgresql.model.ReadOnlyNodeWeightForModifyDBEndpointReadWriteFlagInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyDBEndpointReadWriteFlagRequest
 */



public class ModifyDBEndpointReadWriteFlagRequest {
  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ReadOnlyNodeDistributionType")
  private String readOnlyNodeDistributionType = null;

  @SerializedName("ReadOnlyNodeMaxDelayTime")
  private Integer readOnlyNodeMaxDelayTime = null;

  @SerializedName("ReadOnlyNodeWeight")
  private List<ReadOnlyNodeWeightForModifyDBEndpointReadWriteFlagInput> readOnlyNodeWeight = null;

  @SerializedName("ReadWriteSpliting")
  private Boolean readWriteSpliting = null;

  public ModifyDBEndpointReadWriteFlagRequest endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public ModifyDBEndpointReadWriteFlagRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifyDBEndpointReadWriteFlagRequest readOnlyNodeDistributionType(String readOnlyNodeDistributionType) {
    this.readOnlyNodeDistributionType = readOnlyNodeDistributionType;
    return this;
  }

   /**
   * Get readOnlyNodeDistributionType
   * @return readOnlyNodeDistributionType
  **/
  @Schema(description = "")
  public String getReadOnlyNodeDistributionType() {
    return readOnlyNodeDistributionType;
  }

  public void setReadOnlyNodeDistributionType(String readOnlyNodeDistributionType) {
    this.readOnlyNodeDistributionType = readOnlyNodeDistributionType;
  }

  public ModifyDBEndpointReadWriteFlagRequest readOnlyNodeMaxDelayTime(Integer readOnlyNodeMaxDelayTime) {
    this.readOnlyNodeMaxDelayTime = readOnlyNodeMaxDelayTime;
    return this;
  }

   /**
   * Get readOnlyNodeMaxDelayTime
   * @return readOnlyNodeMaxDelayTime
  **/
  @Schema(description = "")
  public Integer getReadOnlyNodeMaxDelayTime() {
    return readOnlyNodeMaxDelayTime;
  }

  public void setReadOnlyNodeMaxDelayTime(Integer readOnlyNodeMaxDelayTime) {
    this.readOnlyNodeMaxDelayTime = readOnlyNodeMaxDelayTime;
  }

  public ModifyDBEndpointReadWriteFlagRequest readOnlyNodeWeight(List<ReadOnlyNodeWeightForModifyDBEndpointReadWriteFlagInput> readOnlyNodeWeight) {
    this.readOnlyNodeWeight = readOnlyNodeWeight;
    return this;
  }

  public ModifyDBEndpointReadWriteFlagRequest addReadOnlyNodeWeightItem(ReadOnlyNodeWeightForModifyDBEndpointReadWriteFlagInput readOnlyNodeWeightItem) {
    if (this.readOnlyNodeWeight == null) {
      this.readOnlyNodeWeight = new ArrayList<ReadOnlyNodeWeightForModifyDBEndpointReadWriteFlagInput>();
    }
    this.readOnlyNodeWeight.add(readOnlyNodeWeightItem);
    return this;
  }

   /**
   * Get readOnlyNodeWeight
   * @return readOnlyNodeWeight
  **/
  @Valid
  @Schema(description = "")
  public List<ReadOnlyNodeWeightForModifyDBEndpointReadWriteFlagInput> getReadOnlyNodeWeight() {
    return readOnlyNodeWeight;
  }

  public void setReadOnlyNodeWeight(List<ReadOnlyNodeWeightForModifyDBEndpointReadWriteFlagInput> readOnlyNodeWeight) {
    this.readOnlyNodeWeight = readOnlyNodeWeight;
  }

  public ModifyDBEndpointReadWriteFlagRequest readWriteSpliting(Boolean readWriteSpliting) {
    this.readWriteSpliting = readWriteSpliting;
    return this;
  }

   /**
   * Get readWriteSpliting
   * @return readWriteSpliting
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Boolean isReadWriteSpliting() {
    return readWriteSpliting;
  }

  public void setReadWriteSpliting(Boolean readWriteSpliting) {
    this.readWriteSpliting = readWriteSpliting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBEndpointReadWriteFlagRequest modifyDBEndpointReadWriteFlagRequest = (ModifyDBEndpointReadWriteFlagRequest) o;
    return Objects.equals(this.endpointId, modifyDBEndpointReadWriteFlagRequest.endpointId) &&
        Objects.equals(this.instanceId, modifyDBEndpointReadWriteFlagRequest.instanceId) &&
        Objects.equals(this.readOnlyNodeDistributionType, modifyDBEndpointReadWriteFlagRequest.readOnlyNodeDistributionType) &&
        Objects.equals(this.readOnlyNodeMaxDelayTime, modifyDBEndpointReadWriteFlagRequest.readOnlyNodeMaxDelayTime) &&
        Objects.equals(this.readOnlyNodeWeight, modifyDBEndpointReadWriteFlagRequest.readOnlyNodeWeight) &&
        Objects.equals(this.readWriteSpliting, modifyDBEndpointReadWriteFlagRequest.readWriteSpliting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, instanceId, readOnlyNodeDistributionType, readOnlyNodeMaxDelayTime, readOnlyNodeWeight, readWriteSpliting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBEndpointReadWriteFlagRequest {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    readOnlyNodeDistributionType: ").append(toIndentedString(readOnlyNodeDistributionType)).append("\n");
    sb.append("    readOnlyNodeMaxDelayTime: ").append(toIndentedString(readOnlyNodeMaxDelayTime)).append("\n");
    sb.append("    readOnlyNodeWeight: ").append(toIndentedString(readOnlyNodeWeight)).append("\n");
    sb.append("    readWriteSpliting: ").append(toIndentedString(readWriteSpliting)).append("\n");
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
