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
import com.volcengine.volcobserve.model.MetaForListSilencePolicyOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MetaConditionForListSilencePolicyOutput
 */



public class MetaConditionForListSilencePolicyOutput {
  @SerializedName("Condition")
  private String condition = null;

  @SerializedName("Metas")
  private List<MetaForListSilencePolicyOutput> metas = null;

  public MetaConditionForListSilencePolicyOutput condition(String condition) {
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

  public MetaConditionForListSilencePolicyOutput metas(List<MetaForListSilencePolicyOutput> metas) {
    this.metas = metas;
    return this;
  }

  public MetaConditionForListSilencePolicyOutput addMetasItem(MetaForListSilencePolicyOutput metasItem) {
    if (this.metas == null) {
      this.metas = new ArrayList<MetaForListSilencePolicyOutput>();
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
  public List<MetaForListSilencePolicyOutput> getMetas() {
    return metas;
  }

  public void setMetas(List<MetaForListSilencePolicyOutput> metas) {
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
    MetaConditionForListSilencePolicyOutput metaConditionForListSilencePolicyOutput = (MetaConditionForListSilencePolicyOutput) o;
    return Objects.equals(this.condition, metaConditionForListSilencePolicyOutput.condition) &&
        Objects.equals(this.metas, metaConditionForListSilencePolicyOutput.metas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, metas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaConditionForListSilencePolicyOutput {\n");
    
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
