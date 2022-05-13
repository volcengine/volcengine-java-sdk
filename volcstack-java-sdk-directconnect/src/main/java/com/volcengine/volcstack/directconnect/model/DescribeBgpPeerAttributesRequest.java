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

package com.volcengine.volcstack.directconnect.model;

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
 * DescribeBgpPeerAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:28.121303+08:00[Asia/Shanghai]")
public class DescribeBgpPeerAttributesRequest {
  @SerializedName("BgpPeerId")
  private String bgpPeerId = null;

  public DescribeBgpPeerAttributesRequest bgpPeerId(String bgpPeerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeBgpPeerAttributesRequest describeBgpPeerAttributesRequest = (DescribeBgpPeerAttributesRequest) o;
    return Objects.equals(this.bgpPeerId, describeBgpPeerAttributesRequest.bgpPeerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpPeerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeBgpPeerAttributesRequest {\n");
    
    sb.append("    bgpPeerId: ").append(toIndentedString(bgpPeerId)).append("\n");
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
