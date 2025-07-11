/*
 * ga
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ga.model;

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
 * CreateBasicIPSetRequest
 */



public class CreateBasicIPSetRequest {
  @SerializedName("AccelerateRegion")
  private String accelerateRegion = null;

  @SerializedName("AcceleratorId")
  private String acceleratorId = null;

  @SerializedName("IPVersion")
  private String ipVersion = null;

  @SerializedName("accelerateNode")
  private List<String> accelerateNode = null;

  public CreateBasicIPSetRequest accelerateRegion(String accelerateRegion) {
    this.accelerateRegion = accelerateRegion;
    return this;
  }

   /**
   * Get accelerateRegion
   * @return accelerateRegion
  **/
  @Schema(description = "")
  public String getAccelerateRegion() {
    return accelerateRegion;
  }

  public void setAccelerateRegion(String accelerateRegion) {
    this.accelerateRegion = accelerateRegion;
  }

  public CreateBasicIPSetRequest acceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
    return this;
  }

   /**
   * Get acceleratorId
   * @return acceleratorId
  **/
  @Schema(description = "")
  public String getAcceleratorId() {
    return acceleratorId;
  }

  public void setAcceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
  }

  public CreateBasicIPSetRequest ipVersion(String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * Get ipVersion
   * @return ipVersion
  **/
  @Schema(description = "")
  public String getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(String ipVersion) {
    this.ipVersion = ipVersion;
  }

  public CreateBasicIPSetRequest accelerateNode(List<String> accelerateNode) {
    this.accelerateNode = accelerateNode;
    return this;
  }

  public CreateBasicIPSetRequest addAccelerateNodeItem(String accelerateNodeItem) {
    if (this.accelerateNode == null) {
      this.accelerateNode = new ArrayList<String>();
    }
    this.accelerateNode.add(accelerateNodeItem);
    return this;
  }

   /**
   * Get accelerateNode
   * @return accelerateNode
  **/
  @Schema(description = "")
  public List<String> getAccelerateNode() {
    return accelerateNode;
  }

  public void setAccelerateNode(List<String> accelerateNode) {
    this.accelerateNode = accelerateNode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBasicIPSetRequest createBasicIPSetRequest = (CreateBasicIPSetRequest) o;
    return Objects.equals(this.accelerateRegion, createBasicIPSetRequest.accelerateRegion) &&
        Objects.equals(this.acceleratorId, createBasicIPSetRequest.acceleratorId) &&
        Objects.equals(this.ipVersion, createBasicIPSetRequest.ipVersion) &&
        Objects.equals(this.accelerateNode, createBasicIPSetRequest.accelerateNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accelerateRegion, acceleratorId, ipVersion, accelerateNode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBasicIPSetRequest {\n");
    
    sb.append("    accelerateRegion: ").append(toIndentedString(accelerateRegion)).append("\n");
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
    sb.append("    accelerateNode: ").append(toIndentedString(accelerateNode)).append("\n");
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
