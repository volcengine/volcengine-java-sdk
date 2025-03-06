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
import com.volcengine.rdsmysqlv2.model.EstimationResultForCreateDBNodesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDBNodesResponse
 */



public class CreateDBNodesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("EstimationResult")
  private EstimationResultForCreateDBNodesOutput estimationResult = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("OrderId")
  private String orderId = null;

  public CreateDBNodesResponse estimationResult(EstimationResultForCreateDBNodesOutput estimationResult) {
    this.estimationResult = estimationResult;
    return this;
  }

   /**
   * Get estimationResult
   * @return estimationResult
  **/
  @Valid
  @Schema(description = "")
  public EstimationResultForCreateDBNodesOutput getEstimationResult() {
    return estimationResult;
  }

  public void setEstimationResult(EstimationResultForCreateDBNodesOutput estimationResult) {
    this.estimationResult = estimationResult;
  }

  public CreateDBNodesResponse instanceId(String instanceId) {
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

  public CreateDBNodesResponse orderId(String orderId) {
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
    CreateDBNodesResponse createDBNodesResponse = (CreateDBNodesResponse) o;
    return Objects.equals(this.estimationResult, createDBNodesResponse.estimationResult) &&
        Objects.equals(this.instanceId, createDBNodesResponse.instanceId) &&
        Objects.equals(this.orderId, createDBNodesResponse.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimationResult, instanceId, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDBNodesResponse {\n");
    
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
