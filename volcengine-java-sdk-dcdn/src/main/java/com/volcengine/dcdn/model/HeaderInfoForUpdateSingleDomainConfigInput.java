/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

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
 * HeaderInfoForUpdateSingleDomainConfigInput
 */



public class HeaderInfoForUpdateSingleDomainConfigInput {
  @SerializedName("HeaderMode")
  private Integer headerMode = null;

  @SerializedName("HeaderName")
  private String headerName = null;

  @SerializedName("HeaderValue")
  private String headerValue = null;

  @SerializedName("HeaderValueType")
  private String headerValueType = null;

  public HeaderInfoForUpdateSingleDomainConfigInput headerMode(Integer headerMode) {
    this.headerMode = headerMode;
    return this;
  }

   /**
   * Get headerMode
   * @return headerMode
  **/
  @Schema(description = "")
  public Integer getHeaderMode() {
    return headerMode;
  }

  public void setHeaderMode(Integer headerMode) {
    this.headerMode = headerMode;
  }

  public HeaderInfoForUpdateSingleDomainConfigInput headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * Get headerName
   * @return headerName
  **/
  @Schema(description = "")
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }

  public HeaderInfoForUpdateSingleDomainConfigInput headerValue(String headerValue) {
    this.headerValue = headerValue;
    return this;
  }

   /**
   * Get headerValue
   * @return headerValue
  **/
  @Schema(description = "")
  public String getHeaderValue() {
    return headerValue;
  }

  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }

  public HeaderInfoForUpdateSingleDomainConfigInput headerValueType(String headerValueType) {
    this.headerValueType = headerValueType;
    return this;
  }

   /**
   * Get headerValueType
   * @return headerValueType
  **/
  @Schema(description = "")
  public String getHeaderValueType() {
    return headerValueType;
  }

  public void setHeaderValueType(String headerValueType) {
    this.headerValueType = headerValueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderInfoForUpdateSingleDomainConfigInput headerInfoForUpdateSingleDomainConfigInput = (HeaderInfoForUpdateSingleDomainConfigInput) o;
    return Objects.equals(this.headerMode, headerInfoForUpdateSingleDomainConfigInput.headerMode) &&
        Objects.equals(this.headerName, headerInfoForUpdateSingleDomainConfigInput.headerName) &&
        Objects.equals(this.headerValue, headerInfoForUpdateSingleDomainConfigInput.headerValue) &&
        Objects.equals(this.headerValueType, headerInfoForUpdateSingleDomainConfigInput.headerValueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerMode, headerName, headerValue, headerValueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderInfoForUpdateSingleDomainConfigInput {\n");
    
    sb.append("    headerMode: ").append(toIndentedString(headerMode)).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
    sb.append("    headerValueType: ").append(toIndentedString(headerValueType)).append("\n");
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
