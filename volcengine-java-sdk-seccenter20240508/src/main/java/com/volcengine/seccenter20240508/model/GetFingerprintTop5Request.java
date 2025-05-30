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
 * GetFingerprintTop5Request
 */



public class GetFingerprintTop5Request {
  @SerializedName("FingerprintType")
  private String fingerprintType = null;

  public GetFingerprintTop5Request fingerprintType(String fingerprintType) {
    this.fingerprintType = fingerprintType;
    return this;
  }

   /**
   * Get fingerprintType
   * @return fingerprintType
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getFingerprintType() {
    return fingerprintType;
  }

  public void setFingerprintType(String fingerprintType) {
    this.fingerprintType = fingerprintType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFingerprintTop5Request getFingerprintTop5Request = (GetFingerprintTop5Request) o;
    return Objects.equals(this.fingerprintType, getFingerprintTop5Request.fingerprintType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprintType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFingerprintTop5Request {\n");
    
    sb.append("    fingerprintType: ").append(toIndentedString(fingerprintType)).append("\n");
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
