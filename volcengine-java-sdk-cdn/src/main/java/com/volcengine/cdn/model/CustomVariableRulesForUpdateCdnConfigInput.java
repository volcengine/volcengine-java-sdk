/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.CustomVariableInstanceForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomVariableRulesForUpdateCdnConfigInput
 */



public class CustomVariableRulesForUpdateCdnConfigInput {
  @SerializedName("CustomVariableInstances")
  private List<CustomVariableInstanceForUpdateCdnConfigInput> customVariableInstances = null;

  public CustomVariableRulesForUpdateCdnConfigInput customVariableInstances(List<CustomVariableInstanceForUpdateCdnConfigInput> customVariableInstances) {
    this.customVariableInstances = customVariableInstances;
    return this;
  }

  public CustomVariableRulesForUpdateCdnConfigInput addCustomVariableInstancesItem(CustomVariableInstanceForUpdateCdnConfigInput customVariableInstancesItem) {
    if (this.customVariableInstances == null) {
      this.customVariableInstances = new ArrayList<CustomVariableInstanceForUpdateCdnConfigInput>();
    }
    this.customVariableInstances.add(customVariableInstancesItem);
    return this;
  }

   /**
   * Get customVariableInstances
   * @return customVariableInstances
  **/
  @Valid
  @Schema(description = "")
  public List<CustomVariableInstanceForUpdateCdnConfigInput> getCustomVariableInstances() {
    return customVariableInstances;
  }

  public void setCustomVariableInstances(List<CustomVariableInstanceForUpdateCdnConfigInput> customVariableInstances) {
    this.customVariableInstances = customVariableInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomVariableRulesForUpdateCdnConfigInput customVariableRulesForUpdateCdnConfigInput = (CustomVariableRulesForUpdateCdnConfigInput) o;
    return Objects.equals(this.customVariableInstances, customVariableRulesForUpdateCdnConfigInput.customVariableInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customVariableInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomVariableRulesForUpdateCdnConfigInput {\n");
    
    sb.append("    customVariableInstances: ").append(toIndentedString(customVariableInstances)).append("\n");
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
