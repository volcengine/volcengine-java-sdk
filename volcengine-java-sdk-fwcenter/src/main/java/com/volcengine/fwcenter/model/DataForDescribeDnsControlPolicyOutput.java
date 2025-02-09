/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.fwcenter.model.SourceForDescribeDnsControlPolicyOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForDescribeDnsControlPolicyOutput
 */



public class DataForDescribeDnsControlPolicyOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Destination")
  private String destination = null;

  @SerializedName("DestinationGroupList")
  private List<String> destinationGroupList = null;

  @SerializedName("DestinationType")
  private String destinationType = null;

  @SerializedName("DomainList")
  private List<String> domainList = null;

  @SerializedName("HitCnt")
  private Integer hitCnt = null;

  @SerializedName("LastHitTime")
  private Integer lastHitTime = null;

  @SerializedName("RuleId")
  private String ruleId = null;

  @SerializedName("Source")
  private List<SourceForDescribeDnsControlPolicyOutput> source = null;

  @SerializedName("Status")
  private Boolean status = null;

  @SerializedName("UseCount")
  private Integer useCount = null;

  public DataForDescribeDnsControlPolicyOutput accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DataForDescribeDnsControlPolicyOutput description(String description) {
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

  public DataForDescribeDnsControlPolicyOutput destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public DataForDescribeDnsControlPolicyOutput destinationGroupList(List<String> destinationGroupList) {
    this.destinationGroupList = destinationGroupList;
    return this;
  }

  public DataForDescribeDnsControlPolicyOutput addDestinationGroupListItem(String destinationGroupListItem) {
    if (this.destinationGroupList == null) {
      this.destinationGroupList = new ArrayList<String>();
    }
    this.destinationGroupList.add(destinationGroupListItem);
    return this;
  }

   /**
   * Get destinationGroupList
   * @return destinationGroupList
  **/
  @Schema(description = "")
  public List<String> getDestinationGroupList() {
    return destinationGroupList;
  }

  public void setDestinationGroupList(List<String> destinationGroupList) {
    this.destinationGroupList = destinationGroupList;
  }

  public DataForDescribeDnsControlPolicyOutput destinationType(String destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @Schema(description = "")
  public String getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(String destinationType) {
    this.destinationType = destinationType;
  }

  public DataForDescribeDnsControlPolicyOutput domainList(List<String> domainList) {
    this.domainList = domainList;
    return this;
  }

  public DataForDescribeDnsControlPolicyOutput addDomainListItem(String domainListItem) {
    if (this.domainList == null) {
      this.domainList = new ArrayList<String>();
    }
    this.domainList.add(domainListItem);
    return this;
  }

   /**
   * Get domainList
   * @return domainList
  **/
  @Schema(description = "")
  public List<String> getDomainList() {
    return domainList;
  }

  public void setDomainList(List<String> domainList) {
    this.domainList = domainList;
  }

  public DataForDescribeDnsControlPolicyOutput hitCnt(Integer hitCnt) {
    this.hitCnt = hitCnt;
    return this;
  }

   /**
   * Get hitCnt
   * @return hitCnt
  **/
  @Schema(description = "")
  public Integer getHitCnt() {
    return hitCnt;
  }

  public void setHitCnt(Integer hitCnt) {
    this.hitCnt = hitCnt;
  }

  public DataForDescribeDnsControlPolicyOutput lastHitTime(Integer lastHitTime) {
    this.lastHitTime = lastHitTime;
    return this;
  }

   /**
   * Get lastHitTime
   * @return lastHitTime
  **/
  @Schema(description = "")
  public Integer getLastHitTime() {
    return lastHitTime;
  }

  public void setLastHitTime(Integer lastHitTime) {
    this.lastHitTime = lastHitTime;
  }

  public DataForDescribeDnsControlPolicyOutput ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @Schema(description = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public DataForDescribeDnsControlPolicyOutput source(List<SourceForDescribeDnsControlPolicyOutput> source) {
    this.source = source;
    return this;
  }

  public DataForDescribeDnsControlPolicyOutput addSourceItem(SourceForDescribeDnsControlPolicyOutput sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<SourceForDescribeDnsControlPolicyOutput>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Valid
  @Schema(description = "")
  public List<SourceForDescribeDnsControlPolicyOutput> getSource() {
    return source;
  }

  public void setSource(List<SourceForDescribeDnsControlPolicyOutput> source) {
    this.source = source;
  }

  public DataForDescribeDnsControlPolicyOutput status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public DataForDescribeDnsControlPolicyOutput useCount(Integer useCount) {
    this.useCount = useCount;
    return this;
  }

   /**
   * Get useCount
   * @return useCount
  **/
  @Schema(description = "")
  public Integer getUseCount() {
    return useCount;
  }

  public void setUseCount(Integer useCount) {
    this.useCount = useCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForDescribeDnsControlPolicyOutput dataForDescribeDnsControlPolicyOutput = (DataForDescribeDnsControlPolicyOutput) o;
    return Objects.equals(this.accountId, dataForDescribeDnsControlPolicyOutput.accountId) &&
        Objects.equals(this.description, dataForDescribeDnsControlPolicyOutput.description) &&
        Objects.equals(this.destination, dataForDescribeDnsControlPolicyOutput.destination) &&
        Objects.equals(this.destinationGroupList, dataForDescribeDnsControlPolicyOutput.destinationGroupList) &&
        Objects.equals(this.destinationType, dataForDescribeDnsControlPolicyOutput.destinationType) &&
        Objects.equals(this.domainList, dataForDescribeDnsControlPolicyOutput.domainList) &&
        Objects.equals(this.hitCnt, dataForDescribeDnsControlPolicyOutput.hitCnt) &&
        Objects.equals(this.lastHitTime, dataForDescribeDnsControlPolicyOutput.lastHitTime) &&
        Objects.equals(this.ruleId, dataForDescribeDnsControlPolicyOutput.ruleId) &&
        Objects.equals(this.source, dataForDescribeDnsControlPolicyOutput.source) &&
        Objects.equals(this.status, dataForDescribeDnsControlPolicyOutput.status) &&
        Objects.equals(this.useCount, dataForDescribeDnsControlPolicyOutput.useCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, description, destination, destinationGroupList, destinationType, domainList, hitCnt, lastHitTime, ruleId, source, status, useCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForDescribeDnsControlPolicyOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    destinationGroupList: ").append(toIndentedString(destinationGroupList)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    domainList: ").append(toIndentedString(domainList)).append("\n");
    sb.append("    hitCnt: ").append(toIndentedString(hitCnt)).append("\n");
    sb.append("    lastHitTime: ").append(toIndentedString(lastHitTime)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    useCount: ").append(toIndentedString(useCount)).append("\n");
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
