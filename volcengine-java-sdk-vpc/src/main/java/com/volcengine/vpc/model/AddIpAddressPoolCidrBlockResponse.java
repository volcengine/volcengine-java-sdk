/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * AddIpAddressPoolCidrBlockResponse
 */



public class AddIpAddressPoolCidrBlockResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CidrBlock")
  private String cidrBlock = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public AddIpAddressPoolCidrBlockResponse cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @Schema(description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public AddIpAddressPoolCidrBlockResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddIpAddressPoolCidrBlockResponse addIpAddressPoolCidrBlockResponse = (AddIpAddressPoolCidrBlockResponse) o;
    return Objects.equals(this.cidrBlock, addIpAddressPoolCidrBlockResponse.cidrBlock) &&
        Objects.equals(this.requestId, addIpAddressPoolCidrBlockResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddIpAddressPoolCidrBlockResponse {\n");
    
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
