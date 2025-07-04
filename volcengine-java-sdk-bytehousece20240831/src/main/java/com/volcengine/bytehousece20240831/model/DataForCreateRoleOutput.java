/*
 * bytehouse_ce20240831
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bytehousece20240831.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.bytehousece20240831.model.RoleForCreateRoleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DataForCreateRoleOutput
 */



public class DataForCreateRoleOutput {
  @SerializedName("Message")
  private String message = null;

  @SerializedName("Role")
  private RoleForCreateRoleOutput role = null;

  public DataForCreateRoleOutput message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DataForCreateRoleOutput role(RoleForCreateRoleOutput role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Valid
  @Schema(description = "")
  public RoleForCreateRoleOutput getRole() {
    return role;
  }

  public void setRole(RoleForCreateRoleOutput role) {
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
    DataForCreateRoleOutput dataForCreateRoleOutput = (DataForCreateRoleOutput) o;
    return Objects.equals(this.message, dataForCreateRoleOutput.message) &&
        Objects.equals(this.role, dataForCreateRoleOutput.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForCreateRoleOutput {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
