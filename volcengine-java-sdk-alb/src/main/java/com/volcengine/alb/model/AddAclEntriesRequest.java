/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.alb.model.AclEntryForAddAclEntriesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AddAclEntriesRequest
 */



public class AddAclEntriesRequest {
  @SerializedName("AclEntries")
  private List<AclEntryForAddAclEntriesInput> aclEntries = null;

  @SerializedName("AclId")
  private String aclId = null;

  public AddAclEntriesRequest aclEntries(List<AclEntryForAddAclEntriesInput> aclEntries) {
    this.aclEntries = aclEntries;
    return this;
  }

  public AddAclEntriesRequest addAclEntriesItem(AclEntryForAddAclEntriesInput aclEntriesItem) {
    if (this.aclEntries == null) {
      this.aclEntries = new ArrayList<AclEntryForAddAclEntriesInput>();
    }
    this.aclEntries.add(aclEntriesItem);
    return this;
  }

   /**
   * Get aclEntries
   * @return aclEntries
  **/
  @Valid
  @Schema(description = "")
  public List<AclEntryForAddAclEntriesInput> getAclEntries() {
    return aclEntries;
  }

  public void setAclEntries(List<AclEntryForAddAclEntriesInput> aclEntries) {
    this.aclEntries = aclEntries;
  }

  public AddAclEntriesRequest aclId(String aclId) {
    this.aclId = aclId;
    return this;
  }

   /**
   * Get aclId
   * @return aclId
  **/
  @Schema(description = "")
  public String getAclId() {
    return aclId;
  }

  public void setAclId(String aclId) {
    this.aclId = aclId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAclEntriesRequest addAclEntriesRequest = (AddAclEntriesRequest) o;
    return Objects.equals(this.aclEntries, addAclEntriesRequest.aclEntries) &&
        Objects.equals(this.aclId, addAclEntriesRequest.aclId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclEntries, aclId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAclEntriesRequest {\n");
    
    sb.append("    aclEntries: ").append(toIndentedString(aclEntries)).append("\n");
    sb.append("    aclId: ").append(toIndentedString(aclId)).append("\n");
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
