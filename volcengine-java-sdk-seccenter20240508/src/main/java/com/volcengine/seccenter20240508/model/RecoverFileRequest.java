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
 * RecoverFileRequest
 */



public class RecoverFileRequest {
  @SerializedName("FileboxID")
  private String fileboxID = null;

  public RecoverFileRequest fileboxID(String fileboxID) {
    this.fileboxID = fileboxID;
    return this;
  }

   /**
   * Get fileboxID
   * @return fileboxID
  **/
  @Schema(description = "")
  public String getFileboxID() {
    return fileboxID;
  }

  public void setFileboxID(String fileboxID) {
    this.fileboxID = fileboxID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoverFileRequest recoverFileRequest = (RecoverFileRequest) o;
    return Objects.equals(this.fileboxID, recoverFileRequest.fileboxID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileboxID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoverFileRequest {\n");
    
    sb.append("    fileboxID: ").append(toIndentedString(fileboxID)).append("\n");
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
