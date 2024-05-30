/*
 * cdn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.cdn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.cdn.model.TargetQueryComponentsForAddCdnDomainInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RedirectionActionForAddCdnDomainInput
 */



public class RedirectionActionForAddCdnDomainInput {
  @SerializedName("RedirectCode")
  private String redirectCode = null;

  @SerializedName("SourcePath")
  private String sourcePath = null;

  @SerializedName("TargetHost")
  private String targetHost = null;

  @SerializedName("TargetPath")
  private String targetPath = null;

  @SerializedName("TargetProtocol")
  private String targetProtocol = null;

  @SerializedName("TargetQueryComponents")
  private TargetQueryComponentsForAddCdnDomainInput targetQueryComponents = null;

  public RedirectionActionForAddCdnDomainInput redirectCode(String redirectCode) {
    this.redirectCode = redirectCode;
    return this;
  }

   /**
   * Get redirectCode
   * @return redirectCode
  **/
  @Schema(description = "")
  public String getRedirectCode() {
    return redirectCode;
  }

  public void setRedirectCode(String redirectCode) {
    this.redirectCode = redirectCode;
  }

  public RedirectionActionForAddCdnDomainInput sourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
    return this;
  }

   /**
   * Get sourcePath
   * @return sourcePath
  **/
  @Schema(description = "")
  public String getSourcePath() {
    return sourcePath;
  }

  public void setSourcePath(String sourcePath) {
    this.sourcePath = sourcePath;
  }

  public RedirectionActionForAddCdnDomainInput targetHost(String targetHost) {
    this.targetHost = targetHost;
    return this;
  }

   /**
   * Get targetHost
   * @return targetHost
  **/
  @Schema(description = "")
  public String getTargetHost() {
    return targetHost;
  }

  public void setTargetHost(String targetHost) {
    this.targetHost = targetHost;
  }

  public RedirectionActionForAddCdnDomainInput targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

   /**
   * Get targetPath
   * @return targetPath
  **/
  @Schema(description = "")
  public String getTargetPath() {
    return targetPath;
  }

  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }

  public RedirectionActionForAddCdnDomainInput targetProtocol(String targetProtocol) {
    this.targetProtocol = targetProtocol;
    return this;
  }

   /**
   * Get targetProtocol
   * @return targetProtocol
  **/
  @Schema(description = "")
  public String getTargetProtocol() {
    return targetProtocol;
  }

  public void setTargetProtocol(String targetProtocol) {
    this.targetProtocol = targetProtocol;
  }

  public RedirectionActionForAddCdnDomainInput targetQueryComponents(TargetQueryComponentsForAddCdnDomainInput targetQueryComponents) {
    this.targetQueryComponents = targetQueryComponents;
    return this;
  }

   /**
   * Get targetQueryComponents
   * @return targetQueryComponents
  **/
  @Valid
  @Schema(description = "")
  public TargetQueryComponentsForAddCdnDomainInput getTargetQueryComponents() {
    return targetQueryComponents;
  }

  public void setTargetQueryComponents(TargetQueryComponentsForAddCdnDomainInput targetQueryComponents) {
    this.targetQueryComponents = targetQueryComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectionActionForAddCdnDomainInput redirectionActionForAddCdnDomainInput = (RedirectionActionForAddCdnDomainInput) o;
    return Objects.equals(this.redirectCode, redirectionActionForAddCdnDomainInput.redirectCode) &&
        Objects.equals(this.sourcePath, redirectionActionForAddCdnDomainInput.sourcePath) &&
        Objects.equals(this.targetHost, redirectionActionForAddCdnDomainInput.targetHost) &&
        Objects.equals(this.targetPath, redirectionActionForAddCdnDomainInput.targetPath) &&
        Objects.equals(this.targetProtocol, redirectionActionForAddCdnDomainInput.targetProtocol) &&
        Objects.equals(this.targetQueryComponents, redirectionActionForAddCdnDomainInput.targetQueryComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectCode, sourcePath, targetHost, targetPath, targetProtocol, targetQueryComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectionActionForAddCdnDomainInput {\n");
    
    sb.append("    redirectCode: ").append(toIndentedString(redirectCode)).append("\n");
    sb.append("    sourcePath: ").append(toIndentedString(sourcePath)).append("\n");
    sb.append("    targetHost: ").append(toIndentedString(targetHost)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    targetProtocol: ").append(toIndentedString(targetProtocol)).append("\n");
    sb.append("    targetQueryComponents: ").append(toIndentedString(targetQueryComponents)).append("\n");
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
