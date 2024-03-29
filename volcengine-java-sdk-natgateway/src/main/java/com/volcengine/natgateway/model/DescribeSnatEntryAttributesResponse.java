/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.natgateway.model;

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
 * DescribeSnatEntryAttributesResponse
 */



public class DescribeSnatEntryAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("NatGatewayId")
  private String natGatewayId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SnatEntryId")
  private String snatEntryId = null;

  @SerializedName("SnatEntryName")
  private String snatEntryName = null;

  @SerializedName("SourceCidr")
  private String sourceCidr = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  public DescribeSnatEntryAttributesResponse eipAddress(String eipAddress) {
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

  public DescribeSnatEntryAttributesResponse eipId(String eipId) {
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

  public DescribeSnatEntryAttributesResponse natGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
    return this;
  }

   /**
   * Get natGatewayId
   * @return natGatewayId
  **/
  @Schema(description = "")
  public String getNatGatewayId() {
    return natGatewayId;
  }

  public void setNatGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
  }

  public DescribeSnatEntryAttributesResponse requestId(String requestId) {
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

  public DescribeSnatEntryAttributesResponse snatEntryId(String snatEntryId) {
    this.snatEntryId = snatEntryId;
    return this;
  }

   /**
   * Get snatEntryId
   * @return snatEntryId
  **/
  @Schema(description = "")
  public String getSnatEntryId() {
    return snatEntryId;
  }

  public void setSnatEntryId(String snatEntryId) {
    this.snatEntryId = snatEntryId;
  }

  public DescribeSnatEntryAttributesResponse snatEntryName(String snatEntryName) {
    this.snatEntryName = snatEntryName;
    return this;
  }

   /**
   * Get snatEntryName
   * @return snatEntryName
  **/
  @Schema(description = "")
  public String getSnatEntryName() {
    return snatEntryName;
  }

  public void setSnatEntryName(String snatEntryName) {
    this.snatEntryName = snatEntryName;
  }

  public DescribeSnatEntryAttributesResponse sourceCidr(String sourceCidr) {
    this.sourceCidr = sourceCidr;
    return this;
  }

   /**
   * Get sourceCidr
   * @return sourceCidr
  **/
  @Schema(description = "")
  public String getSourceCidr() {
    return sourceCidr;
  }

  public void setSourceCidr(String sourceCidr) {
    this.sourceCidr = sourceCidr;
  }

  public DescribeSnatEntryAttributesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DescribeSnatEntryAttributesResponse subnetId(String subnetId) {
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
    DescribeSnatEntryAttributesResponse describeSnatEntryAttributesResponse = (DescribeSnatEntryAttributesResponse) o;
    return Objects.equals(this.eipAddress, describeSnatEntryAttributesResponse.eipAddress) &&
        Objects.equals(this.eipId, describeSnatEntryAttributesResponse.eipId) &&
        Objects.equals(this.natGatewayId, describeSnatEntryAttributesResponse.natGatewayId) &&
        Objects.equals(this.requestId, describeSnatEntryAttributesResponse.requestId) &&
        Objects.equals(this.snatEntryId, describeSnatEntryAttributesResponse.snatEntryId) &&
        Objects.equals(this.snatEntryName, describeSnatEntryAttributesResponse.snatEntryName) &&
        Objects.equals(this.sourceCidr, describeSnatEntryAttributesResponse.sourceCidr) &&
        Objects.equals(this.status, describeSnatEntryAttributesResponse.status) &&
        Objects.equals(this.subnetId, describeSnatEntryAttributesResponse.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eipAddress, eipId, natGatewayId, requestId, snatEntryId, snatEntryName, sourceCidr, status, subnetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSnatEntryAttributesResponse {\n");
    
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    snatEntryId: ").append(toIndentedString(snatEntryId)).append("\n");
    sb.append("    snatEntryName: ").append(toIndentedString(snatEntryName)).append("\n");
    sb.append("    sourceCidr: ").append(toIndentedString(sourceCidr)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
