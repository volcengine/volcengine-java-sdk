/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * CreateVpcEndpointResponse
 */



public class CreateVpcEndpointResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("EndpointId")
  private String endpointId = null;

  @SerializedName("PreOrderNumbers")
  private List<String> preOrderNumbers = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateVpcEndpointResponse endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @Schema(description = "")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }

  public CreateVpcEndpointResponse preOrderNumbers(List<String> preOrderNumbers) {
    this.preOrderNumbers = preOrderNumbers;
    return this;
  }

  public CreateVpcEndpointResponse addPreOrderNumbersItem(String preOrderNumbersItem) {
    if (this.preOrderNumbers == null) {
      this.preOrderNumbers = new ArrayList<String>();
    }
    this.preOrderNumbers.add(preOrderNumbersItem);
    return this;
  }

   /**
   * Get preOrderNumbers
   * @return preOrderNumbers
  **/
  @Schema(description = "")
  public List<String> getPreOrderNumbers() {
    return preOrderNumbers;
  }

  public void setPreOrderNumbers(List<String> preOrderNumbers) {
    this.preOrderNumbers = preOrderNumbers;
  }

  public CreateVpcEndpointResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpcEndpointResponse createVpcEndpointResponse = (CreateVpcEndpointResponse) o;
    return Objects.equals(this.endpointId, createVpcEndpointResponse.endpointId) &&
        Objects.equals(this.preOrderNumbers, createVpcEndpointResponse.preOrderNumbers) &&
        Objects.equals(this.requestId, createVpcEndpointResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, preOrderNumbers, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpcEndpointResponse {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    preOrderNumbers: ").append(toIndentedString(preOrderNumbers)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
