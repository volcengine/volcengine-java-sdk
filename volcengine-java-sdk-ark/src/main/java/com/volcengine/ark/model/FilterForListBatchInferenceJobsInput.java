/*
 * ark
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ark.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ark.model.FoundationModelForListBatchInferenceJobsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListBatchInferenceJobsInput
 */



public class FilterForListBatchInferenceJobsInput {
  @SerializedName("CustomModelIds")
  private List<String> customModelIds = null;

  @SerializedName("FoundationModels")
  private List<FoundationModelForListBatchInferenceJobsInput> foundationModels = null;

  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Phases")
  private List<String> phases = null;

  public FilterForListBatchInferenceJobsInput customModelIds(List<String> customModelIds) {
    this.customModelIds = customModelIds;
    return this;
  }

  public FilterForListBatchInferenceJobsInput addCustomModelIdsItem(String customModelIdsItem) {
    if (this.customModelIds == null) {
      this.customModelIds = new ArrayList<String>();
    }
    this.customModelIds.add(customModelIdsItem);
    return this;
  }

   /**
   * Get customModelIds
   * @return customModelIds
  **/
  @Schema(description = "")
  public List<String> getCustomModelIds() {
    return customModelIds;
  }

  public void setCustomModelIds(List<String> customModelIds) {
    this.customModelIds = customModelIds;
  }

  public FilterForListBatchInferenceJobsInput foundationModels(List<FoundationModelForListBatchInferenceJobsInput> foundationModels) {
    this.foundationModels = foundationModels;
    return this;
  }

  public FilterForListBatchInferenceJobsInput addFoundationModelsItem(FoundationModelForListBatchInferenceJobsInput foundationModelsItem) {
    if (this.foundationModels == null) {
      this.foundationModels = new ArrayList<FoundationModelForListBatchInferenceJobsInput>();
    }
    this.foundationModels.add(foundationModelsItem);
    return this;
  }

   /**
   * Get foundationModels
   * @return foundationModels
  **/
  @Valid
  @Schema(description = "")
  public List<FoundationModelForListBatchInferenceJobsInput> getFoundationModels() {
    return foundationModels;
  }

  public void setFoundationModels(List<FoundationModelForListBatchInferenceJobsInput> foundationModels) {
    this.foundationModels = foundationModels;
  }

  public FilterForListBatchInferenceJobsInput ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FilterForListBatchInferenceJobsInput addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @Schema(description = "")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public FilterForListBatchInferenceJobsInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterForListBatchInferenceJobsInput phases(List<String> phases) {
    this.phases = phases;
    return this;
  }

  public FilterForListBatchInferenceJobsInput addPhasesItem(String phasesItem) {
    if (this.phases == null) {
      this.phases = new ArrayList<String>();
    }
    this.phases.add(phasesItem);
    return this;
  }

   /**
   * Get phases
   * @return phases
  **/
  @Schema(description = "")
  public List<String> getPhases() {
    return phases;
  }

  public void setPhases(List<String> phases) {
    this.phases = phases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListBatchInferenceJobsInput filterForListBatchInferenceJobsInput = (FilterForListBatchInferenceJobsInput) o;
    return Objects.equals(this.customModelIds, filterForListBatchInferenceJobsInput.customModelIds) &&
        Objects.equals(this.foundationModels, filterForListBatchInferenceJobsInput.foundationModels) &&
        Objects.equals(this.ids, filterForListBatchInferenceJobsInput.ids) &&
        Objects.equals(this.name, filterForListBatchInferenceJobsInput.name) &&
        Objects.equals(this.phases, filterForListBatchInferenceJobsInput.phases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customModelIds, foundationModels, ids, name, phases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListBatchInferenceJobsInput {\n");
    
    sb.append("    customModelIds: ").append(toIndentedString(customModelIds)).append("\n");
    sb.append("    foundationModels: ").append(toIndentedString(foundationModels)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
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
