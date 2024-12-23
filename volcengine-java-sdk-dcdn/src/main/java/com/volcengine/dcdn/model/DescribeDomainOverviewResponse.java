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
import com.volcengine.dcdn.model.DomainForDescribeDomainOverviewOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDomainOverviewResponse
 */



public class DescribeDomainOverviewResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AllDomainNum")
  private Integer allDomainNum = null;

  @SerializedName("Domains")
  private List<DomainForDescribeDomainOverviewOutput> domains = null;

  @SerializedName("OnlineDomainNum")
  private Integer onlineDomainNum = null;

  @SerializedName("PageNum")
  private Integer pageNum = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeDomainOverviewResponse allDomainNum(Integer allDomainNum) {
    this.allDomainNum = allDomainNum;
    return this;
  }

   /**
   * Get allDomainNum
   * @return allDomainNum
  **/
  @Schema(description = "")
  public Integer getAllDomainNum() {
    return allDomainNum;
  }

  public void setAllDomainNum(Integer allDomainNum) {
    this.allDomainNum = allDomainNum;
  }

  public DescribeDomainOverviewResponse domains(List<DomainForDescribeDomainOverviewOutput> domains) {
    this.domains = domains;
    return this;
  }

  public DescribeDomainOverviewResponse addDomainsItem(DomainForDescribeDomainOverviewOutput domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<DomainForDescribeDomainOverviewOutput>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @Valid
  @Schema(description = "")
  public List<DomainForDescribeDomainOverviewOutput> getDomains() {
    return domains;
  }

  public void setDomains(List<DomainForDescribeDomainOverviewOutput> domains) {
    this.domains = domains;
  }

  public DescribeDomainOverviewResponse onlineDomainNum(Integer onlineDomainNum) {
    this.onlineDomainNum = onlineDomainNum;
    return this;
  }

   /**
   * Get onlineDomainNum
   * @return onlineDomainNum
  **/
  @Schema(description = "")
  public Integer getOnlineDomainNum() {
    return onlineDomainNum;
  }

  public void setOnlineDomainNum(Integer onlineDomainNum) {
    this.onlineDomainNum = onlineDomainNum;
  }

  public DescribeDomainOverviewResponse pageNum(Integer pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @Schema(description = "")
  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public DescribeDomainOverviewResponse pageSize(Integer pageSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDomainOverviewResponse describeDomainOverviewResponse = (DescribeDomainOverviewResponse) o;
    return Objects.equals(this.allDomainNum, describeDomainOverviewResponse.allDomainNum) &&
        Objects.equals(this.domains, describeDomainOverviewResponse.domains) &&
        Objects.equals(this.onlineDomainNum, describeDomainOverviewResponse.onlineDomainNum) &&
        Objects.equals(this.pageNum, describeDomainOverviewResponse.pageNum) &&
        Objects.equals(this.pageSize, describeDomainOverviewResponse.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDomainNum, domains, onlineDomainNum, pageNum, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDomainOverviewResponse {\n");
    
    sb.append("    allDomainNum: ").append(toIndentedString(allDomainNum)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    onlineDomainNum: ").append(toIndentedString(onlineDomainNum)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
