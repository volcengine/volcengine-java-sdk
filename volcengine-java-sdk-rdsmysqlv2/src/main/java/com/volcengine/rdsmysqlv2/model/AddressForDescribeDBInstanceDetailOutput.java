/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * AddressForDescribeDBInstanceDetailOutput
 */



public class AddressForDescribeDBInstanceDetailOutput {
  @SerializedName("DNSVisibility")
  private Boolean dnSVisibility = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("IPAddress")
  private String ipAddress = null;

  @SerializedName("InternetProtocol")
  private String internetProtocol = null;

  @SerializedName("NetworkType")
  private String networkType = null;

  @SerializedName("Port")
  private String port = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  public AddressForDescribeDBInstanceDetailOutput dnSVisibility(Boolean dnSVisibility) {
    this.dnSVisibility = dnSVisibility;
    return this;
  }

   /**
   * Get dnSVisibility
   * @return dnSVisibility
  **/
  @Schema(description = "")
  public Boolean isDnSVisibility() {
    return dnSVisibility;
  }

  public void setDnSVisibility(Boolean dnSVisibility) {
    this.dnSVisibility = dnSVisibility;
  }

  public AddressForDescribeDBInstanceDetailOutput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AddressForDescribeDBInstanceDetailOutput eipId(String eipId) {
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

  public AddressForDescribeDBInstanceDetailOutput ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public AddressForDescribeDBInstanceDetailOutput internetProtocol(String internetProtocol) {
    this.internetProtocol = internetProtocol;
    return this;
  }

   /**
   * Get internetProtocol
   * @return internetProtocol
  **/
  @Schema(description = "")
  public String getInternetProtocol() {
    return internetProtocol;
  }

  public void setInternetProtocol(String internetProtocol) {
    this.internetProtocol = internetProtocol;
  }

  public AddressForDescribeDBInstanceDetailOutput networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Get networkType
   * @return networkType
  **/
  @Schema(description = "")
  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public AddressForDescribeDBInstanceDetailOutput port(String port) {
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

  public AddressForDescribeDBInstanceDetailOutput subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressForDescribeDBInstanceDetailOutput addressForDescribeDBInstanceDetailOutput = (AddressForDescribeDBInstanceDetailOutput) o;
    return Objects.equals(this.dnSVisibility, addressForDescribeDBInstanceDetailOutput.dnSVisibility) &&
        Objects.equals(this.domain, addressForDescribeDBInstanceDetailOutput.domain) &&
        Objects.equals(this.eipId, addressForDescribeDBInstanceDetailOutput.eipId) &&
        Objects.equals(this.ipAddress, addressForDescribeDBInstanceDetailOutput.ipAddress) &&
        Objects.equals(this.internetProtocol, addressForDescribeDBInstanceDetailOutput.internetProtocol) &&
        Objects.equals(this.networkType, addressForDescribeDBInstanceDetailOutput.networkType) &&
        Objects.equals(this.port, addressForDescribeDBInstanceDetailOutput.port) &&
        Objects.equals(this.subnetId, addressForDescribeDBInstanceDetailOutput.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnSVisibility, domain, eipId, ipAddress, internetProtocol, networkType, port, subnetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressForDescribeDBInstanceDetailOutput {\n");
    
    sb.append("    dnSVisibility: ").append(toIndentedString(dnSVisibility)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    internetProtocol: ").append(toIndentedString(internetProtocol)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
