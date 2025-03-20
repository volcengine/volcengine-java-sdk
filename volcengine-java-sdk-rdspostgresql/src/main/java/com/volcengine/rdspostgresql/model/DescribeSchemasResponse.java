/*
 * rds_postgresql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdspostgresql.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.rdspostgresql.model.SchemaForDescribeSchemasOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSchemasResponse
 */



public class DescribeSchemasResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Schemas")
  private List<SchemaForDescribeSchemasOutput> schemas = null;

  @SerializedName("Total")
  private Integer total = null;

  public DescribeSchemasResponse schemas(List<SchemaForDescribeSchemasOutput> schemas) {
    this.schemas = schemas;
    return this;
  }

  public DescribeSchemasResponse addSchemasItem(SchemaForDescribeSchemasOutput schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<SchemaForDescribeSchemasOutput>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @Valid
  @Schema(description = "")
  public List<SchemaForDescribeSchemasOutput> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<SchemaForDescribeSchemasOutput> schemas) {
    this.schemas = schemas;
  }

  public DescribeSchemasResponse total(Integer total) {
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
    DescribeSchemasResponse describeSchemasResponse = (DescribeSchemasResponse) o;
    return Objects.equals(this.schemas, describeSchemasResponse.schemas) &&
        Objects.equals(this.total, describeSchemasResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSchemasResponse {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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
