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
import com.volcengine.volcobserve.model.MetaConditionForListRulesOutput;
import com.volcengine.volcobserve.model.ProjectConditionForListRulesOutput;
import com.volcengine.volcobserve.model.TagConditionForListRulesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DimensionConditionsForListRulesOutput
 */



public class DimensionConditionsForListRulesOutput {
  @SerializedName("MetaCondition")
  private MetaConditionForListRulesOutput metaCondition = null;

  @SerializedName("ProjectCondition")
  private ProjectConditionForListRulesOutput projectCondition = null;

  @SerializedName("TagCondition")
  private TagConditionForListRulesOutput tagCondition = null;

  @SerializedName("Type")
  private String type = null;

  public DimensionConditionsForListRulesOutput metaCondition(MetaConditionForListRulesOutput metaCondition) {
    this.metaCondition = metaCondition;
    return this;
  }

   /**
   * Get metaCondition
   * @return metaCondition
  **/
  @Valid
  @Schema(description = "")
  public MetaConditionForListRulesOutput getMetaCondition() {
    return metaCondition;
  }

  public void setMetaCondition(MetaConditionForListRulesOutput metaCondition) {
    this.metaCondition = metaCondition;
  }

  public DimensionConditionsForListRulesOutput projectCondition(ProjectConditionForListRulesOutput projectCondition) {
    this.projectCondition = projectCondition;
    return this;
  }

   /**
   * Get projectCondition
   * @return projectCondition
  **/
  @Valid
  @Schema(description = "")
  public ProjectConditionForListRulesOutput getProjectCondition() {
    return projectCondition;
  }

  public void setProjectCondition(ProjectConditionForListRulesOutput projectCondition) {
    this.projectCondition = projectCondition;
  }

  public DimensionConditionsForListRulesOutput tagCondition(TagConditionForListRulesOutput tagCondition) {
    this.tagCondition = tagCondition;
    return this;
  }

   /**
   * Get tagCondition
   * @return tagCondition
  **/
  @Valid
  @Schema(description = "")
  public TagConditionForListRulesOutput getTagCondition() {
    return tagCondition;
  }

  public void setTagCondition(TagConditionForListRulesOutput tagCondition) {
    this.tagCondition = tagCondition;
  }

  public DimensionConditionsForListRulesOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionConditionsForListRulesOutput dimensionConditionsForListRulesOutput = (DimensionConditionsForListRulesOutput) o;
    return Objects.equals(this.metaCondition, dimensionConditionsForListRulesOutput.metaCondition) &&
        Objects.equals(this.projectCondition, dimensionConditionsForListRulesOutput.projectCondition) &&
        Objects.equals(this.tagCondition, dimensionConditionsForListRulesOutput.tagCondition) &&
        Objects.equals(this.type, dimensionConditionsForListRulesOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaCondition, projectCondition, tagCondition, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DimensionConditionsForListRulesOutput {\n");
    
    sb.append("    metaCondition: ").append(toIndentedString(metaCondition)).append("\n");
    sb.append("    projectCondition: ").append(toIndentedString(projectCondition)).append("\n");
    sb.append("    tagCondition: ").append(toIndentedString(tagCondition)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
