/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.ResponseHeaderInstanceForUpdateCdnConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ResponseHeaderActionForUpdateCdnConfigInput
 */



public class ResponseHeaderActionForUpdateCdnConfigInput {
  @SerializedName("ResponseHeaderInstances")
  private List<ResponseHeaderInstanceForUpdateCdnConfigInput> responseHeaderInstances = null;

  public ResponseHeaderActionForUpdateCdnConfigInput responseHeaderInstances(List<ResponseHeaderInstanceForUpdateCdnConfigInput> responseHeaderInstances) {
    this.responseHeaderInstances = responseHeaderInstances;
    return this;
  }

  public ResponseHeaderActionForUpdateCdnConfigInput addResponseHeaderInstancesItem(ResponseHeaderInstanceForUpdateCdnConfigInput responseHeaderInstancesItem) {
    if (this.responseHeaderInstances == null) {
      this.responseHeaderInstances = new ArrayList<ResponseHeaderInstanceForUpdateCdnConfigInput>();
    }
    this.responseHeaderInstances.add(responseHeaderInstancesItem);
    return this;
  }

   /**
   * Get responseHeaderInstances
   * @return responseHeaderInstances
  **/
  @Valid
  @Schema(description = "")
  public List<ResponseHeaderInstanceForUpdateCdnConfigInput> getResponseHeaderInstances() {
    return responseHeaderInstances;
  }

  public void setResponseHeaderInstances(List<ResponseHeaderInstanceForUpdateCdnConfigInput> responseHeaderInstances) {
    this.responseHeaderInstances = responseHeaderInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeaderActionForUpdateCdnConfigInput responseHeaderActionForUpdateCdnConfigInput = (ResponseHeaderActionForUpdateCdnConfigInput) o;
    return Objects.equals(this.responseHeaderInstances, responseHeaderActionForUpdateCdnConfigInput.responseHeaderInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeaderInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeaderActionForUpdateCdnConfigInput {\n");
    
    sb.append("    responseHeaderInstances: ").append(toIndentedString(responseHeaderInstances)).append("\n");
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
