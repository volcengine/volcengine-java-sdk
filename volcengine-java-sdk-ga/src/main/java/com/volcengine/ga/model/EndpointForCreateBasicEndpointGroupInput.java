/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

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
 * EndpointForCreateBasicEndpointGroupInput
 */



public class EndpointForCreateBasicEndpointGroupInput {
  @SerializedName("EdgeNodeName")
  private String edgeNodeName = null;

  @SerializedName("EndpointAddress")
  private String endpointAddress = null;

  @SerializedName("Type")
  private String type = null;

  public EndpointForCreateBasicEndpointGroupInput edgeNodeName(String edgeNodeName) {
    this.edgeNodeName = edgeNodeName;
    return this;
  }

   /**
   * Get edgeNodeName
   * @return edgeNodeName
  **/
  @Schema(description = "")
  public String getEdgeNodeName() {
    return edgeNodeName;
  }

  public void setEdgeNodeName(String edgeNodeName) {
    this.edgeNodeName = edgeNodeName;
  }

  public EndpointForCreateBasicEndpointGroupInput endpointAddress(String endpointAddress) {
    this.endpointAddress = endpointAddress;
    return this;
  }

   /**
   * Get endpointAddress
   * @return endpointAddress
  **/
  @Schema(description = "")
  public String getEndpointAddress() {
    return endpointAddress;
  }

  public void setEndpointAddress(String endpointAddress) {
    this.endpointAddress = endpointAddress;
  }

  public EndpointForCreateBasicEndpointGroupInput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointForCreateBasicEndpointGroupInput endpointForCreateBasicEndpointGroupInput = (EndpointForCreateBasicEndpointGroupInput) o;
    return Objects.equals(this.edgeNodeName, endpointForCreateBasicEndpointGroupInput.edgeNodeName) &&
        Objects.equals(this.endpointAddress, endpointForCreateBasicEndpointGroupInput.endpointAddress) &&
        Objects.equals(this.type, endpointForCreateBasicEndpointGroupInput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeNodeName, endpointAddress, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointForCreateBasicEndpointGroupInput {\n");
    
    sb.append("    edgeNodeName: ").append(toIndentedString(edgeNodeName)).append("\n");
    sb.append("    endpointAddress: ").append(toIndentedString(endpointAddress)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
