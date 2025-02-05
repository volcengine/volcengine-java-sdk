/*
 * bio
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.bio.model;

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
 * GetAPIAccessKeyResponse
 */



public class GetAPIAccessKeyResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccessKeyID")
  private String accessKeyID = null;

  public GetAPIAccessKeyResponse accessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
    return this;
  }

   /**
   * Get accessKeyID
   * @return accessKeyID
  **/
  @Schema(description = "")
  public String getAccessKeyID() {
    return accessKeyID;
  }

  public void setAccessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAPIAccessKeyResponse getAPIAccessKeyResponse = (GetAPIAccessKeyResponse) o;
    return Objects.equals(this.accessKeyID, getAPIAccessKeyResponse.accessKeyID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAPIAccessKeyResponse {\n");
    
    sb.append("    accessKeyID: ").append(toIndentedString(accessKeyID)).append("\n");
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
