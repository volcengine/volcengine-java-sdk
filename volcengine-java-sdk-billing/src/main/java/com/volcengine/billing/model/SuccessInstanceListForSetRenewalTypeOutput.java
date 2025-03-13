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
 * SuccessInstanceListForSetRenewalTypeOutput
 */



public class SuccessInstanceListForSetRenewalTypeOutput {
  @SerializedName("InstanceID")
  private String instanceID = null;

  @SerializedName("Product")
  private String product = null;

  public SuccessInstanceListForSetRenewalTypeOutput instanceID(String instanceID) {
    this.instanceID = instanceID;
    return this;
  }

   /**
   * Get instanceID
   * @return instanceID
  **/
  @Schema(description = "")
  public String getInstanceID() {
    return instanceID;
  }

  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }

  public SuccessInstanceListForSetRenewalTypeOutput product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessInstanceListForSetRenewalTypeOutput successInstanceListForSetRenewalTypeOutput = (SuccessInstanceListForSetRenewalTypeOutput) o;
    return Objects.equals(this.instanceID, successInstanceListForSetRenewalTypeOutput.instanceID) &&
        Objects.equals(this.product, successInstanceListForSetRenewalTypeOutput.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceID, product);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessInstanceListForSetRenewalTypeOutput {\n");
    
    sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
