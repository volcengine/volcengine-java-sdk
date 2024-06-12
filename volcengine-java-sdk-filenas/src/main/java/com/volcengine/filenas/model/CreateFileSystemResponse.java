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
 * CreateFileSystemResponse
 */



public class CreateFileSystemResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("OrderNo")
  private String orderNo = null;

  public CreateFileSystemResponse fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @Schema(description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }

  public CreateFileSystemResponse orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @Schema(description = "")
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileSystemResponse createFileSystemResponse = (CreateFileSystemResponse) o;
    return Objects.equals(this.fileSystemId, createFileSystemResponse.fileSystemId) &&
        Objects.equals(this.orderNo, createFileSystemResponse.orderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSystemId, orderNo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileSystemResponse {\n");
    
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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
