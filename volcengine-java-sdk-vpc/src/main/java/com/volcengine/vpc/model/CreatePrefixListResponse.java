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
 * CreatePrefixListResponse
 */


public class CreatePrefixListResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PrefixListId")
  private String prefixListId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreatePrefixListResponse prefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
    return this;
  }

   /**
   * Get prefixListId
   * @return prefixListId
  **/
  @Schema(description = "")
  public String getPrefixListId() {
    return prefixListId;
  }

  public void setPrefixListId(String prefixListId) {
    this.prefixListId = prefixListId;
  }

  public CreatePrefixListResponse requestId(String requestId) {
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
    CreatePrefixListResponse createPrefixListResponse = (CreatePrefixListResponse) o;
    return Objects.equals(this.prefixListId, createPrefixListResponse.prefixListId) &&
        Objects.equals(this.requestId, createPrefixListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixListId, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrefixListResponse {\n");
    
    sb.append("    prefixListId: ").append(toIndentedString(prefixListId)).append("\n");
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
