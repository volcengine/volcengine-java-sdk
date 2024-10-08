/*
 * privatelink
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatelink.model;

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
 * UnAssignPrivateIpAddressesFromVpcLinkRequest
 */



public class UnAssignPrivateIpAddressesFromVpcLinkRequest {
  @SerializedName("PrivateIpAddresses")
  private List<String> privateIpAddresses = null;

  @SerializedName("VpcLinkId")
  private String vpcLinkId = null;

  public UnAssignPrivateIpAddressesFromVpcLinkRequest privateIpAddresses(List<String> privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
    return this;
  }

  public UnAssignPrivateIpAddressesFromVpcLinkRequest addPrivateIpAddressesItem(String privateIpAddressesItem) {
    if (this.privateIpAddresses == null) {
      this.privateIpAddresses = new ArrayList<String>();
    }
    this.privateIpAddresses.add(privateIpAddressesItem);
    return this;
  }

   /**
   * Get privateIpAddresses
   * @return privateIpAddresses
  **/
  @Schema(description = "")
  public List<String> getPrivateIpAddresses() {
    return privateIpAddresses;
  }

  public void setPrivateIpAddresses(List<String> privateIpAddresses) {
    this.privateIpAddresses = privateIpAddresses;
  }

  public UnAssignPrivateIpAddressesFromVpcLinkRequest vpcLinkId(String vpcLinkId) {
    this.vpcLinkId = vpcLinkId;
    return this;
  }

   /**
   * Get vpcLinkId
   * @return vpcLinkId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcLinkId() {
    return vpcLinkId;
  }

  public void setVpcLinkId(String vpcLinkId) {
    this.vpcLinkId = vpcLinkId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnAssignPrivateIpAddressesFromVpcLinkRequest unAssignPrivateIpAddressesFromVpcLinkRequest = (UnAssignPrivateIpAddressesFromVpcLinkRequest) o;
    return Objects.equals(this.privateIpAddresses, unAssignPrivateIpAddressesFromVpcLinkRequest.privateIpAddresses) &&
        Objects.equals(this.vpcLinkId, unAssignPrivateIpAddressesFromVpcLinkRequest.vpcLinkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateIpAddresses, vpcLinkId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnAssignPrivateIpAddressesFromVpcLinkRequest {\n");
    
    sb.append("    privateIpAddresses: ").append(toIndentedString(privateIpAddresses)).append("\n");
    sb.append("    vpcLinkId: ").append(toIndentedString(vpcLinkId)).append("\n");
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
