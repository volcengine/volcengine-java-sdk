/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * CreateTransitRouterTrafficQosMarkingEntryRequest
 */



public class CreateTransitRouterTrafficQosMarkingEntryRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("DestinationPortEnd")
  private Integer destinationPortEnd = null;

  @SerializedName("DestinationPortStart")
  private Integer destinationPortStart = null;

  @SerializedName("MatchDscp")
  private Integer matchDscp = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("RemarkingDscp")
  private Integer remarkingDscp = null;

  @SerializedName("SourceCidrBlock")
  private String sourceCidrBlock = null;

  @SerializedName("SourcePortEnd")
  private Integer sourcePortEnd = null;

  @SerializedName("SourcePortStart")
  private Integer sourcePortStart = null;

  @SerializedName("TransitRouterTrafficQosMarkingEntryName")
  private String transitRouterTrafficQosMarkingEntryName = null;

  @SerializedName("TransitRouterTrafficQosMarkingPolicyId")
  private String transitRouterTrafficQosMarkingPolicyId = null;

  public CreateTransitRouterTrafficQosMarkingEntryRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest destinationPortEnd(Integer destinationPortEnd) {
    this.destinationPortEnd = destinationPortEnd;
    return this;
  }

   /**
   * Get destinationPortEnd
   * @return destinationPortEnd
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getDestinationPortEnd() {
    return destinationPortEnd;
  }

  public void setDestinationPortEnd(Integer destinationPortEnd) {
    this.destinationPortEnd = destinationPortEnd;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest destinationPortStart(Integer destinationPortStart) {
    this.destinationPortStart = destinationPortStart;
    return this;
  }

   /**
   * Get destinationPortStart
   * @return destinationPortStart
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getDestinationPortStart() {
    return destinationPortStart;
  }

  public void setDestinationPortStart(Integer destinationPortStart) {
    this.destinationPortStart = destinationPortStart;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest matchDscp(Integer matchDscp) {
    this.matchDscp = matchDscp;
    return this;
  }

   /**
   * Get matchDscp
   * @return matchDscp
  **/
  @Schema(description = "")
  public Integer getMatchDscp() {
    return matchDscp;
  }

  public void setMatchDscp(Integer matchDscp) {
    this.matchDscp = matchDscp;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest protocol(String protocol) {
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

  public CreateTransitRouterTrafficQosMarkingEntryRequest remarkingDscp(Integer remarkingDscp) {
    this.remarkingDscp = remarkingDscp;
    return this;
  }

   /**
   * Get remarkingDscp
   * @return remarkingDscp
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getRemarkingDscp() {
    return remarkingDscp;
  }

  public void setRemarkingDscp(Integer remarkingDscp) {
    this.remarkingDscp = remarkingDscp;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest sourceCidrBlock(String sourceCidrBlock) {
    this.sourceCidrBlock = sourceCidrBlock;
    return this;
  }

   /**
   * Get sourceCidrBlock
   * @return sourceCidrBlock
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSourceCidrBlock() {
    return sourceCidrBlock;
  }

  public void setSourceCidrBlock(String sourceCidrBlock) {
    this.sourceCidrBlock = sourceCidrBlock;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest sourcePortEnd(Integer sourcePortEnd) {
    this.sourcePortEnd = sourcePortEnd;
    return this;
  }

   /**
   * Get sourcePortEnd
   * @return sourcePortEnd
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSourcePortEnd() {
    return sourcePortEnd;
  }

  public void setSourcePortEnd(Integer sourcePortEnd) {
    this.sourcePortEnd = sourcePortEnd;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest sourcePortStart(Integer sourcePortStart) {
    this.sourcePortStart = sourcePortStart;
    return this;
  }

   /**
   * Get sourcePortStart
   * @return sourcePortStart
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getSourcePortStart() {
    return sourcePortStart;
  }

  public void setSourcePortStart(Integer sourcePortStart) {
    this.sourcePortStart = sourcePortStart;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest transitRouterTrafficQosMarkingEntryName(String transitRouterTrafficQosMarkingEntryName) {
    this.transitRouterTrafficQosMarkingEntryName = transitRouterTrafficQosMarkingEntryName;
    return this;
  }

   /**
   * Get transitRouterTrafficQosMarkingEntryName
   * @return transitRouterTrafficQosMarkingEntryName
  **/
  @Schema(description = "")
  public String getTransitRouterTrafficQosMarkingEntryName() {
    return transitRouterTrafficQosMarkingEntryName;
  }

  public void setTransitRouterTrafficQosMarkingEntryName(String transitRouterTrafficQosMarkingEntryName) {
    this.transitRouterTrafficQosMarkingEntryName = transitRouterTrafficQosMarkingEntryName;
  }

  public CreateTransitRouterTrafficQosMarkingEntryRequest transitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosMarkingPolicyId
   * @return transitRouterTrafficQosMarkingPolicyId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterTrafficQosMarkingPolicyId() {
    return transitRouterTrafficQosMarkingPolicyId;
  }

  public void setTransitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransitRouterTrafficQosMarkingEntryRequest createTransitRouterTrafficQosMarkingEntryRequest = (CreateTransitRouterTrafficQosMarkingEntryRequest) o;
    return Objects.equals(this.clientToken, createTransitRouterTrafficQosMarkingEntryRequest.clientToken) &&
        Objects.equals(this.description, createTransitRouterTrafficQosMarkingEntryRequest.description) &&
        Objects.equals(this.destinationCidrBlock, createTransitRouterTrafficQosMarkingEntryRequest.destinationCidrBlock) &&
        Objects.equals(this.destinationPortEnd, createTransitRouterTrafficQosMarkingEntryRequest.destinationPortEnd) &&
        Objects.equals(this.destinationPortStart, createTransitRouterTrafficQosMarkingEntryRequest.destinationPortStart) &&
        Objects.equals(this.matchDscp, createTransitRouterTrafficQosMarkingEntryRequest.matchDscp) &&
        Objects.equals(this.priority, createTransitRouterTrafficQosMarkingEntryRequest.priority) &&
        Objects.equals(this.protocol, createTransitRouterTrafficQosMarkingEntryRequest.protocol) &&
        Objects.equals(this.remarkingDscp, createTransitRouterTrafficQosMarkingEntryRequest.remarkingDscp) &&
        Objects.equals(this.sourceCidrBlock, createTransitRouterTrafficQosMarkingEntryRequest.sourceCidrBlock) &&
        Objects.equals(this.sourcePortEnd, createTransitRouterTrafficQosMarkingEntryRequest.sourcePortEnd) &&
        Objects.equals(this.sourcePortStart, createTransitRouterTrafficQosMarkingEntryRequest.sourcePortStart) &&
        Objects.equals(this.transitRouterTrafficQosMarkingEntryName, createTransitRouterTrafficQosMarkingEntryRequest.transitRouterTrafficQosMarkingEntryName) &&
        Objects.equals(this.transitRouterTrafficQosMarkingPolicyId, createTransitRouterTrafficQosMarkingEntryRequest.transitRouterTrafficQosMarkingPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, destinationCidrBlock, destinationPortEnd, destinationPortStart, matchDscp, priority, protocol, remarkingDscp, sourceCidrBlock, sourcePortEnd, sourcePortStart, transitRouterTrafficQosMarkingEntryName, transitRouterTrafficQosMarkingPolicyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransitRouterTrafficQosMarkingEntryRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    destinationPortEnd: ").append(toIndentedString(destinationPortEnd)).append("\n");
    sb.append("    destinationPortStart: ").append(toIndentedString(destinationPortStart)).append("\n");
    sb.append("    matchDscp: ").append(toIndentedString(matchDscp)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    remarkingDscp: ").append(toIndentedString(remarkingDscp)).append("\n");
    sb.append("    sourceCidrBlock: ").append(toIndentedString(sourceCidrBlock)).append("\n");
    sb.append("    sourcePortEnd: ").append(toIndentedString(sourcePortEnd)).append("\n");
    sb.append("    sourcePortStart: ").append(toIndentedString(sourcePortStart)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingEntryName: ").append(toIndentedString(transitRouterTrafficQosMarkingEntryName)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingPolicyId: ").append(toIndentedString(transitRouterTrafficQosMarkingPolicyId)).append("\n");
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
