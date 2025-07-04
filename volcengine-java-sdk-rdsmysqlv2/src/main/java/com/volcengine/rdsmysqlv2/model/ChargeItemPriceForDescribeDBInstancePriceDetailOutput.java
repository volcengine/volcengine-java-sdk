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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChargeItemPriceForDescribeDBInstancePriceDetailOutput
 */



public class ChargeItemPriceForDescribeDBInstancePriceDetailOutput {
  @SerializedName("ChargeItemKey")
  private String chargeItemKey = null;

  @SerializedName("ChargeItemType")
  private String chargeItemType = null;

  @SerializedName("ChargeItemValue")
  private Long chargeItemValue = null;

  @SerializedName("DiscountPrice")
  private String discountPrice = null;

  @SerializedName("OriginalPrice")
  private String originalPrice = null;

  @SerializedName("PayablePrice")
  private String payablePrice = null;

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput chargeItemKey(String chargeItemKey) {
    this.chargeItemKey = chargeItemKey;
    return this;
  }

   /**
   * Get chargeItemKey
   * @return chargeItemKey
  **/
  @Schema(description = "")
  public String getChargeItemKey() {
    return chargeItemKey;
  }

  public void setChargeItemKey(String chargeItemKey) {
    this.chargeItemKey = chargeItemKey;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput chargeItemType(String chargeItemType) {
    this.chargeItemType = chargeItemType;
    return this;
  }

   /**
   * Get chargeItemType
   * @return chargeItemType
  **/
  @Schema(description = "")
  public String getChargeItemType() {
    return chargeItemType;
  }

  public void setChargeItemType(String chargeItemType) {
    this.chargeItemType = chargeItemType;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput chargeItemValue(Long chargeItemValue) {
    this.chargeItemValue = chargeItemValue;
    return this;
  }

   /**
   * Get chargeItemValue
   * @return chargeItemValue
  **/
  @Schema(description = "")
  public Long getChargeItemValue() {
    return chargeItemValue;
  }

  public void setChargeItemValue(Long chargeItemValue) {
    this.chargeItemValue = chargeItemValue;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput discountPrice(String discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * Get discountPrice
   * @return discountPrice
  **/
  @Schema(description = "")
  public String getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(String discountPrice) {
    this.discountPrice = discountPrice;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput originalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @Schema(description = "")
  public String getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput payablePrice(String payablePrice) {
    this.payablePrice = payablePrice;
    return this;
  }

   /**
   * Get payablePrice
   * @return payablePrice
  **/
  @Schema(description = "")
  public String getPayablePrice() {
    return payablePrice;
  }

  public void setPayablePrice(String payablePrice) {
    this.payablePrice = payablePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeItemPriceForDescribeDBInstancePriceDetailOutput chargeItemPriceForDescribeDBInstancePriceDetailOutput = (ChargeItemPriceForDescribeDBInstancePriceDetailOutput) o;
    return Objects.equals(this.chargeItemKey, chargeItemPriceForDescribeDBInstancePriceDetailOutput.chargeItemKey) &&
        Objects.equals(this.chargeItemType, chargeItemPriceForDescribeDBInstancePriceDetailOutput.chargeItemType) &&
        Objects.equals(this.chargeItemValue, chargeItemPriceForDescribeDBInstancePriceDetailOutput.chargeItemValue) &&
        Objects.equals(this.discountPrice, chargeItemPriceForDescribeDBInstancePriceDetailOutput.discountPrice) &&
        Objects.equals(this.originalPrice, chargeItemPriceForDescribeDBInstancePriceDetailOutput.originalPrice) &&
        Objects.equals(this.payablePrice, chargeItemPriceForDescribeDBInstancePriceDetailOutput.payablePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeItemKey, chargeItemType, chargeItemValue, discountPrice, originalPrice, payablePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeItemPriceForDescribeDBInstancePriceDetailOutput {\n");
    
    sb.append("    chargeItemKey: ").append(toIndentedString(chargeItemKey)).append("\n");
    sb.append("    chargeItemType: ").append(toIndentedString(chargeItemType)).append("\n");
    sb.append("    chargeItemValue: ").append(toIndentedString(chargeItemValue)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    payablePrice: ").append(toIndentedString(payablePrice)).append("\n");
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
