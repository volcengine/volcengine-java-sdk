/*
 * redis
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.redis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.redis.model.AssociatedInstanceForDescribeAllowListDetailOutput;
import com.volcengine.redis.model.SecurityGroupBindInfoForDescribeAllowListDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAllowListDetailResponse
 */



public class DescribeAllowListDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AllowList")
  private String allowList = null;

  @SerializedName("AllowListCategory")
  private String allowListCategory = null;

  @SerializedName("AllowListDesc")
  private String allowListDesc = null;

  @SerializedName("AllowListId")
  private String allowListId = null;

  @SerializedName("AllowListName")
  private String allowListName = null;

  @SerializedName("AllowListType")
  private String allowListType = null;

  @SerializedName("AssociatedInstanceNum")
  private Integer associatedInstanceNum = null;

  @SerializedName("AssociatedInstances")
  private List<AssociatedInstanceForDescribeAllowListDetailOutput> associatedInstances = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecurityGroupBindInfos")
  private List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> securityGroupBindInfos = null;

  public DescribeAllowListDetailResponse allowList(String allowList) {
    this.allowList = allowList;
    return this;
  }

   /**
   * Get allowList
   * @return allowList
  **/
  @Schema(description = "")
  public String getAllowList() {
    return allowList;
  }

  public void setAllowList(String allowList) {
    this.allowList = allowList;
  }

  public DescribeAllowListDetailResponse allowListCategory(String allowListCategory) {
    this.allowListCategory = allowListCategory;
    return this;
  }

   /**
   * Get allowListCategory
   * @return allowListCategory
  **/
  @Schema(description = "")
  public String getAllowListCategory() {
    return allowListCategory;
  }

  public void setAllowListCategory(String allowListCategory) {
    this.allowListCategory = allowListCategory;
  }

  public DescribeAllowListDetailResponse allowListDesc(String allowListDesc) {
    this.allowListDesc = allowListDesc;
    return this;
  }

   /**
   * Get allowListDesc
   * @return allowListDesc
  **/
  @Schema(description = "")
  public String getAllowListDesc() {
    return allowListDesc;
  }

  public void setAllowListDesc(String allowListDesc) {
    this.allowListDesc = allowListDesc;
  }

  public DescribeAllowListDetailResponse allowListId(String allowListId) {
    this.allowListId = allowListId;
    return this;
  }

   /**
   * Get allowListId
   * @return allowListId
  **/
  @Schema(description = "")
  public String getAllowListId() {
    return allowListId;
  }

  public void setAllowListId(String allowListId) {
    this.allowListId = allowListId;
  }

  public DescribeAllowListDetailResponse allowListName(String allowListName) {
    this.allowListName = allowListName;
    return this;
  }

   /**
   * Get allowListName
   * @return allowListName
  **/
  @Schema(description = "")
  public String getAllowListName() {
    return allowListName;
  }

  public void setAllowListName(String allowListName) {
    this.allowListName = allowListName;
  }

  public DescribeAllowListDetailResponse allowListType(String allowListType) {
    this.allowListType = allowListType;
    return this;
  }

   /**
   * Get allowListType
   * @return allowListType
  **/
  @Schema(description = "")
  public String getAllowListType() {
    return allowListType;
  }

  public void setAllowListType(String allowListType) {
    this.allowListType = allowListType;
  }

  public DescribeAllowListDetailResponse associatedInstanceNum(Integer associatedInstanceNum) {
    this.associatedInstanceNum = associatedInstanceNum;
    return this;
  }

   /**
   * Get associatedInstanceNum
   * @return associatedInstanceNum
  **/
  @Schema(description = "")
  public Integer getAssociatedInstanceNum() {
    return associatedInstanceNum;
  }

  public void setAssociatedInstanceNum(Integer associatedInstanceNum) {
    this.associatedInstanceNum = associatedInstanceNum;
  }

  public DescribeAllowListDetailResponse associatedInstances(List<AssociatedInstanceForDescribeAllowListDetailOutput> associatedInstances) {
    this.associatedInstances = associatedInstances;
    return this;
  }

  public DescribeAllowListDetailResponse addAssociatedInstancesItem(AssociatedInstanceForDescribeAllowListDetailOutput associatedInstancesItem) {
    if (this.associatedInstances == null) {
      this.associatedInstances = new ArrayList<AssociatedInstanceForDescribeAllowListDetailOutput>();
    }
    this.associatedInstances.add(associatedInstancesItem);
    return this;
  }

   /**
   * Get associatedInstances
   * @return associatedInstances
  **/
  @Valid
  @Schema(description = "")
  public List<AssociatedInstanceForDescribeAllowListDetailOutput> getAssociatedInstances() {
    return associatedInstances;
  }

  public void setAssociatedInstances(List<AssociatedInstanceForDescribeAllowListDetailOutput> associatedInstances) {
    this.associatedInstances = associatedInstances;
  }

  public DescribeAllowListDetailResponse projectName(String projectName) {
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

  public DescribeAllowListDetailResponse securityGroupBindInfos(List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> securityGroupBindInfos) {
    this.securityGroupBindInfos = securityGroupBindInfos;
    return this;
  }

  public DescribeAllowListDetailResponse addSecurityGroupBindInfosItem(SecurityGroupBindInfoForDescribeAllowListDetailOutput securityGroupBindInfosItem) {
    if (this.securityGroupBindInfos == null) {
      this.securityGroupBindInfos = new ArrayList<SecurityGroupBindInfoForDescribeAllowListDetailOutput>();
    }
    this.securityGroupBindInfos.add(securityGroupBindInfosItem);
    return this;
  }

   /**
   * Get securityGroupBindInfos
   * @return securityGroupBindInfos
  **/
  @Valid
  @Schema(description = "")
  public List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> getSecurityGroupBindInfos() {
    return securityGroupBindInfos;
  }

  public void setSecurityGroupBindInfos(List<SecurityGroupBindInfoForDescribeAllowListDetailOutput> securityGroupBindInfos) {
    this.securityGroupBindInfos = securityGroupBindInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAllowListDetailResponse describeAllowListDetailResponse = (DescribeAllowListDetailResponse) o;
    return Objects.equals(this.allowList, describeAllowListDetailResponse.allowList) &&
        Objects.equals(this.allowListCategory, describeAllowListDetailResponse.allowListCategory) &&
        Objects.equals(this.allowListDesc, describeAllowListDetailResponse.allowListDesc) &&
        Objects.equals(this.allowListId, describeAllowListDetailResponse.allowListId) &&
        Objects.equals(this.allowListName, describeAllowListDetailResponse.allowListName) &&
        Objects.equals(this.allowListType, describeAllowListDetailResponse.allowListType) &&
        Objects.equals(this.associatedInstanceNum, describeAllowListDetailResponse.associatedInstanceNum) &&
        Objects.equals(this.associatedInstances, describeAllowListDetailResponse.associatedInstances) &&
        Objects.equals(this.projectName, describeAllowListDetailResponse.projectName) &&
        Objects.equals(this.securityGroupBindInfos, describeAllowListDetailResponse.securityGroupBindInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowList, allowListCategory, allowListDesc, allowListId, allowListName, allowListType, associatedInstanceNum, associatedInstances, projectName, securityGroupBindInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAllowListDetailResponse {\n");
    
    sb.append("    allowList: ").append(toIndentedString(allowList)).append("\n");
    sb.append("    allowListCategory: ").append(toIndentedString(allowListCategory)).append("\n");
    sb.append("    allowListDesc: ").append(toIndentedString(allowListDesc)).append("\n");
    sb.append("    allowListId: ").append(toIndentedString(allowListId)).append("\n");
    sb.append("    allowListName: ").append(toIndentedString(allowListName)).append("\n");
    sb.append("    allowListType: ").append(toIndentedString(allowListType)).append("\n");
    sb.append("    associatedInstanceNum: ").append(toIndentedString(associatedInstanceNum)).append("\n");
    sb.append("    associatedInstances: ").append(toIndentedString(associatedInstances)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    securityGroupBindInfos: ").append(toIndentedString(securityGroupBindInfos)).append("\n");
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
