/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.HealthCheckTemplateForModifyHealthCheckTemplatesAttributesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyHealthCheckTemplatesAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-26T18:47:55.368678+08:00[Asia/Shanghai]")
public class ModifyHealthCheckTemplatesAttributesRequest {
  @SerializedName("HealthCheckTemplates")
  private List<HealthCheckTemplateForModifyHealthCheckTemplatesAttributesInput> healthCheckTemplates = null;

  public ModifyHealthCheckTemplatesAttributesRequest healthCheckTemplates(List<HealthCheckTemplateForModifyHealthCheckTemplatesAttributesInput> healthCheckTemplates) {
    this.healthCheckTemplates = healthCheckTemplates;
    return this;
  }

  public ModifyHealthCheckTemplatesAttributesRequest addHealthCheckTemplatesItem(HealthCheckTemplateForModifyHealthCheckTemplatesAttributesInput healthCheckTemplatesItem) {
    if (this.healthCheckTemplates == null) {
      this.healthCheckTemplates = new ArrayList<HealthCheckTemplateForModifyHealthCheckTemplatesAttributesInput>();
    }
    this.healthCheckTemplates.add(healthCheckTemplatesItem);
    return this;
  }

   /**
   * Get healthCheckTemplates
   * @return healthCheckTemplates
  **/
  @Valid
  @Schema(description = "")
  public List<HealthCheckTemplateForModifyHealthCheckTemplatesAttributesInput> getHealthCheckTemplates() {
    return healthCheckTemplates;
  }

  public void setHealthCheckTemplates(List<HealthCheckTemplateForModifyHealthCheckTemplatesAttributesInput> healthCheckTemplates) {
    this.healthCheckTemplates = healthCheckTemplates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyHealthCheckTemplatesAttributesRequest modifyHealthCheckTemplatesAttributesRequest = (ModifyHealthCheckTemplatesAttributesRequest) o;
    return Objects.equals(this.healthCheckTemplates, modifyHealthCheckTemplatesAttributesRequest.healthCheckTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCheckTemplates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyHealthCheckTemplatesAttributesRequest {\n");
    
    sb.append("    healthCheckTemplates: ").append(toIndentedString(healthCheckTemplates)).append("\n");
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
