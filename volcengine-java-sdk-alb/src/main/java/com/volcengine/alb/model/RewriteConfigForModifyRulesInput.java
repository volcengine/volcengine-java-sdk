/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RewriteConfigForModifyRulesInput
 */


public class RewriteConfigForModifyRulesInput {
  @SerializedName("RewritePath")
  private String rewritePath = null;

  public RewriteConfigForModifyRulesInput rewritePath(String rewritePath) {
    this.rewritePath = rewritePath;
    return this;
  }

   /**
   * Get rewritePath
   * @return rewritePath
  **/
  @Schema(description = "")
  public String getRewritePath() {
    return rewritePath;
  }

  public void setRewritePath(String rewritePath) {
    this.rewritePath = rewritePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewriteConfigForModifyRulesInput rewriteConfigForModifyRulesInput = (RewriteConfigForModifyRulesInput) o;
    return Objects.equals(this.rewritePath, rewriteConfigForModifyRulesInput.rewritePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewritePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewriteConfigForModifyRulesInput {\n");
    
    sb.append("    rewritePath: ").append(toIndentedString(rewritePath)).append("\n");
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
