/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * CreateTrafficMirrorFilterResponse
 */



public class CreateTrafficMirrorFilterResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TrafficMirrorFilterId")
  private String trafficMirrorFilterId = null;

  public CreateTrafficMirrorFilterResponse requestId(String requestId) {
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

  public CreateTrafficMirrorFilterResponse trafficMirrorFilterId(String trafficMirrorFilterId) {
    this.trafficMirrorFilterId = trafficMirrorFilterId;
    return this;
  }

   /**
   * Get trafficMirrorFilterId
   * @return trafficMirrorFilterId
  **/
  @Schema(description = "")
  public String getTrafficMirrorFilterId() {
    return trafficMirrorFilterId;
  }

  public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
    this.trafficMirrorFilterId = trafficMirrorFilterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrafficMirrorFilterResponse createTrafficMirrorFilterResponse = (CreateTrafficMirrorFilterResponse) o;
    return Objects.equals(this.requestId, createTrafficMirrorFilterResponse.requestId) &&
        Objects.equals(this.trafficMirrorFilterId, createTrafficMirrorFilterResponse.trafficMirrorFilterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, trafficMirrorFilterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrafficMirrorFilterResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    trafficMirrorFilterId: ").append(toIndentedString(trafficMirrorFilterId)).append("\n");
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
