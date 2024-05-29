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
import com.volcengine.cdn.model.BlockActionForDescribeCdnConfigOutput;
import com.volcengine.cdn.model.ConditionForDescribeCdnConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BlockRuleForDescribeCdnConfigOutput
 */



public class BlockRuleForDescribeCdnConfigOutput {
  @SerializedName("BlockAction")
  private BlockActionForDescribeCdnConfigOutput blockAction = null;

  @SerializedName("Condition")
  private ConditionForDescribeCdnConfigOutput condition = null;

  @SerializedName("RuleName")
  private String ruleName = null;

  public BlockRuleForDescribeCdnConfigOutput blockAction(BlockActionForDescribeCdnConfigOutput blockAction) {
    this.blockAction = blockAction;
    return this;
  }

   /**
   * Get blockAction
   * @return blockAction
  **/
  @Valid
  @Schema(description = "")
  public BlockActionForDescribeCdnConfigOutput getBlockAction() {
    return blockAction;
  }

  public void setBlockAction(BlockActionForDescribeCdnConfigOutput blockAction) {
    this.blockAction = blockAction;
  }

  public BlockRuleForDescribeCdnConfigOutput condition(ConditionForDescribeCdnConfigOutput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForDescribeCdnConfigOutput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForDescribeCdnConfigOutput condition) {
    this.condition = condition;
  }

  public BlockRuleForDescribeCdnConfigOutput ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @Schema(description = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockRuleForDescribeCdnConfigOutput blockRuleForDescribeCdnConfigOutput = (BlockRuleForDescribeCdnConfigOutput) o;
    return Objects.equals(this.blockAction, blockRuleForDescribeCdnConfigOutput.blockAction) &&
        Objects.equals(this.condition, blockRuleForDescribeCdnConfigOutput.condition) &&
        Objects.equals(this.ruleName, blockRuleForDescribeCdnConfigOutput.ruleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockAction, condition, ruleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockRuleForDescribeCdnConfigOutput {\n");
    
    sb.append("    blockAction: ").append(toIndentedString(blockAction)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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
