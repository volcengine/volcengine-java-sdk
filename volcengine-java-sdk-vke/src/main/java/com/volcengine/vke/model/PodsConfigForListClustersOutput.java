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
import com.volcengine.vke.model.FlannelConfigForListClustersOutput;
import com.volcengine.vke.model.VpcCniConfigForListClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PodsConfigForListClustersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:56.909838+08:00[Asia/Shanghai]")
public class PodsConfigForListClustersOutput {
  @SerializedName("FlannelConfig")
  private FlannelConfigForListClustersOutput flannelConfig = null;

  @SerializedName("PodNetworkMode")
  private String podNetworkMode = null;

  @SerializedName("VpcCniConfig")
  private VpcCniConfigForListClustersOutput vpcCniConfig = null;

  public PodsConfigForListClustersOutput flannelConfig(FlannelConfigForListClustersOutput flannelConfig) {
    this.flannelConfig = flannelConfig;
    return this;
  }

   /**
   * Get flannelConfig
   * @return flannelConfig
  **/
  @Valid
  @Schema(description = "")
  public FlannelConfigForListClustersOutput getFlannelConfig() {
    return flannelConfig;
  }

  public void setFlannelConfig(FlannelConfigForListClustersOutput flannelConfig) {
    this.flannelConfig = flannelConfig;
  }

  public PodsConfigForListClustersOutput podNetworkMode(String podNetworkMode) {
    this.podNetworkMode = podNetworkMode;
    return this;
  }

   /**
   * Get podNetworkMode
   * @return podNetworkMode
  **/
  @Schema(description = "")
  public String getPodNetworkMode() {
    return podNetworkMode;
  }

  public void setPodNetworkMode(String podNetworkMode) {
    this.podNetworkMode = podNetworkMode;
  }

  public PodsConfigForListClustersOutput vpcCniConfig(VpcCniConfigForListClustersOutput vpcCniConfig) {
    this.vpcCniConfig = vpcCniConfig;
    return this;
  }

   /**
   * Get vpcCniConfig
   * @return vpcCniConfig
  **/
  @Valid
  @Schema(description = "")
  public VpcCniConfigForListClustersOutput getVpcCniConfig() {
    return vpcCniConfig;
  }

  public void setVpcCniConfig(VpcCniConfigForListClustersOutput vpcCniConfig) {
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
    PodsConfigForListClustersOutput podsConfigForListClustersOutput = (PodsConfigForListClustersOutput) o;
    return Objects.equals(this.flannelConfig, podsConfigForListClustersOutput.flannelConfig) &&
        Objects.equals(this.podNetworkMode, podsConfigForListClustersOutput.podNetworkMode) &&
        Objects.equals(this.vpcCniConfig, podsConfigForListClustersOutput.vpcCniConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flannelConfig, podNetworkMode, vpcCniConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodsConfigForListClustersOutput {\n");
    
    sb.append("    flannelConfig: ").append(toIndentedString(flannelConfig)).append("\n");
    sb.append("    podNetworkMode: ").append(toIndentedString(podNetworkMode)).append("\n");
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
