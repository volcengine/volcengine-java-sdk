/*
 * vmp
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vmp.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vmp.model.DataForDeleteContactsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ErrorForDeleteContactsOutput
 */



public class ErrorForDeleteContactsOutput {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Data")
  private DataForDeleteContactsOutput data = null;

  @SerializedName("Message")
  private String message = null;

  public ErrorForDeleteContactsOutput code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorForDeleteContactsOutput data(DataForDeleteContactsOutput data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Valid
  @Schema(description = "")
  public DataForDeleteContactsOutput getData() {
    return data;
  }

  public void setData(DataForDeleteContactsOutput data) {
    this.data = data;
  }

  public ErrorForDeleteContactsOutput message(String message) {
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
    ErrorForDeleteContactsOutput errorForDeleteContactsOutput = (ErrorForDeleteContactsOutput) o;
    return Objects.equals(this.code, errorForDeleteContactsOutput.code) &&
        Objects.equals(this.data, errorForDeleteContactsOutput.data) &&
        Objects.equals(this.message, errorForDeleteContactsOutput.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorForDeleteContactsOutput {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
