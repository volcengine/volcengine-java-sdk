/*
 * rds_mssql
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmssql.model;

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
 * DescribeDBInstanceParametersRequest
 */



public class DescribeDBInstanceParametersRequest {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("ParameterNames")
  private String parameterNames = null;

  public DescribeDBInstanceParametersRequest instanceId(String instanceId) {
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

  public DescribeDBInstanceParametersRequest parameterNames(String parameterNames) {
    this.parameterNames = parameterNames;
    return this;
  }

   /**
   * Get parameterNames
   * @return parameterNames
  **/
  @Schema(description = "")
  public String getParameterNames() {
    return parameterNames;
  }

  public void setParameterNames(String parameterNames) {
    this.parameterNames = parameterNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstanceParametersRequest describeDBInstanceParametersRequest = (DescribeDBInstanceParametersRequest) o;
    return Objects.equals(this.instanceId, describeDBInstanceParametersRequest.instanceId) &&
        Objects.equals(this.parameterNames, describeDBInstanceParametersRequest.parameterNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, parameterNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstanceParametersRequest {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    parameterNames: ").append(toIndentedString(parameterNames)).append("\n");
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
