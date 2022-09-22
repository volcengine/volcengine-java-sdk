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
import com.volcengine.vpc.model.NetworkAclAttributeForDescribeNetworkAclAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNetworkAclAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:39.157783+08:00[Asia/Shanghai]")
public class DescribeNetworkAclAttributesResponse {
  @SerializedName("NetworkAclAttribute")
  private NetworkAclAttributeForDescribeNetworkAclAttributesOutput networkAclAttribute = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public DescribeNetworkAclAttributesResponse networkAclAttribute(NetworkAclAttributeForDescribeNetworkAclAttributesOutput networkAclAttribute) {
    this.networkAclAttribute = networkAclAttribute;
    return this;
  }

   /**
   * Get networkAclAttribute
   * @return networkAclAttribute
  **/
  @Valid
  @Schema(description = "")
  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput getNetworkAclAttribute() {
    return networkAclAttribute;
  }

  public void setNetworkAclAttribute(NetworkAclAttributeForDescribeNetworkAclAttributesOutput networkAclAttribute) {
    this.networkAclAttribute = networkAclAttribute;
  }

  public DescribeNetworkAclAttributesResponse requestId(String requestId) {
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
    DescribeNetworkAclAttributesResponse describeNetworkAclAttributesResponse = (DescribeNetworkAclAttributesResponse) o;
    return Objects.equals(this.networkAclAttribute, describeNetworkAclAttributesResponse.networkAclAttribute) &&
        Objects.equals(this.requestId, describeNetworkAclAttributesResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkAclAttribute, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNetworkAclAttributesResponse {\n");
    
    sb.append("    networkAclAttribute: ").append(toIndentedString(networkAclAttribute)).append("\n");
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
