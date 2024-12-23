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
import com.volcengine.dcdn.model.BindListForListCertBindOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListCertBindResponse
 */



public class ListCertBindResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BindList")
  private List<BindListForListCertBindOutput> bindList = null;

  public ListCertBindResponse bindList(List<BindListForListCertBindOutput> bindList) {
    this.bindList = bindList;
    return this;
  }

  public ListCertBindResponse addBindListItem(BindListForListCertBindOutput bindListItem) {
    if (this.bindList == null) {
      this.bindList = new ArrayList<BindListForListCertBindOutput>();
    }
    this.bindList.add(bindListItem);
    return this;
  }

   /**
   * Get bindList
   * @return bindList
  **/
  @Valid
  @Schema(description = "")
  public List<BindListForListCertBindOutput> getBindList() {
    return bindList;
  }

  public void setBindList(List<BindListForListCertBindOutput> bindList) {
    this.bindList = bindList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCertBindResponse listCertBindResponse = (ListCertBindResponse) o;
    return Objects.equals(this.bindList, listCertBindResponse.bindList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCertBindResponse {\n");
    
    sb.append("    bindList: ").append(toIndentedString(bindList)).append("\n");
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
