/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

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
  private Integer chargeItemValue = null;

  @SerializedName("DiscountPrice")
  private Double discountPrice = null;

  @SerializedName("NodeNumPerInstance")
  private Integer nodeNumPerInstance = null;

  @SerializedName("OriginalPrice")
  private Double originalPrice = null;

  @SerializedName("PayablePrice")
  private Double payablePrice = null;

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

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput chargeItemValue(Integer chargeItemValue) {
    this.chargeItemValue = chargeItemValue;
    return this;
  }

   /**
   * Get chargeItemValue
   * @return chargeItemValue
  **/
  @Schema(description = "")
  public Integer getChargeItemValue() {
    return chargeItemValue;
  }

  public void setChargeItemValue(Integer chargeItemValue) {
    this.chargeItemValue = chargeItemValue;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput discountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * Get discountPrice
   * @return discountPrice
  **/
  @Schema(description = "")
  public Double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput nodeNumPerInstance(Integer nodeNumPerInstance) {
    this.nodeNumPerInstance = nodeNumPerInstance;
    return this;
  }

   /**
   * Get nodeNumPerInstance
   * @return nodeNumPerInstance
  **/
  @Schema(description = "")
  public Integer getNodeNumPerInstance() {
    return nodeNumPerInstance;
  }

  public void setNodeNumPerInstance(Integer nodeNumPerInstance) {
    this.nodeNumPerInstance = nodeNumPerInstance;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput originalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @Schema(description = "")
  public Double getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDetailOutput payablePrice(Double payablePrice) {
    this.payablePrice = payablePrice;
    return this;
  }

   /**
   * Get payablePrice
   * @return payablePrice
  **/
  @Schema(description = "")
  public Double getPayablePrice() {
    return payablePrice;
  }

  public void setPayablePrice(Double payablePrice) {
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
        Objects.equals(this.nodeNumPerInstance, chargeItemPriceForDescribeDBInstancePriceDetailOutput.nodeNumPerInstance) &&
        Objects.equals(this.originalPrice, chargeItemPriceForDescribeDBInstancePriceDetailOutput.originalPrice) &&
        Objects.equals(this.payablePrice, chargeItemPriceForDescribeDBInstancePriceDetailOutput.payablePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeItemKey, chargeItemType, chargeItemValue, discountPrice, nodeNumPerInstance, originalPrice, payablePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeItemPriceForDescribeDBInstancePriceDetailOutput {\n");
    
    sb.append("    chargeItemKey: ").append(toIndentedString(chargeItemKey)).append("\n");
    sb.append("    chargeItemType: ").append(toIndentedString(chargeItemType)).append("\n");
    sb.append("    chargeItemValue: ").append(toIndentedString(chargeItemValue)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    nodeNumPerInstance: ").append(toIndentedString(nodeNumPerInstance)).append("\n");
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
