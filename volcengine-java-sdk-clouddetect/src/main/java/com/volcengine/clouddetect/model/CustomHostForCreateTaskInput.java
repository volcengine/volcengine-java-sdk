/*
 * cloud_detect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clouddetect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomHostForCreateTaskInput
 */



public class CustomHostForCreateTaskInput {
  @SerializedName("RawHostPort")
  private String rawHostPort = null;

  @SerializedName("ResolveList")
  private List<String> resolveList = null;

  public CustomHostForCreateTaskInput rawHostPort(String rawHostPort) {
    this.rawHostPort = rawHostPort;
    return this;
  }

   /**
   * Get rawHostPort
   * @return rawHostPort
  **/
  @Schema(description = "")
  public String getRawHostPort() {
    return rawHostPort;
  }

  public void setRawHostPort(String rawHostPort) {
    this.rawHostPort = rawHostPort;
  }

  public CustomHostForCreateTaskInput resolveList(List<String> resolveList) {
    this.resolveList = resolveList;
    return this;
  }

  public CustomHostForCreateTaskInput addResolveListItem(String resolveListItem) {
    if (this.resolveList == null) {
      this.resolveList = new ArrayList<String>();
    }
    this.resolveList.add(resolveListItem);
    return this;
  }

   /**
   * Get resolveList
   * @return resolveList
  **/
  @Schema(description = "")
  public List<String> getResolveList() {
    return resolveList;
  }

  public void setResolveList(List<String> resolveList) {
    this.resolveList = resolveList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomHostForCreateTaskInput customHostForCreateTaskInput = (CustomHostForCreateTaskInput) o;
    return Objects.equals(this.rawHostPort, customHostForCreateTaskInput.rawHostPort) &&
        Objects.equals(this.resolveList, customHostForCreateTaskInput.resolveList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawHostPort, resolveList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomHostForCreateTaskInput {\n");
    
    sb.append("    rawHostPort: ").append(toIndentedString(rawHostPort)).append("\n");
    sb.append("    resolveList: ").append(toIndentedString(resolveList)).append("\n");
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
