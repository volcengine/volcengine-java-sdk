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
 * DeleteVpcFirewallAclRuleResponse
 */



public class DeleteVpcFirewallAclRuleResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("RuleIds")
  private List<String> ruleIds = null;

  public DeleteVpcFirewallAclRuleResponse ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public DeleteVpcFirewallAclRuleResponse addRuleIdsItem(String ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<String>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

   /**
   * Get ruleIds
   * @return ruleIds
  **/
  @Schema(description = "")
  public List<String> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteVpcFirewallAclRuleResponse deleteVpcFirewallAclRuleResponse = (DeleteVpcFirewallAclRuleResponse) o;
    return Objects.equals(this.ruleIds, deleteVpcFirewallAclRuleResponse.ruleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteVpcFirewallAclRuleResponse {\n");
    
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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
