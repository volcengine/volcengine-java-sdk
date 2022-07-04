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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FlannelConfigForListClustersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:56.909838+08:00[Asia/Shanghai]")
public class FlannelConfigForListClustersOutput {
  @SerializedName("MaxPodsPerNode")
  private Integer maxPodsPerNode = null;

  @SerializedName("PodCidrs")
  private List<String> podCidrs = null;

  public FlannelConfigForListClustersOutput maxPodsPerNode(Integer maxPodsPerNode) {
    this.maxPodsPerNode = maxPodsPerNode;
    return this;
  }

   /**
   * Get maxPodsPerNode
   * @return maxPodsPerNode
  **/
  @Schema(description = "")
  public Integer getMaxPodsPerNode() {
    return maxPodsPerNode;
  }

  public void setMaxPodsPerNode(Integer maxPodsPerNode) {
    this.maxPodsPerNode = maxPodsPerNode;
  }

  public FlannelConfigForListClustersOutput podCidrs(List<String> podCidrs) {
    this.podCidrs = podCidrs;
    return this;
  }

  public FlannelConfigForListClustersOutput addPodCidrsItem(String podCidrsItem) {
    if (this.podCidrs == null) {
      this.podCidrs = new ArrayList<String>();
    }
    this.podCidrs.add(podCidrsItem);
    return this;
  }

   /**
   * Get podCidrs
   * @return podCidrs
  **/
  @Schema(description = "")
  public List<String> getPodCidrs() {
    return podCidrs;
  }

  public void setPodCidrs(List<String> podCidrs) {
    this.podCidrs = podCidrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlannelConfigForListClustersOutput flannelConfigForListClustersOutput = (FlannelConfigForListClustersOutput) o;
    return Objects.equals(this.maxPodsPerNode, flannelConfigForListClustersOutput.maxPodsPerNode) &&
        Objects.equals(this.podCidrs, flannelConfigForListClustersOutput.podCidrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPodsPerNode, podCidrs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlannelConfigForListClustersOutput {\n");
    
    sb.append("    maxPodsPerNode: ").append(toIndentedString(maxPodsPerNode)).append("\n");
    sb.append("    podCidrs: ").append(toIndentedString(podCidrs)).append("\n");
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
