/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bio.model.RepositorySchemaForCreateDataModelInput;
import com.volcengine.bio.model.RowForCreateDataModelInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDataModelRequest
 */



public class CreateDataModelRequest {
  @SerializedName("Headers")
  private List<String> headers = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RepositorySchema")
  private RepositorySchemaForCreateDataModelInput repositorySchema = null;

  @SerializedName("Rows")
  private List<RowForCreateDataModelInput> rows = null;

  @SerializedName("WorkspaceID")
  private String workspaceID = null;

  public CreateDataModelRequest headers(List<String> headers) {
    this.headers = headers;
    return this;
  }

  public CreateDataModelRequest addHeadersItem(String headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<String>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @Schema(description = "")
  public List<String> getHeaders() {
    return headers;
  }

  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }

  public CreateDataModelRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @NotNull
 @Size(min=1,max=30)  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateDataModelRequest repositorySchema(RepositorySchemaForCreateDataModelInput repositorySchema) {
    this.repositorySchema = repositorySchema;
    return this;
  }

   /**
   * Get repositorySchema
   * @return repositorySchema
  **/
  @Valid
  @Schema(description = "")
  public RepositorySchemaForCreateDataModelInput getRepositorySchema() {
    return repositorySchema;
  }

  public void setRepositorySchema(RepositorySchemaForCreateDataModelInput repositorySchema) {
    this.repositorySchema = repositorySchema;
  }

  public CreateDataModelRequest rows(List<RowForCreateDataModelInput> rows) {
    this.rows = rows;
    return this;
  }

  public CreateDataModelRequest addRowsItem(RowForCreateDataModelInput rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<RowForCreateDataModelInput>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @Valid
  @Schema(description = "")
  public List<RowForCreateDataModelInput> getRows() {
    return rows;
  }

  public void setRows(List<RowForCreateDataModelInput> rows) {
    this.rows = rows;
  }

  public CreateDataModelRequest workspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
    return this;
  }

   /**
   * Get workspaceID
   * @return workspaceID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getWorkspaceID() {
    return workspaceID;
  }

  public void setWorkspaceID(String workspaceID) {
    this.workspaceID = workspaceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataModelRequest createDataModelRequest = (CreateDataModelRequest) o;
    return Objects.equals(this.headers, createDataModelRequest.headers) &&
        Objects.equals(this.name, createDataModelRequest.name) &&
        Objects.equals(this.repositorySchema, createDataModelRequest.repositorySchema) &&
        Objects.equals(this.rows, createDataModelRequest.rows) &&
        Objects.equals(this.workspaceID, createDataModelRequest.workspaceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, name, repositorySchema, rows, workspaceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataModelRequest {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositorySchema: ").append(toIndentedString(repositorySchema)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    workspaceID: ").append(toIndentedString(workspaceID)).append("\n");
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
