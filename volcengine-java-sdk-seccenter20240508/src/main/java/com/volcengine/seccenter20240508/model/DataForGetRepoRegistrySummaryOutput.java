/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * DataForGetRepoRegistrySummaryOutput
 */



public class DataForGetRepoRegistrySummaryOutput {
  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("UnreadyCount")
  private Integer unreadyCount = null;

  public DataForGetRepoRegistrySummaryOutput totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public DataForGetRepoRegistrySummaryOutput unreadyCount(Integer unreadyCount) {
    this.unreadyCount = unreadyCount;
    return this;
  }

   /**
   * Get unreadyCount
   * @return unreadyCount
  **/
  @Schema(description = "")
  public Integer getUnreadyCount() {
    return unreadyCount;
  }

  public void setUnreadyCount(Integer unreadyCount) {
    this.unreadyCount = unreadyCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForGetRepoRegistrySummaryOutput dataForGetRepoRegistrySummaryOutput = (DataForGetRepoRegistrySummaryOutput) o;
    return Objects.equals(this.totalCount, dataForGetRepoRegistrySummaryOutput.totalCount) &&
        Objects.equals(this.unreadyCount, dataForGetRepoRegistrySummaryOutput.unreadyCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, unreadyCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForGetRepoRegistrySummaryOutput {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    unreadyCount: ").append(toIndentedString(unreadyCount)).append("\n");
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
