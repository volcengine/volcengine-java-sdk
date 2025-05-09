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
import com.volcengine.volcobserve.model.TagForListRulesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TagConditionForListRulesOutput
 */



public class TagConditionForListRulesOutput {
  @SerializedName("Condition")
  private String condition = null;

  @SerializedName("Tags")
  private List<TagForListRulesOutput> tags = null;

  public TagConditionForListRulesOutput condition(String condition) {
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

  public TagConditionForListRulesOutput tags(List<TagForListRulesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public TagConditionForListRulesOutput addTagsItem(TagForListRulesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForListRulesOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForListRulesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForListRulesOutput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagConditionForListRulesOutput tagConditionForListRulesOutput = (TagConditionForListRulesOutput) o;
    return Objects.equals(this.condition, tagConditionForListRulesOutput.condition) &&
        Objects.equals(this.tags, tagConditionForListRulesOutput.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagConditionForListRulesOutput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
