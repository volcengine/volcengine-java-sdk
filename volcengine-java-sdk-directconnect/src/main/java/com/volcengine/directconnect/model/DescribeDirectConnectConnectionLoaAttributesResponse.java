/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.directconnect.model.EngineerForDescribeDirectConnectConnectionLoaAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectConnectionLoaAttributesResponse
 */


public class DescribeDirectConnectConnectionLoaAttributesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("CompanyName")
  private String companyName = null;

  @SerializedName("ConstructionTime")
  private String constructionTime = null;

  @SerializedName("DirectConnectConnectionId")
  private String directConnectConnectionId = null;

  @SerializedName("Engineers")
  private List<EngineerForDescribeDirectConnectConnectionLoaAttributesOutput> engineers = null;

  @SerializedName("LineType")
  private String lineType = null;

  @SerializedName("LoaContent")
  private String loaContent = null;

  @SerializedName("LoaContentType")
  private String loaContentType = null;

  @SerializedName("PeerLocation")
  private String peerLocation = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("SystemIntegrator")
  private String systemIntegrator = null;

  public DescribeDirectConnectConnectionLoaAttributesResponse bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @Schema(description = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse constructionTime(String constructionTime) {
    this.constructionTime = constructionTime;
    return this;
  }

   /**
   * Get constructionTime
   * @return constructionTime
  **/
  @Schema(description = "")
  public String getConstructionTime() {
    return constructionTime;
  }

  public void setConstructionTime(String constructionTime) {
    this.constructionTime = constructionTime;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse directConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
    return this;
  }

   /**
   * Get directConnectConnectionId
   * @return directConnectConnectionId
  **/
  @Schema(description = "")
  public String getDirectConnectConnectionId() {
    return directConnectConnectionId;
  }

  public void setDirectConnectConnectionId(String directConnectConnectionId) {
    this.directConnectConnectionId = directConnectConnectionId;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse engineers(List<EngineerForDescribeDirectConnectConnectionLoaAttributesOutput> engineers) {
    this.engineers = engineers;
    return this;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse addEngineersItem(EngineerForDescribeDirectConnectConnectionLoaAttributesOutput engineersItem) {
    if (this.engineers == null) {
      this.engineers = new ArrayList<EngineerForDescribeDirectConnectConnectionLoaAttributesOutput>();
    }
    this.engineers.add(engineersItem);
    return this;
  }

   /**
   * Get engineers
   * @return engineers
  **/
  @Valid
  @Schema(description = "")
  public List<EngineerForDescribeDirectConnectConnectionLoaAttributesOutput> getEngineers() {
    return engineers;
  }

  public void setEngineers(List<EngineerForDescribeDirectConnectConnectionLoaAttributesOutput> engineers) {
    this.engineers = engineers;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse lineType(String lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @Schema(description = "")
  public String getLineType() {
    return lineType;
  }

  public void setLineType(String lineType) {
    this.lineType = lineType;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse loaContent(String loaContent) {
    this.loaContent = loaContent;
    return this;
  }

   /**
   * Get loaContent
   * @return loaContent
  **/
  @Schema(description = "")
  public String getLoaContent() {
    return loaContent;
  }

  public void setLoaContent(String loaContent) {
    this.loaContent = loaContent;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse loaContentType(String loaContentType) {
    this.loaContentType = loaContentType;
    return this;
  }

   /**
   * Get loaContentType
   * @return loaContentType
  **/
  @Schema(description = "")
  public String getLoaContentType() {
    return loaContentType;
  }

  public void setLoaContentType(String loaContentType) {
    this.loaContentType = loaContentType;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse peerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
    return this;
  }

   /**
   * Get peerLocation
   * @return peerLocation
  **/
  @Schema(description = "")
  public String getPeerLocation() {
    return peerLocation;
  }

  public void setPeerLocation(String peerLocation) {
    this.peerLocation = peerLocation;
  }

  public DescribeDirectConnectConnectionLoaAttributesResponse requestId(String requestId) {
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

  public DescribeDirectConnectConnectionLoaAttributesResponse systemIntegrator(String systemIntegrator) {
    this.systemIntegrator = systemIntegrator;
    return this;
  }

   /**
   * Get systemIntegrator
   * @return systemIntegrator
  **/
  @Schema(description = "")
  public String getSystemIntegrator() {
    return systemIntegrator;
  }

  public void setSystemIntegrator(String systemIntegrator) {
    this.systemIntegrator = systemIntegrator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectConnectionLoaAttributesResponse describeDirectConnectConnectionLoaAttributesResponse = (DescribeDirectConnectConnectionLoaAttributesResponse) o;
    return Objects.equals(this.bandwidth, describeDirectConnectConnectionLoaAttributesResponse.bandwidth) &&
        Objects.equals(this.companyName, describeDirectConnectConnectionLoaAttributesResponse.companyName) &&
        Objects.equals(this.constructionTime, describeDirectConnectConnectionLoaAttributesResponse.constructionTime) &&
        Objects.equals(this.directConnectConnectionId, describeDirectConnectConnectionLoaAttributesResponse.directConnectConnectionId) &&
        Objects.equals(this.engineers, describeDirectConnectConnectionLoaAttributesResponse.engineers) &&
        Objects.equals(this.lineType, describeDirectConnectConnectionLoaAttributesResponse.lineType) &&
        Objects.equals(this.loaContent, describeDirectConnectConnectionLoaAttributesResponse.loaContent) &&
        Objects.equals(this.loaContentType, describeDirectConnectConnectionLoaAttributesResponse.loaContentType) &&
        Objects.equals(this.peerLocation, describeDirectConnectConnectionLoaAttributesResponse.peerLocation) &&
        Objects.equals(this.requestId, describeDirectConnectConnectionLoaAttributesResponse.requestId) &&
        Objects.equals(this.systemIntegrator, describeDirectConnectConnectionLoaAttributesResponse.systemIntegrator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, companyName, constructionTime, directConnectConnectionId, engineers, lineType, loaContent, loaContentType, peerLocation, requestId, systemIntegrator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectConnectionLoaAttributesResponse {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    constructionTime: ").append(toIndentedString(constructionTime)).append("\n");
    sb.append("    directConnectConnectionId: ").append(toIndentedString(directConnectConnectionId)).append("\n");
    sb.append("    engineers: ").append(toIndentedString(engineers)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    loaContent: ").append(toIndentedString(loaContent)).append("\n");
    sb.append("    loaContentType: ").append(toIndentedString(loaContentType)).append("\n");
    sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    systemIntegrator: ").append(toIndentedString(systemIntegrator)).append("\n");
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
