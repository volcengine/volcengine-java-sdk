/*
 * spark
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.spark.model;

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
 * ListAppInstanceResponse
 */


public class ListAppInstanceResponse {
  @SerializedName("Current")
  private Long current = null;

  @SerializedName("Records")
  private List<Object> records = null;

  @SerializedName("Size")
  private Long size = null;

  @SerializedName("Total")
  private Long total = null;

  public ListAppInstanceResponse current(Long current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @Schema(description = "")
  public Long getCurrent() {
    return current;
  }

  public void setCurrent(Long current) {
    this.current = current;
  }

  public ListAppInstanceResponse records(List<Object> records) {
    this.records = records;
    return this;
  }

  public ListAppInstanceResponse addRecordsItem(Object recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Object>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @Schema(description = "")
  public List<Object> getRecords() {
    return records;
  }

  public void setRecords(List<Object> records) {
    this.records = records;
  }

  public ListAppInstanceResponse size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ListAppInstanceResponse total(Long total) {
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
    ListAppInstanceResponse listAppInstanceResponse = (ListAppInstanceResponse) o;
    return Objects.equals(this.current, listAppInstanceResponse.current) &&
        Objects.equals(this.records, listAppInstanceResponse.records) &&
        Objects.equals(this.size, listAppInstanceResponse.size) &&
        Objects.equals(this.total, listAppInstanceResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, records, size, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAppInstanceResponse {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
