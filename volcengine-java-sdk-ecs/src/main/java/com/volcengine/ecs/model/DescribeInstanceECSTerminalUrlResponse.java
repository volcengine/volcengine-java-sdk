/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

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
 * DescribeInstanceECSTerminalUrlResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:32.100831+08:00[Asia/Shanghai]")
public class DescribeInstanceECSTerminalUrlResponse {
  @SerializedName("EcsTerminalUrl")
  private String ecsTerminalUrl = null;

  public DescribeInstanceECSTerminalUrlResponse ecsTerminalUrl(String ecsTerminalUrl) {
    this.ecsTerminalUrl = ecsTerminalUrl;
    return this;
  }

   /**
   * Get ecsTerminalUrl
   * @return ecsTerminalUrl
  **/
  @Schema(description = "")
  public String getEcsTerminalUrl() {
    return ecsTerminalUrl;
  }

  public void setEcsTerminalUrl(String ecsTerminalUrl) {
    this.ecsTerminalUrl = ecsTerminalUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeInstanceECSTerminalUrlResponse describeInstanceECSTerminalUrlResponse = (DescribeInstanceECSTerminalUrlResponse) o;
    return Objects.equals(this.ecsTerminalUrl, describeInstanceECSTerminalUrlResponse.ecsTerminalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecsTerminalUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInstanceECSTerminalUrlResponse {\n");
    
    sb.append("    ecsTerminalUrl: ").append(toIndentedString(ecsTerminalUrl)).append("\n");
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
