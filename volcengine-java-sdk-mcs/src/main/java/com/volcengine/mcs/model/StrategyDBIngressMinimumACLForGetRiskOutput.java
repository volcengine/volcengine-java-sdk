/*
 * mcs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mcs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mcs.model.SecurityGroupRuleInfoForGetRiskOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StrategyDBIngressMinimumACLForGetRiskOutput
 */



public class StrategyDBIngressMinimumACLForGetRiskOutput {
  @SerializedName("SecurityGroupRuleInfos")
  private List<SecurityGroupRuleInfoForGetRiskOutput> securityGroupRuleInfos = null;

  public StrategyDBIngressMinimumACLForGetRiskOutput securityGroupRuleInfos(List<SecurityGroupRuleInfoForGetRiskOutput> securityGroupRuleInfos) {
    this.securityGroupRuleInfos = securityGroupRuleInfos;
    return this;
  }

  public StrategyDBIngressMinimumACLForGetRiskOutput addSecurityGroupRuleInfosItem(SecurityGroupRuleInfoForGetRiskOutput securityGroupRuleInfosItem) {
    if (this.securityGroupRuleInfos == null) {
      this.securityGroupRuleInfos = new ArrayList<SecurityGroupRuleInfoForGetRiskOutput>();
    }
    this.securityGroupRuleInfos.add(securityGroupRuleInfosItem);
    return this;
  }

   /**
   * Get securityGroupRuleInfos
   * @return securityGroupRuleInfos
  **/
  @Valid
  @Schema(description = "")
  public List<SecurityGroupRuleInfoForGetRiskOutput> getSecurityGroupRuleInfos() {
    return securityGroupRuleInfos;
  }

  public void setSecurityGroupRuleInfos(List<SecurityGroupRuleInfoForGetRiskOutput> securityGroupRuleInfos) {
    this.securityGroupRuleInfos = securityGroupRuleInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrategyDBIngressMinimumACLForGetRiskOutput strategyDBIngressMinimumACLForGetRiskOutput = (StrategyDBIngressMinimumACLForGetRiskOutput) o;
    return Objects.equals(this.securityGroupRuleInfos, strategyDBIngressMinimumACLForGetRiskOutput.securityGroupRuleInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityGroupRuleInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrategyDBIngressMinimumACLForGetRiskOutput {\n");
    
    sb.append("    securityGroupRuleInfos: ").append(toIndentedString(securityGroupRuleInfos)).append("\n");
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
