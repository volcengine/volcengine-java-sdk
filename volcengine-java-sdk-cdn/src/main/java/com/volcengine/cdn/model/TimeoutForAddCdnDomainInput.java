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
import com.volcengine.cdn.model.TimeoutRuleForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TimeoutForAddCdnDomainInput
 */



public class TimeoutForAddCdnDomainInput {
  @SerializedName("Switch")
  private Boolean _switch = null;

  @SerializedName("TimeoutRules")
  private List<TimeoutRuleForAddCdnDomainInput> timeoutRules = null;

  public TimeoutForAddCdnDomainInput _switch(Boolean _switch) {
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

  public TimeoutForAddCdnDomainInput timeoutRules(List<TimeoutRuleForAddCdnDomainInput> timeoutRules) {
    this.timeoutRules = timeoutRules;
    return this;
  }

  public TimeoutForAddCdnDomainInput addTimeoutRulesItem(TimeoutRuleForAddCdnDomainInput timeoutRulesItem) {
    if (this.timeoutRules == null) {
      this.timeoutRules = new ArrayList<TimeoutRuleForAddCdnDomainInput>();
    }
    this.timeoutRules.add(timeoutRulesItem);
    return this;
  }

   /**
   * Get timeoutRules
   * @return timeoutRules
  **/
  @Valid
  @Schema(description = "")
  public List<TimeoutRuleForAddCdnDomainInput> getTimeoutRules() {
    return timeoutRules;
  }

  public void setTimeoutRules(List<TimeoutRuleForAddCdnDomainInput> timeoutRules) {
    this.timeoutRules = timeoutRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeoutForAddCdnDomainInput timeoutForAddCdnDomainInput = (TimeoutForAddCdnDomainInput) o;
    return Objects.equals(this._switch, timeoutForAddCdnDomainInput._switch) &&
        Objects.equals(this.timeoutRules, timeoutForAddCdnDomainInput.timeoutRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_switch, timeoutRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeoutForAddCdnDomainInput {\n");
    
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
    sb.append("    timeoutRules: ").append(toIndentedString(timeoutRules)).append("\n");
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
