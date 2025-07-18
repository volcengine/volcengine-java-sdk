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
import com.volcengine.waf.model.AccurateGroupForCreateAclRuleInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateAclRuleRequest
 */



public class CreateAclRuleRequest {
  @SerializedName("AccurateGroup")
  private AccurateGroupForCreateAclRuleInput accurateGroup = null;

  @SerializedName("AclType")
  private String aclType = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("Advanced")
  private Integer advanced = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Enable")
  private Integer enable = null;

  @SerializedName("HostAddType")
  private Integer hostAddType = null;

  @SerializedName("HostGroupId")
  private List<Integer> hostGroupId = null;

  @SerializedName("HostList")
  private List<String> hostList = null;

  @SerializedName("IpAddType")
  private Integer ipAddType = null;

  @SerializedName("IpGroupId")
  private List<Integer> ipGroupId = null;

  @SerializedName("IpList")
  private List<String> ipList = null;

  @SerializedName("IpLocationCountry")
  private List<String> ipLocationCountry = null;

  @SerializedName("IpLocationSubregion")
  private List<String> ipLocationSubregion = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Url")
  private String url = null;

  public CreateAclRuleRequest accurateGroup(AccurateGroupForCreateAclRuleInput accurateGroup) {
    this.accurateGroup = accurateGroup;
    return this;
  }

   /**
   * Get accurateGroup
   * @return accurateGroup
  **/
  @Valid
  @Schema(description = "")
  public AccurateGroupForCreateAclRuleInput getAccurateGroup() {
    return accurateGroup;
  }

  public void setAccurateGroup(AccurateGroupForCreateAclRuleInput accurateGroup) {
    this.accurateGroup = accurateGroup;
  }

  public CreateAclRuleRequest aclType(String aclType) {
    this.aclType = aclType;
    return this;
  }

   /**
   * Get aclType
   * @return aclType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAclType() {
    return aclType;
  }

  public void setAclType(String aclType) {
    this.aclType = aclType;
  }

  public CreateAclRuleRequest action(String action) {
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

  public CreateAclRuleRequest advanced(Integer advanced) {
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

  public CreateAclRuleRequest description(String description) {
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

  public CreateAclRuleRequest enable(Integer enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getEnable() {
    return enable;
  }

  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  public CreateAclRuleRequest hostAddType(Integer hostAddType) {
    this.hostAddType = hostAddType;
    return this;
  }

   /**
   * Get hostAddType
   * @return hostAddType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getHostAddType() {
    return hostAddType;
  }

  public void setHostAddType(Integer hostAddType) {
    this.hostAddType = hostAddType;
  }

  public CreateAclRuleRequest hostGroupId(List<Integer> hostGroupId) {
    this.hostGroupId = hostGroupId;
    return this;
  }

  public CreateAclRuleRequest addHostGroupIdItem(Integer hostGroupIdItem) {
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

  public CreateAclRuleRequest hostList(List<String> hostList) {
    this.hostList = hostList;
    return this;
  }

  public CreateAclRuleRequest addHostListItem(String hostListItem) {
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

  public CreateAclRuleRequest ipAddType(Integer ipAddType) {
    this.ipAddType = ipAddType;
    return this;
  }

   /**
   * Get ipAddType
   * @return ipAddType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getIpAddType() {
    return ipAddType;
  }

  public void setIpAddType(Integer ipAddType) {
    this.ipAddType = ipAddType;
  }

  public CreateAclRuleRequest ipGroupId(List<Integer> ipGroupId) {
    this.ipGroupId = ipGroupId;
    return this;
  }

  public CreateAclRuleRequest addIpGroupIdItem(Integer ipGroupIdItem) {
    if (this.ipGroupId == null) {
      this.ipGroupId = new ArrayList<Integer>();
    }
    this.ipGroupId.add(ipGroupIdItem);
    return this;
  }

   /**
   * Get ipGroupId
   * @return ipGroupId
  **/
  @Schema(description = "")
  public List<Integer> getIpGroupId() {
    return ipGroupId;
  }

  public void setIpGroupId(List<Integer> ipGroupId) {
    this.ipGroupId = ipGroupId;
  }

  public CreateAclRuleRequest ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public CreateAclRuleRequest addIpListItem(String ipListItem) {
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

  public CreateAclRuleRequest ipLocationCountry(List<String> ipLocationCountry) {
    this.ipLocationCountry = ipLocationCountry;
    return this;
  }

  public CreateAclRuleRequest addIpLocationCountryItem(String ipLocationCountryItem) {
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

  public CreateAclRuleRequest ipLocationSubregion(List<String> ipLocationSubregion) {
    this.ipLocationSubregion = ipLocationSubregion;
    return this;
  }

  public CreateAclRuleRequest addIpLocationSubregionItem(String ipLocationSubregionItem) {
    if (this.ipLocationSubregion == null) {
      this.ipLocationSubregion = new ArrayList<String>();
    }
    this.ipLocationSubregion.add(ipLocationSubregionItem);
    return this;
  }

   /**
   * Get ipLocationSubregion
   * @return ipLocationSubregion
  **/
  @Schema(description = "")
  public List<String> getIpLocationSubregion() {
    return ipLocationSubregion;
  }

  public void setIpLocationSubregion(List<String> ipLocationSubregion) {
    this.ipLocationSubregion = ipLocationSubregion;
  }

  public CreateAclRuleRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateAclRuleRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CreateAclRuleRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAclRuleRequest createAclRuleRequest = (CreateAclRuleRequest) o;
    return Objects.equals(this.accurateGroup, createAclRuleRequest.accurateGroup) &&
        Objects.equals(this.aclType, createAclRuleRequest.aclType) &&
        Objects.equals(this.action, createAclRuleRequest.action) &&
        Objects.equals(this.advanced, createAclRuleRequest.advanced) &&
        Objects.equals(this.description, createAclRuleRequest.description) &&
        Objects.equals(this.enable, createAclRuleRequest.enable) &&
        Objects.equals(this.hostAddType, createAclRuleRequest.hostAddType) &&
        Objects.equals(this.hostGroupId, createAclRuleRequest.hostGroupId) &&
        Objects.equals(this.hostList, createAclRuleRequest.hostList) &&
        Objects.equals(this.ipAddType, createAclRuleRequest.ipAddType) &&
        Objects.equals(this.ipGroupId, createAclRuleRequest.ipGroupId) &&
        Objects.equals(this.ipList, createAclRuleRequest.ipList) &&
        Objects.equals(this.ipLocationCountry, createAclRuleRequest.ipLocationCountry) &&
        Objects.equals(this.ipLocationSubregion, createAclRuleRequest.ipLocationSubregion) &&
        Objects.equals(this.name, createAclRuleRequest.name) &&
        Objects.equals(this.projectName, createAclRuleRequest.projectName) &&
        Objects.equals(this.url, createAclRuleRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurateGroup, aclType, action, advanced, description, enable, hostAddType, hostGroupId, hostList, ipAddType, ipGroupId, ipList, ipLocationCountry, ipLocationSubregion, name, projectName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAclRuleRequest {\n");
    
    sb.append("    accurateGroup: ").append(toIndentedString(accurateGroup)).append("\n");
    sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    hostAddType: ").append(toIndentedString(hostAddType)).append("\n");
    sb.append("    hostGroupId: ").append(toIndentedString(hostGroupId)).append("\n");
    sb.append("    hostList: ").append(toIndentedString(hostList)).append("\n");
    sb.append("    ipAddType: ").append(toIndentedString(ipAddType)).append("\n");
    sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    ipLocationCountry: ").append(toIndentedString(ipLocationCountry)).append("\n");
    sb.append("    ipLocationSubregion: ").append(toIndentedString(ipLocationSubregion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
