/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * DescribeListenerHealthRequest
 */



public class DescribeListenerHealthRequest {
  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("OnlyUnHealthy")
  private Boolean onlyUnHealthy = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeListenerHealthRequest listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public DescribeListenerHealthRequest onlyUnHealthy(Boolean onlyUnHealthy) {
    this.onlyUnHealthy = onlyUnHealthy;
    return this;
  }

   /**
   * Get onlyUnHealthy
   * @return onlyUnHealthy
  **/
  @Schema(description = "")
  public Boolean isOnlyUnHealthy() {
    return onlyUnHealthy;
  }

  public void setOnlyUnHealthy(Boolean onlyUnHealthy) {
    this.onlyUnHealthy = onlyUnHealthy;
  }

  public DescribeListenerHealthRequest pageNumber(Integer pageNumber) {
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

  public DescribeListenerHealthRequest pageSize(Integer pageSize) {
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
    DescribeListenerHealthRequest describeListenerHealthRequest = (DescribeListenerHealthRequest) o;
    return Objects.equals(this.listenerId, describeListenerHealthRequest.listenerId) &&
        Objects.equals(this.onlyUnHealthy, describeListenerHealthRequest.onlyUnHealthy) &&
        Objects.equals(this.pageNumber, describeListenerHealthRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeListenerHealthRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenerId, onlyUnHealthy, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeListenerHealthRequest {\n");
    
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    onlyUnHealthy: ").append(toIndentedString(onlyUnHealthy)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
