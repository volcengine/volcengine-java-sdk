/*
 * kms
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kms.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kms.model.KeyForDescribeKeyOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeKeyResponse
 */



public class DescribeKeyResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Key")
  private KeyForDescribeKeyOutput key = null;

  public DescribeKeyResponse key(KeyForDescribeKeyOutput key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Valid
  @Schema(description = "")
  public KeyForDescribeKeyOutput getKey() {
    return key;
  }

  public void setKey(KeyForDescribeKeyOutput key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeKeyResponse describeKeyResponse = (DescribeKeyResponse) o;
    return Objects.equals(this.key, describeKeyResponse.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeKeyResponse {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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