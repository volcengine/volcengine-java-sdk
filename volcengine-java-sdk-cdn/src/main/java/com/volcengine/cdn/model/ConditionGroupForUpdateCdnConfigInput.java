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
import com.volcengine.cdn.model.ConvertConditionForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConditionGroupForUpdateCdnConfigInput
 */



public class ConditionGroupForUpdateCdnConfigInput {
  @SerializedName("Condition")
  private ConvertConditionForUpdateCdnConfigInput condition = null;

  @SerializedName("IsGroup")
  private Boolean isGroup = null;

  public ConditionGroupForUpdateCdnConfigInput condition(ConvertConditionForUpdateCdnConfigInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConvertConditionForUpdateCdnConfigInput getCondition() {
    return condition;
  }

  public void setCondition(ConvertConditionForUpdateCdnConfigInput condition) {
    this.condition = condition;
  }

  public ConditionGroupForUpdateCdnConfigInput isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

   /**
   * Get isGroup
   * @return isGroup
  **/
  @Schema(description = "")
  public Boolean isIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionGroupForUpdateCdnConfigInput conditionGroupForUpdateCdnConfigInput = (ConditionGroupForUpdateCdnConfigInput) o;
    return Objects.equals(this.condition, conditionGroupForUpdateCdnConfigInput.condition) &&
        Objects.equals(this.isGroup, conditionGroupForUpdateCdnConfigInput.isGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, isGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionGroupForUpdateCdnConfigInput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
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
