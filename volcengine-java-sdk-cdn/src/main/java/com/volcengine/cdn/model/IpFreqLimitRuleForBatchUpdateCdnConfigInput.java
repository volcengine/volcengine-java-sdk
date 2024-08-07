/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.ConditionForBatchUpdateCdnConfigInput;
import com.volcengine.cdn.model.IpFreqLimitActionForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * IpFreqLimitRuleForBatchUpdateCdnConfigInput
 */



public class IpFreqLimitRuleForBatchUpdateCdnConfigInput {
  @SerializedName("Condition")
  private ConditionForBatchUpdateCdnConfigInput condition = null;

  @SerializedName("IpFreqLimitAction")
  private IpFreqLimitActionForBatchUpdateCdnConfigInput ipFreqLimitAction = null;

  public IpFreqLimitRuleForBatchUpdateCdnConfigInput condition(ConditionForBatchUpdateCdnConfigInput condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Valid
  @Schema(description = "")
  public ConditionForBatchUpdateCdnConfigInput getCondition() {
    return condition;
  }

  public void setCondition(ConditionForBatchUpdateCdnConfigInput condition) {
    this.condition = condition;
  }

  public IpFreqLimitRuleForBatchUpdateCdnConfigInput ipFreqLimitAction(IpFreqLimitActionForBatchUpdateCdnConfigInput ipFreqLimitAction) {
    this.ipFreqLimitAction = ipFreqLimitAction;
    return this;
  }

   /**
   * Get ipFreqLimitAction
   * @return ipFreqLimitAction
  **/
  @Valid
  @Schema(description = "")
  public IpFreqLimitActionForBatchUpdateCdnConfigInput getIpFreqLimitAction() {
    return ipFreqLimitAction;
  }

  public void setIpFreqLimitAction(IpFreqLimitActionForBatchUpdateCdnConfigInput ipFreqLimitAction) {
    this.ipFreqLimitAction = ipFreqLimitAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpFreqLimitRuleForBatchUpdateCdnConfigInput ipFreqLimitRuleForBatchUpdateCdnConfigInput = (IpFreqLimitRuleForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.condition, ipFreqLimitRuleForBatchUpdateCdnConfigInput.condition) &&
        Objects.equals(this.ipFreqLimitAction, ipFreqLimitRuleForBatchUpdateCdnConfigInput.ipFreqLimitAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, ipFreqLimitAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpFreqLimitRuleForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    ipFreqLimitAction: ").append(toIndentedString(ipFreqLimitAction)).append("\n");
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
