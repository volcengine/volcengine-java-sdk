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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserForGetUserInitialPasswordOutput
 */



public class UserForGetUserInitialPasswordOutput {
  @SerializedName("Message")
  private String message = null;

  @SerializedName("PasswordIsDefault")
  private Boolean passwordIsDefault = null;

  public UserForGetUserInitialPasswordOutput message(String message) {
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

  public UserForGetUserInitialPasswordOutput passwordIsDefault(Boolean passwordIsDefault) {
    this.passwordIsDefault = passwordIsDefault;
    return this;
  }

   /**
   * Get passwordIsDefault
   * @return passwordIsDefault
  **/
  @Schema(description = "")
  public Boolean isPasswordIsDefault() {
    return passwordIsDefault;
  }

  public void setPasswordIsDefault(Boolean passwordIsDefault) {
    this.passwordIsDefault = passwordIsDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserForGetUserInitialPasswordOutput userForGetUserInitialPasswordOutput = (UserForGetUserInitialPasswordOutput) o;
    return Objects.equals(this.message, userForGetUserInitialPasswordOutput.message) &&
        Objects.equals(this.passwordIsDefault, userForGetUserInitialPasswordOutput.passwordIsDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, passwordIsDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserForGetUserInitialPasswordOutput {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    passwordIsDefault: ").append(toIndentedString(passwordIsDefault)).append("\n");
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
