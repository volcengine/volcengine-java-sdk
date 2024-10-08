/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.iam.model.RoleForGetRoleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetRoleResponse
 */



public class GetRoleResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Role")
  private RoleForGetRoleOutput role = null;

  public GetRoleResponse role(RoleForGetRoleOutput role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Valid
  @Schema(description = "")
  public RoleForGetRoleOutput getRole() {
    return role;
  }

  public void setRole(RoleForGetRoleOutput role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRoleResponse getRoleResponse = (GetRoleResponse) o;
    return Objects.equals(this.role, getRoleResponse.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRoleResponse {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
