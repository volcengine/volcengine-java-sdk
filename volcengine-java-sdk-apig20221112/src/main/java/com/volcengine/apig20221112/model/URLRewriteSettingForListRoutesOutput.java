/*
 * apig20221112
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.apig20221112.model;

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
 * URLRewriteSettingForListRoutesOutput
 */



public class URLRewriteSettingForListRoutesOutput {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("URLRewrite")
  private String urLRewrite = null;

  public URLRewriteSettingForListRoutesOutput enable(Boolean enable) {
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

  public URLRewriteSettingForListRoutesOutput urLRewrite(String urLRewrite) {
    this.urLRewrite = urLRewrite;
    return this;
  }

   /**
   * Get urLRewrite
   * @return urLRewrite
  **/
  @Schema(description = "")
  public String getUrLRewrite() {
    return urLRewrite;
  }

  public void setUrLRewrite(String urLRewrite) {
    this.urLRewrite = urLRewrite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URLRewriteSettingForListRoutesOutput urLRewriteSettingForListRoutesOutput = (URLRewriteSettingForListRoutesOutput) o;
    return Objects.equals(this.enable, urLRewriteSettingForListRoutesOutput.enable) &&
        Objects.equals(this.urLRewrite, urLRewriteSettingForListRoutesOutput.urLRewrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, urLRewrite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URLRewriteSettingForListRoutesOutput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    urLRewrite: ").append(toIndentedString(urLRewrite)).append("\n");
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
