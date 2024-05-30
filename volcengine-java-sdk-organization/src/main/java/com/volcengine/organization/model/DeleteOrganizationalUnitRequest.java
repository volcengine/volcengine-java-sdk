/*
 * organization
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.organization.model;

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
 * DeleteOrganizationalUnitRequest
 */


public class DeleteOrganizationalUnitRequest {
  @SerializedName("OrgUnitId")
  private String orgUnitId = null;

  public DeleteOrganizationalUnitRequest orgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

   /**
   * Get orgUnitId
   * @return orgUnitId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getOrgUnitId() {
    return orgUnitId;
  }

  public void setOrgUnitId(String orgUnitId) {
    this.orgUnitId = orgUnitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteOrganizationalUnitRequest deleteOrganizationalUnitRequest = (DeleteOrganizationalUnitRequest) o;
    return Objects.equals(this.orgUnitId, deleteOrganizationalUnitRequest.orgUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgUnitId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOrganizationalUnitRequest {\n");
    
    sb.append("    orgUnitId: ").append(toIndentedString(orgUnitId)).append("\n");
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