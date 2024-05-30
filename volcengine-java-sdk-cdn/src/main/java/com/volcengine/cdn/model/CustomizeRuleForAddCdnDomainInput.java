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
import com.volcengine.cdn.model.AccessActionForAddCdnDomainInput;
import com.volcengine.cdn.model.ConditionForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomizeRuleForAddCdnDomainInput
 */



public class CustomizeRuleForAddCdnDomainInput {
  @SerializedName("AccessAction")
  private AccessActionForAddCdnDomainInput accessAction = null;

  @SerializedName("Condition")
  private ConditionForAddCdnDomainInput condition = null;

  public CustomizeRuleForAddCdnDomainInput accessAction(AccessActionForAddCdnDomainInput accessAction) {
    this.accessAction = accessAction;
    return this;
  }

   /**
   * Get accessAction
   * @return accessAction
  **/
  @Valid
  @Schema(description = "")
  public AccessActionForAddCdnDomainInput getAccessAction() {
    return accessAction;
  }

  public void setAccessAction(AccessActionForAddCdnDomainInput accessAction) {
    this.accessAction = accessAction;
  }

  public CustomizeRuleForAddCdnDomainInput condition(ConditionForAddCdnDomainInput condition) {
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
    CustomizeRuleForAddCdnDomainInput customizeRuleForAddCdnDomainInput = (CustomizeRuleForAddCdnDomainInput) o;
    return Objects.equals(this.accessAction, customizeRuleForAddCdnDomainInput.accessAction) &&
        Objects.equals(this.condition, customizeRuleForAddCdnDomainInput.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessAction, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizeRuleForAddCdnDomainInput {\n");
    
    sb.append("    accessAction: ").append(toIndentedString(accessAction)).append("\n");
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
