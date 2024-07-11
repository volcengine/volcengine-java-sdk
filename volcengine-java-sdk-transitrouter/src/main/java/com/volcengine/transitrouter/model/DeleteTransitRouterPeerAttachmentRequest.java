/*
 * transitrouter
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.transitrouter.model;

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
 * DeleteTransitRouterPeerAttachmentRequest
 */



public class DeleteTransitRouterPeerAttachmentRequest {
  @SerializedName("Force")
  private Boolean force = null;

  @SerializedName("TransitRouterAttachmentId")
  private String transitRouterAttachmentId = null;

  public DeleteTransitRouterPeerAttachmentRequest force(Boolean force) {
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @Schema(description = "")
  public Boolean isForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  public DeleteTransitRouterPeerAttachmentRequest transitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
    return this;
  }

   /**
   * Get transitRouterAttachmentId
   * @return transitRouterAttachmentId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getTransitRouterAttachmentId() {
    return transitRouterAttachmentId;
  }

  public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteTransitRouterPeerAttachmentRequest deleteTransitRouterPeerAttachmentRequest = (DeleteTransitRouterPeerAttachmentRequest) o;
    return Objects.equals(this.force, deleteTransitRouterPeerAttachmentRequest.force) &&
        Objects.equals(this.transitRouterAttachmentId, deleteTransitRouterPeerAttachmentRequest.transitRouterAttachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, transitRouterAttachmentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTransitRouterPeerAttachmentRequest {\n");
    
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    transitRouterAttachmentId: ").append(toIndentedString(transitRouterAttachmentId)).append("\n");
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
