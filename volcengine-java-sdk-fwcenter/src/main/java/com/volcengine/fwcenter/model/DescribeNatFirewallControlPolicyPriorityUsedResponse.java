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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNatFirewallControlPolicyPriorityUsedResponse
 */



public class DescribeNatFirewallControlPolicyPriorityUsedResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("End")
  private Integer end = null;

  @SerializedName("NatFirewallId")
  private String natFirewallId = null;

  @SerializedName("Start")
  private Integer start = null;

  public DescribeNatFirewallControlPolicyPriorityUsedResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DescribeNatFirewallControlPolicyPriorityUsedResponse end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(description = "")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public DescribeNatFirewallControlPolicyPriorityUsedResponse natFirewallId(String natFirewallId) {
    this.natFirewallId = natFirewallId;
    return this;
  }

   /**
   * Get natFirewallId
   * @return natFirewallId
  **/
  @Schema(description = "")
  public String getNatFirewallId() {
    return natFirewallId;
  }

  public void setNatFirewallId(String natFirewallId) {
    this.natFirewallId = natFirewallId;
  }

  public DescribeNatFirewallControlPolicyPriorityUsedResponse start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNatFirewallControlPolicyPriorityUsedResponse describeNatFirewallControlPolicyPriorityUsedResponse = (DescribeNatFirewallControlPolicyPriorityUsedResponse) o;
    return Objects.equals(this.accountId, describeNatFirewallControlPolicyPriorityUsedResponse.accountId) &&
        Objects.equals(this.end, describeNatFirewallControlPolicyPriorityUsedResponse.end) &&
        Objects.equals(this.natFirewallId, describeNatFirewallControlPolicyPriorityUsedResponse.natFirewallId) &&
        Objects.equals(this.start, describeNatFirewallControlPolicyPriorityUsedResponse.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, end, natFirewallId, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNatFirewallControlPolicyPriorityUsedResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    natFirewallId: ").append(toIndentedString(natFirewallId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
