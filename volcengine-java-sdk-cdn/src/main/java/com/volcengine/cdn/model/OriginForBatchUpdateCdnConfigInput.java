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
import com.volcengine.cdn.model.ConditionForBatchUpdateCdnConfigInput;
import com.volcengine.cdn.model.OriginActionForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OriginForBatchUpdateCdnConfigInput
 */



public class OriginForBatchUpdateCdnConfigInput {
  @SerializedName("Condition")
  private ConditionForBatchUpdateCdnConfigInput condition = null;

  @SerializedName("OriginAction")
  private OriginActionForBatchUpdateCdnConfigInput originAction = null;

  public OriginForBatchUpdateCdnConfigInput condition(ConditionForBatchUpdateCdnConfigInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForBatchUpdateCdnConfigInput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForBatchUpdateCdnConfigInput condition) {
    this.condition = condition;
  }

  public OriginForBatchUpdateCdnConfigInput originAction(OriginActionForBatchUpdateCdnConfigInput originAction) {
    this.originAction = originAction;
    return this;
  }

   /**
   * Get originAction
   * @return originAction
  **/
  @Valid
  @Schema(description = "")
  public OriginActionForBatchUpdateCdnConfigInput getOriginAction() {
    return originAction;
  }

  public void setOriginAction(OriginActionForBatchUpdateCdnConfigInput originAction) {
    this.originAction = originAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginForBatchUpdateCdnConfigInput originForBatchUpdateCdnConfigInput = (OriginForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.condition, originForBatchUpdateCdnConfigInput.condition) &&
        Objects.equals(this.originAction, originForBatchUpdateCdnConfigInput.originAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, originAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    originAction: ").append(toIndentedString(originAction)).append("\n");
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
