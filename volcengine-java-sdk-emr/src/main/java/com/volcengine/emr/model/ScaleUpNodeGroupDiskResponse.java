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
import com.volcengine.emr.model.ResultDataForScaleUpNodeGroupDiskOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScaleUpNodeGroupDiskResponse
 */



public class ScaleUpNodeGroupDiskResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("OperationId")
  private String operationId = null;

  @SerializedName("ResultData")
  private ResultDataForScaleUpNodeGroupDiskOutput resultData = null;

  public ScaleUpNodeGroupDiskResponse clusterId(String clusterId) {
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

  public ScaleUpNodeGroupDiskResponse operationId(String operationId) {
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

  public ScaleUpNodeGroupDiskResponse resultData(ResultDataForScaleUpNodeGroupDiskOutput resultData) {
    this.resultData = resultData;
    return this;
  }

   /**
   * Get resultData
   * @return resultData
  **/
  @Valid
  @Schema(description = "")
  public ResultDataForScaleUpNodeGroupDiskOutput getResultData() {
    return resultData;
  }

  public void setResultData(ResultDataForScaleUpNodeGroupDiskOutput resultData) {
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
    ScaleUpNodeGroupDiskResponse scaleUpNodeGroupDiskResponse = (ScaleUpNodeGroupDiskResponse) o;
    return Objects.equals(this.clusterId, scaleUpNodeGroupDiskResponse.clusterId) &&
        Objects.equals(this.operationId, scaleUpNodeGroupDiskResponse.operationId) &&
        Objects.equals(this.resultData, scaleUpNodeGroupDiskResponse.resultData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, operationId, resultData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleUpNodeGroupDiskResponse {\n");
    
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
