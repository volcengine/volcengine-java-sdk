/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vefaas.model.RuleForListFunctionElasticScaleStrategyOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ScaleStrategyForListFunctionElasticScaleStrategyOutput
 */



public class ScaleStrategyForListFunctionElasticScaleStrategyOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Rules")
  private List<RuleForListFunctionElasticScaleStrategyOutput> rules = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public ScaleStrategyForListFunctionElasticScaleStrategyOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ScaleStrategyForListFunctionElasticScaleStrategyOutput rules(List<RuleForListFunctionElasticScaleStrategyOutput> rules) {
    this.rules = rules;
    return this;
  }

  public ScaleStrategyForListFunctionElasticScaleStrategyOutput addRulesItem(RuleForListFunctionElasticScaleStrategyOutput rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RuleForListFunctionElasticScaleStrategyOutput>();
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
  public List<RuleForListFunctionElasticScaleStrategyOutput> getRules() {
    return rules;
  }

  public void setRules(List<RuleForListFunctionElasticScaleStrategyOutput> rules) {
    this.rules = rules;
  }

  public ScaleStrategyForListFunctionElasticScaleStrategyOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ScaleStrategyForListFunctionElasticScaleStrategyOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaleStrategyForListFunctionElasticScaleStrategyOutput scaleStrategyForListFunctionElasticScaleStrategyOutput = (ScaleStrategyForListFunctionElasticScaleStrategyOutput) o;
    return Objects.equals(this.createTime, scaleStrategyForListFunctionElasticScaleStrategyOutput.createTime) &&
        Objects.equals(this.rules, scaleStrategyForListFunctionElasticScaleStrategyOutput.rules) &&
        Objects.equals(this.type, scaleStrategyForListFunctionElasticScaleStrategyOutput.type) &&
        Objects.equals(this.updateTime, scaleStrategyForListFunctionElasticScaleStrategyOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, rules, type, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleStrategyForListFunctionElasticScaleStrategyOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
