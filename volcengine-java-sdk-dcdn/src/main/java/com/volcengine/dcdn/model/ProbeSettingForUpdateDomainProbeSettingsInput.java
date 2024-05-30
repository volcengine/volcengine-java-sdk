/*
 * dcdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dcdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dcdn.model.ReqHeadersListForUpdateDomainProbeSettingsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProbeSettingForUpdateDomainProbeSettingsInput
 */


public class ProbeSettingForUpdateDomainProbeSettingsInput {
  @SerializedName("Host")
  private String host = null;

  @SerializedName("ReqHeadersList")
  private List<ReqHeadersListForUpdateDomainProbeSettingsInput> reqHeadersList = null;

  @SerializedName("Switch")
  private String _switch = null;

  @SerializedName("UnhealthyStatusList")
  private List<String> unhealthyStatusList = null;

  @SerializedName("Url")
  private String url = null;

  public ProbeSettingForUpdateDomainProbeSettingsInput host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ProbeSettingForUpdateDomainProbeSettingsInput reqHeadersList(List<ReqHeadersListForUpdateDomainProbeSettingsInput> reqHeadersList) {
    this.reqHeadersList = reqHeadersList;
    return this;
  }

  public ProbeSettingForUpdateDomainProbeSettingsInput addReqHeadersListItem(ReqHeadersListForUpdateDomainProbeSettingsInput reqHeadersListItem) {
    if (this.reqHeadersList == null) {
      this.reqHeadersList = new ArrayList<ReqHeadersListForUpdateDomainProbeSettingsInput>();
    }
    this.reqHeadersList.add(reqHeadersListItem);
    return this;
  }

   /**
   * Get reqHeadersList
   * @return reqHeadersList
  **/
  @Valid
  @Schema(description = "")
  public List<ReqHeadersListForUpdateDomainProbeSettingsInput> getReqHeadersList() {
    return reqHeadersList;
  }

  public void setReqHeadersList(List<ReqHeadersListForUpdateDomainProbeSettingsInput> reqHeadersList) {
    this.reqHeadersList = reqHeadersList;
  }

  public ProbeSettingForUpdateDomainProbeSettingsInput _switch(String _switch) {
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @Schema(description = "")
  public String getSwitch() {
    return _switch;
  }

  public void setSwitch(String _switch) {
    this._switch = _switch;
  }

  public ProbeSettingForUpdateDomainProbeSettingsInput unhealthyStatusList(List<String> unhealthyStatusList) {
    this.unhealthyStatusList = unhealthyStatusList;
    return this;
  }

  public ProbeSettingForUpdateDomainProbeSettingsInput addUnhealthyStatusListItem(String unhealthyStatusListItem) {
    if (this.unhealthyStatusList == null) {
      this.unhealthyStatusList = new ArrayList<String>();
    }
    this.unhealthyStatusList.add(unhealthyStatusListItem);
    return this;
  }

   /**
   * Get unhealthyStatusList
   * @return unhealthyStatusList
  **/
  @Schema(description = "")
  public List<String> getUnhealthyStatusList() {
    return unhealthyStatusList;
  }

  public void setUnhealthyStatusList(List<String> unhealthyStatusList) {
    this.unhealthyStatusList = unhealthyStatusList;
  }

  public ProbeSettingForUpdateDomainProbeSettingsInput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProbeSettingForUpdateDomainProbeSettingsInput probeSettingForUpdateDomainProbeSettingsInput = (ProbeSettingForUpdateDomainProbeSettingsInput) o;
    return Objects.equals(this.host, probeSettingForUpdateDomainProbeSettingsInput.host) &&
        Objects.equals(this.reqHeadersList, probeSettingForUpdateDomainProbeSettingsInput.reqHeadersList) &&
        Objects.equals(this._switch, probeSettingForUpdateDomainProbeSettingsInput._switch) &&
        Objects.equals(this.unhealthyStatusList, probeSettingForUpdateDomainProbeSettingsInput.unhealthyStatusList) &&
        Objects.equals(this.url, probeSettingForUpdateDomainProbeSettingsInput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, reqHeadersList, _switch, unhealthyStatusList, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProbeSettingForUpdateDomainProbeSettingsInput {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    reqHeadersList: ").append(toIndentedString(reqHeadersList)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
    sb.append("    unhealthyStatusList: ").append(toIndentedString(unhealthyStatusList)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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