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
import com.volcengine.rdspostgresql.model.SchemaInfoForModifySchemaOwnerInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifySchemaOwnerRequest
 */



public class ModifySchemaOwnerRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("SchemaInfo")
  private List<SchemaInfoForModifySchemaOwnerInput> schemaInfo = null;

  public ModifySchemaOwnerRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ModifySchemaOwnerRequest schemaInfo(List<SchemaInfoForModifySchemaOwnerInput> schemaInfo) {
    this.schemaInfo = schemaInfo;
    return this;
  }

  public ModifySchemaOwnerRequest addSchemaInfoItem(SchemaInfoForModifySchemaOwnerInput schemaInfoItem) {
    if (this.schemaInfo == null) {
      this.schemaInfo = new ArrayList<SchemaInfoForModifySchemaOwnerInput>();
    }
    this.schemaInfo.add(schemaInfoItem);
    return this;
  }

   /**
   * Get schemaInfo
   * @return schemaInfo
  **/
  @Valid
  @Schema(description = "")
  public List<SchemaInfoForModifySchemaOwnerInput> getSchemaInfo() {
    return schemaInfo;
  }

  public void setSchemaInfo(List<SchemaInfoForModifySchemaOwnerInput> schemaInfo) {
    this.schemaInfo = schemaInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifySchemaOwnerRequest modifySchemaOwnerRequest = (ModifySchemaOwnerRequest) o;
    return Objects.equals(this.instanceId, modifySchemaOwnerRequest.instanceId) &&
        Objects.equals(this.schemaInfo, modifySchemaOwnerRequest.schemaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, schemaInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifySchemaOwnerRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    schemaInfo: ").append(toIndentedString(schemaInfo)).append("\n");
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
