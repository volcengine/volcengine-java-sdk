/*
 * edx
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.edx.model;

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
 * ListEDXAssociatedVGWTopologyRequest
 */



public class ListEDXAssociatedVGWTopologyRequest {
  @SerializedName("EDXInstanceId")
  private String edXInstanceId = null;

  public ListEDXAssociatedVGWTopologyRequest edXInstanceId(String edXInstanceId) {
    this.edXInstanceId = edXInstanceId;
    return this;
  }

   /**
   * Get edXInstanceId
   * @return edXInstanceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEdXInstanceId() {
    return edXInstanceId;
  }

  public void setEdXInstanceId(String edXInstanceId) {
    this.edXInstanceId = edXInstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEDXAssociatedVGWTopologyRequest listEDXAssociatedVGWTopologyRequest = (ListEDXAssociatedVGWTopologyRequest) o;
    return Objects.equals(this.edXInstanceId, listEDXAssociatedVGWTopologyRequest.edXInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edXInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEDXAssociatedVGWTopologyRequest {\n");
    
    sb.append("    edXInstanceId: ").append(toIndentedString(edXInstanceId)).append("\n");
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
