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
import com.volcengine.cdn.model.CertInfoListForDescribeCdnConfigOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CertCheckForDescribeCdnConfigOutput
 */



public class CertCheckForDescribeCdnConfigOutput {
  @SerializedName("CertInfoList")
  private List<CertInfoListForDescribeCdnConfigOutput> certInfoList = null;

  @SerializedName("Switch")
  private Boolean _switch = null;

  public CertCheckForDescribeCdnConfigOutput certInfoList(List<CertInfoListForDescribeCdnConfigOutput> certInfoList) {
    this.certInfoList = certInfoList;
    return this;
  }

  public CertCheckForDescribeCdnConfigOutput addCertInfoListItem(CertInfoListForDescribeCdnConfigOutput certInfoListItem) {
    if (this.certInfoList == null) {
      this.certInfoList = new ArrayList<CertInfoListForDescribeCdnConfigOutput>();
    }
    this.certInfoList.add(certInfoListItem);
    return this;
  }

   /**
   * Get certInfoList
   * @return certInfoList
  **/
  @Valid
  @Schema(description = "")
  public List<CertInfoListForDescribeCdnConfigOutput> getCertInfoList() {
    return certInfoList;
  }

  public void setCertInfoList(List<CertInfoListForDescribeCdnConfigOutput> certInfoList) {
    this.certInfoList = certInfoList;
  }

  public CertCheckForDescribeCdnConfigOutput _switch(Boolean _switch) {
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
    CertCheckForDescribeCdnConfigOutput certCheckForDescribeCdnConfigOutput = (CertCheckForDescribeCdnConfigOutput) o;
    return Objects.equals(this.certInfoList, certCheckForDescribeCdnConfigOutput.certInfoList) &&
        Objects.equals(this._switch, certCheckForDescribeCdnConfigOutput._switch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certInfoList, _switch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertCheckForDescribeCdnConfigOutput {\n");
    
    sb.append("    certInfoList: ").append(toIndentedString(certInfoList)).append("\n");
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
