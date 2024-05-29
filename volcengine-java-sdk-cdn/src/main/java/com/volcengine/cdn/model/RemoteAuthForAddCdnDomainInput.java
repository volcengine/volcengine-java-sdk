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
import com.volcengine.cdn.model.RemoteAuthRuleForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RemoteAuthForAddCdnDomainInput
 */



public class RemoteAuthForAddCdnDomainInput {
  @SerializedName("RemoteAuthRules")
  private List<RemoteAuthRuleForAddCdnDomainInput> remoteAuthRules = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  public RemoteAuthForAddCdnDomainInput remoteAuthRules(List<RemoteAuthRuleForAddCdnDomainInput> remoteAuthRules) {
    this.remoteAuthRules = remoteAuthRules;
    return this;
  }

  public RemoteAuthForAddCdnDomainInput addRemoteAuthRulesItem(RemoteAuthRuleForAddCdnDomainInput remoteAuthRulesItem) {
    if (this.remoteAuthRules == null) {
      this.remoteAuthRules = new ArrayList<RemoteAuthRuleForAddCdnDomainInput>();
    }
    this.remoteAuthRules.add(remoteAuthRulesItem);
    return this;
  }

   /**
   * Get remoteAuthRules
   * @return remoteAuthRules
  **/
  @Valid
  @Schema(description = "")
  public List<RemoteAuthRuleForAddCdnDomainInput> getRemoteAuthRules() {
    return remoteAuthRules;
  }

  public void setRemoteAuthRules(List<RemoteAuthRuleForAddCdnDomainInput> remoteAuthRules) {
    this.remoteAuthRules = remoteAuthRules;
  }

  public RemoteAuthForAddCdnDomainInput _switch(Boolean _switch) {
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
    RemoteAuthForAddCdnDomainInput remoteAuthForAddCdnDomainInput = (RemoteAuthForAddCdnDomainInput) o;
    return Objects.equals(this.remoteAuthRules, remoteAuthForAddCdnDomainInput.remoteAuthRules) &&
        Objects.equals(this._switch, remoteAuthForAddCdnDomainInput._switch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteAuthRules, _switch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteAuthForAddCdnDomainInput {\n");
    
    sb.append("    remoteAuthRules: ").append(toIndentedString(remoteAuthRules)).append("\n");
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
