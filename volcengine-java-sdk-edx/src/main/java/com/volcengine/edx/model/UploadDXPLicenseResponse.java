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
 * UploadDXPLicenseResponse
 */



public class UploadDXPLicenseResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("LicenseURL")
  private String licenseURL = null;

  public UploadDXPLicenseResponse licenseURL(String licenseURL) {
    this.licenseURL = licenseURL;
    return this;
  }

   /**
   * Get licenseURL
   * @return licenseURL
  **/
  @Schema(description = "")
  public String getLicenseURL() {
    return licenseURL;
  }

  public void setLicenseURL(String licenseURL) {
    this.licenseURL = licenseURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadDXPLicenseResponse uploadDXPLicenseResponse = (UploadDXPLicenseResponse) o;
    return Objects.equals(this.licenseURL, uploadDXPLicenseResponse.licenseURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadDXPLicenseResponse {\n");
    
    sb.append("    licenseURL: ").append(toIndentedString(licenseURL)).append("\n");
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
