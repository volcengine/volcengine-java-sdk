/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * SecurityGroupBindInfoForDescribeAllowListDetailOutput
 */



public class SecurityGroupBindInfoForDescribeAllowListDetailOutput {
  @SerializedName("BindMode")
  private String bindMode = null;

  @SerializedName("IpList")
  private List<String> ipList = null;

  @SerializedName("SecurityGroupId")
  private String securityGroupId = null;

  @SerializedName("SecurityGroupName")
  private String securityGroupName = null;

  public SecurityGroupBindInfoForDescribeAllowListDetailOutput bindMode(String bindMode) {
    this.bindMode = bindMode;
    return this;
  }

   /**
   * Get bindMode
   * @return bindMode
  **/
  @Schema(description = "")
  public String getBindMode() {
    return bindMode;
  }

  public void setBindMode(String bindMode) {
    this.bindMode = bindMode;
  }

  public SecurityGroupBindInfoForDescribeAllowListDetailOutput ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public SecurityGroupBindInfoForDescribeAllowListDetailOutput addIpListItem(String ipListItem) {
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

  public SecurityGroupBindInfoForDescribeAllowListDetailOutput securityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @Schema(description = "")
  public String getSecurityGroupId() {
    return securityGroupId;
  }

  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }

  public SecurityGroupBindInfoForDescribeAllowListDetailOutput securityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * Get securityGroupName
   * @return securityGroupName
  **/
  @Schema(description = "")
  public String getSecurityGroupName() {
    return securityGroupName;
  }

  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupBindInfoForDescribeAllowListDetailOutput securityGroupBindInfoForDescribeAllowListDetailOutput = (SecurityGroupBindInfoForDescribeAllowListDetailOutput) o;
    return Objects.equals(this.bindMode, securityGroupBindInfoForDescribeAllowListDetailOutput.bindMode) &&
        Objects.equals(this.ipList, securityGroupBindInfoForDescribeAllowListDetailOutput.ipList) &&
        Objects.equals(this.securityGroupId, securityGroupBindInfoForDescribeAllowListDetailOutput.securityGroupId) &&
        Objects.equals(this.securityGroupName, securityGroupBindInfoForDescribeAllowListDetailOutput.securityGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindMode, ipList, securityGroupId, securityGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupBindInfoForDescribeAllowListDetailOutput {\n");
    
    sb.append("    bindMode: ").append(toIndentedString(bindMode)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
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
