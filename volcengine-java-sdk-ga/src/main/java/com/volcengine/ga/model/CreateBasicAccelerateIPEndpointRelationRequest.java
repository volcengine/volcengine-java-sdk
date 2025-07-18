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
 * CreateBasicAccelerateIPEndpointRelationRequest
 */



public class CreateBasicAccelerateIPEndpointRelationRequest {
  @SerializedName("AccelerateIPId")
  private String accelerateIPId = null;

  @SerializedName("AcceleratorId")
  private String acceleratorId = null;

  @SerializedName("EndpointIds")
  private List<String> endpointIds = null;

  @SerializedName("IPSetId")
  private String ipSetId = null;

  public CreateBasicAccelerateIPEndpointRelationRequest accelerateIPId(String accelerateIPId) {
    this.accelerateIPId = accelerateIPId;
    return this;
  }

   /**
   * Get accelerateIPId
   * @return accelerateIPId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAccelerateIPId() {
    return accelerateIPId;
  }

  public void setAccelerateIPId(String accelerateIPId) {
    this.accelerateIPId = accelerateIPId;
  }

  public CreateBasicAccelerateIPEndpointRelationRequest acceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
    return this;
  }

   /**
   * Get acceleratorId
   * @return acceleratorId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAcceleratorId() {
    return acceleratorId;
  }

  public void setAcceleratorId(String acceleratorId) {
    this.acceleratorId = acceleratorId;
  }

  public CreateBasicAccelerateIPEndpointRelationRequest endpointIds(List<String> endpointIds) {
    this.endpointIds = endpointIds;
    return this;
  }

  public CreateBasicAccelerateIPEndpointRelationRequest addEndpointIdsItem(String endpointIdsItem) {
    if (this.endpointIds == null) {
      this.endpointIds = new ArrayList<String>();
    }
    this.endpointIds.add(endpointIdsItem);
    return this;
  }

   /**
   * Get endpointIds
   * @return endpointIds
  **/
  @Schema(description = "")
  public List<String> getEndpointIds() {
    return endpointIds;
  }

  public void setEndpointIds(List<String> endpointIds) {
    this.endpointIds = endpointIds;
  }

  public CreateBasicAccelerateIPEndpointRelationRequest ipSetId(String ipSetId) {
    this.ipSetId = ipSetId;
    return this;
  }

   /**
   * Get ipSetId
   * @return ipSetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpSetId() {
    return ipSetId;
  }

  public void setIpSetId(String ipSetId) {
    this.ipSetId = ipSetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBasicAccelerateIPEndpointRelationRequest createBasicAccelerateIPEndpointRelationRequest = (CreateBasicAccelerateIPEndpointRelationRequest) o;
    return Objects.equals(this.accelerateIPId, createBasicAccelerateIPEndpointRelationRequest.accelerateIPId) &&
        Objects.equals(this.acceleratorId, createBasicAccelerateIPEndpointRelationRequest.acceleratorId) &&
        Objects.equals(this.endpointIds, createBasicAccelerateIPEndpointRelationRequest.endpointIds) &&
        Objects.equals(this.ipSetId, createBasicAccelerateIPEndpointRelationRequest.ipSetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accelerateIPId, acceleratorId, endpointIds, ipSetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBasicAccelerateIPEndpointRelationRequest {\n");
    
    sb.append("    accelerateIPId: ").append(toIndentedString(accelerateIPId)).append("\n");
    sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
    sb.append("    endpointIds: ").append(toIndentedString(endpointIds)).append("\n");
    sb.append("    ipSetId: ").append(toIndentedString(ipSetId)).append("\n");
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
