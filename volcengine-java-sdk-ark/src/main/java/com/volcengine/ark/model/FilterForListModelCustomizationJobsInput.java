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
import com.volcengine.ark.model.FoundationModelForListModelCustomizationJobsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListModelCustomizationJobsInput
 */



public class FilterForListModelCustomizationJobsInput {
  @SerializedName("CreateTimeAfter")
  private String createTimeAfter = null;

  @SerializedName("CreateTimeBefore")
  private String createTimeBefore = null;

  @SerializedName("CustomModelIds")
  private List<String> customModelIds = null;

  @SerializedName("CustomizationTypes")
  private List<String> customizationTypes = null;

  @SerializedName("FoundationModels")
  private List<FoundationModelForListModelCustomizationJobsInput> foundationModels = null;

  @SerializedName("Ids")
  private List<String> ids = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Phases")
  private List<String> phases = null;

  public FilterForListModelCustomizationJobsInput createTimeAfter(String createTimeAfter) {
    this.createTimeAfter = createTimeAfter;
    return this;
  }

   /**
   * Get createTimeAfter
   * @return createTimeAfter
  **/
  @Schema(description = "")
  public String getCreateTimeAfter() {
    return createTimeAfter;
  }

  public void setCreateTimeAfter(String createTimeAfter) {
    this.createTimeAfter = createTimeAfter;
  }

  public FilterForListModelCustomizationJobsInput createTimeBefore(String createTimeBefore) {
    this.createTimeBefore = createTimeBefore;
    return this;
  }

   /**
   * Get createTimeBefore
   * @return createTimeBefore
  **/
  @Schema(description = "")
  public String getCreateTimeBefore() {
    return createTimeBefore;
  }

  public void setCreateTimeBefore(String createTimeBefore) {
    this.createTimeBefore = createTimeBefore;
  }

  public FilterForListModelCustomizationJobsInput customModelIds(List<String> customModelIds) {
    this.customModelIds = customModelIds;
    return this;
  }

  public FilterForListModelCustomizationJobsInput addCustomModelIdsItem(String customModelIdsItem) {
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

  public FilterForListModelCustomizationJobsInput customizationTypes(List<String> customizationTypes) {
    this.customizationTypes = customizationTypes;
    return this;
  }

  public FilterForListModelCustomizationJobsInput addCustomizationTypesItem(String customizationTypesItem) {
    if (this.customizationTypes == null) {
      this.customizationTypes = new ArrayList<String>();
    }
    this.customizationTypes.add(customizationTypesItem);
    return this;
  }

   /**
   * Get customizationTypes
   * @return customizationTypes
  **/
  @Schema(description = "")
  public List<String> getCustomizationTypes() {
    return customizationTypes;
  }

  public void setCustomizationTypes(List<String> customizationTypes) {
    this.customizationTypes = customizationTypes;
  }

  public FilterForListModelCustomizationJobsInput foundationModels(List<FoundationModelForListModelCustomizationJobsInput> foundationModels) {
    this.foundationModels = foundationModels;
    return this;
  }

  public FilterForListModelCustomizationJobsInput addFoundationModelsItem(FoundationModelForListModelCustomizationJobsInput foundationModelsItem) {
    if (this.foundationModels == null) {
      this.foundationModels = new ArrayList<FoundationModelForListModelCustomizationJobsInput>();
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
  public List<FoundationModelForListModelCustomizationJobsInput> getFoundationModels() {
    return foundationModels;
  }

  public void setFoundationModels(List<FoundationModelForListModelCustomizationJobsInput> foundationModels) {
    this.foundationModels = foundationModels;
  }

  public FilterForListModelCustomizationJobsInput ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FilterForListModelCustomizationJobsInput addIdsItem(String idsItem) {
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

  public FilterForListModelCustomizationJobsInput name(String name) {
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

  public FilterForListModelCustomizationJobsInput phases(List<String> phases) {
    this.phases = phases;
    return this;
  }

  public FilterForListModelCustomizationJobsInput addPhasesItem(String phasesItem) {
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
    FilterForListModelCustomizationJobsInput filterForListModelCustomizationJobsInput = (FilterForListModelCustomizationJobsInput) o;
    return Objects.equals(this.createTimeAfter, filterForListModelCustomizationJobsInput.createTimeAfter) &&
        Objects.equals(this.createTimeBefore, filterForListModelCustomizationJobsInput.createTimeBefore) &&
        Objects.equals(this.customModelIds, filterForListModelCustomizationJobsInput.customModelIds) &&
        Objects.equals(this.customizationTypes, filterForListModelCustomizationJobsInput.customizationTypes) &&
        Objects.equals(this.foundationModels, filterForListModelCustomizationJobsInput.foundationModels) &&
        Objects.equals(this.ids, filterForListModelCustomizationJobsInput.ids) &&
        Objects.equals(this.name, filterForListModelCustomizationJobsInput.name) &&
        Objects.equals(this.phases, filterForListModelCustomizationJobsInput.phases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTimeAfter, createTimeBefore, customModelIds, customizationTypes, foundationModels, ids, name, phases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListModelCustomizationJobsInput {\n");
    
    sb.append("    createTimeAfter: ").append(toIndentedString(createTimeAfter)).append("\n");
    sb.append("    createTimeBefore: ").append(toIndentedString(createTimeBefore)).append("\n");
    sb.append("    customModelIds: ").append(toIndentedString(customModelIds)).append("\n");
    sb.append("    customizationTypes: ").append(toIndentedString(customizationTypes)).append("\n");
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
