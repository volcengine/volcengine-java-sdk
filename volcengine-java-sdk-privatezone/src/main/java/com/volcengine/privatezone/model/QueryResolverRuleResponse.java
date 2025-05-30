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
import com.volcengine.privatezone.model.BindVPCForQueryResolverRuleOutput;
import com.volcengine.privatezone.model.ForwardIPForQueryResolverRuleOutput;
import com.volcengine.privatezone.model.TagForQueryResolverRuleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueryResolverRuleResponse
 */



public class QueryResolverRuleResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BindVPCs")
  private List<BindVPCForQueryResolverRuleOutput> bindVPCs = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("EndpointID")
  private Integer endpointID = null;

  @SerializedName("ForwardIPs")
  private List<ForwardIPForQueryResolverRuleOutput> forwardIPs = null;

  @SerializedName("ID")
  private Long ID = null;

  @SerializedName("LastOperator")
  private String lastOperator = null;

  @SerializedName("Line")
  private String line = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Tags")
  private List<TagForQueryResolverRuleOutput> tags = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("ZoneName")
  private String zoneName = null;

  public QueryResolverRuleResponse bindVPCs(List<BindVPCForQueryResolverRuleOutput> bindVPCs) {
    this.bindVPCs = bindVPCs;
    return this;
  }

  public QueryResolverRuleResponse addBindVPCsItem(BindVPCForQueryResolverRuleOutput bindVPCsItem) {
    if (this.bindVPCs == null) {
      this.bindVPCs = new ArrayList<BindVPCForQueryResolverRuleOutput>();
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
  public List<BindVPCForQueryResolverRuleOutput> getBindVPCs() {
    return bindVPCs;
  }

  public void setBindVPCs(List<BindVPCForQueryResolverRuleOutput> bindVPCs) {
    this.bindVPCs = bindVPCs;
  }

  public QueryResolverRuleResponse createdAt(String createdAt) {
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

  public QueryResolverRuleResponse enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public QueryResolverRuleResponse endpointID(Integer endpointID) {
    this.endpointID = endpointID;
    return this;
  }

   /**
   * Get endpointID
   * @return endpointID
  **/
  @Schema(description = "")
  public Integer getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(Integer endpointID) {
    this.endpointID = endpointID;
  }

  public QueryResolverRuleResponse forwardIPs(List<ForwardIPForQueryResolverRuleOutput> forwardIPs) {
    this.forwardIPs = forwardIPs;
    return this;
  }

  public QueryResolverRuleResponse addForwardIPsItem(ForwardIPForQueryResolverRuleOutput forwardIPsItem) {
    if (this.forwardIPs == null) {
      this.forwardIPs = new ArrayList<ForwardIPForQueryResolverRuleOutput>();
    }
    this.forwardIPs.add(forwardIPsItem);
    return this;
  }

   /**
   * Get forwardIPs
   * @return forwardIPs
  **/
  @Valid
  @Schema(description = "")
  public List<ForwardIPForQueryResolverRuleOutput> getForwardIPs() {
    return forwardIPs;
  }

  public void setForwardIPs(List<ForwardIPForQueryResolverRuleOutput> forwardIPs) {
    this.forwardIPs = forwardIPs;
  }

  public QueryResolverRuleResponse ID(Long ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @Schema(description = "")
  public Long getID() {
    return ID;
  }

  public void setID(Long ID) {
    this.ID = ID;
  }

  public QueryResolverRuleResponse lastOperator(String lastOperator) {
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

  public QueryResolverRuleResponse line(String line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @Schema(description = "")
  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public QueryResolverRuleResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueryResolverRuleResponse projectName(String projectName) {
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

  public QueryResolverRuleResponse tags(List<TagForQueryResolverRuleOutput> tags) {
    this.tags = tags;
    return this;
  }

  public QueryResolverRuleResponse addTagsItem(TagForQueryResolverRuleOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForQueryResolverRuleOutput>();
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
  public List<TagForQueryResolverRuleOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForQueryResolverRuleOutput> tags) {
    this.tags = tags;
  }

  public QueryResolverRuleResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QueryResolverRuleResponse updatedAt(String updatedAt) {
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

  public QueryResolverRuleResponse zoneName(String zoneName) {
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
    QueryResolverRuleResponse queryResolverRuleResponse = (QueryResolverRuleResponse) o;
    return Objects.equals(this.bindVPCs, queryResolverRuleResponse.bindVPCs) &&
        Objects.equals(this.createdAt, queryResolverRuleResponse.createdAt) &&
        Objects.equals(this.enable, queryResolverRuleResponse.enable) &&
        Objects.equals(this.endpointID, queryResolverRuleResponse.endpointID) &&
        Objects.equals(this.forwardIPs, queryResolverRuleResponse.forwardIPs) &&
        Objects.equals(this.ID, queryResolverRuleResponse.ID) &&
        Objects.equals(this.lastOperator, queryResolverRuleResponse.lastOperator) &&
        Objects.equals(this.line, queryResolverRuleResponse.line) &&
        Objects.equals(this.name, queryResolverRuleResponse.name) &&
        Objects.equals(this.projectName, queryResolverRuleResponse.projectName) &&
        Objects.equals(this.tags, queryResolverRuleResponse.tags) &&
        Objects.equals(this.type, queryResolverRuleResponse.type) &&
        Objects.equals(this.updatedAt, queryResolverRuleResponse.updatedAt) &&
        Objects.equals(this.zoneName, queryResolverRuleResponse.zoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindVPCs, createdAt, enable, endpointID, forwardIPs, ID, lastOperator, line, name, projectName, tags, type, updatedAt, zoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResolverRuleResponse {\n");
    
    sb.append("    bindVPCs: ").append(toIndentedString(bindVPCs)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    forwardIPs: ").append(toIndentedString(forwardIPs)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    lastOperator: ").append(toIndentedString(lastOperator)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
