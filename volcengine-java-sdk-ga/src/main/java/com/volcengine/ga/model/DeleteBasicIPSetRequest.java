/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

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
 * DeleteBasicIPSetRequest
 */



public class DeleteBasicIPSetRequest {
  @SerializedName("acceleratorId")
  private String acceleratorId = null;

  @SerializedName("ipsetId")
  private String ipsetId = null;

  public DeleteBasicIPSetRequest acceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
    return this;
  }

   /**
   * Get acceleratorId
   * @return acceleratorId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAcceleratorId() {
    return acceleratorId;
  }

  public void setAcceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
  }

  public DeleteBasicIPSetRequest ipsetId(String ipsetId) {
    this.ipsetId = ipsetId;
    return this;
  }

   /**
   * Get ipsetId
   * @return ipsetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpsetId() {
    return ipsetId;
  }

  public void setIpsetId(String ipsetId) {
    this.ipsetId = ipsetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteBasicIPSetRequest deleteBasicIPSetRequest = (DeleteBasicIPSetRequest) o;
    return Objects.equals(this.acceleratorId, deleteBasicIPSetRequest.acceleratorId) &&
        Objects.equals(this.ipsetId, deleteBasicIPSetRequest.ipsetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceleratorId, ipsetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBasicIPSetRequest {\n");
    
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    ipsetId: ").append(toIndentedString(ipsetId)).append("\n");
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
