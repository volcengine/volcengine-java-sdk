/*
 * emr
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.emr.model;

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
 * ListNodesRequest
 */



public class ListNodesRequest {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Fqdns")
  private List<String> fqdns = null;

  @SerializedName("MaxResults")
  private Integer maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("NodeGroupIds")
  private List<String> nodeGroupIds = null;

  @SerializedName("NodeIds")
  private List<String> nodeIds = null;

  @SerializedName("NodeNames")
  private List<String> nodeNames = null;

  /**
   * Gets or Sets nodeStates
   */
  @JsonAdapter(NodeStatesEnum.Adapter.class)
  public enum NodeStatesEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    @SerializedName("CREATING")
    CREATING("CREATING"),
    @SerializedName("RUNNING")
    RUNNING("RUNNING"),
    @SerializedName("STOPPING")
    STOPPING("STOPPING"),
    @SerializedName("STOPPED")
    STOPPED("STOPPED"),
    @SerializedName("REBOOTING")
    REBOOTING("REBOOTING"),
    @SerializedName("REBUILDING")
    REBUILDING("REBUILDING"),
    @SerializedName("DELETED")
    DELETED("DELETED");

    private String value;

    NodeStatesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NodeStatesEnum fromValue(String input) {
      for (NodeStatesEnum b : NodeStatesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NodeStatesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeStatesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NodeStatesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NodeStatesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("NodeStates")
  private List<NodeStatesEnum> nodeStates = null;

  @SerializedName("PrivateIps")
  private List<String> privateIps = null;

  @SerializedName("PublicIps")
  private List<String> publicIps = null;

  public ListNodesRequest clusterId(String clusterId) {
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

  public ListNodesRequest fqdns(List<String> fqdns) {
    this.fqdns = fqdns;
    return this;
  }

  public ListNodesRequest addFqdnsItem(String fqdnsItem) {
    if (this.fqdns == null) {
      this.fqdns = new ArrayList<String>();
    }
    this.fqdns.add(fqdnsItem);
    return this;
  }

   /**
   * Get fqdns
   * @return fqdns
  **/
  @Schema(description = "")
  public List<String> getFqdns() {
    return fqdns;
  }

  public void setFqdns(List<String> fqdns) {
    this.fqdns = fqdns;
  }

  public ListNodesRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * minimum: 1
   * maximum: 100
   * @return maxResults
  **/
 @Min(1) @Max(100)  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public ListNodesRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ListNodesRequest nodeGroupIds(List<String> nodeGroupIds) {
    this.nodeGroupIds = nodeGroupIds;
    return this;
  }

  public ListNodesRequest addNodeGroupIdsItem(String nodeGroupIdsItem) {
    if (this.nodeGroupIds == null) {
      this.nodeGroupIds = new ArrayList<String>();
    }
    this.nodeGroupIds.add(nodeGroupIdsItem);
    return this;
  }

   /**
   * Get nodeGroupIds
   * @return nodeGroupIds
  **/
  @Schema(description = "")
  public List<String> getNodeGroupIds() {
    return nodeGroupIds;
  }

  public void setNodeGroupIds(List<String> nodeGroupIds) {
    this.nodeGroupIds = nodeGroupIds;
  }

  public ListNodesRequest nodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
    return this;
  }

  public ListNodesRequest addNodeIdsItem(String nodeIdsItem) {
    if (this.nodeIds == null) {
      this.nodeIds = new ArrayList<String>();
    }
    this.nodeIds.add(nodeIdsItem);
    return this;
  }

   /**
   * Get nodeIds
   * @return nodeIds
  **/
  @Schema(description = "")
  public List<String> getNodeIds() {
    return nodeIds;
  }

  public void setNodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
  }

  public ListNodesRequest nodeNames(List<String> nodeNames) {
    this.nodeNames = nodeNames;
    return this;
  }

  public ListNodesRequest addNodeNamesItem(String nodeNamesItem) {
    if (this.nodeNames == null) {
      this.nodeNames = new ArrayList<String>();
    }
    this.nodeNames.add(nodeNamesItem);
    return this;
  }

   /**
   * Get nodeNames
   * @return nodeNames
  **/
  @Schema(description = "")
  public List<String> getNodeNames() {
    return nodeNames;
  }

  public void setNodeNames(List<String> nodeNames) {
    this.nodeNames = nodeNames;
  }

  public ListNodesRequest nodeStates(List<NodeStatesEnum> nodeStates) {
    this.nodeStates = nodeStates;
    return this;
  }

  public ListNodesRequest addNodeStatesItem(NodeStatesEnum nodeStatesItem) {
    if (this.nodeStates == null) {
      this.nodeStates = new ArrayList<NodeStatesEnum>();
    }
    this.nodeStates.add(nodeStatesItem);
    return this;
  }

   /**
   * Get nodeStates
   * @return nodeStates
  **/
  @Schema(description = "")
  public List<NodeStatesEnum> getNodeStates() {
    return nodeStates;
  }

  public void setNodeStates(List<NodeStatesEnum> nodeStates) {
    this.nodeStates = nodeStates;
  }

  public ListNodesRequest privateIps(List<String> privateIps) {
    this.privateIps = privateIps;
    return this;
  }

  public ListNodesRequest addPrivateIpsItem(String privateIpsItem) {
    if (this.privateIps == null) {
      this.privateIps = new ArrayList<String>();
    }
    this.privateIps.add(privateIpsItem);
    return this;
  }

   /**
   * Get privateIps
   * @return privateIps
  **/
  @Schema(description = "")
  public List<String> getPrivateIps() {
    return privateIps;
  }

  public void setPrivateIps(List<String> privateIps) {
    this.privateIps = privateIps;
  }

  public ListNodesRequest publicIps(List<String> publicIps) {
    this.publicIps = publicIps;
    return this;
  }

  public ListNodesRequest addPublicIpsItem(String publicIpsItem) {
    if (this.publicIps == null) {
      this.publicIps = new ArrayList<String>();
    }
    this.publicIps.add(publicIpsItem);
    return this;
  }

   /**
   * Get publicIps
   * @return publicIps
  **/
  @Schema(description = "")
  public List<String> getPublicIps() {
    return publicIps;
  }

  public void setPublicIps(List<String> publicIps) {
    this.publicIps = publicIps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNodesRequest listNodesRequest = (ListNodesRequest) o;
    return Objects.equals(this.clusterId, listNodesRequest.clusterId) &&
        Objects.equals(this.fqdns, listNodesRequest.fqdns) &&
        Objects.equals(this.maxResults, listNodesRequest.maxResults) &&
        Objects.equals(this.nextToken, listNodesRequest.nextToken) &&
        Objects.equals(this.nodeGroupIds, listNodesRequest.nodeGroupIds) &&
        Objects.equals(this.nodeIds, listNodesRequest.nodeIds) &&
        Objects.equals(this.nodeNames, listNodesRequest.nodeNames) &&
        Objects.equals(this.nodeStates, listNodesRequest.nodeStates) &&
        Objects.equals(this.privateIps, listNodesRequest.privateIps) &&
        Objects.equals(this.publicIps, listNodesRequest.publicIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, fqdns, maxResults, nextToken, nodeGroupIds, nodeIds, nodeNames, nodeStates, privateIps, publicIps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNodesRequest {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    fqdns: ").append(toIndentedString(fqdns)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    nodeGroupIds: ").append(toIndentedString(nodeGroupIds)).append("\n");
    sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
    sb.append("    nodeNames: ").append(toIndentedString(nodeNames)).append("\n");
    sb.append("    nodeStates: ").append(toIndentedString(nodeStates)).append("\n");
    sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
    sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
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
