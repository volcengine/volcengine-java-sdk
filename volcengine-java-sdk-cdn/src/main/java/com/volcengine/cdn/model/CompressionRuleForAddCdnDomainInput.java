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
import com.volcengine.cdn.model.CompressionActionForAddCdnDomainInput;
import com.volcengine.cdn.model.ConditionForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CompressionRuleForAddCdnDomainInput
 */



public class CompressionRuleForAddCdnDomainInput {
  @SerializedName("CompressionAction")
  private CompressionActionForAddCdnDomainInput compressionAction = null;

  @SerializedName("Condition")
  private ConditionForAddCdnDomainInput condition = null;

  public CompressionRuleForAddCdnDomainInput compressionAction(CompressionActionForAddCdnDomainInput compressionAction) {
    this.compressionAction = compressionAction;
    return this;
  }

   /**
   * Get compressionAction
   * @return compressionAction
  **/
  @Valid
  @Schema(description = "")
  public CompressionActionForAddCdnDomainInput getCompressionAction() {
    return compressionAction;
  }

  public void setCompressionAction(CompressionActionForAddCdnDomainInput compressionAction) {
    this.compressionAction = compressionAction;
  }

  public CompressionRuleForAddCdnDomainInput condition(ConditionForAddCdnDomainInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForAddCdnDomainInput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForAddCdnDomainInput condition) {
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
    CompressionRuleForAddCdnDomainInput compressionRuleForAddCdnDomainInput = (CompressionRuleForAddCdnDomainInput) o;
    return Objects.equals(this.compressionAction, compressionRuleForAddCdnDomainInput.compressionAction) &&
        Objects.equals(this.condition, compressionRuleForAddCdnDomainInput.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressionAction, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompressionRuleForAddCdnDomainInput {\n");
    
    sb.append("    compressionAction: ").append(toIndentedString(compressionAction)).append("\n");
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
