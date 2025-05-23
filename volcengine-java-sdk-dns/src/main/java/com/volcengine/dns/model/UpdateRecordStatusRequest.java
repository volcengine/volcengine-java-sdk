/*
 * dns
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.dns.model;

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
 * UpdateRecordStatusRequest
 */



public class UpdateRecordStatusRequest {
  @SerializedName("Enable")
  private Boolean enable = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("RecordID")
  private String recordID = null;

  public UpdateRecordStatusRequest enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public UpdateRecordStatusRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public UpdateRecordStatusRequest recordID(String recordID) {
    this.recordID = recordID;
    return this;
  }

   /**
   * Get recordID
   * @return recordID
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRecordID() {
    return recordID;
  }

  public void setRecordID(String recordID) {
    this.recordID = recordID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRecordStatusRequest updateRecordStatusRequest = (UpdateRecordStatusRequest) o;
    return Objects.equals(this.enable, updateRecordStatusRequest.enable) &&
        Objects.equals(this.projectName, updateRecordStatusRequest.projectName) &&
        Objects.equals(this.recordID, updateRecordStatusRequest.recordID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, projectName, recordID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRecordStatusRequest {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    recordID: ").append(toIndentedString(recordID)).append("\n");
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
