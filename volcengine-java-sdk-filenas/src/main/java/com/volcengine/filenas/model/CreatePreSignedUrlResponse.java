/*
 * filenas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

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
 * CreatePreSignedUrlResponse
 */



public class CreatePreSignedUrlResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Expires")
  private Integer expires = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Url")
  private String url = null;

  public CreatePreSignedUrlResponse expires(Integer expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @Schema(description = "")
  public Integer getExpires() {
    return expires;
  }

  public void setExpires(Integer expires) {
    this.expires = expires;
  }

  public CreatePreSignedUrlResponse key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CreatePreSignedUrlResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePreSignedUrlResponse createPreSignedUrlResponse = (CreatePreSignedUrlResponse) o;
    return Objects.equals(this.expires, createPreSignedUrlResponse.expires) &&
        Objects.equals(this.key, createPreSignedUrlResponse.key) &&
        Objects.equals(this.url, createPreSignedUrlResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires, key, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePreSignedUrlResponse {\n");
    
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
