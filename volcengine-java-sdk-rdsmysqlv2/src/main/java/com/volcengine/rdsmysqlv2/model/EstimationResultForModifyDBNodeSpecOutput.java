/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * EstimationResultForModifyDBNodeSpecOutput
 */



public class EstimationResultForModifyDBNodeSpecOutput {
  @SerializedName("Effects")
  private List<String> effects = null;

  @SerializedName("Plans")
  private List<String> plans = null;

  public EstimationResultForModifyDBNodeSpecOutput effects(List<String> effects) {
    this.effects = effects;
    return this;
  }

  public EstimationResultForModifyDBNodeSpecOutput addEffectsItem(String effectsItem) {
    if (this.effects == null) {
      this.effects = new ArrayList<String>();
    }
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * Get effects
   * @return effects
  **/
  @Schema(description = "")
  public List<String> getEffects() {
    return effects;
  }

  public void setEffects(List<String> effects) {
    this.effects = effects;
  }

  public EstimationResultForModifyDBNodeSpecOutput plans(List<String> plans) {
    this.plans = plans;
    return this;
  }

  public EstimationResultForModifyDBNodeSpecOutput addPlansItem(String plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<String>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @Schema(description = "")
  public List<String> getPlans() {
    return plans;
  }

  public void setPlans(List<String> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimationResultForModifyDBNodeSpecOutput estimationResultForModifyDBNodeSpecOutput = (EstimationResultForModifyDBNodeSpecOutput) o;
    return Objects.equals(this.effects, estimationResultForModifyDBNodeSpecOutput.effects) &&
        Objects.equals(this.plans, estimationResultForModifyDBNodeSpecOutput.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effects, plans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimationResultForModifyDBNodeSpecOutput {\n");
    
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
