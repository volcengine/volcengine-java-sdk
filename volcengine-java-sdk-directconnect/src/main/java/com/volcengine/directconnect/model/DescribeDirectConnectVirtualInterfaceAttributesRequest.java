/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * DescribeDirectConnectVirtualInterfaceAttributesRequest
 */


public class DescribeDirectConnectVirtualInterfaceAttributesRequest {
  @SerializedName("VirtualInterfaceId")
  private String virtualInterfaceId = null;

  public DescribeDirectConnectVirtualInterfaceAttributesRequest virtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
    return this;
  }

   /**
   * Get virtualInterfaceId
   * @return virtualInterfaceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVirtualInterfaceId() {
    return virtualInterfaceId;
  }

  public void setVirtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectVirtualInterfaceAttributesRequest describeDirectConnectVirtualInterfaceAttributesRequest = (DescribeDirectConnectVirtualInterfaceAttributesRequest) o;
    return Objects.equals(this.virtualInterfaceId, describeDirectConnectVirtualInterfaceAttributesRequest.virtualInterfaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualInterfaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectVirtualInterfaceAttributesRequest {\n");
    
    sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
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
