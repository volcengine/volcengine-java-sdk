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
import com.volcengine.cdn.model.ConditionForDescribeCdnConfigOutput;
import com.volcengine.cdn.model.OriginArgActionForDescribeCdnConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OriginArgForDescribeCdnConfigOutput
 */



public class OriginArgForDescribeCdnConfigOutput {
  @SerializedName("Condition")
  private ConditionForDescribeCdnConfigOutput condition = null;

  @SerializedName("OriginArgAction")
  private OriginArgActionForDescribeCdnConfigOutput originArgAction = null;

  public OriginArgForDescribeCdnConfigOutput condition(ConditionForDescribeCdnConfigOutput condition) {
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

  public OriginArgForDescribeCdnConfigOutput originArgAction(OriginArgActionForDescribeCdnConfigOutput originArgAction) {
    this.originArgAction = originArgAction;
    return this;
  }

   /**
   * Get originArgAction
   * @return originArgAction
  **/
  @Valid
  @Schema(description = "")
  public OriginArgActionForDescribeCdnConfigOutput getOriginArgAction() {
    return originArgAction;
  }

  public void setOriginArgAction(OriginArgActionForDescribeCdnConfigOutput originArgAction) {
    this.originArgAction = originArgAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginArgForDescribeCdnConfigOutput originArgForDescribeCdnConfigOutput = (OriginArgForDescribeCdnConfigOutput) o;
    return Objects.equals(this.condition, originArgForDescribeCdnConfigOutput.condition) &&
        Objects.equals(this.originArgAction, originArgForDescribeCdnConfigOutput.originArgAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, originArgAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginArgForDescribeCdnConfigOutput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    originArgAction: ").append(toIndentedString(originArgAction)).append("\n");
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
