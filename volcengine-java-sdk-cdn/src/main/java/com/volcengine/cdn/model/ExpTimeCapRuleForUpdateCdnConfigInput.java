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
 * ExpTimeCapRuleForUpdateCdnConfigInput
 */



public class ExpTimeCapRuleForUpdateCdnConfigInput {
  @SerializedName("CapMode")
  private String capMode = null;

  @SerializedName("ParamName")
  private String paramName = null;

  @SerializedName("UriLevel")
  private Long uriLevel = null;

  public ExpTimeCapRuleForUpdateCdnConfigInput capMode(String capMode) {
    this.capMode = capMode;
    return this;
  }

   /**
   * Get capMode
   * @return capMode
  **/
  @Schema(description = "")
  public String getCapMode() {
    return capMode;
  }

  public void setCapMode(String capMode) {
    this.capMode = capMode;
  }

  public ExpTimeCapRuleForUpdateCdnConfigInput paramName(String paramName) {
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

  public ExpTimeCapRuleForUpdateCdnConfigInput uriLevel(Long uriLevel) {
    this.uriLevel = uriLevel;
    return this;
  }

   /**
   * Get uriLevel
   * @return uriLevel
  **/
  @Schema(description = "")
  public Long getUriLevel() {
    return uriLevel;
  }

  public void setUriLevel(Long uriLevel) {
    this.uriLevel = uriLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpTimeCapRuleForUpdateCdnConfigInput expTimeCapRuleForUpdateCdnConfigInput = (ExpTimeCapRuleForUpdateCdnConfigInput) o;
    return Objects.equals(this.capMode, expTimeCapRuleForUpdateCdnConfigInput.capMode) &&
        Objects.equals(this.paramName, expTimeCapRuleForUpdateCdnConfigInput.paramName) &&
        Objects.equals(this.uriLevel, expTimeCapRuleForUpdateCdnConfigInput.uriLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capMode, paramName, uriLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpTimeCapRuleForUpdateCdnConfigInput {\n");
    
    sb.append("    capMode: ").append(toIndentedString(capMode)).append("\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    uriLevel: ").append(toIndentedString(uriLevel)).append("\n");
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
