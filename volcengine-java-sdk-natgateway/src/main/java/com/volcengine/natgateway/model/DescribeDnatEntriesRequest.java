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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDnatEntriesRequest
 */



public class DescribeDnatEntriesRequest {
  @SerializedName("DnatEntryIds")
  private List<String> dnatEntryIds = null;

  @SerializedName("DnatEntryName")
  private String dnatEntryName = null;

  @SerializedName("ExternalIp")
  private String externalIp = null;

  @SerializedName("ExternalPort")
  private String externalPort = null;

  @SerializedName("InternalIp")
  private String internalIp = null;

  @SerializedName("InternalPort")
  private String internalPort = null;

  @SerializedName("NatGatewayId")
  private String natGatewayId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Protocol")
  private String protocol = null;

  public DescribeDnatEntriesRequest dnatEntryIds(List<String> dnatEntryIds) {
    this.dnatEntryIds = dnatEntryIds;
    return this;
  }

  public DescribeDnatEntriesRequest addDnatEntryIdsItem(String dnatEntryIdsItem) {
    if (this.dnatEntryIds == null) {
      this.dnatEntryIds = new ArrayList<String>();
    }
    this.dnatEntryIds.add(dnatEntryIdsItem);
    return this;
  }

   /**
   * Get dnatEntryIds
   * @return dnatEntryIds
  **/
  @Schema(description = "")
  public List<String> getDnatEntryIds() {
    return dnatEntryIds;
  }

  public void setDnatEntryIds(List<String> dnatEntryIds) {
    this.dnatEntryIds = dnatEntryIds;
  }

  public DescribeDnatEntriesRequest dnatEntryName(String dnatEntryName) {
    this.dnatEntryName = dnatEntryName;
    return this;
  }

   /**
   * Get dnatEntryName
   * @return dnatEntryName
  **/
  @Schema(description = "")
  public String getDnatEntryName() {
    return dnatEntryName;
  }

  public void setDnatEntryName(String dnatEntryName) {
    this.dnatEntryName = dnatEntryName;
  }

  public DescribeDnatEntriesRequest externalIp(String externalIp) {
    this.externalIp = externalIp;
    return this;
  }

   /**
   * Get externalIp
   * @return externalIp
  **/
  @Schema(description = "")
  public String getExternalIp() {
    return externalIp;
  }

  public void setExternalIp(String externalIp) {
    this.externalIp = externalIp;
  }

  public DescribeDnatEntriesRequest externalPort(String externalPort) {
    this.externalPort = externalPort;
    return this;
  }

   /**
   * Get externalPort
   * @return externalPort
  **/
  @Schema(description = "")
  public String getExternalPort() {
    return externalPort;
  }

  public void setExternalPort(String externalPort) {
    this.externalPort = externalPort;
  }

  public DescribeDnatEntriesRequest internalIp(String internalIp) {
    this.internalIp = internalIp;
    return this;
  }

   /**
   * Get internalIp
   * @return internalIp
  **/
  @Schema(description = "")
  public String getInternalIp() {
    return internalIp;
  }

  public void setInternalIp(String internalIp) {
    this.internalIp = internalIp;
  }

  public DescribeDnatEntriesRequest internalPort(String internalPort) {
    this.internalPort = internalPort;
    return this;
  }

   /**
   * Get internalPort
   * @return internalPort
  **/
  @Schema(description = "")
  public String getInternalPort() {
    return internalPort;
  }

  public void setInternalPort(String internalPort) {
    this.internalPort = internalPort;
  }

  public DescribeDnatEntriesRequest natGatewayId(String natGatewayId) {
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

  public DescribeDnatEntriesRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeDnatEntriesRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * maximum: 100
   * @return pageSize
  **/
 @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeDnatEntriesRequest protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDnatEntriesRequest describeDnatEntriesRequest = (DescribeDnatEntriesRequest) o;
    return Objects.equals(this.dnatEntryIds, describeDnatEntriesRequest.dnatEntryIds) &&
        Objects.equals(this.dnatEntryName, describeDnatEntriesRequest.dnatEntryName) &&
        Objects.equals(this.externalIp, describeDnatEntriesRequest.externalIp) &&
        Objects.equals(this.externalPort, describeDnatEntriesRequest.externalPort) &&
        Objects.equals(this.internalIp, describeDnatEntriesRequest.internalIp) &&
        Objects.equals(this.internalPort, describeDnatEntriesRequest.internalPort) &&
        Objects.equals(this.natGatewayId, describeDnatEntriesRequest.natGatewayId) &&
        Objects.equals(this.pageNumber, describeDnatEntriesRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDnatEntriesRequest.pageSize) &&
        Objects.equals(this.protocol, describeDnatEntriesRequest.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnatEntryIds, dnatEntryName, externalIp, externalPort, internalIp, internalPort, natGatewayId, pageNumber, pageSize, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDnatEntriesRequest {\n");
    
    sb.append("    dnatEntryIds: ").append(toIndentedString(dnatEntryIds)).append("\n");
    sb.append("    dnatEntryName: ").append(toIndentedString(dnatEntryName)).append("\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
    sb.append("    externalPort: ").append(toIndentedString(externalPort)).append("\n");
    sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
    sb.append("    internalPort: ").append(toIndentedString(internalPort)).append("\n");
    sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
