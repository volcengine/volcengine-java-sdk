/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

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
 * CreateDXPConnectionOrderResponse
 */



public class CreateDXPConnectionOrderResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PreOrderNumbers")
  private List<String> preOrderNumbers = null;

  public CreateDXPConnectionOrderResponse preOrderNumbers(List<String> preOrderNumbers) {
    this.preOrderNumbers = preOrderNumbers;
    return this;
  }

  public CreateDXPConnectionOrderResponse addPreOrderNumbersItem(String preOrderNumbersItem) {
    if (this.preOrderNumbers == null) {
      this.preOrderNumbers = new ArrayList<String>();
    }
    this.preOrderNumbers.add(preOrderNumbersItem);
    return this;
  }

   /**
   * Get preOrderNumbers
   * @return preOrderNumbers
  **/
  @Schema(description = "")
  public List<String> getPreOrderNumbers() {
    return preOrderNumbers;
  }

  public void setPreOrderNumbers(List<String> preOrderNumbers) {
    this.preOrderNumbers = preOrderNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDXPConnectionOrderResponse createDXPConnectionOrderResponse = (CreateDXPConnectionOrderResponse) o;
    return Objects.equals(this.preOrderNumbers, createDXPConnectionOrderResponse.preOrderNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preOrderNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDXPConnectionOrderResponse {\n");
    
    sb.append("    preOrderNumbers: ").append(toIndentedString(preOrderNumbers)).append("\n");
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
