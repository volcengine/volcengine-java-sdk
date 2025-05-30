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
import com.volcengine.quota.model.DimensionForModifyTemplateQuotaItemOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyTemplateQuotaItemResponse
 */



public class ModifyTemplateQuotaItemResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccountID")
  private Long accountID = null;

  @SerializedName("Dimensions")
  private List<DimensionForModifyTemplateQuotaItemOutput> dimensions = null;

  @SerializedName("ProviderCode")
  private String providerCode = null;

  @SerializedName("QuotaCode")
  private String quotaCode = null;

  public ModifyTemplateQuotaItemResponse accountID(Long accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public Long getAccountID() {
    return accountID;
  }

  public void setAccountID(Long accountID) {
    this.accountID = accountID;
  }

  public ModifyTemplateQuotaItemResponse dimensions(List<DimensionForModifyTemplateQuotaItemOutput> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public ModifyTemplateQuotaItemResponse addDimensionsItem(DimensionForModifyTemplateQuotaItemOutput dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<DimensionForModifyTemplateQuotaItemOutput>();
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
  public List<DimensionForModifyTemplateQuotaItemOutput> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<DimensionForModifyTemplateQuotaItemOutput> dimensions) {
    this.dimensions = dimensions;
  }

  public ModifyTemplateQuotaItemResponse providerCode(String providerCode) {
    this.providerCode = providerCode;
    return this;
  }

   /**
   * Get providerCode
   * @return providerCode
  **/
  @Schema(description = "")
  public String getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }

  public ModifyTemplateQuotaItemResponse quotaCode(String quotaCode) {
    this.quotaCode = quotaCode;
    return this;
  }

   /**
   * Get quotaCode
   * @return quotaCode
  **/
  @Schema(description = "")
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
    ModifyTemplateQuotaItemResponse modifyTemplateQuotaItemResponse = (ModifyTemplateQuotaItemResponse) o;
    return Objects.equals(this.accountID, modifyTemplateQuotaItemResponse.accountID) &&
        Objects.equals(this.dimensions, modifyTemplateQuotaItemResponse.dimensions) &&
        Objects.equals(this.providerCode, modifyTemplateQuotaItemResponse.providerCode) &&
        Objects.equals(this.quotaCode, modifyTemplateQuotaItemResponse.quotaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, dimensions, providerCode, quotaCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyTemplateQuotaItemResponse {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
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
