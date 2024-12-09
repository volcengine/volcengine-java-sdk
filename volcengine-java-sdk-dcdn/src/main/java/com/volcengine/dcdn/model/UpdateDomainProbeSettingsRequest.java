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
import com.volcengine.dcdn.model.ProbeSettingInfoForUpdateDomainProbeSettingsInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateDomainProbeSettingsRequest
 */



public class UpdateDomainProbeSettingsRequest {
  @SerializedName("ProbeSettingInfo")
  private List<ProbeSettingInfoForUpdateDomainProbeSettingsInput> probeSettingInfo = null;

  public UpdateDomainProbeSettingsRequest probeSettingInfo(List<ProbeSettingInfoForUpdateDomainProbeSettingsInput> probeSettingInfo) {
    this.probeSettingInfo = probeSettingInfo;
    return this;
  }

  public UpdateDomainProbeSettingsRequest addProbeSettingInfoItem(ProbeSettingInfoForUpdateDomainProbeSettingsInput probeSettingInfoItem) {
    if (this.probeSettingInfo == null) {
      this.probeSettingInfo = new ArrayList<ProbeSettingInfoForUpdateDomainProbeSettingsInput>();
    }
    this.probeSettingInfo.add(probeSettingInfoItem);
    return this;
  }

   /**
   * Get probeSettingInfo
   * @return probeSettingInfo
  **/
  @Valid
  @Schema(description = "")
  public List<ProbeSettingInfoForUpdateDomainProbeSettingsInput> getProbeSettingInfo() {
    return probeSettingInfo;
  }

  public void setProbeSettingInfo(List<ProbeSettingInfoForUpdateDomainProbeSettingsInput> probeSettingInfo) {
    this.probeSettingInfo = probeSettingInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDomainProbeSettingsRequest updateDomainProbeSettingsRequest = (UpdateDomainProbeSettingsRequest) o;
    return Objects.equals(this.probeSettingInfo, updateDomainProbeSettingsRequest.probeSettingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probeSettingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDomainProbeSettingsRequest {\n");
    
    sb.append("    probeSettingInfo: ").append(toIndentedString(probeSettingInfo)).append("\n");
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
