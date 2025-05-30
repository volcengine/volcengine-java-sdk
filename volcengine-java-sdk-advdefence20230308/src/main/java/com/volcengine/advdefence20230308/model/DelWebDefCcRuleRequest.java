/*
 * advdefence20230308
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.advdefence20230308.model;

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
 * DelWebDefCcRuleRequest
 */



public class DelWebDefCcRuleRequest {
  @SerializedName("DdosId")
  private Integer ddosId = null;

  @SerializedName("Host")
  private String host = null;

  public DelWebDefCcRuleRequest ddosId(Integer ddosId) {
    this.ddosId = ddosId;
    return this;
  }

   /**
   * Get ddosId
   * @return ddosId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public Integer getDdosId() {
    return ddosId;
  }

  public void setDdosId(Integer ddosId) {
    this.ddosId = ddosId;
  }

  public DelWebDefCcRuleRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelWebDefCcRuleRequest delWebDefCcRuleRequest = (DelWebDefCcRuleRequest) o;
    return Objects.equals(this.ddosId, delWebDefCcRuleRequest.ddosId) &&
        Objects.equals(this.host, delWebDefCcRuleRequest.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddosId, host);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelWebDefCcRuleRequest {\n");
    
    sb.append("    ddosId: ").append(toIndentedString(ddosId)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
