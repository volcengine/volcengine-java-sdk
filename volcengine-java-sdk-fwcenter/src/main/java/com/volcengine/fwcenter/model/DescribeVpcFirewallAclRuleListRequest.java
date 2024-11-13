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
 * DescribeVpcFirewallAclRuleListRequest
 */



public class DescribeVpcFirewallAclRuleListRequest {
  @SerializedName("Action")
  private List<String> action = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Destination")
  private String destination = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Proto")
  private List<String> proto = null;

  @SerializedName("RepeatType")
  private List<String> repeatType = null;

  @SerializedName("RuleId")
  private String ruleId = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("Status")
  private List<Boolean> status = null;

  @SerializedName("VpcFirewallId")
  private String vpcFirewallId = null;

  public DescribeVpcFirewallAclRuleListRequest action(List<String> action) {
    this.action = action;
    return this;
  }

  public DescribeVpcFirewallAclRuleListRequest addActionItem(String actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<String>();
    }
    this.action.add(actionItem);
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public List<String> getAction() {
    return action;
  }

  public void setAction(List<String> action) {
    this.action = action;
  }

  public DescribeVpcFirewallAclRuleListRequest description(String description) {
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

  public DescribeVpcFirewallAclRuleListRequest destination(String destination) {
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

  public DescribeVpcFirewallAclRuleListRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeVpcFirewallAclRuleListRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * maximum: 100
   * @return pageSize
  **/
 @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeVpcFirewallAclRuleListRequest proto(List<String> proto) {
    this.proto = proto;
    return this;
  }

  public DescribeVpcFirewallAclRuleListRequest addProtoItem(String protoItem) {
    if (this.proto == null) {
      this.proto = new ArrayList<String>();
    }
    this.proto.add(protoItem);
    return this;
  }

   /**
   * Get proto
   * @return proto
  **/
  @Schema(description = "")
  public List<String> getProto() {
    return proto;
  }

  public void setProto(List<String> proto) {
    this.proto = proto;
  }

  public DescribeVpcFirewallAclRuleListRequest repeatType(List<String> repeatType) {
    this.repeatType = repeatType;
    return this;
  }

  public DescribeVpcFirewallAclRuleListRequest addRepeatTypeItem(String repeatTypeItem) {
    if (this.repeatType == null) {
      this.repeatType = new ArrayList<String>();
    }
    this.repeatType.add(repeatTypeItem);
    return this;
  }

   /**
   * Get repeatType
   * @return repeatType
  **/
  @Schema(description = "")
  public List<String> getRepeatType() {
    return repeatType;
  }

  public void setRepeatType(List<String> repeatType) {
    this.repeatType = repeatType;
  }

  public DescribeVpcFirewallAclRuleListRequest ruleId(String ruleId) {
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

  public DescribeVpcFirewallAclRuleListRequest source(String source) {
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

  public DescribeVpcFirewallAclRuleListRequest status(List<Boolean> status) {
    this.status = status;
    return this;
  }

  public DescribeVpcFirewallAclRuleListRequest addStatusItem(Boolean statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<Boolean>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<Boolean> getStatus() {
    return status;
  }

  public void setStatus(List<Boolean> status) {
    this.status = status;
  }

  public DescribeVpcFirewallAclRuleListRequest vpcFirewallId(String vpcFirewallId) {
    this.vpcFirewallId = vpcFirewallId;
    return this;
  }

   /**
   * Get vpcFirewallId
   * @return vpcFirewallId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcFirewallId() {
    return vpcFirewallId;
  }

  public void setVpcFirewallId(String vpcFirewallId) {
    this.vpcFirewallId = vpcFirewallId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpcFirewallAclRuleListRequest describeVpcFirewallAclRuleListRequest = (DescribeVpcFirewallAclRuleListRequest) o;
    return Objects.equals(this.action, describeVpcFirewallAclRuleListRequest.action) &&
        Objects.equals(this.description, describeVpcFirewallAclRuleListRequest.description) &&
        Objects.equals(this.destination, describeVpcFirewallAclRuleListRequest.destination) &&
        Objects.equals(this.pageNumber, describeVpcFirewallAclRuleListRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVpcFirewallAclRuleListRequest.pageSize) &&
        Objects.equals(this.proto, describeVpcFirewallAclRuleListRequest.proto) &&
        Objects.equals(this.repeatType, describeVpcFirewallAclRuleListRequest.repeatType) &&
        Objects.equals(this.ruleId, describeVpcFirewallAclRuleListRequest.ruleId) &&
        Objects.equals(this.source, describeVpcFirewallAclRuleListRequest.source) &&
        Objects.equals(this.status, describeVpcFirewallAclRuleListRequest.status) &&
        Objects.equals(this.vpcFirewallId, describeVpcFirewallAclRuleListRequest.vpcFirewallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, description, destination, pageNumber, pageSize, proto, repeatType, ruleId, source, status, vpcFirewallId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpcFirewallAclRuleListRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    repeatType: ").append(toIndentedString(repeatType)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vpcFirewallId: ").append(toIndentedString(vpcFirewallId)).append("\n");
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
