/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

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
 * LoginForListNodePoolsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-15T17:50:31.831766+08:00[Asia/Shanghai]")
public class LoginForListNodePoolsOutput {
  @SerializedName("SshKeyPairName")
  private String sshKeyPairName = null;

  @SerializedName("Type")
  private String type = null;

  public LoginForListNodePoolsOutput sshKeyPairName(String sshKeyPairName) {
    this.sshKeyPairName = sshKeyPairName;
    return this;
  }

   /**
   * Get sshKeyPairName
   * @return sshKeyPairName
  **/
  @Schema(description = "")
  public String getSshKeyPairName() {
    return sshKeyPairName;
  }

  public void setSshKeyPairName(String sshKeyPairName) {
    this.sshKeyPairName = sshKeyPairName;
  }

  public LoginForListNodePoolsOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginForListNodePoolsOutput loginForListNodePoolsOutput = (LoginForListNodePoolsOutput) o;
    return Objects.equals(this.sshKeyPairName, loginForListNodePoolsOutput.sshKeyPairName) &&
        Objects.equals(this.type, loginForListNodePoolsOutput.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sshKeyPairName, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginForListNodePoolsOutput {\n");
    
    sb.append("    sshKeyPairName: ").append(toIndentedString(sshKeyPairName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
