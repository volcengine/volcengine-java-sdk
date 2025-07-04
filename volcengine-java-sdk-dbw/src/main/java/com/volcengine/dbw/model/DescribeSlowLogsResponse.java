/*
 * dbw
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dbw.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.dbw.model.SlowLogForDescribeSlowLogsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSlowLogsResponse
 */



public class DescribeSlowLogsResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("SlowLogs")
  private List<SlowLogForDescribeSlowLogsOutput> slowLogs = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeSlowLogsResponse slowLogs(List<SlowLogForDescribeSlowLogsOutput> slowLogs) {
    this.slowLogs = slowLogs;
    return this;
  }

  public DescribeSlowLogsResponse addSlowLogsItem(SlowLogForDescribeSlowLogsOutput slowLogsItem) {
    if (this.slowLogs == null) {
      this.slowLogs = new ArrayList<SlowLogForDescribeSlowLogsOutput>();
    }
    this.slowLogs.add(slowLogsItem);
    return this;
  }

   /**
   * Get slowLogs
   * @return slowLogs
  **/
  @Valid
  @Schema(description = "")
  public List<SlowLogForDescribeSlowLogsOutput> getSlowLogs() {
    return slowLogs;
  }

  public void setSlowLogs(List<SlowLogForDescribeSlowLogsOutput> slowLogs) {
    this.slowLogs = slowLogs;
  }

  public DescribeSlowLogsResponse total(Integer total) {
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
    DescribeSlowLogsResponse describeSlowLogsResponse = (DescribeSlowLogsResponse) o;
    return Objects.equals(this.slowLogs, describeSlowLogsResponse.slowLogs) &&
        Objects.equals(this.total, describeSlowLogsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slowLogs, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSlowLogsResponse {\n");
    
    sb.append("    slowLogs: ").append(toIndentedString(slowLogs)).append("\n");
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
