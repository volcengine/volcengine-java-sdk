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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForDescribeVpcFirewallAclRuleListOutput
 */



public class DataForDescribeVpcFirewallAclRuleListOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestPort")
  private String destPort = null;

  @SerializedName("DestPortGroupType")
  private String destPortGroupType = null;

  @SerializedName("DestPortList")
  private List<String> destPortList = null;

  @SerializedName("DestPortType")
  private String destPortType = null;

  @SerializedName("Destination")
  private String destination = null;

  @SerializedName("DestinationCidrList")
  private List<String> destinationCidrList = null;

  @SerializedName("DestinationGroupType")
  private String destinationGroupType = null;

  @SerializedName("DestinationType")
  private String destinationType = null;

  @SerializedName("EffectStatus")
  private Integer effectStatus = null;

  @SerializedName("EndTime")
  private Integer endTime = null;

  @SerializedName("HitCnt")
  private Integer hitCnt = null;

  @SerializedName("IsEffected")
  private Boolean isEffected = null;

  @SerializedName("Prio")
  private Integer prio = null;

  @SerializedName("Proto")
  private String proto = null;

  @SerializedName("RepeatDays")
  private List<Integer> repeatDays = null;

  @SerializedName("RepeatEndTime")
  private String repeatEndTime = null;

  @SerializedName("RepeatStartTime")
  private String repeatStartTime = null;

  @SerializedName("RepeatType")
  private String repeatType = null;

  @SerializedName("RuleId")
  private String ruleId = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("SourceCidrList")
  private List<String> sourceCidrList = null;

  @SerializedName("SourceGroupType")
  private String sourceGroupType = null;

  @SerializedName("SourceType")
  private String sourceType = null;

  @SerializedName("StartTime")
  private Integer startTime = null;

  @SerializedName("Status")
  private Boolean status = null;

  @SerializedName("UpdateTime")
  private Integer updateTime = null;

  @SerializedName("UseCount")
  private Integer useCount = null;

  @SerializedName("VpcFirewallId")
  private String vpcFirewallId = null;

  @SerializedName("VpcFirewallName")
  private String vpcFirewallName = null;

  public DataForDescribeVpcFirewallAclRuleListOutput accountId(String accountId) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput description(String description) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput destPort(String destPort) {
    this.destPort = destPort;
    return this;
  }

   /**
   * Get destPort
   * @return destPort
  **/
  @Schema(description = "")
  public String getDestPort() {
    return destPort;
  }

  public void setDestPort(String destPort) {
    this.destPort = destPort;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput destPortGroupType(String destPortGroupType) {
    this.destPortGroupType = destPortGroupType;
    return this;
  }

   /**
   * Get destPortGroupType
   * @return destPortGroupType
  **/
  @Schema(description = "")
  public String getDestPortGroupType() {
    return destPortGroupType;
  }

  public void setDestPortGroupType(String destPortGroupType) {
    this.destPortGroupType = destPortGroupType;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput destPortList(List<String> destPortList) {
    this.destPortList = destPortList;
    return this;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput addDestPortListItem(String destPortListItem) {
    if (this.destPortList == null) {
      this.destPortList = new ArrayList<String>();
    }
    this.destPortList.add(destPortListItem);
    return this;
  }

   /**
   * Get destPortList
   * @return destPortList
  **/
  @Schema(description = "")
  public List<String> getDestPortList() {
    return destPortList;
  }

  public void setDestPortList(List<String> destPortList) {
    this.destPortList = destPortList;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput destPortType(String destPortType) {
    this.destPortType = destPortType;
    return this;
  }

   /**
   * Get destPortType
   * @return destPortType
  **/
  @Schema(description = "")
  public String getDestPortType() {
    return destPortType;
  }

  public void setDestPortType(String destPortType) {
    this.destPortType = destPortType;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput destination(String destination) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput destinationCidrList(List<String> destinationCidrList) {
    this.destinationCidrList = destinationCidrList;
    return this;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput addDestinationCidrListItem(String destinationCidrListItem) {
    if (this.destinationCidrList == null) {
      this.destinationCidrList = new ArrayList<String>();
    }
    this.destinationCidrList.add(destinationCidrListItem);
    return this;
  }

   /**
   * Get destinationCidrList
   * @return destinationCidrList
  **/
  @Schema(description = "")
  public List<String> getDestinationCidrList() {
    return destinationCidrList;
  }

  public void setDestinationCidrList(List<String> destinationCidrList) {
    this.destinationCidrList = destinationCidrList;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput destinationGroupType(String destinationGroupType) {
    this.destinationGroupType = destinationGroupType;
    return this;
  }

   /**
   * Get destinationGroupType
   * @return destinationGroupType
  **/
  @Schema(description = "")
  public String getDestinationGroupType() {
    return destinationGroupType;
  }

  public void setDestinationGroupType(String destinationGroupType) {
    this.destinationGroupType = destinationGroupType;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput destinationType(String destinationType) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput effectStatus(Integer effectStatus) {
    this.effectStatus = effectStatus;
    return this;
  }

   /**
   * Get effectStatus
   * @return effectStatus
  **/
  @Schema(description = "")
  public Integer getEffectStatus() {
    return effectStatus;
  }

  public void setEffectStatus(Integer effectStatus) {
    this.effectStatus = effectStatus;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput hitCnt(Integer hitCnt) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput isEffected(Boolean isEffected) {
    this.isEffected = isEffected;
    return this;
  }

   /**
   * Get isEffected
   * @return isEffected
  **/
  @Schema(description = "")
  public Boolean isIsEffected() {
    return isEffected;
  }

  public void setIsEffected(Boolean isEffected) {
    this.isEffected = isEffected;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput prio(Integer prio) {
    this.prio = prio;
    return this;
  }

   /**
   * Get prio
   * @return prio
  **/
  @Schema(description = "")
  public Integer getPrio() {
    return prio;
  }

  public void setPrio(Integer prio) {
    this.prio = prio;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput proto(String proto) {
    this.proto = proto;
    return this;
  }

   /**
   * Get proto
   * @return proto
  **/
  @Schema(description = "")
  public String getProto() {
    return proto;
  }

  public void setProto(String proto) {
    this.proto = proto;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput repeatDays(List<Integer> repeatDays) {
    this.repeatDays = repeatDays;
    return this;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput addRepeatDaysItem(Integer repeatDaysItem) {
    if (this.repeatDays == null) {
      this.repeatDays = new ArrayList<Integer>();
    }
    this.repeatDays.add(repeatDaysItem);
    return this;
  }

   /**
   * Get repeatDays
   * @return repeatDays
  **/
  @Schema(description = "")
  public List<Integer> getRepeatDays() {
    return repeatDays;
  }

  public void setRepeatDays(List<Integer> repeatDays) {
    this.repeatDays = repeatDays;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput repeatEndTime(String repeatEndTime) {
    this.repeatEndTime = repeatEndTime;
    return this;
  }

   /**
   * Get repeatEndTime
   * @return repeatEndTime
  **/
  @Schema(description = "")
  public String getRepeatEndTime() {
    return repeatEndTime;
  }

  public void setRepeatEndTime(String repeatEndTime) {
    this.repeatEndTime = repeatEndTime;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput repeatStartTime(String repeatStartTime) {
    this.repeatStartTime = repeatStartTime;
    return this;
  }

   /**
   * Get repeatStartTime
   * @return repeatStartTime
  **/
  @Schema(description = "")
  public String getRepeatStartTime() {
    return repeatStartTime;
  }

  public void setRepeatStartTime(String repeatStartTime) {
    this.repeatStartTime = repeatStartTime;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput repeatType(String repeatType) {
    this.repeatType = repeatType;
    return this;
  }

   /**
   * Get repeatType
   * @return repeatType
  **/
  @Schema(description = "")
  public String getRepeatType() {
    return repeatType;
  }

  public void setRepeatType(String repeatType) {
    this.repeatType = repeatType;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput ruleId(String ruleId) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput sourceCidrList(List<String> sourceCidrList) {
    this.sourceCidrList = sourceCidrList;
    return this;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput addSourceCidrListItem(String sourceCidrListItem) {
    if (this.sourceCidrList == null) {
      this.sourceCidrList = new ArrayList<String>();
    }
    this.sourceCidrList.add(sourceCidrListItem);
    return this;
  }

   /**
   * Get sourceCidrList
   * @return sourceCidrList
  **/
  @Schema(description = "")
  public List<String> getSourceCidrList() {
    return sourceCidrList;
  }

  public void setSourceCidrList(List<String> sourceCidrList) {
    this.sourceCidrList = sourceCidrList;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput sourceGroupType(String sourceGroupType) {
    this.sourceGroupType = sourceGroupType;
    return this;
  }

   /**
   * Get sourceGroupType
   * @return sourceGroupType
  **/
  @Schema(description = "")
  public String getSourceGroupType() {
    return sourceGroupType;
  }

  public void setSourceGroupType(String sourceGroupType) {
    this.sourceGroupType = sourceGroupType;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @Schema(description = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput status(Boolean status) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput updateTime(Integer updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public Integer getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput useCount(Integer useCount) {
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

  public DataForDescribeVpcFirewallAclRuleListOutput vpcFirewallId(String vpcFirewallId) {
    this.vpcFirewallId = vpcFirewallId;
    return this;
  }

   /**
   * Get vpcFirewallId
   * @return vpcFirewallId
  **/
  @Schema(description = "")
  public String getVpcFirewallId() {
    return vpcFirewallId;
  }

  public void setVpcFirewallId(String vpcFirewallId) {
    this.vpcFirewallId = vpcFirewallId;
  }

  public DataForDescribeVpcFirewallAclRuleListOutput vpcFirewallName(String vpcFirewallName) {
    this.vpcFirewallName = vpcFirewallName;
    return this;
  }

   /**
   * Get vpcFirewallName
   * @return vpcFirewallName
  **/
  @Schema(description = "")
  public String getVpcFirewallName() {
    return vpcFirewallName;
  }

  public void setVpcFirewallName(String vpcFirewallName) {
    this.vpcFirewallName = vpcFirewallName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForDescribeVpcFirewallAclRuleListOutput dataForDescribeVpcFirewallAclRuleListOutput = (DataForDescribeVpcFirewallAclRuleListOutput) o;
    return Objects.equals(this.accountId, dataForDescribeVpcFirewallAclRuleListOutput.accountId) &&
        Objects.equals(this.action, dataForDescribeVpcFirewallAclRuleListOutput.action) &&
        Objects.equals(this.description, dataForDescribeVpcFirewallAclRuleListOutput.description) &&
        Objects.equals(this.destPort, dataForDescribeVpcFirewallAclRuleListOutput.destPort) &&
        Objects.equals(this.destPortGroupType, dataForDescribeVpcFirewallAclRuleListOutput.destPortGroupType) &&
        Objects.equals(this.destPortList, dataForDescribeVpcFirewallAclRuleListOutput.destPortList) &&
        Objects.equals(this.destPortType, dataForDescribeVpcFirewallAclRuleListOutput.destPortType) &&
        Objects.equals(this.destination, dataForDescribeVpcFirewallAclRuleListOutput.destination) &&
        Objects.equals(this.destinationCidrList, dataForDescribeVpcFirewallAclRuleListOutput.destinationCidrList) &&
        Objects.equals(this.destinationGroupType, dataForDescribeVpcFirewallAclRuleListOutput.destinationGroupType) &&
        Objects.equals(this.destinationType, dataForDescribeVpcFirewallAclRuleListOutput.destinationType) &&
        Objects.equals(this.effectStatus, dataForDescribeVpcFirewallAclRuleListOutput.effectStatus) &&
        Objects.equals(this.endTime, dataForDescribeVpcFirewallAclRuleListOutput.endTime) &&
        Objects.equals(this.hitCnt, dataForDescribeVpcFirewallAclRuleListOutput.hitCnt) &&
        Objects.equals(this.isEffected, dataForDescribeVpcFirewallAclRuleListOutput.isEffected) &&
        Objects.equals(this.prio, dataForDescribeVpcFirewallAclRuleListOutput.prio) &&
        Objects.equals(this.proto, dataForDescribeVpcFirewallAclRuleListOutput.proto) &&
        Objects.equals(this.repeatDays, dataForDescribeVpcFirewallAclRuleListOutput.repeatDays) &&
        Objects.equals(this.repeatEndTime, dataForDescribeVpcFirewallAclRuleListOutput.repeatEndTime) &&
        Objects.equals(this.repeatStartTime, dataForDescribeVpcFirewallAclRuleListOutput.repeatStartTime) &&
        Objects.equals(this.repeatType, dataForDescribeVpcFirewallAclRuleListOutput.repeatType) &&
        Objects.equals(this.ruleId, dataForDescribeVpcFirewallAclRuleListOutput.ruleId) &&
        Objects.equals(this.source, dataForDescribeVpcFirewallAclRuleListOutput.source) &&
        Objects.equals(this.sourceCidrList, dataForDescribeVpcFirewallAclRuleListOutput.sourceCidrList) &&
        Objects.equals(this.sourceGroupType, dataForDescribeVpcFirewallAclRuleListOutput.sourceGroupType) &&
        Objects.equals(this.sourceType, dataForDescribeVpcFirewallAclRuleListOutput.sourceType) &&
        Objects.equals(this.startTime, dataForDescribeVpcFirewallAclRuleListOutput.startTime) &&
        Objects.equals(this.status, dataForDescribeVpcFirewallAclRuleListOutput.status) &&
        Objects.equals(this.updateTime, dataForDescribeVpcFirewallAclRuleListOutput.updateTime) &&
        Objects.equals(this.useCount, dataForDescribeVpcFirewallAclRuleListOutput.useCount) &&
        Objects.equals(this.vpcFirewallId, dataForDescribeVpcFirewallAclRuleListOutput.vpcFirewallId) &&
        Objects.equals(this.vpcFirewallName, dataForDescribeVpcFirewallAclRuleListOutput.vpcFirewallName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, action, description, destPort, destPortGroupType, destPortList, destPortType, destination, destinationCidrList, destinationGroupType, destinationType, effectStatus, endTime, hitCnt, isEffected, prio, proto, repeatDays, repeatEndTime, repeatStartTime, repeatType, ruleId, source, sourceCidrList, sourceGroupType, sourceType, startTime, status, updateTime, useCount, vpcFirewallId, vpcFirewallName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForDescribeVpcFirewallAclRuleListOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
    sb.append("    destPortGroupType: ").append(toIndentedString(destPortGroupType)).append("\n");
    sb.append("    destPortList: ").append(toIndentedString(destPortList)).append("\n");
    sb.append("    destPortType: ").append(toIndentedString(destPortType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    destinationCidrList: ").append(toIndentedString(destinationCidrList)).append("\n");
    sb.append("    destinationGroupType: ").append(toIndentedString(destinationGroupType)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    effectStatus: ").append(toIndentedString(effectStatus)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    hitCnt: ").append(toIndentedString(hitCnt)).append("\n");
    sb.append("    isEffected: ").append(toIndentedString(isEffected)).append("\n");
    sb.append("    prio: ").append(toIndentedString(prio)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    repeatDays: ").append(toIndentedString(repeatDays)).append("\n");
    sb.append("    repeatEndTime: ").append(toIndentedString(repeatEndTime)).append("\n");
    sb.append("    repeatStartTime: ").append(toIndentedString(repeatStartTime)).append("\n");
    sb.append("    repeatType: ").append(toIndentedString(repeatType)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceCidrList: ").append(toIndentedString(sourceCidrList)).append("\n");
    sb.append("    sourceGroupType: ").append(toIndentedString(sourceGroupType)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    useCount: ").append(toIndentedString(useCount)).append("\n");
    sb.append("    vpcFirewallId: ").append(toIndentedString(vpcFirewallId)).append("\n");
    sb.append("    vpcFirewallName: ").append(toIndentedString(vpcFirewallName)).append("\n");
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
