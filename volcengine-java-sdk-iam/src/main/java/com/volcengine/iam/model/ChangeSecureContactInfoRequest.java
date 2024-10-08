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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChangeSecureContactInfoRequest
 */



public class ChangeSecureContactInfoRequest {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("NewEmail")
  private String newEmail = null;

  @SerializedName("NewMobilePhone")
  private String newMobilePhone = null;

  public ChangeSecureContactInfoRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ChangeSecureContactInfoRequest newEmail(String newEmail) {
    this.newEmail = newEmail;
    return this;
  }

   /**
   * Get newEmail
   * @return newEmail
  **/
  @Schema(description = "")
  public String getNewEmail() {
    return newEmail;
  }

  public void setNewEmail(String newEmail) {
    this.newEmail = newEmail;
  }

  public ChangeSecureContactInfoRequest newMobilePhone(String newMobilePhone) {
    this.newMobilePhone = newMobilePhone;
    return this;
  }

   /**
   * Get newMobilePhone
   * @return newMobilePhone
  **/
  @Schema(description = "")
  public String getNewMobilePhone() {
    return newMobilePhone;
  }

  public void setNewMobilePhone(String newMobilePhone) {
    this.newMobilePhone = newMobilePhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeSecureContactInfoRequest changeSecureContactInfoRequest = (ChangeSecureContactInfoRequest) o;
    return Objects.equals(this.code, changeSecureContactInfoRequest.code) &&
        Objects.equals(this.newEmail, changeSecureContactInfoRequest.newEmail) &&
        Objects.equals(this.newMobilePhone, changeSecureContactInfoRequest.newMobilePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, newEmail, newMobilePhone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeSecureContactInfoRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    newEmail: ").append(toIndentedString(newEmail)).append("\n");
    sb.append("    newMobilePhone: ").append(toIndentedString(newMobilePhone)).append("\n");
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
