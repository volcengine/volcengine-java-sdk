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
 * ModifyBgpPeerAttributesRequest
 */


public class ModifyBgpPeerAttributesRequest {
  @SerializedName("BgpPeerId")
  private String bgpPeerId = null;

  @SerializedName("BgpPeerName")
  private String bgpPeerName = null;

  @SerializedName("Description")
  private String description = null;

  public ModifyBgpPeerAttributesRequest bgpPeerId(String bgpPeerId) {
    this.bgpPeerId = bgpPeerId;
    return this;
  }

   /**
   * Get bgpPeerId
   * @return bgpPeerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getBgpPeerId() {
    return bgpPeerId;
  }

  public void setBgpPeerId(String bgpPeerId) {
    this.bgpPeerId = bgpPeerId;
  }

  public ModifyBgpPeerAttributesRequest bgpPeerName(String bgpPeerName) {
    this.bgpPeerName = bgpPeerName;
    return this;
  }

   /**
   * Get bgpPeerName
   * @return bgpPeerName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getBgpPeerName() {
    return bgpPeerName;
  }

  public void setBgpPeerName(String bgpPeerName) {
    this.bgpPeerName = bgpPeerName;
  }

  public ModifyBgpPeerAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyBgpPeerAttributesRequest modifyBgpPeerAttributesRequest = (ModifyBgpPeerAttributesRequest) o;
    return Objects.equals(this.bgpPeerId, modifyBgpPeerAttributesRequest.bgpPeerId) &&
        Objects.equals(this.bgpPeerName, modifyBgpPeerAttributesRequest.bgpPeerName) &&
        Objects.equals(this.description, modifyBgpPeerAttributesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpPeerId, bgpPeerName, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyBgpPeerAttributesRequest {\n");
    
    sb.append("    bgpPeerId: ").append(toIndentedString(bgpPeerId)).append("\n");
    sb.append("    bgpPeerName: ").append(toIndentedString(bgpPeerName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
