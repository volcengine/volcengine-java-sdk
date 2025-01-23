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
import com.volcengine.ark.model.FoundationModelForGetEndpointOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModelReferenceForGetEndpointOutput
 */



public class ModelReferenceForGetEndpointOutput {
  @SerializedName("CustomModelId")
  private String customModelId = null;

  @SerializedName("FoundationModel")
  private FoundationModelForGetEndpointOutput foundationModel = null;

  public ModelReferenceForGetEndpointOutput customModelId(String customModelId) {
    this.customModelId = customModelId;
    return this;
  }

   /**
   * Get customModelId
   * @return customModelId
  **/
  @Schema(description = "")
  public String getCustomModelId() {
    return customModelId;
  }

  public void setCustomModelId(String customModelId) {
    this.customModelId = customModelId;
  }

  public ModelReferenceForGetEndpointOutput foundationModel(FoundationModelForGetEndpointOutput foundationModel) {
    this.foundationModel = foundationModel;
    return this;
  }

   /**
   * Get foundationModel
   * @return foundationModel
  **/
  @Valid
  @Schema(description = "")
  public FoundationModelForGetEndpointOutput getFoundationModel() {
    return foundationModel;
  }

  public void setFoundationModel(FoundationModelForGetEndpointOutput foundationModel) {
    this.foundationModel = foundationModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelReferenceForGetEndpointOutput modelReferenceForGetEndpointOutput = (ModelReferenceForGetEndpointOutput) o;
    return Objects.equals(this.customModelId, modelReferenceForGetEndpointOutput.customModelId) &&
        Objects.equals(this.foundationModel, modelReferenceForGetEndpointOutput.foundationModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customModelId, foundationModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReferenceForGetEndpointOutput {\n");
    
    sb.append("    customModelId: ").append(toIndentedString(customModelId)).append("\n");
    sb.append("    foundationModel: ").append(toIndentedString(foundationModel)).append("\n");
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
