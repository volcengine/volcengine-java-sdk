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
import com.volcengine.edx.model.TopoBandwidthPkgListForListTopoAvailableEDXBandwidthPkgOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListTopoAvailableEDXBandwidthPkgResponse
 */



public class ListTopoAvailableEDXBandwidthPkgResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("TopoBandwidthPkgList")
  private List<TopoBandwidthPkgListForListTopoAvailableEDXBandwidthPkgOutput> topoBandwidthPkgList = null;

  public ListTopoAvailableEDXBandwidthPkgResponse topoBandwidthPkgList(List<TopoBandwidthPkgListForListTopoAvailableEDXBandwidthPkgOutput> topoBandwidthPkgList) {
    this.topoBandwidthPkgList = topoBandwidthPkgList;
    return this;
  }

  public ListTopoAvailableEDXBandwidthPkgResponse addTopoBandwidthPkgListItem(TopoBandwidthPkgListForListTopoAvailableEDXBandwidthPkgOutput topoBandwidthPkgListItem) {
    if (this.topoBandwidthPkgList == null) {
      this.topoBandwidthPkgList = new ArrayList<TopoBandwidthPkgListForListTopoAvailableEDXBandwidthPkgOutput>();
    }
    this.topoBandwidthPkgList.add(topoBandwidthPkgListItem);
    return this;
  }

   /**
   * Get topoBandwidthPkgList
   * @return topoBandwidthPkgList
  **/
  @Valid
  @Schema(description = "")
  public List<TopoBandwidthPkgListForListTopoAvailableEDXBandwidthPkgOutput> getTopoBandwidthPkgList() {
    return topoBandwidthPkgList;
  }

  public void setTopoBandwidthPkgList(List<TopoBandwidthPkgListForListTopoAvailableEDXBandwidthPkgOutput> topoBandwidthPkgList) {
    this.topoBandwidthPkgList = topoBandwidthPkgList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTopoAvailableEDXBandwidthPkgResponse listTopoAvailableEDXBandwidthPkgResponse = (ListTopoAvailableEDXBandwidthPkgResponse) o;
    return Objects.equals(this.topoBandwidthPkgList, listTopoAvailableEDXBandwidthPkgResponse.topoBandwidthPkgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topoBandwidthPkgList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTopoAvailableEDXBandwidthPkgResponse {\n");
    
    sb.append("    topoBandwidthPkgList: ").append(toIndentedString(topoBandwidthPkgList)).append("\n");
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
