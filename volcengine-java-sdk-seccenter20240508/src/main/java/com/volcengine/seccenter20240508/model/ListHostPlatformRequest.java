/*
 * seccenter20240508
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.seccenter20240508.model;

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
 * ListHostPlatformRequest
 */



public class ListHostPlatformRequest {
  @SerializedName("TopGroupID")
  private String topGroupID = null;

  public ListHostPlatformRequest topGroupID(String topGroupID) {
    this.topGroupID = topGroupID;
    return this;
  }

   /**
   * Get topGroupID
   * @return topGroupID
  **/
  @Schema(description = "")
  public String getTopGroupID() {
    return topGroupID;
  }

  public void setTopGroupID(String topGroupID) {
    this.topGroupID = topGroupID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListHostPlatformRequest listHostPlatformRequest = (ListHostPlatformRequest) o;
    return Objects.equals(this.topGroupID, listHostPlatformRequest.topGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topGroupID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListHostPlatformRequest {\n");
    
    sb.append("    topGroupID: ").append(toIndentedString(topGroupID)).append("\n");
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
