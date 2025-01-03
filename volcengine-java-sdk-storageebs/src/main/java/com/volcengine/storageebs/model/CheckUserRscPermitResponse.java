/*
 * storage_ebs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.storageebs.model;

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
 * CheckUserRscPermitResponse
 */



public class CheckUserRscPermitResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("Permit")
  private Boolean permit = null;

  public CheckUserRscPermitResponse permit(Boolean permit) {
    this.permit = permit;
    return this;
  }

   /**
   * Get permit
   * @return permit
  **/
  @Schema(description = "")
  public Boolean isPermit() {
    return permit;
  }

  public void setPermit(Boolean permit) {
    this.permit = permit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckUserRscPermitResponse checkUserRscPermitResponse = (CheckUserRscPermitResponse) o;
    return Objects.equals(this.permit, checkUserRscPermitResponse.permit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckUserRscPermitResponse {\n");
    
    sb.append("    permit: ").append(toIndentedString(permit)).append("\n");
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
