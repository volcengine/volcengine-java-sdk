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
import com.volcengine.vefaas.model.CredentialsForCreateFunctionInput;
import com.volcengine.vefaas.model.MountPointForCreateFunctionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TosMountConfigForCreateFunctionInput
 */



public class TosMountConfigForCreateFunctionInput {
  @SerializedName("Credentials")
  private CredentialsForCreateFunctionInput credentials = null;

  @SerializedName("EnableTos")
  private Boolean enableTos = null;

  @SerializedName("MountPoints")
  private List<MountPointForCreateFunctionInput> mountPoints = null;

  public TosMountConfigForCreateFunctionInput credentials(CredentialsForCreateFunctionInput credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Valid
  @Schema(description = "")
  public CredentialsForCreateFunctionInput getCredentials() {
    return credentials;
  }

  public void setCredentials(CredentialsForCreateFunctionInput credentials) {
    this.credentials = credentials;
  }

  public TosMountConfigForCreateFunctionInput enableTos(Boolean enableTos) {
    this.enableTos = enableTos;
    return this;
  }

   /**
   * Get enableTos
   * @return enableTos
  **/
  @Schema(description = "")
  public Boolean isEnableTos() {
    return enableTos;
  }

  public void setEnableTos(Boolean enableTos) {
    this.enableTos = enableTos;
  }

  public TosMountConfigForCreateFunctionInput mountPoints(List<MountPointForCreateFunctionInput> mountPoints) {
    this.mountPoints = mountPoints;
    return this;
  }

  public TosMountConfigForCreateFunctionInput addMountPointsItem(MountPointForCreateFunctionInput mountPointsItem) {
    if (this.mountPoints == null) {
      this.mountPoints = new ArrayList<MountPointForCreateFunctionInput>();
    }
    this.mountPoints.add(mountPointsItem);
    return this;
  }

   /**
   * Get mountPoints
   * @return mountPoints
  **/
  @Valid
  @Schema(description = "")
  public List<MountPointForCreateFunctionInput> getMountPoints() {
    return mountPoints;
  }

  public void setMountPoints(List<MountPointForCreateFunctionInput> mountPoints) {
    this.mountPoints = mountPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TosMountConfigForCreateFunctionInput tosMountConfigForCreateFunctionInput = (TosMountConfigForCreateFunctionInput) o;
    return Objects.equals(this.credentials, tosMountConfigForCreateFunctionInput.credentials) &&
        Objects.equals(this.enableTos, tosMountConfigForCreateFunctionInput.enableTos) &&
        Objects.equals(this.mountPoints, tosMountConfigForCreateFunctionInput.mountPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, enableTos, mountPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TosMountConfigForCreateFunctionInput {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    enableTos: ").append(toIndentedString(enableTos)).append("\n");
    sb.append("    mountPoints: ").append(toIndentedString(mountPoints)).append("\n");
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
