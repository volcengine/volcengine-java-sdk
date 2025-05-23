/*
 * ml_platform20240701
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.mlplatform20240701.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.mlplatform20240701.model.UpstreamConfigForUpdateServiceInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ApigConfigForUpdateServiceInput
 */



public class ApigConfigForUpdateServiceInput {
  @SerializedName("InstanceID")
  private String instanceID = null;

  @SerializedName("UpstreamConfig")
  private UpstreamConfigForUpdateServiceInput upstreamConfig = null;

  public ApigConfigForUpdateServiceInput instanceID(String instanceID) {
    this.instanceID = instanceID;
    return this;
  }

   /**
   * Get instanceID
   * @return instanceID
  **/
  @Schema(description = "")
  public String getInstanceID() {
    return instanceID;
  }

  public void setInstanceID(String instanceID) {
    this.instanceID = instanceID;
  }

  public ApigConfigForUpdateServiceInput upstreamConfig(UpstreamConfigForUpdateServiceInput upstreamConfig) {
    this.upstreamConfig = upstreamConfig;
    return this;
  }

   /**
   * Get upstreamConfig
   * @return upstreamConfig
  **/
  @Valid
  @Schema(description = "")
  public UpstreamConfigForUpdateServiceInput getUpstreamConfig() {
    return upstreamConfig;
  }

  public void setUpstreamConfig(UpstreamConfigForUpdateServiceInput upstreamConfig) {
    this.upstreamConfig = upstreamConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApigConfigForUpdateServiceInput apigConfigForUpdateServiceInput = (ApigConfigForUpdateServiceInput) o;
    return Objects.equals(this.instanceID, apigConfigForUpdateServiceInput.instanceID) &&
        Objects.equals(this.upstreamConfig, apigConfigForUpdateServiceInput.upstreamConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceID, upstreamConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApigConfigForUpdateServiceInput {\n");
    
    sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
    sb.append("    upstreamConfig: ").append(toIndentedString(upstreamConfig)).append("\n");
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
