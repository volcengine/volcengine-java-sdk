/*
 * volc_observe
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcobserve.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcobserve.model.MetaForCreateRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MetaConditionForCreateRuleInput
 */



public class MetaConditionForCreateRuleInput {
  @SerializedName("AllDimensions")
  private Boolean allDimensions = null;

  @SerializedName("Condition")
  private String condition = null;

  @SerializedName("Metas")
  private List<MetaForCreateRuleInput> metas = null;

  public MetaConditionForCreateRuleInput allDimensions(Boolean allDimensions) {
    this.allDimensions = allDimensions;
    return this;
  }

   /**
   * Get allDimensions
   * @return allDimensions
  **/
  @Schema(description = "")
  public Boolean isAllDimensions() {
    return allDimensions;
  }

  public void setAllDimensions(Boolean allDimensions) {
    this.allDimensions = allDimensions;
  }

  public MetaConditionForCreateRuleInput condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Schema(description = "")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public MetaConditionForCreateRuleInput metas(List<MetaForCreateRuleInput> metas) {
    this.metas = metas;
    return this;
  }

  public MetaConditionForCreateRuleInput addMetasItem(MetaForCreateRuleInput metasItem) {
    if (this.metas == null) {
      this.metas = new ArrayList<MetaForCreateRuleInput>();
    }
    this.metas.add(metasItem);
    return this;
  }

   /**
   * Get metas
   * @return metas
  **/
  @Valid
  @Schema(description = "")
  public List<MetaForCreateRuleInput> getMetas() {
    return metas;
  }

  public void setMetas(List<MetaForCreateRuleInput> metas) {
    this.metas = metas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaConditionForCreateRuleInput metaConditionForCreateRuleInput = (MetaConditionForCreateRuleInput) o;
    return Objects.equals(this.allDimensions, metaConditionForCreateRuleInput.allDimensions) &&
        Objects.equals(this.condition, metaConditionForCreateRuleInput.condition) &&
        Objects.equals(this.metas, metaConditionForCreateRuleInput.metas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDimensions, condition, metas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaConditionForCreateRuleInput {\n");
    
    sb.append("    allDimensions: ").append(toIndentedString(allDimensions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    metas: ").append(toIndentedString(metas)).append("\n");
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
