/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

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
 * EnableEventRuleRequest
 */



public class EnableEventRuleRequest {
  @SerializedName("RuleId")
  private List<String> ruleId = null;

  public EnableEventRuleRequest ruleId(List<String> ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public EnableEventRuleRequest addRuleIdItem(String ruleIdItem) {
    if (this.ruleId == null) {
      this.ruleId = new ArrayList<String>();
    }
    this.ruleId.add(ruleIdItem);
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @Schema(description = "")
  public List<String> getRuleId() {
    return ruleId;
  }

  public void setRuleId(List<String> ruleId) {
    this.ruleId = ruleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableEventRuleRequest enableEventRuleRequest = (EnableEventRuleRequest) o;
    return Objects.equals(this.ruleId, enableEventRuleRequest.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableEventRuleRequest {\n");
    
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
