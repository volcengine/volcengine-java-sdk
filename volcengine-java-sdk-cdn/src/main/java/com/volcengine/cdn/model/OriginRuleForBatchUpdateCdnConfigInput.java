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
import com.volcengine.cdn.model.ActionsForBatchUpdateCdnConfigInput;
import com.volcengine.cdn.model.ConvertConvertConditionForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OriginRuleForBatchUpdateCdnConfigInput
 */



public class OriginRuleForBatchUpdateCdnConfigInput {
  @SerializedName("Actions")
  private ActionsForBatchUpdateCdnConfigInput actions = null;

  @SerializedName("Condition")
  private ConvertConvertConditionForBatchUpdateCdnConfigInput condition = null;

  public OriginRuleForBatchUpdateCdnConfigInput actions(ActionsForBatchUpdateCdnConfigInput actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Valid
  @Schema(description = "")
  public ActionsForBatchUpdateCdnConfigInput getActions() {
    return actions;
  }

  public void setActions(ActionsForBatchUpdateCdnConfigInput actions) {
    this.actions = actions;
  }

  public OriginRuleForBatchUpdateCdnConfigInput condition(ConvertConvertConditionForBatchUpdateCdnConfigInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConvertConvertConditionForBatchUpdateCdnConfigInput getCondition() {
    return condition;
  }

  public void setCondition(ConvertConvertConditionForBatchUpdateCdnConfigInput condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginRuleForBatchUpdateCdnConfigInput originRuleForBatchUpdateCdnConfigInput = (OriginRuleForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.actions, originRuleForBatchUpdateCdnConfigInput.actions) &&
        Objects.equals(this.condition, originRuleForBatchUpdateCdnConfigInput.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginRuleForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
