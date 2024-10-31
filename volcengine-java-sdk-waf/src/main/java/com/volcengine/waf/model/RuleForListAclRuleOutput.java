/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.waf.model.AccurateGroupForListAclRuleOutput;
import com.volcengine.waf.model.HostGroupForListAclRuleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RuleForListAclRuleOutput
 */



public class RuleForListAclRuleOutput {
  @SerializedName("AccurateGroup")
  private AccurateGroupForListAclRuleOutput accurateGroup = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("Advanced")
  private Integer advanced = null;

  @SerializedName("ClientIp")
  private String clientIp = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("Host")
  private String host = null;

  @SerializedName("HostAddType")
  private Integer hostAddType = null;

  @SerializedName("HostGroupId")
  private List<Integer> hostGroupId = null;

  @SerializedName("HostGroups")
  private List<HostGroupForListAclRuleOutput> hostGroups = null;

  @SerializedName("HostList")
  private List<String> hostList = null;

  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("IpGroups")
  private Integer ipGroups = null;

  @SerializedName("IpList")
  private List<String> ipList = null;

  @SerializedName("IpLocationCountry")
  private List<String> ipLocationCountry = null;

  @SerializedName("Name")
  private List<String> name = null;

  @SerializedName("PrefixSwitch")
  private List<String> prefixSwitch = null;

  @SerializedName("RuleTag")
  private String ruleTag = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public RuleForListAclRuleOutput accurateGroup(AccurateGroupForListAclRuleOutput accurateGroup) {
    this.accurateGroup = accurateGroup;
    return this;
  }

   /**
   * Get accurateGroup
   * @return accurateGroup
  **/
  @Valid
  @Schema(description = "")
  public AccurateGroupForListAclRuleOutput getAccurateGroup() {
    return accurateGroup;
  }

  public void setAccurateGroup(AccurateGroupForListAclRuleOutput accurateGroup) {
    this.accurateGroup = accurateGroup;
  }

  public RuleForListAclRuleOutput action(String action) {
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

  public RuleForListAclRuleOutput advanced(Integer advanced) {
    this.advanced = advanced;
    return this;
  }

   /**
   * Get advanced
   * @return advanced
  **/
  @Schema(description = "")
  public Integer getAdvanced() {
    return advanced;
  }

  public void setAdvanced(Integer advanced) {
    this.advanced = advanced;
  }

  public RuleForListAclRuleOutput clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * Get clientIp
   * @return clientIp
  **/
  @Schema(description = "")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public RuleForListAclRuleOutput description(String description) {
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

  public RuleForListAclRuleOutput enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public RuleForListAclRuleOutput host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public RuleForListAclRuleOutput hostAddType(Integer hostAddType) {
    this.hostAddType = hostAddType;
    return this;
  }

   /**
   * Get hostAddType
   * @return hostAddType
  **/
  @Schema(description = "")
  public Integer getHostAddType() {
    return hostAddType;
  }

  public void setHostAddType(Integer hostAddType) {
    this.hostAddType = hostAddType;
  }

  public RuleForListAclRuleOutput hostGroupId(List<Integer> hostGroupId) {
    this.hostGroupId = hostGroupId;
    return this;
  }

  public RuleForListAclRuleOutput addHostGroupIdItem(Integer hostGroupIdItem) {
    if (this.hostGroupId == null) {
      this.hostGroupId = new ArrayList<Integer>();
    }
    this.hostGroupId.add(hostGroupIdItem);
    return this;
  }

   /**
   * Get hostGroupId
   * @return hostGroupId
  **/
  @Schema(description = "")
  public List<Integer> getHostGroupId() {
    return hostGroupId;
  }

  public void setHostGroupId(List<Integer> hostGroupId) {
    this.hostGroupId = hostGroupId;
  }

  public RuleForListAclRuleOutput hostGroups(List<HostGroupForListAclRuleOutput> hostGroups) {
    this.hostGroups = hostGroups;
    return this;
  }

  public RuleForListAclRuleOutput addHostGroupsItem(HostGroupForListAclRuleOutput hostGroupsItem) {
    if (this.hostGroups == null) {
      this.hostGroups = new ArrayList<HostGroupForListAclRuleOutput>();
    }
    this.hostGroups.add(hostGroupsItem);
    return this;
  }

   /**
   * Get hostGroups
   * @return hostGroups
  **/
  @Valid
  @Schema(description = "")
  public List<HostGroupForListAclRuleOutput> getHostGroups() {
    return hostGroups;
  }

  public void setHostGroups(List<HostGroupForListAclRuleOutput> hostGroups) {
    this.hostGroups = hostGroups;
  }

  public RuleForListAclRuleOutput hostList(List<String> hostList) {
    this.hostList = hostList;
    return this;
  }

  public RuleForListAclRuleOutput addHostListItem(String hostListItem) {
    if (this.hostList == null) {
      this.hostList = new ArrayList<String>();
    }
    this.hostList.add(hostListItem);
    return this;
  }

   /**
   * Get hostList
   * @return hostList
  **/
  @Schema(description = "")
  public List<String> getHostList() {
    return hostList;
  }

  public void setHostList(List<String> hostList) {
    this.hostList = hostList;
  }

  public RuleForListAclRuleOutput ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public RuleForListAclRuleOutput ipGroups(Integer ipGroups) {
    this.ipGroups = ipGroups;
    return this;
  }

   /**
   * Get ipGroups
   * @return ipGroups
  **/
  @Schema(description = "")
  public Integer getIpGroups() {
    return ipGroups;
  }

  public void setIpGroups(Integer ipGroups) {
    this.ipGroups = ipGroups;
  }

  public RuleForListAclRuleOutput ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public RuleForListAclRuleOutput addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<String>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * Get ipList
   * @return ipList
  **/
  @Schema(description = "")
  public List<String> getIpList() {
    return ipList;
  }

  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }

  public RuleForListAclRuleOutput ipLocationCountry(List<String> ipLocationCountry) {
    this.ipLocationCountry = ipLocationCountry;
    return this;
  }

  public RuleForListAclRuleOutput addIpLocationCountryItem(String ipLocationCountryItem) {
    if (this.ipLocationCountry == null) {
      this.ipLocationCountry = new ArrayList<String>();
    }
    this.ipLocationCountry.add(ipLocationCountryItem);
    return this;
  }

   /**
   * Get ipLocationCountry
   * @return ipLocationCountry
  **/
  @Schema(description = "")
  public List<String> getIpLocationCountry() {
    return ipLocationCountry;
  }

  public void setIpLocationCountry(List<String> ipLocationCountry) {
    this.ipLocationCountry = ipLocationCountry;
  }

  public RuleForListAclRuleOutput name(List<String> name) {
    this.name = name;
    return this;
  }

  public RuleForListAclRuleOutput addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public RuleForListAclRuleOutput prefixSwitch(List<String> prefixSwitch) {
    this.prefixSwitch = prefixSwitch;
    return this;
  }

  public RuleForListAclRuleOutput addPrefixSwitchItem(String prefixSwitchItem) {
    if (this.prefixSwitch == null) {
      this.prefixSwitch = new ArrayList<String>();
    }
    this.prefixSwitch.add(prefixSwitchItem);
    return this;
  }

   /**
   * Get prefixSwitch
   * @return prefixSwitch
  **/
  @Schema(description = "")
  public List<String> getPrefixSwitch() {
    return prefixSwitch;
  }

  public void setPrefixSwitch(List<String> prefixSwitch) {
    this.prefixSwitch = prefixSwitch;
  }

  public RuleForListAclRuleOutput ruleTag(String ruleTag) {
    this.ruleTag = ruleTag;
    return this;
  }

   /**
   * Get ruleTag
   * @return ruleTag
  **/
  @Schema(description = "")
  public String getRuleTag() {
    return ruleTag;
  }

  public void setRuleTag(String ruleTag) {
    this.ruleTag = ruleTag;
  }

  public RuleForListAclRuleOutput updateTime(String updateTime) {
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
    RuleForListAclRuleOutput ruleForListAclRuleOutput = (RuleForListAclRuleOutput) o;
    return Objects.equals(this.accurateGroup, ruleForListAclRuleOutput.accurateGroup) &&
        Objects.equals(this.action, ruleForListAclRuleOutput.action) &&
        Objects.equals(this.advanced, ruleForListAclRuleOutput.advanced) &&
        Objects.equals(this.clientIp, ruleForListAclRuleOutput.clientIp) &&
        Objects.equals(this.description, ruleForListAclRuleOutput.description) &&
        Objects.equals(this.enable, ruleForListAclRuleOutput.enable) &&
        Objects.equals(this.host, ruleForListAclRuleOutput.host) &&
        Objects.equals(this.hostAddType, ruleForListAclRuleOutput.hostAddType) &&
        Objects.equals(this.hostGroupId, ruleForListAclRuleOutput.hostGroupId) &&
        Objects.equals(this.hostGroups, ruleForListAclRuleOutput.hostGroups) &&
        Objects.equals(this.hostList, ruleForListAclRuleOutput.hostList) &&
        Objects.equals(this.ID, ruleForListAclRuleOutput.ID) &&
        Objects.equals(this.ipGroups, ruleForListAclRuleOutput.ipGroups) &&
        Objects.equals(this.ipList, ruleForListAclRuleOutput.ipList) &&
        Objects.equals(this.ipLocationCountry, ruleForListAclRuleOutput.ipLocationCountry) &&
        Objects.equals(this.name, ruleForListAclRuleOutput.name) &&
        Objects.equals(this.prefixSwitch, ruleForListAclRuleOutput.prefixSwitch) &&
        Objects.equals(this.ruleTag, ruleForListAclRuleOutput.ruleTag) &&
        Objects.equals(this.updateTime, ruleForListAclRuleOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurateGroup, action, advanced, clientIp, description, enable, host, hostAddType, hostGroupId, hostGroups, hostList, ID, ipGroups, ipList, ipLocationCountry, name, prefixSwitch, ruleTag, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleForListAclRuleOutput {\n");
    
    sb.append("    accurateGroup: ").append(toIndentedString(accurateGroup)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostAddType: ").append(toIndentedString(hostAddType)).append("\n");
    sb.append("    hostGroupId: ").append(toIndentedString(hostGroupId)).append("\n");
    sb.append("    hostGroups: ").append(toIndentedString(hostGroups)).append("\n");
    sb.append("    hostList: ").append(toIndentedString(hostList)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    ipGroups: ").append(toIndentedString(ipGroups)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    ipLocationCountry: ").append(toIndentedString(ipLocationCountry)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefixSwitch: ").append(toIndentedString(prefixSwitch)).append("\n");
    sb.append("    ruleTag: ").append(toIndentedString(ruleTag)).append("\n");
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
