/*
 * iam
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.iam.model;

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
 * CreateRoleRequest
 */


public class CreateRoleRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("RoleName")
  private String roleName = null;

  @SerializedName("TrustPolicyDocument")
  private String trustPolicyDocument = null;

  public CreateRoleRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateRoleRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CreateRoleRequest roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public CreateRoleRequest trustPolicyDocument(String trustPolicyDocument) {
    this.trustPolicyDocument = trustPolicyDocument;
    return this;
  }

   /**
   * Get trustPolicyDocument
   * @return trustPolicyDocument
  **/
  @Schema(description = "")
  public String getTrustPolicyDocument() {
    return trustPolicyDocument;
  }

  public void setTrustPolicyDocument(String trustPolicyDocument) {
    this.trustPolicyDocument = trustPolicyDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoleRequest createRoleRequest = (CreateRoleRequest) o;
    return Objects.equals(this.description, createRoleRequest.description) &&
        Objects.equals(this.displayName, createRoleRequest.displayName) &&
        Objects.equals(this.roleName, createRoleRequest.roleName) &&
        Objects.equals(this.trustPolicyDocument, createRoleRequest.trustPolicyDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, roleName, trustPolicyDocument);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoleRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    trustPolicyDocument: ").append(toIndentedString(trustPolicyDocument)).append("\n");
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
