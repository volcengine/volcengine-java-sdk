/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

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
 * ApplicationLayoutForCreateNodeGroupInput
 */



public class ApplicationLayoutForCreateNodeGroupInput {
  @SerializedName("ApplicationName")
  private String applicationName = null;

  @SerializedName("LayoutComponentNames")
  private List<String> layoutComponentNames = null;

  public ApplicationLayoutForCreateNodeGroupInput applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @Schema(description = "")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public ApplicationLayoutForCreateNodeGroupInput layoutComponentNames(List<String> layoutComponentNames) {
    this.layoutComponentNames = layoutComponentNames;
    return this;
  }

  public ApplicationLayoutForCreateNodeGroupInput addLayoutComponentNamesItem(String layoutComponentNamesItem) {
    if (this.layoutComponentNames == null) {
      this.layoutComponentNames = new ArrayList<String>();
    }
    this.layoutComponentNames.add(layoutComponentNamesItem);
    return this;
  }

   /**
   * Get layoutComponentNames
   * @return layoutComponentNames
  **/
  @Schema(description = "")
  public List<String> getLayoutComponentNames() {
    return layoutComponentNames;
  }

  public void setLayoutComponentNames(List<String> layoutComponentNames) {
    this.layoutComponentNames = layoutComponentNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationLayoutForCreateNodeGroupInput applicationLayoutForCreateNodeGroupInput = (ApplicationLayoutForCreateNodeGroupInput) o;
    return Objects.equals(this.applicationName, applicationLayoutForCreateNodeGroupInput.applicationName) &&
        Objects.equals(this.layoutComponentNames, applicationLayoutForCreateNodeGroupInput.layoutComponentNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, layoutComponentNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLayoutForCreateNodeGroupInput {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    layoutComponentNames: ").append(toIndentedString(layoutComponentNames)).append("\n");
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
