/*
 * rocketmq
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rocketmq.model;

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
 * AccessPolicyForModifyAccessKeyAuthorityInput
 */



public class AccessPolicyForModifyAccessKeyAuthorityInput {
  @SerializedName("Authority")
  private String authority = null;

  @SerializedName("TopicName")
  private String topicName = null;

  public AccessPolicyForModifyAccessKeyAuthorityInput authority(String authority) {
    this.authority = authority;
    return this;
  }

   /**
   * Get authority
   * @return authority
  **/
 @Size(min=3,max=4)  @Schema(description = "")
  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public AccessPolicyForModifyAccessKeyAuthorityInput topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @Schema(description = "")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPolicyForModifyAccessKeyAuthorityInput accessPolicyForModifyAccessKeyAuthorityInput = (AccessPolicyForModifyAccessKeyAuthorityInput) o;
    return Objects.equals(this.authority, accessPolicyForModifyAccessKeyAuthorityInput.authority) &&
        Objects.equals(this.topicName, accessPolicyForModifyAccessKeyAuthorityInput.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, topicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPolicyForModifyAccessKeyAuthorityInput {\n");
    
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
