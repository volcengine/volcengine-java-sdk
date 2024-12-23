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
 * OriginSniForCreateDomainConfigsInput
 */



public class OriginSniForCreateDomainConfigsInput {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("SniInfo")
  private String sniInfo = null;

  public OriginSniForCreateDomainConfigsInput enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public OriginSniForCreateDomainConfigsInput sniInfo(String sniInfo) {
    this.sniInfo = sniInfo;
    return this;
  }

   /**
   * Get sniInfo
   * @return sniInfo
  **/
  @Schema(description = "")
  public String getSniInfo() {
    return sniInfo;
  }

  public void setSniInfo(String sniInfo) {
    this.sniInfo = sniInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginSniForCreateDomainConfigsInput originSniForCreateDomainConfigsInput = (OriginSniForCreateDomainConfigsInput) o;
    return Objects.equals(this.enable, originSniForCreateDomainConfigsInput.enable) &&
        Objects.equals(this.sniInfo, originSniForCreateDomainConfigsInput.sniInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, sniInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginSniForCreateDomainConfigsInput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    sniInfo: ").append(toIndentedString(sniInfo)).append("\n");
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
