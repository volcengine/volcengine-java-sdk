/*
 * vmp
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vmp.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vmp.model.LevelForListNotifyGroupPoliciesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListNotifyGroupPoliciesOutput
 */



public class ItemForListNotifyGroupPoliciesOutput {
  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Levels")
  private List<LevelForListNotifyGroupPoliciesOutput> levels = null;

  @SerializedName("Name")
  private String name = null;

  public ItemForListNotifyGroupPoliciesOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ItemForListNotifyGroupPoliciesOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemForListNotifyGroupPoliciesOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemForListNotifyGroupPoliciesOutput levels(List<LevelForListNotifyGroupPoliciesOutput> levels) {
    this.levels = levels;
    return this;
  }

  public ItemForListNotifyGroupPoliciesOutput addLevelsItem(LevelForListNotifyGroupPoliciesOutput levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<LevelForListNotifyGroupPoliciesOutput>();
    }
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * Get levels
   * @return levels
  **/
  @Valid
  @Schema(description = "")
  public List<LevelForListNotifyGroupPoliciesOutput> getLevels() {
    return levels;
  }

  public void setLevels(List<LevelForListNotifyGroupPoliciesOutput> levels) {
    this.levels = levels;
  }

  public ItemForListNotifyGroupPoliciesOutput name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListNotifyGroupPoliciesOutput itemForListNotifyGroupPoliciesOutput = (ItemForListNotifyGroupPoliciesOutput) o;
    return Objects.equals(this.createTime, itemForListNotifyGroupPoliciesOutput.createTime) &&
        Objects.equals(this.description, itemForListNotifyGroupPoliciesOutput.description) &&
        Objects.equals(this.id, itemForListNotifyGroupPoliciesOutput.id) &&
        Objects.equals(this.levels, itemForListNotifyGroupPoliciesOutput.levels) &&
        Objects.equals(this.name, itemForListNotifyGroupPoliciesOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, description, id, levels, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListNotifyGroupPoliciesOutput {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
