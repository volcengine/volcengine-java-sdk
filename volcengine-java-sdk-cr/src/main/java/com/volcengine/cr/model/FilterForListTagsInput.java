/*
 * cr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cr.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterForListTagsInput
 */



public class FilterForListTagsInput {
  @SerializedName("Names")
  private List<String> names = null;

  @SerializedName("Types")
  private List<String> types = null;

  public FilterForListTagsInput names(List<String> names) {
    this.names = names;
    return this;
  }

  public FilterForListTagsInput addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @Schema(description = "")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public FilterForListTagsInput types(List<String> types) {
    this.types = types;
    return this;
  }

  public FilterForListTagsInput addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @Schema(description = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterForListTagsInput filterForListTagsInput = (FilterForListTagsInput) o;
    return Objects.equals(this.names, filterForListTagsInput.names) &&
        Objects.equals(this.types, filterForListTagsInput.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterForListTagsInput {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
