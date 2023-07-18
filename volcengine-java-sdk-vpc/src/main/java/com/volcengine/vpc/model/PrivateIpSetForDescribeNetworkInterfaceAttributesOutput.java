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
import com.volcengine.vpc.model.AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PrivateIpSetForDescribeNetworkInterfaceAttributesOutput
 */



public class PrivateIpSetForDescribeNetworkInterfaceAttributesOutput {
  @SerializedName("AssociatedElasticIp")
  private AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput associatedElasticIp = null;

  @SerializedName("Primary")
  private Boolean primary = null;

  @SerializedName("PrivateIpAddress")
  private String privateIpAddress = null;

  public PrivateIpSetForDescribeNetworkInterfaceAttributesOutput associatedElasticIp(AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput associatedElasticIp) {
    this.associatedElasticIp = associatedElasticIp;
    return this;
  }

   /**
   * Get associatedElasticIp
   * @return associatedElasticIp
  **/
  @Valid
  @Schema(description = "")
  public AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput getAssociatedElasticIp() {
    return associatedElasticIp;
  }

  public void setAssociatedElasticIp(AssociatedElasticIpForDescribeNetworkInterfaceAttributesOutput associatedElasticIp) {
    this.associatedElasticIp = associatedElasticIp;
  }

  public PrivateIpSetForDescribeNetworkInterfaceAttributesOutput primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @Schema(description = "")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public PrivateIpSetForDescribeNetworkInterfaceAttributesOutput privateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
    return this;
  }

   /**
   * Get privateIpAddress
   * @return privateIpAddress
  **/
  @Schema(description = "")
  public String getPrivateIpAddress() {
    return privateIpAddress;
  }

  public void setPrivateIpAddress(String privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateIpSetForDescribeNetworkInterfaceAttributesOutput privateIpSetForDescribeNetworkInterfaceAttributesOutput = (PrivateIpSetForDescribeNetworkInterfaceAttributesOutput) o;
    return Objects.equals(this.associatedElasticIp, privateIpSetForDescribeNetworkInterfaceAttributesOutput.associatedElasticIp) &&
        Objects.equals(this.primary, privateIpSetForDescribeNetworkInterfaceAttributesOutput.primary) &&
        Objects.equals(this.privateIpAddress, privateIpSetForDescribeNetworkInterfaceAttributesOutput.privateIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedElasticIp, primary, privateIpAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateIpSetForDescribeNetworkInterfaceAttributesOutput {\n");
    
    sb.append("    associatedElasticIp: ").append(toIndentedString(associatedElasticIp)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
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
