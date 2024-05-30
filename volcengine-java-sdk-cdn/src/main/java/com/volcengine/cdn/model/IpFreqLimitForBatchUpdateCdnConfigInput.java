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
import com.volcengine.cdn.model.IpFreqLimitRuleForBatchUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * IpFreqLimitForBatchUpdateCdnConfigInput
 */



public class IpFreqLimitForBatchUpdateCdnConfigInput {
  @SerializedName("IpFreqLimitRules")
  private List<IpFreqLimitRuleForBatchUpdateCdnConfigInput> ipFreqLimitRules = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  public IpFreqLimitForBatchUpdateCdnConfigInput ipFreqLimitRules(List<IpFreqLimitRuleForBatchUpdateCdnConfigInput> ipFreqLimitRules) {
    this.ipFreqLimitRules = ipFreqLimitRules;
    return this;
  }

  public IpFreqLimitForBatchUpdateCdnConfigInput addIpFreqLimitRulesItem(IpFreqLimitRuleForBatchUpdateCdnConfigInput ipFreqLimitRulesItem) {
    if (this.ipFreqLimitRules == null) {
      this.ipFreqLimitRules = new ArrayList<IpFreqLimitRuleForBatchUpdateCdnConfigInput>();
    }
    this.ipFreqLimitRules.add(ipFreqLimitRulesItem);
    return this;
  }

   /**
   * Get ipFreqLimitRules
   * @return ipFreqLimitRules
  **/
  @Valid
  @Schema(description = "")
  public List<IpFreqLimitRuleForBatchUpdateCdnConfigInput> getIpFreqLimitRules() {
    return ipFreqLimitRules;
  }

  public void setIpFreqLimitRules(List<IpFreqLimitRuleForBatchUpdateCdnConfigInput> ipFreqLimitRules) {
    this.ipFreqLimitRules = ipFreqLimitRules;
  }

  public IpFreqLimitForBatchUpdateCdnConfigInput _switch(Boolean _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public Boolean isSwitch() {
    return _switch;
  }

  public void setSwitch(Boolean _switch) {
    this._switch = _switch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpFreqLimitForBatchUpdateCdnConfigInput ipFreqLimitForBatchUpdateCdnConfigInput = (IpFreqLimitForBatchUpdateCdnConfigInput) o;
    return Objects.equals(this.ipFreqLimitRules, ipFreqLimitForBatchUpdateCdnConfigInput.ipFreqLimitRules) &&
        Objects.equals(this._switch, ipFreqLimitForBatchUpdateCdnConfigInput._switch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipFreqLimitRules, _switch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpFreqLimitForBatchUpdateCdnConfigInput {\n");
    
    sb.append("    ipFreqLimitRules: ").append(toIndentedString(ipFreqLimitRules)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
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