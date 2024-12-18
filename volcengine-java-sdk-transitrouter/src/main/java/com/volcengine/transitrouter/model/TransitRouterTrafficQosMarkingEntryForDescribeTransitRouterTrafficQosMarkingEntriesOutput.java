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
 * TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput
 */



public class TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

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

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TransitRouterTrafficQosMarkingEntryId")
  private String transitRouterTrafficQosMarkingEntryId = null;

  @SerializedName("TransitRouterTrafficQosMarkingEntryName")
  private String transitRouterTrafficQosMarkingEntryName = null;

  @SerializedName("TransitRouterTrafficQosMarkingPolicyId")
  private String transitRouterTrafficQosMarkingPolicyId = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput description(String description) {
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

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @Schema(description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput destinationPortEnd(Integer destinationPortEnd) {
    this.destinationPortEnd = destinationPortEnd;
    return this;
  }

   /**
   * Get destinationPortEnd
   * @return destinationPortEnd
  **/
  @Schema(description = "")
  public Integer getDestinationPortEnd() {
    return destinationPortEnd;
  }

  public void setDestinationPortEnd(Integer destinationPortEnd) {
    this.destinationPortEnd = destinationPortEnd;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput destinationPortStart(Integer destinationPortStart) {
    this.destinationPortStart = destinationPortStart;
    return this;
  }

   /**
   * Get destinationPortStart
   * @return destinationPortStart
  **/
  @Schema(description = "")
  public Integer getDestinationPortStart() {
    return destinationPortStart;
  }

  public void setDestinationPortStart(Integer destinationPortStart) {
    this.destinationPortStart = destinationPortStart;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput matchDscp(Integer matchDscp) {
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

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput protocol(String protocol) {
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

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput remarkingDscp(Integer remarkingDscp) {
    this.remarkingDscp = remarkingDscp;
    return this;
  }

   /**
   * Get remarkingDscp
   * @return remarkingDscp
  **/
  @Schema(description = "")
  public Integer getRemarkingDscp() {
    return remarkingDscp;
  }

  public void setRemarkingDscp(Integer remarkingDscp) {
    this.remarkingDscp = remarkingDscp;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput sourceCidrBlock(String sourceCidrBlock) {
    this.sourceCidrBlock = sourceCidrBlock;
    return this;
  }

   /**
   * Get sourceCidrBlock
   * @return sourceCidrBlock
  **/
  @Schema(description = "")
  public String getSourceCidrBlock() {
    return sourceCidrBlock;
  }

  public void setSourceCidrBlock(String sourceCidrBlock) {
    this.sourceCidrBlock = sourceCidrBlock;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput sourcePortEnd(Integer sourcePortEnd) {
    this.sourcePortEnd = sourcePortEnd;
    return this;
  }

   /**
   * Get sourcePortEnd
   * @return sourcePortEnd
  **/
  @Schema(description = "")
  public Integer getSourcePortEnd() {
    return sourcePortEnd;
  }

  public void setSourcePortEnd(Integer sourcePortEnd) {
    this.sourcePortEnd = sourcePortEnd;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput sourcePortStart(Integer sourcePortStart) {
    this.sourcePortStart = sourcePortStart;
    return this;
  }

   /**
   * Get sourcePortStart
   * @return sourcePortStart
  **/
  @Schema(description = "")
  public Integer getSourcePortStart() {
    return sourcePortStart;
  }

  public void setSourcePortStart(Integer sourcePortStart) {
    this.sourcePortStart = sourcePortStart;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput status(String status) {
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

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput transitRouterTrafficQosMarkingEntryId(String transitRouterTrafficQosMarkingEntryId) {
    this.transitRouterTrafficQosMarkingEntryId = transitRouterTrafficQosMarkingEntryId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosMarkingEntryId
   * @return transitRouterTrafficQosMarkingEntryId
  **/
  @Schema(description = "")
  public String getTransitRouterTrafficQosMarkingEntryId() {
    return transitRouterTrafficQosMarkingEntryId;
  }

  public void setTransitRouterTrafficQosMarkingEntryId(String transitRouterTrafficQosMarkingEntryId) {
    this.transitRouterTrafficQosMarkingEntryId = transitRouterTrafficQosMarkingEntryId;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput transitRouterTrafficQosMarkingEntryName(String transitRouterTrafficQosMarkingEntryName) {
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

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput transitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
    return this;
  }

   /**
   * Get transitRouterTrafficQosMarkingPolicyId
   * @return transitRouterTrafficQosMarkingPolicyId
  **/
  @Schema(description = "")
  public String getTransitRouterTrafficQosMarkingPolicyId() {
    return transitRouterTrafficQosMarkingPolicyId;
  }

  public void setTransitRouterTrafficQosMarkingPolicyId(String transitRouterTrafficQosMarkingPolicyId) {
    this.transitRouterTrafficQosMarkingPolicyId = transitRouterTrafficQosMarkingPolicyId;
  }

  public TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput = (TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput) o;
    return Objects.equals(this.creationTime, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.creationTime) &&
        Objects.equals(this.description, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.description) &&
        Objects.equals(this.destinationCidrBlock, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.destinationCidrBlock) &&
        Objects.equals(this.destinationPortEnd, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.destinationPortEnd) &&
        Objects.equals(this.destinationPortStart, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.destinationPortStart) &&
        Objects.equals(this.matchDscp, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.matchDscp) &&
        Objects.equals(this.priority, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.priority) &&
        Objects.equals(this.protocol, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.protocol) &&
        Objects.equals(this.remarkingDscp, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.remarkingDscp) &&
        Objects.equals(this.sourceCidrBlock, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.sourceCidrBlock) &&
        Objects.equals(this.sourcePortEnd, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.sourcePortEnd) &&
        Objects.equals(this.sourcePortStart, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.sourcePortStart) &&
        Objects.equals(this.status, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.status) &&
        Objects.equals(this.transitRouterTrafficQosMarkingEntryId, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.transitRouterTrafficQosMarkingEntryId) &&
        Objects.equals(this.transitRouterTrafficQosMarkingEntryName, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.transitRouterTrafficQosMarkingEntryName) &&
        Objects.equals(this.transitRouterTrafficQosMarkingPolicyId, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.transitRouterTrafficQosMarkingPolicyId) &&
        Objects.equals(this.updateTime, transitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, destinationCidrBlock, destinationPortEnd, destinationPortStart, matchDscp, priority, protocol, remarkingDscp, sourceCidrBlock, sourcePortEnd, sourcePortStart, status, transitRouterTrafficQosMarkingEntryId, transitRouterTrafficQosMarkingEntryName, transitRouterTrafficQosMarkingPolicyId, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterTrafficQosMarkingEntryForDescribeTransitRouterTrafficQosMarkingEntriesOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingEntryId: ").append(toIndentedString(transitRouterTrafficQosMarkingEntryId)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingEntryName: ").append(toIndentedString(transitRouterTrafficQosMarkingEntryName)).append("\n");
    sb.append("    transitRouterTrafficQosMarkingPolicyId: ").append(toIndentedString(transitRouterTrafficQosMarkingPolicyId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
