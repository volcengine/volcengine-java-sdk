/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.transitrouter.model.TagForDescribeTransitRouterRouteTablesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput
 */



public class TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("InRoutePolicyTableId")
  private String inRoutePolicyTableId = null;

  @SerializedName("OutRoutePolicyTableId")
  private String outRoutePolicyTableId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Tags")
  private List<TagForDescribeTransitRouterRouteTablesOutput> tags = null;

  @SerializedName("TransitRouterRouteTableId")
  private String transitRouterRouteTableId = null;

  @SerializedName("TransitRouterRouteTableName")
  private String transitRouterRouteTableName = null;

  @SerializedName("TransitRouterRouteTableType")
  private String transitRouterRouteTableType = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput description(String description) {
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

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput inRoutePolicyTableId(String inRoutePolicyTableId) {
    this.inRoutePolicyTableId = inRoutePolicyTableId;
    return this;
  }

   /**
   * Get inRoutePolicyTableId
   * @return inRoutePolicyTableId
  **/
  @Schema(description = "")
  public String getInRoutePolicyTableId() {
    return inRoutePolicyTableId;
  }

  public void setInRoutePolicyTableId(String inRoutePolicyTableId) {
    this.inRoutePolicyTableId = inRoutePolicyTableId;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput outRoutePolicyTableId(String outRoutePolicyTableId) {
    this.outRoutePolicyTableId = outRoutePolicyTableId;
    return this;
  }

   /**
   * Get outRoutePolicyTableId
   * @return outRoutePolicyTableId
  **/
  @Schema(description = "")
  public String getOutRoutePolicyTableId() {
    return outRoutePolicyTableId;
  }

  public void setOutRoutePolicyTableId(String outRoutePolicyTableId) {
    this.outRoutePolicyTableId = outRoutePolicyTableId;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput tags(List<TagForDescribeTransitRouterRouteTablesOutput> tags) {
    this.tags = tags;
    return this;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput addTagsItem(TagForDescribeTransitRouterRouteTablesOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeTransitRouterRouteTablesOutput>();
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
  public List<TagForDescribeTransitRouterRouteTablesOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeTransitRouterRouteTablesOutput> tags) {
    this.tags = tags;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput transitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
    return this;
  }

   /**
   * Get transitRouterRouteTableId
   * @return transitRouterRouteTableId
  **/
  @Schema(description = "")
  public String getTransitRouterRouteTableId() {
    return transitRouterRouteTableId;
  }

  public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput transitRouterRouteTableName(String transitRouterRouteTableName) {
    this.transitRouterRouteTableName = transitRouterRouteTableName;
    return this;
  }

   /**
   * Get transitRouterRouteTableName
   * @return transitRouterRouteTableName
  **/
  @Schema(description = "")
  public String getTransitRouterRouteTableName() {
    return transitRouterRouteTableName;
  }

  public void setTransitRouterRouteTableName(String transitRouterRouteTableName) {
    this.transitRouterRouteTableName = transitRouterRouteTableName;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput transitRouterRouteTableType(String transitRouterRouteTableType) {
    this.transitRouterRouteTableType = transitRouterRouteTableType;
    return this;
  }

   /**
   * Get transitRouterRouteTableType
   * @return transitRouterRouteTableType
  **/
  @Schema(description = "")
  public String getTransitRouterRouteTableType() {
    return transitRouterRouteTableType;
  }

  public void setTransitRouterRouteTableType(String transitRouterRouteTableType) {
    this.transitRouterRouteTableType = transitRouterRouteTableType;
  }

  public TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput updateTime(String updateTime) {
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
    TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput = (TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput) o;
    return Objects.equals(this.creationTime, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.creationTime) &&
        Objects.equals(this.description, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.description) &&
        Objects.equals(this.inRoutePolicyTableId, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.inRoutePolicyTableId) &&
        Objects.equals(this.outRoutePolicyTableId, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.outRoutePolicyTableId) &&
        Objects.equals(this.status, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.status) &&
        Objects.equals(this.tags, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.tags) &&
        Objects.equals(this.transitRouterRouteTableId, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.transitRouterRouteTableId) &&
        Objects.equals(this.transitRouterRouteTableName, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.transitRouterRouteTableName) &&
        Objects.equals(this.transitRouterRouteTableType, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.transitRouterRouteTableType) &&
        Objects.equals(this.updateTime, transitRouterRouteTableForDescribeTransitRouterRouteTablesOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, inRoutePolicyTableId, outRoutePolicyTableId, status, tags, transitRouterRouteTableId, transitRouterRouteTableName, transitRouterRouteTableType, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterRouteTableForDescribeTransitRouterRouteTablesOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inRoutePolicyTableId: ").append(toIndentedString(inRoutePolicyTableId)).append("\n");
    sb.append("    outRoutePolicyTableId: ").append(toIndentedString(outRoutePolicyTableId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transitRouterRouteTableId: ").append(toIndentedString(transitRouterRouteTableId)).append("\n");
    sb.append("    transitRouterRouteTableName: ").append(toIndentedString(transitRouterRouteTableName)).append("\n");
    sb.append("    transitRouterRouteTableType: ").append(toIndentedString(transitRouterRouteTableType)).append("\n");
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
