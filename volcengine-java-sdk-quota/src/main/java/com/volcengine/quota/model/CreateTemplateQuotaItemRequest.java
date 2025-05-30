/*
 * quota
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.quota.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.quota.model.DimensionForCreateTemplateQuotaItemInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateTemplateQuotaItemRequest
 */



public class CreateTemplateQuotaItemRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DesireValue")
  private Double desireValue = null;

  @SerializedName("Dimensions")
  private List<DimensionForCreateTemplateQuotaItemInput> dimensions = null;

  @SerializedName("ProviderCode")
  private String providerCode = null;

  @SerializedName("QuotaCode")
  private String quotaCode = null;

  public CreateTemplateQuotaItemRequest description(String description) {
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

  public CreateTemplateQuotaItemRequest desireValue(Double desireValue) {
    this.desireValue = desireValue;
    return this;
  }

   /**
   * Get desireValue
   * @return desireValue
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Double getDesireValue() {
    return desireValue;
  }

  public void setDesireValue(Double desireValue) {
    this.desireValue = desireValue;
  }

  public CreateTemplateQuotaItemRequest dimensions(List<DimensionForCreateTemplateQuotaItemInput> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public CreateTemplateQuotaItemRequest addDimensionsItem(DimensionForCreateTemplateQuotaItemInput dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<DimensionForCreateTemplateQuotaItemInput>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @Valid
  @Schema(description = "")
  public List<DimensionForCreateTemplateQuotaItemInput> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<DimensionForCreateTemplateQuotaItemInput> dimensions) {
    this.dimensions = dimensions;
  }

  public CreateTemplateQuotaItemRequest providerCode(String providerCode) {
    this.providerCode = providerCode;
    return this;
  }

   /**
   * Get providerCode
   * @return providerCode
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }

  public CreateTemplateQuotaItemRequest quotaCode(String quotaCode) {
    this.quotaCode = quotaCode;
    return this;
  }

   /**
   * Get quotaCode
   * @return quotaCode
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getQuotaCode() {
    return quotaCode;
  }

  public void setQuotaCode(String quotaCode) {
    this.quotaCode = quotaCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTemplateQuotaItemRequest createTemplateQuotaItemRequest = (CreateTemplateQuotaItemRequest) o;
    return Objects.equals(this.description, createTemplateQuotaItemRequest.description) &&
        Objects.equals(this.desireValue, createTemplateQuotaItemRequest.desireValue) &&
        Objects.equals(this.dimensions, createTemplateQuotaItemRequest.dimensions) &&
        Objects.equals(this.providerCode, createTemplateQuotaItemRequest.providerCode) &&
        Objects.equals(this.quotaCode, createTemplateQuotaItemRequest.quotaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, desireValue, dimensions, providerCode, quotaCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTemplateQuotaItemRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    desireValue: ").append(toIndentedString(desireValue)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    quotaCode: ").append(toIndentedString(quotaCode)).append("\n");
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
