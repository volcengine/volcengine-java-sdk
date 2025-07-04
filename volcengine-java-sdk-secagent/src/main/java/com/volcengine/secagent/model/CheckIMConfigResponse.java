/*
 * sec_agent
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.secagent.model;

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
 * CheckIMConfigResponse
 */



public class CheckIMConfigResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("IsPass")
  private Boolean isPass = null;

  @SerializedName("Message")
  private String message = null;

  public CheckIMConfigResponse isPass(Boolean isPass) {
    this.isPass = isPass;
    return this;
  }

   /**
   * Get isPass
   * @return isPass
  **/
  @Schema(description = "")
  public Boolean isIsPass() {
    return isPass;
  }

  public void setIsPass(Boolean isPass) {
    this.isPass = isPass;
  }

  public CheckIMConfigResponse message(String message) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckIMConfigResponse checkIMConfigResponse = (CheckIMConfigResponse) o;
    return Objects.equals(this.isPass, checkIMConfigResponse.isPass) &&
        Objects.equals(this.message, checkIMConfigResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPass, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckIMConfigResponse {\n");
    
    sb.append("    isPass: ").append(toIndentedString(isPass)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
