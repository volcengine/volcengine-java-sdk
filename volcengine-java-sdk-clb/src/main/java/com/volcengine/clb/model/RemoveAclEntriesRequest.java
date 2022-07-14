/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * RemoveAclEntriesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:55.791591+08:00[Asia/Shanghai]")
public class RemoveAclEntriesRequest {
  @SerializedName("AclId")
  private String aclId = null;

  @SerializedName("Entries")
  private List<String> entries = null;

  public RemoveAclEntriesRequest aclId(String aclId) {
    this.aclId = aclId;
    return this;
  }

   /**
   * Get aclId
   * @return aclId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getAclId() {
    return aclId;
  }

  public void setAclId(String aclId) {
    this.aclId = aclId;
  }

  public RemoveAclEntriesRequest entries(List<String> entries) {
    this.entries = entries;
    return this;
  }

  public RemoveAclEntriesRequest addEntriesItem(String entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<String>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @Schema(description = "")
  public List<String> getEntries() {
    return entries;
  }

  public void setEntries(List<String> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveAclEntriesRequest removeAclEntriesRequest = (RemoveAclEntriesRequest) o;
    return Objects.equals(this.aclId, removeAclEntriesRequest.aclId) &&
        Objects.equals(this.entries, removeAclEntriesRequest.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclId, entries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveAclEntriesRequest {\n");
    
    sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
