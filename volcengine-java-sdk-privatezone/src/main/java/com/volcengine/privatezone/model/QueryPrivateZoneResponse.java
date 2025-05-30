/*
 * private_zone
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatezone.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatezone.model.BindVPCForQueryPrivateZoneOutput;
import com.volcengine.privatezone.model.TagForQueryPrivateZoneOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryPrivateZoneResponse
 */



public class QueryPrivateZoneResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BindVPCs")
  private List<BindVPCForQueryPrivateZoneOutput> bindVPCs = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("LastOperator")
  private String lastOperator = null;

  @SerializedName("LineMode")
  private Integer lineMode = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RecordCount")
  private Integer recordCount = null;

  @SerializedName("RecursionMode")
  private Boolean recursionMode = null;

  @SerializedName("Region")
  private List<String> region = null;

  @SerializedName("Remark")
  private String remark = null;

  @SerializedName("Tags")
  private List<TagForQueryPrivateZoneOutput> tags = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("ZID")
  private Integer ZID = null;

  @SerializedName("ZoneName")
  private String zoneName = null;

  public QueryPrivateZoneResponse bindVPCs(List<BindVPCForQueryPrivateZoneOutput> bindVPCs) {
    this.bindVPCs = bindVPCs;
    return this;
  }

  public QueryPrivateZoneResponse addBindVPCsItem(BindVPCForQueryPrivateZoneOutput bindVPCsItem) {
    if (this.bindVPCs == null) {
      this.bindVPCs = new ArrayList<BindVPCForQueryPrivateZoneOutput>();
    }
    this.bindVPCs.add(bindVPCsItem);
    return this;
  }

   /**
   * Get bindVPCs
   * @return bindVPCs
  **/
  @Valid
  @Schema(description = "")
  public List<BindVPCForQueryPrivateZoneOutput> getBindVPCs() {
    return bindVPCs;
  }

  public void setBindVPCs(List<BindVPCForQueryPrivateZoneOutput> bindVPCs) {
    this.bindVPCs = bindVPCs;
  }

  public QueryPrivateZoneResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public QueryPrivateZoneResponse lastOperator(String lastOperator) {
    this.lastOperator = lastOperator;
    return this;
  }

   /**
   * Get lastOperator
   * @return lastOperator
  **/
  @Schema(description = "")
  public String getLastOperator() {
    return lastOperator;
  }

  public void setLastOperator(String lastOperator) {
    this.lastOperator = lastOperator;
  }

  public QueryPrivateZoneResponse lineMode(Integer lineMode) {
    this.lineMode = lineMode;
    return this;
  }

   /**
   * Get lineMode
   * @return lineMode
  **/
  @Schema(description = "")
  public Integer getLineMode() {
    return lineMode;
  }

  public void setLineMode(Integer lineMode) {
    this.lineMode = lineMode;
  }

  public QueryPrivateZoneResponse projectName(String projectName) {
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

  public QueryPrivateZoneResponse recordCount(Integer recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Get recordCount
   * @return recordCount
  **/
  @Schema(description = "")
  public Integer getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Integer recordCount) {
    this.recordCount = recordCount;
  }

  public QueryPrivateZoneResponse recursionMode(Boolean recursionMode) {
    this.recursionMode = recursionMode;
    return this;
  }

   /**
   * Get recursionMode
   * @return recursionMode
  **/
  @Schema(description = "")
  public Boolean isRecursionMode() {
    return recursionMode;
  }

  public void setRecursionMode(Boolean recursionMode) {
    this.recursionMode = recursionMode;
  }

  public QueryPrivateZoneResponse region(List<String> region) {
    this.region = region;
    return this;
  }

  public QueryPrivateZoneResponse addRegionItem(String regionItem) {
    if (this.region == null) {
      this.region = new ArrayList<String>();
    }
    this.region.add(regionItem);
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public List<String> getRegion() {
    return region;
  }

  public void setRegion(List<String> region) {
    this.region = region;
  }

  public QueryPrivateZoneResponse remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @Schema(description = "")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public QueryPrivateZoneResponse tags(List<TagForQueryPrivateZoneOutput> tags) {
    this.tags = tags;
    return this;
  }

  public QueryPrivateZoneResponse addTagsItem(TagForQueryPrivateZoneOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForQueryPrivateZoneOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForQueryPrivateZoneOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForQueryPrivateZoneOutput> tags) {
    this.tags = tags;
  }

  public QueryPrivateZoneResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public QueryPrivateZoneResponse ZID(Integer ZID) {
    this.ZID = ZID;
    return this;
  }

   /**
   * Get ZID
   * @return ZID
  **/
  @Schema(description = "")
  public Integer getZID() {
    return ZID;
  }

  public void setZID(Integer ZID) {
    this.ZID = ZID;
  }

  public QueryPrivateZoneResponse zoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

   /**
   * Get zoneName
   * @return zoneName
  **/
  @Schema(description = "")
  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryPrivateZoneResponse queryPrivateZoneResponse = (QueryPrivateZoneResponse) o;
    return Objects.equals(this.bindVPCs, queryPrivateZoneResponse.bindVPCs) &&
        Objects.equals(this.createdAt, queryPrivateZoneResponse.createdAt) &&
        Objects.equals(this.lastOperator, queryPrivateZoneResponse.lastOperator) &&
        Objects.equals(this.lineMode, queryPrivateZoneResponse.lineMode) &&
        Objects.equals(this.projectName, queryPrivateZoneResponse.projectName) &&
        Objects.equals(this.recordCount, queryPrivateZoneResponse.recordCount) &&
        Objects.equals(this.recursionMode, queryPrivateZoneResponse.recursionMode) &&
        Objects.equals(this.region, queryPrivateZoneResponse.region) &&
        Objects.equals(this.remark, queryPrivateZoneResponse.remark) &&
        Objects.equals(this.tags, queryPrivateZoneResponse.tags) &&
        Objects.equals(this.updatedAt, queryPrivateZoneResponse.updatedAt) &&
        Objects.equals(this.ZID, queryPrivateZoneResponse.ZID) &&
        Objects.equals(this.zoneName, queryPrivateZoneResponse.zoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindVPCs, createdAt, lastOperator, lineMode, projectName, recordCount, recursionMode, region, remark, tags, updatedAt, ZID, zoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryPrivateZoneResponse {\n");
    
    sb.append("    bindVPCs: ").append(toIndentedString(bindVPCs)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastOperator: ").append(toIndentedString(lastOperator)).append("\n");
    sb.append("    lineMode: ").append(toIndentedString(lineMode)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    recursionMode: ").append(toIndentedString(recursionMode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    ZID: ").append(toIndentedString(ZID)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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
