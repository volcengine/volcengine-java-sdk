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
import com.volcengine.cdn.model.ExpTimeCapRuleForAddCdnDomainInput;
import com.volcengine.cdn.model.SignCapRuleForAddCdnDomainInput;
import com.volcengine.cdn.model.SignParamForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UrlAuthCustomActionForAddCdnDomainInput
 */



public class UrlAuthCustomActionForAddCdnDomainInput {
  @SerializedName("ExpTimeCapRule")
  private ExpTimeCapRuleForAddCdnDomainInput expTimeCapRule = null;

  @SerializedName("ParamCalRules")
  private List<String> paramCalRules = null;

  @SerializedName("SignCapRule")
  private SignCapRuleForAddCdnDomainInput signCapRule = null;

  @SerializedName("SignJoinSymbol")
  private String signJoinSymbol = null;

  @SerializedName("SignParam")
  private List<SignParamForAddCdnDomainInput> signParam = null;

  public UrlAuthCustomActionForAddCdnDomainInput expTimeCapRule(ExpTimeCapRuleForAddCdnDomainInput expTimeCapRule) {
    this.expTimeCapRule = expTimeCapRule;
    return this;
  }

   /**
   * Get expTimeCapRule
   * @return expTimeCapRule
  **/
  @Valid
  @Schema(description = "")
  public ExpTimeCapRuleForAddCdnDomainInput getExpTimeCapRule() {
    return expTimeCapRule;
  }

  public void setExpTimeCapRule(ExpTimeCapRuleForAddCdnDomainInput expTimeCapRule) {
    this.expTimeCapRule = expTimeCapRule;
  }

  public UrlAuthCustomActionForAddCdnDomainInput paramCalRules(List<String> paramCalRules) {
    this.paramCalRules = paramCalRules;
    return this;
  }

  public UrlAuthCustomActionForAddCdnDomainInput addParamCalRulesItem(String paramCalRulesItem) {
    if (this.paramCalRules == null) {
      this.paramCalRules = new ArrayList<String>();
    }
    this.paramCalRules.add(paramCalRulesItem);
    return this;
  }

   /**
   * Get paramCalRules
   * @return paramCalRules
  **/
  @Schema(description = "")
  public List<String> getParamCalRules() {
    return paramCalRules;
  }

  public void setParamCalRules(List<String> paramCalRules) {
    this.paramCalRules = paramCalRules;
  }

  public UrlAuthCustomActionForAddCdnDomainInput signCapRule(SignCapRuleForAddCdnDomainInput signCapRule) {
    this.signCapRule = signCapRule;
    return this;
  }

   /**
   * Get signCapRule
   * @return signCapRule
  **/
  @Valid
  @Schema(description = "")
  public SignCapRuleForAddCdnDomainInput getSignCapRule() {
    return signCapRule;
  }

  public void setSignCapRule(SignCapRuleForAddCdnDomainInput signCapRule) {
    this.signCapRule = signCapRule;
  }

  public UrlAuthCustomActionForAddCdnDomainInput signJoinSymbol(String signJoinSymbol) {
    this.signJoinSymbol = signJoinSymbol;
    return this;
  }

   /**
   * Get signJoinSymbol
   * @return signJoinSymbol
  **/
  @Schema(description = "")
  public String getSignJoinSymbol() {
    return signJoinSymbol;
  }

  public void setSignJoinSymbol(String signJoinSymbol) {
    this.signJoinSymbol = signJoinSymbol;
  }

  public UrlAuthCustomActionForAddCdnDomainInput signParam(List<SignParamForAddCdnDomainInput> signParam) {
    this.signParam = signParam;
    return this;
  }

  public UrlAuthCustomActionForAddCdnDomainInput addSignParamItem(SignParamForAddCdnDomainInput signParamItem) {
    if (this.signParam == null) {
      this.signParam = new ArrayList<SignParamForAddCdnDomainInput>();
    }
    this.signParam.add(signParamItem);
    return this;
  }

   /**
   * Get signParam
   * @return signParam
  **/
  @Valid
  @Schema(description = "")
  public List<SignParamForAddCdnDomainInput> getSignParam() {
    return signParam;
  }

  public void setSignParam(List<SignParamForAddCdnDomainInput> signParam) {
    this.signParam = signParam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlAuthCustomActionForAddCdnDomainInput urlAuthCustomActionForAddCdnDomainInput = (UrlAuthCustomActionForAddCdnDomainInput) o;
    return Objects.equals(this.expTimeCapRule, urlAuthCustomActionForAddCdnDomainInput.expTimeCapRule) &&
        Objects.equals(this.paramCalRules, urlAuthCustomActionForAddCdnDomainInput.paramCalRules) &&
        Objects.equals(this.signCapRule, urlAuthCustomActionForAddCdnDomainInput.signCapRule) &&
        Objects.equals(this.signJoinSymbol, urlAuthCustomActionForAddCdnDomainInput.signJoinSymbol) &&
        Objects.equals(this.signParam, urlAuthCustomActionForAddCdnDomainInput.signParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expTimeCapRule, paramCalRules, signCapRule, signJoinSymbol, signParam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlAuthCustomActionForAddCdnDomainInput {\n");
    
    sb.append("    expTimeCapRule: ").append(toIndentedString(expTimeCapRule)).append("\n");
    sb.append("    paramCalRules: ").append(toIndentedString(paramCalRules)).append("\n");
    sb.append("    signCapRule: ").append(toIndentedString(signCapRule)).append("\n");
    sb.append("    signJoinSymbol: ").append(toIndentedString(signJoinSymbol)).append("\n");
    sb.append("    signParam: ").append(toIndentedString(signParam)).append("\n");
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
