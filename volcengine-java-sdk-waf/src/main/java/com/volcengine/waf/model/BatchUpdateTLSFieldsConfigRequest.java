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
import com.volcengine.waf.model.TLSFieldsConfigForBatchUpdateTLSFieldsConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BatchUpdateTLSFieldsConfigRequest
 */



public class BatchUpdateTLSFieldsConfigRequest {
  @SerializedName("DomainList")
  private List<String> domainList = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("TLSFieldsConfig")
  private TLSFieldsConfigForBatchUpdateTLSFieldsConfigInput tlSFieldsConfig = null;

  public BatchUpdateTLSFieldsConfigRequest domainList(List<String> domainList) {
    this.domainList = domainList;
    return this;
  }

  public BatchUpdateTLSFieldsConfigRequest addDomainListItem(String domainListItem) {
    if (this.domainList == null) {
      this.domainList = new ArrayList<String>();
    }
    this.domainList.add(domainListItem);
    return this;
  }

   /**
   * Get domainList
   * @return domainList
  **/
  @Schema(description = "")
  public List<String> getDomainList() {
    return domainList;
  }

  public void setDomainList(List<String> domainList) {
    this.domainList = domainList;
  }

  public BatchUpdateTLSFieldsConfigRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public BatchUpdateTLSFieldsConfigRequest region(String region) {
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

  public BatchUpdateTLSFieldsConfigRequest tlSFieldsConfig(TLSFieldsConfigForBatchUpdateTLSFieldsConfigInput tlSFieldsConfig) {
    this.tlSFieldsConfig = tlSFieldsConfig;
    return this;
  }

   /**
   * Get tlSFieldsConfig
   * @return tlSFieldsConfig
  **/
  @Valid
  @Schema(description = "")
  public TLSFieldsConfigForBatchUpdateTLSFieldsConfigInput getTlSFieldsConfig() {
    return tlSFieldsConfig;
  }

  public void setTlSFieldsConfig(TLSFieldsConfigForBatchUpdateTLSFieldsConfigInput tlSFieldsConfig) {
    this.tlSFieldsConfig = tlSFieldsConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUpdateTLSFieldsConfigRequest batchUpdateTLSFieldsConfigRequest = (BatchUpdateTLSFieldsConfigRequest) o;
    return Objects.equals(this.domainList, batchUpdateTLSFieldsConfigRequest.domainList) &&
        Objects.equals(this.projectName, batchUpdateTLSFieldsConfigRequest.projectName) &&
        Objects.equals(this.region, batchUpdateTLSFieldsConfigRequest.region) &&
        Objects.equals(this.tlSFieldsConfig, batchUpdateTLSFieldsConfigRequest.tlSFieldsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainList, projectName, region, tlSFieldsConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUpdateTLSFieldsConfigRequest {\n");
    
    sb.append("    domainList: ").append(toIndentedString(domainList)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tlSFieldsConfig: ").append(toIndentedString(tlSFieldsConfig)).append("\n");
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