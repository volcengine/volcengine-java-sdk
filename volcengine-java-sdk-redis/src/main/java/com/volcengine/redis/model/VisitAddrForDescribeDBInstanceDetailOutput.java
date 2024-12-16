/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

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
 * VisitAddrForDescribeDBInstanceDetailOutput
 */



public class VisitAddrForDescribeDBInstanceDetailOutput {
  @SerializedName("AddrType")
  private String addrType = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("VIP")
  private String VIP = null;

  @SerializedName("VIPv6")
  private String viPv6 = null;

  public VisitAddrForDescribeDBInstanceDetailOutput addrType(String addrType) {
    this.addrType = addrType;
    return this;
  }

   /**
   * Get addrType
   * @return addrType
  **/
  @Schema(description = "")
  public String getAddrType() {
    return addrType;
  }

  public void setAddrType(String addrType) {
    this.addrType = addrType;
  }

  public VisitAddrForDescribeDBInstanceDetailOutput address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public VisitAddrForDescribeDBInstanceDetailOutput eipId(String eipId) {
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

  public VisitAddrForDescribeDBInstanceDetailOutput port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public VisitAddrForDescribeDBInstanceDetailOutput VIP(String VIP) {
    this.VIP = VIP;
    return this;
  }

   /**
   * Get VIP
   * @return VIP
  **/
  @Schema(description = "")
  public String getVIP() {
    return VIP;
  }

  public void setVIP(String VIP) {
    this.VIP = VIP;
  }

  public VisitAddrForDescribeDBInstanceDetailOutput viPv6(String viPv6) {
    this.viPv6 = viPv6;
    return this;
  }

   /**
   * Get viPv6
   * @return viPv6
  **/
  @Schema(description = "")
  public String getViPv6() {
    return viPv6;
  }

  public void setViPv6(String viPv6) {
    this.viPv6 = viPv6;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitAddrForDescribeDBInstanceDetailOutput visitAddrForDescribeDBInstanceDetailOutput = (VisitAddrForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.addrType, visitAddrForDescribeDBInstanceDetailOutput.addrType) &&
        Objects.equals(this.address, visitAddrForDescribeDBInstanceDetailOutput.address) &&
        Objects.equals(this.eipId, visitAddrForDescribeDBInstanceDetailOutput.eipId) &&
        Objects.equals(this.port, visitAddrForDescribeDBInstanceDetailOutput.port) &&
        Objects.equals(this.VIP, visitAddrForDescribeDBInstanceDetailOutput.VIP) &&
        Objects.equals(this.viPv6, visitAddrForDescribeDBInstanceDetailOutput.viPv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrType, address, eipId, port, VIP, viPv6);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitAddrForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    addrType: ").append(toIndentedString(addrType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    VIP: ").append(toIndentedString(VIP)).append("\n");
    sb.append("    viPv6: ").append(toIndentedString(viPv6)).append("\n");
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
