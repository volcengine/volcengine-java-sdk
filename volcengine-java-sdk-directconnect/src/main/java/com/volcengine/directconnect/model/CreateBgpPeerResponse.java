/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * CreateBgpPeerResponse
 */



public class CreateBgpPeerResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BgpPeerId")
  private String bgpPeerId = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateBgpPeerResponse bgpPeerId(String bgpPeerId) {
    this.bgpPeerId = bgpPeerId;
    return this;
  }

   /**
   * Get bgpPeerId
   * @return bgpPeerId
  **/
  @Schema(description = "")
  public String getBgpPeerId() {
    return bgpPeerId;
  }

  public void setBgpPeerId(String bgpPeerId) {
    this.bgpPeerId = bgpPeerId;
  }

  public CreateBgpPeerResponse requestId(String requestId) {
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
    CreateBgpPeerResponse createBgpPeerResponse = (CreateBgpPeerResponse) o;
    return Objects.equals(this.bgpPeerId, createBgpPeerResponse.bgpPeerId) &&
        Objects.equals(this.requestId, createBgpPeerResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpPeerId, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBgpPeerResponse {\n");
    
    sb.append("    bgpPeerId: ").append(toIndentedString(bgpPeerId)).append("\n");
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
