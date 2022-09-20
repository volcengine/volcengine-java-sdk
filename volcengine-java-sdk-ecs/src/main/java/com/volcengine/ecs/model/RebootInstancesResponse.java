/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.OperationDetailForRebootInstancesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RebootInstancesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:32.100831+08:00[Asia/Shanghai]")
public class RebootInstancesResponse {
  @SerializedName("OperationDetails")
  private List<OperationDetailForRebootInstancesOutput> operationDetails = null;

  public RebootInstancesResponse operationDetails(List<OperationDetailForRebootInstancesOutput> operationDetails) {
    this.operationDetails = operationDetails;
    return this;
  }

  public RebootInstancesResponse addOperationDetailsItem(OperationDetailForRebootInstancesOutput operationDetailsItem) {
    if (this.operationDetails == null) {
      this.operationDetails = new ArrayList<OperationDetailForRebootInstancesOutput>();
    }
    this.operationDetails.add(operationDetailsItem);
    return this;
  }

   /**
   * Get operationDetails
   * @return operationDetails
  **/
  @Valid
  @Schema(description = "")
  public List<OperationDetailForRebootInstancesOutput> getOperationDetails() {
    return operationDetails;
  }

  public void setOperationDetails(List<OperationDetailForRebootInstancesOutput> operationDetails) {
    this.operationDetails = operationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebootInstancesResponse rebootInstancesResponse = (RebootInstancesResponse) o;
    return Objects.equals(this.operationDetails, rebootInstancesResponse.operationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebootInstancesResponse {\n");
    
    sb.append("    operationDetails: ").append(toIndentedString(operationDetails)).append("\n");
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
