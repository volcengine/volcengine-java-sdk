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
import com.volcengine.rdspostgresql.model.ChargeItemPriceForDescribeDBInstancePriceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstancePriceDetailResponse
 */



public class DescribeDBInstancePriceDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("ChargeItemPrices")
  private List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> chargeItemPrices = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("DiscountPrice")
  private Double discountPrice = null;

  @SerializedName("InstanceQuantity")
  private Integer instanceQuantity = null;

  @SerializedName("OriginalPrice")
  private Double originalPrice = null;

  @SerializedName("PayablePrice")
  private Double payablePrice = null;

  public DescribeDBInstancePriceDetailResponse chargeItemPrices(List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> chargeItemPrices) {
    this.chargeItemPrices = chargeItemPrices;
    return this;
  }

  public DescribeDBInstancePriceDetailResponse addChargeItemPricesItem(ChargeItemPriceForDescribeDBInstancePriceDetailOutput chargeItemPricesItem) {
    if (this.chargeItemPrices == null) {
      this.chargeItemPrices = new ArrayList<ChargeItemPriceForDescribeDBInstancePriceDetailOutput>();
    }
    this.chargeItemPrices.add(chargeItemPricesItem);
    return this;
  }

   /**
   * Get chargeItemPrices
   * @return chargeItemPrices
  **/
  @Valid
  @Schema(description = "")
  public List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> getChargeItemPrices() {
    return chargeItemPrices;
  }

  public void setChargeItemPrices(List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> chargeItemPrices) {
    this.chargeItemPrices = chargeItemPrices;
  }

  public DescribeDBInstancePriceDetailResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DescribeDBInstancePriceDetailResponse discountPrice(Double discountPrice) {
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

  public DescribeDBInstancePriceDetailResponse instanceQuantity(Integer instanceQuantity) {
    this.instanceQuantity = instanceQuantity;
    return this;
  }

   /**
   * Get instanceQuantity
   * @return instanceQuantity
  **/
  @Schema(description = "")
  public Integer getInstanceQuantity() {
    return instanceQuantity;
  }

  public void setInstanceQuantity(Integer instanceQuantity) {
    this.instanceQuantity = instanceQuantity;
  }

  public DescribeDBInstancePriceDetailResponse originalPrice(Double originalPrice) {
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

  public DescribeDBInstancePriceDetailResponse payablePrice(Double payablePrice) {
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
    DescribeDBInstancePriceDetailResponse describeDBInstancePriceDetailResponse = (DescribeDBInstancePriceDetailResponse) o;
    return Objects.equals(this.chargeItemPrices, describeDBInstancePriceDetailResponse.chargeItemPrices) &&
        Objects.equals(this.currency, describeDBInstancePriceDetailResponse.currency) &&
        Objects.equals(this.discountPrice, describeDBInstancePriceDetailResponse.discountPrice) &&
        Objects.equals(this.instanceQuantity, describeDBInstancePriceDetailResponse.instanceQuantity) &&
        Objects.equals(this.originalPrice, describeDBInstancePriceDetailResponse.originalPrice) &&
        Objects.equals(this.payablePrice, describeDBInstancePriceDetailResponse.payablePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeItemPrices, currency, discountPrice, instanceQuantity, originalPrice, payablePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstancePriceDetailResponse {\n");
    
    sb.append("    chargeItemPrices: ").append(toIndentedString(chargeItemPrices)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    instanceQuantity: ").append(toIndentedString(instanceQuantity)).append("\n");
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
