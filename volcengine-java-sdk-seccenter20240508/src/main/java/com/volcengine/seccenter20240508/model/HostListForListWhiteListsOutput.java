/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * HostListForListWhiteListsOutput
 */



public class HostListForListWhiteListsOutput {
  @SerializedName("AgentID")
  private String agentID = null;

  @SerializedName("CloudProvider")
  private String cloudProvider = null;

  @SerializedName("HostTags")
  private List<String> hostTags = null;

  @SerializedName("Hostname")
  private String hostname = null;

  @SerializedName("InnerIPList")
  private List<String> innerIPList = null;

  @SerializedName("OuterIPList")
  private List<String> outerIPList = null;

  public HostListForListWhiteListsOutput agentID(String agentID) {
    this.agentID = agentID;
    return this;
  }

   /**
   * Get agentID
   * @return agentID
  **/
  @Schema(description = "")
  public String getAgentID() {
    return agentID;
  }

  public void setAgentID(String agentID) {
    this.agentID = agentID;
  }

  public HostListForListWhiteListsOutput cloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @Schema(description = "")
  public String getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public HostListForListWhiteListsOutput hostTags(List<String> hostTags) {
    this.hostTags = hostTags;
    return this;
  }

  public HostListForListWhiteListsOutput addHostTagsItem(String hostTagsItem) {
    if (this.hostTags == null) {
      this.hostTags = new ArrayList<String>();
    }
    this.hostTags.add(hostTagsItem);
    return this;
  }

   /**
   * Get hostTags
   * @return hostTags
  **/
  @Schema(description = "")
  public List<String> getHostTags() {
    return hostTags;
  }

  public void setHostTags(List<String> hostTags) {
    this.hostTags = hostTags;
  }

  public HostListForListWhiteListsOutput hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public HostListForListWhiteListsOutput innerIPList(List<String> innerIPList) {
    this.innerIPList = innerIPList;
    return this;
  }

  public HostListForListWhiteListsOutput addInnerIPListItem(String innerIPListItem) {
    if (this.innerIPList == null) {
      this.innerIPList = new ArrayList<String>();
    }
    this.innerIPList.add(innerIPListItem);
    return this;
  }

   /**
   * Get innerIPList
   * @return innerIPList
  **/
  @Schema(description = "")
  public List<String> getInnerIPList() {
    return innerIPList;
  }

  public void setInnerIPList(List<String> innerIPList) {
    this.innerIPList = innerIPList;
  }

  public HostListForListWhiteListsOutput outerIPList(List<String> outerIPList) {
    this.outerIPList = outerIPList;
    return this;
  }

  public HostListForListWhiteListsOutput addOuterIPListItem(String outerIPListItem) {
    if (this.outerIPList == null) {
      this.outerIPList = new ArrayList<String>();
    }
    this.outerIPList.add(outerIPListItem);
    return this;
  }

   /**
   * Get outerIPList
   * @return outerIPList
  **/
  @Schema(description = "")
  public List<String> getOuterIPList() {
    return outerIPList;
  }

  public void setOuterIPList(List<String> outerIPList) {
    this.outerIPList = outerIPList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostListForListWhiteListsOutput hostListForListWhiteListsOutput = (HostListForListWhiteListsOutput) o;
    return Objects.equals(this.agentID, hostListForListWhiteListsOutput.agentID) &&
        Objects.equals(this.cloudProvider, hostListForListWhiteListsOutput.cloudProvider) &&
        Objects.equals(this.hostTags, hostListForListWhiteListsOutput.hostTags) &&
        Objects.equals(this.hostname, hostListForListWhiteListsOutput.hostname) &&
        Objects.equals(this.innerIPList, hostListForListWhiteListsOutput.innerIPList) &&
        Objects.equals(this.outerIPList, hostListForListWhiteListsOutput.outerIPList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentID, cloudProvider, hostTags, hostname, innerIPList, outerIPList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostListForListWhiteListsOutput {\n");
    
    sb.append("    agentID: ").append(toIndentedString(agentID)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    hostTags: ").append(toIndentedString(hostTags)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    innerIPList: ").append(toIndentedString(innerIPList)).append("\n");
    sb.append("    outerIPList: ").append(toIndentedString(outerIPList)).append("\n");
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
