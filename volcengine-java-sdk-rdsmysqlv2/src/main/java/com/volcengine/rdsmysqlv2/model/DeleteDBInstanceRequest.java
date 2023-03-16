/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * DeleteDBInstanceRequest
 */


public class DeleteDBInstanceRequest {
  @SerializedName("DataKeepPolicy")
  private String dataKeepPolicy = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public DeleteDBInstanceRequest dataKeepPolicy(String dataKeepPolicy) {
    this.dataKeepPolicy = dataKeepPolicy;
    return this;
  }

   /**
   * Get dataKeepPolicy
   * @return dataKeepPolicy
  **/
  @Schema(description = "")
  public String getDataKeepPolicy() {
    return dataKeepPolicy;
  }

  public void setDataKeepPolicy(String dataKeepPolicy) {
    this.dataKeepPolicy = dataKeepPolicy;
  }

  public DeleteDBInstanceRequest instanceId(String instanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDBInstanceRequest deleteDBInstanceRequest = (DeleteDBInstanceRequest) o;
    return Objects.equals(this.dataKeepPolicy, deleteDBInstanceRequest.dataKeepPolicy) &&
        Objects.equals(this.instanceId, deleteDBInstanceRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataKeepPolicy, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDBInstanceRequest {\n");
    
    sb.append("    dataKeepPolicy: ").append(toIndentedString(dataKeepPolicy)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
