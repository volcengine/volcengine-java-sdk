/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

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
 * StatusCodeActionForBatchUpdateCdnConfigInput
 */



public class StatusCodeActionForBatchUpdateCdnConfigInput {
  @SerializedName("DefaultAction")
  private String defaultAction = null;

  @SerializedName("FailCode")
  private String failCode = null;

  @SerializedName("SuccessCode")
  private String successCode = null;

  public StatusCodeActionForBatchUpdateCdnConfigInput defaultAction(String defaultAction) {
    this.defaultAction = defaultAction;
    return this;
  }

   /**
   * Get defaultAction
   * @return defaultAction
  **/
  @Schema(description = "")
  public String getDefaultAction() {
    return defaultAction;
  }

  public void setDefaultAction(String defaultAction) {
    this.defaultAction = defaultAction;
  }

  public StatusCodeActionForBatchUpdateCdnConfigInput failCode(String failCode) {
    this.failCode = failCode;
    return this;
  }

   /**
   * Get failCode
   * @return failCode
  **/
  @Schema(description = "")
  public String getFailCode() {
    return failCode;
  }

  public void setFailCode(String failCode) {
    this.failCode = failCode;
  }

  public StatusCodeActionForBatchUpdateCdnConfigInput successCode(String successCode) {
    this.successCode = successCode;
    return this;
  }

   /**
   * Get successCode
   * @return successCode
  **/
  @Schema(description = "")
  public String getSuccessCode() {
    return successCode;
  }

  public void setSuccessCode(String successCode) {
    this.successCode = successCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCodeActionForBatchUpdateCdnConfigInput statusCodeActionForBatchUpdateCdnConfigInput = (StatusCodeActionForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.defaultAction, statusCodeActionForBatchUpdateCdnConfigInput.defaultAction) &&
        Objects.equals(this.failCode, statusCodeActionForBatchUpdateCdnConfigInput.failCode) &&
        Objects.equals(this.successCode, statusCodeActionForBatchUpdateCdnConfigInput.successCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAction, failCode, successCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCodeActionForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    defaultAction: ").append(toIndentedString(defaultAction)).append("\n");
    sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
    sb.append("    successCode: ").append(toIndentedString(successCode)).append("\n");
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
