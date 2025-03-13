/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

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
 * UpdateNodeGroupAttributeResponse
 */



public class UpdateNodeGroupAttributeResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("OperationId")
  private String operationId = null;

  @SerializedName("ResultData")
  private String resultData = null;

  public UpdateNodeGroupAttributeResponse clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public UpdateNodeGroupAttributeResponse operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Get operationId
   * @return operationId
  **/
  @Schema(description = "")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public UpdateNodeGroupAttributeResponse resultData(String resultData) {
    this.resultData = resultData;
    return this;
  }

   /**
   * Get resultData
   * @return resultData
  **/
  @Schema(description = "")
  public String getResultData() {
    return resultData;
  }

  public void setResultData(String resultData) {
    this.resultData = resultData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNodeGroupAttributeResponse updateNodeGroupAttributeResponse = (UpdateNodeGroupAttributeResponse) o;
    return Objects.equals(this.clusterId, updateNodeGroupAttributeResponse.clusterId) &&
        Objects.equals(this.operationId, updateNodeGroupAttributeResponse.operationId) &&
        Objects.equals(this.resultData, updateNodeGroupAttributeResponse.resultData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, operationId, resultData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNodeGroupAttributeResponse {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    resultData: ").append(toIndentedString(resultData)).append("\n");
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
