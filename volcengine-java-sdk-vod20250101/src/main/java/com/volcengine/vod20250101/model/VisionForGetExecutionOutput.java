/*
 * vod20250101
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vod20250101.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vod20250101.model.ModelForGetExecutionOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VisionForGetExecutionOutput
 */



public class VisionForGetExecutionOutput {
  @SerializedName("Model")
  private ModelForGetExecutionOutput model = null;

  @SerializedName("Prompt")
  private String prompt = null;

  public VisionForGetExecutionOutput model(ModelForGetExecutionOutput model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Valid
  @Schema(description = "")
  public ModelForGetExecutionOutput getModel() {
    return model;
  }

  public void setModel(ModelForGetExecutionOutput model) {
    this.model = model;
  }

  public VisionForGetExecutionOutput prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @Schema(description = "")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisionForGetExecutionOutput visionForGetExecutionOutput = (VisionForGetExecutionOutput) o;
    return Objects.equals(this.model, visionForGetExecutionOutput.model) &&
        Objects.equals(this.prompt, visionForGetExecutionOutput.prompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, prompt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisionForGetExecutionOutput {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
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
