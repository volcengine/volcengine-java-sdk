/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

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
 * CreatePermissionGroupResponse
 */



public class CreatePermissionGroupResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("PermissionGroupId")
  private String permissionGroupId = null;

  public CreatePermissionGroupResponse permissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
    return this;
  }

   /**
   * Get permissionGroupId
   * @return permissionGroupId
  **/
  @Schema(description = "")
  public String getPermissionGroupId() {
    return permissionGroupId;
  }

  public void setPermissionGroupId(String permissionGroupId) {
    this.permissionGroupId = permissionGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePermissionGroupResponse createPermissionGroupResponse = (CreatePermissionGroupResponse) o;
    return Objects.equals(this.permissionGroupId, createPermissionGroupResponse.permissionGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePermissionGroupResponse {\n");
    
    sb.append("    permissionGroupId: ").append(toIndentedString(permissionGroupId)).append("\n");
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
