/*
 * vefaas
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vefaas.model;

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
 * OrderByForListReleaseRecordsInput
 */



public class OrderByForListReleaseRecordsInput {
  @SerializedName("Ascend")
  private Boolean ascend = null;

  @SerializedName("Key")
  private String key = null;

  public OrderByForListReleaseRecordsInput ascend(Boolean ascend) {
    this.ascend = ascend;
    return this;
  }

   /**
   * Get ascend
   * @return ascend
  **/
  @Schema(description = "")
  public Boolean isAscend() {
    return ascend;
  }

  public void setAscend(Boolean ascend) {
    this.ascend = ascend;
  }

  public OrderByForListReleaseRecordsInput key(String key) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderByForListReleaseRecordsInput orderByForListReleaseRecordsInput = (OrderByForListReleaseRecordsInput) o;
    return Objects.equals(this.ascend, orderByForListReleaseRecordsInput.ascend) &&
        Objects.equals(this.key, orderByForListReleaseRecordsInput.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ascend, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderByForListReleaseRecordsInput {\n");
    
    sb.append("    ascend: ").append(toIndentedString(ascend)).append("\n");
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
