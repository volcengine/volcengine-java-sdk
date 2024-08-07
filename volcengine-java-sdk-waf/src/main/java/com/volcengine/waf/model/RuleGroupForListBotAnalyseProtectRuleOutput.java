/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.GroupForListBotAnalyseProtectRuleOutput;
import com.volcengine.waf.model.RuleForListBotAnalyseProtectRuleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RuleGroupForListBotAnalyseProtectRuleOutput
 */



public class RuleGroupForListBotAnalyseProtectRuleOutput {
  @SerializedName("Group")
  private GroupForListBotAnalyseProtectRuleOutput group = null;

  @SerializedName("Rules")
  private List<RuleForListBotAnalyseProtectRuleOutput> rules = null;

  public RuleGroupForListBotAnalyseProtectRuleOutput group(GroupForListBotAnalyseProtectRuleOutput group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Valid
  @Schema(description = "")
  public GroupForListBotAnalyseProtectRuleOutput getGroup() {
    return group;
  }

  public void setGroup(GroupForListBotAnalyseProtectRuleOutput group) {
    this.group = group;
  }

  public RuleGroupForListBotAnalyseProtectRuleOutput rules(List<RuleForListBotAnalyseProtectRuleOutput> rules) {
    this.rules = rules;
    return this;
  }

  public RuleGroupForListBotAnalyseProtectRuleOutput addRulesItem(RuleForListBotAnalyseProtectRuleOutput rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RuleForListBotAnalyseProtectRuleOutput>();
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
  public List<RuleForListBotAnalyseProtectRuleOutput> getRules() {
    return rules;
  }

  public void setRules(List<RuleForListBotAnalyseProtectRuleOutput> rules) {
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
    RuleGroupForListBotAnalyseProtectRuleOutput ruleGroupForListBotAnalyseProtectRuleOutput = (RuleGroupForListBotAnalyseProtectRuleOutput) o;
    return Objects.equals(this.group, ruleGroupForListBotAnalyseProtectRuleOutput.group) &&
        Objects.equals(this.rules, ruleGroupForListBotAnalyseProtectRuleOutput.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleGroupForListBotAnalyseProtectRuleOutput {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
