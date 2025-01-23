/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysqlv2.model.EstimationResultForModifyDBNodeSpecOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyDBNodeSpecResponse
 */



public class ModifyDBNodeSpecResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("EstimationResult")
  private EstimationResultForModifyDBNodeSpecOutput estimationResult = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("OrderId")
  private String orderId = null;

  public ModifyDBNodeSpecResponse estimationResult(EstimationResultForModifyDBNodeSpecOutput estimationResult) {
    this.estimationResult = estimationResult;
    return this;
  }

   /**
   * Get estimationResult
   * @return estimationResult
  **/
  @Valid
  @Schema(description = "")
  public EstimationResultForModifyDBNodeSpecOutput getEstimationResult() {
    return estimationResult;
  }

  public void setEstimationResult(EstimationResultForModifyDBNodeSpecOutput estimationResult) {
    this.estimationResult = estimationResult;
  }

  public ModifyDBNodeSpecResponse instanceId(String instanceId) {
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

  public ModifyDBNodeSpecResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBNodeSpecResponse modifyDBNodeSpecResponse = (ModifyDBNodeSpecResponse) o;
    return Objects.equals(this.estimationResult, modifyDBNodeSpecResponse.estimationResult) &&
        Objects.equals(this.instanceId, modifyDBNodeSpecResponse.instanceId) &&
        Objects.equals(this.orderId, modifyDBNodeSpecResponse.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimationResult, instanceId, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBNodeSpecResponse {\n");
    
    sb.append("    estimationResult: ").append(toIndentedString(estimationResult)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
