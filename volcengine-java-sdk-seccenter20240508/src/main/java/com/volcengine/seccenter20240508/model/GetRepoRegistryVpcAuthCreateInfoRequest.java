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
 * GetRepoRegistryVpcAuthCreateInfoRequest
 */



public class GetRepoRegistryVpcAuthCreateInfoRequest {
  @SerializedName("RegistryID")
  private String registryID = null;

  public GetRepoRegistryVpcAuthCreateInfoRequest registryID(String registryID) {
    this.registryID = registryID;
    return this;
  }

   /**
   * Get registryID
   * @return registryID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRegistryID() {
    return registryID;
  }

  public void setRegistryID(String registryID) {
    this.registryID = registryID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRepoRegistryVpcAuthCreateInfoRequest getRepoRegistryVpcAuthCreateInfoRequest = (GetRepoRegistryVpcAuthCreateInfoRequest) o;
    return Objects.equals(this.registryID, getRepoRegistryVpcAuthCreateInfoRequest.registryID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRepoRegistryVpcAuthCreateInfoRequest {\n");
    
    sb.append("    registryID: ").append(toIndentedString(registryID)).append("\n");
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
