/*
 * rds_mysql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdsmysql.model.DataForListDatabasesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListDatabasesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-19T16:52:50.262695+08:00[Asia/Shanghai]")
public class ListDatabasesResponse {
  @SerializedName("Datas")
  private List<DataForListDatabasesOutput> datas = null;

  @SerializedName("Total")
  private Integer total = null;

  public ListDatabasesResponse datas(List<DataForListDatabasesOutput> datas) {
    this.datas = datas;
    return this;
  }

  public ListDatabasesResponse addDatasItem(DataForListDatabasesOutput datasItem) {
    if (this.datas == null) {
      this.datas = new ArrayList<DataForListDatabasesOutput>();
    }
    this.datas.add(datasItem);
    return this;
  }

   /**
   * Get datas
   * @return datas
  **/
  @Valid
  @Schema(description = "")
  public List<DataForListDatabasesOutput> getDatas() {
    return datas;
  }

  public void setDatas(List<DataForListDatabasesOutput> datas) {
    this.datas = datas;
  }

  public ListDatabasesResponse total(Integer total) {
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
    ListDatabasesResponse listDatabasesResponse = (ListDatabasesResponse) o;
    return Objects.equals(this.datas, listDatabasesResponse.datas) &&
        Objects.equals(this.total, listDatabasesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datas, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDatabasesResponse {\n");
    
    sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
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
