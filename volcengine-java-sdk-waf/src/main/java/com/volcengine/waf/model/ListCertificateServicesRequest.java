/*
 * waf
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.waf.model;

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
 * ListCertificateServicesRequest
 */



public class ListCertificateServicesRequest {
  @SerializedName("ClbCertificateId")
  private String clbCertificateId = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  public ListCertificateServicesRequest clbCertificateId(String clbCertificateId) {
    this.clbCertificateId = clbCertificateId;
    return this;
  }

   /**
   * Get clbCertificateId
   * @return clbCertificateId
  **/
  @Schema(description = "")
  public String getClbCertificateId() {
    return clbCertificateId;
  }

  public void setClbCertificateId(String clbCertificateId) {
    this.clbCertificateId = clbCertificateId;
  }

  public ListCertificateServicesRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ListCertificateServicesRequest projectName(String projectName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCertificateServicesRequest listCertificateServicesRequest = (ListCertificateServicesRequest) o;
    return Objects.equals(this.clbCertificateId, listCertificateServicesRequest.clbCertificateId) &&
        Objects.equals(this.id, listCertificateServicesRequest.id) &&
        Objects.equals(this.projectName, listCertificateServicesRequest.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clbCertificateId, id, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCertificateServicesRequest {\n");
    
    sb.append("    clbCertificateId: ").append(toIndentedString(clbCertificateId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
