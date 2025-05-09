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
import com.volcengine.cdn.model.CommonTypeForAddSharedConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AllowRefererAccessRuleForAddSharedConfigInput
 */



public class AllowRefererAccessRuleForAddSharedConfigInput {
  @SerializedName("AllowEmpty")
  private Boolean allowEmpty = null;

  @SerializedName("CommonType")
  private CommonTypeForAddSharedConfigInput commonType = null;

  public AllowRefererAccessRuleForAddSharedConfigInput allowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @Schema(description = "")
  public Boolean isAllowEmpty() {
    return allowEmpty;
  }

  public void setAllowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  public AllowRefererAccessRuleForAddSharedConfigInput commonType(CommonTypeForAddSharedConfigInput commonType) {
    this.commonType = commonType;
    return this;
  }

   /**
   * Get commonType
   * @return commonType
  **/
  @Valid
  @Schema(description = "")
  public CommonTypeForAddSharedConfigInput getCommonType() {
    return commonType;
  }

  public void setCommonType(CommonTypeForAddSharedConfigInput commonType) {
    this.commonType = commonType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowRefererAccessRuleForAddSharedConfigInput allowRefererAccessRuleForAddSharedConfigInput = (AllowRefererAccessRuleForAddSharedConfigInput) o;
    return Objects.equals(this.allowEmpty, allowRefererAccessRuleForAddSharedConfigInput.allowEmpty) &&
        Objects.equals(this.commonType, allowRefererAccessRuleForAddSharedConfigInput.commonType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, commonType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowRefererAccessRuleForAddSharedConfigInput {\n");
    
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    commonType: ").append(toIndentedString(commonType)).append("\n");
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
