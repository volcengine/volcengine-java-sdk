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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeAuditLogConfigResponse
 */



public class DescribeAuditLogConfigResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("SqlRetentionDay")
  private Integer sqlRetentionDay = null;

  public DescribeAuditLogConfigResponse sqlRetentionDay(Integer sqlRetentionDay) {
    this.sqlRetentionDay = sqlRetentionDay;
    return this;
  }

   /**
   * Get sqlRetentionDay
   * @return sqlRetentionDay
  **/
  @Schema(description = "")
  public Integer getSqlRetentionDay() {
    return sqlRetentionDay;
  }

  public void setSqlRetentionDay(Integer sqlRetentionDay) {
    this.sqlRetentionDay = sqlRetentionDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAuditLogConfigResponse describeAuditLogConfigResponse = (DescribeAuditLogConfigResponse) o;
    return Objects.equals(this.sqlRetentionDay, describeAuditLogConfigResponse.sqlRetentionDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sqlRetentionDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAuditLogConfigResponse {\n");
    
    sb.append("    sqlRetentionDay: ").append(toIndentedString(sqlRetentionDay)).append("\n");
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
