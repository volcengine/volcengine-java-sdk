/*
 * fwcenter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.fwcenter.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDnsControlPolicyRequest
 */



public class DescribeDnsControlPolicyRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Destination")
  private List<String> destination = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RuleId")
  private List<String> ruleId = null;

  @SerializedName("Source")
  private List<String> source = null;

  @SerializedName("Status")
  private List<Boolean> status = null;

  public DescribeDnsControlPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DescribeDnsControlPolicyRequest destination(List<String> destination) {
    this.destination = destination;
    return this;
  }

  public DescribeDnsControlPolicyRequest addDestinationItem(String destinationItem) {
    if (this.destination == null) {
      this.destination = new ArrayList<String>();
    }
    this.destination.add(destinationItem);
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public List<String> getDestination() {
    return destination;
  }

  public void setDestination(List<String> destination) {
    this.destination = destination;
  }

  public DescribeDnsControlPolicyRequest pageNumber(Integer pageNumber) {
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

  public DescribeDnsControlPolicyRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * maximum: 100
   * @return pageSize
  **/
 @Max(100)  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeDnsControlPolicyRequest ruleId(List<String> ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public DescribeDnsControlPolicyRequest addRuleIdItem(String ruleIdItem) {
    if (this.ruleId == null) {
      this.ruleId = new ArrayList<String>();
    }
    this.ruleId.add(ruleIdItem);
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @Schema(description = "")
  public List<String> getRuleId() {
    return ruleId;
  }

  public void setRuleId(List<String> ruleId) {
    this.ruleId = ruleId;
  }

  public DescribeDnsControlPolicyRequest source(List<String> source) {
    this.source = source;
    return this;
  }

  public DescribeDnsControlPolicyRequest addSourceItem(String sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<String>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public List<String> getSource() {
    return source;
  }

  public void setSource(List<String> source) {
    this.source = source;
  }

  public DescribeDnsControlPolicyRequest status(List<Boolean> status) {
    this.status = status;
    return this;
  }

  public DescribeDnsControlPolicyRequest addStatusItem(Boolean statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<Boolean>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public List<Boolean> getStatus() {
    return status;
  }

  public void setStatus(List<Boolean> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDnsControlPolicyRequest describeDnsControlPolicyRequest = (DescribeDnsControlPolicyRequest) o;
    return Objects.equals(this.description, describeDnsControlPolicyRequest.description) &&
        Objects.equals(this.destination, describeDnsControlPolicyRequest.destination) &&
        Objects.equals(this.pageNumber, describeDnsControlPolicyRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeDnsControlPolicyRequest.pageSize) &&
        Objects.equals(this.ruleId, describeDnsControlPolicyRequest.ruleId) &&
        Objects.equals(this.source, describeDnsControlPolicyRequest.source) &&
        Objects.equals(this.status, describeDnsControlPolicyRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, destination, pageNumber, pageSize, ruleId, source, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDnsControlPolicyRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
