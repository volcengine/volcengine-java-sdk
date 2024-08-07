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
import com.volcengine.cdn.model.SignCapRuleForDescribeCdnConfigOutput;
import com.volcengine.cdn.model.UriParamSupForDescribeCdnConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SignParamForDescribeCdnConfigOutput
 */



public class SignParamForDescribeCdnConfigOutput {
  @SerializedName("ParamType")
  private String paramType = null;

  @SerializedName("RequestHeader")
  private String requestHeader = null;

  @SerializedName("SupContent")
  private String supContent = null;

  @SerializedName("UriParamSup")
  private UriParamSupForDescribeCdnConfigOutput uriParamSup = null;

  @SerializedName("UrlParam")
  private SignCapRuleForDescribeCdnConfigOutput urlParam = null;

  public SignParamForDescribeCdnConfigOutput paramType(String paramType) {
    this.paramType = paramType;
    return this;
  }

   /**
   * Get paramType
   * @return paramType
  **/
  @Schema(description = "")
  public String getParamType() {
    return paramType;
  }

  public void setParamType(String paramType) {
    this.paramType = paramType;
  }

  public SignParamForDescribeCdnConfigOutput requestHeader(String requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

   /**
   * Get requestHeader
   * @return requestHeader
  **/
  @Schema(description = "")
  public String getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(String requestHeader) {
    this.requestHeader = requestHeader;
  }

  public SignParamForDescribeCdnConfigOutput supContent(String supContent) {
    this.supContent = supContent;
    return this;
  }

   /**
   * Get supContent
   * @return supContent
  **/
  @Schema(description = "")
  public String getSupContent() {
    return supContent;
  }

  public void setSupContent(String supContent) {
    this.supContent = supContent;
  }

  public SignParamForDescribeCdnConfigOutput uriParamSup(UriParamSupForDescribeCdnConfigOutput uriParamSup) {
    this.uriParamSup = uriParamSup;
    return this;
  }

   /**
   * Get uriParamSup
   * @return uriParamSup
  **/
  @Valid
  @Schema(description = "")
  public UriParamSupForDescribeCdnConfigOutput getUriParamSup() {
    return uriParamSup;
  }

  public void setUriParamSup(UriParamSupForDescribeCdnConfigOutput uriParamSup) {
    this.uriParamSup = uriParamSup;
  }

  public SignParamForDescribeCdnConfigOutput urlParam(SignCapRuleForDescribeCdnConfigOutput urlParam) {
    this.urlParam = urlParam;
    return this;
  }

   /**
   * Get urlParam
   * @return urlParam
  **/
  @Valid
  @Schema(description = "")
  public SignCapRuleForDescribeCdnConfigOutput getUrlParam() {
    return urlParam;
  }

  public void setUrlParam(SignCapRuleForDescribeCdnConfigOutput urlParam) {
    this.urlParam = urlParam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignParamForDescribeCdnConfigOutput signParamForDescribeCdnConfigOutput = (SignParamForDescribeCdnConfigOutput) o;
    return Objects.equals(this.paramType, signParamForDescribeCdnConfigOutput.paramType) &&
        Objects.equals(this.requestHeader, signParamForDescribeCdnConfigOutput.requestHeader) &&
        Objects.equals(this.supContent, signParamForDescribeCdnConfigOutput.supContent) &&
        Objects.equals(this.uriParamSup, signParamForDescribeCdnConfigOutput.uriParamSup) &&
        Objects.equals(this.urlParam, signParamForDescribeCdnConfigOutput.urlParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramType, requestHeader, supContent, uriParamSup, urlParam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignParamForDescribeCdnConfigOutput {\n");
    
    sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    supContent: ").append(toIndentedString(supContent)).append("\n");
    sb.append("    uriParamSup: ").append(toIndentedString(uriParamSup)).append("\n");
    sb.append("    urlParam: ").append(toIndentedString(urlParam)).append("\n");
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
