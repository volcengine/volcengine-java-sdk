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
import com.volcengine.volcobserve.model.ConditionForListRulesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LevelConditionForListRulesOutput
 */



public class LevelConditionForListRulesOutput {
  @SerializedName("Conditions")
  private List<ConditionForListRulesOutput> conditions = null;

  @SerializedName("Level")
  private String level = null;

  public LevelConditionForListRulesOutput conditions(List<ConditionForListRulesOutput> conditions) {
    this.conditions = conditions;
    return this;
  }

  public LevelConditionForListRulesOutput addConditionsItem(ConditionForListRulesOutput conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<ConditionForListRulesOutput>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Valid
  @Schema(description = "")
  public List<ConditionForListRulesOutput> getConditions() {
    return conditions;
  }

  public void setConditions(List<ConditionForListRulesOutput> conditions) {
    this.conditions = conditions;
  }

  public LevelConditionForListRulesOutput level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LevelConditionForListRulesOutput levelConditionForListRulesOutput = (LevelConditionForListRulesOutput) o;
    return Objects.equals(this.conditions, levelConditionForListRulesOutput.conditions) &&
        Objects.equals(this.level, levelConditionForListRulesOutput.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LevelConditionForListRulesOutput {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
