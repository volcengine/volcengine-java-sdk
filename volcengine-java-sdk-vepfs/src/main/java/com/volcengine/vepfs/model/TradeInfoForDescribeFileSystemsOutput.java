/*
 * vepfs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vepfs.model;

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
 * TradeInfoForDescribeFileSystemsOutput
 */


public class TradeInfoForDescribeFileSystemsOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CustomerName")
  private String customerName = null;

  @SerializedName("Identity")
  private String identity = null;

  @SerializedName("IsTest")
  private Boolean isTest = null;

  public TradeInfoForDescribeFileSystemsOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public TradeInfoForDescribeFileSystemsOutput customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @Schema(description = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public TradeInfoForDescribeFileSystemsOutput identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @Schema(description = "")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public TradeInfoForDescribeFileSystemsOutput isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * Get isTest
   * @return isTest
  **/
  @Schema(description = "")
  public Boolean isIsTest() {
    return isTest;
  }

  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeInfoForDescribeFileSystemsOutput tradeInfoForDescribeFileSystemsOutput = (TradeInfoForDescribeFileSystemsOutput) o;
    return Objects.equals(this.accountId, tradeInfoForDescribeFileSystemsOutput.accountId) &&
        Objects.equals(this.customerName, tradeInfoForDescribeFileSystemsOutput.customerName) &&
        Objects.equals(this.identity, tradeInfoForDescribeFileSystemsOutput.identity) &&
        Objects.equals(this.isTest, tradeInfoForDescribeFileSystemsOutput.isTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerName, identity, isTest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeInfoForDescribeFileSystemsOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
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