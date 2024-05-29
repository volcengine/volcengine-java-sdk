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
import com.volcengine.cdn.model.ConditionForUpdateCdnConfigInput;
import com.volcengine.cdn.model.RemoteAuthRuleActionForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RemoteAuthRuleForUpdateCdnConfigInput
 */



public class RemoteAuthRuleForUpdateCdnConfigInput {
  @SerializedName("Condition")
  private ConditionForUpdateCdnConfigInput condition = null;

  @SerializedName("RemoteAuthRuleAction")
  private RemoteAuthRuleActionForUpdateCdnConfigInput remoteAuthRuleAction = null;

  public RemoteAuthRuleForUpdateCdnConfigInput condition(ConditionForUpdateCdnConfigInput condition) {
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

  public RemoteAuthRuleForUpdateCdnConfigInput remoteAuthRuleAction(RemoteAuthRuleActionForUpdateCdnConfigInput remoteAuthRuleAction) {
    this.remoteAuthRuleAction = remoteAuthRuleAction;
    return this;
  }

   /**
   * Get remoteAuthRuleAction
   * @return remoteAuthRuleAction
  **/
  @Valid
  @Schema(description = "")
  public RemoteAuthRuleActionForUpdateCdnConfigInput getRemoteAuthRuleAction() {
    return remoteAuthRuleAction;
  }

  public void setRemoteAuthRuleAction(RemoteAuthRuleActionForUpdateCdnConfigInput remoteAuthRuleAction) {
    this.remoteAuthRuleAction = remoteAuthRuleAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteAuthRuleForUpdateCdnConfigInput remoteAuthRuleForUpdateCdnConfigInput = (RemoteAuthRuleForUpdateCdnConfigInput) o;
    return Objects.equals(this.condition, remoteAuthRuleForUpdateCdnConfigInput.condition) &&
        Objects.equals(this.remoteAuthRuleAction, remoteAuthRuleForUpdateCdnConfigInput.remoteAuthRuleAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, remoteAuthRuleAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteAuthRuleForUpdateCdnConfigInput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    remoteAuthRuleAction: ").append(toIndentedString(remoteAuthRuleAction)).append("\n");
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
