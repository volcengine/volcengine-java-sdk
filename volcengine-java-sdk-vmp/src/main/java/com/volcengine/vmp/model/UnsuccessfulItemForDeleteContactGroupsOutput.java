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
import com.volcengine.vmp.model.ErrorForDeleteContactGroupsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UnsuccessfulItemForDeleteContactGroupsOutput
 */



public class UnsuccessfulItemForDeleteContactGroupsOutput {
  @SerializedName("Error")
  private ErrorForDeleteContactGroupsOutput error = null;

  @SerializedName("Id")
  private String id = null;

  public UnsuccessfulItemForDeleteContactGroupsOutput error(ErrorForDeleteContactGroupsOutput error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Valid
  @Schema(description = "")
  public ErrorForDeleteContactGroupsOutput getError() {
    return error;
  }

  public void setError(ErrorForDeleteContactGroupsOutput error) {
    this.error = error;
  }

  public UnsuccessfulItemForDeleteContactGroupsOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsuccessfulItemForDeleteContactGroupsOutput unsuccessfulItemForDeleteContactGroupsOutput = (UnsuccessfulItemForDeleteContactGroupsOutput) o;
    return Objects.equals(this.error, unsuccessfulItemForDeleteContactGroupsOutput.error) &&
        Objects.equals(this.id, unsuccessfulItemForDeleteContactGroupsOutput.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsuccessfulItemForDeleteContactGroupsOutput {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
