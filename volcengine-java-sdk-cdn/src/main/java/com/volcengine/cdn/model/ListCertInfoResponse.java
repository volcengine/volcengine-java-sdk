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
import com.volcengine.cdn.model.CertInfoForListCertInfoOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListCertInfoResponse
 */



public class ListCertInfoResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CertInfo")
  private List<CertInfoForListCertInfoOutput> certInfo = null;

  @SerializedName("ExpiringCount")
  private Long expiringCount = null;

  @SerializedName("PageNum")
  private Long pageNum = null;

  @SerializedName("PageSize")
  private Long pageSize = null;

  @SerializedName("Total")
  private Long total = null;

  public ListCertInfoResponse certInfo(List<CertInfoForListCertInfoOutput> certInfo) {
    this.certInfo = certInfo;
    return this;
  }

  public ListCertInfoResponse addCertInfoItem(CertInfoForListCertInfoOutput certInfoItem) {
    if (this.certInfo == null) {
      this.certInfo = new ArrayList<CertInfoForListCertInfoOutput>();
    }
    this.certInfo.add(certInfoItem);
    return this;
  }

   /**
   * Get certInfo
   * @return certInfo
  **/
  @Valid
  @Schema(description = "")
  public List<CertInfoForListCertInfoOutput> getCertInfo() {
    return certInfo;
  }

  public void setCertInfo(List<CertInfoForListCertInfoOutput> certInfo) {
    this.certInfo = certInfo;
  }

  public ListCertInfoResponse expiringCount(Long expiringCount) {
    this.expiringCount = expiringCount;
    return this;
  }

   /**
   * Get expiringCount
   * @return expiringCount
  **/
  @Schema(description = "")
  public Long getExpiringCount() {
    return expiringCount;
  }

  public void setExpiringCount(Long expiringCount) {
    this.expiringCount = expiringCount;
  }

  public ListCertInfoResponse pageNum(Long pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @Schema(description = "")
  public Long getPageNum() {
    return pageNum;
  }

  public void setPageNum(Long pageNum) {
    this.pageNum = pageNum;
  }

  public ListCertInfoResponse pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public ListCertInfoResponse total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @Schema(description = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
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
    ListCertInfoResponse listCertInfoResponse = (ListCertInfoResponse) o;
    return Objects.equals(this.certInfo, listCertInfoResponse.certInfo) &&
        Objects.equals(this.expiringCount, listCertInfoResponse.expiringCount) &&
        Objects.equals(this.pageNum, listCertInfoResponse.pageNum) &&
        Objects.equals(this.pageSize, listCertInfoResponse.pageSize) &&
        Objects.equals(this.total, listCertInfoResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certInfo, expiringCount, pageNum, pageSize, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCertInfoResponse {\n");
    
    sb.append("    certInfo: ").append(toIndentedString(certInfo)).append("\n");
    sb.append("    expiringCount: ").append(toIndentedString(expiringCount)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
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
