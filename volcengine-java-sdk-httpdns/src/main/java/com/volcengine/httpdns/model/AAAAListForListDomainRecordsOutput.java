/*
 * httpdns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.httpdns.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.httpdns.model.RecordForListDomainRecordsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AAAAListForListDomainRecordsOutput
 */



public class AAAAListForListDomainRecordsOutput {
  @SerializedName("Line")
  private String line = null;

  @SerializedName("Records")
  private List<RecordForListDomainRecordsOutput> records = null;

  public AAAAListForListDomainRecordsOutput line(String line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @Schema(description = "")
  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public AAAAListForListDomainRecordsOutput records(List<RecordForListDomainRecordsOutput> records) {
    this.records = records;
    return this;
  }

  public AAAAListForListDomainRecordsOutput addRecordsItem(RecordForListDomainRecordsOutput recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<RecordForListDomainRecordsOutput>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @Valid
  @Schema(description = "")
  public List<RecordForListDomainRecordsOutput> getRecords() {
    return records;
  }

  public void setRecords(List<RecordForListDomainRecordsOutput> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AAAAListForListDomainRecordsOutput aaAAListForListDomainRecordsOutput = (AAAAListForListDomainRecordsOutput) o;
    return Objects.equals(this.line, aaAAListForListDomainRecordsOutput.line) &&
        Objects.equals(this.records, aaAAListForListDomainRecordsOutput.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AAAAListForListDomainRecordsOutput {\n");
    
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
