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
import com.volcengine.alb.model.EipForDescribeLoadBalancersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LoadBalancerAddressForDescribeLoadBalancersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-31T15:50:05.609740+08:00[Asia/Shanghai]")
public class LoadBalancerAddressForDescribeLoadBalancersOutput {
  @SerializedName("Eip")
  private EipForDescribeLoadBalancersOutput eip = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("EniAddress")
  private String eniAddress = null;

  @SerializedName("EniId")
  private String eniId = null;

  public LoadBalancerAddressForDescribeLoadBalancersOutput eip(EipForDescribeLoadBalancersOutput eip) {
    this.eip = eip;
    return this;
  }

   /**
   * Get eip
   * @return eip
  **/
  @Valid
  @Schema(description = "")
  public EipForDescribeLoadBalancersOutput getEip() {
    return eip;
  }

  public void setEip(EipForDescribeLoadBalancersOutput eip) {
    this.eip = eip;
  }

  public LoadBalancerAddressForDescribeLoadBalancersOutput eipAddress(String eipAddress) {
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

  public LoadBalancerAddressForDescribeLoadBalancersOutput eipId(String eipId) {
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

  public LoadBalancerAddressForDescribeLoadBalancersOutput eniAddress(String eniAddress) {
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

  public LoadBalancerAddressForDescribeLoadBalancersOutput eniId(String eniId) {
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
    LoadBalancerAddressForDescribeLoadBalancersOutput loadBalancerAddressForDescribeLoadBalancersOutput = (LoadBalancerAddressForDescribeLoadBalancersOutput) o;
    return Objects.equals(this.eip, loadBalancerAddressForDescribeLoadBalancersOutput.eip) &&
        Objects.equals(this.eipAddress, loadBalancerAddressForDescribeLoadBalancersOutput.eipAddress) &&
        Objects.equals(this.eipId, loadBalancerAddressForDescribeLoadBalancersOutput.eipId) &&
        Objects.equals(this.eniAddress, loadBalancerAddressForDescribeLoadBalancersOutput.eniAddress) &&
        Objects.equals(this.eniId, loadBalancerAddressForDescribeLoadBalancersOutput.eniId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eip, eipAddress, eipId, eniAddress, eniId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerAddressForDescribeLoadBalancersOutput {\n");
    
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
