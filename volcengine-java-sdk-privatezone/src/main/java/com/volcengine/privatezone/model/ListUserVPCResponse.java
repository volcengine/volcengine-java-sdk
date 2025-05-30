/*
 * private_zone
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.privatezone.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.privatezone.model.VPCForListUserVPCOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListUserVPCResponse
 */



public class ListUserVPCResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Total")
  private Integer total = null;

  @SerializedName("VPCs")
  private List<VPCForListUserVPCOutput> vpCs = null;

  public ListUserVPCResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ListUserVPCResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListUserVPCResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ListUserVPCResponse vpCs(List<VPCForListUserVPCOutput> vpCs) {
    this.vpCs = vpCs;
    return this;
  }

  public ListUserVPCResponse addVpCsItem(VPCForListUserVPCOutput vpCsItem) {
    if (this.vpCs == null) {
      this.vpCs = new ArrayList<VPCForListUserVPCOutput>();
    }
    this.vpCs.add(vpCsItem);
    return this;
  }

   /**
   * Get vpCs
   * @return vpCs
  **/
  @Valid
  @Schema(description = "")
  public List<VPCForListUserVPCOutput> getVpCs() {
    return vpCs;
  }

  public void setVpCs(List<VPCForListUserVPCOutput> vpCs) {
    this.vpCs = vpCs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUserVPCResponse listUserVPCResponse = (ListUserVPCResponse) o;
    return Objects.equals(this.pageNumber, listUserVPCResponse.pageNumber) &&
        Objects.equals(this.pageSize, listUserVPCResponse.pageSize) &&
        Objects.equals(this.total, listUserVPCResponse.total) &&
        Objects.equals(this.vpCs, listUserVPCResponse.vpCs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, total, vpCs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUserVPCResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    vpCs: ").append(toIndentedString(vpCs)).append("\n");
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
