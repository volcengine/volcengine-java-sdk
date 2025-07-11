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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListForListBillOverviewByCategoryOutput
 */



public class ListForListBillOverviewByCategoryOutput {
  @SerializedName("BillCategoryParent")
  private String billCategoryParent = null;

  @SerializedName("BillPeriod")
  private String billPeriod = null;

  @SerializedName("BusinessMode")
  private String businessMode = null;

  @SerializedName("CountryArea")
  private String countryArea = null;

  @SerializedName("CountryRegion")
  private String countryRegion = null;

  @SerializedName("CouponAmount")
  private String couponAmount = null;

  @SerializedName("CreditCarriedAmount")
  private String creditCarriedAmount = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("DiscountBillAmount")
  private String discountBillAmount = null;

  @SerializedName("OriginalBillAmount")
  private String originalBillAmount = null;

  @SerializedName("OwnerCustomerName")
  private String ownerCustomerName = null;

  @SerializedName("OwnerID")
  private String ownerID = null;

  @SerializedName("OwnerUserName")
  private String ownerUserName = null;

  @SerializedName("PaidAmount")
  private String paidAmount = null;

  @SerializedName("PayableAmount")
  private String payableAmount = null;

  @SerializedName("PayerCustomerName")
  private String payerCustomerName = null;

  @SerializedName("PayerID")
  private String payerID = null;

  @SerializedName("PayerUserName")
  private String payerUserName = null;

  @SerializedName("PosttaxAmount")
  private String posttaxAmount = null;

  @SerializedName("PretaxAmount")
  private String pretaxAmount = null;

  @SerializedName("PretaxRealValue")
  private String pretaxRealValue = null;

  @SerializedName("RealValue")
  private String realValue = null;

  @SerializedName("SellerCustomerName")
  private String sellerCustomerName = null;

  @SerializedName("SellerID")
  private String sellerID = null;

  @SerializedName("SellerUserName")
  private String sellerUserName = null;

  @SerializedName("SettlePosttaxAmount")
  private String settlePosttaxAmount = null;

  @SerializedName("SettlePretaxAmount")
  private String settlePretaxAmount = null;

  @SerializedName("SettlePretaxRealValue")
  private String settlePretaxRealValue = null;

  @SerializedName("SettleRealValue")
  private String settleRealValue = null;

  @SerializedName("SettleTax")
  private String settleTax = null;

  @SerializedName("SettlementType")
  private String settlementType = null;

  @SerializedName("SubjectName")
  private String subjectName = null;

  @SerializedName("SubjectNo")
  private String subjectNo = null;

  @SerializedName("Tax")
  private String tax = null;

  @SerializedName("UnpaidAmount")
  private String unpaidAmount = null;

  public ListForListBillOverviewByCategoryOutput billCategoryParent(String billCategoryParent) {
    this.billCategoryParent = billCategoryParent;
    return this;
  }

   /**
   * Get billCategoryParent
   * @return billCategoryParent
  **/
  @Schema(description = "")
  public String getBillCategoryParent() {
    return billCategoryParent;
  }

  public void setBillCategoryParent(String billCategoryParent) {
    this.billCategoryParent = billCategoryParent;
  }

  public ListForListBillOverviewByCategoryOutput billPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
    return this;
  }

   /**
   * Get billPeriod
   * @return billPeriod
  **/
  @Schema(description = "")
  public String getBillPeriod() {
    return billPeriod;
  }

  public void setBillPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
  }

  public ListForListBillOverviewByCategoryOutput businessMode(String businessMode) {
    this.businessMode = businessMode;
    return this;
  }

   /**
   * Get businessMode
   * @return businessMode
  **/
  @Schema(description = "")
  public String getBusinessMode() {
    return businessMode;
  }

  public void setBusinessMode(String businessMode) {
    this.businessMode = businessMode;
  }

  public ListForListBillOverviewByCategoryOutput countryArea(String countryArea) {
    this.countryArea = countryArea;
    return this;
  }

   /**
   * Get countryArea
   * @return countryArea
  **/
  @Schema(description = "")
  public String getCountryArea() {
    return countryArea;
  }

  public void setCountryArea(String countryArea) {
    this.countryArea = countryArea;
  }

  public ListForListBillOverviewByCategoryOutput countryRegion(String countryRegion) {
    this.countryRegion = countryRegion;
    return this;
  }

   /**
   * Get countryRegion
   * @return countryRegion
  **/
  @Schema(description = "")
  public String getCountryRegion() {
    return countryRegion;
  }

  public void setCountryRegion(String countryRegion) {
    this.countryRegion = countryRegion;
  }

  public ListForListBillOverviewByCategoryOutput couponAmount(String couponAmount) {
    this.couponAmount = couponAmount;
    return this;
  }

   /**
   * Get couponAmount
   * @return couponAmount
  **/
  @Schema(description = "")
  public String getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(String couponAmount) {
    this.couponAmount = couponAmount;
  }

  public ListForListBillOverviewByCategoryOutput creditCarriedAmount(String creditCarriedAmount) {
    this.creditCarriedAmount = creditCarriedAmount;
    return this;
  }

   /**
   * Get creditCarriedAmount
   * @return creditCarriedAmount
  **/
  @Schema(description = "")
  public String getCreditCarriedAmount() {
    return creditCarriedAmount;
  }

  public void setCreditCarriedAmount(String creditCarriedAmount) {
    this.creditCarriedAmount = creditCarriedAmount;
  }

  public ListForListBillOverviewByCategoryOutput currency(String currency) {
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

  public ListForListBillOverviewByCategoryOutput discountBillAmount(String discountBillAmount) {
    this.discountBillAmount = discountBillAmount;
    return this;
  }

   /**
   * Get discountBillAmount
   * @return discountBillAmount
  **/
  @Schema(description = "")
  public String getDiscountBillAmount() {
    return discountBillAmount;
  }

  public void setDiscountBillAmount(String discountBillAmount) {
    this.discountBillAmount = discountBillAmount;
  }

  public ListForListBillOverviewByCategoryOutput originalBillAmount(String originalBillAmount) {
    this.originalBillAmount = originalBillAmount;
    return this;
  }

   /**
   * Get originalBillAmount
   * @return originalBillAmount
  **/
  @Schema(description = "")
  public String getOriginalBillAmount() {
    return originalBillAmount;
  }

  public void setOriginalBillAmount(String originalBillAmount) {
    this.originalBillAmount = originalBillAmount;
  }

  public ListForListBillOverviewByCategoryOutput ownerCustomerName(String ownerCustomerName) {
    this.ownerCustomerName = ownerCustomerName;
    return this;
  }

   /**
   * Get ownerCustomerName
   * @return ownerCustomerName
  **/
  @Schema(description = "")
  public String getOwnerCustomerName() {
    return ownerCustomerName;
  }

  public void setOwnerCustomerName(String ownerCustomerName) {
    this.ownerCustomerName = ownerCustomerName;
  }

  public ListForListBillOverviewByCategoryOutput ownerID(String ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @Schema(description = "")
  public String getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(String ownerID) {
    this.ownerID = ownerID;
  }

  public ListForListBillOverviewByCategoryOutput ownerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

   /**
   * Get ownerUserName
   * @return ownerUserName
  **/
  @Schema(description = "")
  public String getOwnerUserName() {
    return ownerUserName;
  }

  public void setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
  }

  public ListForListBillOverviewByCategoryOutput paidAmount(String paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * Get paidAmount
   * @return paidAmount
  **/
  @Schema(description = "")
  public String getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(String paidAmount) {
    this.paidAmount = paidAmount;
  }

  public ListForListBillOverviewByCategoryOutput payableAmount(String payableAmount) {
    this.payableAmount = payableAmount;
    return this;
  }

   /**
   * Get payableAmount
   * @return payableAmount
  **/
  @Schema(description = "")
  public String getPayableAmount() {
    return payableAmount;
  }

  public void setPayableAmount(String payableAmount) {
    this.payableAmount = payableAmount;
  }

  public ListForListBillOverviewByCategoryOutput payerCustomerName(String payerCustomerName) {
    this.payerCustomerName = payerCustomerName;
    return this;
  }

   /**
   * Get payerCustomerName
   * @return payerCustomerName
  **/
  @Schema(description = "")
  public String getPayerCustomerName() {
    return payerCustomerName;
  }

  public void setPayerCustomerName(String payerCustomerName) {
    this.payerCustomerName = payerCustomerName;
  }

  public ListForListBillOverviewByCategoryOutput payerID(String payerID) {
    this.payerID = payerID;
    return this;
  }

   /**
   * Get payerID
   * @return payerID
  **/
  @Schema(description = "")
  public String getPayerID() {
    return payerID;
  }

  public void setPayerID(String payerID) {
    this.payerID = payerID;
  }

  public ListForListBillOverviewByCategoryOutput payerUserName(String payerUserName) {
    this.payerUserName = payerUserName;
    return this;
  }

   /**
   * Get payerUserName
   * @return payerUserName
  **/
  @Schema(description = "")
  public String getPayerUserName() {
    return payerUserName;
  }

  public void setPayerUserName(String payerUserName) {
    this.payerUserName = payerUserName;
  }

  public ListForListBillOverviewByCategoryOutput posttaxAmount(String posttaxAmount) {
    this.posttaxAmount = posttaxAmount;
    return this;
  }

   /**
   * Get posttaxAmount
   * @return posttaxAmount
  **/
  @Schema(description = "")
  public String getPosttaxAmount() {
    return posttaxAmount;
  }

  public void setPosttaxAmount(String posttaxAmount) {
    this.posttaxAmount = posttaxAmount;
  }

  public ListForListBillOverviewByCategoryOutput pretaxAmount(String pretaxAmount) {
    this.pretaxAmount = pretaxAmount;
    return this;
  }

   /**
   * Get pretaxAmount
   * @return pretaxAmount
  **/
  @Schema(description = "")
  public String getPretaxAmount() {
    return pretaxAmount;
  }

  public void setPretaxAmount(String pretaxAmount) {
    this.pretaxAmount = pretaxAmount;
  }

  public ListForListBillOverviewByCategoryOutput pretaxRealValue(String pretaxRealValue) {
    this.pretaxRealValue = pretaxRealValue;
    return this;
  }

   /**
   * Get pretaxRealValue
   * @return pretaxRealValue
  **/
  @Schema(description = "")
  public String getPretaxRealValue() {
    return pretaxRealValue;
  }

  public void setPretaxRealValue(String pretaxRealValue) {
    this.pretaxRealValue = pretaxRealValue;
  }

  public ListForListBillOverviewByCategoryOutput realValue(String realValue) {
    this.realValue = realValue;
    return this;
  }

   /**
   * Get realValue
   * @return realValue
  **/
  @Schema(description = "")
  public String getRealValue() {
    return realValue;
  }

  public void setRealValue(String realValue) {
    this.realValue = realValue;
  }

  public ListForListBillOverviewByCategoryOutput sellerCustomerName(String sellerCustomerName) {
    this.sellerCustomerName = sellerCustomerName;
    return this;
  }

   /**
   * Get sellerCustomerName
   * @return sellerCustomerName
  **/
  @Schema(description = "")
  public String getSellerCustomerName() {
    return sellerCustomerName;
  }

  public void setSellerCustomerName(String sellerCustomerName) {
    this.sellerCustomerName = sellerCustomerName;
  }

  public ListForListBillOverviewByCategoryOutput sellerID(String sellerID) {
    this.sellerID = sellerID;
    return this;
  }

   /**
   * Get sellerID
   * @return sellerID
  **/
  @Schema(description = "")
  public String getSellerID() {
    return sellerID;
  }

  public void setSellerID(String sellerID) {
    this.sellerID = sellerID;
  }

  public ListForListBillOverviewByCategoryOutput sellerUserName(String sellerUserName) {
    this.sellerUserName = sellerUserName;
    return this;
  }

   /**
   * Get sellerUserName
   * @return sellerUserName
  **/
  @Schema(description = "")
  public String getSellerUserName() {
    return sellerUserName;
  }

  public void setSellerUserName(String sellerUserName) {
    this.sellerUserName = sellerUserName;
  }

  public ListForListBillOverviewByCategoryOutput settlePosttaxAmount(String settlePosttaxAmount) {
    this.settlePosttaxAmount = settlePosttaxAmount;
    return this;
  }

   /**
   * Get settlePosttaxAmount
   * @return settlePosttaxAmount
  **/
  @Schema(description = "")
  public String getSettlePosttaxAmount() {
    return settlePosttaxAmount;
  }

  public void setSettlePosttaxAmount(String settlePosttaxAmount) {
    this.settlePosttaxAmount = settlePosttaxAmount;
  }

  public ListForListBillOverviewByCategoryOutput settlePretaxAmount(String settlePretaxAmount) {
    this.settlePretaxAmount = settlePretaxAmount;
    return this;
  }

   /**
   * Get settlePretaxAmount
   * @return settlePretaxAmount
  **/
  @Schema(description = "")
  public String getSettlePretaxAmount() {
    return settlePretaxAmount;
  }

  public void setSettlePretaxAmount(String settlePretaxAmount) {
    this.settlePretaxAmount = settlePretaxAmount;
  }

  public ListForListBillOverviewByCategoryOutput settlePretaxRealValue(String settlePretaxRealValue) {
    this.settlePretaxRealValue = settlePretaxRealValue;
    return this;
  }

   /**
   * Get settlePretaxRealValue
   * @return settlePretaxRealValue
  **/
  @Schema(description = "")
  public String getSettlePretaxRealValue() {
    return settlePretaxRealValue;
  }

  public void setSettlePretaxRealValue(String settlePretaxRealValue) {
    this.settlePretaxRealValue = settlePretaxRealValue;
  }

  public ListForListBillOverviewByCategoryOutput settleRealValue(String settleRealValue) {
    this.settleRealValue = settleRealValue;
    return this;
  }

   /**
   * Get settleRealValue
   * @return settleRealValue
  **/
  @Schema(description = "")
  public String getSettleRealValue() {
    return settleRealValue;
  }

  public void setSettleRealValue(String settleRealValue) {
    this.settleRealValue = settleRealValue;
  }

  public ListForListBillOverviewByCategoryOutput settleTax(String settleTax) {
    this.settleTax = settleTax;
    return this;
  }

   /**
   * Get settleTax
   * @return settleTax
  **/
  @Schema(description = "")
  public String getSettleTax() {
    return settleTax;
  }

  public void setSettleTax(String settleTax) {
    this.settleTax = settleTax;
  }

  public ListForListBillOverviewByCategoryOutput settlementType(String settlementType) {
    this.settlementType = settlementType;
    return this;
  }

   /**
   * Get settlementType
   * @return settlementType
  **/
  @Schema(description = "")
  public String getSettlementType() {
    return settlementType;
  }

  public void setSettlementType(String settlementType) {
    this.settlementType = settlementType;
  }

  public ListForListBillOverviewByCategoryOutput subjectName(String subjectName) {
    this.subjectName = subjectName;
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @Schema(description = "")
  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public ListForListBillOverviewByCategoryOutput subjectNo(String subjectNo) {
    this.subjectNo = subjectNo;
    return this;
  }

   /**
   * Get subjectNo
   * @return subjectNo
  **/
  @Schema(description = "")
  public String getSubjectNo() {
    return subjectNo;
  }

  public void setSubjectNo(String subjectNo) {
    this.subjectNo = subjectNo;
  }

  public ListForListBillOverviewByCategoryOutput tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @Schema(description = "")
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public ListForListBillOverviewByCategoryOutput unpaidAmount(String unpaidAmount) {
    this.unpaidAmount = unpaidAmount;
    return this;
  }

   /**
   * Get unpaidAmount
   * @return unpaidAmount
  **/
  @Schema(description = "")
  public String getUnpaidAmount() {
    return unpaidAmount;
  }

  public void setUnpaidAmount(String unpaidAmount) {
    this.unpaidAmount = unpaidAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListForListBillOverviewByCategoryOutput listForListBillOverviewByCategoryOutput = (ListForListBillOverviewByCategoryOutput) o;
    return Objects.equals(this.billCategoryParent, listForListBillOverviewByCategoryOutput.billCategoryParent) &&
        Objects.equals(this.billPeriod, listForListBillOverviewByCategoryOutput.billPeriod) &&
        Objects.equals(this.businessMode, listForListBillOverviewByCategoryOutput.businessMode) &&
        Objects.equals(this.countryArea, listForListBillOverviewByCategoryOutput.countryArea) &&
        Objects.equals(this.countryRegion, listForListBillOverviewByCategoryOutput.countryRegion) &&
        Objects.equals(this.couponAmount, listForListBillOverviewByCategoryOutput.couponAmount) &&
        Objects.equals(this.creditCarriedAmount, listForListBillOverviewByCategoryOutput.creditCarriedAmount) &&
        Objects.equals(this.currency, listForListBillOverviewByCategoryOutput.currency) &&
        Objects.equals(this.discountBillAmount, listForListBillOverviewByCategoryOutput.discountBillAmount) &&
        Objects.equals(this.originalBillAmount, listForListBillOverviewByCategoryOutput.originalBillAmount) &&
        Objects.equals(this.ownerCustomerName, listForListBillOverviewByCategoryOutput.ownerCustomerName) &&
        Objects.equals(this.ownerID, listForListBillOverviewByCategoryOutput.ownerID) &&
        Objects.equals(this.ownerUserName, listForListBillOverviewByCategoryOutput.ownerUserName) &&
        Objects.equals(this.paidAmount, listForListBillOverviewByCategoryOutput.paidAmount) &&
        Objects.equals(this.payableAmount, listForListBillOverviewByCategoryOutput.payableAmount) &&
        Objects.equals(this.payerCustomerName, listForListBillOverviewByCategoryOutput.payerCustomerName) &&
        Objects.equals(this.payerID, listForListBillOverviewByCategoryOutput.payerID) &&
        Objects.equals(this.payerUserName, listForListBillOverviewByCategoryOutput.payerUserName) &&
        Objects.equals(this.posttaxAmount, listForListBillOverviewByCategoryOutput.posttaxAmount) &&
        Objects.equals(this.pretaxAmount, listForListBillOverviewByCategoryOutput.pretaxAmount) &&
        Objects.equals(this.pretaxRealValue, listForListBillOverviewByCategoryOutput.pretaxRealValue) &&
        Objects.equals(this.realValue, listForListBillOverviewByCategoryOutput.realValue) &&
        Objects.equals(this.sellerCustomerName, listForListBillOverviewByCategoryOutput.sellerCustomerName) &&
        Objects.equals(this.sellerID, listForListBillOverviewByCategoryOutput.sellerID) &&
        Objects.equals(this.sellerUserName, listForListBillOverviewByCategoryOutput.sellerUserName) &&
        Objects.equals(this.settlePosttaxAmount, listForListBillOverviewByCategoryOutput.settlePosttaxAmount) &&
        Objects.equals(this.settlePretaxAmount, listForListBillOverviewByCategoryOutput.settlePretaxAmount) &&
        Objects.equals(this.settlePretaxRealValue, listForListBillOverviewByCategoryOutput.settlePretaxRealValue) &&
        Objects.equals(this.settleRealValue, listForListBillOverviewByCategoryOutput.settleRealValue) &&
        Objects.equals(this.settleTax, listForListBillOverviewByCategoryOutput.settleTax) &&
        Objects.equals(this.settlementType, listForListBillOverviewByCategoryOutput.settlementType) &&
        Objects.equals(this.subjectName, listForListBillOverviewByCategoryOutput.subjectName) &&
        Objects.equals(this.subjectNo, listForListBillOverviewByCategoryOutput.subjectNo) &&
        Objects.equals(this.tax, listForListBillOverviewByCategoryOutput.tax) &&
        Objects.equals(this.unpaidAmount, listForListBillOverviewByCategoryOutput.unpaidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billCategoryParent, billPeriod, businessMode, countryArea, countryRegion, couponAmount, creditCarriedAmount, currency, discountBillAmount, originalBillAmount, ownerCustomerName, ownerID, ownerUserName, paidAmount, payableAmount, payerCustomerName, payerID, payerUserName, posttaxAmount, pretaxAmount, pretaxRealValue, realValue, sellerCustomerName, sellerID, sellerUserName, settlePosttaxAmount, settlePretaxAmount, settlePretaxRealValue, settleRealValue, settleTax, settlementType, subjectName, subjectNo, tax, unpaidAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListForListBillOverviewByCategoryOutput {\n");
    
    sb.append("    billCategoryParent: ").append(toIndentedString(billCategoryParent)).append("\n");
    sb.append("    billPeriod: ").append(toIndentedString(billPeriod)).append("\n");
    sb.append("    businessMode: ").append(toIndentedString(businessMode)).append("\n");
    sb.append("    countryArea: ").append(toIndentedString(countryArea)).append("\n");
    sb.append("    countryRegion: ").append(toIndentedString(countryRegion)).append("\n");
    sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
    sb.append("    creditCarriedAmount: ").append(toIndentedString(creditCarriedAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountBillAmount: ").append(toIndentedString(discountBillAmount)).append("\n");
    sb.append("    originalBillAmount: ").append(toIndentedString(originalBillAmount)).append("\n");
    sb.append("    ownerCustomerName: ").append(toIndentedString(ownerCustomerName)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    ownerUserName: ").append(toIndentedString(ownerUserName)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    payableAmount: ").append(toIndentedString(payableAmount)).append("\n");
    sb.append("    payerCustomerName: ").append(toIndentedString(payerCustomerName)).append("\n");
    sb.append("    payerID: ").append(toIndentedString(payerID)).append("\n");
    sb.append("    payerUserName: ").append(toIndentedString(payerUserName)).append("\n");
    sb.append("    posttaxAmount: ").append(toIndentedString(posttaxAmount)).append("\n");
    sb.append("    pretaxAmount: ").append(toIndentedString(pretaxAmount)).append("\n");
    sb.append("    pretaxRealValue: ").append(toIndentedString(pretaxRealValue)).append("\n");
    sb.append("    realValue: ").append(toIndentedString(realValue)).append("\n");
    sb.append("    sellerCustomerName: ").append(toIndentedString(sellerCustomerName)).append("\n");
    sb.append("    sellerID: ").append(toIndentedString(sellerID)).append("\n");
    sb.append("    sellerUserName: ").append(toIndentedString(sellerUserName)).append("\n");
    sb.append("    settlePosttaxAmount: ").append(toIndentedString(settlePosttaxAmount)).append("\n");
    sb.append("    settlePretaxAmount: ").append(toIndentedString(settlePretaxAmount)).append("\n");
    sb.append("    settlePretaxRealValue: ").append(toIndentedString(settlePretaxRealValue)).append("\n");
    sb.append("    settleRealValue: ").append(toIndentedString(settleRealValue)).append("\n");
    sb.append("    settleTax: ").append(toIndentedString(settleTax)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    subjectNo: ").append(toIndentedString(subjectNo)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    unpaidAmount: ").append(toIndentedString(unpaidAmount)).append("\n");
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
