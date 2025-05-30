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
import com.volcengine.seccenter20240508.model.HostListForListAutoDefenseRulesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RangeForListAutoDefenseRulesOutput
 */



public class RangeForListAutoDefenseRulesOutput {
  @SerializedName("HostList")
  private List<HostListForListAutoDefenseRulesOutput> hostList = null;

  @SerializedName("HostNum")
  private Integer hostNum = null;

  @SerializedName("IfAllHost")
  private Boolean ifAllHost = null;

  @SerializedName("LeafGroupIDList")
  private List<String> leafGroupIDList = null;

  @SerializedName("SingleGroupPath")
  private String singleGroupPath = null;

  public RangeForListAutoDefenseRulesOutput hostList(List<HostListForListAutoDefenseRulesOutput> hostList) {
    this.hostList = hostList;
    return this;
  }

  public RangeForListAutoDefenseRulesOutput addHostListItem(HostListForListAutoDefenseRulesOutput hostListItem) {
    if (this.hostList == null) {
      this.hostList = new ArrayList<HostListForListAutoDefenseRulesOutput>();
    }
    this.hostList.add(hostListItem);
    return this;
  }

   /**
   * Get hostList
   * @return hostList
  **/
  @Valid
  @Schema(description = "")
  public List<HostListForListAutoDefenseRulesOutput> getHostList() {
    return hostList;
  }

  public void setHostList(List<HostListForListAutoDefenseRulesOutput> hostList) {
    this.hostList = hostList;
  }

  public RangeForListAutoDefenseRulesOutput hostNum(Integer hostNum) {
    this.hostNum = hostNum;
    return this;
  }

   /**
   * Get hostNum
   * @return hostNum
  **/
  @Schema(description = "")
  public Integer getHostNum() {
    return hostNum;
  }

  public void setHostNum(Integer hostNum) {
    this.hostNum = hostNum;
  }

  public RangeForListAutoDefenseRulesOutput ifAllHost(Boolean ifAllHost) {
    this.ifAllHost = ifAllHost;
    return this;
  }

   /**
   * Get ifAllHost
   * @return ifAllHost
  **/
  @Schema(description = "")
  public Boolean isIfAllHost() {
    return ifAllHost;
  }

  public void setIfAllHost(Boolean ifAllHost) {
    this.ifAllHost = ifAllHost;
  }

  public RangeForListAutoDefenseRulesOutput leafGroupIDList(List<String> leafGroupIDList) {
    this.leafGroupIDList = leafGroupIDList;
    return this;
  }

  public RangeForListAutoDefenseRulesOutput addLeafGroupIDListItem(String leafGroupIDListItem) {
    if (this.leafGroupIDList == null) {
      this.leafGroupIDList = new ArrayList<String>();
    }
    this.leafGroupIDList.add(leafGroupIDListItem);
    return this;
  }

   /**
   * Get leafGroupIDList
   * @return leafGroupIDList
  **/
  @Schema(description = "")
  public List<String> getLeafGroupIDList() {
    return leafGroupIDList;
  }

  public void setLeafGroupIDList(List<String> leafGroupIDList) {
    this.leafGroupIDList = leafGroupIDList;
  }

  public RangeForListAutoDefenseRulesOutput singleGroupPath(String singleGroupPath) {
    this.singleGroupPath = singleGroupPath;
    return this;
  }

   /**
   * Get singleGroupPath
   * @return singleGroupPath
  **/
  @Schema(description = "")
  public String getSingleGroupPath() {
    return singleGroupPath;
  }

  public void setSingleGroupPath(String singleGroupPath) {
    this.singleGroupPath = singleGroupPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeForListAutoDefenseRulesOutput rangeForListAutoDefenseRulesOutput = (RangeForListAutoDefenseRulesOutput) o;
    return Objects.equals(this.hostList, rangeForListAutoDefenseRulesOutput.hostList) &&
        Objects.equals(this.hostNum, rangeForListAutoDefenseRulesOutput.hostNum) &&
        Objects.equals(this.ifAllHost, rangeForListAutoDefenseRulesOutput.ifAllHost) &&
        Objects.equals(this.leafGroupIDList, rangeForListAutoDefenseRulesOutput.leafGroupIDList) &&
        Objects.equals(this.singleGroupPath, rangeForListAutoDefenseRulesOutput.singleGroupPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostList, hostNum, ifAllHost, leafGroupIDList, singleGroupPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeForListAutoDefenseRulesOutput {\n");
    
    sb.append("    hostList: ").append(toIndentedString(hostList)).append("\n");
    sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
    sb.append("    ifAllHost: ").append(toIndentedString(ifAllHost)).append("\n");
    sb.append("    leafGroupIDList: ").append(toIndentedString(leafGroupIDList)).append("\n");
    sb.append("    singleGroupPath: ").append(toIndentedString(singleGroupPath)).append("\n");
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
