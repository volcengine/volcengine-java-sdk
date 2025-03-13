/*
 * billing
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.billing.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.billing.model.DiscountDetailForQueryPriceForPayAsYouGoOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigListForQueryPriceForPayAsYouGoOutput
 */



public class ConfigListForQueryPriceForPayAsYouGoOutput {
  @SerializedName("ChargeItemCode")
  private String chargeItemCode = null;

  @SerializedName("ConfigurationCode")
  private String configurationCode = null;

  @SerializedName("DiscountAmount")
  private String discountAmount = null;

  @SerializedName("DiscountDetail")
  private DiscountDetailForQueryPriceForPayAsYouGoOutput discountDetail = null;

  @SerializedName("OriginalAmount")
  private String originalAmount = null;

  @SerializedName("Price")
  private String price = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  public ConfigListForQueryPriceForPayAsYouGoOutput chargeItemCode(String chargeItemCode) {
    this.chargeItemCode = chargeItemCode;
    return this;
  }

   /**
   * Get chargeItemCode
   * @return chargeItemCode
  **/
  @Schema(description = "")
  public String getChargeItemCode() {
    return chargeItemCode;
  }

  public void setChargeItemCode(String chargeItemCode) {
    this.chargeItemCode = chargeItemCode;
  }

  public ConfigListForQueryPriceForPayAsYouGoOutput configurationCode(String configurationCode) {
    this.configurationCode = configurationCode;
    return this;
  }

   /**
   * Get configurationCode
   * @return configurationCode
  **/
  @Schema(description = "")
  public String getConfigurationCode() {
    return configurationCode;
  }

  public void setConfigurationCode(String configurationCode) {
    this.configurationCode = configurationCode;
  }

  public ConfigListForQueryPriceForPayAsYouGoOutput discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @Schema(description = "")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public ConfigListForQueryPriceForPayAsYouGoOutput discountDetail(DiscountDetailForQueryPriceForPayAsYouGoOutput discountDetail) {
    this.discountDetail = discountDetail;
    return this;
  }

   /**
   * Get discountDetail
   * @return discountDetail
  **/
  @Valid
  @Schema(description = "")
  public DiscountDetailForQueryPriceForPayAsYouGoOutput getDiscountDetail() {
    return discountDetail;
  }

  public void setDiscountDetail(DiscountDetailForQueryPriceForPayAsYouGoOutput discountDetail) {
    this.discountDetail = discountDetail;
  }

  public ConfigListForQueryPriceForPayAsYouGoOutput originalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  @Schema(description = "")
  public String getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(String originalAmount) {
    this.originalAmount = originalAmount;
  }

  public ConfigListForQueryPriceForPayAsYouGoOutput price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ConfigListForQueryPriceForPayAsYouGoOutput quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigListForQueryPriceForPayAsYouGoOutput configListForQueryPriceForPayAsYouGoOutput = (ConfigListForQueryPriceForPayAsYouGoOutput) o;
    return Objects.equals(this.chargeItemCode, configListForQueryPriceForPayAsYouGoOutput.chargeItemCode) &&
        Objects.equals(this.configurationCode, configListForQueryPriceForPayAsYouGoOutput.configurationCode) &&
        Objects.equals(this.discountAmount, configListForQueryPriceForPayAsYouGoOutput.discountAmount) &&
        Objects.equals(this.discountDetail, configListForQueryPriceForPayAsYouGoOutput.discountDetail) &&
        Objects.equals(this.originalAmount, configListForQueryPriceForPayAsYouGoOutput.originalAmount) &&
        Objects.equals(this.price, configListForQueryPriceForPayAsYouGoOutput.price) &&
        Objects.equals(this.quantity, configListForQueryPriceForPayAsYouGoOutput.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeItemCode, configurationCode, discountAmount, discountDetail, originalAmount, price, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigListForQueryPriceForPayAsYouGoOutput {\n");
    
    sb.append("    chargeItemCode: ").append(toIndentedString(chargeItemCode)).append("\n");
    sb.append("    configurationCode: ").append(toIndentedString(configurationCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountDetail: ").append(toIndentedString(discountDetail)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
