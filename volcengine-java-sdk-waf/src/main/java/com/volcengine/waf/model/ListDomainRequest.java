/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDomainRequest
 */



public class ListDomainRequest {
  @SerializedName("AccurateQuery")
  private Integer accurateQuery = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Region")
  private String region = null;

  public ListDomainRequest accurateQuery(Integer accurateQuery) {
    this.accurateQuery = accurateQuery;
    return this;
  }

   /**
   * Get accurateQuery
   * @return accurateQuery
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getAccurateQuery() {
    return accurateQuery;
  }

  public void setAccurateQuery(Integer accurateQuery) {
    this.accurateQuery = accurateQuery;
  }

  public ListDomainRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public ListDomainRequest page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ListDomainRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ListDomainRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDomainRequest listDomainRequest = (ListDomainRequest) o;
    return Objects.equals(this.accurateQuery, listDomainRequest.accurateQuery) &&
        Objects.equals(this.domain, listDomainRequest.domain) &&
        Objects.equals(this.page, listDomainRequest.page) &&
        Objects.equals(this.pageSize, listDomainRequest.pageSize) &&
        Objects.equals(this.region, listDomainRequest.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurateQuery, domain, page, pageSize, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDomainRequest {\n");
    
    sb.append("    accurateQuery: ").append(toIndentedString(accurateQuery)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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