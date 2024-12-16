/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * DeleteIpv6EgressOnlyRuleRequest
 */



public class DeleteIpv6EgressOnlyRuleRequest {
  @SerializedName("Ipv6EgressOnlyRuleId")
  private String ipv6EgressOnlyRuleId = null;

  public DeleteIpv6EgressOnlyRuleRequest ipv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
    this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
    return this;
  }

   /**
   * Get ipv6EgressOnlyRuleId
   * @return ipv6EgressOnlyRuleId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getIpv6EgressOnlyRuleId() {
    return ipv6EgressOnlyRuleId;
  }

  public void setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
    this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteIpv6EgressOnlyRuleRequest deleteIpv6EgressOnlyRuleRequest = (DeleteIpv6EgressOnlyRuleRequest) o;
    return Objects.equals(this.ipv6EgressOnlyRuleId, deleteIpv6EgressOnlyRuleRequest.ipv6EgressOnlyRuleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv6EgressOnlyRuleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteIpv6EgressOnlyRuleRequest {\n");
    
    sb.append("    ipv6EgressOnlyRuleId: ").append(toIndentedString(ipv6EgressOnlyRuleId)).append("\n");
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