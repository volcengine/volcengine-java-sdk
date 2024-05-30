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
import com.volcengine.dcdn.model.CertListForListCertOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListCertResponse
 */


public class ListCertResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CertList")
  private List<CertListForListCertOutput> certList = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListCertResponse certList(List<CertListForListCertOutput> certList) {
    this.certList = certList;
    return this;
  }

  public ListCertResponse addCertListItem(CertListForListCertOutput certListItem) {
    if (this.certList == null) {
      this.certList = new ArrayList<CertListForListCertOutput>();
    }
    this.certList.add(certListItem);
    return this;
  }

   /**
   * Get certList
   * @return certList
  **/
  @Valid
  @Schema(description = "")
  public List<CertListForListCertOutput> getCertList() {
    return certList;
  }

  public void setCertList(List<CertListForListCertOutput> certList) {
    this.certList = certList;
  }

  public ListCertResponse pageNumber(Integer pageNumber) {
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

  public ListCertResponse pageSize(Integer pageSize) {
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

  public ListCertResponse total(Integer total) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCertResponse listCertResponse = (ListCertResponse) o;
    return Objects.equals(this.certList, listCertResponse.certList) &&
        Objects.equals(this.pageNumber, listCertResponse.pageNumber) &&
        Objects.equals(this.pageSize, listCertResponse.pageSize) &&
        Objects.equals(this.total, listCertResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certList, pageNumber, pageSize, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCertResponse {\n");
    
    sb.append("    certList: ").append(toIndentedString(certList)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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