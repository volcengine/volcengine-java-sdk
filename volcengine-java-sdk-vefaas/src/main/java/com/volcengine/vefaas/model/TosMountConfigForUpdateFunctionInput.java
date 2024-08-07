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
import com.volcengine.vefaas.model.CredentialsForUpdateFunctionInput;
import com.volcengine.vefaas.model.MountPointForUpdateFunctionInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TosMountConfigForUpdateFunctionInput
 */



public class TosMountConfigForUpdateFunctionInput {
  @SerializedName("Credentials")
  private CredentialsForUpdateFunctionInput credentials = null;

  @SerializedName("EnableTos")
  private Boolean enableTos = null;

  @SerializedName("MountPoints")
  private List<MountPointForUpdateFunctionInput> mountPoints = null;

  public TosMountConfigForUpdateFunctionInput credentials(CredentialsForUpdateFunctionInput credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @Valid
  @Schema(description = "")
  public CredentialsForUpdateFunctionInput getCredentials() {
    return credentials;
  }

  public void setCredentials(CredentialsForUpdateFunctionInput credentials) {
    this.credentials = credentials;
  }

  public TosMountConfigForUpdateFunctionInput enableTos(Boolean enableTos) {
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

  public TosMountConfigForUpdateFunctionInput mountPoints(List<MountPointForUpdateFunctionInput> mountPoints) {
    this.mountPoints = mountPoints;
    return this;
  }

  public TosMountConfigForUpdateFunctionInput addMountPointsItem(MountPointForUpdateFunctionInput mountPointsItem) {
    if (this.mountPoints == null) {
      this.mountPoints = new ArrayList<MountPointForUpdateFunctionInput>();
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
  public List<MountPointForUpdateFunctionInput> getMountPoints() {
    return mountPoints;
  }

  public void setMountPoints(List<MountPointForUpdateFunctionInput> mountPoints) {
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
    TosMountConfigForUpdateFunctionInput tosMountConfigForUpdateFunctionInput = (TosMountConfigForUpdateFunctionInput) o;
    return Objects.equals(this.credentials, tosMountConfigForUpdateFunctionInput.credentials) &&
        Objects.equals(this.enableTos, tosMountConfigForUpdateFunctionInput.enableTos) &&
        Objects.equals(this.mountPoints, tosMountConfigForUpdateFunctionInput.mountPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, enableTos, mountPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TosMountConfigForUpdateFunctionInput {\n");
    
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
