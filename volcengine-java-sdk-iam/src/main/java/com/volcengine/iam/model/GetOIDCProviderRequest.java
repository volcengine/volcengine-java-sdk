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
 * GetOIDCProviderRequest
 */



public class GetOIDCProviderRequest {
  @SerializedName("OIDCProviderName")
  private String oiDCProviderName = null;

  public GetOIDCProviderRequest oiDCProviderName(String oiDCProviderName) {
    this.oiDCProviderName = oiDCProviderName;
    return this;
  }

   /**
   * Get oiDCProviderName
   * @return oiDCProviderName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getOiDCProviderName() {
    return oiDCProviderName;
  }

  public void setOiDCProviderName(String oiDCProviderName) {
    this.oiDCProviderName = oiDCProviderName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOIDCProviderRequest getOIDCProviderRequest = (GetOIDCProviderRequest) o;
    return Objects.equals(this.oiDCProviderName, getOIDCProviderRequest.oiDCProviderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oiDCProviderName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOIDCProviderRequest {\n");
    
    sb.append("    oiDCProviderName: ").append(toIndentedString(oiDCProviderName)).append("\n");
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
