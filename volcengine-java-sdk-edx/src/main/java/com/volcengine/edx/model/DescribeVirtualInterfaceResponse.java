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
import com.volcengine.edx.model.VIFForDescribeVirtualInterfaceOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVirtualInterfaceResponse
 */



public class DescribeVirtualInterfaceResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("VIF")
  private VIFForDescribeVirtualInterfaceOutput VIF = null;

  public DescribeVirtualInterfaceResponse VIF(VIFForDescribeVirtualInterfaceOutput VIF) {
    this.VIF = VIF;
    return this;
  }

   /**
   * Get VIF
   * @return VIF
  **/
  @Valid
  @Schema(description = "")
  public VIFForDescribeVirtualInterfaceOutput getVIF() {
    return VIF;
  }

  public void setVIF(VIFForDescribeVirtualInterfaceOutput VIF) {
    this.VIF = VIF;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVirtualInterfaceResponse describeVirtualInterfaceResponse = (DescribeVirtualInterfaceResponse) o;
    return Objects.equals(this.VIF, describeVirtualInterfaceResponse.VIF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(VIF);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVirtualInterfaceResponse {\n");
    
    sb.append("    VIF: ").append(toIndentedString(VIF)).append("\n");
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
