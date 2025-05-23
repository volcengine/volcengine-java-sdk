/*
 * cv20240606
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cv20240606.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cv20240606.model.DataForLensVidaVideoGetResultOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LensVidaVideoGetResultResponse
 */



public class LensVidaVideoGetResultResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("data")
  private DataForLensVidaVideoGetResultOutput data = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("time_elapsed")
  private String timeElapsed = null;

  public LensVidaVideoGetResultResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public LensVidaVideoGetResultResponse data(DataForLensVidaVideoGetResultOutput data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Valid
  @Schema(description = "")
  public DataForLensVidaVideoGetResultOutput getData() {
    return data;
  }

  public void setData(DataForLensVidaVideoGetResultOutput data) {
    this.data = data;
  }

  public LensVidaVideoGetResultResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LensVidaVideoGetResultResponse requestId(String requestId) {
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

  public LensVidaVideoGetResultResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public LensVidaVideoGetResultResponse timeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
    return this;
  }

   /**
   * Get timeElapsed
   * @return timeElapsed
  **/
  @Schema(description = "")
  public String getTimeElapsed() {
    return timeElapsed;
  }

  public void setTimeElapsed(String timeElapsed) {
    this.timeElapsed = timeElapsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LensVidaVideoGetResultResponse lensVidaVideoGetResultResponse = (LensVidaVideoGetResultResponse) o;
    return Objects.equals(this.code, lensVidaVideoGetResultResponse.code) &&
        Objects.equals(this.data, lensVidaVideoGetResultResponse.data) &&
        Objects.equals(this.message, lensVidaVideoGetResultResponse.message) &&
        Objects.equals(this.requestId, lensVidaVideoGetResultResponse.requestId) &&
        Objects.equals(this.status, lensVidaVideoGetResultResponse.status) &&
        Objects.equals(this.timeElapsed, lensVidaVideoGetResultResponse.timeElapsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, requestId, status, timeElapsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LensVidaVideoGetResultResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeElapsed: ").append(toIndentedString(timeElapsed)).append("\n");
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
