/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

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
 * StaticOptimizationForListDomainConfigOutput
 */



public class StaticOptimizationForListDomainConfigOutput {
  @SerializedName("H2Priority")
  private Boolean h2Priority = null;

  public StaticOptimizationForListDomainConfigOutput h2Priority(Boolean h2Priority) {
    this.h2Priority = h2Priority;
    return this;
  }

   /**
   * Get h2Priority
   * @return h2Priority
  **/
  @Schema(description = "")
  public Boolean isH2Priority() {
    return h2Priority;
  }

  public void setH2Priority(Boolean h2Priority) {
    this.h2Priority = h2Priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticOptimizationForListDomainConfigOutput staticOptimizationForListDomainConfigOutput = (StaticOptimizationForListDomainConfigOutput) o;
    return Objects.equals(this.h2Priority, staticOptimizationForListDomainConfigOutput.h2Priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(h2Priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticOptimizationForListDomainConfigOutput {\n");
    
    sb.append("    h2Priority: ").append(toIndentedString(h2Priority)).append("\n");
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
