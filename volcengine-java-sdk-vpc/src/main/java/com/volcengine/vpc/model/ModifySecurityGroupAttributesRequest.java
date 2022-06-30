/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * ModifySecurityGroupAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:48.516414+08:00[Asia/Shanghai]")
public class ModifySecurityGroupAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("SecurityGroupId")
  private String securityGroupId = null;

  @SerializedName("SecurityGroupName")
  private String securityGroupName = null;

  public ModifySecurityGroupAttributesRequest description(String description) {
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

  public ModifySecurityGroupAttributesRequest securityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSecurityGroupId() {
    return securityGroupId;
  }

  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }

  public ModifySecurityGroupAttributesRequest securityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * Get securityGroupName
   * @return securityGroupName
  **/
  @Schema(description = "")
  public String getSecurityGroupName() {
    return securityGroupName;
  }

  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifySecurityGroupAttributesRequest modifySecurityGroupAttributesRequest = (ModifySecurityGroupAttributesRequest) o;
    return Objects.equals(this.description, modifySecurityGroupAttributesRequest.description) &&
        Objects.equals(this.securityGroupId, modifySecurityGroupAttributesRequest.securityGroupId) &&
        Objects.equals(this.securityGroupName, modifySecurityGroupAttributesRequest.securityGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, securityGroupId, securityGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifySecurityGroupAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
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