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
import com.volcengine.cdn.model.ErrorPageRuleForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomErrorPageForAddCdnDomainInput
 */



public class CustomErrorPageForAddCdnDomainInput {
  @SerializedName("ErrorPageRule")
  private List<ErrorPageRuleForAddCdnDomainInput> errorPageRule = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  public CustomErrorPageForAddCdnDomainInput errorPageRule(List<ErrorPageRuleForAddCdnDomainInput> errorPageRule) {
    this.errorPageRule = errorPageRule;
    return this;
  }

  public CustomErrorPageForAddCdnDomainInput addErrorPageRuleItem(ErrorPageRuleForAddCdnDomainInput errorPageRuleItem) {
    if (this.errorPageRule == null) {
      this.errorPageRule = new ArrayList<ErrorPageRuleForAddCdnDomainInput>();
    }
    this.errorPageRule.add(errorPageRuleItem);
    return this;
  }

   /**
   * Get errorPageRule
   * @return errorPageRule
  **/
  @Valid
  @Schema(description = "")
  public List<ErrorPageRuleForAddCdnDomainInput> getErrorPageRule() {
    return errorPageRule;
  }

  public void setErrorPageRule(List<ErrorPageRuleForAddCdnDomainInput> errorPageRule) {
    this.errorPageRule = errorPageRule;
  }

  public CustomErrorPageForAddCdnDomainInput _switch(Boolean _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public Boolean isSwitch() {
    return _switch;
  }

  public void setSwitch(Boolean _switch) {
    this._switch = _switch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomErrorPageForAddCdnDomainInput customErrorPageForAddCdnDomainInput = (CustomErrorPageForAddCdnDomainInput) o;
    return Objects.equals(this.errorPageRule, customErrorPageForAddCdnDomainInput.errorPageRule) &&
        Objects.equals(this._switch, customErrorPageForAddCdnDomainInput._switch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorPageRule, _switch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomErrorPageForAddCdnDomainInput {\n");
    
    sb.append("    errorPageRule: ").append(toIndentedString(errorPageRule)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
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
