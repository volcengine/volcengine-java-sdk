/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * CreateSharedDirectConnectConnectionResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:22.987183+08:00[Asia/Shanghai]")
public class CreateSharedDirectConnectConnectionResponse {
  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SharedDirectConnectConnectionId")
  private String sharedDirectConnectConnectionId = null;

  public CreateSharedDirectConnectConnectionResponse requestId(String requestId) {
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

  public CreateSharedDirectConnectConnectionResponse sharedDirectConnectConnectionId(String sharedDirectConnectConnectionId) {
    this.sharedDirectConnectConnectionId = sharedDirectConnectConnectionId;
    return this;
  }

   /**
   * Get sharedDirectConnectConnectionId
   * @return sharedDirectConnectConnectionId
  **/
  @Schema(description = "")
  public String getSharedDirectConnectConnectionId() {
    return sharedDirectConnectConnectionId;
  }

  public void setSharedDirectConnectConnectionId(String sharedDirectConnectConnectionId) {
    this.sharedDirectConnectConnectionId = sharedDirectConnectConnectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSharedDirectConnectConnectionResponse createSharedDirectConnectConnectionResponse = (CreateSharedDirectConnectConnectionResponse) o;
    return Objects.equals(this.requestId, createSharedDirectConnectConnectionResponse.requestId) &&
        Objects.equals(this.sharedDirectConnectConnectionId, createSharedDirectConnectConnectionResponse.sharedDirectConnectConnectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, sharedDirectConnectConnectionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSharedDirectConnectConnectionResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sharedDirectConnectConnectionId: ").append(toIndentedString(sharedDirectConnectConnectionId)).append("\n");
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