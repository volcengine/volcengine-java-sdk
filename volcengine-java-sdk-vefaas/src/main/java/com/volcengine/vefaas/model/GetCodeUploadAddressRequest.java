/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

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
 * GetCodeUploadAddressRequest
 */



public class GetCodeUploadAddressRequest {
  @SerializedName("ContentLength")
  private Long contentLength = null;

  @SerializedName("FunctionId")
  private String functionId = null;

  public GetCodeUploadAddressRequest contentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }

   /**
   * Get contentLength
   * @return contentLength
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Long getContentLength() {
    return contentLength;
  }

  public void setContentLength(Long contentLength) {
    this.contentLength = contentLength;
  }

  public GetCodeUploadAddressRequest functionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

   /**
   * Get functionId
   * @return functionId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCodeUploadAddressRequest getCodeUploadAddressRequest = (GetCodeUploadAddressRequest) o;
    return Objects.equals(this.contentLength, getCodeUploadAddressRequest.contentLength) &&
        Objects.equals(this.functionId, getCodeUploadAddressRequest.functionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, functionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCodeUploadAddressRequest {\n");
    
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
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
