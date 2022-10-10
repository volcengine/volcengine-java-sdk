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
 * ModifyNetworkAclAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T12:08:25.743848+08:00[Asia/Shanghai]")
public class ModifyNetworkAclAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("NetworkAclId")
  private String networkAclId = null;

  @SerializedName("NetworkAclName")
  private String networkAclName = null;

  public ModifyNetworkAclAttributesRequest description(String description) {
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

  public ModifyNetworkAclAttributesRequest networkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
    return this;
  }

   /**
   * Get networkAclId
   * @return networkAclId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNetworkAclId() {
    return networkAclId;
  }

  public void setNetworkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
  }

  public ModifyNetworkAclAttributesRequest networkAclName(String networkAclName) {
    this.networkAclName = networkAclName;
    return this;
  }

   /**
   * Get networkAclName
   * @return networkAclName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getNetworkAclName() {
    return networkAclName;
  }

  public void setNetworkAclName(String networkAclName) {
    this.networkAclName = networkAclName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyNetworkAclAttributesRequest modifyNetworkAclAttributesRequest = (ModifyNetworkAclAttributesRequest) o;
    return Objects.equals(this.description, modifyNetworkAclAttributesRequest.description) &&
        Objects.equals(this.networkAclId, modifyNetworkAclAttributesRequest.networkAclId) &&
        Objects.equals(this.networkAclName, modifyNetworkAclAttributesRequest.networkAclName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, networkAclId, networkAclName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyNetworkAclAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkAclId: ").append(toIndentedString(networkAclId)).append("\n");
    sb.append("    networkAclName: ").append(toIndentedString(networkAclName)).append("\n");
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
