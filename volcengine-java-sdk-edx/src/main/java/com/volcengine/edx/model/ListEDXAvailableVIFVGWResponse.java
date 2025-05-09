/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.edx.model.AvailableVIFVGWInstanceListForListEDXAvailableVIFVGWOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListEDXAvailableVIFVGWResponse
 */



public class ListEDXAvailableVIFVGWResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AvailableVIFVGWInstanceList")
  private List<AvailableVIFVGWInstanceListForListEDXAvailableVIFVGWOutput> availableVIFVGWInstanceList = null;

  public ListEDXAvailableVIFVGWResponse availableVIFVGWInstanceList(List<AvailableVIFVGWInstanceListForListEDXAvailableVIFVGWOutput> availableVIFVGWInstanceList) {
    this.availableVIFVGWInstanceList = availableVIFVGWInstanceList;
    return this;
  }

  public ListEDXAvailableVIFVGWResponse addAvailableVIFVGWInstanceListItem(AvailableVIFVGWInstanceListForListEDXAvailableVIFVGWOutput availableVIFVGWInstanceListItem) {
    if (this.availableVIFVGWInstanceList == null) {
      this.availableVIFVGWInstanceList = new ArrayList<AvailableVIFVGWInstanceListForListEDXAvailableVIFVGWOutput>();
    }
    this.availableVIFVGWInstanceList.add(availableVIFVGWInstanceListItem);
    return this;
  }

   /**
   * Get availableVIFVGWInstanceList
   * @return availableVIFVGWInstanceList
  **/
  @Valid
  @Schema(description = "")
  public List<AvailableVIFVGWInstanceListForListEDXAvailableVIFVGWOutput> getAvailableVIFVGWInstanceList() {
    return availableVIFVGWInstanceList;
  }

  public void setAvailableVIFVGWInstanceList(List<AvailableVIFVGWInstanceListForListEDXAvailableVIFVGWOutput> availableVIFVGWInstanceList) {
    this.availableVIFVGWInstanceList = availableVIFVGWInstanceList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEDXAvailableVIFVGWResponse listEDXAvailableVIFVGWResponse = (ListEDXAvailableVIFVGWResponse) o;
    return Objects.equals(this.availableVIFVGWInstanceList, listEDXAvailableVIFVGWResponse.availableVIFVGWInstanceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableVIFVGWInstanceList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEDXAvailableVIFVGWResponse {\n");
    
    sb.append("    availableVIFVGWInstanceList: ").append(toIndentedString(availableVIFVGWInstanceList)).append("\n");
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
