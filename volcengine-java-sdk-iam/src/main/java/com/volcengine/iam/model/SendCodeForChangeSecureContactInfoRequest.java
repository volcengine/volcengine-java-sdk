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
 * SendCodeForChangeSecureContactInfoRequest
 */



public class SendCodeForChangeSecureContactInfoRequest {
  @SerializedName("NewEmail")
  private String newEmail = null;

  @SerializedName("NewMobilePhone")
  private String newMobilePhone = null;

  public SendCodeForChangeSecureContactInfoRequest newEmail(String newEmail) {
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

  public SendCodeForChangeSecureContactInfoRequest newMobilePhone(String newMobilePhone) {
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
    SendCodeForChangeSecureContactInfoRequest sendCodeForChangeSecureContactInfoRequest = (SendCodeForChangeSecureContactInfoRequest) o;
    return Objects.equals(this.newEmail, sendCodeForChangeSecureContactInfoRequest.newEmail) &&
        Objects.equals(this.newMobilePhone, sendCodeForChangeSecureContactInfoRequest.newMobilePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newEmail, newMobilePhone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCodeForChangeSecureContactInfoRequest {\n");
    
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
