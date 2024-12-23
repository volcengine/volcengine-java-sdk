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
import com.volcengine.dcdn.model.RuleForListDomainConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StatusCodeCacheRuleForListDomainConfigOutput
 */



public class StatusCodeCacheRuleForListDomainConfigOutput {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("Rules")
  private List<RuleForListDomainConfigOutput> rules = null;

  public StatusCodeCacheRuleForListDomainConfigOutput enable(Boolean enable) {
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

  public StatusCodeCacheRuleForListDomainConfigOutput rules(List<RuleForListDomainConfigOutput> rules) {
    this.rules = rules;
    return this;
  }

  public StatusCodeCacheRuleForListDomainConfigOutput addRulesItem(RuleForListDomainConfigOutput rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RuleForListDomainConfigOutput>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Valid
  @Schema(description = "")
  public List<RuleForListDomainConfigOutput> getRules() {
    return rules;
  }

  public void setRules(List<RuleForListDomainConfigOutput> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCodeCacheRuleForListDomainConfigOutput statusCodeCacheRuleForListDomainConfigOutput = (StatusCodeCacheRuleForListDomainConfigOutput) o;
    return Objects.equals(this.enable, statusCodeCacheRuleForListDomainConfigOutput.enable) &&
        Objects.equals(this.rules, statusCodeCacheRuleForListDomainConfigOutput.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCodeCacheRuleForListDomainConfigOutput {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
