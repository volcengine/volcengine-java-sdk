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
import com.volcengine.vke.model.KubernetesConfigForCreateDefaultNodePoolInput;
import com.volcengine.vke.model.NodeConfigForCreateDefaultNodePoolInput;
import com.volcengine.vke.model.TagForCreateDefaultNodePoolInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateDefaultNodePoolRequest
 */



public class CreateDefaultNodePoolRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("KubernetesConfig")
  private KubernetesConfigForCreateDefaultNodePoolInput kubernetesConfig = null;

  @SerializedName("NodeConfig")
  private NodeConfigForCreateDefaultNodePoolInput nodeConfig = null;

  @SerializedName("Tags")
  private List<TagForCreateDefaultNodePoolInput> tags = null;

  public CreateDefaultNodePoolRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateDefaultNodePoolRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public CreateDefaultNodePoolRequest kubernetesConfig(KubernetesConfigForCreateDefaultNodePoolInput kubernetesConfig) {
    this.kubernetesConfig = kubernetesConfig;
    return this;
  }

   /**
   * Get kubernetesConfig
   * @return kubernetesConfig
  **/
  @Valid
  @Schema(description = "")
  public KubernetesConfigForCreateDefaultNodePoolInput getKubernetesConfig() {
    return kubernetesConfig;
  }

  public void setKubernetesConfig(KubernetesConfigForCreateDefaultNodePoolInput kubernetesConfig) {
    this.kubernetesConfig = kubernetesConfig;
  }

  public CreateDefaultNodePoolRequest nodeConfig(NodeConfigForCreateDefaultNodePoolInput nodeConfig) {
    this.nodeConfig = nodeConfig;
    return this;
  }

   /**
   * Get nodeConfig
   * @return nodeConfig
  **/
  @Valid
  @Schema(description = "")
  public NodeConfigForCreateDefaultNodePoolInput getNodeConfig() {
    return nodeConfig;
  }

  public void setNodeConfig(NodeConfigForCreateDefaultNodePoolInput nodeConfig) {
    this.nodeConfig = nodeConfig;
  }

  public CreateDefaultNodePoolRequest tags(List<TagForCreateDefaultNodePoolInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateDefaultNodePoolRequest addTagsItem(TagForCreateDefaultNodePoolInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateDefaultNodePoolInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateDefaultNodePoolInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateDefaultNodePoolInput> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDefaultNodePoolRequest createDefaultNodePoolRequest = (CreateDefaultNodePoolRequest) o;
    return Objects.equals(this.clientToken, createDefaultNodePoolRequest.clientToken) &&
        Objects.equals(this.clusterId, createDefaultNodePoolRequest.clusterId) &&
        Objects.equals(this.kubernetesConfig, createDefaultNodePoolRequest.kubernetesConfig) &&
        Objects.equals(this.nodeConfig, createDefaultNodePoolRequest.nodeConfig) &&
        Objects.equals(this.tags, createDefaultNodePoolRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, clusterId, kubernetesConfig, nodeConfig, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDefaultNodePoolRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    kubernetesConfig: ").append(toIndentedString(kubernetesConfig)).append("\n");
    sb.append("    nodeConfig: ").append(toIndentedString(nodeConfig)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
