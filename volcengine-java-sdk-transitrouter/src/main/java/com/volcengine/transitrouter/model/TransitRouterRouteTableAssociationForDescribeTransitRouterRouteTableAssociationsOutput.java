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
 * TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput
 */



public class TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput {
  @SerializedName("Status")
  private String status = null;

  @SerializedName("TransitRouterAttachmentId")
  private String transitRouterAttachmentId = null;

  @SerializedName("TransitRouterRouteTableId")
  private String transitRouterRouteTableId = null;

  public TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput transitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
    return this;
  }

   /**
   * Get transitRouterAttachmentId
   * @return transitRouterAttachmentId
  **/
  @Schema(description = "")
  public String getTransitRouterAttachmentId() {
    return transitRouterAttachmentId;
  }

  public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
    this.transitRouterAttachmentId = transitRouterAttachmentId;
  }

  public TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput transitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
    return this;
  }

   /**
   * Get transitRouterRouteTableId
   * @return transitRouterRouteTableId
  **/
  @Schema(description = "")
  public String getTransitRouterRouteTableId() {
    return transitRouterRouteTableId;
  }

  public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
    this.transitRouterRouteTableId = transitRouterRouteTableId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput transitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput = (TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput) o;
    return Objects.equals(this.status, transitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput.status) &&
        Objects.equals(this.transitRouterAttachmentId, transitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput.transitRouterAttachmentId) &&
        Objects.equals(this.transitRouterRouteTableId, transitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput.transitRouterRouteTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, transitRouterAttachmentId, transitRouterRouteTableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitRouterRouteTableAssociationForDescribeTransitRouterRouteTableAssociationsOutput {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transitRouterAttachmentId: ").append(toIndentedString(transitRouterAttachmentId)).append("\n");
    sb.append("    transitRouterRouteTableId: ").append(toIndentedString(transitRouterRouteTableId)).append("\n");
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
