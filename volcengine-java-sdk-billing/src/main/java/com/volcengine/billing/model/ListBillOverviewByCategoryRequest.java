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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListBillOverviewByCategoryRequest
 */


public class ListBillOverviewByCategoryRequest {
  @SerializedName("BillCategoryParent")
  private List<String> billCategoryParent = null;

  @SerializedName("BillPeriod")
  private String billPeriod = null;

  @SerializedName("BillingMode")
  private List<String> billingMode = null;

  public ListBillOverviewByCategoryRequest billCategoryParent(List<String> billCategoryParent) {
    this.billCategoryParent = billCategoryParent;
    return this;
  }

  public ListBillOverviewByCategoryRequest addBillCategoryParentItem(String billCategoryParentItem) {
    if (this.billCategoryParent == null) {
      this.billCategoryParent = new ArrayList<String>();
    }
    this.billCategoryParent.add(billCategoryParentItem);
    return this;
  }

   /**
   * Get billCategoryParent
   * @return billCategoryParent
  **/
  @Schema(description = "")
  public List<String> getBillCategoryParent() {
    return billCategoryParent;
  }

  public void setBillCategoryParent(List<String> billCategoryParent) {
    this.billCategoryParent = billCategoryParent;
  }

  public ListBillOverviewByCategoryRequest billPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
    return this;
  }

   /**
   * Get billPeriod
   * @return billPeriod
  **/
  @NotNull
 @Size(min=7,max=7)  @Schema(required = true, description = "")
  public String getBillPeriod() {
    return billPeriod;
  }

  public void setBillPeriod(String billPeriod) {
    this.billPeriod = billPeriod;
  }

  public ListBillOverviewByCategoryRequest billingMode(List<String> billingMode) {
    this.billingMode = billingMode;
    return this;
  }

  public ListBillOverviewByCategoryRequest addBillingModeItem(String billingModeItem) {
    if (this.billingMode == null) {
      this.billingMode = new ArrayList<String>();
    }
    this.billingMode.add(billingModeItem);
    return this;
  }

   /**
   * Get billingMode
   * @return billingMode
  **/
  @Schema(description = "")
  public List<String> getBillingMode() {
    return billingMode;
  }

  public void setBillingMode(List<String> billingMode) {
    this.billingMode = billingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBillOverviewByCategoryRequest listBillOverviewByCategoryRequest = (ListBillOverviewByCategoryRequest) o;
    return Objects.equals(this.billCategoryParent, listBillOverviewByCategoryRequest.billCategoryParent) &&
        Objects.equals(this.billPeriod, listBillOverviewByCategoryRequest.billPeriod) &&
        Objects.equals(this.billingMode, listBillOverviewByCategoryRequest.billingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billCategoryParent, billPeriod, billingMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBillOverviewByCategoryRequest {\n");
    
    sb.append("    billCategoryParent: ").append(toIndentedString(billCategoryParent)).append("\n");
    sb.append("    billPeriod: ").append(toIndentedString(billPeriod)).append("\n");
    sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
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
