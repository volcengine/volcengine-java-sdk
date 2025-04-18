/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpn.model;

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
 * CreateVpnConnectionHealthCheckersResponse
 */



public class CreateVpnConnectionHealthCheckersResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("CheckerIds")
  private List<String> checkerIds = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateVpnConnectionHealthCheckersResponse checkerIds(List<String> checkerIds) {
    this.checkerIds = checkerIds;
    return this;
  }

  public CreateVpnConnectionHealthCheckersResponse addCheckerIdsItem(String checkerIdsItem) {
    if (this.checkerIds == null) {
      this.checkerIds = new ArrayList<String>();
    }
    this.checkerIds.add(checkerIdsItem);
    return this;
  }

   /**
   * Get checkerIds
   * @return checkerIds
  **/
  @Schema(description = "")
  public List<String> getCheckerIds() {
    return checkerIds;
  }

  public void setCheckerIds(List<String> checkerIds) {
    this.checkerIds = checkerIds;
  }

  public CreateVpnConnectionHealthCheckersResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVpnConnectionHealthCheckersResponse createVpnConnectionHealthCheckersResponse = (CreateVpnConnectionHealthCheckersResponse) o;
    return Objects.equals(this.checkerIds, createVpnConnectionHealthCheckersResponse.checkerIds) &&
        Objects.equals(this.requestId, createVpnConnectionHealthCheckersResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkerIds, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVpnConnectionHealthCheckersResponse {\n");
    
    sb.append("    checkerIds: ").append(toIndentedString(checkerIds)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
