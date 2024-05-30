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
import com.volcengine.cdn.model.RedirectionActionForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RedirectionRuleForUpdateCdnConfigInput
 */



public class RedirectionRuleForUpdateCdnConfigInput {
  @SerializedName("RedirectionAction")
  private RedirectionActionForUpdateCdnConfigInput redirectionAction = null;

  public RedirectionRuleForUpdateCdnConfigInput redirectionAction(RedirectionActionForUpdateCdnConfigInput redirectionAction) {
    this.redirectionAction = redirectionAction;
    return this;
  }

   /**
   * Get redirectionAction
   * @return redirectionAction
  **/
  @Valid
  @Schema(description = "")
  public RedirectionActionForUpdateCdnConfigInput getRedirectionAction() {
    return redirectionAction;
  }

  public void setRedirectionAction(RedirectionActionForUpdateCdnConfigInput redirectionAction) {
    this.redirectionAction = redirectionAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectionRuleForUpdateCdnConfigInput redirectionRuleForUpdateCdnConfigInput = (RedirectionRuleForUpdateCdnConfigInput) o;
    return Objects.equals(this.redirectionAction, redirectionRuleForUpdateCdnConfigInput.redirectionAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectionAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectionRuleForUpdateCdnConfigInput {\n");
    
    sb.append("    redirectionAction: ").append(toIndentedString(redirectionAction)).append("\n");
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
