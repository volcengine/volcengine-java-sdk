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
import com.volcengine.cdn.model.ConditionForAddCdnDomainInput;
import com.volcengine.cdn.model.OriginActionForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OriginForAddCdnDomainInput
 */



public class OriginForAddCdnDomainInput {
  @SerializedName("Condition")
  private ConditionForAddCdnDomainInput condition = null;

  @SerializedName("OriginAction")
  private OriginActionForAddCdnDomainInput originAction = null;

  public OriginForAddCdnDomainInput condition(ConditionForAddCdnDomainInput condition) {
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

  public OriginForAddCdnDomainInput originAction(OriginActionForAddCdnDomainInput originAction) {
    this.originAction = originAction;
    return this;
  }

   /**
   * Get originAction
   * @return originAction
  **/
  @Valid
  @Schema(description = "")
  public OriginActionForAddCdnDomainInput getOriginAction() {
    return originAction;
  }

  public void setOriginAction(OriginActionForAddCdnDomainInput originAction) {
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
    OriginForAddCdnDomainInput originForAddCdnDomainInput = (OriginForAddCdnDomainInput) o;
    return Objects.equals(this.condition, originForAddCdnDomainInput.condition) &&
        Objects.equals(this.originAction, originForAddCdnDomainInput.originAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, originAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginForAddCdnDomainInput {\n");
    
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
