/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.clb.model.RuleForModifyRulesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyRulesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:28.835190+08:00[Asia/Shanghai]")
public class ModifyRulesRequest {
  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("Rules")
  private List<RuleForModifyRulesInput> rules = null;

  public ModifyRulesRequest listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public ModifyRulesRequest rules(List<RuleForModifyRulesInput> rules) {
    this.rules = rules;
    return this;
  }

  public ModifyRulesRequest addRulesItem(RuleForModifyRulesInput rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RuleForModifyRulesInput>();
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
  public List<RuleForModifyRulesInput> getRules() {
    return rules;
  }

  public void setRules(List<RuleForModifyRulesInput> rules) {
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
    ModifyRulesRequest modifyRulesRequest = (ModifyRulesRequest) o;
    return Objects.equals(this.listenerId, modifyRulesRequest.listenerId) &&
        Objects.equals(this.rules, modifyRulesRequest.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenerId, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyRulesRequest {\n");
    
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
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
