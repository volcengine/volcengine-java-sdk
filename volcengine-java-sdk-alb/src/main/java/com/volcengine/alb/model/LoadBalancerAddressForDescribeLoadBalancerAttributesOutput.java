/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.EipForDescribeLoadBalancerAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LoadBalancerAddressForDescribeLoadBalancerAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-26T18:47:55.368678+08:00[Asia/Shanghai]")
public class LoadBalancerAddressForDescribeLoadBalancerAttributesOutput {
  @SerializedName("Eip")
  private EipForDescribeLoadBalancerAttributesOutput eip = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("EniAddress")
  private String eniAddress = null;

  @SerializedName("EniId")
  private String eniId = null;

  public LoadBalancerAddressForDescribeLoadBalancerAttributesOutput eip(EipForDescribeLoadBalancerAttributesOutput eip) {
    this.eip = eip;
    return this;
  }

   /**
   * Get eip
   * @return eip
  **/
  @Valid
  @Schema(description = "")
  public EipForDescribeLoadBalancerAttributesOutput getEip() {
    return eip;
  }

  public void setEip(EipForDescribeLoadBalancerAttributesOutput eip) {
    this.eip = eip;
  }

  public LoadBalancerAddressForDescribeLoadBalancerAttributesOutput eipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Schema(description = "")
  public String getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
  }

  public LoadBalancerAddressForDescribeLoadBalancerAttributesOutput eipId(String eipId) {
    this.eipId = eipId;
    return this;
  }

   /**
   * Get eipId
   * @return eipId
  **/
  @Schema(description = "")
  public String getEipId() {
    return eipId;
  }

  public void setEipId(String eipId) {
    this.eipId = eipId;
  }

  public LoadBalancerAddressForDescribeLoadBalancerAttributesOutput eniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
    return this;
  }

   /**
   * Get eniAddress
   * @return eniAddress
  **/
  @Schema(description = "")
  public String getEniAddress() {
    return eniAddress;
  }

  public void setEniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
  }

  public LoadBalancerAddressForDescribeLoadBalancerAttributesOutput eniId(String eniId) {
    this.eniId = eniId;
    return this;
  }

   /**
   * Get eniId
   * @return eniId
  **/
  @Schema(description = "")
  public String getEniId() {
    return eniId;
  }

  public void setEniId(String eniId) {
    this.eniId = eniId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerAddressForDescribeLoadBalancerAttributesOutput loadBalancerAddressForDescribeLoadBalancerAttributesOutput = (LoadBalancerAddressForDescribeLoadBalancerAttributesOutput) o;
    return Objects.equals(this.eip, loadBalancerAddressForDescribeLoadBalancerAttributesOutput.eip) &&
        Objects.equals(this.eipAddress, loadBalancerAddressForDescribeLoadBalancerAttributesOutput.eipAddress) &&
        Objects.equals(this.eipId, loadBalancerAddressForDescribeLoadBalancerAttributesOutput.eipId) &&
        Objects.equals(this.eniAddress, loadBalancerAddressForDescribeLoadBalancerAttributesOutput.eniAddress) &&
        Objects.equals(this.eniId, loadBalancerAddressForDescribeLoadBalancerAttributesOutput.eniId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eip, eipAddress, eipId, eniAddress, eniId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerAddressForDescribeLoadBalancerAttributesOutput {\n");
    
    sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    eniAddress: ").append(toIndentedString(eniAddress)).append("\n");
    sb.append("    eniId: ").append(toIndentedString(eniId)).append("\n");
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
