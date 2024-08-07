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
import com.volcengine.cdn.model.CacheHostActionForUpdateCdnConfigInput;
import com.volcengine.cdn.model.ConditionForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CacheHostRuleForUpdateCdnConfigInput
 */



public class CacheHostRuleForUpdateCdnConfigInput {
  @SerializedName("CacheHostAction")
  private CacheHostActionForUpdateCdnConfigInput cacheHostAction = null;

  @SerializedName("Condition")
  private ConditionForUpdateCdnConfigInput condition = null;

  public CacheHostRuleForUpdateCdnConfigInput cacheHostAction(CacheHostActionForUpdateCdnConfigInput cacheHostAction) {
    this.cacheHostAction = cacheHostAction;
    return this;
  }

   /**
   * Get cacheHostAction
   * @return cacheHostAction
  **/
  @Valid
  @Schema(description = "")
  public CacheHostActionForUpdateCdnConfigInput getCacheHostAction() {
    return cacheHostAction;
  }

  public void setCacheHostAction(CacheHostActionForUpdateCdnConfigInput cacheHostAction) {
    this.cacheHostAction = cacheHostAction;
  }

  public CacheHostRuleForUpdateCdnConfigInput condition(ConditionForUpdateCdnConfigInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForUpdateCdnConfigInput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForUpdateCdnConfigInput condition) {
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
    CacheHostRuleForUpdateCdnConfigInput cacheHostRuleForUpdateCdnConfigInput = (CacheHostRuleForUpdateCdnConfigInput) o;
    return Objects.equals(this.cacheHostAction, cacheHostRuleForUpdateCdnConfigInput.cacheHostAction) &&
        Objects.equals(this.condition, cacheHostRuleForUpdateCdnConfigInput.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheHostAction, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheHostRuleForUpdateCdnConfigInput {\n");
    
    sb.append("    cacheHostAction: ").append(toIndentedString(cacheHostAction)).append("\n");
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
