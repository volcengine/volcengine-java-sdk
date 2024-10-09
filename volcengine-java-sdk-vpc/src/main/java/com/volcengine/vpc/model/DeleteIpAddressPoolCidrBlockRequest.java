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
 * DeleteIpAddressPoolCidrBlockRequest
 */



public class DeleteIpAddressPoolCidrBlockRequest {
  @SerializedName("CidrBlock")
  private String cidrBlock = null;

  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("IpAddressPoolId")
  private String ipAddressPoolId = null;

  public DeleteIpAddressPoolCidrBlockRequest cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public DeleteIpAddressPoolCidrBlockRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public DeleteIpAddressPoolCidrBlockRequest ipAddressPoolId(String ipAddressPoolId) {
    this.ipAddressPoolId = ipAddressPoolId;
    return this;
  }

   /**
   * Get ipAddressPoolId
   * @return ipAddressPoolId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpAddressPoolId() {
    return ipAddressPoolId;
  }

  public void setIpAddressPoolId(String ipAddressPoolId) {
    this.ipAddressPoolId = ipAddressPoolId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteIpAddressPoolCidrBlockRequest deleteIpAddressPoolCidrBlockRequest = (DeleteIpAddressPoolCidrBlockRequest) o;
    return Objects.equals(this.cidrBlock, deleteIpAddressPoolCidrBlockRequest.cidrBlock) &&
        Objects.equals(this.clientToken, deleteIpAddressPoolCidrBlockRequest.clientToken) &&
        Objects.equals(this.ipAddressPoolId, deleteIpAddressPoolCidrBlockRequest.ipAddressPoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, clientToken, ipAddressPoolId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteIpAddressPoolCidrBlockRequest {\n");
    
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    ipAddressPoolId: ").append(toIndentedString(ipAddressPoolId)).append("\n");
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
