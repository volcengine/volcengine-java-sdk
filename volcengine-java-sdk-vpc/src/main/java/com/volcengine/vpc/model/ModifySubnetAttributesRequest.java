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
 * ModifySubnetAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:48.516414+08:00[Asia/Shanghai]")
public class ModifySubnetAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("EnableIPv6")
  private Boolean enableIPv6 = null;

  @SerializedName("IPv6CidrBlock")
  private Integer ipv6CidrBlock = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("SubnetName")
  private String subnetName = null;

  public ModifySubnetAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifySubnetAttributesRequest enableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
    return this;
  }

   /**
   * Get enableIPv6
   * @return enableIPv6
  **/
  @Schema(description = "")
  public Boolean isEnableIPv6() {
    return enableIPv6;
  }

  public void setEnableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
  }

  public ModifySubnetAttributesRequest ipv6CidrBlock(Integer ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
    return this;
  }

   /**
   * Get ipv6CidrBlock
   * minimum: 0
   * maximum: 255
   * @return ipv6CidrBlock
  **/
 @Min(0) @Max(255)  @Schema(description = "")
  public Integer getIpv6CidrBlock() {
    return ipv6CidrBlock;
  }

  public void setIpv6CidrBlock(Integer ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
  }

  public ModifySubnetAttributesRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public ModifySubnetAttributesRequest subnetName(String subnetName) {
    this.subnetName = subnetName;
    return this;
  }

   /**
   * Get subnetName
   * @return subnetName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getSubnetName() {
    return subnetName;
  }

  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifySubnetAttributesRequest modifySubnetAttributesRequest = (ModifySubnetAttributesRequest) o;
    return Objects.equals(this.description, modifySubnetAttributesRequest.description) &&
        Objects.equals(this.enableIPv6, modifySubnetAttributesRequest.enableIPv6) &&
        Objects.equals(this.ipv6CidrBlock, modifySubnetAttributesRequest.ipv6CidrBlock) &&
        Objects.equals(this.subnetId, modifySubnetAttributesRequest.subnetId) &&
        Objects.equals(this.subnetName, modifySubnetAttributesRequest.subnetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enableIPv6, ipv6CidrBlock, subnetId, subnetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifySubnetAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
    sb.append("    ipv6CidrBlock: ").append(toIndentedString(ipv6CidrBlock)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
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