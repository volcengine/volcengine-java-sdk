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
import com.volcengine.vke.model.VpcCniConfigForUpdateClusterConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PodsConfigForUpdateClusterConfigInput
 */



public class PodsConfigForUpdateClusterConfigInput {
  @SerializedName("VpcCniConfig")
  private VpcCniConfigForUpdateClusterConfigInput vpcCniConfig = null;

  public PodsConfigForUpdateClusterConfigInput vpcCniConfig(VpcCniConfigForUpdateClusterConfigInput vpcCniConfig) {
    this.vpcCniConfig = vpcCniConfig;
    return this;
  }

   /**
   * Get vpcCniConfig
   * @return vpcCniConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcCniConfigForUpdateClusterConfigInput getVpcCniConfig() {
    return vpcCniConfig;
  }

  public void setVpcCniConfig(VpcCniConfigForUpdateClusterConfigInput vpcCniConfig) {
    this.vpcCniConfig = vpcCniConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodsConfigForUpdateClusterConfigInput podsConfigForUpdateClusterConfigInput = (PodsConfigForUpdateClusterConfigInput) o;
    return Objects.equals(this.vpcCniConfig, podsConfigForUpdateClusterConfigInput.vpcCniConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcCniConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodsConfigForUpdateClusterConfigInput {\n");
    
    sb.append("    vpcCniConfig: ").append(toIndentedString(vpcCniConfig)).append("\n");
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
