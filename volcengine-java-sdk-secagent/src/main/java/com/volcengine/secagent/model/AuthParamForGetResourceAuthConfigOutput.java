/*
 * sec_agent
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.secagent.model;

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
 * AuthParamForGetResourceAuthConfigOutput
 */



public class AuthParamForGetResourceAuthConfigOutput {
  @SerializedName("Enums")
  private List<String> enums = null;

  @SerializedName("ParamKey")
  private String paramKey = null;

  @SerializedName("ParamName")
  private String paramName = null;

  @SerializedName("ParamTips")
  private String paramTips = null;

  public AuthParamForGetResourceAuthConfigOutput enums(List<String> enums) {
    this.enums = enums;
    return this;
  }

  public AuthParamForGetResourceAuthConfigOutput addEnumsItem(String enumsItem) {
    if (this.enums == null) {
      this.enums = new ArrayList<String>();
    }
    this.enums.add(enumsItem);
    return this;
  }

   /**
   * Get enums
   * @return enums
  **/
  @Schema(description = "")
  public List<String> getEnums() {
    return enums;
  }

  public void setEnums(List<String> enums) {
    this.enums = enums;
  }

  public AuthParamForGetResourceAuthConfigOutput paramKey(String paramKey) {
    this.paramKey = paramKey;
    return this;
  }

   /**
   * Get paramKey
   * @return paramKey
  **/
  @Schema(description = "")
  public String getParamKey() {
    return paramKey;
  }

  public void setParamKey(String paramKey) {
    this.paramKey = paramKey;
  }

  public AuthParamForGetResourceAuthConfigOutput paramName(String paramName) {
    this.paramName = paramName;
    return this;
  }

   /**
   * Get paramName
   * @return paramName
  **/
  @Schema(description = "")
  public String getParamName() {
    return paramName;
  }

  public void setParamName(String paramName) {
    this.paramName = paramName;
  }

  public AuthParamForGetResourceAuthConfigOutput paramTips(String paramTips) {
    this.paramTips = paramTips;
    return this;
  }

   /**
   * Get paramTips
   * @return paramTips
  **/
  @Schema(description = "")
  public String getParamTips() {
    return paramTips;
  }

  public void setParamTips(String paramTips) {
    this.paramTips = paramTips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthParamForGetResourceAuthConfigOutput authParamForGetResourceAuthConfigOutput = (AuthParamForGetResourceAuthConfigOutput) o;
    return Objects.equals(this.enums, authParamForGetResourceAuthConfigOutput.enums) &&
        Objects.equals(this.paramKey, authParamForGetResourceAuthConfigOutput.paramKey) &&
        Objects.equals(this.paramName, authParamForGetResourceAuthConfigOutput.paramName) &&
        Objects.equals(this.paramTips, authParamForGetResourceAuthConfigOutput.paramTips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enums, paramKey, paramName, paramTips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthParamForGetResourceAuthConfigOutput {\n");
    
    sb.append("    enums: ").append(toIndentedString(enums)).append("\n");
    sb.append("    paramKey: ").append(toIndentedString(paramKey)).append("\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    paramTips: ").append(toIndentedString(paramTips)).append("\n");
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
